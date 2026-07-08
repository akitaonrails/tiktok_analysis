package X;

import com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08aY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper$processPopupByIntelligence$3$3", f = "IntelligentPopupHelper.kt", l = {140}, m = "invokeSuspend")
public final class C2143608aY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2143608aY(InterfaceC1364105Vn<? super C2143608aY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2143608aY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IntelligentPopupHelper@f5e9.processPopupByIntelligence$3$3");
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
            IntelligentPopupHelper.LIZ.getClass();
            long jLongValue = ((Number) IntelligentPopupHelper.LIZJ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("IntelligentPopupHelper@f5e9.processPopupByIntelligence$3$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IntelligentPopupHelper@f5e9.processPopupByIntelligence$3$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2143608aY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
