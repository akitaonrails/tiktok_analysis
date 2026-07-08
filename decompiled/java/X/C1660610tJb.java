package X;

import android.app.Application;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0tJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660610tJb implements InterfaceC1674890tgd {
    public static final C1660610tJb LIZ = new C1660610tJb();
    public static final Keva LIZIZ = Keva.getRepo("screen_adapt_repo");
    public static final Application LIZJ = C0CHQ.LIZ;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(479));

    public final synchronized int LIZIZ() {
        return LIZIZ.getInt("key_adapt_plan", 0);
    }

    @Override // X.InterfaceC1674890tgd
    public final synchronized int o2() {
        return LIZIZ.getInt("key_navibar_height", -1);
    }

    @Override // X.InterfaceC1674890tgd
    public final int n2() {
        int statusBarHeight = ScreenUtils.getStatusBarHeight(LIZJ);
        int iLIZIZ = LIZIZ();
        if (iLIZIZ == 1 || iLIZIZ == 6 || iLIZIZ == 3 || iLIZIZ == 4) {
            return statusBarHeight;
        }
        return 0;
    }

    @Override // X.InterfaceC1674890tgd
    public final int p2() {
        return LIZJ.getResources().getDimensionPixelSize(R.dimen.m4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int LIZ() {
        int iP2 = p2();
        Application application = LIZJ;
        int statusBarHeight = ScreenUtils.getStatusBarHeight(application);
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(application);
        switch (LIZIZ()) {
            case 1:
                fullScreenHeight -= statusBarHeight;
                return fullScreenHeight - iP2;
            case 2:
                return fullScreenHeight - iP2;
            case 3:
                return fullScreenHeight - statusBarHeight;
            case 4:
                fullScreenHeight -= o2();
                fullScreenHeight -= statusBarHeight;
                return fullScreenHeight - iP2;
            case 5:
                fullScreenHeight -= o2();
                return fullScreenHeight - iP2;
            case 6:
                fullScreenHeight -= o2();
                return fullScreenHeight - statusBarHeight;
            case 7:
                if (fullScreenHeight * 9 > ScreenUtils.getScreenWidth(application) * 16) {
                    iP2 = o2();
                    return fullScreenHeight - iP2;
                }
                return fullScreenHeight;
            default:
                return fullScreenHeight;
        }
    }

    @Override // X.InterfaceC1674890tgd
    public final int LLJJJJLIIL() {
        int iP2 = p2();
        int iLIZIZ = LIZIZ();
        if (iLIZIZ == 1 || iLIZIZ == 2) {
            return iP2;
        }
        if (iLIZIZ == 4 || iLIZIZ == 5) {
            return iP2 + o2();
        }
        if (iLIZIZ == 6 || iLIZIZ == 7) {
            return o2();
        }
        return 0;
    }

    @Override // X.InterfaceC1674890tgd
    public final boolean r2() {
        return LIZIZ() == 1 || LIZIZ() == 3 || LIZIZ() == 4 || LIZIZ() == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    @Override // X.InterfaceC1674890tgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void s2(int r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.app.Application r0 = X.C1660610tJb.LIZJ     // Catch: java.lang.Throwable -> L92
            int r6 = com.ss.android.ugc.aweme.shortvideo.ScreenUtils.getFullScreenHeight(r0)     // Catch: java.lang.Throwable -> L92
            int r5 = com.ss.android.ugc.aweme.shortvideo.ScreenUtils.getScreenWidth(r0)     // Catch: java.lang.Throwable -> L92
            int r4 = com.ss.android.ugc.aweme.shortvideo.ScreenUtils.getStatusBarHeight(r0)     // Catch: java.lang.Throwable -> L92
            int r8 = r9.p2()     // Catch: java.lang.Throwable -> L92
            int r0 = r5 * 16
            int r7 = r0 / 9
            if (r10 != 0) goto L34
            int r1 = r6 - r4
            int r0 = r1 - r8
            if (r7 > r0) goto L21
            r3 = 1
            goto L51
        L21:
            r3 = 3
            if (r7 > r1) goto L2c
            int r0 = r6 - r8
            if (r7 > r0) goto L2c
            if (r4 >= r8) goto L51
        L2a:
            r3 = 2
            goto L51
        L2c:
            int r0 = r6 - r8
            if (r7 <= r0) goto L2a
            if (r7 <= r1) goto L51
            r3 = 0
            goto L51
        L34:
            int r2 = r6 - r10
            r3 = 7
            if (r7 >= r2) goto L51
            int r1 = r2 - r4
            int r0 = r1 - r8
            if (r7 > r0) goto L41
            r3 = 4
            goto L51
        L41:
            if (r7 > r1) goto L4b
            int r0 = r2 - r8
            if (r7 > r0) goto L4b
            if (r4 >= r8) goto L50
        L49:
            r3 = 5
            goto L51
        L4b:
            int r2 = r2 - r8
            if (r7 <= r2) goto L49
            if (r7 > r1) goto L51
        L50:
            r3 = 6
        L51:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "FullScreen plan="
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            r1.append(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = ",screenHeight="
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            r1.append(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = ",screenWidth="
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            r1.append(r5)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = ",statusBarHeight="
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            r1.append(r4)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = ",naviBarHeight="
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            r1.append(r10)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L92
            X.C201955140j.LIZ(r0)     // Catch: java.lang.Throwable -> L92
            com.bytedance.keva.Keva r1 = X.C1660610tJb.LIZIZ     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "key_adapt_plan"
            r1.storeInt(r0, r3)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "key_navibar_height"
            r1.storeInt(r0, r10)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r9)
            return
        L92:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1660610tJb.s2(int):void");
    }

    @Override // X.InterfaceC1674890tgd
    public final FrameLayout.LayoutParams t2(int i, int i2) {
        int iN2;
        Application application = LIZJ;
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(application);
        int screenWidth = ScreenUtils.getScreenWidth(application);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (fullScreenHeight * 9 > screenWidth * 16) {
            iN2 = n2();
            fullScreenHeight = LIZ();
        } else {
            iN2 = 0;
        }
        if (C537820L7k.LIZ(i, i2)) {
            layoutParams.height = fullScreenHeight;
            layoutParams.topMargin = iN2;
            layoutParams.width = (fullScreenHeight * i) / i2;
            layoutParams.leftMargin = (ScreenUtils.getScreenWidth(application) - layoutParams.width) / 2;
        } else {
            layoutParams.width = screenWidth;
            int i3 = (screenWidth * i2) / i;
            layoutParams.height = i3;
            int i4 = iN2 + ((fullScreenHeight - i3) / 2);
            layoutParams.topMargin = i4;
            if (i4 < 0) {
                i4 = 0;
            }
            layoutParams.topMargin = i4;
            layoutParams.leftMargin = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenSizeCompat: surfaceView height:");
        sbLIZ.append(layoutParams.height);
        sbLIZ.append(", width:");
        sbLIZ.append(layoutParams.width);
        sbLIZ.append(",plan=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(" videoWidth：");
        sbLIZ.append(i);
        sbLIZ.append(" x ");
        sbLIZ.append(i2);
        sbLIZ.append(", topMargin=");
        sbLIZ.append(layoutParams.topMargin);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        layoutParams.setMarginStart(layoutParams.leftMargin);
        return layoutParams;
    }

    @Override // X.InterfaceC1674890tgd
    public final void q2(int i, int i2, View view) {
        if (view != null && i != 0 && i2 != 0) {
            C786410Ut5.W5(view, t2(i, i2));
        }
    }
}
