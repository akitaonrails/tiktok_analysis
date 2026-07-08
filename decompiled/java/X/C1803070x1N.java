package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.IWalletExceptionService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.CSSProperties;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.ItemType;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.TextNode;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.UnorderedListNode;
import com.bytedance.android.livesdk.livesetting.wallet.WalletRegionTerms;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0x1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803070x1N implements InterfaceC1796910wrR {
    public final Context LIZ;
    public final RechargePanelInputParams LIZIZ;
    public final Diamond LIZJ;
    public final boolean LIZLLL;
    public final Map<String, String> LJ;
    public final HashMap<String, Object> LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Unit> LJII;
    public final Function1<C1797200wru, Unit> LJIIIIZZ;
    public final Function2<Diamond, C1796560wqs, Unit> LJIIIZ;
    public final Function1<Long, Unit> LJIIJ;
    public final HashMap<String, String> LJIIJJI;
    public final long LJIIL;
    public final long LJIILIIL;

    @Override // X.InterfaceC1796910wrR
    public final void LIZIZ(int i, C1797200wru c1797200wru) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LIZJ(int i, C1797010wrb c1797010wrb) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LIZLLL(int i, C1797200wru c1797200wru) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJFF(int i, C1797200wru c1797200wru) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJI(int i, C1797010wrb c1797010wrb) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIIZ(int i, C1797200wru c1797200wru) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIJ(boolean z) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILJJIL(int i, C1797010wrb c1797010wrb) {
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILL(int i, C1797200wru c1797200wru) {
    }

    @Override // X.InterfaceC1796910wrR
    public final String getPayload() {
        return "";
    }

    @Override // X.InterfaceC1796910wrR
    public final InterfaceC1797050wrf LIZ() {
        return new InterfaceC1797050wrf() { // from class: X.0x1O
            @Override // X.InterfaceC1797050wrf
            public final void LIZ(HashMap map) {
                LinkedHashMap linkedHashMap;
                String str;
                String billingCountryCode;
                HashMap<String, String> map2 = null;
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(map);
                } else {
                    linkedHashMap = null;
                }
                C1803070x1N c1803070x1N = this.LIZ;
                RechargePanelInputParams rechargePanelInputParams = c1803070x1N.LIZIZ;
                HashMap<String, String> map3 = c1803070x1N.LJIIJJI;
                boolean zLIZIZ = c1803070x1N.LIZJ.LIZIZ();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_pay");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
                if (rechargePanelInputParams != null) {
                    map2 = rechargePanelInputParams.etTracking;
                }
                c474500IjALIZ.LJJIIZI(map2);
                c474500IjALIZ.LJJIIZI(linkedHashMap);
                C1151190g3x.LJ(c474500IjALIZ, rechargePanelInputParams, map3);
                if (zLIZIZ) {
                    str = "tiktok";
                } else {
                    str = "google_play";
                }
                c474500IjALIZ.LJJII(str, "panel_channel");
                c474500IjALIZ.LJJII(String.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()), "recharge_v3_version");
                InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
                if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
                    billingCountryCode = "";
                }
                c474500IjALIZ.LJJII(billingCountryCode, "app_store_front");
                c474500IjALIZ.LIZ();
            }
        };
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJII(C1796960wrW c1796960wrW) {
        C1796950wrV.LIZ(this, c1796960wrW);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIJJI(C1777440wM2 c1777440wM2) {
        Long lValueOf;
        Function0<Unit> function0 = this.LJI;
        if (function0 != null) {
            function0.invoke();
        }
        IWalletService iWalletServiceLIZ = C1148670fzt.LIZ();
        Context context = this.LIZ;
        Diamond diamond = this.LIZJ;
        int iLIZ = C1134860fdc.LIZ.LIZ();
        String str = c1777440wM2.LIZJ;
        String str2 = c1777440wM2.LIZLLL;
        int i = c1777440wM2.LIZIZ;
        C1776960wLG c1776960wLG = c1777440wM2.LJFF;
        if (c1776960wLG != null) {
            lValueOf = Long.valueOf(c1776960wLG.LIZIZ);
        } else {
            lValueOf = null;
        }
        iWalletServiceLIZ.openCashierV3(context, diamond, iLIZ, str, str2, i, lValueOf, ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(c1777440wM2.LIZIZ, true), true, C1148670fzt.LIZ().getRechargeService().LJIIIIZZ(), null);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILIIL(C1797010wrb c1797010wrb) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChargeCheckOrderSuccess, action: ");
        sbLIZ.append(3);
        sbLIZ.append(", result: ");
        sbLIZ.append(c1797010wrb);
        C20441214yg.LIZIZ("RechargeUtil", C2188811AlT.LIZIZ(sbLIZ));
        C1796880wrO c1796880wrO = c1797010wrb.LIZLLL;
        C1796560wqs c1796560wqs = new C1796560wqs(c1796880wrO.LIZJ, c1796880wrO.LIZ, c1796880wrO.LIZIZ, null, c1797010wrb.LJIIIIZZ, 8);
        C1151190g3x.LJIIIZ(this.LIZJ.count, c1796560wqs, this.LIZIZ, C2097608Jq.LJ(), this.LJIIJJI, this.LIZJ.LIZIZ());
        final long j = this.LJIIL;
        final long j2 = this.LJIILIIL;
        final Function1<Long, Unit> function1 = this.LJIIJ;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        C1148670fzt.LIZ().walletCenter().aF2(EnumC1805800x5m.LIVE_DETAIL, EnumC1805420x5A.FIRST_RECHARGE, new InterfaceC1803980x2q() { // from class: X.0x1P
            @Override // X.InterfaceC1803980x2q
            public final void LIZ(long j3) {
                long j4;
                Function1<Long, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Long.valueOf(j3 - j));
                }
                C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) (j3 - j), false, false, 0L, false, false, null, 0, 1020));
                C1796590wqv.LIZ("ttlive_update_wallet_info_order", new HashMap());
                WalletStruct walletStructTF1 = C1148670fzt.LIZ().walletCenter().TF1();
                if (walletStructTF1 != null) {
                    j4 = walletStructTF1.coinsBalanceVersionV2;
                } else {
                    j4 = 0;
                }
                C1151190g3x.LJIIJ(true, SystemClock.uptimeMillis() - jUptimeMillis, j, j3, j2, j4, null);
            }

            @Override // X.InterfaceC1803980x2q
            public final void LIZIZ(Throwable th) {
                int errorCode;
                if (th instanceof C501520Jle) {
                    errorCode = ((C501520Jle) th).getErrorCode();
                } else {
                    errorCode = 61;
                }
                C1151190g3x.LJIIJ(false, SystemClock.uptimeMillis() - jUptimeMillis, 0L, 0L, j2, 0L, th.toString());
                C1796590wqv.LIZIZ(errorCode, "ttlive_update_wallet_info_order", "update wallet info fail");
            }
        });
        this.LJIIIZ.invoke(this.LIZJ, c1796560wqs);
        C1148670fzt.LIZ().getPayManager().LIZ();
        C1148670fzt.LIZ().walletCenter().X41(EnumC1805570x5P.RECHARGE_SUCCESS);
        RechargePanelInputParams rechargePanelInputParams = this.LIZIZ;
        if (rechargePanelInputParams != null) {
            rechargePanelInputParams.etTracking = new HashMap<>();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.CSSProperties] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r33v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r37v3, types: [com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.CSSProperties] */
    @Override // X.InterfaceC1796910wrR
    public final void LJ(int i, C1797200wru c1797200wru) {
        String str;
        C006A c006aLIZJ;
        int iLIZ;
        TextNode textNode;
        String str2;
        Object unorderedListNode;
        ?? r26;
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChargePayError, action: ");
        sbLIZ.append(i);
        sbLIZ.append(", errorInfo: ");
        sbLIZ.append(c1797200wru);
        C20441214yg.LIZIZ("RechargeUtil", C2188811AlT.LIZIZ(sbLIZ));
        C1151190g3x.LJIIIIZZ(this.LIZJ, i, c1797200wru, this.LIZIZ, this.LJIIJJI, this.LJFF);
        this.LJIIIIZZ.invoke(c1797200wru);
        Context context = this.LIZ;
        RechargePanelInputParams rechargePanelInputParams = this.LIZIZ;
        Diamond diamond = this.LIZJ;
        boolean z = this.LIZLLL;
        C1797250wrz c1797250wrzLIZ = C1797210wrv.LIZ(c1797200wru);
        c1797250wrzLIZ.LJIIIZ.put("request_page", EnumC1805800x5m.LIVE_DETAIL.getValue());
        Map<String, String> map = c1797250wrzLIZ.LJIIIZ;
        if (z) {
            str = "click";
        } else {
            str = "call";
        }
        map.put("preview_type", str);
        c1797250wrzLIZ.LJII = C1151360g4E.LIZ(rechargePanelInputParams, diamond);
        if (c1797250wrzLIZ.LIZ == 206) {
            TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
            if (!taskManagerV2.LJIIJJI(106) && rechargePanelInputParams != null) {
                EnumC1802790x0v enumC1802790x0v = EnumC1802790x0v.CANCEL_PAYMENT;
                long cashierShownTime = c1797200wru.getCashierShownTime();
                long failureLatency = c1797200wru.getFailureLatency();
                RechargeRequestParams rechargeRequestParamsLIZ = C1151360g4E.LIZ(rechargePanelInputParams, diamond);
                int i2 = diamond.count;
                String str3 = diamond.price;
                C1134410fct c1134410fctLJ = taskManagerV2.LJ();
                if (c1134410fctLJ != null) {
                    iLIZ = C1134900fdg.LIZ(c1134410fctLJ, 5);
                } else {
                    iLIZ = 0;
                }
                int iMax = Math.max(0, diamond.givingCount - iLIZ);
                if (WalletRegionTerms.INSTANCE.isEU()) {
                    int i3 = diamond.count + iMax;
                    r26 = 0;
                    unorderedListNode = new TextNode(C497740JfY.LJIIL(2131755872, i3, Integer.valueOf(i3), diamond.price), ItemType.TEXT, null, null, null);
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (iMax == 0) {
                        int i4 = diamond.count;
                        str2 = null;
                        textNode = new TextNode(C497740JfY.LJIIL(2131755872, i4, Integer.valueOf(i4), diamond.price), ItemType.TEXT, null, null, null);
                    } else {
                        int i5 = diamond.count;
                        str2 = null;
                        textNode = new TextNode(C497740JfY.LJIJJ(2131853021, "{s1}", "{s2}", "{s3}"), ItemType.TEXT, null, null, C2097608Jq.LJIIIIZZ(new Pair("s1", new TextNode(C497740JfY.LJIIL(2131755873, iMax, Integer.valueOf(iMax)), ItemType.TEXT, null, new CSSProperties(null, "black", "bold", null), null)), new Pair("s2", new TextNode(C497740JfY.LJIIL(2131755874, i5, Integer.valueOf(i5)), ItemType.TEXT, null, null, null)), new Pair("s3", new TextNode(diamond.price, ItemType.TEXT, null, null, null))));
                    }
                    arrayList.add(textNode);
                    if (iLIZ > 0) {
                        arrayList.add(new TextNode(C497740JfY.LJIJJ(2131853020, "{s1}"), ItemType.TEXT, str2, str2, C2097908Jt.LIZJ(new Pair("s1", new TextNode(C497740JfY.LJIIL(2131755871, iLIZ, Integer.valueOf(iLIZ)), ItemType.TEXT, str2, str2, str2)))));
                    }
                    unorderedListNode = new UnorderedListNode(arrayList, ItemType.UNORDERED_LIST);
                    r26 = str2;
                }
                try {
                    c098200Yq = C293501Bt.LIZ().LJIILL(unorderedListNode);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = "";
                }
                C1803370x1r c1803370x1r = new C1803370x1r(enumC1802790x0v, "FirstRechargePanel_Native", "campaign", cashierShownTime, i2, str3, z, r26, r26, r26, (String) c098200Yq, failureLatency, rechargeRequestParamsLIZ, r26, 9088);
                if (c1797250wrzLIZ.LIZ == 206) {
                    c1797250wrzLIZ.LJIIJ = c1803370x1r;
                }
            }
        }
        try {
            c006aLIZJ = C1161920gLG.LIZJ(IWalletExceptionService.class);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c006aLIZJ = null;
        }
        IWalletExceptionService iWalletExceptionService = (IWalletExceptionService) c006aLIZJ;
        if (iWalletExceptionService != null) {
            iWalletExceptionService.h31(context, c1797250wrzLIZ, null);
        }
        RechargePanelInputParams rechargePanelInputParams2 = this.LIZIZ;
        if (rechargePanelInputParams2 != null) {
            rechargePanelInputParams2.etTracking = new HashMap<>();
        }
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIIIZZ(int i, C1797010wrb c1797010wrb) {
        Function0<Unit> function0 = this.LJI;
        if (function0 != null) {
            function0.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChargePaySuccess, action: ");
        sbLIZ.append(i);
        sbLIZ.append(", result: ");
        sbLIZ.append(c1797010wrb);
        C20441214yg.LIZIZ("RechargeUtil", C2188811AlT.LIZIZ(sbLIZ));
        C1796560wqs c1796560wqs = c1797010wrb.LIZJ;
        String str = c1796560wqs.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c1796560wqs.LIZ;
        if (str3 != null) {
            str2 = str3;
        }
        int i2 = c1796560wqs.LIZJ;
        if (str.length() > 0 && str2.length() > 0) {
            C1148670fzt.LIZ().getPayManager().LIZLLL(str2, str, i2, this, false);
        }
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIL(int i, C1797200wru c1797200wru) {
        this.LJIIIIZZ.invoke(c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILLIIL(int i, C1797010wrb c1797010wrb) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChargeQueryProductSuccess, action: ");
        sbLIZ.append(i);
        sbLIZ.append(", result: ");
        sbLIZ.append(c1797010wrb);
        C20441214yg.LIZIZ("RechargeUtil", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIZILJ(int i, C1797200wru c1797200wru) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChargeQueryProductError, action: ");
        sbLIZ.append(i);
        sbLIZ.append(", errorInfo: ");
        sbLIZ.append(c1797200wru);
        C20441214yg.LIZIZ("RechargeUtil", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1803070x1N(Context context, RechargePanelInputParams rechargePanelInputParams, Diamond diamond, boolean z, Map map, HashMap map2, Function0 function0, Function0 function02, Function1 function1, Function2 function2, Function1 function12) {
        long j;
        this.LIZ = context;
        this.LIZIZ = rechargePanelInputParams;
        this.LIZJ = diamond;
        this.LIZLLL = z;
        this.LJ = map;
        this.LJFF = map2;
        this.LJI = function0;
        this.LJII = function02;
        this.LJIIIIZZ = function1;
        this.LJIIIZ = function2;
        this.LJIIJ = function12;
        HashMap<String, String> map3 = new HashMap<>();
        this.LJIIJJI = map3;
        if (map != null) {
            map3.putAll(map);
        }
        map3.put("is_first_recharge", String.valueOf(C1151360g4E.LJFF()));
        map3.put("strategy_task_type", String.valueOf(C1134860fdc.LIZ.LIZ()));
        this.LJIIL = C1148670fzt.LIZ().walletCenter().No0();
        WalletStruct walletStructTF1 = C1148670fzt.LIZ().walletCenter().TF1();
        if (walletStructTF1 != null) {
            j = walletStructTF1.coinsBalanceVersionV2;
        } else {
            j = 0;
        }
        this.LJIILIIL = j;
    }
}
