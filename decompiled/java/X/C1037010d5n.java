package X;

import Y.ARunnableS9S1000000_16;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.prewarm.IABJitGcOptExperiment;
import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmExperiment;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.PreWarmAdSparkHybridContext;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.android.ugc.aweme.spark.IThirdPartyUtilService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AFwS339S0000000_16;
import kotlin.jvm.internal.AwS68S0210000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0d5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037010d5n {
    public static boolean LIZIZ;
    public static boolean LJ;
    public static C1037070d5t LJFF;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILJJIL;
    public static final C1037010d5n LIZ = new C1037010d5n();
    public static String LIZJ = "init";
    public static final C11PQ<Object> LIZLLL = new C11PQ<>();
    public static final List<C1024760cm2> LJI = new ArrayList();
    public static final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC1016910cZN LJIIIIZZ = RunnableC1016910cZN.LL;
    public static final RunnableC1016810cZD LJIIIZ = RunnableC1016810cZD.LL;
    public static EnumC1016770cZ9 LJIILIIL = EnumC1016770cZ9.UNKNOWN;
    public static final C01GW LJIILL = C452501pT.LIZIZ(new C1037100d5w());
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(new C1024800cm6());
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(new C1037030d5p());
    public static final C1016710cZ3 LJIJ = new InterfaceC1024370clP() { // from class: X.0cZ3
        @Override // X.InterfaceC1024370clP
        public final void LIZ() {
        }

        @Override // X.InterfaceC1024370clP
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1024370clP
        public final void LIZLLL() {
        }

        @Override // X.InterfaceC1024370clP
        public final void LIZJ() {
            C1037010d5n.LIZLLL.onNext(new Object());
        }
    };

    public static List LJ() {
        return (List) LJIIZILJ.getValue();
    }

    public static boolean LJFF() {
        return LJIIL && LIZIZ;
    }

    public static String LIZJ() {
        String str = LandPageWarmExperiment.LIZIZ().portraitTag;
        if (C123100dR.LIZ(str)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("waitWebviewCreate-");
        sbLIZ.append(LandPageWarmExperiment.LIZIZ().waitForWebviewCreate);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1037080d5u LIZ(boolean z) {
        String str;
        C0CFU c0cfu;
        if (z) {
            str = "iab_land_page_pre_warm_third_page_biz";
        } else {
            str = "iab_land_page_pre_warm_first_page_biz";
        }
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = str;
        c1097680efe.LJIJ = 1;
        c1097680efe.LJ = true;
        c1097680efe.LJIIIIZZ = AFwS300S0000000_16.get$arr$(5);
        c1097680efe.LJIIIZ = AFwS339S0000000_16.get$arr$(0);
        c1097680efe.LJIJJ = AFwS339S0000000_16.get$arr$(1);
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        if (z) {
            c0cfu = C0CFU.THIRD;
        } else {
            c0cfu = C0CFU.FIRST;
        }
        return new C1037080d5u(str, c0cfu, AFwS252S0000000_16.get$arr$(81));
    }

    public static boolean LJI(FeatureCenterModel featureCenterModel) {
        Integer num;
        if (featureCenterModel != null && (num = featureCenterModel.landingPagePrewarmType) != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJII(Long l) {
        if (l != null) {
            if (l.longValue() == 7 || l.longValue() == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Boolean LJIIIIZZ(String str) {
        String strLIZIZ;
        boolean z;
        if (str == null || (strLIZIZ = a0.LJLIIIL(str).toString()) == null) {
            strLIZIZ = "";
        }
        boolean z2 = false;
        if (strLIZIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = null;
        if (z) {
            return null;
        }
        if (!u.LJJIIJZLJL(strLIZIZ, "http://", false) && !u.LJJIIJZLJL(strLIZIZ, "https://", false)) {
            try {
                String scheme = UriProtector.parse(strLIZIZ).getScheme();
                if (scheme == null || scheme.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                IThirdPartyUtilService iThirdPartyUtilService = (IThirdPartyUtilService) PluggableExtentionKt.pluggableSpi$default(IThirdPartyUtilService.class, false, false, false, 14, null);
                if (iThirdPartyUtilService == null) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(iThirdPartyUtilService.LIZLLL(strLIZIZ));
                return boolValueOf;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return boolValueOf;
            }
        }
        IThirdPartyUtilService iThirdPartyUtilService2 = (IThirdPartyUtilService) PluggableExtentionKt.pluggableSpi$default(IThirdPartyUtilService.class, false, false, false, 14, null);
        if (iThirdPartyUtilService2 == null) {
            return null;
        }
        return Boolean.valueOf(iThirdPartyUtilService2.LIZLLL(strLIZIZ));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJ(java.lang.String r7) {
        /*
            java.lang.System.currentTimeMillis()
            r6 = 1
            r2 = 0
            if (r7 == 0) goto L53
            int r0 = r7.length()
            if (r0 == 0) goto L53
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r5 = kotlin.text.a0.LJJLIIIJILLIZJL(r7, r1, r2, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L1f
            return r2
        L1f:
            java.lang.String r0 = "1"
            boolean r4 = r5.contains(r0)
            java.lang.String r0 = "2"
            boolean r3 = r5.contains(r0)
            java.lang.String r0 = "3"
            boolean r2 = r5.contains(r0)
            X.0cZ9 r0 = X.C1037010d5n.LJIILIIL
            int[] r1 = X.C1016760cZ8.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L47;
                case 2: goto L47;
                case 3: goto L47;
                case 4: goto L44;
                case 5: goto L46;
                case 6: goto L49;
                default: goto L3e;
            }
        L3e:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L44:
            r4 = r3
            goto L47
        L46:
            r4 = r2
        L47:
            if (r4 != 0) goto L52
        L49:
            java.lang.String r0 = "0"
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L52
            r6 = 0
        L52:
            return r6
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1037010d5n.LJIIJ(java.lang.String):boolean");
    }

    public static View LJIIL(C1035880d3y c1035880d3y) {
        Long l;
        C1037070d5t c1037070d5t;
        AwemeRawAd awemeRawAd;
        FeatureCenterModel feature;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (feature = awemeRawAd.getFeature()) != null) {
            l = feature.pricingType;
        } else {
            l = null;
        }
        if (LJII(l) && (c1037070d5t = LJFF) != null) {
            C1037020d5o c1037020d5o = c1037070d5t.LIZIZ;
            View view = c1037020d5o.LIZ;
            c1037020d5o.LIZ = null;
            if (view != null) {
                C1035940d44.LIZ.getClass();
                C1035940d44.LIZ(c1035880d3y, 16L);
                return view;
            }
        }
        return null;
    }

    public static final SparkFragment LJIILIIL(C1035880d3y c1035880d3y) {
        Long l;
        C1037070d5t c1037070d5t;
        AwemeRawAd awemeRawAd;
        FeatureCenterModel feature;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (feature = awemeRawAd.getFeature()) != null) {
            l = feature.pricingType;
        } else {
            l = null;
        }
        if (LJII(l) && (c1037070d5t = LJFF) != null) {
            C1037050d5r c1037050d5r = c1037070d5t.LIZ;
            SparkFragment sparkFragment = c1037050d5r.LIZ;
            c1037050d5r.LIZ = null;
            if (sparkFragment != null) {
                C1035940d44.LIZ.getClass();
                C1035940d44.LIZ(c1035880d3y, 8L);
                return sparkFragment;
            }
        }
        return null;
    }

    public static C1035680d3e LJIILL(C1035880d3y c1035880d3y) {
        Long l;
        C1037070d5t c1037070d5t;
        AwemeRawAd awemeRawAd;
        FeatureCenterModel feature;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (feature = awemeRawAd.getFeature()) != null) {
            l = feature.pricingType;
        } else {
            l = null;
        }
        if (LJII(l) && (c1037070d5t = LJFF) != null) {
            C1037020d5o c1037020d5o = c1037070d5t.LIZIZ;
            C1035680d3e c1035680d3e = c1037020d5o.LIZIZ;
            c1037020d5o.LIZIZ = null;
            if (c1035680d3e != null) {
                C1035940d44.LIZ.getClass();
                C1035940d44.LIZ(c1035880d3y, 16L);
                return c1035680d3e;
            }
        }
        return null;
    }

    public static final List<View> LJIILLIIL(C1035880d3y c1035880d3y) {
        Long l;
        C1037070d5t c1037070d5t;
        AwemeRawAd awemeRawAd;
        FeatureCenterModel feature;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (feature = awemeRawAd.getFeature()) != null) {
            l = feature.pricingType;
        } else {
            l = null;
        }
        if (LJII(l) && (c1037070d5t = LJFF) != null) {
            C1037020d5o c1037020d5o = c1037070d5t.LIZIZ;
            List<View> listLJIIJJI = C1697810uHb.LJIIJJI(c1037020d5o.LIZLLL, c1037020d5o.LIZJ, c1037020d5o.LJ);
            C1037020d5o c1037020d5o2 = c1037070d5t.LIZIZ;
            c1037020d5o2.LIZLLL = null;
            c1037020d5o2.LIZJ = null;
            c1037020d5o2.LJ = null;
            if (listLJIIJJI != null) {
                C1035940d44.LIZ.getClass();
                C1035940d44.LIZ(c1035880d3y, 16L);
                return listLJIIJJI;
            }
        }
        return null;
    }

    public static final void LJIIZILJ(C1035880d3y c1035880d3y) {
        C1035940d44.LIZ.getClass();
        if (C1035940d44.LIZIZ) {
            C1035940d44.LIZ(c1035880d3y, 1L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(boolean r12) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1037010d5n.LJIJ(boolean):void");
    }

    public static final void LIZIZ(AwemeRawAd awemeRawAd, boolean z) {
        Long l;
        IOptimizerHelperService iOptimizerHelperService;
        long j;
        long j2;
        FeatureCenterModel feature;
        if (awemeRawAd != null && (feature = awemeRawAd.getFeature()) != null) {
            l = feature.pricingType;
        } else {
            l = null;
        }
        if (!LJII(l) || (iOptimizerHelperService = (IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)) == null) {
            return;
        }
        if (z) {
            j = IABJitGcOptExperiment.LIZ().enableBlockJitMsLoadUrl;
            j2 = IABJitGcOptExperiment.LIZ().enableBlockGcMsLoadUrl;
        } else {
            j = IABJitGcOptExperiment.LIZ().enableBlockJitMs;
            j2 = IABJitGcOptExperiment.LIZ().enableBlockGcMs;
        }
        if (j > 0) {
            IABJitGcOptExperiment.LIZ();
            iOptimizerHelperService.LJIIIIZZ();
        }
        if (j2 > 0) {
            ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LJII(IABJitGcOptExperiment.LIZ().enableBlockGcMs, 2, 8);
        }
    }

    public static final PreWarmAdSparkHybridContext LJIILJJIL(C1035880d3y c1035880d3y, String str) {
        Object next;
        C1037080d5u c1037080d5u;
        PreWarmAdSparkHybridContext preWarmAdSparkHybridContext;
        String str2;
        PreWarmAdSparkHybridContext preWarmAdSparkHybridContext2 = null;
        if (str == null || !LJFF()) {
            return null;
        }
        if (!LandPageWarmExperiment.LIZIZ().enablePreWarmFirstParty && !LandPageWarmExperiment.LIZIZ().enablePreWarmThirdParty) {
            return null;
        }
        Iterator it2 = LJ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC1037120d5y interfaceC1037120d5y = (InterfaceC1037120d5y) next;
                if (interfaceC1037120d5y instanceof C1037080d5u) {
                    PreWarmAdSparkHybridContext preWarmAdSparkHybridContext3 = ((C1037080d5u) interfaceC1037120d5y).LJFF;
                    if (preWarmAdSparkHybridContext3 != null) {
                        str2 = preWarmAdSparkHybridContext3.containerId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        if ((next instanceof C1037080d5u) && (c1037080d5u = (C1037080d5u) next) != null && (preWarmAdSparkHybridContext = c1037080d5u.LJFF) != null) {
            preWarmAdSparkHybridContext.hasPreWarmLoadUrl = C1043080dFa.LIZJ;
            c1037080d5u.LJFF = null;
            preWarmAdSparkHybridContext2 = preWarmAdSparkHybridContext;
            C1035940d44.LIZ.getClass();
            C1035940d44.LIZ(c1035880d3y, 2L);
            if (preWarmAdSparkHybridContext2.hasPreWarmLoadUrl) {
                C1035940d44.LIZ(c1035880d3y, 4L);
            }
        }
        return preWarmAdSparkHybridContext2;
    }

    public final PreWarmAdSparkHybridContext LIZLLL(AwemeRawAd awemeRawAd, String str) {
        String strLJIIJJI;
        Object next;
        C1037080d5u c1037080d5u;
        String str2;
        if (!LJFF()) {
            return null;
        }
        if ((!LandPageWarmExperiment.LIZIZ().enablePreWarmFirstParty && !LandPageWarmExperiment.LIZIZ().enablePreWarmThirdParty) || (strLJIIJJI = LJIIJJI(awemeRawAd, str, "", false)) == null) {
            return null;
        }
        Iterator it2 = LJ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC1037120d5y interfaceC1037120d5y = (InterfaceC1037120d5y) next;
                if (interfaceC1037120d5y instanceof C1037080d5u) {
                    PreWarmAdSparkHybridContext preWarmAdSparkHybridContext = ((C1037080d5u) interfaceC1037120d5y).LJFF;
                    if (preWarmAdSparkHybridContext != null) {
                        str2 = preWarmAdSparkHybridContext.containerId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, strLJIIJJI)) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C1037080d5u) || (c1037080d5u = (C1037080d5u) next) == null) {
            return null;
        }
        return c1037080d5u.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIZ(PreWarmAdSparkHybridContext preWarmAdSparkHybridContext, boolean z, String str, AwemeRawAd awemeRawAd) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "hit";
        if (preWarmAdSparkHybridContext == null) {
            int length = str.length();
            T t = str;
            if (length == 0) {
                t = LIZJ;
            }
            c259800zU.element = t;
        }
        if (z) {
            if (!LandPageWarmExperiment.LIZIZ().enablePreWarmThirdParty) {
                c259800zU.element = "third_not_enable";
            }
        } else if (!LandPageWarmExperiment.LIZIZ().enablePreWarmFirstParty) {
            c259800zU.element = "first_not_enable";
        }
        C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
        C1042680dEw.LIZ.getClass();
        c1001830cB3.log(C1042680dEw.LJIIJ, new AwS68S0210000_16(c259800zU, (C259800zU<String>) z, (boolean) awemeRawAd, (AwemeRawAd) 0));
    }

    public static final String LJIIJJI(AwemeRawAd awemeRawAd, String str, String str2, boolean z) {
        FeatureCenterModel feature;
        boolean zLJFF;
        boolean z2;
        boolean z3;
        Object next;
        C1037080d5u c1037080d5u;
        PreWarmAdSparkHybridContext preWarmAdSparkHybridContext;
        boolean z4;
        Long l;
        Integer num;
        if (!LJFF()) {
            return null;
        }
        if (!LandPageWarmExperiment.LIZIZ().enablePreWarmFirstParty && !LandPageWarmExperiment.LIZIZ().enablePreWarmThirdParty) {
            return null;
        }
        if (awemeRawAd != null) {
            feature = awemeRawAd.getFeature();
        } else {
            feature = null;
        }
        boolean z5 = false;
        if (awemeRawAd != null) {
            zLJFF = Intrinsics.LJFF(awemeRawAd.isServerRedirection(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            return null;
        }
        if (str != null && u.LJJIIJZLJL(str, "aweme://webview", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            try {
                str = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                str = "";
            }
        }
        if (str != null && str.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            return null;
        }
        Boolean boolLJIIIIZZ = LJIIIIZZ(str);
        if (boolLJIIIIZZ == null) {
            if (z) {
                LJIIIZ(null, false, "cannot-judge-url-type", awemeRawAd);
            }
            return null;
        }
        if (!LJI(feature)) {
            if (feature != null) {
                l = feature.pricingType;
            } else {
                l = null;
            }
            if (z) {
                boolean zBooleanValue = boolLJIIIIZZ.booleanValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prewarmClose-type-");
                if (feature != null) {
                    num = feature.landingPagePrewarmType;
                } else {
                    num = null;
                }
                sbLIZ.append(num);
                sbLIZ.append("-priceType-");
                sbLIZ.append(l);
                LJIIIZ(null, zBooleanValue, C2188811AlT.LIZIZ(sbLIZ), awemeRawAd);
            }
            return null;
        }
        Iterator it2 = LJ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC1037120d5y interfaceC1037120d5y = (InterfaceC1037120d5y) next;
                if ((interfaceC1037120d5y instanceof C1037080d5u) && Intrinsics.LJFF(Boolean.valueOf(((C1037080d5u) interfaceC1037120d5y).LIZLLL), boolLJIIIIZZ)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof C1037080d5u) {
            c1037080d5u = (C1037080d5u) next;
        } else {
            c1037080d5u = null;
        }
        if (c1037080d5u != null) {
            preWarmAdSparkHybridContext = c1037080d5u.LJFF;
        } else {
            preWarmAdSparkHybridContext = null;
        }
        if (z) {
            LJIIIZ(preWarmAdSparkHybridContext, boolLJIIIIZZ.booleanValue(), "", awemeRawAd);
        }
        if (str2.length() > 0) {
            z5 = true;
        }
        if (z5 && preWarmAdSparkHybridContext != null) {
            C2487409ou.LIZJ(new ARunnableS9S1000000_16(str2, 3));
        }
        if (preWarmAdSparkHybridContext == null) {
            return null;
        }
        return preWarmAdSparkHybridContext.containerId;
    }
}
