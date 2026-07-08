package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$TakoMultiImagePreviewImageContent$3$1", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C05UK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05UN LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ C05P0<C1683130ttv> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UK(C05UN c05un, InterfaceC497601wk interfaceC497601wk, C05P0<C1683130ttv> c05p0, InterfaceC1364105Vn<? super C05UK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05un;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UK(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZJ() && this.LLILLL.getValue() != null) {
            ((C13FE) this.LL.LJFF).setValue(Boolean.TRUE);
            C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C05UL(this.LL, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
