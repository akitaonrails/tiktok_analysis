package X;

import Y.ATListenerS466S0100000_34;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Cz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248181Cz2 extends View {
    public PopupWindow LL;
    public Paint LLILLJJLI;
    public Paint LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public InterfaceC2248191Cz3 LLIZ;
    public InterfaceC2248211Cz5 LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final int LLJJIJI;
    public final float LLJJIJIIJIL;
    public final float LLJJIJIL;

    public final void LIZ() {
        boolean z = !this.LLILZLL;
        this.LLILZLL = z;
        if (!this.LLILZ) {
            this.LLILZIL = z;
        }
        invalidate();
    }

    public final void LIZIZ() {
        PopupWindow popupWindow = this.LL;
        if (popupWindow != null) {
            try {
                popupWindow.dismiss();
                InterfaceC2248211Cz5 interfaceC2248211Cz5 = this.LLIZLLLIL;
                if (interfaceC2248211Cz5 != null) {
                    ((C2248201Cz4) interfaceC2248211Cz5).LIZ.LJIIIIZZ = -1;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C2248181Cz2(Context context) {
        super(context);
        int iLIZ = C431170GvT.LIZ(15.0f, getContext());
        this.LLJILJILJ = iLIZ;
        int iLIZ2 = C431170GvT.LIZ(5.0f, getContext());
        this.LLJILLL = iLIZ2;
        int iLIZ3 = C431170GvT.LIZ(2.0f, getContext());
        this.LLJJ = iLIZ3;
        int iLIZ4 = C431170GvT.LIZ(25.0f, getContext());
        this.LLJJI = iLIZ4;
        this.LLJJIII = (((iLIZ2 * 2) + iLIZ4) - C431170GvT.LIZ(1.0f, getContext())) + (iLIZ * 2);
        int i = (iLIZ2 * 2) + (iLIZ * 2);
        this.LLJJIJI = i;
        float f = (i - iLIZ3) / 2.0f;
        this.LLJJIJIIJIL = f;
        this.LLJJIJIL = f + iLIZ3;
        Paint paint = new Paint(1);
        this.LLILLJJLI = paint;
        paint.setColor(-16729392);
        Paint paint2 = new Paint(1);
        this.LLILLL = paint2;
        paint2.setColor(-16729392);
        PopupWindow popupWindow = new PopupWindow(this);
        this.LL = popupWindow;
        popupWindow.setClippingEnabled(false);
        this.LL.setWidth(i);
        this.LL.setHeight(this.LLJJIII);
        this.LL.setFocusable(false);
        this.LL.setOutsideTouchable(true);
        this.LL.setTouchInterceptor(new ATListenerS466S0100000_34(this, 1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJILJIL) {
            return;
        }
        if (this.LLILZIL) {
            int i = this.LLJILLL;
            int i2 = this.LLJILJILJ;
            canvas.drawCircle(i + i2, i2 + i, i, this.LLILLJJLI);
            float f = this.LLJJIJIIJIL;
            int i3 = this.LLJJIII - this.LLJJI;
            int i4 = this.LLJILJILJ;
            canvas.drawRect(f, i3 - i4, this.LLJJIJIL, r2 - i4, this.LLILLL);
            return;
        }
        canvas.drawRect(this.LLJJIJIIJIL, this.LLJILJILJ, this.LLJJIJIL, this.LLJJI + r1, this.LLILLL);
        int i5 = this.LLJILLL;
        int i6 = this.LLJILJILJ;
        canvas.drawCircle(i5 + i6, (this.LLJJIII - i5) - i6, i5, this.LLILLJJLI);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLIZ == null) {
            return true;
        }
        int rawX = ((int) motionEvent.getRawX()) + this.LLJI;
        int rawY = ((int) motionEvent.getRawY()) - this.LLJIJIL;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                } else {
                    this.LLIZ.LIZ(rawX, rawY, this.LLILZLL, true);
                    return true;
                }
            }
            this.LLILZ = false;
            boolean z = this.LLILZLL;
            this.LLILZIL = z;
            this.LLIZ.LIZ(rawX, rawY, z, false);
            return true;
        }
        this.LLILZ = true;
        if (this.LLILZIL) {
            this.LLJI = (getWidth() - ((int) motionEvent.getX())) - this.LLJILJILJ;
        } else {
            this.LLJI = this.LLJILJILJ - ((int) motionEvent.getX());
        }
        this.LLJIJIL = (((int) motionEvent.getY()) - this.LLJILJILJ) + (this.LLJ / 2);
        return true;
    }

    public void setChangeListener(InterfaceC2248211Cz5 interfaceC2248211Cz5) {
        this.LLIZLLLIL = interfaceC2248211Cz5;
    }

    public void setCursorColor(int i) {
        this.LLILLJJLI.setColor(i);
        this.LLILLL.setColor(i);
        invalidate();
    }

    public void setIsStartCursor(boolean z) {
        this.LLILZIL = z;
        this.LLILZLL = z;
    }

    public void setOutArea(boolean z) {
        this.LLJILJIL = z;
    }

    public void setTouchMoveListener(InterfaceC2248191Cz3 interfaceC2248191Cz3) {
        this.LLIZ = interfaceC2248191Cz3;
    }

    public final void LIZJ(View view, int i, int i2, int i3) {
        int iLIZ;
        this.LLJ = i3;
        int i4 = (i - (this.LLJJIJI / 2)) + (this.LLJJ / 2);
        int i5 = i2 - this.LLJILJILJ;
        if (this.LLJJI != i3) {
            this.LLJJI = i3;
            iLIZ = (((this.LLJILLL * 2) + i3) - C431170GvT.LIZ(1.0f, getContext())) + (this.LLJILJILJ * 2);
            this.LLJJIII = iLIZ;
        } else {
            iLIZ = -1;
        }
        if (this.LLILZIL) {
            i5 = (i2 - this.LLJJIII) + this.LLJ + this.LLJILJILJ;
        }
        try {
            if (this.LL.isShowing()) {
                invalidate();
                this.LL.update(i4, i5, -1, iLIZ);
            } else {
                if (iLIZ != -1) {
                    this.LL.setHeight(iLIZ);
                }
                C786410Ut5.k3(this.LL, view, 0, i4, i5);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
