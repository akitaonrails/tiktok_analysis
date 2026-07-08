package X;

import Y.AAListenerS90S0101000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.view.LeagueMatchMarqueeTextView$startDisplay$1$1", f = "LeagueMatchMarqueeTextView.kt", l = {86}, m = "invokeSuspend")
public final class C1096890eeN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1096900eeO LLILLJJLI;
    public final /* synthetic */ Text LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096890eeN(C1096900eeO c1096900eeO, Text text, InterfaceC1364105Vn<? super C1096890eeN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1096900eeO;
        this.LLILLL = text;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096890eeN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iMeasureText;
        int iMeasureText2;
        int width;
        int scrollX;
        C1C7U.LIZ("LeagueMatchMarqueeTextView@90cd.startDisplay$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("LeagueMatchMarqueeTextView@90cd.startDisplay$1$1");
                return objLJFF;
            }
        }
        final C1096900eeO c1096900eeO = this.LLILLJJLI;
        final Text text = this.LLILLL;
        InterfaceC1096920eeQ interfaceC1096920eeQ = new InterfaceC1096920eeQ() { // from class: X.0eeP
            @Override // X.InterfaceC1096920eeQ
            public final void LIZ(int i2) {
                if (i2 > 0) {
                    c1096900eeO.LJJJJIZL(text);
                }
            }
        };
        if (c1096900eeO.LLJJ) {
            C20441214yg.LJIIIZ("MarqueeTextView", "tryMarquee");
            TextPaint paint = c1096900eeO.getPaint();
            if (paint != null) {
                iMeasureText = (int) paint.measureText(c1096900eeO.getText().toString());
            } else {
                iMeasureText = 0;
            }
            if (iMeasureText > c1096900eeO.getWidth()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) C1133830fbx.LJIILIIL(text, ""));
                spannableStringBuilder.append((CharSequence) c1096900eeO.LLJJIJIIJIL);
                c1096900eeO.setText(spannableStringBuilder);
                TextPaint paint2 = c1096900eeO.getPaint();
                if (paint2 != null) {
                    iMeasureText2 = (int) paint2.measureText(c1096900eeO.getText().toString());
                } else {
                    iMeasureText2 = 0;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) C1133830fbx.LJIILIIL(text, ""));
                spannableStringBuilder2.append((CharSequence) c1096900eeO.LLJJIJIIJIL);
                spannableStringBuilder2.append((CharSequence) C1133830fbx.LJIILIIL(text, ""));
                c1096900eeO.setText(spannableStringBuilder2);
                if (C497740JfY.LJJ()) {
                    width = 1048576 - c1096900eeO.getWidth();
                } else {
                    width = 0;
                }
                c1096900eeO.setScrollX(width);
                if (C497740JfY.LJJ()) {
                    scrollX = c1096900eeO.getScrollX() - iMeasureText2;
                } else {
                    scrollX = c1096900eeO.getScrollX() + iMeasureText2;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c1096900eeO.getScrollX(), scrollX);
                c1096900eeO.LLJJIII = valueAnimatorOfInt;
                if (valueAnimatorOfInt != null) {
                    valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                }
                ValueAnimator valueAnimator = c1096900eeO.LLJJIII;
                if (valueAnimator != null) {
                    valueAnimator.setDuration((long) (((iMeasureText2 * 1.0f) / c1096900eeO.LLJJIJI) * 1000));
                }
                ValueAnimator valueAnimator2 = c1096900eeO.LLJJIII;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new AUListenerS266S0100000_17(c1096900eeO, 8));
                }
                ValueAnimator valueAnimator3 = c1096900eeO.LLJJIII;
                if (valueAnimator3 != null) {
                    valueAnimator3.addListener(new AAListenerS90S0101000_17(iMeasureText2, interfaceC1096920eeQ, 0));
                }
                ValueAnimator valueAnimator4 = c1096900eeO.LLJJIII;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            } else {
                interfaceC1096920eeQ.LIZ(0);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LeagueMatchMarqueeTextView@90cd.startDisplay$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
