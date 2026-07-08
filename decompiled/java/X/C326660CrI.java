package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment$onCreate$1", f = "TakoBaseFragment.kt", l = {496}, m = "invokeSuspend")
public final class C326660CrI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C326660CrI(InterfaceC1364105Vn<? super C326660CrI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326660CrI(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBaseFragment@5860.onCreate$1");
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
            C0R3K.LIZIZ(C2097608Jq.LJIIJ(new Pair("biz", "tako")));
            if (((Number) C287290BNv.LIZ.getValue()).longValue() >= 600000) {
                C14TF c14tf = C14TF.LIZIZ;
                this.LL = 1;
                if (c14tf.LJLI(this) == objLJFF) {
                    C1C7U.LIZIZ("TakoBaseFragment@5860.onCreate$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBaseFragment@5860.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C326660CrI(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
