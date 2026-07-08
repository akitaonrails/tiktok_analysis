package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$TakoMultiImagePreviewImageContent$6$1$1$1", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C1587406Jk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C05P0<C1683130ttv> LLILLJJLI;
    public final /* synthetic */ C05P0<C1683130ttv> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587406Jk(long j, C05P0<C1683130ttv> c05p0, C05P0<C1683130ttv> c05p02, InterfaceC1364105Vn<? super C1587406Jk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1587406Jk(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$6$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1683130ttv c1683130ttvLJ = C1679750toT.LJ(this.LLILLJJLI);
        if (c1683130ttvLJ != null) {
            C1587506Jl c1587506JlLJII = C1679750toT.LJII(Float.intBitsToFloat((int) (this.LL >> 32)), Float.intBitsToFloat((int) (this.LL & 4294967295L)), c1683130ttvLJ.LIZJ - c1683130ttvLJ.LIZ, c1683130ttvLJ.LIZLLL - c1683130ttvLJ.LIZIZ, EnumC1338240kve.FIT_CENTER);
            C05P0<C1683130ttv> c05p0 = this.LLILLL;
            float f = c1683130ttvLJ.LIZ;
            C1683130ttv c1683130ttv = c1587506JlLJII.LIZ;
            float f2 = c1683130ttv.LIZ + f;
            float f3 = c1683130ttvLJ.LIZIZ;
            c05p0.setValue(new C1683130ttv(f2, c1683130ttv.LIZIZ + f3, f + c1683130ttv.LIZJ, f3 + c1683130ttv.LIZLLL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$6$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
