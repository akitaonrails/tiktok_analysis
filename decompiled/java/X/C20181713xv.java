package X;

/* JADX INFO: renamed from: X.13xv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.PriorityConcurrencyGate", f = "BulletinVoiceDownloader.kt", l = {523}, m = "release")
public final class C20181713xv extends AbstractC23140094w {
    public C1DEV LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20181513xt LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20181713xv(C20181513xt c20181513xt, InterfaceC1364105Vn<? super C20181713xv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20181513xt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PriorityConcurrencyGate@68d7.release$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("PriorityConcurrencyGate@68d7.release$1");
        return objLIZIZ;
    }
}
