package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aikit.api.common.AIConfigService;
import com.ss.android.ugc.aweme.aikit.api.common.AIResourceService;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0LdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547360LdO {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final C547360LdO LIZ = new C547360LdO();
    public static final Object LIZLLL = new Object();

    public static void LIZ() {
        Object c098200Yq;
        Iterable<InterfaceC547540Ldg> services;
        try {
            c098200Yq = Class.forName("com.ss.android.ugc.aweme.tools.aab.CameraBizDFServiceImpl");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        boolean z = c098200Yq != null;
        boolean z2 = true;
        for (C110900bT c110900bT : C547390LdR.LIZ) {
            try {
                Class<? extends InterfaceC547540Ldg> cls = c110900bT.LIZ;
                if (!(cls instanceof Class) || cls == null) {
                    return;
                }
                if (!c110900bT.LIZIZ) {
                    services = ServiceManager.get().getServices(cls, true);
                } else if (z) {
                    String str = c110900bT.LIZJ;
                    if (str == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DF registrar ");
                        sbLIZ.append(cls.getName());
                        sbLIZ.append(" requires dynamicFeatureImplClassName");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalArgumentException(strLIZIZ);
                    }
                    InterfaceC547540Ldg interfaceC547540Ldg = (InterfaceC547540Ldg) C0WYG.LIZ(cls, str);
                    C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("spi for ");
                    sbLIZ2.append(cls);
                    sbLIZ2.append(", result:");
                    sbLIZ2.append(interfaceC547540Ldg);
                    c547140Ld2.LIZJ("AIGCConfigRegistrarResolver", C2188811AlT.LIZIZ(sbLIZ2));
                    services = C1697810uHb.LJIIL(interfaceC547540Ldg);
                } else {
                    services = C13BV.INSTANCE;
                }
                for (InterfaceC547540Ldg interfaceC547540Ldg2 : services) {
                    interfaceC547540Ldg2.LIZ(LIZ);
                    C547140Ld2 c547140Ld22 = C546820LcW.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("register: ");
                    sbLIZ3.append(interfaceC547540Ldg2);
                    c547140Ld22.LIZJ("AIGCConfigRegistrarResolver", C2188811AlT.LIZIZ(sbLIZ3));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C547140Ld2 c547140Ld23 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("register failed: ");
                sbLIZ4.append(c110900bT.LIZ.getName());
                c547140Ld23.LIZIZ("AIGCConfigRegistrarResolver", C2188811AlT.LIZIZ(sbLIZ4), th2);
                z2 = false;
            }
        }
        LIZIZ = z2;
    }

    public static final AIConfigService LIZIZ() {
        AIConfigService aIConfigService = (AIConfigService) PluggableExtentionKt.pluggableSpi$default(AIConfigService.class, false, false, false, 14, null);
        return aIConfigService == null ? C547340LdM.LIZ : aIConfigService;
    }

    public static final AIQuotaService LIZJ() {
        AIQuotaService aIQuotaService = (AIQuotaService) PluggableExtentionKt.pluggableSpi$default(AIQuotaService.class, false, false, false, 14, null);
        return aIQuotaService == null ? C547570Ldj.LIZ : aIQuotaService;
    }

    public static final AIResourceService LIZLLL() {
        AIResourceService aIResourceService = (AIResourceService) PluggableExtentionKt.pluggableSpi$default(AIResourceService.class, false, false, false, 14, null);
        return aIResourceService == null ? C547370LdP.LIZ : aIResourceService;
    }
}
