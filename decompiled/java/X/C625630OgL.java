package X;

/* JADX INFO: renamed from: X.0OgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager", f = "OfflineModeManager.kt", l = {360, 361}, m = "clearUserCache")
public final class C625630OgL extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C625470Og5 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625630OgL(C625470Og5 c625470Og5, InterfaceC1364105Vn<? super C625630OgL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c625470Og5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManager@8800.clearUserCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objH = this.LLILLL.h(false, false, this);
        C1C7U.LIZIZ("OfflineModeManager@8800.clearUserCache$1");
        return objH;
    }
}
