package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ll3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552110Ll3<OUT> implements InterfaceC552870LmH {
    public static final C552110Ll3<OUT> LIZ = new C552110Ll3<>();

    @Override // X.InterfaceC552870LmH
    public final Object LIZ(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C552290LlL c552290LlL = (C552290LlL) obj;
        C552670Llx.INSTANCE.getClass();
        Integer numLJ = C2286608xc.LJ(c552290LlL.LIZ);
        C552660Llw.INSTANCE.getClass();
        return C2097608Jq.LJIIIIZZ(new Pair("quota", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(numLJ)), new Pair("quota_remain", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(C2286608xc.LJ(c552290LlL.LIZIZ))));
    }
}
