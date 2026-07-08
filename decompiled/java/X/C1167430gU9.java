package X;

/* JADX INFO: renamed from: X.0gU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.editplaylist.PlaylistEditCacheRepo", f = "PlaylistEditCacheRepo.kt", l = {639, 230}, m = "loadBefore")
public final class C1167430gU9 extends AbstractC23140094w {
    public long LL;
    public boolean LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1167410gU7 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167430gU9(C1167410gU7 c1167410gU7, InterfaceC1364105Vn<? super C1167430gU9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1167410gU7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistEditCacheRepo@c1c4.loadBefore$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZLL.LJ(0L, this, false);
        C1C7U.LIZIZ("PlaylistEditCacheRepo@c1c4.loadBefore$1");
        return objLJ;
    }
}
