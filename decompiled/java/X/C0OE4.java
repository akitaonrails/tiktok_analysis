package X;

/* JADX INFO: renamed from: X.0OE4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.api.GetPinnedMusicListQuery", f = "GetPinnedMusicListQuery.kt", l = {14}, m = "operate")
public final class C0OE4 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0OE1 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OE4(C0OE1 c0oe1, InterfaceC1364105Vn<? super C0OE4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0oe1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetPinnedMusicListQuery@99dd.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("GetPinnedMusicListQuery@99dd.operate$1");
        return objLIZIZ;
    }
}
