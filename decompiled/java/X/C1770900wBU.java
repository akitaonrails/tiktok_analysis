package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfigV2;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardModelV2;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMallPreloadOptConfigModel;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadConfigV1Model;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadConfigV2Model;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadSceneConfigV2Model;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoGecCardDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoLynxDTO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wBU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770900wBU {
    public static AnonymousClass0956 LIZJ;
    public static volatile C599670NfZ LJII;
    public static volatile C1772750wET LJIIIIZZ;
    public static volatile String LJIIIZ;
    public static volatile boolean LJIJI;
    public static final C1770900wBU LIZ = new C1770900wBU();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1468));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(490));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(492));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(489));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1467));
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public static final AtomicInteger LJIIJJI = new AtomicInteger();
    public static final Object LJIIL = new Object();
    public static final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILJJIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILL = new AtomicBoolean(false);
    public static final AFwS286S0000000_3 LJIILLIIL = AFwS286S0000000_3.get$arr$(20);
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(491));
    public static final C01GW LJIJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(493));
    public static final AtomicBoolean LJIJJ = new AtomicBoolean(false);
    public static final C01GW LJIJJLI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1469));
    public static final C01GW LJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(495));
    public static final C01GW LJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(494));
    public static final int LJJI = 58;

    public final synchronized InterfaceC599750Nfh LJIILJJIL() {
        C599670NfZ c599670NfZ;
        c599670NfZ = LJII;
        LJII = null;
        return c599670NfZ;
    }

    public static void LIZ() {
        Boolean bool;
        AnonymousClass0956 anonymousClass0956;
        C1770940wBY.LIZ.getClass();
        C01GW c01gw = C1770940wBY.LIZJ;
        if (((EcMallPreloadOptConfigModel) c01gw.getValue()).autoCleanPreloadView && (bool = ((EcMallPreloadOptConfigModel) c01gw.getValue()).cleanBySpark) != null && !bool.booleanValue() && (anonymousClass0956 = LIZJ) != null && anonymousClass0956.isActive()) {
            AnonymousClass0956 anonymousClass09562 = LIZJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            LIZJ = null;
            LJIJJLI("cancel_clean");
        }
        Boolean bool2 = ((EcMallPreloadOptConfigModel) c01gw.getValue()).cleanWhenLowMemory;
        if (bool2 == null || !bool2.booleanValue()) {
            return;
        }
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        C09QL c09ql = (C09QL) LJIJJLI.getValue();
        c2188561Al4.getClass();
        C09QK.LIZ(c09ql);
    }

    public static List LJ() {
        C1770930wBX.LIZ.getClass();
        EcMixMallPreloadConfigV1Model ecMixMallPreloadConfigV1ModelLIZ = C1770930wBX.LIZ();
        if (ecMixMallPreloadConfigV1ModelLIZ != null) {
            return ecMixMallPreloadConfigV1ModelLIZ.cardConfig;
        }
        return null;
    }

    public static List LJFF() {
        C1770930wBX.LIZ.getClass();
        EcMixMallPreloadConfigV1Model ecMixMallPreloadConfigV1ModelLIZ = C1770930wBX.LIZ();
        if (ecMixMallPreloadConfigV1ModelLIZ != null) {
            return ecMixMallPreloadConfigV1ModelLIZ.cardConfigAfterCache;
        }
        return null;
    }

    public static boolean LJII() {
        C0BAR.LIZ.getClass();
        return ((Number) C0BAR.LIZIZ.getValue()).intValue() == 1;
    }

    public static void LJIIL() {
        AtomicBoolean atomicBoolean = LJIILL;
        if (atomicBoolean.get()) {
            return;
        }
        if (((Boolean) LJ.getValue()).booleanValue()) {
            C1536940q68 c1536940q68 = new C1536940q68();
            c1536940q68.LIZ = "ec_mmk_preload";
            c1536940q68.LIZ(32);
            C683880Qs6.LIZIZ(c1536940q68);
        }
        atomicBoolean.set(true);
    }

    public final void LJIIZILJ() {
        Integer num;
        EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model;
        List<ECMixMallCardModelV2> list;
        C1770930wBX.LIZ.getClass();
        EcMixMallPreloadConfigV1Model ecMixMallPreloadConfigV1ModelLIZ = C1770930wBX.LIZ();
        if (ecMixMallPreloadConfigV1ModelLIZ == null || (num = ecMixMallPreloadConfigV1ModelLIZ.enableMixMallUniquePreload) == null || num.intValue() != 1) {
            return;
        }
        AtomicBoolean atomicBoolean = LJIILIIL;
        if (atomicBoolean.get()) {
            return;
        }
        if (LJII()) {
            C1768440w7W.LIZ.getClass();
            EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ = C1768440w7W.LIZ();
            if (ecMixMallPreloadConfigV2ModelLIZ != null && (ecMixMallPreloadSceneConfigV2Model = ecMixMallPreloadConfigV2ModelLIZ.preloadScene) != null && (list = ecMixMallPreloadSceneConfigV2Model.beforeMallConfig) != null) {
                C1770900wBU c1770900wBU = LIZ;
                LIZLLL(EnumC1768470w7Z.BEFORE_MALL, list, c1770900wBU.LJIJJ(), c1770900wBU.LJIJI());
            }
        } else {
            InterfaceC599750Nfh interfaceC599750NfhLJIJJ = LJIJJ();
            LJIJI();
            LJIILIIL(interfaceC599750NfhLJIJJ);
            LJIIL();
            LJIL.getValue();
            LJJ.getValue();
            if (((Boolean) LIZLLL.getValue()).booleanValue()) {
                LJIILL(LJ(), EnumC1768470w7Z.BEFORE_MALL, null, interfaceC599750NfhLJIJJ);
            }
            if (((Boolean) LJ.getValue()).booleanValue()) {
                LJIILLIIL(LJ(), EnumC1768470w7Z.BEFORE_MALL, null);
            }
        }
        atomicBoolean.set(true);
    }

    public final C1772750wET LJIJI() {
        if (LJIIIIZZ == null) {
            synchronized (this) {
                try {
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = new C1772750wET(0);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIIZZ;
    }

    public final InterfaceC599750Nfh LJIJJ() {
        if (LJII == null) {
            synchronized (this) {
                try {
                    if (LJII == null) {
                        LJII = C586750Mzp.LIZ(EnumC586720Mzm.EC_MMK_IMPL);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public static void LIZJ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C08YI(function0, null), 2);
        } else {
            function0.invoke();
        }
    }

    public static Map LJI(C1767980w6m c1767980w6m) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        EnumC1768230w7B enumC1768230w7B;
        EnumC1768240w7C enumC1768240w7C;
        C1767830w6X c1767830w6X;
        C1767830w6X c1767830w6X2;
        String str6;
        C1767680w6I c1767680w6I;
        C1767670w6H c1767670w6H;
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        Pair[] pairArr = new Pair[9];
        String str7 = null;
        if (c1767790w6T != null) {
            str7 = c1767790w6T.LJI;
        }
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        pairArr[0] = new Pair("mall_extra_info", str7);
        if (c1767790w6T == null || (c1767680w6I = c1767790w6T.LIZJ) == null || (c1767670w6H = c1767680w6I.LIZ) == null || (str = c1767670w6H.LIZ) == null) {
            str = "";
        }
        pairArr[1] = new Pair("diversion_params", str);
        if (c1767790w6T == null || (str2 = c1767790w6T.LIZLLL) == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("diversion_params_info", str2);
        if (c1767790w6T == null || (str3 = c1767790w6T.LJFF) == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("extra_route_schema", str3);
        if (c1767790w6T == null || (str4 = c1767790w6T.LJIIIZ) == null) {
            str4 = "unknown";
        }
        pairArr[4] = new Pair("previous_page", str4);
        if (c1767790w6T == null || (str5 = c1767790w6T.LJII) == null) {
            str5 = "";
        }
        pairArr[5] = new Pair("enter_method", str5);
        if (c1767790w6T != null && (str6 = c1767790w6T.LJIIZILJ) != null) {
            str8 = str6;
        }
        pairArr[6] = new Pair("shoptab_index", str8);
        if (c1767790w6T == null || (c1767830w6X2 = c1767790w6T.LJIIJJI) == null || (enumC1768230w7B = c1767830w6X2.LIZ) == null) {
            enumC1768230w7B = EnumC1768230w7B.DEFAULT;
        }
        pairArr[7] = new Pair("shoptab_ui_status", enumC1768230w7B.getValue());
        if (c1767790w6T == null || (c1767830w6X = c1767790w6T.LJIIJJI) == null || (enumC1768240w7C = c1767830w6X.LIZIZ) == null) {
            enumC1768240w7C = EnumC1768240w7C.DEFAULT;
        }
        pairArr[8] = new Pair("handle_on_ui_sub_stage", enumC1768240w7C.getValue());
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static String LJIIIIZZ(boolean z) {
        String str;
        boolean z2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = false;
        if (((Boolean) LJFF.getValue()).booleanValue()) {
            if (LJIIIZ == null) {
                synchronized (LJIIL) {
                    try {
                        if (LJIIIZ == null) {
                            LJIIIZ = C15444062w.LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            str = LJIIIZ;
            if (str == null) {
                str = "";
            }
        } else {
            if (LJIIIZ == null) {
                if (z) {
                    AtomicBoolean atomicBoolean = LJIIJ;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        LJIIIZ = C15444062w.LIZ();
                    }
                } else {
                    LJIIIZ = C15444062w.LIZ();
                }
                str = LJIIIZ;
                if (str == null) {
                    str = "";
                }
                z2 = false;
                z3 = true;
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2371909Rd(str, LJIIJJI.incrementAndGet(), z3, z2, z, System.currentTimeMillis() - jCurrentTimeMillis, null), 3);
                return str;
            }
            str = LJIIIZ;
            if (str == null) {
                str = "";
            }
            z3 = true;
        }
        z2 = z3;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2371909Rd(str, LJIIJJI.incrementAndGet(), z3, z2, z, System.currentTimeMillis() - jCurrentTimeMillis, null), 3);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0R21 LJIIJJI(X.C1772630wEH r6) {
        /*
            X.0wG8 r0 = r6.LIZJ
            r6 = 0
            if (r0 == 0) goto L4e
            java.util.List<? extends X.0wFD> r0 = r0.LIZLLL
            if (r0 == 0) goto L4e
            java.util.Iterator r5 = r0.iterator()
            r2 = r6
            r4 = r6
        Lf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r3 = r5.next()
            X.0wFD r3 = (X.AbstractC1773210wFD) r3
            java.lang.String r1 = r3.LJIIJJI()
            java.lang.String r0 = "header"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lf
            boolean r0 = r3 instanceof X.C1773330wFP
            if (r0 == 0) goto Lf
            X.0wFP r3 = (X.C1773330wFP) r3
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.LJJ
            java.lang.String r0 = "customer_type"
            java.lang.Object r2 = X.C7726030a.LIZ(r0, r1)
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L4c
            java.lang.Double r2 = (java.lang.Double) r2
        L3b:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.LJJ
            java.lang.String r0 = "mall_crowd_type"
            java.lang.Object r4 = X.C7726030a.LIZ(r0, r1)
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L4a
            java.lang.Double r4 = (java.lang.Double) r4
            goto Lf
        L4a:
            r4 = r6
            goto Lf
        L4c:
            r2 = r6
            goto L3b
        L4e:
            r4 = r6
        L4f:
            r3 = r6
            goto L5c
        L51:
            if (r2 == 0) goto L4f
            double r1 = r2.doubleValue()
            int r0 = (int) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L5c:
            if (r4 == 0) goto L67
            double r1 = r4.doubleValue()
            int r0 = (int) r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L67:
            X.00c5 r0 = X.EnumC114700c5.OLD_CUSTOMER
            int r1 = r0.getValue()
            if (r3 == 0) goto L89
            int r0 = r3.intValue()
            if (r0 != r1) goto L89
            X.07qD r0 = X.EnumC1985907qD.MALL_NEW_USER
            int r1 = r0.getValue()
            if (r6 == 0) goto L86
            int r0 = r6.intValue()
            if (r0 != r1) goto L86
            X.0R21 r0 = X.C0R21.MALL_NEW_USER
            return r0
        L86:
            X.0R21 r0 = X.C0R21.OLD_USER
            return r0
        L89:
            X.00c5 r0 = X.EnumC114700c5.NEW_CUSTOMER
            int r1 = r0.getValue()
            if (r3 == 0) goto L9a
            int r0 = r3.intValue()
            if (r0 != r1) goto L9a
            X.0R21 r0 = X.C0R21.NEW_USER
            return r0
        L9a:
            X.0R21 r0 = X.C0R21.UNKNOWN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770900wBU.LJIIJJI(X.0wEH):X.0R21");
    }

    public static void LJIILIIL(InterfaceC599750Nfh interfaceC599750Nfh) {
        int iIntValue;
        AtomicBoolean atomicBoolean = LJIILJJIL;
        if (!atomicBoolean.get()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initPreloadTask, globalContext=");
            sbLIZ.append(interfaceC599750Nfh);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            if (((Boolean) LIZLLL.getValue()).booleanValue()) {
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1097680efe c1097680efe = new C1097680efe();
                c1097680efe.LJIIZILJ = true;
                c1097680efe.LIZ = "ec_mmk_preload";
                c1097680efe.LJIJ = Integer.MAX_VALUE;
                C1770940wBY.LIZ.getClass();
                C01GW c01gw = C1770940wBY.LIZJ;
                if (((EcMallPreloadOptConfigModel) c01gw.getValue()).autoCleanPreloadView) {
                    Integer num = ((EcMallPreloadOptConfigModel) c01gw.getValue()).expiredTime;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = -1;
                }
                c1097680efe.LJIJI = iIntValue;
                c1097680efe.LIZIZ = 32;
                c1097680efe.LJIIIIZZ = LJIILLIIL;
                c1097680efe.LJIJJ = new AwS675S0100000_26(interfaceC599750Nfh, 41);
                c1097680efe.LJIJJLI = null;
                c1097680efe.LJIL = null;
                c1097680efe.LJ = true;
                c1097680efe.LJJ = false;
                C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
                Boolean bool = ((EcMallPreloadOptConfigModel) c01gw.getValue()).cleanWhenLowMemory;
                if (bool != null && bool.booleanValue()) {
                    C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
                    C09QL c09ql = (C09QL) LJIJJLI.getValue();
                    c2188561Al4.getClass();
                    C2188561Al4.LJII(c09ql);
                }
            }
            atomicBoolean.set(true);
        }
    }

    public static void LJIJJLI(String str) {
        C1018703yb.LIZIZ("rd_tiktokec_common_spark_preload", C2097608Jq.LJIIIIZZ(new Pair("page_name", "mall"), new Pair("stage", str)));
    }

    public static String LJIIIZ(String str, String str2) {
        String str3;
        Map<String, ECMixMallItemInfoDTO> map;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        ECMixMallItemInfoLynxDTO eCMixMallItemInfoLynxDTO;
        String str4;
        C1770930wBX.LIZ.getClass();
        EcMixMallPreloadConfigV1Model ecMixMallPreloadConfigV1ModelLIZ = C1770930wBX.LIZ();
        if (ecMixMallPreloadConfigV1ModelLIZ != null) {
            str3 = ecMixMallPreloadConfigV1ModelLIZ.preloadStrategyVersion;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str3, "1")) {
            MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
            C1772630wEH c1772630wEH = MMKStorageUtil.LIZJ;
            if (c1772630wEH != null && (map = c1772630wEH.LJI) != null && (eCMixMallItemInfoDTO = map.get(str)) != null && (eCMixMallItemInfoLynxDTO = eCMixMallItemInfoDTO.lynx) != null && (str4 = eCMixMallItemInfoLynxDTO.schema) != null) {
                return str4;
            }
            return str2;
        }
        Intrinsics.LJFF(str3, CardStruct.IStatusCode.DEFAULT);
        return str2;
    }

    public static String LJIIJ(String str, String str2) {
        Map<String, ECMixMallItemInfoDTO> map;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        ECMixMallItemInfoLynxDTO eCMixMallItemInfoLynxDTO;
        String str3;
        Map<String, ECMixMallCardConfigV2> map2;
        ECMixMallCardConfigV2 eCMixMallCardConfigV2;
        String str4;
        Map<String, ECMixMallCardConfigV2> map3;
        ECMixMallCardConfigV2 eCMixMallCardConfigV22;
        String str5;
        Map<String, ECMixMallItemInfoDTO> map4;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO2;
        ECMixMallItemInfoGecCardDTO eCMixMallItemInfoGecCardDTO;
        String str6;
        if (Intrinsics.LJFF(str2, "gec_card")) {
            MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
            C1772630wEH c1772630wEH = MMKStorageUtil.LIZJ;
            if (c1772630wEH != null && (map4 = c1772630wEH.LJI) != null && (eCMixMallItemInfoDTO2 = map4.get(str)) != null && (eCMixMallItemInfoGecCardDTO = eCMixMallItemInfoDTO2.gecCard) != null && (str6 = eCMixMallItemInfoGecCardDTO.schema) != null) {
                return str6;
            }
        } else if (Intrinsics.LJFF(str2, "lynx")) {
            MMKStorageUtil mMKStorageUtil2 = MMKStorageUtil.LIZ;
            C1772630wEH c1772630wEH2 = MMKStorageUtil.LIZJ;
            if (c1772630wEH2 != null && (map = c1772630wEH2.LJI) != null && (eCMixMallItemInfoDTO = map.get(str)) != null && (eCMixMallItemInfoLynxDTO = eCMixMallItemInfoDTO.lynx) != null && (str3 = eCMixMallItemInfoLynxDTO.schema) != null) {
                return str3;
            }
        }
        if (Intrinsics.LJFF(str2, "gec_card")) {
            C1768440w7W.LIZ.getClass();
            EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ = C1768440w7W.LIZ();
            if (ecMixMallPreloadConfigV2ModelLIZ != null && (map3 = ecMixMallPreloadConfigV2ModelLIZ.schemaConfig) != null && (eCMixMallCardConfigV22 = map3.get(str)) != null && (str5 = eCMixMallCardConfigV22.gecCardSchema) != null) {
                return str5;
            }
            return null;
        }
        if (Intrinsics.LJFF(str2, "lynx")) {
            C1768440w7W.LIZ.getClass();
            EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ2 = C1768440w7W.LIZ();
            if (ecMixMallPreloadConfigV2ModelLIZ2 != null && (map2 = ecMixMallPreloadConfigV2ModelLIZ2.schemaConfig) != null && (eCMixMallCardConfigV2 = map2.get(str)) != null && (str4 = eCMixMallCardConfigV2.lynxSchema) != null) {
                return str4;
            }
            return null;
        }
        return null;
    }

    public static void LJIJ(String str, Function0 function0) {
        if (str.length() == 0) {
            return;
        }
        MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
        if (MMKStorageUtil.LIZJ == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MixMall", "prefetch PageVO for cache");
            AbstractC1771170wBv abstractC1771170wBvLIZ = new C1773140wF6(C2097608Jq.LJ()).LIZ(str, null, new C1771590wCb(CardStruct.IStatusCode.DEFAULT, 0, null, "prefetch_cache", "cold_start", null, null, null, null, null, false, 65306), EnumC1771830wCz.REFRESH);
            if (abstractC1771170wBvLIZ instanceof C1771140wBs) {
                MMKStorageUtil.LIZJ = ((C1771140wBs) abstractC1771170wBvLIZ).LIZ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(kotlin.jvm.functions.Function0<kotlin.Unit> r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2158008cs
            if (r0 == 0) goto L61
            r4 = r8
            X.08cs r4 = (X.C2158008cs) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 != r5) goto L67
            kotlin.jvm.functions.Function0 r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            LIZ()
            r7.invoke()
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.0q6K r0 = X.C1529590puH.LIZ
            java.lang.String r0 = "ec_mmk_preload"
            X.0dTN r0 = X.C1537060q6K.LJI(r0)
            if (r0 == 0) goto L2a
            android.util.LruCache<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.SoftReference<X.0qCa>>> r0 = r0.LJIIJ
            if (r0 == 0) goto L2a
            java.util.Map r0 = r0.snapshot()
            if (r0 == 0) goto L2a
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2a
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.08nu r1 = new X.08nu
            r0 = 0
            r1.<init>(r0)
            r4.LL = r7
            r4.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r2, r1)
            if (r0 != r3) goto L24
            return r3
        L61:
            X.08cs r4 = new X.08cs
            r4.<init>(r6, r8)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770900wBU.LIZIZ(kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    public static void LJIILLIIL(List list, EnumC1768470w7Z enumC1768470w7Z, C1772750wET c1772750wET) {
        if (LJII()) {
            LJIIL();
        }
        if (list != null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preDecode, scene=");
            sbLIZ.append(enumC1768470w7Z);
            sbLIZ.append(", thread=");
            sbLIZ.append(C786410Ut5.u3());
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            if (c1772750wET == null) {
                c1772750wET = LJIIIIZZ;
            }
            if (enumC1768470w7Z == EnumC1768470w7Z.BEFORE_MALL && c1772750wET != null) {
                c1772750wET.LJLILLLLZI = System.currentTimeMillis();
            }
            C1770900wBU c1770900wBU = LIZ;
            AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(list, (List<ECMixMallCardConfig>) c1772750wET, (C1772750wET) 91);
            c1770900wBU.getClass();
            LIZJ(awS427S0200000_26);
        }
    }

    public static void LIZLLL(EnumC1768470w7Z enumC1768470w7Z, List list, InterfaceC599750Nfh interfaceC599750Nfh, C1772750wET c1772750wET) {
        if (list.isEmpty()) {
            return;
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executePreloadV2, ");
        sbLIZ.append(enumC1768470w7Z);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1768460w7Y(list, null, c1772750wET, interfaceC599750Nfh, null), 2);
    }

    public static void LJIILL(List list, EnumC1768470w7Z enumC1768470w7Z, C1772750wET c1772750wET, InterfaceC599750Nfh interfaceC599750Nfh) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preCreateContainer, scene=");
        sbLIZ.append(enumC1768470w7Z);
        sbLIZ.append(", thread=");
        sbLIZ.append(C786410Ut5.u3());
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        if (LJII()) {
            LJIILIIL(interfaceC599750Nfh);
        }
        if (c1772750wET == null) {
            c1772750wET = LJIIIIZZ;
        }
        if (enumC1768470w7Z == EnumC1768470w7Z.BEFORE_MALL && c1772750wET != null) {
            c1772750wET.LJL = System.currentTimeMillis();
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            C1770900wBU c1770900wBU = LIZ;
            AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26((List) arrayList, (List<ECMixMallCardConfig>) c1772750wET, (C1772750wET) 90);
            c1770900wBU.getClass();
            LIZJ(awS427S0200000_26);
        }
    }
}
