package X;

import Y.AkS326S0200000_19;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionQueryRequest;
import com.ss.android.ugc.aweme.minis.payment.MerchantIdList;
import com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionFragment;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197541AzY {
    public final Context LIZ;
    public final EnumC19366410pi LIZIZ;
    public final C2197361AzG LIZJ;
    public final C1B09 LIZLLL;
    public final C2197491AzT LJ;
    public final String LJFF;
    public final DialogC1389620mGW LJI;
    public final C1232790iBZ LJII;
    public MinisSubscriptionFragment LJIIIIZZ;
    public TuxSheet LJIIIZ;
    public boolean LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public final List<String> LJIILIIL;

    public final String LIZJ() {
        return this.LIZ.getString(2131822208);
    }

    public final void LJFF() {
        C1232850iBf c1232850iBf = C2197731Azr.LIZJ;
        C2197491AzT c2197491AzT = this.LJ;
        int i = c1232850iBf.LIZ;
        String str = c1232850iBf.LIZIZ;
        if (str == null) {
            str = "";
        }
        Integer num = c1232850iBf.LIZJ;
        String str2 = c1232850iBf.LIZLLL;
        C2197491AzT.LIZIZ(c2197491AzT, "minis_subscription_jsb_result_success", i, str, c2197491AzT.LIZ("check_env_start"), c2197491AzT.LJIILJJIL, c2197491AzT.LJIILL, c2197491AzT.LJIILLIIL, null, null, null, false, num, str2, null, 10112);
        C2197491AzT c2197491AzT2 = this.LJ;
        String str3 = c2197491AzT2.LJ;
        String str4 = c2197491AzT2.LIZJ;
        int i2 = C19366610pk.LIZ[this.LIZIZ.ordinal()];
        if (i2 == 1) {
            C2197671Azl.LIZLLL(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, str3, str4);
        } else if (i2 == 2) {
            C2197671Azl.LIZJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, str3, str4);
        } else {
            if (i2 != 3) {
                throw new C1954807lC();
            }
            C2197671Azl.LJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, str3, str4);
        }
    }

    public final void LIZ(boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissTuxSheet, endByUser:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            MinisSubscriptionFragment minisSubscriptionFragment = this.LJIIIIZZ;
            if (minisSubscriptionFragment != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(minisSubscriptionFragment, C343970De7.LIZ);
                return;
            }
            return;
        }
        MinisSubscriptionFragment minisSubscriptionFragment2 = this.LJIIIIZZ;
        if (minisSubscriptionFragment2 == null) {
            return;
        }
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(minisSubscriptionFragment2, new C343950De5());
    }

    public final void LJIIIZ(C2195941Awy c2195941Awy) {
        C1232850iBf c1232850iBf;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncClickResultIfNecessary, isNeedReportClickResult:");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", errorCodeScene:");
        sbLIZ.append(c2195941Awy.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LJIIL) {
            return;
        }
        this.LJIIL = false;
        EnumC2197771Azv enumC2197771Azv = c2195941Awy.LIZ;
        if (enumC2197771Azv != EnumC2197771Azv.SUCCESS_RECHARGE && enumC2197771Azv != EnumC2197771Azv.SUCCESS_PAY) {
            c1232850iBf = c2195941Awy.LIZLLL;
        } else {
            c1232850iBf = C2197731Azr.LIZJ;
        }
        if (c1232850iBf != null) {
            int i2 = C19366610pk.LIZ[this.LIZIZ.ordinal()];
            String string = null;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C2197491AzT c2197491AzT = this.LJ;
                        String str = c2197491AzT.LJ;
                        String str2 = c2197491AzT.LIZJ;
                        EnumC2197791Azx enumC2197791Azx = EnumC2197791Azx.IAP;
                        String strLIZ = C2195221Avo.LIZ();
                        Map mapLIZIZ = C2197671Azl.LIZIZ(enumC2197791Azx, EnumC21159117rB.PAYING);
                        Map mapLIZ = C2197671Azl.LIZ(str, str2);
                        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
                        String strValueOf = String.valueOf(c1232850iBf.LIZ);
                        Integer num = c1232850iBf.LIZJ;
                        if (num != null) {
                            string = num.toString();
                        }
                        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
                        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
                        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
                        c1232830iBd.getClass();
                        C1232830iBd.LIZ(strLIZ, "minis_subscribe_reactive_jsb_result", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onMinisSubscriptionReactiveAfterConfirmClickResult, errorCodeScene:");
                        sbLIZ2.append(c1232850iBf);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return;
                    }
                    throw new C1954807lC();
                }
                C2197491AzT c2197491AzT2 = this.LJ;
                String str3 = c2197491AzT2.LJ;
                String str4 = c2197491AzT2.LIZJ;
                EnumC2197791Azx enumC2197791Azx2 = EnumC2197791Azx.IAP;
                String strLIZ2 = C2195221Avo.LIZ();
                Map mapLIZIZ2 = C2197671Azl.LIZIZ(enumC2197791Azx2, EnumC21159117rB.PAYING);
                Map mapLIZ2 = C2197671Azl.LIZ(str3, str4);
                C1232830iBd c1232830iBd2 = C1232830iBd.LIZ;
                String strValueOf2 = String.valueOf(c1232850iBf.LIZ);
                Integer num2 = c1232850iBf.LIZJ;
                if (num2 != null) {
                    string = num2.toString();
                }
                EnumC1236600iHi enumC1236600iHi2 = c1232850iBf.LJFF;
                EnumC21632119lH enumC21632119lH2 = c1232850iBf.LJI;
                EnumC19415410xc enumC19415410xc2 = c1232850iBf.LJII;
                c1232830iBd2.getClass();
                C1232830iBd.LIZ(strLIZ2, "minis_subscribe_change_jsb_result", strValueOf2, string, mapLIZIZ2, mapLIZ2, enumC1236600iHi2, enumC21632119lH2, enumC19415410xc2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onMinisSubscriptionChangeAfterConfirmClickResult, errorCodeScene:");
                sbLIZ3.append(c1232850iBf);
                C2188811AlT.LIZIZ(sbLIZ3);
                return;
            }
            C2197491AzT c2197491AzT3 = this.LJ;
            String str5 = c2197491AzT3.LJ;
            String str6 = c2197491AzT3.LIZJ;
            EnumC2197791Azx enumC2197791Azx3 = EnumC2197791Azx.IAP;
            String strLIZ3 = C2195221Avo.LIZ();
            Map mapLIZIZ3 = C2197671Azl.LIZIZ(enumC2197791Azx3, EnumC21159117rB.PAYING);
            Map mapLIZ3 = C2197671Azl.LIZ(str5, str6);
            C1232830iBd c1232830iBd3 = C1232830iBd.LIZ;
            String strValueOf3 = String.valueOf(c1232850iBf.LIZ);
            Integer num3 = c1232850iBf.LIZJ;
            if (num3 != null) {
                string = num3.toString();
            }
            EnumC1236600iHi enumC1236600iHi3 = c1232850iBf.LJFF;
            EnumC21632119lH enumC21632119lH3 = c1232850iBf.LJI;
            EnumC19415410xc enumC19415410xc3 = c1232850iBf.LJII;
            c1232830iBd3.getClass();
            C1232830iBd.LIZ(strLIZ3, "minis_subscribe_create_jsb_result", strValueOf3, string, mapLIZIZ3, mapLIZ3, enumC1236600iHi3, enumC21632119lH3, enumC19415410xc3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onMinisSubscriptionCreateAfterConfirmClickResult, errorCodeScene:");
            sbLIZ4.append(c1232850iBf);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
    }

    public final void LIZIZ(String str, String str2) {
        int i = C1841280y10.LIZ().maxQueryTime;
        int i2 = C1841280y10.LIZ().queryInterval;
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) i);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doQuerySubscriptionProcessStatus, tradeOrderId:");
        sbLIZ.append(str);
        sbLIZ.append(", subscriptionId:");
        sbLIZ.append(str2);
        sbLIZ.append(", maxQueryDuration:");
        sbLIZ.append(i);
        sbLIZ.append(", queryInterval:");
        sbLIZ.append(i2);
        sbLIZ.append(", expireQueryTime:");
        sbLIZ.append(jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ);
        C2197491AzT.LIZIZ(this.LJ, "recharge_query_order_start", 0, null, 0L, 0, 0L, null, null, null, null, true, null, null, null, 15356);
        LJI(i2, str, jCurrentTimeMillis, 1, str2, null);
    }

    public final void LJII(String str, String str2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRechargeFlow, tradeOrderId:");
        sbLIZ.append(str);
        sbLIZ.append(", clientKey:");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        String string = null;
        C2197491AzT.LIZIZ(this.LJ, "minis_subscription_jsb_start", 0, null, 0L, 0, 0L, null, null, null, null, true, null, null, null, 15356);
        String str3 = this.LJ.LIZJ;
        int i2 = C19366610pk.LIZ[this.LIZIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    String strLIZ = C2195221Avo.LIZ();
                    Map mapLIZ = C2197671Azl.LIZ(str, str3);
                    C1232850iBf c1232850iBf = C2197731Azr.LIZ;
                    C1232830iBd c1232830iBd = C1232830iBd.LIZ;
                    String strValueOf = String.valueOf(c1232850iBf.LIZ);
                    Integer num = c1232850iBf.LIZJ;
                    if (num != null) {
                        string = num.toString();
                    }
                    EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
                    EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
                    EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
                    c1232830iBd.getClass();
                    C1232830iBd.LIZ(strLIZ, "minis_subscribe_reactive_jsb_start", strValueOf, string, null, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onMinisSubscriptionReactiveJsbStart, errorCodeScene:");
                    sbLIZ2.append(c1232850iBf);
                    C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    throw new C1954807lC();
                }
            } else {
                String strLIZ2 = C2195221Avo.LIZ();
                Map mapLIZ2 = C2197671Azl.LIZ(str, str3);
                C1232850iBf c1232850iBf2 = C2197731Azr.LIZ;
                C1232830iBd c1232830iBd2 = C1232830iBd.LIZ;
                String strValueOf2 = String.valueOf(c1232850iBf2.LIZ);
                Integer num2 = c1232850iBf2.LIZJ;
                if (num2 != null) {
                    string = num2.toString();
                }
                EnumC1236600iHi enumC1236600iHi2 = c1232850iBf2.LJFF;
                EnumC21632119lH enumC21632119lH2 = c1232850iBf2.LJI;
                EnumC19415410xc enumC19415410xc2 = c1232850iBf2.LJII;
                c1232830iBd2.getClass();
                C1232830iBd.LIZ(strLIZ2, "minis_subscribe_change_jsb_start", strValueOf2, string, null, mapLIZ2, enumC1236600iHi2, enumC21632119lH2, enumC19415410xc2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onMinisSubscriptionChangeJsbStart, errorCodeScene:");
                sbLIZ3.append(c1232850iBf2);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        } else {
            String strLIZ3 = C2195221Avo.LIZ();
            Map mapLIZ3 = C2197671Azl.LIZ(str, str3);
            C1232850iBf c1232850iBf3 = C2197731Azr.LIZ;
            C1232830iBd c1232830iBd3 = C1232830iBd.LIZ;
            String strValueOf3 = String.valueOf(c1232850iBf3.LIZ);
            Integer num3 = c1232850iBf3.LIZJ;
            if (num3 != null) {
                string = num3.toString();
            }
            EnumC1236600iHi enumC1236600iHi3 = c1232850iBf3.LJFF;
            EnumC21632119lH enumC21632119lH3 = c1232850iBf3.LJI;
            EnumC19415410xc enumC19415410xc3 = c1232850iBf3.LJII;
            c1232830iBd3.getClass();
            C1232830iBd.LIZ(strLIZ3, "minis_subscribe_create_jsb_start", strValueOf3, string, null, mapLIZ3, enumC1236600iHi3, enumC21632119lH3, enumC19415410xc3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onMinisSubscriptionCreateJsbStart, errorCodeScene:");
            sbLIZ4.append(c1232850iBf3);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        C786410Ut5.J4(this.LJI);
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2197571Azb(this, str, str3, str2, null), 3);
    }

    public C2197541AzY(Context context, EnumC19366410pi enumC19366410pi, C2197361AzG c2197361AzG, C1B09 c1b09) {
        String str;
        String str2;
        this.LIZ = context;
        this.LIZIZ = enumC19366410pi;
        this.LIZJ = c2197361AzG;
        this.LIZLLL = c1b09;
        C2197491AzT c2197491AzT = new C2197491AzT();
        int i = C19366610pk.LIZ[enumC19366410pi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "minis_subscription_reactive_flow";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "minis_subscription_change_flow";
            }
        } else {
            str = "minis_subscription_create_flow";
        }
        c2197491AzT.LIZLLL = str;
        c2197491AzT.LJI = c2197361AzG;
        c2197491AzT.LJIIJJI = c2197361AzG.LIZIZ;
        this.LJ = c2197491AzT;
        MerchantIdList merchantIdList = C1841280y10.LIZ().merchantIdList;
        this.LJFF = (merchantIdList == null || (str2 = merchantIdList.midMinisTypeAppSubscribe) == null) ? "80M5HX6P1503" : str2;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.setCanceledOnTouchOutside(false);
        dialogC1389620mGW.setCancelable(false);
        this.LJI = dialogC1389620mGW;
        this.LJII = new C1232790iBZ();
        this.LJIILIIL = C1697810uHb.LJIIJJI("content_name", "minis_id", "creative_id", "enter_from", "req_id", "minis_drama_collection_id", "minis_short_drama_inner_feed_episode_num_uid", "video_id", "gip_task_id", "gip_task_name", "video_creator_id");
    }

    public final void LJ(int i, String str, EnumC2197781Azw enumC2197781Azw, C1232850iBf c1232850iBf) {
        Integer num;
        String str2 = str;
        C2197491AzT c2197491AzT = this.LJ;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = null;
        if (c1232850iBf != null) {
            num = c1232850iBf.LIZJ;
            str3 = c1232850iBf.LIZLLL;
        } else {
            num = null;
        }
        C2197491AzT.LIZIZ(c2197491AzT, "minis_subscription_jsb_result_fail", i, str2, c2197491AzT.LIZ("check_env_start"), c2197491AzT.LJIILJJIL, c2197491AzT.LJIILL, c2197491AzT.LJIILLIIL, this.LJ.LIZIZ, enumC2197781Azw.name(), null, false, num, str3, c1232850iBf, 1536);
        C2197491AzT c2197491AzT2 = this.LJ;
        String str4 = c2197491AzT2.LJ;
        String str5 = c2197491AzT2.LIZJ;
        if (c1232850iBf != null) {
            int i2 = C19366610pk.LIZ[this.LIZIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C2197671Azl.LJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, str4, str5);
                        return;
                    }
                    throw new C1954807lC();
                }
                C2197671Azl.LIZJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, str4, str5);
                return;
            }
            C2197671Azl.LIZLLL(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, str4, str5);
        }
    }

    public final void LIZLLL(final Activity activity, final String str, final String str2, final String str3, boolean z, String str4) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        Dialog dialog;
        Window window;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("iapPayment, tradeOrderId:");
        sbLIZ.append(str);
        sbLIZ.append(", subscriptionId:");
        sbLIZ.append(str3);
        sbLIZ.append(", iapPayload:");
        sbLIZ.append(str2);
        sbLIZ.append(", needWebpay:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C2197491AzT.LIZIZ(this.LJ, "iap_pay_start", 0, null, 0L, 0, 0L, null, null, null, null, true, null, null, null, 15356);
        HashMap map = new HashMap();
        HashMap<String, String> map2 = this.LJ.LJIIJJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (this.LJIILIIL.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String strLIZIZ = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (!a0.LJJIIZI(strLIZIZ, "minis", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("minis_");
                sbLIZ2.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            map.put(strLIZIZ, value);
        }
        TuxSheet tuxSheet = this.LJIIIZ;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount(0.0f);
        }
        if (z) {
            if (str4.length() == 0) {
                C1232850iBf c1232850iBf = C2197731Azr.LJIJI;
                this.LIZLLL.LIZ(new C2195941Awy(EnumC2197771Azv.WEB_PAYLOAD_EMPTY, new C2195931Awx(c1232850iBf.LIZ, String.valueOf(LIZJ()), LIZJ(), EnumC2197781Azw.IAP), c1232850iBf, 4));
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2197701Azo(map, activity, str4, this, str, str3, null), 3);
            return;
        }
        C1789970wgF c1789970wgF = new C1789970wgF(str2, map);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) == null) {
            return;
        }
        interfaceC1791930wjPLLFZ.LIZIZ(activity, c1789970wgF, new InterfaceC518120KTq() { // from class: X.1Azn
            @Override // X.InterfaceC518120KTq
            public final void LIZ(C0KPG c0kpg) {
                Integer numValueOf;
                String str5;
                EnumC1792020wjY enumC1792020wjY;
                InterfaceC20673515v3 interfaceC20673515v3K42;
                InterfaceC1791930wjP interfaceC1791930wjPLLFZ2;
                Integer numValueOf2;
                String str6;
                EnumC1792020wjY enumC1792020wjY2;
                InterfaceC20673515v3 interfaceC20673515v3K43;
                InterfaceC1791930wjP interfaceC1791930wjPLLFZ3;
                Integer numValueOf3;
                String str7;
                String str8;
                EnumC1792020wjY enumC1792020wjY3;
                InterfaceC20673515v3 interfaceC20673515v3K44;
                InterfaceC1791930wjP interfaceC1791930wjPLLFZ4;
                Dialog dialog2;
                Window window2;
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("nativeIapPayment, onPurchaseFinish result:");
                sbLIZ3.append(c0kpg.LIZ);
                sbLIZ3.append(", result:");
                sbLIZ3.append(c0kpg);
                C2188811AlT.LIZIZ(sbLIZ3);
                TuxSheet tuxSheet2 = this.LIZ.LJIIIZ;
                if (tuxSheet2 != null && (dialog2 = tuxSheet2.getDialog()) != null && (window2 = dialog2.getWindow()) != null) {
                    window2.setDimAmount(0.5f);
                }
                int i3 = C0KQB.LIZ[c0kpg.LIZ.ordinal()];
                if (i3 != 1) {
                    String str9 = null;
                    String str10 = "";
                    if (i3 != 2) {
                        if (i3 != 3) {
                            ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                            if (iLiveOuterService2 != null && (interfaceC20673515v3K44 = iLiveOuterService2.k4()) != null && (interfaceC1791930wjPLLFZ4 = interfaceC20673515v3K44.LLFZ()) != null) {
                                interfaceC1791930wjPLLFZ4.LJFF(activity, c0kpg, this.LIZ.LJFF, null);
                            }
                            C786410Ut5.LJIIJ(this.LIZ.LJI);
                            MinisSubscriptionFragment minisSubscriptionFragment = this.LIZ.LJIIIIZZ;
                            if (minisSubscriptionFragment != null) {
                                minisSubscriptionFragment.SR();
                            }
                            C1232850iBf c1232850iBf2 = C2197731Azr.LJIIZILJ;
                            C0KQW c0kqw = c0kpg.LIZLLL;
                            if (c0kqw != null && (enumC1792020wjY3 = c0kqw.LIZ) != null) {
                                numValueOf3 = Integer.valueOf(enumC1792020wjY3.getValue());
                            } else {
                                numValueOf3 = null;
                            }
                            c1232850iBf2.LIZJ = numValueOf3;
                            C0KQW c0kqw2 = c0kpg.LIZLLL;
                            if (c0kqw2 != null) {
                                str7 = c0kqw2.LIZIZ;
                            } else {
                                str7 = null;
                            }
                            c1232850iBf2.LIZLLL = str7;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("[MP] Purchase fail: ");
                            C0KQW c0kqw3 = c0kpg.LIZLLL;
                            if (c0kqw3 != null) {
                                str8 = c0kqw3.LIZIZ;
                            } else {
                                str8 = null;
                            }
                            sbLIZ4.append(str8);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                            c1232850iBf2.LIZIZ = strLIZIZ2;
                            if (c0kpg.LJ != null) {
                                C2197491AzT c2197491AzT = this.LIZ.LJ;
                                int i4 = c1232850iBf2.LIZ;
                                if (strLIZIZ2 != null) {
                                    str10 = strLIZIZ2;
                                }
                                C2197491AzT.LIZIZ(c2197491AzT, "iap_pay_fail", i4, str10, c2197491AzT.LIZ("iap_pay_start"), 0, 0L, null, null, "IAP", c0kpg.LIZ.name(), false, c1232850iBf2.LIZJ, c1232850iBf2.LIZLLL, c1232850iBf2, 1264);
                            }
                            C1B09 c1b09 = this.LIZ.LIZLLL;
                            EnumC2197771Azv enumC2197771Azv = EnumC2197771Azv.IAP_PAY_FAIL;
                            int i5 = c1232850iBf2.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("IAP Payment params - ");
                            sbLIZ5.append(str2);
                            sbLIZ5.append(" tradeOrderId - ");
                            sbLIZ5.append(str);
                            sbLIZ5.append("  ");
                            C518080KTm c518080KTm = c0kpg.LJ;
                            if (c518080KTm != null) {
                                str9 = c518080KTm.LJFF;
                            }
                            sbLIZ5.append(str9);
                            c1b09.LIZIZ(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i5, C2188811AlT.LIZIZ(sbLIZ5), null, EnumC2197781Azw.IAP, 4), c1232850iBf2, 4));
                            return;
                        }
                        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService3 != null && (interfaceC20673515v3K43 = iLiveOuterService3.k4()) != null && (interfaceC1791930wjPLLFZ3 = interfaceC20673515v3K43.LLFZ()) != null) {
                            interfaceC1791930wjPLLFZ3.LJFF(activity, c0kpg, this.LIZ.LJFF, null);
                        }
                        C786410Ut5.LJIIJ(this.LIZ.LJI);
                        MinisSubscriptionFragment minisSubscriptionFragment2 = this.LIZ.LJIIIIZZ;
                        if (minisSubscriptionFragment2 != null) {
                            minisSubscriptionFragment2.SR();
                        }
                        C1232850iBf c1232850iBf3 = C2197731Azr.LJIIJJI;
                        C0KQW c0kqw4 = c0kpg.LIZLLL;
                        if (c0kqw4 != null && (enumC1792020wjY2 = c0kqw4.LIZ) != null) {
                            numValueOf2 = Integer.valueOf(enumC1792020wjY2.getValue());
                        } else {
                            numValueOf2 = null;
                        }
                        c1232850iBf3.LIZJ = numValueOf2;
                        C0KQW c0kqw5 = c0kpg.LIZLLL;
                        if (c0kqw5 != null) {
                            str6 = c0kqw5.LIZIZ;
                        } else {
                            str6 = null;
                        }
                        c1232850iBf3.LIZLLL = str6;
                        if (c0kpg.LJ != null) {
                            C2197491AzT c2197491AzT2 = this.LIZ.LJ;
                            int i6 = c1232850iBf3.LIZ;
                            String str11 = c1232850iBf3.LIZIZ;
                            if (str11 != null) {
                                str10 = str11;
                            }
                            C2197491AzT.LIZIZ(c2197491AzT2, "iap_pay_fail", i6, str10, c2197491AzT2.LIZ("iap_pay_start"), 0, 0L, null, null, "IAP", c0kpg.LIZ.name(), false, numValueOf2, str6, c1232850iBf3, 1264);
                        }
                        C1B09 c1b092 = this.LIZ.LIZLLL;
                        EnumC2197771Azv enumC2197771Azv2 = EnumC2197771Azv.IAP_PAY_PENDING;
                        int i7 = c1232850iBf3.LIZ;
                        C518080KTm c518080KTm2 = c0kpg.LJ;
                        if (c518080KTm2 != null) {
                            str9 = c518080KTm2.LJFF;
                        }
                        c1b092.LIZIZ(new C2195941Awy(enumC2197771Azv2, new C2195931Awx(i7, String.valueOf(str9), null, EnumC2197781Azw.IAP, 4), c1232850iBf3, 4));
                        this.LIZ.LIZ(false);
                        return;
                    }
                    C786410Ut5.LJIIJ(this.LIZ.LJI);
                    MinisSubscriptionFragment minisSubscriptionFragment3 = this.LIZ.LJIIIIZZ;
                    if (minisSubscriptionFragment3 != null) {
                        minisSubscriptionFragment3.SR();
                    }
                    ILiveOuterService iLiveOuterService4 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                    if (iLiveOuterService4 != null && (interfaceC20673515v3K42 = iLiveOuterService4.k4()) != null && (interfaceC1791930wjPLLFZ2 = interfaceC20673515v3K42.LLFZ()) != null) {
                        interfaceC1791930wjPLLFZ2.LJFF(activity, c0kpg, this.LIZ.LJFF, null);
                    }
                    C1232850iBf c1232850iBf4 = C2197731Azr.LJIIJ;
                    C0KQW c0kqw6 = c0kpg.LIZLLL;
                    if (c0kqw6 != null && (enumC1792020wjY = c0kqw6.LIZ) != null) {
                        numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                    } else {
                        numValueOf = null;
                    }
                    c1232850iBf4.LIZJ = numValueOf;
                    C0KQW c0kqw7 = c0kpg.LIZLLL;
                    if (c0kqw7 != null) {
                        str5 = c0kqw7.LIZIZ;
                    } else {
                        str5 = null;
                    }
                    c1232850iBf4.LIZLLL = str5;
                    C2197491AzT c2197491AzT3 = this.LIZ.LJ;
                    int i8 = c1232850iBf4.LIZ;
                    String str12 = c1232850iBf4.LIZIZ;
                    if (str12 == null) {
                        str12 = "";
                    }
                    C2197491AzT.LIZIZ(c2197491AzT3, "iap_pay_fail", i8, str12, c2197491AzT3.LIZ("iap_pay_start"), 0, 0L, null, null, "IAP", c0kpg.LIZ.name(), false, numValueOf, str5, c1232850iBf4, 1264);
                    C1B09 c1b093 = this.LIZ.LIZLLL;
                    EnumC2197771Azv enumC2197771Azv3 = EnumC2197771Azv.IAP_PAY_CANCEL;
                    int i9 = c1232850iBf4.LIZ;
                    C518080KTm c518080KTm3 = c0kpg.LJ;
                    if (c518080KTm3 != null) {
                        str9 = c518080KTm3.LJFF;
                    }
                    c1b093.LIZIZ(new C2195941Awy(enumC2197771Azv3, new C2195931Awx(i9, String.valueOf(str9), null, EnumC2197781Azw.IAP, 4), c1232850iBf4, 4));
                    return;
                }
                C2197491AzT c2197491AzT4 = this.LIZ.LJ;
                C2197491AzT.LIZIZ(c2197491AzT4, "iap_pay_success", 0, null, c2197491AzT4.LIZ("iap_pay_start"), 0, 0L, null, null, null, null, false, null, null, null, 16372);
                this.LIZ.LIZIZ(str, str3);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public final void LJI(final int i, String str, final long j, final int i2, final String str2, String str3) {
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("querySubscriptionProcessStatus, tradeOrderId:");
        sbLIZ.append(str);
        sbLIZ.append(", expireQueryTime:");
        sbLIZ.append(j);
        sbLIZ.append(", queryInterval:");
        sbLIZ.append(i);
        sbLIZ.append(", queryCount:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        String str4 = "";
        if (System.currentTimeMillis() > j) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("querySubscriptionProcessStatus timeout, expireQueryTime:");
            sbLIZ2.append(j);
            sbLIZ2.append(", queryInterval:");
            sbLIZ2.append(i);
            sbLIZ2.append(", queryCount:");
            sbLIZ2.append(i2);
            C2188811AlT.LIZIZ(sbLIZ2);
            C786410Ut5.LJIIJ(this.LJI);
            MinisSubscriptionFragment minisSubscriptionFragment = this.LJIIIIZZ;
            if (minisSubscriptionFragment != null) {
                minisSubscriptionFragment.SR();
            }
            C1232850iBf c1232850iBf = C2197731Azr.LJJIIZI;
            String strLIZJ = LIZJ();
            if (C123100dR.LIZ(str3)) {
                strLIZJ = str3;
            }
            long jLIZ = this.LJ.LIZ("get_iap_product_start");
            C2197491AzT c2197491AzT = this.LJ;
            c2197491AzT.LJIILJJIL = i2;
            c2197491AzT.LJIILL = jLIZ;
            int i4 = c1232850iBf.LIZ;
            String str5 = c1232850iBf.LIZIZ;
            if (str5 != null) {
                str4 = str5;
            }
            C2197491AzT.LIZIZ(c2197491AzT, "recharge_query_order_timeout", i4, str4, c2197491AzT.LIZ("recharge_query_order_start"), i2, jLIZ, null, null, null, null, false, c1232850iBf.LIZJ, c1232850iBf.LIZLLL, c1232850iBf, 1984);
            this.LIZLLL.LIZIZ(new C2195941Awy(EnumC2197771Azv.SERVER_QUERY_ORDER_TIMEOUT, new C2195931Awx(c1232850iBf.LIZ, null, strLIZJ, EnumC2197781Azw.SERVER, 2), c1232850iBf, 4));
            LIZ(false);
            return;
        }
        TiktokMinisSubscriptionQueryRequest tiktokMinisSubscriptionQueryRequest = new TiktokMinisSubscriptionQueryRequest(str, this.LJ.LIZJ, this.LIZJ.LIZ);
        C1232790iBZ c1232790iBZ = this.LJII;
        InterfaceC1233030iBx interfaceC1233030iBx = new InterfaceC1233030iBx() { // from class: X.1Azf
            /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r4
              0x003a: PHI (r4v1 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v7 java.lang.Integer), (r4v7 java.lang.Integer), (r4v7 java.lang.Integer) binds: [B:35:0x0111, B:10:0x0030, B:12:0x0034, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
            @Override // X.InterfaceC1233030iBx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(boolean r23, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse r24) {
                /*
                    Method dump skipped, instruction units count: 334
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2197611Azf.LIZ(boolean, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse):void");
            }
        };
        c1232790iBZ.getClass();
        String str6 = tiktokMinisSubscriptionQueryRequest.tradeOrderId;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = tiktokMinisSubscriptionQueryRequest.flowId;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = tiktokMinisSubscriptionQueryRequest.trackingId;
        if (str8 != null) {
            str4 = str8;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new MinisPaymentNetworkResponse(null, -1);
        AbstractC19484711Kz.LJIJJ(c1232790iBZ.LIZ.querySubscriptionPayResult(str6, str7, str4)).LJIIZILJ(new AkS326S0200000_19(c1232790iBZ, c259800zU, 10)).LJJI(new InterfaceC1487280oo2() { // from class: X.01T4
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String string;
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("createSubscription, error occurred, cause:");
                Throwable cause = th.getCause();
                if (cause != null) {
                    string = cause.toString();
                } else {
                    string = null;
                }
                sbLIZ3.append(string);
                C2188811AlT.LIZIZ(sbLIZ3);
                return AbstractC19484711Kz.LJIILLIIL(th);
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(interfaceC1233030iBx, 10));
    }

    public final void LJIIIIZZ(final Activity activity, final EnumC19366410pi enumC19366410pi, final String str, final String str2, final String str3, final String str4, final String str5, String str6) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRechargePayment, flow:");
        sbLIZ.append(enumC19366410pi);
        sbLIZ.append(", clientKey:");
        sbLIZ.append(str);
        sbLIZ.append(", tradeOrderId:");
        sbLIZ.append(str2);
        sbLIZ.append(", skuId:");
        sbLIZ.append(str3);
        sbLIZ.append(", basePlanId:");
        sbLIZ.append(str4);
        sbLIZ.append(", merchantId:");
        sbLIZ.append(str6);
        C2188811AlT.LIZIZ(sbLIZ);
        C2197491AzT.LIZIZ(this.LJ, "get_iap_product_start", 0, null, 0L, 0, 0L, null, null, null, null, true, null, null, null, 15356);
        C1617170sBX c1617170sBX = new C1617170sBX(str6, "subs", 2);
        c1617170sBX.LIZIZ = Collections.singletonList(str3);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) != null) {
            interfaceC1791930wjPLLFZ.LIZ(c1617170sBX, new InterfaceC1791300wiO() { // from class: X.1Aza
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                /* JADX WARN: Removed duplicated region for block: B:137:0x0348 A[PHI: r2
                  0x0348: PHI (r2v50 java.lang.String) = (r2v42 java.lang.String), (r2v51 java.lang.String) binds: [B:136:0x0346, B:134:0x0342] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:139:0x034c A[PHI: r2
                  0x034c: PHI (r2v49 java.lang.String) = (r2v42 java.lang.String), (r2v50 java.lang.String) binds: [B:136:0x0346, B:138:0x034a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:141:0x0350 A[PHI: r1 r2
                  0x0350: PHI (r1v2 java.lang.String) = (r1v11 java.lang.String), (r1v12 java.lang.String) binds: [B:140:0x034e, B:138:0x034a] A[DONT_GENERATE, DONT_INLINE]
                  0x0350: PHI (r2v43 java.lang.String) = (r2v49 java.lang.String), (r2v50 java.lang.String) binds: [B:140:0x034e, B:138:0x034a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:143:0x0354 A[PHI: r1 r2
                  0x0354: PHI (r1v10 java.lang.String) = (r1v2 java.lang.String), (r1v11 java.lang.String) binds: [B:142:0x0352, B:140:0x034e] A[DONT_GENERATE, DONT_INLINE]
                  0x0354: PHI (r2v48 java.lang.String) = (r2v43 java.lang.String), (r2v49 java.lang.String) binds: [B:142:0x0352, B:140:0x034e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:145:0x0358 A[PHI: r0 r1 r2
                  0x0358: PHI (r0v28 java.lang.String) = (r0v20 java.lang.String), (r0v29 java.lang.String) binds: [B:142:0x0352, B:144:0x0356] A[DONT_GENERATE, DONT_INLINE]
                  0x0358: PHI (r1v9 java.lang.String) = (r1v2 java.lang.String), (r1v10 java.lang.String) binds: [B:142:0x0352, B:144:0x0356] A[DONT_GENERATE, DONT_INLINE]
                  0x0358: PHI (r2v47 java.lang.String) = (r2v43 java.lang.String), (r2v48 java.lang.String) binds: [B:142:0x0352, B:144:0x0356] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r1v1, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
                /* JADX WARN: Type inference failed for: r7v17, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
                /* JADX WARN: Type inference failed for: r9v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
                @Override // X.InterfaceC1791300wiO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZLLL(final X.C518150KTt r56) {
                    /*
                        Method dump skipped, instruction units count: 1177
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2197561Aza.LIZLLL(X.0KTt):void");
                }
            });
        }
    }
}
