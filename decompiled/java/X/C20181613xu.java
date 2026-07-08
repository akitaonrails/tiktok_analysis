package X;

/* JADX INFO: renamed from: X.13xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.PriorityConcurrencyGate", f = "BulletinVoiceDownloader.kt", l = {523, 488, 533, 496}, m = "acquire")
public final class C20181613xu extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C20181513xt LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20181613xu(C20181513xt c20181513xt, InterfaceC1364105Vn<? super C20181613xu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c20181513xt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PriorityConcurrencyGate@68d7.acquire$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("PriorityConcurrencyGate@68d7.acquire$1");
        return objLIZ;
    }
}
