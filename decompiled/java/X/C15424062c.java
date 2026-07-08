package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.openplatform.CreatePublicGroupPreCheckHelper$processPublicGroupCreation$1$2", f = "CreatePublicGroupPreCheckHelper.kt", l = {}, m = "invokeSuspend")
public final class C15424062c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15424062c(DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C15424062c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15424062c(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatePublicGroupPreCheckHelper@7239.processPublicGroupCreation$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatePublicGroupPreCheckHelper@7239.processPublicGroupCreation$1$2");
        return unit;
    }
}
