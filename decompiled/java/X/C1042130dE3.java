package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.recording.js.RecordingNativeContextHandler;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS0S4000000_16;
import kotlin.jvm.internal.AwS35S1110000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dE3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042130dE3 implements InterfaceC1042100dE0 {
    public static final C1042130dE3 LIZ = new C1042130dE3();
    public static final C1042310dEL LIZIZ = new C1042310dEL();
    public static final List<String> LIZJ = Collections.synchronizedList(new ArrayList());
    public static final Set<String> LIZLLL = Collections.synchronizedSet(new LinkedHashSet());
    public static final C1042250dEF LJ = new C1042250dEF();
    public static C1042120dE2 LJFF;

    public static void LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            Set<String> set = LIZLLL;
            set.add(str);
            if (set.size() > 50) {
                set.clear();
            }
        }
    }

    public static String LJFF(String str) {
        String host;
        try {
            host = UriProtector.parse(str).getHost();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (host == null) {
            return "";
        }
        return host;
    }

    public static void LJIIJ(C1042120dE2 c1042120dE2) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentRules change, newDomain: ");
        sbLIZ.append(c1042120dE2.LIZ);
        sbLIZ.append(", oldDomain: ");
        C1042120dE2 c1042120dE22 = LJFF;
        if (c1042120dE22 != null) {
            str = c1042120dE22.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        LJFF = c1042120dE2;
    }

    public static boolean LJI(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        String strLJFF = LJFF(str);
        if (strLJFF.length() == 0 || u.LJIIZILJ(strLJFF, str2, false)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1042100dE0
    public final C1042120dE2 LIZ(C1035880d3y c1035880d3y, String str) {
        boolean z;
        String str2;
        C1042120dE2 c1042120dE2 = LJFF;
        List<String> list = LIZJ;
        if (!list.contains(str)) {
            if (c1042120dE2 != null) {
                z = true;
                str2 = c1042120dE2.LJI;
                if (str2 == null) {
                }
                new AdWebEventLogger(c1035880d3y).logAd(C1E1Z.LIZ, c1035880d3y.getAwemeRawAd(), new AwS35S1110000_16(c1035880d3y, str2, z, 3));
                list.add(str);
            } else {
                z = false;
            }
            str2 = "";
            new AdWebEventLogger(c1035880d3y).logAd(C1E1Z.LIZ, c1035880d3y.getAwemeRawAd(), new AwS35S1110000_16(c1035880d3y, str2, z, 3));
            list.add(str);
        }
        if (c1042120dE2 != null) {
            return c1042120dE2;
        }
        return null;
    }

    public static final boolean LJIIJJI(AwemeRawAd awemeRawAd, String str, boolean z) {
        IAdWebUtils iAdWebUtils;
        if (str == null || !C1042260dEG.LIZ().enable || awemeRawAd == null || !C1035990d49.LIZJ(awemeRawAd.getFeature())) {
            return false;
        }
        if ((awemeRawAd.isOpenSystemBrowser() && (((iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null)) == null || !iAdWebUtils.Wu(awemeRawAd)) && !z)) || LIZLLL.contains(str) || LIZIZ.LIZ(str) != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0dE5, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJ(AwemeRawAd awemeRawAd, String str, String str2, boolean z) {
        if (!LJIIJJI(awemeRawAd, str, false)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C259800zU c259800zU = new C259800zU();
        if (z) {
            ?? c1042150dE5 = new C1042150dE5();
            c259800zU.element = c1042150dE5;
            LJ.LIZ(c1042150dE5);
        }
        final C1042140dE4 c1042140dE4 = new C1042140dE4(str, str2, jCurrentTimeMillis, awemeRawAd, c259800zU);
        C1042900dFI c1042900dFI = C1042900dFI.LIZ;
        C1042900dFI.LIZIZ(new InterfaceC1042180dE8() { // from class: X.0dE6
            @Override // X.InterfaceC1042180dE8
            public final void LIZ(String str3, Map<String, SSPResponse.Data> map, Map<String, ? extends List<SSPResponse.Rule>> map2) {
                c1042140dE4.invoke(map2);
            }
        }, new C1042950dFN("tt_hybrid_commerce", 1, true, true, 36), str);
    }

    public static void LIZJ(String str, String str2, List list, AwemeRawAd awemeRawAd, String str3) {
        Object c098200Yq;
        if (!LJI(str, str2)) {
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = C1227904rF.LJI(list);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            new AdWebEventLogger().logAd(C1E1Z.LIZ, awemeRawAd, new AwS0S4000000_16(str3, str, str2, (String) c098200Yq, 4));
        }
    }

    public static void LJIIIIZZ(String str, Map map, String str2, long j, AwemeRawAd awemeRawAd) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRecordingResult: ");
        sbLIZ.append(map);
        sbLIZ.append(" mainUrl: ");
        sbLIZ.append(C13LN.LJZL(100, str));
        sbLIZ.append(" scene: ");
        sbLIZ.append(str2);
        sbLIZ.append(" cost: ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(" rawAd is null: ");
        if (awemeRawAd == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (map != null) {
            List list = (List) C13LP.LJJJLIIL(map.values());
            if (list != null) {
                LIZIZ.LIZIZ(C1042110dE1.LIZ(LJFF(str), (String) C13LP.LJJJLIIL(map.keySet()), str2, list));
                LIZJ(str, (String) C13LP.LJJJLIIL(map.keySet()), list, awemeRawAd, str2);
                LJII(true, str, "", str2, jCurrentTimeMillis, awemeRawAd);
                return;
            } else {
                LIZIZ(str);
                LJII(false, str, "rule_values_empty", str2, jCurrentTimeMillis, awemeRawAd);
                return;
            }
        }
        LJII(false, str, "result_null", str2, jCurrentTimeMillis, awemeRawAd);
    }

    public final void LJIIIZ(String str, String str2, C1035880d3y c1035880d3y, String str3, Boolean bool) {
        FeatureCenterModel feature;
        String webUrl;
        String webUrl2;
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        String strLJZL = null;
        C1042450dEZ.LIZ.getClass();
        if (c1035880d3y != null && C1042450dEZ.LIZLLL(c1035880d3y)) {
            RecordingNativeContextHandler recordingNativeContextHandler = C1042450dEZ.LIZJ;
            AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd2 == null || (creativeIdStr = awemeRawAd2.getCreativeIdStr()) == null) {
                creativeIdStr = "";
            }
            recordingNativeContextHandler.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!C1039940dAW.LIZ("GET", str2)) {
                C23250099c.LIZLLL(C817503Hh.LL, (AbstractC23273099z) recordingNativeContextHandler.LIZ.getValue(), null, new C08YB(str, str2, recordingNativeContextHandler, jCurrentTimeMillis, creativeIdStr, null), 2);
            }
        }
        if (!C1042260dEG.LIZ().enable) {
            return;
        }
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null) {
            feature = awemeRawAd.getFeature();
        } else {
            feature = null;
        }
        if (C1035990d49.LIZJ(feature) && c1035880d3y != null && str != null && str.length() != 0) {
            AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd3 != null && (webUrl2 = awemeRawAd3.getWebUrl()) != null && webUrl2.length() != 0) {
                if (C1039940dAW.LIZ(str2, "load_url")) {
                    LJ.LIZ(new C1042300dEK(c1035880d3y.getAwemeRawAd(), str));
                }
                if (LJFF == null && LJ.LIZIZ.get() <= 0) {
                    return;
                }
                if (Intrinsics.LJFF(str2, "GET") && !C1042260dEG.LIZ().enableLoadingGetMatch && !c1035880d3y.isLoadFinish()) {
                    return;
                }
                final C1042410dEV c1042410dEVLIZLLL = LIZLLL(webUrl2, str, str2, c1035880d3y, str3, bool);
                LJ.LIZ(new Runnable(c1042410dEVLIZLLL, this) { // from class: X.0dDz
                    public static final /* synthetic */ int LLILLL = 0;
                    public final C1042410dEV LL;
                    public final InterfaceC1042100dE0 LLILLJJLI;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("RecordingRuleMatchTask@cd37.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("RecordingRuleMatchTask@cd37.run");
                    }

                    public final void LIZ() {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        InterfaceC1042100dE0 interfaceC1042100dE0 = this.LLILLJJLI;
                        C1042410dEV c1042410dEV = this.LL;
                        C1042120dE2 c1042120dE2LIZ = interfaceC1042100dE0.LIZ(c1042410dEV.LJFF, c1042410dEV.LIZ);
                        if (c1042120dE2LIZ == null) {
                            return;
                        }
                        C1042410dEV c1042410dEV2 = this.LL;
                        String str4 = c1042410dEV2.LIZIZ;
                        String str5 = c1042410dEV2.LIZLLL;
                        int i = 0;
                        for (SSPResponse.Rule rule : Intrinsics.LJFF(str5, "GET") ? c1042120dE2LIZ.LIZJ : Intrinsics.LJFF(str5, "POST") ? c1042120dE2LIZ.LIZLLL : c1042120dE2LIZ.LJ) {
                            String str6 = rule.regex;
                            String str7 = rule.name;
                            if (str6 != null && str6.length() != 0 && C1039940dAW.LIZ(rule.type, this.LL.LIZLLL)) {
                                i++;
                                if (new Regex(str6).containsMatchIn(str4)) {
                                    C1042400dEU.LIZ(str7, str6, c1042120dE2LIZ.LJFF, i, System.currentTimeMillis() - jCurrentTimeMillis2, this.LL);
                                    return;
                                }
                            }
                        }
                    }

                    {
                        this.LL = c1042410dEVLIZLLL;
                        this.LLILLJJLI = this;
                    }
                });
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mainUrl empty! method: ");
            sbLIZ.append(str2);
            sbLIZ.append(", url: ");
            sbLIZ.append(str);
            sbLIZ.append(" mainUrl: ");
            AwemeRawAd awemeRawAd4 = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd4 != null && (webUrl = awemeRawAd4.getWebUrl()) != null) {
                strLJZL = C13LN.LJZL(100, webUrl);
            }
            sbLIZ.append(strLJZL);
            sbLIZ.append(" , adWebModel: ");
            sbLIZ.append(c1035880d3y);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static C1042410dEV LIZLLL(String str, String str2, String str3, C1035880d3y c1035880d3y, String str4, Boolean bool) {
        String strLIZIZ;
        String currentUrlOrWebUrl = c1035880d3y.getCurrentUrlOrWebUrl();
        String str5 = "";
        if (currentUrlOrWebUrl == null) {
            currentUrlOrWebUrl = "";
        }
        C1035880d3y c1035880d3yCustomCopy = c1035880d3y.customCopy();
        int iIncrementAndGet = c1035880d3y.getRecordingModel().eventIndex.incrementAndGet();
        String containerId = c1035880d3y.getContainerId();
        if (containerId == null) {
            containerId = "";
        }
        IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider = (IAdLandPageEngageInfoProvider) PluggableExtentionKt.pluggableSpi$default(IAdLandPageEngageInfoProvider.class, false, false, false, 14, null);
        if (iAdLandPageEngageInfoProvider != null && (strLIZIZ = iAdLandPageEngageInfoProvider.LIZIZ(c1035880d3y.getRealCreativeIdStr())) != null) {
            str5 = strLIZIZ;
        }
        c1035880d3y.getRealCreativeIdStr();
        c1035880d3y.getRealLogExtra();
        return new C1042410dEV(str, str2, currentUrlOrWebUrl, str3, str4, c1035880d3yCustomCopy, iIncrementAndGet, containerId, str5, bool, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    }

    public static void LJII(boolean z, String str, String str2, String str3, long j, AwemeRawAd awemeRawAd) {
        String str4;
        if (z) {
            str4 = "success";
        } else {
            str4 = "fail";
        }
        new AdWebEventLogger().logAd(C1E1Z.LIZ, awemeRawAd, new C1052810dVH(j, str4, str2, str3, str));
    }
}
