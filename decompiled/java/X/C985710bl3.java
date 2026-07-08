package X;

/* JADX INFO: renamed from: X.0bl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.utils.GameResourceManager", f = "GameResourceManager.kt", l = {96}, m = "getSelfGameVersion")
public final class C985710bl3 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C985690bl1 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C985710bl3(C985690bl1 c985690bl1, InterfaceC1364105Vn<? super C985710bl3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c985690bl1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameResourceManager@a046.getSelfGameVersion$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("GameResourceManager@a046.getSelfGameVersion$1");
        return objLIZ;
    }
}
