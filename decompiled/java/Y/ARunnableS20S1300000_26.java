package Y;

import X.C0JD5;
import X.C1155650gB9;
import X.C1227904rF;
import X.C1602160rnK;
import X.C1708610uZ1;
import X.C1709110uZp;
import X.C1710900uci;
import X.C1711110ud3;
import X.C1711230udF;
import X.C1711250udH;
import X.C1716310ulR;
import X.C1719100upw;
import X.C1719450uqV;
import X.C1719940urI;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1948507kB;
import X.C1954807lC;
import X.C19EG;
import X.C1C7U;
import X.C786410Ut5;
import X.EnumC1710890uch;
import X.EnumC488160JCk;
import X.InterfaceC1709310ua9;
import X.InterfaceC1716260ulM;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberFragment;
import com.ss.android.ugc.aweme.component.phone.PhoneRouteArg;
import com.ss.android.ugc.aweme.component.phone.change.setting.PhoneSettingAssem;
import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTFragment;
import com.ss.android.ugc.aweme.component.phone.ttmobile.TTPhoneRouteArg;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfo;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierAssem;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS20S1300000_26 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1749280vcc c1749280vcc;
        C1749280vcc c1749280vcc2;
        int i = C0JD5.LIZ[((EnumC488160JCk) this.l1).ordinal()];
        if (i == 1) {
            View viewLJJIJL = ((UIAssem) this.l2).LJJIJL();
            C786410Ut5.LLLZLZ(viewLJJIJL != null ? (C1749280vcc) viewLJJIJL.findViewById(R.id.z18) : null, 0);
            View viewLJJIJL2 = ((UIAssem) this.l2).LJJIJL();
            if (viewLJJIJL2 != null && (c1749280vcc = (C1749280vcc) viewLJJIJL2.findViewById(R.id.z18)) != null) {
                c1749280vcc.LJ();
            }
            ((PhoneSettingAssem) this.l3).Vo();
            return;
        }
        if (i == 2) {
            PhoneSettingAssem phoneSettingAssem = (PhoneSettingAssem) this.l3;
            C786410Ut5.LLLLZLL(phoneSettingAssem.Oo(), 0);
            C786410Ut5.LLLLZLL(phoneSettingAssem.No(), 0);
            C786410Ut5.LLLLLLJ(phoneSettingAssem.Ho(), 0);
            C786410Ut5.LLLLZLL(phoneSettingAssem.Lo(), 0);
            View viewLJJIJL3 = ((UIAssem) this.l2).LJJIJL();
            C786410Ut5.LLLZLZ(viewLJJIJL3 != null ? (C1749280vcc) viewLJJIJL3.findViewById(R.id.z18) : null, 8);
            return;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        ((PhoneSettingAssem) this.l3).Vo();
        View viewLJJIJL4 = ((UIAssem) this.l2).LJJIJL();
        C786410Ut5.LLLZLZ(viewLJJIJL4 != null ? (C1749280vcc) viewLJJIJL4.findViewById(R.id.z18) : null, 0);
        View viewLJJIJL5 = ((UIAssem) this.l2).LJJIJL();
        if (viewLJJIJL5 == null || (c1749280vcc2 = (C1749280vcc) viewLJJIJL5.findViewById(R.id.z18)) == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1719940urI.LIZIZ(c1722300uv6, this.s0, new AwS570S0100000_26((PhoneSettingAssem) this.l3, 148));
        c1749280vcc2.setStatus(c1722300uv6);
    }

    public final void LIZ$1() {
        String string;
        String string2;
        C1709110uZp c1709110uZp;
        String str;
        String str2;
        C1709110uZp c1709110uZp2;
        String str3;
        C1709110uZp c1709110uZp3;
        C1709110uZp c1709110uZp4;
        C1709110uZp c1709110uZp5;
        int i = C1710900uci.LIZ[((EnumC1710890uch) this.l1).ordinal()];
        if (i != 1) {
            if (i == 2) {
                ((RefundCashierAssem) this.l2).LLJJJJJIL();
                return;
            }
            String str4 = "";
            if (i == 3) {
                RefundCashierAssem refundCashierAssem = (RefundCashierAssem) this.l2;
                C786410Ut5.LLLZLZ(refundCashierAssem.So(), 0);
                C1749280vcc c1749280vccSo = refundCashierAssem.So();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                Context context = refundCashierAssem.getContext();
                if (context == null || (string = context.getString(2131857131)) == null) {
                    string = "";
                }
                c1722300uv6.LJI = string;
                Context context2 = refundCashierAssem.getContext();
                if (context2 != null && (string2 = context2.getString(2131857130)) != null) {
                    str4 = string2;
                }
                c1722300uv6.LJIIIIZZ = str4;
                c1722300uv6.LJIIIZ = new AwS597S0100000_18(refundCashierAssem, 639);
                c1749280vccSo.setStatus(c1722300uv6);
                C1711250udH c1711250udHNo = refundCashierAssem.No();
                int visibility = c1711250udHNo.getVisibility();
                c1711250udHNo.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1711250udHNo);
                C786410Ut5.LL(8, refundCashierAssem.Ho());
                String str5 = RefundCashierFragment._pnsPageId;
                RefundCashierFragment.LLJJJJ.put(((RefundCashierAssem) this.l2).Oo(), Boolean.FALSE);
                return;
            }
            if (i != 4) {
                throw new C1954807lC();
            }
            RefundCashierAssem refundCashierAssem2 = (RefundCashierAssem) this.l2;
            refundCashierAssem2.LLJJI = (RefundCashierBasicInfo) this.l3;
            refundCashierAssem2.LLJJIII = this.s0;
            C786410Ut5.LLLZLZ(refundCashierAssem2.So(), 8);
            RefundCashierBasicInfo refundCashierBasicInfo = refundCashierAssem2.LLJJI;
            String str6 = null;
            if (refundCashierBasicInfo != null) {
                C1711250udH c1711250udHNo2 = refundCashierAssem2.No();
                int visibility2 = c1711250udHNo2.getVisibility();
                c1711250udHNo2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c1711250udHNo2);
                refundCashierAssem2.LLJJIJIL = C1711230udF.LIZ;
                refundCashierAssem2.LLJJIJI = null;
                refundCashierAssem2.LLJJIJIIJIL = null;
                refundCashierAssem2.No().LIZJ(refundCashierAssem2.LLJJIII, refundCashierBasicInfo);
                String str7 = RefundCashierFragment._pnsPageId;
                C1155650gB9 c1155650gB9Lo = refundCashierAssem2.Lo();
                if (c1155650gB9Lo == null || (c1709110uZp5 = c1155650gB9Lo.LL) == null || (str = c1709110uZp5.LJIIJ) == null) {
                    str = "";
                }
                RefundCashierFragment.LLJJJIL.put(str, Boolean.TRUE);
                C1155650gB9 c1155650gB9Lo2 = refundCashierAssem2.Lo();
                InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ((c1155650gB9Lo2 == null || (c1709110uZp4 = c1155650gB9Lo2.LL) == null) ? null : c1709110uZp4.LJIIJ);
                HashMap map = new HashMap();
                C1155650gB9 c1155650gB9Lo3 = refundCashierAssem2.Lo();
                if (c1155650gB9Lo3 == null || (c1709110uZp3 = c1155650gB9Lo3.LL) == null || (str2 = c1709110uZp3.LJFF) == null) {
                    str2 = "";
                }
                map.put("total_payment", str2);
                C1155650gB9 c1155650gB9Lo4 = refundCashierAssem2.Lo();
                if (c1155650gB9Lo4 != null && (c1709110uZp2 = c1155650gB9Lo4.LL) != null && (str3 = c1709110uZp2.LJI) != null) {
                    str4 = str3;
                }
                map.put("currency", str4);
                interfaceC1709310ua9LIZIZ.LIZIZ("select_refund_method", map);
            }
            C786410Ut5.LL(0, refundCashierAssem2.Ho());
            C1155650gB9 c1155650gB9Lo5 = refundCashierAssem2.Lo();
            if (c1155650gB9Lo5 != null && (c1709110uZp = c1155650gB9Lo5.LL) != null) {
                str6 = c1709110uZp.LJIIJ;
            }
            InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ2 = C1708610uZ1.LIZIZ(str6);
            HashMap map2 = new HashMap();
            map2.put("page_name", "select_refund_method");
            map2.put("button_name", refundCashierAssem2.LLJJIJIL instanceof C1711110ud3 ? "contact_us" : "continue");
            interfaceC1709310ua9LIZIZ2.LIZ("tiktokls_button_show", map2);
            String str8 = RefundCashierFragment._pnsPageId;
            RefundCashierFragment.LLJJJJ.put(((RefundCashierAssem) this.l2).Oo(), Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.0qPN] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0uXE] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.0qPP, X.0uXB] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.ss.android.ugc.aweme.pipo.postpayment.IPipoPostPaymentService] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS20S1300000_26.LIZ$2():void");
    }

    public final void LIZ$3() {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) this.l1, "//bnpl/onboarding/collect_mobile_from_tt");
        C1719450uqV c1719450uqV = (C1719450uqV) this.l2;
        String str = c1719450uqV.LJFF;
        String str2 = c1719450uqV.LJI;
        boolean z = c1719450uqV.LJIIIIZZ;
        ArrayList<RegionMobileCodeItem> arrayList = c1719450uqV.LJII;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        C1719450uqV c1719450uqV2 = (C1719450uqV) this.l2;
        String str3 = c1719450uqV2.LJIIIZ;
        String str4 = c1719450uqV2.LJIIJ;
        String strInvoke = c1719450uqV2.LJIIJJI.invoke();
        C1719450uqV c1719450uqV3 = (C1719450uqV) this.l2;
        String str5 = c1719450uqV3.LJIIL;
        String str6 = c1719450uqV3.LJIILIIL;
        String str7 = c1719450uqV3.LJIILJJIL;
        String str8 = c1719450uqV3.LJIILL;
        boolean z2 = c1719450uqV3.LJIILLIIL;
        String str9 = c1719450uqV3.LJIIZILJ;
        String str10 = c1719450uqV3.LJIJ;
        boolean z3 = c1719450uqV3.LJIJI;
        String str11 = c1719450uqV3.LJIJJ;
        String str12 = c1719450uqV3.LJIJJLI;
        String str13 = c1719450uqV3.LJIL;
        String str14 = c1719450uqV3.LJJ;
        boolean z4 = c1719450uqV3.LJJI;
        HashMap<String, String> map = c1719450uqV3.LIZ;
        String str15 = c1719450uqV3.LJJIFFI;
        String str16 = c1719450uqV3.LJJII;
        String str17 = this.s0;
        if (str17 == null) {
            str17 = "";
        }
        smartRouteBuildRoute.withNavArg(new TTPhoneRouteArg(str, str2, z, arrayList, str3, str4, strInvoke, str5, str6, str7, str8, z2, str9, str10, z3, str11, str12, str13, str14, z4, map, str15, str16, str17));
        final C1719450uqV c1719450uqV4 = (C1719450uqV) this.l2;
        final InterfaceC1716260ulM interfaceC1716260ulM = (InterfaceC1716260ulM) this.l3;
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0uqL
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str18, String str19) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str18) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str18) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str18) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                C1719430uqT c1719430uqT = CollectMobileFromTTFragment.LLIZLLLIL;
                final C1719450uqV c1719450uqV5 = c1719450uqV4;
                String str18 = c1719450uqV5.LJFF;
                final InterfaceC1716260ulM interfaceC1716260ulM2 = interfaceC1716260ulM;
                InterfaceC1567370qtD interfaceC1567370qtD = new InterfaceC1567370qtD() { // from class: X.0upx
                    @Override // X.InterfaceC1567370qtD
                    public final void LIZ(boolean z5, Object obj, List<? extends C19EG> list, C19EG c19eg, String str19) {
                        c1719450uqV5.LJJIIJ = new WeakReference<>(c19eg);
                        if (z5) {
                            interfaceC1716260ulM2.LIZJ(obj, str19, list);
                        } else {
                            interfaceC1716260ulM2.LIZ(null);
                        }
                    }
                };
                c1719430uqT.getClass();
                CollectMobileFromTTFragment.LLJI.put(str18, interfaceC1567370qtD);
            }
        });
        smartRouteBuildRoute.open(((C1719450uqV) this.l2).LJJIII);
    }

    public final void LIZ$4() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("number_fetch_flag", "mismatch");
        String strInvoke = ((C1719100upw) this.l1).LJIIJJI.invoke();
        if (C1948507kB.LIZ(strInvoke)) {
            C1716310ulR.LIZ.getClass();
            linkedHashMap.putAll(new LinkedHashMap(C1716310ulR.LIZ(strInvoke)));
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) this.l2, "//bnpl/onboarding/tel");
        C1719100upw c1719100upw = (C1719100upw) this.l1;
        String str = c1719100upw.LJFF;
        String str2 = c1719100upw.LJI;
        boolean z = c1719100upw.LJIIIIZZ;
        ArrayList<RegionMobileCodeItem> arrayList = c1719100upw.LJII;
        String str3 = c1719100upw.LJIIIZ;
        String str4 = c1719100upw.LJIIJ;
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(linkedHashMap);
        if (strLJI == null) {
            strLJI = "";
        }
        C1719100upw c1719100upw2 = (C1719100upw) this.l1;
        String str5 = c1719100upw2.LJIIL;
        String str6 = c1719100upw2.LJIILIIL;
        String str7 = c1719100upw2.LJIILJJIL;
        String str8 = c1719100upw2.LJIILL;
        HashMap<String, String> map = c1719100upw2.LIZ;
        String str9 = c1719100upw2.LJIILLIIL;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = this.s0;
        smartRouteBuildRoute.withNavArg(new PhoneRouteArg(str, str2, z, arrayList, str3, str4, strLJI, str5, str6, str7, str8, false, true, map, str9, str10 != null ? str10 : "", c1719100upw2.LJIIZILJ));
        final C1719100upw c1719100upw3 = (C1719100upw) this.l1;
        final InterfaceC1716260ulM interfaceC1716260ulM = (InterfaceC1716260ulM) this.l3;
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0upv
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str11, String str12) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str11) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str11) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str11) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                C1717860unw c1717860unw = PhoneNumberFragment.LLJJI;
                String str11 = c1719100upw3.LJFF;
                final InterfaceC1716260ulM interfaceC1716260ulM2 = interfaceC1716260ulM;
                InterfaceC1717870unx interfaceC1717870unx = new InterfaceC1717870unx() { // from class: X.0upu
                    @Override // X.InterfaceC1717870unx
                    public final void LIZ(boolean z2, Object obj, C19EG c19eg, C19EG c19eg2, String str12) {
                        if (z2) {
                            interfaceC1716260ulM2.LIZJ(obj, str12, C1697810uHb.LJIIJJI(c19eg, c19eg2));
                        } else {
                            interfaceC1716260ulM2.LIZ(null);
                        }
                    }
                };
                c1717860unw.getClass();
                PhoneNumberFragment.LLJJIJI.put(str11, interfaceC1717870unx);
            }
        });
        smartRouteBuildRoute.open(((C1719100upw) this.l1).LJIJ);
    }

    public static final void run$0(ARunnableS20S1300000_26 aRunnableS20S1300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PhoneSettingAssem@3e8c.onViewCreated$6$2");
        try {
            aRunnableS20S1300000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhoneSettingAssem@3e8c.onViewCreated$6$2");
    }

    public static final void run$1(ARunnableS20S1300000_26 aRunnableS20S1300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("RefundCashierAssem@d6e8.initSubscribe$5$1");
        try {
            aRunnableS20S1300000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RefundCashierAssem@d6e8.initSubscribe$5$1");
    }

    public static final void run$2(ARunnableS20S1300000_26 aRunnableS20S1300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CashierPayHelper@4352.startQueryPayResult$queryCallback$1$onQuerySuccess$notifyJob$1");
        try {
            aRunnableS20S1300000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CashierPayHelper@4352.startQueryPayResult$queryCallback$1$onQuerySuccess$notifyJob$1");
    }

    public static final void run$3(ARunnableS20S1300000_26 aRunnableS20S1300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CollectMobileFromTTStep@57e9.execute$1");
        try {
            aRunnableS20S1300000_26.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CollectMobileFromTTStep@57e9.execute$1");
    }

    public static final void run$4(ARunnableS20S1300000_26 aRunnableS20S1300000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CollectMobileStep@c458.execute$1");
        try {
            aRunnableS20S1300000_26.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CollectMobileStep@c458.execute$1");
    }

    public ARunnableS20S1300000_26(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }

    public ARunnableS20S1300000_26(EnumC1710890uch enumC1710890uch, RefundCashierAssem refundCashierAssem, String str, RefundCashierBasicInfo refundCashierBasicInfo, String str2, int i) {
        this.$t = i;
        this.l1 = enumC1710890uch;
        this.l2 = refundCashierAssem;
        this.l3 = refundCashierBasicInfo;
        this.s0 = str2;
    }
}
