package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: renamed from: X.14Ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20243114Ir extends LinearLayout {
    public final TuxTextView LL;
    public final C421110GfF LLILLJJLI;
    public final C421110GfF LLILLL;
    public final C421110GfF LLILZ;
    public final C421110GfF LLILZIL;
    public final List<C421110GfF> LLILZLL;
    public final C197039127h LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final FrameLayout LLJ;
    public final C1295960jpS LLJI;
    public final C20243414Iu LLJIJIL;
    public final C1163304gp LLJILJIL;
    public final C14IJ LLJILJILJ;
    public final View LLJILLL;
    public final TuxIconView LLJJ;
    public final AwS644S0100000_30 LLJJI;
    public final AwS644S0100000_30 LLJJIII;

    public final void LIZIZ() {
        View view = this.LLJILLL;
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.LLJILLL.getAlpha(), 0.0f);
        alphaAnimation.setDuration(alphaAnimation.getDuration());
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC20306514cx(this, 2));
        view.startAnimation(alphaAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLJI.isAnimating()) {
            this.LLJI.cancelAnimation();
        }
    }

    public final void setClickConfig(Function1<? super C20243414Iu, Unit> function1) {
        function1.invoke(this.LLJIJIL);
    }

    public final void setShowConfig(Function1<? super C1163304gp, Unit> function1) {
        function1.invoke(this.LLJILJIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01eb  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20243114Ir(android.content.Context r22, android.util.AttributeSet r23) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20243114Ir.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static Drawable LIZ(float f, int i, Context context) {
        if (f > 0.0f) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(i);
            c384050F3z.LIZJ = Float.valueOf(f);
            return c384050F3z.LIZ(context);
        }
        return new ColorDrawable(i);
    }
}
