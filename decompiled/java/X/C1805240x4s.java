package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: renamed from: X.0x4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805240x4s {
    public static final C01GW<InterfaceC1133710fbl> LJIIJ = C292401Bi.LIZ(AFwS216S0000000_27.get$arr$(0));
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 LIZJ;
    public View LIZLLL;
    public FrameLayout LJ;
    public C20743416Fc LJFF;
    public C20743416Fc LJI;
    public C466310IQj LJII;
    public boolean LJIIIIZZ;
    public final C11NJ LJIIIZ;

    public static String LIZIZ(long j) {
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 60;
        return C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4 / j5), Long.valueOf(j % j5)}, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r7) {
        /*
            r6 = this;
            boolean r0 = X.C1804990x4T.LIZIZ()
            if (r0 != 0) goto Le
            android.widget.FrameLayout r0 = r6.LJ
            if (r0 == 0) goto Ld
            X.C500260Jjc.LJIILIIL(r0)
        Ld:
            return
        Le:
            boolean r0 = X.C1804990x4T.LIZIZ()
            if (r0 == 0) goto L52
            android.view.View r1 = r6.LIZLLL
            r3 = 0
            if (r1 == 0) goto L77
            r0 = 2131373623(0x7f0a2e37, float:1.8367342E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
        L22:
            r6.LJ = r0
            r5 = 0
            if (r0 == 0) goto L56
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L56
            android.widget.FrameLayout r0 = r6.LJ
            if (r0 == 0) goto L53
            android.view.View r4 = r0.getChildAt(r5)
        L35:
            if (r4 == 0) goto L54
            r0 = 2131373799(0x7f0a2ee7, float:1.83677E38)
            android.view.View r0 = r4.findViewById(r0)
            X.16Fc r0 = (X.C20743416Fc) r0
        L40:
            r6.LJFF = r0
            if (r4 == 0) goto L4d
            r0 = 2131373798(0x7f0a2ee6, float:1.8367697E38)
            android.view.View r3 = r4.findViewById(r0)
            X.16Fc r3 = (X.C20743416Fc) r3
        L4d:
            r6.LJI = r3
            r6.LIZJ(r7, r5)
        L52:
            return
        L53:
            r4 = r3
        L54:
            r0 = r3
            goto L40
        L56:
            android.view.View r0 = r6.LIZLLL
            if (r0 == 0) goto L75
            android.content.Context r0 = r0.getContext()
        L5e:
            android.view.LayoutInflater r2 = X.C786410Ut5.ne(r0)
            r1 = 2131568219(0x7f0d265b, float:1.876203E38)
            android.widget.FrameLayout r0 = r6.LJ
            android.view.View r4 = X.C786410Ut5.Td(r2, r1, r0, r5)
            android.widget.FrameLayout r2 = r6.LJ
            if (r2 == 0) goto L35
            r1 = -1
            r0 = -2
            r2.addView(r4, r1, r0)
            goto L35
        L75:
            r0 = r3
            goto L5e
        L77:
            r0 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1805240x4s.LIZ(int):void");
    }

    public C1805240x4s(AwS571S0100000_27 awS571S0100000_27, AwS571S0100000_27 awS571S0100000_272) {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2LIZ;
        this.LIZ = awS571S0100000_27;
        this.LIZIZ = awS571S0100000_272;
        InterfaceC1133710fbl value = LJIIJ.getValue();
        if (value != null) {
            firstRechargeCampaignV2LIZ = value.LIZ();
        } else {
            firstRechargeCampaignV2LIZ = null;
        }
        this.LIZJ = firstRechargeCampaignV2LIZ;
        this.LJIIIZ = new C11NJ();
    }

    public final void LIZJ(final int i, boolean z) {
        long j;
        C20743416Fc c20743416Fc;
        LIZLLL(i, z);
        if (z) {
            C20743416Fc c20743416Fc2 = this.LJI;
            if (c20743416Fc2 != null) {
                C500260Jjc.LJIILIIL(c20743416Fc2);
                return;
            }
            return;
        }
        final C238400w2 c238400w2 = new C238400w2();
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = this.LIZJ;
        if (firstRechargeCampaignV2 != null) {
            j = firstRechargeCampaignV2.expireTime;
        } else {
            j = 0;
        }
        long jLIZ = j - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        c238400w2.element = jLIZ;
        if (jLIZ < 0 && (c20743416Fc = this.LJI) != null) {
            C500260Jjc.LJIILIIL(c20743416Fc);
        }
        C20743416Fc c20743416Fc3 = this.LJI;
        if (c20743416Fc3 != null) {
            C500260Jjc.LLFFF(c20743416Fc3);
        }
        long j2 = c238400w2.element;
        long j3 = 86400;
        long j4 = j2 / j3;
        if ((j2 ^ j3) < 0 && j3 * j4 != j2) {
            j4--;
        }
        if (j4 >= 1) {
            C20743416Fc c20743416Fc4 = this.LJI;
            if (c20743416Fc4 == null) {
                return;
            }
            c20743416Fc4.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(2131755844, (int) j4), Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1)));
            return;
        }
        C20743416Fc c20743416Fc5 = this.LJI;
        if (c20743416Fc5 != null) {
            c20743416Fc5.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131852491), Arrays.copyOf(new Object[]{LIZIZ(c238400w2.element)}, 1)));
        }
        C466310IQj c466310IQj = new C466310IQj(1000 * c238400w2.element, 1000L, new InterfaceC466320IQk() { // from class: X.0x5N
            @Override // X.InterfaceC466320IQk
            public final void onStart() {
            }

            @Override // X.InterfaceC466320IQk
            public final void LIZLLL() {
                this.LJIIIIZZ = true;
                C784440Upu.LIZ().LIZIZ(new C1806680x7C());
                this.LIZJ(i, true);
            }

            @Override // X.InterfaceC466320IQk
            public final void LJJI(long j5) {
                C238400w2 c238400w22 = c238400w2;
                c238400w22.element--;
                C20743416Fc c20743416Fc6 = this.LJI;
                if (c20743416Fc6 != null) {
                    String strLJIJI = C497740JfY.LJIJI(2131852491);
                    C1805240x4s c1805240x4s = this;
                    long j6 = c238400w2.element;
                    c1805240x4s.getClass();
                    c20743416Fc6.setText(C786410Ut5.j4(strLJIJI, Arrays.copyOf(new Object[]{C1805240x4s.LIZIZ(j6)}, 1)));
                }
            }
        });
        c466310IQj.LJ();
        this.LJII = c466310IQj;
    }

    public final void LIZLLL(int i, boolean z) {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = this.LIZJ;
        if (firstRechargeCampaignV2 == null) {
            C20743416Fc c20743416Fc = this.LJFF;
            if (c20743416Fc != null) {
                C500260Jjc.LJIILIIL(c20743416Fc);
                return;
            }
            return;
        }
        if (z) {
            C20743416Fc c20743416Fc2 = this.LJFF;
            if (c20743416Fc2 != null) {
                c20743416Fc2.setText(C497740JfY.LJIJI(2131841736));
                return;
            }
            return;
        }
        C20743416Fc c20743416Fc3 = this.LJFF;
        if (c20743416Fc3 != null) {
            C500260Jjc.LLFFF(c20743416Fc3);
        }
        int iLIZ = C1804990x4T.LIZ(i);
        if (iLIZ == 0) {
            C20743416Fc c20743416Fc4 = this.LJFF;
            if (c20743416Fc4 != null) {
                c20743416Fc4.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(2131755846, firstRechargeCampaignV2.minimumNumberOfCoinsToUnlockFrozenCoins), Arrays.copyOf(new Object[]{Integer.valueOf(firstRechargeCampaignV2.minimumNumberOfCoinsToUnlockFrozenCoins)}, 1)));
                return;
            }
            return;
        }
        C20743416Fc c20743416Fc5 = this.LJFF;
        if (c20743416Fc5 == null) {
            return;
        }
        c20743416Fc5.setText(C786410Ut5.j4(C497740JfY.LJIIJJI(2131755845, firstRechargeCampaignV2.frozenCoinsForLargePackages), Arrays.copyOf(new Object[]{Integer.valueOf(iLIZ), Integer.valueOf(firstRechargeCampaignV2.remainingFrozenCoins)}, 2)));
    }
}
