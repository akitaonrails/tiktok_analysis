package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0Ra1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.strategy.CaptionPreloadController$1", f = "CaptionPreloadController.kt", l = {49}, m = "invokeSuspend")
public final class C698150Ra1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C698150Ra1(InterfaceC1364105Vn<? super C698150Ra1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C698150Ra1(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionPreloadController@6917.<init>$1");
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
            C23127094j c23127094jLJJII = C09IC.LJJII(C161N.LIZIZ.LJJJJJ(), new C1629806Zs(new C05RH(C746760TRa.LIZ().LJIJI())), new C1629806Zs(new C05RH(C746760TRa.LIZ().LJJIII())), new C1629806Zs(new C05RH(C746760TRa.LIZ().LJJ())), new C1629806Zs(new C05RH(C1839820xye.LIZ().LIZIZ())));
            Object obj2 = new InterfaceC346701Wf() { // from class: X.0olQ
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [X.0oX1] */
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    C1485670olR.LIZ().LJIIJ();
                    InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1475700oVM.LIZ();
                    final C161V c161v = C161V.LIZ;
                    interfaceC1482870ogvLIZ.LJJLIIIJL(new InterfaceC1475540oV6() { // from class: X.0oX1
                        @Override // X.InterfaceC1475540oV6
                        public final int LIZ(C1475220oUa c1475220oUa) {
                            c161v.getClass();
                            return C161V.LIZ(null, c1475220oUa.LIZ, null, c1475220oUa.LIZJ, new AwS567S0100000_23(c1475220oUa, 163), new AwS567S0100000_23(c1475220oUa, 164));
                        }
                    });
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c23127094jLJJII.collect(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("CaptionPreloadController@6917.<init>$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionPreloadController@6917.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C698150Ra1(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
