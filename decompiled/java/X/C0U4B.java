package X;

/* JADX INFO: renamed from: X.0U4B, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.filter.data.ComposerFilterDataSourceNew", f = "ComposerFilterDataSourceNew.kt", l = {30}, m = "fetchRemoteData")
public final class C0U4B extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0U4A LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U4B(C0U4A c0u4a, InterfaceC1364105Vn<? super C0U4B> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0u4a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComposerFilterDataSourceNew@7f96.fetchRemoteData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("ComposerFilterDataSourceNew@7f96.fetchRemoteData$1");
        return objLIZIZ;
    }
}
