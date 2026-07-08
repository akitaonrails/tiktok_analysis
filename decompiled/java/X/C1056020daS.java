package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0daS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ext.RecUserContactAccessHelper$forceRead$1$1", f = "RecUserContactAccessHelper.kt", l = {88}, m = "invokeSuspend")
public final class C1056020daS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1056020daS(InterfaceC1364105Vn<? super C1056020daS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056020daS(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserContactAccessHelper@4d.forceRead$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1056380db2 c1056380db2 = C1056380db2.LIZ;
            String str = C1056380db2.LIZLLL;
            this.LL = 1;
            if (c1056380db2.LIZ(C1071540dzU.LIZIZ.LIZIZ(), str, false, this) == objLJFF) {
                C1C7U.LIZIZ("RecUserContactAccessHelper@4d.forceRead$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecUserContactAccessHelper@4d.forceRead$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1056020daS(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
