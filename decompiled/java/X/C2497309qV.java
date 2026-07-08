package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundGenerateComponent$tryCheckFaceAndGenerate$1$hasFace$1", f = "AIPlaygroundGenerateComponent.kt", l = {}, m = "invokeSuspend")
public final class C2497309qV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497309qV(List<String> list, InterfaceC1364105Vn<? super C2497309qV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2497309qV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPlaygroundGenerateComponent@1d45.tryCheckFaceAndGenerate$1$hasFace$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C2497209qU.LIZIZ(this.LL));
        C1C7U.LIZIZ("AIPlaygroundGenerateComponent@1d45.tryCheckFaceAndGenerate$1$hasFace$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
