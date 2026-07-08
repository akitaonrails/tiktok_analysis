package X;

/* JADX INFO: renamed from: X.0JBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceDetailRepository$operator$1", f = "TTSVoiceDetailRepository.kt", l = {37}, m = "fetchFeedInformation")
public final class C487880JBi extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C487870JBh LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487880JBi(C487870JBh c487870JBh, InterfaceC1364105Vn<? super C487880JBi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c487870JBh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSVoiceDetailRepository@1087.operator$1$fetchFeedInformation$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILLJJLI.LJIILL(null, false, false, this);
        C1C7U.LIZIZ("TTSVoiceDetailRepository@1087.operator$1$fetchFeedInformation$1");
        return objLJIILL;
    }
}
