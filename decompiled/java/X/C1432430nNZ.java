package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432430nNZ extends AbstractC2255721DQs<InterfaceC1432450nNb> implements InterfaceC1432450nNb, InterfaceC484050IyZ, InterfaceC379610EuV {
    public static final C1432440nNa LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final InterfaceC1432450nNb LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 805));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0nNa] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1432430nNZ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0nNa
        };
        LLIZLLLIL = 8;
    }

    private final InterfaceC1430300nK8 X1() {
        return (InterfaceC1430300nK8) this.LLILZIL.getValue();
    }

    private final VideoPublishEditModel Z1() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[0]);
    }

    public InterfaceC1432450nNb W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public C1432430nNZ(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC484050IyZ
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 12360) {
            return false;
        }
        AIChatGenNode aIChatGenNode = null;
        if (intent != null) {
            AIChatGenModel aIChatGenModel = (AIChatGenModel) intent.getParcelableExtra("key_ai_chat_gen_model");
            if (aIChatGenModel != null) {
                Z1().creativeModel.aiChatGenModel = aIChatGenModel;
            }
            if (intent != null) {
                aIChatGenNode = (AIChatGenNode) intent.getParcelableExtra("key_ai_chat_gen_node");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onActivityResult: requestCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", resultCode = ");
        sbLIZ.append(i2);
        sbLIZ.append(", data = ");
        sbLIZ.append(aIChatGenNode);
        C21290818Tq.LIZ("AiChatEditApplyComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (aIChatGenNode != null) {
            X1().LIZ(aIChatGenNode);
            return true;
        }
        return true;
    }
}
