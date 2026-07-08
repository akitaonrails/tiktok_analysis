package X;

/* JADX INFO: renamed from: X.0Hsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.TikTokLinkMessageEnricher", f = "TikTokLinkMessageEnricher.kt", l = {37}, m = "enrichIfNeeded")
public final class C455060Hsu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C455050Hst LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455060Hsu(C455050Hst c455050Hst, InterfaceC1364105Vn<? super C455060Hsu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c455050Hst;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TikTokLinkMessageEnricher@33ff.enrichIfNeeded$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("TikTokLinkMessageEnricher@33ff.enrichIfNeeded$1");
        return objLIZ;
    }
}
