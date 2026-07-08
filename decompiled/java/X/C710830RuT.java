package X;

/* JADX INFO: renamed from: X.0RuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.PlaySubtitleConfigController$2$invokeSuspend$$inlined$filter$1$2", f = "PlaySubtitleConfigController.kt", l = {223}, m = "emit")
public final class C710830RuT extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C710820RuS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710830RuT(C710820RuS c710820RuS, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c710820RuS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaySubtitleConfigController@5709.<init>$2$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("PlaySubtitleConfigController@5709.<init>$2$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
