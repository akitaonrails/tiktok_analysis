package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Lkh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551890Lkh<OUT> implements InterfaceC552870LmH {
    public static final C551890Lkh<OUT> LIZ = new C551890Lkh<>();

    @Override // X.InterfaceC552870LmH
    public final Object LIZ(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C552530Llj.INSTANCE.getClass();
        return C2097908Jt.LIZJ(new Pair("uploaded_file_list", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(((C1171004i4) obj).LIZ)));
    }
}
