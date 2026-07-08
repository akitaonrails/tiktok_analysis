package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowQuotaConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0Lks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC553000LmU(artifacts = {C552670Llx.class, C552660Llw.class})
@InterfaceC552990LmT(artifacts = {C552560Llm.class, C552550Lll.class})
public final class C552000Lks implements InterfaceC552790Lm9<InterfaceC551900Lki<AIGCWorkflowQuotaConfig>, AIGCWorkflowQuotaConfig, C552260LlI, C552290LlL> {
    public final C557760LuA LIZ = new C557760LuA();
    public final String LIZIZ = "AIGCWorkflowQuotaNode";
    public final String LIZJ = "quota";
    public final C552270LlJ LIZLLL = C552270LlJ.LIZ;
    public final C552110Ll3 LJ = C552110Ll3.LIZ;

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC551240Lje<C552260LlI> LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC552790Lm9
    public final String LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC552870LmH<C552290LlL> LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC552790Lm9
    public final String getNodeName() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C552260LlI r16, X.InterfaceC1364105Vn r17) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C552000Lks.LJFF(X.0LlI, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC552820LmC
    public final /* bridge */ /* synthetic */ Object LIZIZ(InterfaceC551900Lki interfaceC551900Lki, Object obj, C552950LmP c552950LmP) {
        return LJFF((C552260LlI) obj, c552950LmP);
    }

    @Override // X.InterfaceC552790Lm9
    public final Object LIZJ(InterfaceC551900Lki interfaceC551900Lki, Object obj, Map map, C552910LmL c552910LmL) {
        int i;
        C552260LlI c552260LlI = (C552260LlI) obj;
        AIGCWorkflowQuotaConfig aIGCWorkflowQuotaConfig = (AIGCWorkflowQuotaConfig) interfaceC551900Lki.getConfig();
        if (aIGCWorkflowQuotaConfig != null && aIGCWorkflowQuotaConfig.enablePreloadOutput) {
            String str = c552260LlI.LIZIZ;
            String str2 = c552260LlI.LIZ;
            C01GW c01gw = C552240LlG.LIZ;
            int i2 = ((Keva) c01gw.getValue()).getInt(C552240LlG.LIZIZ(str, str2), 0);
            AIGCWorkflowQuotaConfig aIGCWorkflowQuotaConfig2 = (AIGCWorkflowQuotaConfig) interfaceC551900Lki.getConfig();
            if (aIGCWorkflowQuotaConfig2 != null) {
                i = aIGCWorkflowQuotaConfig2.quotaRemainThreshold;
            } else {
                i = 0;
            }
            if (i2 <= i) {
                C0LX3 c0lx3 = C0LX3.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("quota preload miss, cachedRemain=");
                sbLIZ.append(i2);
                sbLIZ.append(" <= threshold=");
                sbLIZ.append(i);
                sbLIZ.append(", scene=");
                sbLIZ.append(c552260LlI.LIZIZ);
                sbLIZ.append(", jobType=");
                sbLIZ.append(c552260LlI.LIZ);
                C201955140j.LJIILL(c0lx3, "AIGCWorkflowQuotaNode", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            int i3 = ((Keva) c01gw.getValue()).getInt(C552240LlG.LIZ(c552260LlI.LIZIZ, c552260LlI.LIZ), 0);
            C0LX3 c0lx32 = C0LX3.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("quota preload hit, scene=");
            sbLIZ2.append(c552260LlI.LIZIZ);
            sbLIZ2.append(", jobType=");
            sbLIZ2.append(c552260LlI.LIZ);
            sbLIZ2.append(", cachedQuota=");
            sbLIZ2.append(i3);
            sbLIZ2.append(", cachedRemain=");
            sbLIZ2.append(i2);
            C201955140j.LJIILL(c0lx32, "AIGCWorkflowQuotaNode", C2188811AlT.LIZIZ(sbLIZ2));
            return new C552290LlL(i3, i2);
        }
        return null;
    }
}
