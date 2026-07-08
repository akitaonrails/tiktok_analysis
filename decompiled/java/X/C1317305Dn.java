package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$fetchContactAsyncInternal$2", f = "IMContactManager.kt", l = {729}, m = "invokeSuspend")
public final class C1317305Dn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1317305Dn(InterfaceC1364105Vn<? super C1317305Dn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1317305Dn(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.fetchContactAsyncInternal$2");
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
            C1BG1 c1bg1 = C1BG1.LIZ;
            this.LL = 1;
            if (c1bg1.LJI(this) == objLJFF) {
                C1C7U.LIZIZ("IMContactManager@fb8a.fetchContactAsyncInternal$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMContactManager@fb8a.fetchContactAsyncInternal$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1317305Dn(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
