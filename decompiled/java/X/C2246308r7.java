package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$getEffectIdResult$2", f = "MobileEffectUtil.kt", l = {509}, m = "invokeSuspend")
public final class C2246308r7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<String>>, Object> {
    public int LL;

    public C2246308r7(InterfaceC1364105Vn<? super C2246308r7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2246308r7(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.getEffectIdResult$2");
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
            InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C786410Ut5.M3(C0CHQ.LIZ), null);
            this.LL = 1;
            obj = C1638650skB.LIZ(interfaceC1635410sexLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.getEffectIdResult$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.getEffectIdResult$2");
        return obj;
    }
}
