package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05R7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$3$1", f = "TakoContentPreviewAssem.kt", l = {}, m = "invokeSuspend")
public final class C05R7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoContentPreviewAssem LLILLJJLI;
    public final /* synthetic */ C05UN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05R7(TakoContentPreviewAssem takoContentPreviewAssem, C05UN c05un, InterfaceC1364105Vn<? super C05R7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoContentPreviewAssem;
        this.LLILLL = c05un;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05R7 c05r7 = new C05R7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c05r7.LL = obj;
        return c05r7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05R9(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05R3(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05R6(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05R8(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
