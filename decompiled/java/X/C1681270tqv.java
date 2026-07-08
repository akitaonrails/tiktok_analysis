package X;

/* JADX INFO: renamed from: X.0tqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.tux.compose.m3.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BottomSheetScaffold.kt", l = {53}, m = "onPostFling-RZ2iAVY")
public final class C1681270tqv extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1681260tqu LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681270tqv(C1681260tqu c1681260tqu, InterfaceC1364105Vn<? super C1681270tqv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1681260tqu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomSheetScaffoldKt@43a3.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLLFII = this.LLILLL.LLFII(0L, 0L, this);
        C1C7U.LIZIZ("BottomSheetScaffoldKt@43a3.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1");
        return objLLFII;
    }
}
