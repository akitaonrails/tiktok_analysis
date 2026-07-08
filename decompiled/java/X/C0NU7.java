package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NU7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend")
public final class C0NU7 extends C09AX implements Function1<InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ C0NUC LLILLJJLI;
    public final /* synthetic */ C0NUU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NU7(C0NUC c0nuc, C0NUU c0nuu, InterfaceC1364105Vn<? super C0NU7> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0nuc;
        this.LLILLL = c0nuu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NU7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            C0NUC c0nuc = this.LLILLJJLI;
            C0NUU c0nuu = this.LLILLL;
            this.LL = 1;
            obj = c0nuc.LJIILIIL(c0nuu, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        return obj;
    }
}
