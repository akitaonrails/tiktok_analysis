package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.view.uikit.AsyncImageSpan$1", f = "AsyncImageSpan.kt", l = {29}, m = "invokeSuspend")
public final class C442701nt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C442801nu LLILLJJLI;
    public final /* synthetic */ Function0<Drawable> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C442701nt(C442801nu c442801nu, Function0<? extends Drawable> function0, InterfaceC1364105Vn<? super C442701nt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c442801nu;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442701nt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AsyncImageSpan@86db.<init>$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C440401nW c440401nW = new C440401nW(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c440401nW);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AsyncImageSpan@86db.<init>$1");
                return objLJFF;
            }
        }
        Drawable drawable = (Drawable) obj;
        C442801nu c442801nu = this.LLILLJJLI;
        if (drawable == null) {
            c442801nu.getClass();
        } else {
            drawable.setBounds(0, 0, c442801nu.LLILLL.getLineHeight(), c442801nu.LLILLL.getLineHeight());
            C416760GVu c416760GVu = new C416760GVu(drawable);
            CharSequence text = c442801nu.LLILLL.getText();
            if (text instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) text;
                int spanStart = spannedString.getSpanStart(c442801nu);
                int spanEnd = spannedString.getSpanEnd(c442801nu);
                int spanFlags = spannedString.getSpanFlags(c442801nu);
                if (spanStart != -1 && spanEnd != -1) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                    spannableStringBuilder.removeSpan(c442801nu);
                    C786410Ut5.q2(spannableStringBuilder, c416760GVu, spanStart, spanEnd, spanFlags);
                    c442801nu.LLILLL.setText(spannableStringBuilder);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncImageSpan@86db.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
