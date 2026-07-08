package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0rYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593220rYu {
    public static AbstractC1593300rZ2 LIZIZ;
    public static C0N7W LIZLLL;
    public static final C1593220rYu LIZ = new C1593220rYu();
    public static final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS195S0000000_9.get$arr$(419));

    public static final void LIZ(int i, final String str) {
        if (i == 1) {
            final C1593240rYw c1593240rYw = new C1593240rYw(EnumC1593230rYv.START, System.currentTimeMillis());
            final EnumC1083510eIn enumC1083510eIn = EnumC1083510eIn.TOP;
            final EnumC1589910rTZ enumC1589910rTZ = EnumC1589910rTZ.SLIDE;
            AbstractC1593300rZ2 abstractC1593300rZ2 = new AbstractC1593300rZ2(str, c1593240rYw, enumC1083510eIn, enumC1589910rTZ) { // from class: X.0rZ4
            };
            LIZIZ = abstractC1593300rZ2;
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LIZJ(abstractC1593300rZ2);
            }
        }
    }

    public static final void LIZJ(String str, String str2) {
        if (!Intrinsics.LJFF(str, str2) && str2 != null) {
            if ((str == null || a0.LJJJIL(str)) && Intrinsics.LJFF(str2, "For You")) {
                return;
            }
            C1593310rZ3 c1593310rZ3 = new C1593310rZ3(str, new C1593240rYw(EnumC1593230rYv.START), EnumC1083510eIn.TOP, EnumC1589910rTZ.DIRECT, str2);
            LIZIZ = c1593310rZ3;
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LIZJ(c1593310rZ3);
            }
        }
    }

    public static final void LIZLLL(HomeTabAbility homeTabAbility, String str) {
        String strCt0;
        if (homeTabAbility != null) {
            strCt0 = homeTabAbility.Ct0();
        } else {
            strCt0 = null;
        }
        if (!Intrinsics.LJFF(strCt0, str) && str != null) {
            C1593250rYx c1593250rYx = new C1593250rYx(strCt0, new C1593240rYw(EnumC1593230rYv.START, System.currentTimeMillis()), EnumC1083510eIn.TOP, EnumC1589910rTZ.CLICK_TOP_ICON, str);
            LIZIZ = c1593250rYx;
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LIZJ(c1593250rYx);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r9, java.lang.String r10, java.lang.String r11) {
        /*
            if (r11 == 0) goto Lc2
            boolean r0 = kotlin.text.a0.LJJJIL(r11)
            r8 = 1
            r0 = r0 ^ 1
            r7 = 0
            if (r0 == 0) goto Lc2
            X.0rZ2 r3 = X.C1593220rYu.LIZIZ
            if (r3 != 0) goto L11
            return
        L11:
            X.0rYw r2 = new X.0rYw
            X.0rYv r0 = X.EnumC1593230rYv.FRAMEWORK
            r2.<init>(r0)
            X.0rZ5 r1 = new X.0rZ5
            java.lang.String r0 = r3.LIZ
            if (r0 == 0) goto L1f
            r10 = r0
        L1f:
            if (r9 == 0) goto Lc3
            androidx.fragment.app.Fragment r5 = r9.Ki(r11)
        L25:
            r1.<init>(r10, r11, r2, r5)
            X.0hR8 r0 = com.ss.android.ugc.aweme.spi.TabSwitchMetricService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.spi.TabSwitchMetricService r0 = X.C1204000hR8.LIZ()
            if (r0 == 0) goto L36
            r0.LJ(r1)
        L36:
            X.01GW r6 = com.ss.android.ugc.aweme.experiment.TabSwitchMetricConfig.LIZIZ
            java.lang.Object r0 = r6.getValue()
            com.ss.android.ugc.aweme.experiment.TabSwitchMetricConfig$Config r0 = (com.ss.android.ugc.aweme.experiment.TabSwitchMetricConfig.Config) r0
            long r3 = r0.fpsSampleDuration
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc0
            if (r5 != 0) goto Lc0
            X.0N7W r1 = X.C1593220rYu.LIZLLL
            if (r1 == 0) goto L53
            android.os.Handler r0 = X.C799570VYd.LIZIZ()
            r0.removeCallbacks(r1)
        L53:
            X.C1593220rYu.LIZLLL = r7
            X.01GW r4 = X.C1593220rYu.LIZJ
            java.lang.Object r0 = r4.getValue()
            X.0roc r0 = (X.InterfaceC1602960roc) r0
            r0.start()
            java.lang.Object r3 = r4.getValue()
            X.0roc r3 = (X.InterfaceC1602960roc) r3
            java.lang.String r2 = "be_null"
            if (r10 == 0) goto L75
            X.0rKY r0 = X.C1584320rKY.LIZ
            r0.getClass()
            java.lang.String r1 = X.C1584320rKY.LJI(r10)
            if (r1 != 0) goto L7f
        L75:
            X.0rKY r0 = X.C1584320rKY.LIZ
            r0.getClass()
            java.lang.String r1 = X.C1584320rKY.LJIIIIZZ
            if (r1 != 0) goto L7f
            r1 = r2
        L7f:
            java.lang.String r0 = "enter_from"
            r3.LIZ(r0, r1)
            java.lang.Object r1 = r4.getValue()
            X.0roc r1 = (X.InterfaceC1602960roc) r1
            X.0rKY r0 = X.C1584320rKY.LIZ
            r0.getClass()
            java.lang.String r0 = X.C1584320rKY.LJI(r11)
            if (r0 == 0) goto L96
            r2 = r0
        L96:
            java.lang.String r0 = "tab_name"
            r1.LIZ(r0, r2)
            java.lang.Object r2 = r4.getValue()
            X.0roc r2 = (X.InterfaceC1602960roc) r2
            if (r5 == 0) goto La4
            r8 = 0
        La4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "is_first_switch"
            r2.LJIIJJI(r1, r0)
            X.0N7W r3 = new java.lang.Runnable() { // from class: X.0N7W
                static {
                    /*
                        X.0N7W r0 = new X.0N7W
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0N7W) X.0N7W.LL X.0N7W
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0N7W.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0N7W.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r3 = this;
                        java.lang.String r2 = "TopTabSwitchMetricCollector@c421.startFpsSampleWithAutoStop$stopRunnable$1"
                        X.C1C7U.LIZ(r2)
                        X.0rYu r0 = X.C1593220rYu.LIZ     // Catch: java.lang.Throwable -> L23
                        X.0N7W r1 = X.C1593220rYu.LIZLLL     // Catch: java.lang.Throwable -> L23
                        if (r1 == 0) goto L12
                        android.os.Handler r0 = X.C799570VYd.LIZIZ()     // Catch: java.lang.Throwable -> L23
                        r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L23
                    L12:
                        r1 = 0
                        X.C1593220rYu.LIZLLL = r1     // Catch: java.lang.Throwable -> L23
                        X.01GW r0 = X.C1593220rYu.LIZJ     // Catch: java.lang.Throwable -> L23
                        java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L23
                        X.0roc r0 = (X.InterfaceC1602960roc) r0     // Catch: java.lang.Throwable -> L23
                        r0.stop()     // Catch: java.lang.Throwable -> L23
                        X.C1593220rYu.LIZLLL = r1     // Catch: java.lang.Throwable -> L23
                        goto L2e
                    L23:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        boolean r0 = X.C2179971ATj.LIZ(r1)
                        if (r0 != 0) goto L2e
                        throw r1
                    L2e:
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0N7W.run():void");
                }
            }
            X.C1593220rYu.LIZLLL = r3
            android.os.Handler r2 = X.C799570VYd.LIZIZ()
            java.lang.Object r0 = r6.getValue()
            com.ss.android.ugc.aweme.experiment.TabSwitchMetricConfig$Config r0 = (com.ss.android.ugc.aweme.experiment.TabSwitchMetricConfig.Config) r0
            long r0 = r0.fpsSampleDuration
            X.C786410Ut5.LJLIIL(r0, r2, r3)
        Lc0:
            X.C1593220rYu.LIZIZ = r7
        Lc2:
            return
        Lc3:
            r5 = r7
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1593220rYu.LIZIZ(com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility, java.lang.String, java.lang.String):void");
    }
}
