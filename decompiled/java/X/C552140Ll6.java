package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ll6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552140Ll6<OUT> implements InterfaceC552870LmH {
    public static final C552140Ll6<OUT> LIZ = new C552140Ll6<>();

    @Override // X.InterfaceC552870LmH
    public final Object LIZ(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C552480Lle.INSTANCE.getClass();
        return C2097908Jt.LIZJ(new Pair("download_item_list", ((AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false)).LIZ(((C1177704j9) obj).LIZ)));
    }
}
