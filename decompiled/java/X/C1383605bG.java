package X;

/* JADX INFO: renamed from: X.05bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {775}, m = "onPreFling-QWom1Mo")
public final class C1383605bG extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1383405bE LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383605bG(C1383405bE c1383405bE, InterfaceC1364105Vn<? super C1383605bG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1383405bE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.LLILII(0L, this);
    }
}
