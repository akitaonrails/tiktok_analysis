package X;

import Y.AfS203S0100000_34;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.payment.MinisCreateOrderResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisQueryOrderResponse;
import com.ss.android.ugc.aweme.minis.model.payment.TradeOrderStatus;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import com.ss.android.ugc.aweme.minis.payment.data.MinisRechargeSheetParams;
import com.ss.android.ugc.aweme.minis.request.payment.MinisCreateOrderRequest;
import com.ss.android.ugc.aweme.minis.request.payment.MinisPaymentApi;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1AzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2197471AzR implements InterfaceC2195471AwD {
    public final Context LIZ;
    public final C2197361AzG LIZIZ;
    public final C1B09 LIZJ;
    public MinisRechargeFragment LIZLLL;
    public final DialogC1389620mGW LJ;
    public final C11NJ LJFF;
    public String LJI;
    public boolean LJII;
    public volatile boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final C2197481AzS LJIIJ;
    public final List<String> LJIIJJI;
    public int LJIIL;

    public final String LIZJ() {
        return this.LIZ.getString(2131822208);
    }

    public void LJFF() {
        C1232850iBf c1232850iBf = C2197731Azr.LIZJ;
        C2197481AzS c2197481AzS = this.LJIIJ;
        int i = c1232850iBf.LIZ;
        String str = c1232850iBf.LIZIZ;
        if (str == null) {
            str = "";
        }
        C2197481AzS.LIZJ(c2197481AzS, "minis_recharge_jsb_result_success", i, str, c2197481AzS.LIZ("check_env_start"), 0, 0L, 0L, null, null, 0, null, null, false, c1232850iBf.LIZJ, c1232850iBf.LIZLLL, null, 40944);
        C2197481AzS c2197481AzS2 = this.LJIIJ;
        C2197681Azm.LJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, c2197481AzS2.LJFF, c2197481AzS2.LJ, c2197481AzS2.LIZJ);
    }

    public final void LJII() {
        this.LJFF.dispose();
    }

    public void LJIIIIZZ() {
        C2197481AzS.LIZJ(this.LJIIJ, "get_tier_info_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
    }

    public String LIZLLL() {
        return "minis_recharge_flow";
    }

    public void LIZ(String str) {
        C786410Ut5.LJIIJ(this.LJ);
        MinisRechargeFragment minisRechargeFragment = this.LIZLLL;
        if (minisRechargeFragment != null) {
            minisRechargeFragment.SR();
        }
        C1B09 c1b09 = this.LIZJ;
        C2195941Awy c2195941Awy = new C2195941Awy(EnumC2197771Azv.SUCCESS_RECHARGE, null, null, 14);
        c2195941Awy.LIZJ.put("trade_order_id", str);
        c2195941Awy.LIZJ.put("tier_id", this.LJI);
        c1b09.LIZIZ(c2195941Awy);
        LIZIZ(false);
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            MinisRechargeFragment minisRechargeFragment = this.LIZLLL;
            if (minisRechargeFragment != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(minisRechargeFragment, C343970De7.LIZ);
                return;
            }
            return;
        }
        MinisRechargeFragment minisRechargeFragment2 = this.LIZLLL;
        if (minisRechargeFragment2 == null) {
            return;
        }
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(minisRechargeFragment2, new C343950De5());
    }

    public void LJI(String str) {
        int i;
        int i2;
        C2197481AzS c2197481AzS = this.LJIIJ;
        long jLIZ = c2197481AzS.LIZ("show_recharge_sheet");
        MinisRechargeFragment minisRechargeFragment = this.LIZLLL;
        if (minisRechargeFragment != null && minisRechargeFragment.iS()) {
            i = 1;
        } else {
            i = 0;
        }
        C2197481AzS.LIZJ(c2197481AzS, "dismiss_recharge_sheet", 0, null, jLIZ, 0, 0L, 0L, str, null, i, null, null, false, null, null, null, 64886);
        C2197481AzS c2197481AzS2 = this.LJIIJ;
        MinisRechargeFragment minisRechargeFragment2 = this.LIZLLL;
        if (minisRechargeFragment2 != null && minisRechargeFragment2.iS()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C2197481AzS.LIZIZ(c2197481AzS2, "tm_recharge_panel_exit", this.LJIIJ.LIZ("show_recharge_sheet"), i2, str, null, null, 48);
    }

    public final void LJIIIZ(final C11JN c11jn) {
        C2197481AzS.LIZJ(this.LJIIJ, "check_env_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
        InterfaceC1791820wjE interfaceC1791820wjE = new InterfaceC1791820wjE() { // from class: X.1Azi
            @Override // X.InterfaceC1791820wjE
            public final void LIZ(C1791770wj9 c1791770wj9) {
                int i;
                String str;
                EnumC1792020wjY enumC1792020wjY;
                String str2;
                EnumC1792020wjY enumC1792020wjY2;
                String str3;
                EnumC1792020wjY enumC1792020wjY3;
                String str4;
                EnumC1792020wjY enumC1792020wjY4;
                EnumC1792020wjY enumC1792020wjY5;
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preCheckEnvAndRunFlow, onPreCheckFinished error:");
                sbLIZ.append(c1791770wj9.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c1791770wj9.LIZ) {
                    C2197481AzS c2197481AzS = this.LIZ.LJIIJ;
                    C2197481AzS.LIZJ(c2197481AzS, "check_env_success", 0, null, c2197481AzS.LIZ("check_env_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
                    this.LIZ.LJIIIIZZ();
                    this.LIZ.LJFF.LIZ(c11jn.LJJLJ());
                    return;
                }
                C0KQW c0kqw = c1791770wj9.LIZIZ;
                Integer numValueOf = null;
                if (c0kqw != null && (enumC1792020wjY5 = c0kqw.LIZ) != null) {
                    i = C1792090wjf.LIZ[enumC1792020wjY5.ordinal()];
                } else {
                    i = -1;
                }
                String str5 = "";
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C1232850iBf c1232850iBf = C2197731Azr.LJIILLIIL;
                            C0KQW c0kqw2 = c1791770wj9.LIZIZ;
                            if (c0kqw2 != null && (enumC1792020wjY4 = c0kqw2.LIZ) != null) {
                                numValueOf = Integer.valueOf(enumC1792020wjY4.getValue());
                            }
                            c1232850iBf.LIZJ = numValueOf;
                            C0KQW c0kqw3 = c1791770wj9.LIZIZ;
                            if (c0kqw3 == null || (str4 = c0kqw3.LIZIZ) == null) {
                                str4 = "";
                            }
                            c1232850iBf.LIZLLL = str4;
                            C2197481AzS c2197481AzS2 = this.LIZ.LJIIJ;
                            int i3 = c1232850iBf.LIZ;
                            String str6 = c1232850iBf.LIZIZ;
                            if (str6 != null) {
                                str5 = str6;
                            }
                            C2197481AzS.LIZJ(c2197481AzS2, "check_env_fail", i3, str5, c2197481AzS2.LIZ("check_env_start"), 0, 0L, 0L, null, null, 0, "IAP", null, false, numValueOf, str4, c1232850iBf, 7152);
                            C2197471AzR c2197471AzR = this.LIZ;
                            C1B09 c1b09 = c2197471AzR.LIZJ;
                            EnumC2197771Azv enumC2197771Azv = EnumC2197771Azv.IAP_ENV_CHECK_FAIL;
                            int i4 = c1232850iBf.LIZ;
                            String strLIZJ = c1232850iBf.LJ;
                            if (strLIZJ == null) {
                                strLIZJ = c2197471AzR.LIZJ();
                            }
                            c1b09.LIZIZ(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i4, null, strLIZJ, EnumC2197781Azw.IAP, 2), c1232850iBf, 4));
                            C786410Ut5.LJIIJ(this.LIZ.LJ);
                            return;
                        }
                        C1232850iBf c1232850iBf2 = C2197731Azr.LJIILIIL;
                        C0KQW c0kqw4 = c1791770wj9.LIZIZ;
                        if (c0kqw4 != null && (enumC1792020wjY3 = c0kqw4.LIZ) != null) {
                            numValueOf = Integer.valueOf(enumC1792020wjY3.getValue());
                        }
                        c1232850iBf2.LIZJ = numValueOf;
                        C0KQW c0kqw5 = c1791770wj9.LIZIZ;
                        if (c0kqw5 == null || (str3 = c0kqw5.LIZIZ) == null) {
                            str3 = "";
                        }
                        c1232850iBf2.LIZLLL = str3;
                        C2197481AzS c2197481AzS3 = this.LIZ.LJIIJ;
                        int i5 = c1232850iBf2.LIZ;
                        String str7 = c1232850iBf2.LIZIZ;
                        if (str7 != null) {
                            str5 = str7;
                        }
                        C2197481AzS.LIZJ(c2197481AzS3, "check_env_fail", i5, str5, c2197481AzS3.LIZ("check_env_start"), 0, 0L, 0L, null, null, 0, "IAP", null, false, numValueOf, str3, c1232850iBf2, 7152);
                        C2197471AzR c2197471AzR2 = this.LIZ;
                        C1B09 c1b092 = c2197471AzR2.LIZJ;
                        EnumC2197771Azv enumC2197771Azv2 = EnumC2197771Azv.IAP_ENV_CHECK_FAIL;
                        int i6 = c1232850iBf2.LIZ;
                        String strLIZJ2 = c1232850iBf2.LJ;
                        if (strLIZJ2 == null) {
                            strLIZJ2 = c2197471AzR2.LIZJ();
                        }
                        c1b092.LIZIZ(new C2195941Awy(enumC2197771Azv2, new C2195931Awx(i6, null, strLIZJ2, EnumC2197781Azw.IAP, 2), c1232850iBf2, 4));
                        C786410Ut5.LJIIJ(this.LIZ.LJ);
                        return;
                    }
                    C1232850iBf c1232850iBf3 = C2197731Azr.LJIILL;
                    C0KQW c0kqw6 = c1791770wj9.LIZIZ;
                    if (c0kqw6 != null && (enumC1792020wjY2 = c0kqw6.LIZ) != null) {
                        numValueOf = Integer.valueOf(enumC1792020wjY2.getValue());
                    }
                    c1232850iBf3.LIZJ = numValueOf;
                    C0KQW c0kqw7 = c1791770wj9.LIZIZ;
                    if (c0kqw7 == null || (str2 = c0kqw7.LIZIZ) == null) {
                        str2 = "";
                    }
                    c1232850iBf3.LIZLLL = str2;
                    C2197481AzS c2197481AzS4 = this.LIZ.LJIIJ;
                    int i7 = c1232850iBf3.LIZ;
                    String str8 = c1232850iBf3.LIZIZ;
                    if (str8 != null) {
                        str5 = str8;
                    }
                    C2197481AzS.LIZJ(c2197481AzS4, "check_env_fail", i7, str5, c2197481AzS4.LIZ("check_env_start"), 0, 0L, 0L, null, null, 0, "IAP", null, false, numValueOf, str2, c1232850iBf3, 7152);
                    C2197471AzR c2197471AzR3 = this.LIZ;
                    C1B09 c1b093 = c2197471AzR3.LIZJ;
                    EnumC2197771Azv enumC2197771Azv3 = EnumC2197771Azv.IAP_ENV_CHECK_FAIL;
                    int i8 = c1232850iBf3.LIZ;
                    String strLIZJ3 = c1232850iBf3.LJ;
                    if (strLIZJ3 == null) {
                        strLIZJ3 = c2197471AzR3.LIZJ();
                    }
                    c1b093.LIZIZ(new C2195941Awy(enumC2197771Azv3, new C2195931Awx(i8, null, strLIZJ3, EnumC2197781Azw.IAP, 2), c1232850iBf3, 4));
                    C786410Ut5.LJIIJ(this.LIZ.LJ);
                    return;
                }
                C1232850iBf c1232850iBf4 = C2197731Azr.LJIILJJIL;
                C0KQW c0kqw8 = c1791770wj9.LIZIZ;
                if (c0kqw8 != null && (enumC1792020wjY = c0kqw8.LIZ) != null) {
                    numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                }
                c1232850iBf4.LIZJ = numValueOf;
                C0KQW c0kqw9 = c1791770wj9.LIZIZ;
                if (c0kqw9 == null || (str = c0kqw9.LIZIZ) == null) {
                    str = "";
                }
                c1232850iBf4.LIZLLL = str;
                C2197481AzS c2197481AzS5 = this.LIZ.LJIIJ;
                int i9 = c1232850iBf4.LIZ;
                String str9 = c1232850iBf4.LIZIZ;
                if (str9 != null) {
                    str5 = str9;
                }
                C2197481AzS.LIZJ(c2197481AzS5, "check_env_fail", i9, str5, c2197481AzS5.LIZ("check_env_start"), 0, 0L, 0L, null, null, 0, "IAP", null, false, numValueOf, str, c1232850iBf4, 7152);
                C2197471AzR c2197471AzR4 = this.LIZ;
                C1B09 c1b094 = c2197471AzR4.LIZJ;
                EnumC2197771Azv enumC2197771Azv4 = EnumC2197771Azv.IAP_ENV_CHECK_FAIL;
                int i10 = c1232850iBf4.LIZ;
                String strLIZJ4 = c1232850iBf4.LJ;
                if (strLIZJ4 == null) {
                    strLIZJ4 = c2197471AzR4.LIZJ();
                }
                c1b094.LIZIZ(new C2195941Awy(enumC2197771Azv4, new C2195931Awx(i10, null, strLIZJ4, EnumC2197781Azw.IAP, 2), c1232850iBf4, 4));
                C786410Ut5.LJIIJ(this.LIZ.LJ);
            }
        };
        C786410Ut5.J4(this.LJ);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ().LJIIIIZZ(this.LIZ, interfaceC1791820wjE, this.LJIIIZ);
    }

    public final void LJIIJ(String str) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        C1617170sBX c1617170sBX = new C1617170sBX(this.LJIIIZ, (String) null, 6);
        c1617170sBX.LIZIZ = Collections.singletonList(str);
        C2197481AzS.LIZJ(this.LJIIJ, "preload_iap_product_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) != null) {
            interfaceC1791930wjPLLFZ.LIZ(c1617170sBX, new InterfaceC1791300wiO() { // from class: X.1Azs
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    Integer numValueOf;
                    String str2;
                    String str3;
                    EnumC1792020wjY enumC1792020wjY;
                    if (c518150KTt.LIZ) {
                        C2197481AzS c2197481AzS = this.LIZ.LJIIJ;
                        C2197481AzS.LIZJ(c2197481AzS, "preload_iap_product_success", 0, null, c2197481AzS.LIZ("preload_iap_product_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LIZ("minis-MinisRechargeBeanTask", "preloadIapProduct, getIapProductDetails, IAP prepare product success");
                        return;
                    }
                    C1232850iBf c1232850iBf = C2197731Azr.LJJIIZ;
                    C0KQW c0kqw = c518150KTt.LIZJ;
                    if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
                        numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                    } else {
                        numValueOf = null;
                    }
                    c1232850iBf.LIZJ = numValueOf;
                    C0KQW c0kqw2 = c518150KTt.LIZJ;
                    String str4 = "";
                    if (c0kqw2 == null || (str2 = c0kqw2.LIZIZ) == null) {
                        str2 = "";
                    }
                    c1232850iBf.LIZLLL = str2;
                    C2197481AzS c2197481AzS2 = this.LIZ.LJIIJ;
                    long jLIZ = c2197481AzS2.LIZ("preload_iap_product_start");
                    C0KQW c0kqw3 = c518150KTt.LIZJ;
                    if (c0kqw3 == null || (str3 = c0kqw3.LIZIZ) == null) {
                        str3 = "";
                    }
                    int i2 = c1232850iBf.LIZ;
                    String str5 = c1232850iBf.LIZIZ;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    C2197481AzS.LIZJ(c2197481AzS2, "preload_iap_product_fail", i2, str4, jLIZ, 0, 0L, 0L, null, null, 0, "IAP", str3, false, c1232850iBf.LIZJ, c1232850iBf.LIZLLL, c1232850iBf, 5104);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preloadIapProduct, getIapProductDetails, IAP prepare product failed, ");
                    sbLIZ.append(c518150KTt.LIZJ);
                    C1720106oR.LIZ("minis-MinisRechargeBeanTask", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }

    public final void LJIILIIL(String str) {
        System.currentTimeMillis();
        C2197481AzS.LIZJ(this.LJIIJ, "recharge_query_order_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
        LJIIJJI(System.currentTimeMillis(), str);
    }

    public final void LJIILL(String str) {
        String string;
        this.LJI = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = this.LJIIJ.LIZJ;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZ = C2197681Azm.LIZ(null, null, str2);
        C1232850iBf c1232850iBf = C2197731Azr.LIZ;
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        String strValueOf = String.valueOf(c1232850iBf.LIZ);
        Integer num = c1232850iBf.LIZJ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(strLIZ, "minis_recharge_jsb_start", strValueOf, string, null, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisRechargeJsbStart, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2197411AzL(this, str, jCurrentTimeMillis, null), 3);
    }

    public final void LJIILLIIL(C2195941Awy c2195941Awy) {
        C1232850iBf c1232850iBf;
        String string;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncClickResultIfNecessary, isNeedReportClickResult:");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", errorCodeScene:");
        sbLIZ.append(c2195941Awy.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = false;
        EnumC2197771Azv enumC2197771Azv = c2195941Awy.LIZ;
        if (enumC2197771Azv != EnumC2197771Azv.SUCCESS_RECHARGE && enumC2197771Azv != EnumC2197771Azv.SUCCESS_PAY) {
            c1232850iBf = c2195941Awy.LIZLLL;
        } else {
            c1232850iBf = C2197731Azr.LIZJ;
        }
        if (c1232850iBf != null) {
            String string2 = null;
            if (Intrinsics.LJFF(LIZLLL(), "minis_recharge_flow")) {
                C2197481AzS c2197481AzS = this.LJIIJ;
                String str = c2197481AzS.LJFF;
                String str2 = c2197481AzS.LJ;
                String str3 = c2197481AzS.LIZJ;
                EnumC2197791Azx enumC2197791Azx = EnumC2197791Azx.IAP;
                String strLIZ = C2195221Avo.LIZ();
                Map mapLIZIZ = C2197681Azm.LIZIZ(enumC2197791Azx, EnumC21159117rB.PAYING);
                Map mapLIZ = C2197681Azm.LIZ(str, str2, str3);
                C1232830iBd c1232830iBd = C1232830iBd.LIZ;
                String strValueOf = String.valueOf(c1232850iBf.LIZ);
                Integer num = c1232850iBf.LIZJ;
                if (num != null) {
                    string = num.toString();
                } else {
                    string = null;
                }
                EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
                EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
                EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
                c1232830iBd.getClass();
                C1232830iBd.LIZ(strLIZ, "minis_recharge_jsb_result", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onMinisRechargeAfterConfirmClickResult, errorCodeScene:");
                sbLIZ2.append(c1232850iBf);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (Intrinsics.LJFF(LIZLLL(), "minis_pay_flow")) {
                C2197481AzS c2197481AzS2 = this.LJIIJ;
                String str4 = c2197481AzS2.LJFF;
                String str5 = c2197481AzS2.LJ;
                String str6 = c2197481AzS2.LIZJ;
                EnumC2197791Azx enumC2197791Azx2 = EnumC2197791Azx.IAP;
                String strLIZ2 = C2195221Avo.LIZ();
                Map mapLIZIZ2 = C2197681Azm.LIZIZ(enumC2197791Azx2, EnumC21159117rB.PAYING);
                Map mapLIZ2 = C2197681Azm.LIZ(str4, str5, str6);
                C1232830iBd c1232830iBd2 = C1232830iBd.LIZ;
                String strValueOf2 = String.valueOf(c1232850iBf.LIZ);
                Integer num2 = c1232850iBf.LIZJ;
                if (num2 != null) {
                    string2 = num2.toString();
                }
                EnumC1236600iHi enumC1236600iHi2 = c1232850iBf.LJFF;
                EnumC21632119lH enumC21632119lH2 = c1232850iBf.LJI;
                EnumC19415410xc enumC19415410xc2 = c1232850iBf.LJII;
                c1232830iBd2.getClass();
                C1232830iBd.LIZ(strLIZ2, "minis_pay_jsb_result", strValueOf2, string2, mapLIZIZ2, mapLIZ2, enumC1236600iHi2, enumC21632119lH2, enumC19415410xc2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onMinisPayAfterConfirmClickResult, errorCodeScene:");
                sbLIZ3.append(c1232850iBf);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }

    public final void LJIIJJI(final long j, final String str) {
        C11NZ<MinisQueryOrderResponse> c11nzQueryOrder;
        MinisPaymentApi.PaymentApi paymentApiLIZIZ;
        if (System.currentTimeMillis() - j < C1841280y10.LIZ().maxQueryTime) {
            this.LJIIL++;
            String str2 = this.LJIIJ.LIZJ;
            String str3 = this.LIZIZ.LIZ;
            try {
                paymentApiLIZIZ = C0TAU.LIZIZ();
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC2126608Uu.getCompatibleException(e);
            }
            if (paymentApiLIZIZ != null) {
                c11nzQueryOrder = paymentApiLIZIZ.queryOrder(str, str2, str3);
            } else {
                c11nzQueryOrder = C11IR.LL;
            }
            this.LJFF.LIZ(c11nzQueryOrder.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.1Azu
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MinisRechargeBeanTask@c3fd.queryOrder$1");
                    if (((MinisQueryOrderResponse) obj).tradeOrderInfo.tradeOrderStatus == TradeOrderStatus.MINIS_TRADE_ORDER_STATUS_SUCCESS) {
                        C2197481AzS c2197481AzS = this.LL.LJIIJ;
                        long jLIZ = c2197481AzS.LIZ("recharge_query_order_start");
                        C2197471AzR c2197471AzR = this.LL;
                        C2197481AzS.LIZJ(c2197481AzS, "recharge_query_order_success", 0, null, jLIZ, c2197471AzR.LJIIL, c2197471AzR.LJIIJ.LIZ("get_iap_product_start"), 0L, null, null, 0, null, null, false, null, null, null, 65478);
                        this.LL.LIZ(str);
                    } else {
                        C2197471AzR c2197471AzR2 = this.LL;
                        String str4 = str;
                        long j2 = j;
                        c2197471AzR2.getClass();
                        C786410Ut5.LJLIIL(C1841280y10.LIZ().queryInterval, new BPEAHandler(Looper.getMainLooper()), new RunnableC1842010y2B(c2197471AzR2, str4, j2));
                    }
                    C1C7U.LIZIZ("MinisRechargeBeanTask@c3fd.queryOrder$1");
                }
            }, new C09JN() { // from class: X.0y2A
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MinisRechargeBeanTask@c3fd.queryOrder$2");
                    C2197471AzR c2197471AzR = this.LL;
                    String str4 = str;
                    long j2 = j;
                    c2197471AzR.getClass();
                    C786410Ut5.LJLIIL(C1841280y10.LIZ().queryInterval, new BPEAHandler(Looper.getMainLooper()), new RunnableC1842010y2B(c2197471AzR, str4, j2));
                    C1C7U.LIZIZ("MinisRechargeBeanTask@c3fd.queryOrder$2");
                }
            }));
            return;
        }
        C1232850iBf c1232850iBf = C2197731Azr.LJJIIZI;
        C2197481AzS c2197481AzS = this.LJIIJ;
        long jLIZ = c2197481AzS.LIZ("recharge_query_order_start");
        int i = this.LJIIL;
        int i2 = c1232850iBf.LIZ;
        String str4 = c1232850iBf.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        C2197481AzS.LIZJ(c2197481AzS, "recharge_query_order_timeout", i2, str4, jLIZ, i, this.LJIIJ.LIZ("get_iap_product_start"), 0L, null, null, 0, null, null, false, c1232850iBf.LIZJ, c1232850iBf.LIZLLL, c1232850iBf, 8128);
        C1B09 c1b09 = this.LIZJ;
        EnumC2197771Azv enumC2197771Azv = EnumC2197771Azv.SERVER_QUERY_ORDER_TIMEOUT;
        int i3 = c1232850iBf.LIZ;
        String strLIZJ = c1232850iBf.LJ;
        if (strLIZJ == null) {
            strLIZJ = LIZJ();
        }
        c1b09.LIZIZ(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i3, null, strLIZJ, EnumC2197781Azw.SERVER, 2), c1232850iBf, 4));
        C786410Ut5.LJIIJ(this.LJ);
        LIZIZ(false);
        LIZIZ(false);
        MinisRechargeFragment minisRechargeFragment = this.LIZLLL;
        if (minisRechargeFragment != null) {
            minisRechargeFragment.SR();
        }
    }

    public C2197471AzR(Context context, C2197361AzG c2197361AzG, C1B09 c1b09) {
        String str;
        this.LIZ = context;
        this.LIZIZ = c2197361AzG;
        this.LIZJ = c1b09;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.setCanceledOnTouchOutside(false);
        dialogC1389620mGW.setCancelable(false);
        this.LJ = dialogC1389620mGW;
        this.LJFF = new C11NJ();
        this.LJI = "";
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        this.LJIIIZ = (minisMetaResp == null || (str = minisMetaResp.merchantId) == null) ? "80M5HX6P1501" : str;
        C2197481AzS c2197481AzS = new C2197481AzS();
        c2197481AzS.LIZLLL = LIZLLL();
        c2197481AzS.LJII = c2197361AzG;
        c2197481AzS.LJIIZILJ = c2197361AzG.LIZIZ;
        this.LJIIJ = c2197481AzS;
        this.LJIIJJI = C1697810uHb.LJIIJJI("content_name", "minis_id", "creative_id", "enter_from", "req_id", "minis_drama_collection_id", "minis_short_drama_inner_feed_episode_num_uid", "video_id", "gip_task_id", "gip_task_name", "video_creator_id");
    }

    public void LJ(int i, String str, C1232850iBf c1232850iBf) {
        Integer num;
        String str2 = str;
        C2197481AzS c2197481AzS = this.LJIIJ;
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
        C2197481AzS.LIZJ(c2197481AzS, "minis_recharge_jsb_result_fail", i, str2, c2197481AzS.LIZ("check_env_start"), 0, 0L, 0L, null, this.LJIIJ.LIZIZ, 0, null, null, false, num, str3, c1232850iBf, 7920);
        if (c1232850iBf != null) {
            C2197481AzS c2197481AzS2 = this.LJIIJ;
            C2197681Azm.LJ(c1232850iBf, EnumC2197791Azx.IAP, EnumC21159117rB.END, c2197481AzS2.LJFF, c2197481AzS2.LJ, c2197481AzS2.LIZJ);
        }
    }

    public final void LJIILJJIL(final String str, final String str2, final String str3) {
        EnumC1841270y0z enumC1841270y0z;
        boolean z;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        MinisRechargeFragment minisRechargeFragment = this.LIZLLL;
        if (minisRechargeFragment != null) {
            enumC1841270y0z = minisRechargeFragment.LLJL;
        } else {
            enumC1841270y0z = null;
        }
        if (enumC1841270y0z == EnumC1841270y0z.WEB) {
            z = true;
        } else {
            z = false;
        }
        C2197481AzS c2197481AzS = this.LJIIJ;
        c2197481AzS.LJI = z;
        C2197481AzS.LIZJ(c2197481AzS, "get_iap_product_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
        System.currentTimeMillis();
        C1617170sBX c1617170sBX = new C1617170sBX(this.LJIIIZ, (String) null, 6);
        c1617170sBX.LIZIZ = Collections.singletonList(str2);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) != null) {
            final boolean z2 = z;
            interfaceC1791930wjPLLFZ.LIZ(c1617170sBX, new InterfaceC1791300wiO() { // from class: X.1AzW
                @Override // X.InterfaceC1791300wiO
                public final void LJ(C0KSV c0ksv) {
                }

                @Override // X.InterfaceC1791300wiO
                public final void LIZLLL(C518150KTt c518150KTt) {
                    String str4;
                    String billingCountryCode;
                    C11NZ<MinisCreateOrderResponse> c11nzCreateOrder;
                    MinisPaymentApi.PaymentApi paymentApiLIZIZ;
                    InterfaceC20673515v3 interfaceC20673515v3K42;
                    InterfaceC1791930wjP interfaceC1791930wjPLLFZ2;
                    IapProductDetail iapProductDetail;
                    Integer numValueOf;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    EnumC1792020wjY enumC1792020wjY;
                    String str9 = "";
                    String str10 = null;
                    if (!c518150KTt.LIZ) {
                        C1232850iBf c1232850iBf = C2197731Azr.LJJIIZ;
                        C0KQW c0kqw = c518150KTt.LIZJ;
                        if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
                            numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                        } else {
                            numValueOf = null;
                        }
                        c1232850iBf.LIZJ = numValueOf;
                        C0KQW c0kqw2 = c518150KTt.LIZJ;
                        if (c0kqw2 == null || (str5 = c0kqw2.LIZIZ) == null) {
                            str5 = "";
                        }
                        c1232850iBf.LIZLLL = str5;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c1232850iBf.LIZIZ);
                        C0KQW c0kqw3 = c518150KTt.LIZJ;
                        if (c0kqw3 == null || (str6 = c0kqw3.LIZIZ) == null) {
                            str6 = "";
                        }
                        sbLIZ.append(str6);
                        c1232850iBf.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C2197481AzS c2197481AzS2 = this.LIZ.LJIIJ;
                        long jLIZ = c2197481AzS2.LIZ("get_iap_product_start");
                        C0KQW c0kqw4 = c518150KTt.LIZJ;
                        if (c0kqw4 == null || (str7 = c0kqw4.LIZIZ) == null) {
                            str7 = "";
                        }
                        int i = c1232850iBf.LIZ;
                        String str11 = c1232850iBf.LIZIZ;
                        if (str11 != null) {
                            str9 = str11;
                        }
                        C2197481AzS.LIZJ(c2197481AzS2, "get_iap_product_fail", i, str9, jLIZ, 0, 0L, 0L, null, null, 0, "IAP", str7, false, c1232850iBf.LIZJ, c1232850iBf.LIZLLL, c1232850iBf, 5104);
                        C2197471AzR c2197471AzR = this.LIZ;
                        C1B09 c1b09 = c2197471AzR.LIZJ;
                        EnumC2197771Azv enumC2197771Azv = EnumC2197771Azv.IAP_GET_PRODUCT_FAIL;
                        int i2 = c1232850iBf.LIZ;
                        String strLIZJ = c1232850iBf.LJ;
                        if (strLIZJ == null) {
                            strLIZJ = c2197471AzR.LIZJ();
                        }
                        C0KQW c0kqw5 = c518150KTt.LIZJ;
                        if (c0kqw5 != null) {
                            str8 = c0kqw5.LIZIZ;
                        } else {
                            str8 = null;
                        }
                        String strValueOf = String.valueOf(str8);
                        EnumC2197781Azw enumC2197781Azw = EnumC2197781Azw.IAP;
                        c1b09.LIZ(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i2, strValueOf, strLIZJ, enumC2197781Azw), c1232850iBf, 4));
                        C2197471AzR c2197471AzR2 = this.LIZ;
                        int i3 = c1232850iBf.LIZ;
                        String strLIZJ2 = c1232850iBf.LJ;
                        if (strLIZJ2 == null) {
                            strLIZJ2 = c2197471AzR2.LIZJ();
                        }
                        C0KQW c0kqw6 = c518150KTt.LIZJ;
                        if (c0kqw6 != null) {
                            str10 = c0kqw6.LIZIZ;
                        }
                        c2197471AzR2.LJIILLIIL(new C2195941Awy(enumC2197771Azv, new C2195931Awx(i3, String.valueOf(str10), strLIZJ2, enumC2197781Azw), c1232850iBf, 4));
                        MinisRechargeFragment minisRechargeFragment2 = this.LIZ.LIZLLL;
                        if (minisRechargeFragment2 != null) {
                            minisRechargeFragment2.SR();
                        }
                        C786410Ut5.LJIIJ(this.LIZ.LJ);
                        int i4 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("startRechargePayment, getIapProductDetails, IAP prepare product onFailure, ");
                        sbLIZ2.append(c518150KTt.LIZJ);
                        C1720106oR.LIZ("minis-MinisRechargeBeanTask", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    C2197481AzS c2197481AzS3 = this.LIZ.LJIIJ;
                    Map map = null;
                    C2197481AzS.LIZJ(c2197481AzS3, "get_iap_product_success", 0, null, c2197481AzS3.LIZ("get_iap_product_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
                    C2197481AzS c2197481AzS4 = this.LIZ.LJIIJ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("country code :");
                    Map<String, IapProductDetail> map2 = c518150KTt.LIZIZ;
                    if (map2 != null && (iapProductDetail = map2.get(str2)) != null) {
                        str4 = iapProductDetail.countryCode;
                    } else {
                        str4 = null;
                    }
                    sbLIZ3.append(str4);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    if (strLIZIZ == null) {
                        strLIZIZ = "";
                    }
                    C2197481AzS.LIZJ(c2197481AzS4, "create_order_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, strLIZIZ, true, null, null, null, 59390);
                    System.currentTimeMillis();
                    ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                    if (iLiveOuterService2 == null || (interfaceC20673515v3K42 = iLiveOuterService2.k4()) == null || (interfaceC1791930wjPLLFZ2 = interfaceC20673515v3K42.LLFZ()) == null || (billingCountryCode = interfaceC1791930wjPLLFZ2.getBillingCountryCode()) == null) {
                        billingCountryCode = "";
                    }
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("startRechargeBeans, payRegion:");
                    sbLIZ4.append(billingCountryCode);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    String str12 = str;
                    String str13 = str3;
                    String strLIZIZ2 = this.LIZ.LIZIZ.LIZIZ();
                    String strLIZ = this.LIZ.LIZIZ.LIZ();
                    C2197471AzR c2197471AzR3 = this.LIZ;
                    String str14 = c2197471AzR3.LJIIJ.LIZJ;
                    String str15 = c2197471AzR3.LIZIZ.LIZ;
                    int iLJ = C204575153d.LJ();
                    if (z2) {
                        str9 = "web";
                    }
                    boolean zLIZIZ = C204575153d.LIZIZ();
                    Map mapLIZ = C0TAU.LIZ(this.LIZ.LIZIZ.LIZIZ);
                    try {
                        paymentApiLIZIZ = C0TAU.LIZIZ();
                    } catch (ExecutionException e) {
                        TryCatchGuardChecker.doCheck(e);
                        AbstractC2126608Uu.getCompatibleException(e);
                    }
                    if (paymentApiLIZIZ != null) {
                        if (!mapLIZ.isEmpty()) {
                            map = mapLIZ;
                        }
                        c11nzCreateOrder = paymentApiLIZIZ.createOrder(new MinisCreateOrderRequest(str12, str13, billingCountryCode, strLIZIZ2, strLIZ, str14, str15, iLJ, str9, zLIZIZ, map));
                    } else {
                        c11nzCreateOrder = C11IR.LL;
                    }
                    C11O8 c11o8LJJJLZIJ = c11nzCreateOrder.LJJL(new InterfaceC1487280oo2() { // from class: X.1Azy
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            return C11NZ.LJJIJLIJ((Throwable) obj);
                        }
                    }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                    final C2197471AzR c2197471AzR4 = this.LIZ;
                    final String str16 = str;
                    final boolean z3 = z2;
                    this.LIZ.LJFF.LIZ(c11o8LJJJLZIJ.LJJLL(new C09JN(str16, z3) { // from class: X.1AzX
                        public final /* synthetic */ boolean LLILLJJLI;

                        {
                            this.LLILLJJLI = z3;
                        }

                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            boolean z4;
                            C1C7U.LIZ("MinisRechargeBeanTask@c3fd.startRechargeBeans$1$onCallback$2");
                            MinisCreateOrderResponse minisCreateOrderResponse = (MinisCreateOrderResponse) obj;
                            C2197481AzS c2197481AzS5 = this.LL.LJIIJ;
                            c2197481AzS5.LJ = minisCreateOrderResponse.tradeOrderId;
                            C2197481AzS.LIZJ(c2197481AzS5, "create_order_success", 0, null, c2197481AzS5.LIZ("create_order_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
                            if (!minisCreateOrderResponse.isSandbox && !C204575153d.LIZIZ()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (C204575153d.LIZJ()) {
                                C2197011Ayh.LIZ.getClass();
                                if (!C2197011Ayh.LJ().optBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_IAP_MOCK", false) && !u.LJJIIJZLJL(this.LL.LIZIZ.LIZIZ(), "sb", false)) {
                                    z4 = false;
                                }
                            }
                            int i6 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("makePayment, isCanDebug:");
                            sbLIZ5.append(z4);
                            C2188811AlT.LIZIZ(sbLIZ5);
                            if (!z4) {
                                System.currentTimeMillis();
                                final C2197471AzR c2197471AzR5 = this.LL;
                                Activity activityLIZ = C1B06.LIZJ.LIZ(c2197471AzR5.LIZ);
                                final String str17 = minisCreateOrderResponse.iapPayLoad;
                                String str18 = minisCreateOrderResponse.webPayLoad;
                                final String str19 = minisCreateOrderResponse.tradeOrderId;
                                final AwS435S0200000_34 awS435S0200000_34 = new AwS435S0200000_34(this.LL, minisCreateOrderResponse, 6);
                                boolean z5 = this.LLILLJJLI;
                                C2197481AzS.LIZJ(c2197471AzR5.LJIIJ, "iap_pay_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, null, true, null, null, null, 61438);
                                final HashMap map3 = new HashMap();
                                HashMap<String, String> map4 = c2197471AzR5.LJIIJ.LJIIZILJ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry<String, String> entry : map4.entrySet()) {
                                    if (c2197471AzR5.LJIIJJI.contains(entry.getKey())) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                linkedHashMap.forEach(new BiConsumer() { // from class: X.07ep
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj2, Object obj3) {
                                        String strLIZIZ3 = (String) obj2;
                                        if (!a0.LJJIIZI(strLIZIZ3, "minis", false)) {
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append("minis_");
                                            sbLIZ6.append(strLIZIZ3);
                                            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                                        }
                                        map3.put(strLIZIZ3, obj3);
                                    }
                                });
                                if (z5) {
                                    if (str18 == null || str18.length() == 0) {
                                        C1232850iBf c1232850iBf2 = C2197731Azr.LJIJI;
                                        c2197471AzR5.LIZJ.LIZ(new C2195941Awy(EnumC2197771Azv.WEB_PAYLOAD_EMPTY, new C2195931Awx(c1232850iBf2.LIZ, String.valueOf(c2197471AzR5.LIZJ()), c2197471AzR5.LIZJ(), EnumC2197781Azw.IAP), c1232850iBf2, 4));
                                    }
                                    C1DFH c1dfh = C0PEM.LIZ;
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2197711Azp(activityLIZ, map3, str18, c2197471AzR5, awS435S0200000_34, str19, null), 3);
                                } else {
                                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ().LIZIZ(activityLIZ, new C1789970wgF(str17, map3), new InterfaceC518120KTq() { // from class: X.1Azq
                                        @Override // X.InterfaceC518120KTq
                                        public final void LIZ(C0KPG c0kpg) {
                                            Integer numValueOf2;
                                            String str20;
                                            EnumC1792020wjY enumC1792020wjY2;
                                            Integer numValueOf3;
                                            String str21;
                                            EnumC1792020wjY enumC1792020wjY3;
                                            Integer numValueOf4;
                                            String str22;
                                            String str23;
                                            EnumC1792020wjY enumC1792020wjY4;
                                            c2197471AzR5.getClass();
                                            int i7 = C0KQA.LIZ[c0kpg.LIZ.ordinal()];
                                            if (i7 != 1) {
                                                String str24 = null;
                                                String str25 = "";
                                                if (i7 != 2) {
                                                    if (i7 != 3) {
                                                        InterfaceC1791930wjP interfaceC1791930wjPLLFZ3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ();
                                                        C2197471AzR c2197471AzR6 = c2197471AzR5;
                                                        interfaceC1791930wjPLLFZ3.LJFF(c2197471AzR6.LIZ, c0kpg, c2197471AzR6.LJIIIZ, null);
                                                        C786410Ut5.LJIIJ(c2197471AzR5.LJ);
                                                        MinisRechargeFragment minisRechargeFragment3 = c2197471AzR5.LIZLLL;
                                                        if (minisRechargeFragment3 != null) {
                                                            minisRechargeFragment3.SR();
                                                        }
                                                        C1232850iBf c1232850iBf3 = C2197731Azr.LJIIZILJ;
                                                        C0KQW c0kqw7 = c0kpg.LIZLLL;
                                                        if (c0kqw7 != null && (enumC1792020wjY4 = c0kqw7.LIZ) != null) {
                                                            numValueOf4 = Integer.valueOf(enumC1792020wjY4.getValue());
                                                        } else {
                                                            numValueOf4 = null;
                                                        }
                                                        c1232850iBf3.LIZJ = numValueOf4;
                                                        C0KQW c0kqw8 = c0kpg.LIZLLL;
                                                        if (c0kqw8 != null) {
                                                            str22 = c0kqw8.LIZIZ;
                                                        } else {
                                                            str22 = null;
                                                        }
                                                        c1232850iBf3.LIZLLL = str22;
                                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                        sbLIZ6.append("[MP] Purchase fail: ");
                                                        C0KQW c0kqw9 = c0kpg.LIZLLL;
                                                        if (c0kqw9 != null) {
                                                            str23 = c0kqw9.LIZIZ;
                                                        } else {
                                                            str23 = null;
                                                        }
                                                        sbLIZ6.append(str23);
                                                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                                                        c1232850iBf3.LIZIZ = strLIZIZ3;
                                                        if (c0kpg.LJ != null) {
                                                            C2197481AzS c2197481AzS6 = c2197471AzR5.LJIIJ;
                                                            int i8 = c1232850iBf3.LIZ;
                                                            if (strLIZIZ3 != null) {
                                                                str25 = strLIZIZ3;
                                                            }
                                                            C2197481AzS.LIZJ(c2197481AzS6, "iap_pay_fail", i8, str25, c2197481AzS6.LIZ("iap_pay_start"), 0, 0L, 0L, null, null, 0, "IAP", c0kpg.LIZ.name(), false, c1232850iBf3.LIZJ, c1232850iBf3.LIZLLL, c1232850iBf3, 5104);
                                                        }
                                                        C1B09 c1b092 = c2197471AzR5.LIZJ;
                                                        EnumC2197771Azv enumC2197771Azv2 = EnumC2197771Azv.IAP_PAY_FAIL;
                                                        int i9 = c1232850iBf3.LIZ;
                                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                        sbLIZ7.append("IAP Payment params - ");
                                                        sbLIZ7.append(str17);
                                                        sbLIZ7.append(" tradeOrderId - ");
                                                        sbLIZ7.append(str19);
                                                        sbLIZ7.append("  ");
                                                        C518080KTm c518080KTm = c0kpg.LJ;
                                                        if (c518080KTm != null) {
                                                            str24 = c518080KTm.LJFF;
                                                        }
                                                        sbLIZ7.append(str24);
                                                        c1b092.LIZIZ(new C2195941Awy(enumC2197771Azv2, new C2195931Awx(i9, C2188811AlT.LIZIZ(sbLIZ7), null, EnumC2197781Azw.IAP, 4), c1232850iBf3, 4));
                                                        return;
                                                    }
                                                    InterfaceC1791930wjP interfaceC1791930wjPLLFZ4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ();
                                                    C2197471AzR c2197471AzR7 = c2197471AzR5;
                                                    interfaceC1791930wjPLLFZ4.LJFF(c2197471AzR7.LIZ, c0kpg, c2197471AzR7.LJIIIZ, null);
                                                    C786410Ut5.LJIIJ(c2197471AzR5.LJ);
                                                    MinisRechargeFragment minisRechargeFragment4 = c2197471AzR5.LIZLLL;
                                                    if (minisRechargeFragment4 != null) {
                                                        minisRechargeFragment4.SR();
                                                    }
                                                    C1232850iBf c1232850iBf4 = C2197731Azr.LJIIJJI;
                                                    C0KQW c0kqw10 = c0kpg.LIZLLL;
                                                    if (c0kqw10 != null && (enumC1792020wjY3 = c0kqw10.LIZ) != null) {
                                                        numValueOf3 = Integer.valueOf(enumC1792020wjY3.getValue());
                                                    } else {
                                                        numValueOf3 = null;
                                                    }
                                                    c1232850iBf4.LIZJ = numValueOf3;
                                                    C0KQW c0kqw11 = c0kpg.LIZLLL;
                                                    if (c0kqw11 != null) {
                                                        str21 = c0kqw11.LIZIZ;
                                                    } else {
                                                        str21 = null;
                                                    }
                                                    c1232850iBf4.LIZLLL = str21;
                                                    if (c0kpg.LJ != null) {
                                                        C2197481AzS c2197481AzS7 = c2197471AzR5.LJIIJ;
                                                        int i10 = c1232850iBf4.LIZ;
                                                        String str26 = c1232850iBf4.LIZIZ;
                                                        if (str26 != null) {
                                                            str25 = str26;
                                                        }
                                                        C2197481AzS.LIZJ(c2197481AzS7, "iap_pay_fail", i10, str25, c2197481AzS7.LIZ("iap_pay_start"), 0, 0L, 0L, null, null, 0, "IAP", c0kpg.LIZ.name(), false, numValueOf3, str21, c1232850iBf4, 5104);
                                                    }
                                                    C1B09 c1b093 = c2197471AzR5.LIZJ;
                                                    EnumC2197771Azv enumC2197771Azv3 = EnumC2197771Azv.IAP_PAY_PENDING;
                                                    int i11 = c1232850iBf4.LIZ;
                                                    C518080KTm c518080KTm2 = c0kpg.LJ;
                                                    if (c518080KTm2 != null) {
                                                        str24 = c518080KTm2.LJFF;
                                                    }
                                                    c1b093.LIZIZ(new C2195941Awy(enumC2197771Azv3, new C2195931Awx(i11, String.valueOf(str24), null, EnumC2197781Azw.IAP, 4), c1232850iBf4, 4));
                                                    c2197471AzR5.LIZIZ(false);
                                                    return;
                                                }
                                                C786410Ut5.LJIIJ(c2197471AzR5.LJ);
                                                MinisRechargeFragment minisRechargeFragment5 = c2197471AzR5.LIZLLL;
                                                if (minisRechargeFragment5 != null) {
                                                    minisRechargeFragment5.SR();
                                                }
                                                InterfaceC1791930wjP interfaceC1791930wjPLLFZ5 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ();
                                                C2197471AzR c2197471AzR8 = c2197471AzR5;
                                                interfaceC1791930wjPLLFZ5.LJFF(c2197471AzR8.LIZ, c0kpg, c2197471AzR8.LJIIIZ, null);
                                                C1232850iBf c1232850iBf5 = C2197731Azr.LJIIJ;
                                                C0KQW c0kqw12 = c0kpg.LIZLLL;
                                                if (c0kqw12 != null && (enumC1792020wjY2 = c0kqw12.LIZ) != null) {
                                                    numValueOf2 = Integer.valueOf(enumC1792020wjY2.getValue());
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                                c1232850iBf5.LIZJ = numValueOf2;
                                                C0KQW c0kqw13 = c0kpg.LIZLLL;
                                                if (c0kqw13 != null) {
                                                    str20 = c0kqw13.LIZIZ;
                                                } else {
                                                    str20 = null;
                                                }
                                                c1232850iBf5.LIZLLL = str20;
                                                C2197481AzS c2197481AzS8 = c2197471AzR5.LJIIJ;
                                                int i12 = c1232850iBf5.LIZ;
                                                String str27 = c1232850iBf5.LIZIZ;
                                                if (str27 == null) {
                                                    str27 = "";
                                                }
                                                C2197481AzS.LIZJ(c2197481AzS8, "iap_pay_fail", i12, str27, c2197481AzS8.LIZ("iap_pay_start"), 0, 0L, 0L, null, null, 0, "IAP", c0kpg.LIZ.name(), false, numValueOf2, str20, c1232850iBf5, 5104);
                                                C1B09 c1b094 = c2197471AzR5.LIZJ;
                                                EnumC2197771Azv enumC2197771Azv4 = EnumC2197771Azv.IAP_PAY_CANCEL;
                                                int i13 = c1232850iBf5.LIZ;
                                                C518080KTm c518080KTm3 = c0kpg.LJ;
                                                if (c518080KTm3 != null) {
                                                    str24 = c518080KTm3.LJFF;
                                                }
                                                c1b094.LIZIZ(new C2195941Awy(enumC2197771Azv4, new C2195931Awx(i13, String.valueOf(str24), null, EnumC2197781Azw.IAP, 4), c1232850iBf5, 4));
                                                return;
                                            }
                                            C2197481AzS c2197481AzS9 = c2197471AzR5.LJIIJ;
                                            C2197481AzS.LIZJ(c2197481AzS9, "iap_pay_success", 0, null, c2197481AzS9.LIZ("iap_pay_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
                                            awS435S0200000_34.invoke();
                                        }
                                    });
                                }
                            } else {
                                this.LL.LJIILIIL(minisCreateOrderResponse.tradeOrderId);
                            }
                            C1C7U.LIZIZ("MinisRechargeBeanTask@c3fd.startRechargeBeans$1$onCallback$2");
                        }
                    }, new AfS203S0100000_34(c2197471AzR4, 10)));
                }
            });
        }
    }

    public final void LJIIL(FragmentManager fragmentManager, MinisRechargeSheetParams minisRechargeSheetParams, Function1 function1, Function0 function0, Function0 function02) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        String str = MinisRechargeFragment._pnsPageId;
        AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(function1, 327);
        AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(function0, (Function0<Unit>) 156);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "PURCHASE_PARAMS_KEY", minisRechargeSheetParams);
        MinisRechargeFragment minisRechargeFragment = new MinisRechargeFragment(awS611S0100000_32, awS578S0100000_34);
        minisRechargeFragment.setArguments(bundle);
        this.LIZLLL = minisRechargeFragment;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = minisRechargeFragment;
        tuxSheet.LLILLJJLI = new C1D14(this, function02, 1);
        C2197011Ayh.LIZ.getClass();
        C2197011Ayh.LJFF().storeInt("TTKMinisIntroSheetShownKey", 1);
        tuxSheet.show(fragmentManager, "minis-MinisRechargeFragment");
        C2197481AzS c2197481AzS = this.LJIIJ;
        C2197681Azm.LIZLLL(c2197481AzS.LJFF, c2197481AzS.LJ, c2197481AzS.LIZJ);
    }
}
