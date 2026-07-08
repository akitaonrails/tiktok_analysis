package X;

import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS419S0200000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.ui.view.EditTextExtKt$afterTextChangedFlow$1", f = "EditTextExt.kt", l = {23}, m = "invokeSuspend")
public final class C1206200hUg extends C09AX implements Function2<C094D<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EditText LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206200hUg(EditText editText, InterfaceC1364105Vn<? super C1206200hUg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = editText;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1206200hUg c1206200hUg = new C1206200hUg(this.LLILLL, interfaceC1364105Vn);
        c1206200hUg.LLILLJJLI = obj;
        return c1206200hUg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditTextExtKt@8c7c.afterTextChangedFlow$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            C1208860hYy c1208860hYy = new C1208860hYy(c094d, 8);
            this.LLILLL.addTextChangedListener(c1208860hYy);
            AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(this.LLILLL, c1208860hYy, 136);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS419S0200000_18, this) == objLJFF) {
                C1C7U.LIZIZ("EditTextExtKt@8c7c.afterTextChangedFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditTextExtKt@8c7c.afterTextChangedFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super String> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
