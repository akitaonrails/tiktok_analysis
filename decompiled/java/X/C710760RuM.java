package X;

/* JADX INFO: renamed from: X.0RuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocaption.refactor.CaptionDisplayStateController$3$invokeSuspend$$inlined$map$1$2", f = "CaptionDisplayStateController.kt", l = {223}, m = "emit")
public final class C710760RuM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C710750RuL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710760RuM(C710750RuL c710750RuL, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c710750RuL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionDisplayStateController@662c.<init>$3$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("CaptionDisplayStateController@662c.<init>$3$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
