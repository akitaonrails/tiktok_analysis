package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.CoverCreationManager$copyCoverFromPath$1$2", f = "CoverCreationManager.kt", l = {}, m = "invokeSuspend")
public final class C0MHE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ C0MHA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHE(C0MHA c0mha, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c0mha;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MHE(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CoverCreationManager@555f.copyCoverFromPath$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(Boolean.valueOf(this.LLILLJJLI.LIZLLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoverCreationManager@555f.copyCoverFromPath$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
