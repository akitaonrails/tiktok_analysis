package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.view.uikit.AsyncImageSpan$1", f = "AsyncImageSpan.kt", l = {29}, m = "invokeSuspend")
public final class C442601ns extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C442901nv LLILLJJLI;
    public final /* synthetic */ Function0<Drawable> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C442601ns(C442901nv c442901nv, Function0<? extends Drawable> function0, InterfaceC1364105Vn<? super C442601ns> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c442901nv;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C442601ns(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AsyncImageSpan@b7f6.<init>$1");
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
            C440501nX c440501nX = new C440501nX(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c440501nX);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AsyncImageSpan@b7f6.<init>$1");
                return objLJFF;
            }
        }
        Drawable drawable = (Drawable) obj;
        C442901nv c442901nv = this.LLILLJJLI;
        if (drawable == null) {
            c442901nv.getClass();
        } else {
            drawable.setBounds(0, 0, c442901nv.LL.getLineHeight(), c442901nv.LL.getLineHeight());
            C416640GVi c416640GVi = new C416640GVi(drawable);
            CharSequence text = c442901nv.LL.getText();
            if (text instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) text;
                int spanStart = spannedString.getSpanStart(c442901nv);
                int spanEnd = spannedString.getSpanEnd(c442901nv);
                int spanFlags = spannedString.getSpanFlags(c442901nv);
                if (spanStart != -1 && spanEnd != -1) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                    spannableStringBuilder.removeSpan(c442901nv);
                    C786410Ut5.q2(spannableStringBuilder, c416640GVi, spanStart, spanEnd, spanFlags);
                    c442901nv.LL.setText(spannableStringBuilder);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncImageSpan@b7f6.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
