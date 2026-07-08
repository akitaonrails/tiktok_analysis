package Y;

import X.C09JN;
import X.C1149170g0h;
import X.C1149180g0i;
import X.C13LP;
import X.C15438062q;
import X.C1796530wqp;
import X.C1796540wqq;
import X.C1803440x1y;
import X.C1803480x22;
import X.C1803550x29;
import X.C1804840x4E;
import X.C1807890x99;
import X.C1C7U;
import X.C2348809Ig;
import X.EnumC1796260wqO;
import X.InterfaceC1284030jWD;
import X.InterfaceC1803460x20;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class AfS1S0400100_27 implements C09JN {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0400100_27 afS1S0400100_27, Object obj) {
        C1C7U.LIZ("BaseRechargeViewModel@dbdb.loadProductDetailsWithRec$4");
        C1804840x4E c1804840x4E = (C1804840x4E) obj;
        InterfaceC1803460x20 interfaceC1803460x20 = ((BaseRechargeViewModel) afS1S0400100_27.l0).LLILLJJLI;
        if (interfaceC1803460x20 != null) {
            interfaceC1803460x20.LJIIL();
        }
        ((BaseRechargeViewModel) afS1S0400100_27.l0).OQ2(c1804840x4E);
        BaseRechargeViewModel baseRechargeViewModel = (BaseRechargeViewModel) afS1S0400100_27.l0;
        c1804840x4E.LJII();
        c1804840x4E.LJ();
        baseRechargeViewModel.getClass();
        List<Diamond> listLJIIIZ = c1804840x4E.LJIIIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIZ, 10));
        Iterator<Diamond> it2 = listLJIIIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().iapId);
        }
        C1803550x29.LJIL = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
        if (c1804840x4E.LJ) {
            C1803550x29.LJIJI = true;
        }
        InterfaceC1803460x20 interfaceC1803460x202 = ((BaseRechargeViewModel) afS1S0400100_27.l0).LLILLJJLI;
        if (interfaceC1803460x202 != null) {
            interfaceC1803460x202.L6(c1804840x4E, (C1807890x99) afS1S0400100_27.l1);
        }
        ((HashMap) afS1S0400100_27.l2).put("cost", Long.valueOf(System.currentTimeMillis() - afS1S0400100_27.j4));
        ((HashMap) afS1S0400100_27.l2).put("cache_policy", ((InterfaceC1284030jWD) afS1S0400100_27.l3).toString());
        ((HashMap) afS1S0400100_27.l2).put("hit_cache", Integer.valueOf(c1804840x4E.LJ ? 1 : 0));
        ((HashMap) afS1S0400100_27.l2).putAll(((C1807890x99) afS1S0400100_27.l1).LJIIIIZZ());
        C1803440x1y.LIZ("ttlive_wallet_recharge_panel_show", (HashMap) afS1S0400100_27.l2);
        C1796530wqp.LJIIJ((HashMap) afS1S0400100_27.l2);
        C1C7U.LIZIZ("BaseRechargeViewModel@dbdb.loadProductDetailsWithRec$4");
    }

    public static final void accept$1(AfS1S0400100_27 afS1S0400100_27, Object obj) {
        C1C7U.LIZ("BaseRechargeViewModel@dbdb.loadProductDetailsWithRec$5");
        Throwable thIQ2 = BaseRechargeViewModel.IQ2((BaseRechargeViewModel) afS1S0400100_27.l0, (Throwable) obj);
        ((HashMap) afS1S0400100_27.l1).put("cost", Long.valueOf(System.currentTimeMillis() - afS1S0400100_27.j4));
        ((HashMap) afS1S0400100_27.l1).put("error_msg", thIQ2.toString());
        ((HashMap) afS1S0400100_27.l1).put("cache_policy", ((InterfaceC1284030jWD) afS1S0400100_27.l2).toString());
        ((HashMap) afS1S0400100_27.l1).putAll(((C1807890x99) afS1S0400100_27.l3).LJIIIIZZ());
        Throwable thLIZ = C1803480x22.LIZ(thIQ2);
        HashMap map = (HashMap) afS1S0400100_27.l1;
        C1149180g0i.Companion.getClass();
        C1149180g0i c1149180g0iLIZ = C1149170g0h.LIZ(thLIZ);
        C1803440x1y.LIZJ("ttlive_wallet_recharge_panel_show", c1149180g0iLIZ.getErrorCode(), c1149180g0iLIZ.getDetailCode(), thLIZ.getMessage(), map);
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_recharge_panel_load_package_fail", C2348809Ig.LIZLLL((HashMap) afS1S0400100_27.l1), null, null, null, "wallet");
        C1C7U.LIZIZ("BaseRechargeViewModel@dbdb.loadProductDetailsWithRec$5");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS1S0400100_27(long r2, X.EnumC1803160x1W r4, com.bytedance.android.live.walletnew.BaseRechargeViewModel r5, X.C1807890x99 r6, java.util.HashMap r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            if (r8 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r7
            r0.j4 = r2
            r0.l2 = r4
            r0.l3 = r6
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r6
            r0.l2 = r7
            r0.j4 = r2
            r0.l3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0400100_27.<init>(long, X.0x1W, com.bytedance.android.live.walletnew.BaseRechargeViewModel, X.0x99, java.util.HashMap, int):void");
    }
}
