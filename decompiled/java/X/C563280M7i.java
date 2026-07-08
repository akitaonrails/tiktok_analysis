package X;

/* JADX INFO: renamed from: X.0M7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider$provideCustomEvents$2$1", f = "LiveEventCtaAnchorProvider.kt", l = {95}, m = "invoke")
public final class C563280M7i extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1580870rEz LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563280M7i(C1580870rEz c1580870rEz, InterfaceC1364105Vn<? super C563280M7i> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1580870rEz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.invoke(null, null, this);
        C1C7U.LIZIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$1");
        return objLIZ;
    }
}
