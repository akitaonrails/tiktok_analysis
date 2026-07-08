package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ra7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.PlaySubtitleConfigController$1", f = "PlaySubtitleConfigController.kt", l = {51}, m = "invokeSuspend")
public final class C698210Ra7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C698210Ra7(InterfaceC1364105Vn<? super C698210Ra7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C698210Ra7(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaySubtitleConfigController@5709.<init>$1");
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
            C23127094j c23127094jLJJII = C09IC.LJJII(new C05RH(C161N.LIZIZ.LLIIIZ()), new C1629806Zs(new C05RH(C746760TRa.LIZ().LJIJI())), new C1629806Zs(new C05RH(C746760TRa.LIZ().LJJIII())), new C1629806Zs(new C05RH(C746760TRa.LIZ().LJJ())), new C1629806Zs(new C05RH(C1839820xye.LIZ().LIZIZ())));
            Object obj2 = new InterfaceC346701Wf() { // from class: X.0Ra8
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    C20702615zk.LIZIZ.LIZ();
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c23127094jLJJII.collect(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("PlaySubtitleConfigController@5709.<init>$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlaySubtitleConfigController@5709.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C698210Ra7(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
