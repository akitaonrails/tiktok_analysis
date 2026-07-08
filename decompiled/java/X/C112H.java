package X;

import com.ss.android.ugc.aweme.tako.TakoServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.112H, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$Companion$listenUserInternal$1$2", f = "TakoServiceImpl.kt", l = {968}, m = "invokeSuspend")
public final class C112H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C112H(InterfaceC1364105Vn<? super C112H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C112H(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl$Companion@eb68.listenUserInternal$1$2");
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
            C20232914Et c20232914Et = TakoServiceImpl.LJIIIIZZ;
            TakoServiceImpl.LJIIJJI = false;
            C20232914Et c20232914Et2 = TakoServiceImpl.LJIIIIZZ;
            EnumC19389610tS enumC19389610tS = EnumC19389610tS.USER_CHANGE;
            this.LL = 1;
            if (c20232914Et2.LJ(enumC19389610tS, true, this) == objLJFF) {
                C1C7U.LIZIZ("TakoServiceImpl$Companion@eb68.listenUserInternal$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl$Companion@eb68.listenUserInternal$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C112H(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
