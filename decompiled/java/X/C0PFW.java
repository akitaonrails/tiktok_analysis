package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PFW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardProtocolNewControl$setup$1", f = "SearchCardProtocolNewControl.kt", l = {}, m = "invokeSuspend")
public final class C0PFW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0PFW(InterfaceC1364105Vn<? super C0PFW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PFW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCardProtocolNewControl@4c4.setup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0PKD.LIZIZ.getClass();
        C0PKD.LIZLLL.getValue();
        C0PKD.LJII.getClass();
        C0PHG.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCardProtocolNewControl@4c4.setup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0PFW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
