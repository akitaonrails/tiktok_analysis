package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadInput;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Lkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551880Lkg<OUT> implements InterfaceC552870LmH {
    public static final C551880Lkg<OUT> LIZ = new C551880Lkg<>();

    @Override // X.InterfaceC552870LmH
    public final Object LIZ(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1257704w3 c1257704w3 = (C1257704w3) obj;
        C552520Lli.INSTANCE.getClass();
        List<DownloadInput> list = c1257704w3.LIZ;
        new AbstractC552150Ll7() { // from class: X.0Llr
            public static final C553090Lmd LIZ = C553090Lmd.LIZ;

            @Override // X.InterfaceC553010LmV
            public final String LIZ() {
                return "task_detail_extra";
            }

            @Override // X.InterfaceC553010LmV
            public final AbstractC553110Lmf LIZIZ() {
                return LIZ;
            }
        }.getClass();
        return C2097608Jq.LJIIIIZZ(new Pair("result_url_list", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(list)), new Pair("task_detail_extra", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(c1257704w3.LIZIZ)));
    }
}
