package androidx.drawerlayout.widget;

import X.AbstractC21586119dr;
import X.C21586019dq;
import X.C21586319dt;
import X.C2179971ATj;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class DrawerLayout$ViewDragCallback extends AbstractC21586119dr {
    public final int mAbsGravity;
    public C21586019dq mDragger;
    public final Runnable mPeekRunnable = new Runnable() { // from class: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback.1
        @Override // java.lang.Runnable
        public void run() {
            androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1__run$___twin___() {
            DrawerLayout$ViewDragCallback.this.peekDrawer();
        }

        public static void androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            try {
                anonymousClass1.androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };
    public final /* synthetic */ C21586319dt this$0;

    @Override // X.AbstractC21586119dr
    public boolean onEdgeLock(int i) {
        return false;
    }

    private void closeOtherDrawer() {
        View viewFindDrawerWithGravity = this.this$0.findDrawerWithGravity(this.mAbsGravity == 3 ? 5 : 3);
        if (viewFindDrawerWithGravity != null) {
            this.this$0.closeDrawer(viewFindDrawerWithGravity);
        }
    }

    public void peekDrawer() {
        boolean z;
        View viewFindDrawerWithGravity;
        int width;
        int i = this.mDragger.LJIILJJIL;
        if (this.mAbsGravity == 3) {
            z = true;
            viewFindDrawerWithGravity = this.this$0.findDrawerWithGravity(3);
            if (viewFindDrawerWithGravity == null) {
                return;
            } else {
                width = (-viewFindDrawerWithGravity.getWidth()) + i;
            }
        } else {
            z = false;
            viewFindDrawerWithGravity = this.this$0.findDrawerWithGravity(5);
            width = this.this$0.getWidth() - i;
        }
        if (viewFindDrawerWithGravity != null) {
            if (z) {
                if (viewFindDrawerWithGravity.getLeft() >= width) {
                    return;
                }
            } else if (viewFindDrawerWithGravity.getLeft() <= width) {
                return;
            }
            if (this.this$0.getDrawerLockMode(viewFindDrawerWithGravity) == 0) {
                DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) viewFindDrawerWithGravity.getLayoutParams();
                this.mDragger.LJIJJLI(width, viewFindDrawerWithGravity.getTop(), viewFindDrawerWithGravity);
                drawerLayout$LayoutParams.isPeeking = true;
                this.this$0.invalidate();
                closeOtherDrawer();
                this.this$0.cancelChildViewTouch();
            }
        }
    }

    public void removeCallbacks() {
        this.this$0.removeCallbacks(this.mPeekRunnable);
    }

    @Override // X.AbstractC21586119dr
    public int getViewHorizontalDragRange(View view) {
        if (this.this$0.isDrawerView(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // X.AbstractC21586119dr
    public void onViewDragStateChanged(int i) {
        this.this$0.updateDrawerState(this.mAbsGravity, i, this.mDragger.LJIJI);
    }

    public void setDragger(C21586019dq c21586019dq) {
        this.mDragger = c21586019dq;
    }

    public DrawerLayout$ViewDragCallback(C21586319dt c21586319dt, int i) {
        this.this$0 = c21586319dt;
        this.mAbsGravity = i;
    }

    @Override // X.AbstractC21586119dr
    public void onEdgeDragStarted(int i, int i2) {
        View viewFindDrawerWithGravity;
        if ((i & 1) == 1) {
            viewFindDrawerWithGravity = this.this$0.findDrawerWithGravity(3);
        } else {
            viewFindDrawerWithGravity = this.this$0.findDrawerWithGravity(5);
        }
        if (viewFindDrawerWithGravity != null && this.this$0.getDrawerLockMode(viewFindDrawerWithGravity) == 0) {
            this.mDragger.LIZJ(i2, viewFindDrawerWithGravity);
        }
    }

    @Override // X.AbstractC21586119dr
    public void onEdgeTouched(int i, int i2) {
        this.this$0.postDelayed(this.mPeekRunnable, 160L);
    }

    @Override // X.AbstractC21586119dr
    public void onViewCaptured(View view, int i) {
        ((DrawerLayout$LayoutParams) view.getLayoutParams()).isPeeking = false;
        closeOtherDrawer();
    }

    @Override // X.AbstractC21586119dr
    public boolean tryCaptureView(View view, int i) {
        if (this.this$0.isDrawerView(view) && this.this$0.checkDrawerViewAbsoluteGravity(view, this.mAbsGravity) && this.this$0.getDrawerLockMode(view) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC21586119dr
    public int clampViewPositionHorizontal(View view, int i, int i2) {
        if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.this$0.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // X.AbstractC21586119dr
    public int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // X.AbstractC21586119dr
    public void onViewReleased(View view, float f, float f2) {
        int width;
        float drawerViewOffset = this.this$0.getDrawerViewOffset(view);
        int width2 = view.getWidth();
        if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
            width = (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width2;
        } else {
            width = this.this$0.getWidth();
            if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                width -= width2;
            }
        }
        this.mDragger.LJIJI(width, view.getTop());
        this.this$0.invalidate();
    }

    @Override // X.AbstractC21586119dr
    public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        float width;
        int i5;
        int width2 = view.getWidth();
        if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
            width = i + width2;
        } else {
            width = this.this$0.getWidth() - i;
        }
        float f = width / width2;
        this.this$0.setDrawerViewOffset(view, f);
        if (f == 0.0f) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        C786410Ut5.LJLLLLLL(i5, view);
        this.this$0.invalidate();
    }
}
