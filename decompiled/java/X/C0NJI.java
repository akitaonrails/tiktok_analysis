package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailAwemeModel$handleData$1$1", f = "AddYoursDetailAwemeModel.kt", l = {}, m = "invokeSuspend")
public final class C0NJI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddYoursTopic LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJI(AddYoursTopic addYoursTopic, InterfaceC1364105Vn<? super C0NJI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addYoursTopic;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursDetailAwemeModel@da7e.handleData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1440005kM.LIZ(new C0NKE(this.LL, EnumC615090OAp.NETWORK));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursDetailAwemeModel@da7e.handleData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
