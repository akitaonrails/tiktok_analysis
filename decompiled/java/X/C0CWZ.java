package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.async.PreTask$start$1$1", f = "PreTask.kt", l = {}, m = "invokeSuspend")
public final class C0CWZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C314900CWa<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWZ(C314900CWa<Object> c314900CWa, InterfaceC1364105Vn<? super C0CWZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c314900CWa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CWZ c0cwz = new C0CWZ(this.LLILLJJLI, interfaceC1364105Vn);
        c0cwz.LL = obj;
        return c0cwz;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreTask@5dd7.start$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C314900CWa<Object> c314900CWa = this.LLILLJJLI;
        c314900CWa.LIZJ = c314900CWa.LIZ.invoke();
        C23250099c.LIZLLL(interfaceC497601wk, C2126308Ur.LJFF, null, new C0CWY(this.LLILLJJLI, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreTask@5dd7.start$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
