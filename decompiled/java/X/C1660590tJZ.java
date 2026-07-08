package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: renamed from: X.0tJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660590tJZ {
    public final Keva LIZ;
    public int LIZIZ = -1;
    public FrameLayout.LayoutParams LIZJ = new FrameLayout.LayoutParams(0, 0);

    public final synchronized int LIZLLL() {
        return this.LIZ.getInt("key_new9v16_adapt_plan", 0);
    }

    public static int LJFF() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    }

    public final int LIZJ() {
        int i = this.LIZIZ;
        return i < 0 ? c0.LIZ.o2() : i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1660590tJZ.LIZIZ():int");
    }

    public final boolean LJI() {
        return LIZLLL() == 0 || LIZLLL() == 2 || LIZLLL() == 4;
    }

    public final boolean LJII() {
        return LIZLLL() == 0 || LIZLLL() == 1;
    }

    public C1660590tJZ(Keva keva) {
        this.LIZ = keva;
    }

    public final FrameLayout.LayoutParams LJ(Context context) {
        int iLIZJ;
        int i;
        int iLJFF;
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(context);
        int screenWidth = ScreenUtils.getScreenWidth(context);
        int i2 = screenWidth * 16;
        int i3 = i2 / 9;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (LIZLLL() == 0) {
            if (((Boolean) C0A6C.LIZ.getValue()).booleanValue() && fullScreenHeight * 9 < i2) {
                layoutParams.height = ((fullScreenHeight - LIZJ()) - LJFF()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                layoutParams.height = fullScreenHeight - LIZJ();
            }
            layoutParams.width = (layoutParams.height * 9) / 16;
        } else {
            layoutParams.width = screenWidth;
            layoutParams.height = i3;
        }
        int iLIZLLL = LIZLLL();
        if (iLIZLLL != 1) {
            if (iLIZLLL != 3) {
                if (iLIZLLL != 5) {
                    if (iLIZLLL != 6) {
                        iLJFF = 0;
                    } else {
                        iLJFF = (((fullScreenHeight - LJFF()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - layoutParams.height) / 2;
                    }
                } else {
                    iLJFF = (((fullScreenHeight - LJFF()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - layoutParams.height) / 2;
                }
                layoutParams.topMargin = iLJFF;
                layoutParams.bottomMargin = (fullScreenHeight - iLJFF) - layoutParams.height;
                int i4 = (screenWidth - layoutParams.width) / 2;
                layoutParams.leftMargin = i4;
                layoutParams.setMarginStart(i4);
                LIZJ();
                this.LIZJ = layoutParams;
                C2344809Gs.LIZLLL(3, "creative_tools_screen_adapt", "getSurfaceViewLayoutParams: adoptPlan: " + LIZLLL() + ", navibarHeigh=" + LIZJ() + ", surfaceBottomMargin=" + this.LIZJ.bottomMargin + " surfaceTopMargin=" + this.LIZJ.topMargin + " surfaceWidth=" + this.LIZJ.width + " surfaceHeight=" + this.LIZJ.height + " naviHeightThreshold=" + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) + ' ');
                return layoutParams;
            }
            iLIZJ = ((fullScreenHeight - LIZJ()) - LJFF()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            i = layoutParams.height;
        } else {
            iLIZJ = fullScreenHeight - LIZJ();
            i = layoutParams.height;
        }
        iLJFF = iLIZJ - i;
        layoutParams.topMargin = iLJFF;
        layoutParams.bottomMargin = (fullScreenHeight - iLJFF) - layoutParams.height;
        int i42 = (screenWidth - layoutParams.width) / 2;
        layoutParams.leftMargin = i42;
        layoutParams.setMarginStart(i42);
        LIZJ();
        this.LIZJ = layoutParams;
        C2344809Gs.LIZLLL(3, "creative_tools_screen_adapt", "getSurfaceViewLayoutParams: adoptPlan: " + LIZLLL() + ", navibarHeigh=" + LIZJ() + ", surfaceBottomMargin=" + this.LIZJ.bottomMargin + " surfaceTopMargin=" + this.LIZJ.topMargin + " surfaceWidth=" + this.LIZJ.width + " surfaceHeight=" + this.LIZJ.height + " naviHeightThreshold=" + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) + ' ');
        return layoutParams;
    }

    public final void LIZ(int i, Context context) {
        this.LIZIZ = i;
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(context);
        int screenWidth = ScreenUtils.getScreenWidth(context);
        int i2 = screenWidth * 16;
        int i3 = i2 / 9;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        int i4 = fullScreenHeight * 9;
        int i5 = 1;
        if (i4 <= i2) {
            i5 = 0;
        } else if (i4 < screenWidth * 20) {
            if (i > iLIZIZ) {
                int i6 = (fullScreenHeight - i) - i3;
                if (i6 >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))) {
                    if (i6 <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72))) {
                        i5 = 2;
                    } else {
                        i5 = 3;
                    }
                }
            } else if ((((fullScreenHeight - c0.LIZ.p2()) - i3) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / 2 <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))) {
                i5 = 4;
            } else {
                i5 = 5;
            }
        } else {
            i5 = 6;
        }
        this.LIZ.storeInt("key_new9v16_adapt_plan", i5);
    }
}
