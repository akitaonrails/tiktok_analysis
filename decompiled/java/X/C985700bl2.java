package X;

/* JADX INFO: renamed from: X.0bl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.utils.GameResourceManager", f = "GameResourceManager.kt", l = {75}, m = "isGameDownloaded")
public final class C985700bl2 extends AbstractC23140094w {
    public C0UEA LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C985690bl1 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C985700bl2(C985690bl1 c985690bl1, InterfaceC1364105Vn<? super C985700bl2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c985690bl1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameResourceManager@a046.isGameDownloaded$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("GameResourceManager@a046.isGameDownloaded$1");
        return objLIZIZ;
    }
}
