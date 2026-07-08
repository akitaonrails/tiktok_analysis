package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowPollingConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadInput;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC553000LmU(artifacts = {C552520Lli.class, C552610Llr.class})
@InterfaceC552990LmT(artifacts = {C552640Llu.class})
public final class C551760LkU implements InterfaceC552790Lm9<InterfaceC551900Lki<AIGCWorkflowPollingConfig>, AIGCWorkflowPollingConfig, C1166704hN, C1257704w3> {
    public final C557760LuA LIZ = new C557760LuA();
    public final String LIZIZ = "AIGCWorkflowPollingNode";
    public final String LIZJ = "polling";
    public final C552050Lkx LIZLLL = C552050Lkx.LIZ;
    public final C551880Lkg LJ = C551880Lkg.LIZ;

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC551240Lje<C1166704hN> LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC552790Lm9
    public final String LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC552870LmH<C1257704w3> LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC552790Lm9
    public final String getNodeName() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:27:0x00bb, B:30:0x00ed], limit reached: 166 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0368 -> B:40:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0389 -> B:40:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01ba -> B:40:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0246 -> B:40:0x011e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // X.InterfaceC552820LmC
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC551900Lki<com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowPollingConfig> r22, X.C1166704hN r23, X.InterfaceC1364105Vn<? super X.C1257704w3> r24) {
        /*
            Method dump skipped, instruction units count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C551760LkU.LIZIZ(X.0Lki, X.04hN, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC552790Lm9
    public final Object LIZJ(InterfaceC551900Lki interfaceC551900Lki, Object obj, Map map, C552910LmL c552910LmL) {
        boolean z;
        List<DownloadInput> listRemove;
        C1166704hN c1166704hN = (C1166704hN) obj;
        AIGCWorkflowPollingConfig aIGCWorkflowPollingConfig = (AIGCWorkflowPollingConfig) interfaceC551900Lki.getConfig();
        if (aIGCWorkflowPollingConfig != null && aIGCWorkflowPollingConfig.enablePreloadOutput) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        String str = c1166704hN.LIZ;
        if (a0.LJJJIL(str) || (listRemove = C1257604w2.LIZ.remove(str)) == null) {
            return null;
        }
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("consumed serverTaskId=");
        sbLIZ.append(str);
        sbLIZ.append(", count=");
        sbLIZ.append(listRemove.size());
        C201955140j.LJIILL(c0lx3, "AIGCPushResultCache", C2188811AlT.LIZIZ(sbLIZ));
        if (listRemove.isEmpty()) {
            return null;
        }
        C0LX3 c0lx32 = C0LX3.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("preload hit from PushArtifactStore, serverTaskId=");
        sbLIZ2.append(c1166704hN.LIZ);
        sbLIZ2.append(", urls=");
        sbLIZ2.append(listRemove.size());
        C201955140j.LIZLLL(c0lx32, "AIGCWorkflowPollingNode", C2188811AlT.LIZIZ(sbLIZ2));
        return new C1257704w3(listRemove, "");
    }
}
