package X;

import Y.AgS195S0200000_4;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem$searchTermEmitter$1$1", f = "SelectSchoolPageAssem.kt", l = {152}, m = "invokeSuspend")
public final class C330090Cwp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SelectSchoolPageAssem LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330090Cwp(SelectSchoolPageAssem selectSchoolPageAssem, InterfaceC332260D0u<String> interfaceC332260D0u, InterfaceC1364105Vn<? super C330090Cwp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = selectSchoolPageAssem;
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330090Cwp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectSchoolPageAssem@2721.searchTermEmitter$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILIIL = C09IC.LJIILIIL(this.LLILLJJLI.LLLIIIL, 1000L);
            AgS195S0200000_4 agS195S0200000_4 = new AgS195S0200000_4(this.LLILLJJLI, this.LLILLL, 7);
            this.LL = 1;
            if (interfaceC346201WaLJIILIIL.collect(agS195S0200000_4, this) == objLJFF) {
                C1C7U.LIZIZ("SelectSchoolPageAssem@2721.searchTermEmitter$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectSchoolPageAssem@2721.searchTermEmitter$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
