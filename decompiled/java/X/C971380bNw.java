package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.NoticeBoardBoarderViewRotationEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.NoticeBoardBoarderViewScaleEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.ShowDottedViewEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0bNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971380bNw extends ConstraintLayout {
    public View LL;
    public C16FS LLILLJJLI;
    public final C16FS LLILLL;
    public final C16FS LLILZ;
    public final C16FS LLILZIL;
    public final TextView LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public InterfaceC971390bNx LLJ;
    public final GradientDrawable LLJI;
    public final GradientDrawable LLJIJIL;
    public EnumC971280bNm LLJILJIL;

    public final View getDetectiveView() {
        return this;
    }

    public final Pair<Integer, Integer> getDefaultTextWidthAndHeight() {
        if (this.LLIZ == 0 && this.LLIZLLLIL == 0) {
            this.LLILZLL.measure(0, 0);
            this.LLIZ = this.LLILZLL.getMeasuredWidth();
            this.LLIZLLLIL = this.LLILZLL.getMeasuredHeight();
        }
        return new Pair<>(Integer.valueOf(this.LLIZ), Integer.valueOf(this.LLIZLLLIL));
    }

    public final InterfaceC971390bNx getAction() {
        return this.LLJ;
    }

    public final View getBorderView() {
        return this.LL;
    }

    public final C16FS getDelBtn() {
        return this.LLILLJJLI;
    }

    public final EnumC971280bNm getState() {
        return this.LLJILJIL;
    }

    private final void setMyState(EnumC971280bNm enumC971280bNm) {
        switch (C971310bNp.LIZ[enumC971280bNm.ordinal()]) {
            case 1:
                C786410Ut5.n2(this, 4);
                return;
            case 2:
                C786410Ut5.LLJJJ(this.LLILLJJLI, 0);
                C786410Ut5.LLJJJ(this.LLILLL, 0);
                C786410Ut5.LLJJJ(this.LLILZ, 0);
                C786410Ut5.LLJJJ(this.LLILZIL, 0);
                this.LL.setBackground(this.LLJIJIL);
                C786410Ut5.LJLLLLLL(0, this.LL);
                C786410Ut5.LLIL(this.LLILZLL, 4);
                C786410Ut5.n2(this, 0);
                return;
            case 3:
                C786410Ut5.LLJJJ(this.LLILLJJLI, 4);
                C786410Ut5.LLJJJ(this.LLILLL, 4);
                C786410Ut5.LLJJJ(this.LLILZ, 4);
                C786410Ut5.LLJJJ(this.LLILZIL, 4);
                this.LL.setBackground(this.LLJI);
                C786410Ut5.LJLLLLLL(0, this.LL);
                C786410Ut5.LLIL(this.LLILZLL, 0);
                C786410Ut5.n2(this, 0);
                return;
            case 4:
                C786410Ut5.LLJJJ(this.LLILLJJLI, 4);
                C786410Ut5.LLJJJ(this.LLILLL, 4);
                C786410Ut5.LLJJJ(this.LLILZ, 4);
                C786410Ut5.LLJJJ(this.LLILZIL, 4);
                C786410Ut5.LLIL(this.LLILZLL, 4);
                this.LL.setBackground(this.LLJI);
                C786410Ut5.LJLLLLLL(0, this.LL);
                C786410Ut5.LLIL(this.LLILZLL, 4);
                C786410Ut5.n2(this, 0);
                return;
            case 5:
                C786410Ut5.LLJJJ(this.LLILLJJLI, 4);
                C786410Ut5.LLJJJ(this.LLILLL, 4);
                C786410Ut5.LLJJJ(this.LLILZ, 4);
                C786410Ut5.LLJJJ(this.LLILZIL, 4);
                C786410Ut5.LLIL(this.LLILZLL, 4);
                this.LL.setBackground(this.LLJIJIL);
                C786410Ut5.LJLLLLLL(0, this.LL);
                C786410Ut5.LLIL(this.LLILZLL, 4);
                C786410Ut5.n2(this, 0);
                return;
            case 6:
                C786410Ut5.LLJJJ(this.LLILLJJLI, 4);
                C786410Ut5.LLJJJ(this.LLILLL, 4);
                C786410Ut5.LLJJJ(this.LLILZ, 4);
                C786410Ut5.LLJJJ(this.LLILZIL, 4);
                this.LL.setBackground(this.LLJI);
                C786410Ut5.LJLLLLLL(4, this.LL);
                C786410Ut5.LLIL(this.LLILZLL, 0);
                C786410Ut5.n2(this, 0);
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void setAction(InterfaceC971390bNx interfaceC971390bNx) {
        this.LLJ = interfaceC971390bNx;
    }

    public final void setBorderView(View view) {
        this.LL = view;
    }

    public final void setDelBtn(C16FS c16fs) {
        this.LLILLJJLI = c16fs;
    }

    public final void setState(EnumC971280bNm enumC971280bNm) {
        if (this.LLJILJIL != enumC971280bNm) {
            this.LLJILJIL = enumC971280bNm;
            setMyState(enumC971280bNm);
        }
    }

    public C971380bNw(Context context, final DataChannel dataChannel) {
        super(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = 4;
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(f));
        float f2 = 1;
        gradientDrawable.setStroke((int) C497740JfY.LIZIZ(f2), -1, C497740JfY.LIZIZ(4.0f), C497740JfY.LIZIZ(3.0f));
        this.LLJI = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C497740JfY.LIZIZ(f));
        gradientDrawable2.setStroke((int) C497740JfY.LIZIZ(f2), -1);
        this.LLJIJIL = gradientDrawable2;
        this.LLJILJIL = EnumC971280bNm.SHOW_DEFAULT;
        C786410Ut5.Sd(R.layout.hfd, C972080bP4.LIZ(C786410Ut5.ne(context)), this);
        setTag("BorderView");
        View viewFindViewById = findViewById(R.id.c9c);
        viewFindViewById.setBackground(gradientDrawable2);
        this.LL = viewFindViewById;
        this.LLILZLL = (TextView) findViewById(R.id.fkc);
        C16FS c16fs = (C16FS) findViewById(R.id.fkg);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(-1);
        c16fs.setBackground(gradientDrawable3);
        C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 315));
        c16fs.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0bOD
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(C497740JfY.LJIJI(2131851119));
            }
        });
        this.LLILLJJLI = c16fs;
        C16FS c16fs2 = (C16FS) findViewById(R.id.goi);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(1);
        gradientDrawable4.setColor(-1);
        c16fs2.setBackground(gradientDrawable4);
        C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 316));
        c16fs2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0bOE
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(C497740JfY.LJIJI(2131851122));
            }
        });
        this.LLILLL = c16fs2;
        C16FS c16fs3 = (C16FS) findViewById(R.id.ey3);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setShape(1);
        gradientDrawable5.setColor(-1);
        c16fs3.setBackground(gradientDrawable5);
        C786410Ut5.h8(c16fs3, new ACListenerS150S0100000_15(this, 317));
        c16fs3.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0bOF
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(C497740JfY.LJIJI(2131851121));
            }
        });
        c16fs3.setText("+1");
        this.LLILZ = c16fs3;
        final C16FS c16fs4 = (C16FS) findViewById(R.id.tsi);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setShape(1);
        gradientDrawable6.setColor(-1);
        c16fs4.setBackground(gradientDrawable6);
        c16fs4.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0bOG
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(C497740JfY.LJIJI(2131851123));
            }
        });
        c16fs4.setOnTouchListener(new View.OnTouchListener() { // from class: X.0bO9
            public float LL;
            public float LLILLJJLI;
            public float LLILLL;
            public float LLILZ;
            public boolean LLILZIL;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2 && motionEvent.getPointerCount() == 1 && this.LLILZIL) {
                            float f3 = this.LLILLL;
                            float f4 = this.LLILZ;
                            double d = f3 - this.LL;
                            double d2 = f4 - this.LLILLJJLI;
                            double dSqrt = Math.sqrt((d * d) + (d2 * d2));
                            float f5 = this.LL;
                            float f6 = this.LLILLJJLI;
                            double rawX = f5 - motionEvent.getRawX();
                            double rawY = f6 - motionEvent.getRawY();
                            double dSqrt2 = Math.sqrt((rawX * rawX) + (rawY * rawY));
                            float f7 = this.LLILLL;
                            float f8 = this.LLILZ;
                            double rawX2 = f7 - motionEvent.getRawX();
                            double rawY2 = f8 - motionEvent.getRawY();
                            double dSqrt3 = Math.sqrt((rawX2 * rawX2) + (rawY2 * rawY2));
                            double degrees = Math.toDegrees(Math.acos((((dSqrt * dSqrt) + (dSqrt3 * dSqrt3)) - (dSqrt2 * dSqrt2)) / ((((double) 2) * dSqrt) * dSqrt3))) * ((double) 1.3f);
                            float f9 = this.LL - this.LLILLL;
                            float rawY3 = motionEvent.getRawY();
                            float f10 = this.LLILZ;
                            if ((f9 * (rawY3 - f10)) - ((this.LLILLJJLI - f10) * (motionEvent.getRawX() - this.LLILLL)) < 0.0f) {
                                degrees = -degrees;
                            }
                            DataChannel dataChannel2 = dataChannel;
                            if (dataChannel2 != null) {
                                dataChannel2.LC0(NoticeBoardBoarderViewRotationEvent.class, Float.valueOf((float) degrees));
                            }
                            float f11 = (float) (dSqrt3 / dSqrt);
                            DataChannel dataChannel3 = dataChannel;
                            if (dataChannel3 != null) {
                                dataChannel3.LC0(NoticeBoardBoarderViewScaleEvent.class, Float.valueOf(f11));
                            }
                            DataChannel dataChannel4 = dataChannel;
                            if (dataChannel4 != null) {
                                dataChannel4.LC0(ShowDottedViewEvent.class, Boolean.TRUE);
                            }
                            this.LL = motionEvent.getRawX();
                            this.LLILLJJLI = motionEvent.getRawY();
                        }
                    } else {
                        this.LLILZIL = false;
                        DataChannel dataChannel5 = dataChannel;
                        if (dataChannel5 != null) {
                            dataChannel5.LC0(ShowDottedViewEvent.class, Boolean.FALSE);
                            return true;
                        }
                    }
                } else if (!this.LLILZIL) {
                    this.LLILZIL = true;
                    this.LL = motionEvent.getRawX();
                    this.LLILLJJLI = motionEvent.getRawY();
                    this.LLILZLL.getLocationOnScreen(new int[2]);
                    this.LLILLL = (this.LLILZLL.getWidth() / 2.0f) + r3[0];
                    this.LLILZ = (this.LLILZLL.getHeight() / 2.0f) + r3[1];
                    c16fs4.getScaleX();
                    System.currentTimeMillis();
                    return true;
                }
                return true;
            }
        });
        this.LLILZIL = c16fs4;
        setState(EnumC971280bNm.INVISIBLE);
    }
}
