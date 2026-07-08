package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NVH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSheetKt$TuxSheet$2$1$2$1$3$1$3", f = "TuxSheet.kt", l = {}, m = "invokeSuspend")
public final class C0NVH extends C09AX implements InterfaceC1631620sYq<Float, C0NWD, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ float LL;
    public /* synthetic */ C0NWD LLILLJJLI;
    public final /* synthetic */ C594920NVa<C0NWD> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVH(C594920NVa<C0NWD> c594920NVa, InterfaceC1364105Vn<? super C0NVH> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c594920NVa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$3$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        float f = this.LL;
        C0NWD c0nwd = this.LLILLJJLI;
        InterfaceC594940NVc<C0NWD> interfaceC594940NVcLIZIZ = this.LLILLL.LIZIZ();
        C0NWC c0nwc = C0NWC.LIZ;
        boolean z = true;
        if (f != interfaceC594940NVcLIZIZ.LIZLLL(c0nwc) || !Intrinsics.LJFF(c0nwd, c0nwc)) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TuxSheetKt@de23.TuxSheet$2$1$2$1$3$1$3");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Float f, C0NWD c0nwd, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        float fFloatValue = f.floatValue();
        C0NVH c0nvh = new C0NVH(this.LLILLL, interfaceC1364105Vn);
        c0nvh.LL = fFloatValue;
        c0nvh.LLILLJJLI = c0nwd;
        return c0nvh.invokeSuspend(Unit.LIZ);
    }
}
