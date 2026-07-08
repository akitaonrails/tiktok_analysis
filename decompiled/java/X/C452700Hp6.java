package X;

/* JADX INFO: renamed from: X.0Hp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.PopularStickerListManager", f = "PopularStickerListManager.kt", l = {161, 167}, m = "fetchPopularStickerPage")
public final class C452700Hp6 extends AbstractC23140094w {
    public EnumC452640Hp0 LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C452680Hp4 LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452700Hp6(C452680Hp4 c452680Hp4, InterfaceC1364105Vn<? super C452700Hp6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c452680Hp4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("PopularStickerListManager@7b34.fetchPopularStickerPage$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLIZ.LJI(null, 0, 0, null, false, this);
        C1C7U.LIZIZ("PopularStickerListManager@7b34.fetchPopularStickerPage$1");
        return objLJI;
    }
}
