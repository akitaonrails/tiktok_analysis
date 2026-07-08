package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowDownloadConfig;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Lkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC553000LmU(artifacts = {C552480Lle.class})
@InterfaceC552990LmT(artifacts = {C552520Lli.class})
public final class C552040Lkw implements InterfaceC552790Lm9<InterfaceC551900Lki<AIGCWorkflowDownloadConfig>, AIGCWorkflowDownloadConfig, C1257504w1, C1177704j9> {
    public final String LIZ = "AIGCWorkflowDownloadNode";
    public final String LIZIZ = "download";
    public final C552070Lkz LIZJ = C552070Lkz.LIZ;
    public final C552140Ll6 LIZLLL = C552140Ll6.LIZ;

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC551240Lje<C1257504w1> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC552790Lm9
    public final String LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC552870LmH<C1177704j9> LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC552790Lm9
    public final String getNodeName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC552820LmC
    public final Object LIZIZ(InterfaceC551900Lki interfaceC551900Lki, Object obj, C552950LmP c552950LmP) throws C555610Lqh {
        String str;
        int iIntValue;
        int i;
        AIGCWorkflowDownloadConfig aIGCWorkflowDownloadConfig;
        Integer num;
        Integer num2;
        C1257504w1 c1257504w1 = (C1257504w1) obj;
        AIGCWorkflowDownloadConfig aIGCWorkflowDownloadConfig2 = (AIGCWorkflowDownloadConfig) interfaceC551900Lki.getConfig();
        if (aIGCWorkflowDownloadConfig2 == null || (str = aIGCWorkflowDownloadConfig2.downloadDir) == null) {
            str = "";
        }
        if (!a0.LJJJIL(str)) {
            if (c1257504w1.LIZ.isEmpty()) {
                return new C1177704j9(C13BV.INSTANCE);
            }
            AIGCWorkflowDownloadConfig aIGCWorkflowDownloadConfig3 = (AIGCWorkflowDownloadConfig) interfaceC551900Lki.getConfig();
            int iIntValue2 = 3;
            if (aIGCWorkflowDownloadConfig3 != null && (num2 = aIGCWorkflowDownloadConfig3.downloadConcurrency) != null) {
                iIntValue = num2.intValue();
                i = 1;
                if (iIntValue >= 1) {
                }
                aIGCWorkflowDownloadConfig = (AIGCWorkflowDownloadConfig) interfaceC551900Lki.getConfig();
                if (aIGCWorkflowDownloadConfig != null && (num = aIGCWorkflowDownloadConfig.downloadRetryCount) != null && (iIntValue2 = num.intValue()) < 0) {
                    iIntValue2 = 0;
                }
                return C23250099c.LJI(c552950LmP, C0PEM.LIZJ, new C1385205bW(i, c1257504w1, this, str, iIntValue2, System.currentTimeMillis(), null));
            }
            iIntValue = 3;
            i = iIntValue;
            aIGCWorkflowDownloadConfig = (AIGCWorkflowDownloadConfig) interfaceC551900Lki.getConfig();
            if (aIGCWorkflowDownloadConfig != null) {
                iIntValue2 = 0;
            }
            return C23250099c.LJI(c552950LmP, C0PEM.LIZJ, new C1385205bW(i, c1257504w1, this, str, iIntValue2, System.currentTimeMillis(), null));
        }
        throw EnumC551770LkV.toException$default(EnumC551770LkV.DOWNLOAD_EMPTY_RESULT_PATH, null, null, null, null, null, 31, null);
    }

    @Override // X.InterfaceC552790Lm9
    public final /* bridge */ /* synthetic */ Object LIZJ(InterfaceC551900Lki interfaceC551900Lki, Object obj, Map map, C552910LmL c552910LmL) {
        return null;
    }
}
