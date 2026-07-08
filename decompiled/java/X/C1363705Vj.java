package X;

/* JADX INFO: renamed from: X.05Vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {688, 720}, m = "applyToFling-BMRW4eQ")
public final class C1363705Vj extends AbstractC23140094w {
    public C20086713ib LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C20086713ib LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363705Vj(C20086713ib c20086713ib, InterfaceC1364105Vn<? super C1363705Vj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c20086713ib;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LJIL(0L, null, this);
    }
}
