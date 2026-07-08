package X;

/* JADX INFO: renamed from: X.0U8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.bulletin.LiveBoardsEffectDataSource", f = "LiveBoardsEffectDataSource.kt", l = {60}, m = "fetchEffectInCategoryFromRemote$liveeffect_impl_release")
public final class C767380U8i extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C767360U8g LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767380U8i(C767360U8g c767360U8g, InterfaceC1364105Vn<? super C767380U8i> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c767360U8g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBoardsEffectDataSource@3ebc.fetchEffectInCategoryFromRemote$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("LiveBoardsEffectDataSource@3ebc.fetchEffectInCategoryFromRemote$1");
        return objLIZIZ;
    }
}
