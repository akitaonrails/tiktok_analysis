package X;

import android.animation.Animator;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;

/* JADX INFO: renamed from: X.0vkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1754130vkR implements Runnable {
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
    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CartBenefitManager$SideSlipCollapseRunnable@578f.run");
        try {
            final C1754020vkG c1754020vkG = this.LLILLJJLI;
            final FrameLayout frameLayout = c1754020vkG.LJIIIZ;
            if (frameLayout != null) {
                c1754020vkG.LJIILJJIL(frameLayout, 0.0f, frameLayout.getWidth(), new AbstractC1754190vkX(frameLayout) { // from class: X.0vkS
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C1753840vjy c1753840vjy;
                        View view = c1754020vkG.LJII;
                        if ((view instanceof C1753840vjy) && (c1753840vjy = (C1753840vjy) view) != null) {
                            C786410Ut5.LLILLL(c1753840vjy.getCdSideSlipContainerFromXml(), 8);
                            C786410Ut5.LJZ(8, c1753840vjy.getFlSideSlipContainerFromXml());
                        }
                        c1754020vkG.LJIILIIL(this.LL);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C1753840vjy c1753840vjy;
                        View view = c1754020vkG.LJII;
                        if ((view instanceof C1753840vjy) && (c1753840vjy = (C1753840vjy) view) != null) {
                            c1753840vjy.getCdSideSlipContainerFromXml().setBackgroundColor(0);
                        }
                    }
                });
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CartBenefitManager$SideSlipCollapseRunnable@578f.run");
    }

    public RunnableC1754130vkR(C1754020vkG c1754020vkG, CartBenefitInfo cartBenefitInfo) {
        this.LLILLJJLI = c1754020vkG;
        this.LL = cartBenefitInfo;
    }
}
