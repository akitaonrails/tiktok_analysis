package X;

/* JADX INFO: renamed from: X.0Eyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.bridge.DefaultGenAIBridge", f = "DefaultGenAIBridge.kt", l = {516}, m = "getSuggestPromptsWithImage")
public final class C382270Eyn extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C382160Eyc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382270Eyn(C382160Eyc c382160Eyc, InterfaceC1364105Vn<? super C382270Eyn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c382160Eyc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultGenAIBridge@a8d8.getSuggestPromptsWithImage$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(0, null, this);
        C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.getSuggestPromptsWithImage$1");
        return objLJ;
    }
}
