package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS48S0010000_2;
import njp.a;

/* JADX INFO: renamed from: X.063A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$enterNewAIBot$1$firstResult$1$2", f = "TakoEnterUtil.kt", l = {}, m = "invokeSuspend")
public final class C063A extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063A(C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C063A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C063A c063a = new C063A(this.LLILLJJLI, interfaceC1364105Vn);
        c063a.LL = ((Boolean) obj).booleanValue();
        return c063a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEnterUtil@4341.enterNewAIBot$1$firstResult$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        new AwS48S0010000_2(z, 2);
        if (!z) {
            this.LLILLJJLI.element = "loadBackgroundTask";
            C1C7U.LIZIZ("TakoEnterUtil@4341.enterNewAIBot$1$firstResult$1$2");
            return false;
        }
        C1C7U.LIZIZ("TakoEnterUtil@4341.enterNewAIBot$1$firstResult$1$2");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
