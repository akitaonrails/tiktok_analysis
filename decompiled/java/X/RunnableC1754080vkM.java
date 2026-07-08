package X;

import android.animation.Animator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem;

/* JADX INFO: renamed from: X.0vkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1754080vkM implements Runnable {
    public final CartBenefitInfo LL;
    public final /* synthetic */ C1754020vkG LLILLJJLI;

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
    public final void LIZ() {
        CartBenefitContentInfo cartBenefitContentInfo;
        Integer num;
        final C1754020vkG c1754020vkG = this.LLILLJJLI;
        final FrameLayout frameLayout = c1754020vkG.LJIIIZ;
        if (frameLayout != null) {
            CartBenefitItem cartBenefitItem = this.LL.dynamicItem;
            final int iIntValue = (cartBenefitItem == null || (cartBenefitContentInfo = cartBenefitItem.contentInfo) == null || (num = cartBenefitContentInfo.dynamicDurationSecond) == null) ? 0 : num.intValue();
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            c1754020vkG.LJIILJJIL(frameLayout, frameLayout.getMeasuredWidth(), 0.0f, new AbstractC1754190vkX(frameLayout, c1754020vkG, this, iIntValue) { // from class: X.0vkN
                public final /* synthetic */ FrameLayout LLILLJJLI;
                public final /* synthetic */ C1754020vkG LLILLL;
                public final /* synthetic */ RunnableC1754080vkM LLILZ;
                public final /* synthetic */ int LLILZIL;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C1753840vjy c1753840vjy;
                    C384050F3z c384050F3z;
                    View view = this.LLILLL.LJII;
                    if ((view instanceof C1753840vjy) && (c1753840vjy = (C1753840vjy) view) != null && (c384050F3z = c1753840vjy.LLJJ) != null) {
                        c1753840vjy.getCdSideSlipContainerFromXml().setBackgroundDrawable(c384050F3z.LIZ(c1753840vjy.getContext()));
                    }
                    RunnableC1754130vkR runnableC1754130vkR = this.LLILLL.LJJI;
                    if (runnableC1754130vkR != null) {
                        HandlerHook.viewPostDelay(this.LLILLJJLI, runnableC1754130vkR, ((long) this.LLILZIL) * 1000);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C1753840vjy c1753840vjy;
                    C1754020vkG c1754020vkG2 = this.LLILLL;
                    c1754020vkG2.LJIJJ = true;
                    View view = c1754020vkG2.LJII;
                    if ((view instanceof C1753840vjy) && (c1753840vjy = (C1753840vjy) view) != null) {
                        c1753840vjy.setCartBenefitInfo(this.LLILZ.LL);
                    }
                    this.LLILLL.LJJII.LIZ(this.LLILZ.LL);
                    InterfaceC1754210vkZ interfaceC1754210vkZ = this.LLILLL.LJIILJJIL;
                    if (interfaceC1754210vkZ != null) {
                        interfaceC1754210vkZ.LIZ(this.LLILZ.LL);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(frameLayout);
                    this.LLILLJJLI = frameLayout;
                    this.LLILLL = c1754020vkG;
                    this.LLILZ = this;
                    this.LLILZIL = iIntValue;
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CartBenefitManager$SideSlipExpandRunnable@dba6.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CartBenefitManager$SideSlipExpandRunnable@dba6.run");
    }

    public RunnableC1754080vkM(C1754020vkG c1754020vkG, CartBenefitInfo cartBenefitInfo) {
        this.LLILLJJLI = c1754020vkG;
        this.LL = cartBenefitInfo;
    }
}
