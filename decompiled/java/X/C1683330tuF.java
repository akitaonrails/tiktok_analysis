package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.contactselect.ContactSelectPanelKt$SearchBar$3$1", f = "ContactSelectPanel.kt", l = {}, m = "invokeSuspend")
public final class C1683330tuF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20060213eK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683330tuF(C20060213eK c20060213eK, InterfaceC1364105Vn<? super C1683330tuF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20060213eK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1683330tuF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactSelectPanelKt@b0ce.SearchBar$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20060213eK.LIZIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactSelectPanelKt@b0ce.SearchBar$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
