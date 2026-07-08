package X;

import com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager;

/* JADX INFO: renamed from: X.0MCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager", f = "AILivePhotoPromptManager.kt", l = {267}, m = "requestBlipAndReportResult-BWLJW6A")
public final class C564580MCi extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AILivePhotoPromptManager LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564580MCi(AILivePhotoPromptManager aILivePhotoPromptManager, InterfaceC1364105Vn<? super C564580MCi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = aILivePhotoPromptManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoPromptManager@57e8.requestBlipAndReportResult$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(0, 0L, null, this);
        if (objLJII == C099R.LJFF()) {
            C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestBlipAndReportResult$1");
            return objLJII;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestBlipAndReportResult$1");
        return c189200o6M1boximpl;
    }
}
