package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551670LkL<OUT> implements InterfaceC552870LmH {
    public static final C551670LkL<OUT> LIZ = new C551670LkL<>();

    @Override // X.InterfaceC552870LmH
    public final Object LIZ(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C552510Llh.INSTANCE.getClass();
        return C2097908Jt.LIZJ(new Pair("video_result_list", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(((C1177604j8) obj).LIZ)));
    }
}
