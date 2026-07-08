package X;

/* JADX INFO: renamed from: X.0OgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager", f = "OfflineModeManager.kt", l = {910}, m = "getNextPageByAid")
public final class C625660OgO extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C625470Og5 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625660OgO(C625470Og5 c625470Og5, InterfaceC1364105Vn<? super C625660OgO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c625470Og5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManager@8800.getNextPageByAid$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objX = this.LLILLL.x(null, this);
        C1C7U.LIZIZ("OfflineModeManager@8800.getNextPageByAid$1");
        return objX;
    }
}
