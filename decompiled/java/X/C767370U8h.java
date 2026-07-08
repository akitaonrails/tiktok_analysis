package X;

/* JADX INFO: renamed from: X.0U8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.bulletin.LiveBoardsEffectDataSource", f = "LiveBoardsEffectDataSource.kt", l = {43}, m = "fetchEffectInCategoryFromCache$liveeffect_impl_release")
public final class C767370U8h extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C767360U8g LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767370U8h(C767360U8g c767360U8g, InterfaceC1364105Vn<? super C767370U8h> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c767360U8g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBoardsEffectDataSource@3ebc.fetchEffectInCategoryFromCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("LiveBoardsEffectDataSource@3ebc.fetchEffectInCategoryFromCache$1");
        return objLIZ;
    }
}
