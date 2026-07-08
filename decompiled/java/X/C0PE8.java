package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PE8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchDefaultAssem$onDestroy$1", f = "InboxSearchDefaultAssem.kt", l = {}, m = "invokeSuspend")
public final class C0PE8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0PE8(InterfaceC1364105Vn<? super C0PE8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PE8(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchDefaultAssem@79d9.onDestroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0PEG.LIZ.getClass();
        C23250099c.LIZLLL(C0PEG.LIZIZ, null, null, new C0PE9(null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSearchDefaultAssem@79d9.onDestroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0PE8(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
