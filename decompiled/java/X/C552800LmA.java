package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowDownloadConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowPollingConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowQuotaConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowServerConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.I2VOfflineProcessingPostProcessingConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.I2VOfflineProcessingTemplateDownloadConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS332S0000000_8;

/* JADX INFO: renamed from: X.0LmA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552800LmA {
    public static final C552800LmA LIZ = new C552800LmA();
    public static final Map<String, C552810LmB> LIZIZ = new ConcurrentHashMap();
    public static final C2252321DDq LIZJ = C1BNE.LIZ(C08CX.INSTANCE);
    public static volatile boolean LIZLLL;

    public static void LIZJ() {
        List<InterfaceC552840LmE> listLLIIII;
        boolean z;
        LIZIZ("AIGCLegacyWorkflowServerNode", AIGCWorkflowServerConfig.class, AFwS332S0000000_8.get$arr$(4));
        LIZIZ("AIGCWorkflowServerNode", C551940Lkm.class, AFwS332S0000000_8.get$arr$(5));
        LIZIZ("AIGCWorkflowDownloadNode", AIGCWorkflowDownloadConfig.class, AFwS332S0000000_8.get$arr$(6));
        LIZIZ("AIGCWorkflowPollingNode", AIGCWorkflowPollingConfig.class, AFwS332S0000000_8.get$arr$(7));
        LIZIZ("I2VOfflineProcessingTemplateDownloadNode", I2VOfflineProcessingTemplateDownloadConfig.class, AFwS332S0000000_8.get$arr$(8));
        LIZIZ("I2VOfflineProcessingPostProcessingNode", I2VOfflineProcessingPostProcessingConfig.class, AFwS332S0000000_8.get$arr$(9));
        LIZIZ("AIGCWorkflowQuotaNode", AIGCWorkflowQuotaConfig.class, AFwS332S0000000_8.get$arr$(10));
        LIZIZ("AIGCWorkflowUploadNode", C551950Lkn.class, AFwS332S0000000_8.get$arr$(11));
        Set services = ServiceManager.get().getServices(InterfaceC552840LmE.class, true);
        if (services == null || (listLLIIII = C13LP.LLIIII(services)) == null) {
            listLLIIII = C13BV.INSTANCE;
        }
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Discovered ");
        sbLIZ.append(listLLIIII.size());
        sbLIZ.append(" external node provider(s)");
        C201955140j.LJIILL(c0lx3, "NodeSpecFactory", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC552840LmE interfaceC552840LmE : listLLIIII) {
            C470601sO c470601sO = C470601sO.LIZ;
            try {
                for (C0167003h c0167003h : interfaceC552840LmE.LIZ()) {
                    C552800LmA c552800LmA = LIZ;
                    c0167003h.getClass();
                    c552800LmA.getClass();
                    LIZIZ(null, null, null);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } finally {
                if (!z) {
                }
            }
        }
    }

    public final void LIZ() {
        if (LIZLLL) {
            return;
        }
        synchronized (this) {
            try {
                if (LIZLLL) {
                    return;
                }
                LIZ.getClass();
                LIZJ();
                LIZLLL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(String str, Class cls, InterfaceC1631620sYq interfaceC1631620sYq) {
        Map<String, C552810LmB> map = LIZIZ;
        synchronized (map) {
            try {
                if (!((ConcurrentHashMap) map).containsKey(str)) {
                    ((ConcurrentHashMap) map).put(str, new C552810LmB(cls, interfaceC1631620sYq));
                    LIZJ.setValue(C13LP.LLIIJI(((ConcurrentHashMap) map).keySet()));
                    C0LX3 c0lx3 = C0LX3.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Node registered: ");
                    sbLIZ.append(((ConcurrentHashMap) map).get(str));
                    C201955140j.LJIIIIZZ(c0lx3, "NodeSpecFactory", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    C470601sO c470601sO = C470601sO.LIZ;
                    try {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Duplicate AIGC workflow nodeName: ");
                        sbLIZ2.append(str);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!(th instanceof CancellationException)) {
                            c470601sO.getClass();
                            C470601sO.LIZ(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            C0LX3 c0lx32 = C0LX3.LIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Duplicate nodeName ignored: ");
                            sbLIZ3.append(str);
                            C201955140j.LJIIIIZZ(c0lx32, "NodeSpecFactory", C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
