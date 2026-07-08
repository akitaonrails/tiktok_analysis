package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05I0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$triggerFullUpdate$2$1", f = "StorageSyncer.kt", l = {}, m = "invokeSuspend")
public final class C05I0 extends C09AX implements Function2<C0O0L, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C05I0(InterfaceC1364105Vn<? super C05I0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05I0 c05i0 = new C05I0(interfaceC1364105Vn);
        c05i0.LL = obj;
        return c05i0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StorageSyncer@f38a.triggerFullUpdate$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == C05I2.LIZ) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("StorageSyncer@f38a.triggerFullUpdate$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0O0L c0o0l, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c0o0l, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
