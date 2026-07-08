package X;

import com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager;

/* JADX INFO: renamed from: X.0MCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager", f = "AILivePhotoPromptManager.kt", l = {244, 259}, m = "requestBlipWithRetry-0E7RQCE")
public final class C564570MCh extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ AILivePhotoPromptManager LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564570MCh(AILivePhotoPromptManager aILivePhotoPromptManager, InterfaceC1364105Vn<? super C564570MCh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = aILivePhotoPromptManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoPromptManager@57e8.requestBlipWithRetry$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLIZLLLIL.LJIIIIZZ(0, null, this);
        if (objLJIIIIZZ == C099R.LJFF()) {
            C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestBlipWithRetry$1");
            return objLJIIIIZZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIIZZ);
        C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestBlipWithRetry$1");
        return c189200o6M1boximpl;
    }
}
