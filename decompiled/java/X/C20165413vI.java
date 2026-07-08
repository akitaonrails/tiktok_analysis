package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.13vI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask$findIntersect$2", f = "ContactFilterByPsi.kt", l = {}, m = "invokeSuspend")
public final class C20165413vI extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20165313vH LL;
    public final /* synthetic */ C20165213vG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20165413vI(C20165313vH c20165313vH, C20165213vG c20165213vG, InterfaceC1364105Vn<? super C20165413vI> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c20165313vH;
        this.LLILLJJLI = c20165213vG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20165413vI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PsiTask@40e6.findIntersect$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LJIJJ = this.LLILLJJLI.LIZ.size();
        this.LL.LIZIZ.LJIILLIIL = this.LLILLJJLI.LIZIZ.size();
        C20165313vH c20165313vH = this.LL;
        C20165213vG c20165213vG = this.LLILLJJLI;
        c20165313vH.getClass();
        C20165313vH.LIZIZ(c20165313vH, c20165213vG.LIZ, c20165313vH.LJII());
        C20165313vH.LIZIZ(c20165313vH, c20165213vG.LIZIZ, c20165313vH.LJII());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PsiTask@40e6.findIntersect$2");
        return unit;
    }
}
