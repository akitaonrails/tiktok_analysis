package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.FixReplaceContentViewSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15Pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20516015Pq extends View {
    public C20516115Pr LL;

    public C20516015Pq(Context context) {
        this(context, null, 6);
    }

    public C20516015Pq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r6) {
        /*
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L7
            return
        L7:
            r2 = 0
            if (r6 == 0) goto L1a
            android.view.ViewParent r1 = r6.getParent()
        Le:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L15:
            X.15Pr r4 = r5.LL
            if (r4 != 0) goto L1c
            return
        L1a:
            r1 = r2
            goto Le
        L1c:
            int r3 = r4.LJFF
            android.view.ViewGroup r0 = r4.LJ
            if (r2 != r0) goto L5d
            int r3 = r2.indexOfChild(r6)
        L26:
            X.C786410Ut5.LJJJLZIJ(r6, r2)
        L29:
            int r0 = r4.LIZJ
            r5.setId(r0)
            if (r6 == 0) goto L34
            r0 = -1
            r6.setId(r0)
        L34:
            int r1 = r4.LIZLLL
            int r0 = r5.getVisibility()
            r5.setVisibility(r1)
            X.C1602160rnK.LIZIZ(r0, r1, r5)
            android.view.ViewGroup r0 = r4.LJ
            int r0 = r0.getChildCount()
            if (r3 < 0) goto L4a
            if (r3 <= r0) goto L4b
        L4a:
            r3 = r0
        L4b:
            android.view.ViewGroup r2 = r4.LJ
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            int r0 = r4.LIZIZ
            r1.width = r0
            int r0 = r4.LIZ
            r1.height = r0
            r2.addView(r5, r3, r1)
            return
        L5d:
            if (r2 == 0) goto L29
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20516015Pq.LIZ(android.view.View):void");
    }

    public final void LIZIZ(View view) {
        ViewGroup viewGroup;
        int i;
        int i2;
        int id;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        ViewGroup viewGroup2;
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            if (view == null) {
                C786410Ut5.LJJLJLI(this, viewGroup);
                return;
            }
            int iIndexOfChild = viewGroup.indexOfChild(this);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                i = layoutParams2.height;
            } else {
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            if (layoutParams3 != null) {
                i2 = layoutParams3.width;
            } else {
                i2 = 0;
            }
            this.LL = new C20516115Pr(i, i2, getId(), getVisibility(), viewGroup, iIndexOfChild);
            if (view.getVisibility() == 0 && getVisibility() == 0) {
                C786410Ut5.LJLLLLLL(0, view);
            } else {
                C786410Ut5.LJLLLLLL(8, view);
            }
            if (!(viewGroup instanceof RelativeLayout) && !(viewGroup instanceof FrameLayout) && !(viewGroup instanceof ConstraintLayout)) {
                id = View.generateViewId();
            } else {
                id = getId();
            }
            view.setId(id);
            setId(-1);
            C786410Ut5.LJJLJLI(this, viewGroup);
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
            }
            if (getLayoutParams() != null) {
                if (iIndexOfChild < 0 || iIndexOfChild > viewGroup.getChildCount()) {
                    iIndexOfChild = viewGroup.getChildCount();
                }
                if (view.getLayoutParams() == null) {
                    layoutParams = getLayoutParams();
                } else {
                    layoutParams = getLayoutParams();
                    int i4 = view.getLayoutParams().width;
                    int i5 = view.getLayoutParams().height;
                    int i6 = -2;
                    if (i4 != -1 && i4 != -2 && (!FixReplaceContentViewSetting.INSTANCE.enable() || i4 > 0)) {
                        i3 = view.getLayoutParams().width;
                    } else {
                        int i7 = layoutParams.width;
                        if ((i7 != -1 && i7 != -2) || i7 == view.getLayoutParams().width) {
                            i3 = layoutParams.width;
                        } else {
                            i3 = -2;
                        }
                    }
                    layoutParams.width = i3;
                    if (i5 != -1 && i5 != -2 && (!FixReplaceContentViewSetting.INSTANCE.enable() || i4 > 0)) {
                        i6 = view.getLayoutParams().height;
                    } else {
                        int i8 = layoutParams.height;
                        if ((i8 != -1 && i8 != -2) || i8 == view.getLayoutParams().height) {
                            i6 = layoutParams.height;
                        }
                    }
                    layoutParams.height = i6;
                }
                viewGroup.addView(view, iIndexOfChild, layoutParams);
                return;
            }
            if (iIndexOfChild < 0 || iIndexOfChild > viewGroup.getChildCount()) {
                iIndexOfChild = viewGroup.getChildCount();
            }
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public C20516015Pq(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setWillNotDraw(true);
    }
}
