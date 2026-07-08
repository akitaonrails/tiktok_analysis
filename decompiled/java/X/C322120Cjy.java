package X;

import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoContentAssem$onViewCreated$9$onAskQuestionStart$1", f = "TakoContentAssem.kt", l = {}, m = "invokeSuspend")
public final class C322120Cjy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322120Cjy(TakoContentAssem takoContentAssem, InterfaceC1364105Vn<? super C322120Cjy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoContentAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322120Cjy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentAssem@bd9.onViewCreated$9$onAskQuestionStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.hp();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentAssem@bd9.onViewCreated$9$onAskQuestionStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
