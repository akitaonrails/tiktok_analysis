package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.experiment.UcpNetworkRequestFailedExperimentConfig;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.experiment.UploadRequestInfoConfig;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C196200pE {
    public static final C196200pE LIZ = new C196200pE();
    public static final UcpNetworkRequestFailedExperimentConfig LIZIZ = new UcpNetworkRequestFailedExperimentConfig(0, null, 3, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(479));

    public static final boolean LIZ(String str, String str2, String str3, String str4) {
        boolean zLJFF;
        Object c098200Yq;
        LIZ.getClass();
        List<UploadRequestInfoConfig> list = ((UcpNetworkRequestFailedExperimentConfig) LIZJ.getValue()).uploadRequestInfoConfigs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (UploadRequestInfoConfig uploadRequestInfoConfig : list) {
                LIZ.getClass();
                String str5 = uploadRequestInfoConfig.path;
                if (str5 != null && !a0.LJJJIL(str5) && Intrinsics.LJFF(uploadRequestInfoConfig.path, str)) {
                    String str6 = uploadRequestInfoConfig.host;
                    if (str6 != null && !a0.LJJJIL(str6)) {
                        String str7 = uploadRequestInfoConfig.host;
                        if (a0.LJJJIL(str7)) {
                            continue;
                        } else {
                            if (!u.LJJIIJZLJL(str7, "re:", false)) {
                                zLJFF = Intrinsics.LJFF(str2, str7);
                            } else {
                                try {
                                    c098200Yq = new Regex(a0.LJJJJZ("re:", str7));
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                    c098200Yq = null;
                                }
                                Regex regex = (Regex) c098200Yq;
                                if (regex != null) {
                                    zLJFF = regex.matches(str2);
                                } else {
                                    continue;
                                }
                            }
                            if (!zLJFF) {
                                continue;
                            }
                        }
                    }
                    List<String> list2 = uploadRequestInfoConfig.errorTypes;
                    if (list2 == null || list2.isEmpty() || uploadRequestInfoConfig.errorTypes.contains(str3)) {
                        List<String> list3 = uploadRequestInfoConfig.toolNames;
                        if (list3 != null && !list3.isEmpty()) {
                            if (str4 != null && str4.length() != 0 && uploadRequestInfoConfig.toolNames.contains(str4)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
