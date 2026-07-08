package X;

import com.ss.android.ugc.aweme.creationeoycard.CreationEoyCardComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creationeoycard.CreationEoyCardComponent$doAdaption$1", f = "CreationEoyCardComponent.kt", l = {}, m = "invokeSuspend")
public final class C0CTF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreationEoyCardComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTF(CreationEoyCardComponent creationEoyCardComponent, InterfaceC1364105Vn<? super C0CTF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creationEoyCardComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationEoyCardComponent@64ef.doAdaption$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.ep();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationEoyCardComponent@64ef.doAdaption$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
