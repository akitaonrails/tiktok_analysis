package X;

/* JADX INFO: renamed from: X.0U34, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.download.KaraokeDownloader", f = "KaraokeDownloader.kt", l = {217}, m = "onFinish")
public final class C0U34 extends AbstractC23140094w {
    public C0U22 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0U33 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U34(C0U33 c0u33, InterfaceC1364105Vn<? super C0U34> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0u33;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeDownloader@4c6a.onFinish$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(this);
        C1C7U.LIZIZ("KaraokeDownloader@4c6a.onFinish$1");
        return objLJFF;
    }
}
