package X;

/* JADX INFO: renamed from: X.0gU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.editplaylist.PlaylistEditCacheRepo", f = "PlaylistEditCacheRepo.kt", l = {639, 105}, m = "loadMore")
public final class C1167420gU8 extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1167410gU7 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167420gU8(C1167410gU7 c1167410gU7, InterfaceC1364105Vn<? super C1167420gU8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1167410gU7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistEditCacheRepo@c1c4.loadMore$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZIL.LJII(0L, null, this);
        C1C7U.LIZIZ("PlaylistEditCacheRepo@c1c4.loadMore$1");
        return objLJII;
    }
}
