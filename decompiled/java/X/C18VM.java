package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;

/* JADX INFO: renamed from: X.18VM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VM extends AbstractC2255721DQs<C18VQ> implements C18VQ, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final C18VQ LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C18VN.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18VM.class, "saveApi", "getSaveApi()Lcom/ss/android/ugc/tools/chat/common/api/AiChatSaveApi;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    private final C18VN X1() {
        return (C18VN) this.LLILLL.getValue(this, LLILZ[0]);
    }

    public C18VQ W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C18VM(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> co(String str) {
        return X1().co(str);
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> oo(String str, String str2, int i) {
        return X1().oo(str, str2, i);
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> KX(Context context, String str, String str2, AIChatGenNode aIChatGenNode) {
        return X1().KX(context, str, str2, aIChatGenNode);
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> Fg0(Context context, String str, String str2, String str3, AIChatGenNode aIChatGenNode) {
        return X1().Fg0(context, str, str2, str3, aIChatGenNode);
    }
}
