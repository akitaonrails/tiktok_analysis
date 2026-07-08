package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.translate.AutoTranslateTextView$setText$1$3", f = "AutoTranslateTextView.kt", l = {}, m = "invokeSuspend")
public final class C1528160pry extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1528180ps0 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TextView.BufferType LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528160pry(C1528180ps0 c1528180ps0, String str, TextView.BufferType bufferType, InterfaceC1364105Vn<? super C1528160pry> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1528180ps0;
        this.LLILLJJLI = str;
        this.LLILLL = bufferType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1528160pry(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoTranslateTextView@9fc4.setText$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        super/*com.bytedance.tux.input.TuxTextView*/.setText(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoTranslateTextView@9fc4.setText$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
