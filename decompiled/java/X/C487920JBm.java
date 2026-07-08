package X;

/* JADX INFO: renamed from: X.0JBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionDetailRepository$operator$1", f = "VoiceConversionDetailRepository.kt", l = {42}, m = "fetchFeedInformation")
public final class C487920JBm extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C487910JBl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487920JBm(C487910JBl c487910JBl, InterfaceC1364105Vn<? super C487920JBm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c487910JBl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceConversionDetailRepository@42e4.operator$1$fetchFeedInformation$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILLJJLI.LJIILL(null, false, false, this);
        C1C7U.LIZIZ("VoiceConversionDetailRepository@42e4.operator$1$fetchFeedInformation$1");
        return objLJIILL;
    }
}
