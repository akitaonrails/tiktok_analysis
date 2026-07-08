package X;

import Y.ARunnableS129S0100000_29;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.195v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214837195v implements InterfaceC214832195q {
    public View LIZ;

    @Override // X.InterfaceC214832195q
    public void onEvent(AbstractC214838195w abstractC214838195w) {
        if (abstractC214838195w instanceof C960230b5x) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnSearchStarted path=");
            sbLIZ.append(((C960230b5x) abstractC214838195w).LIZ);
            sbLIZ.append(" → show searching background");
            C20441214yg.LJIIIZ("SearchingBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ));
            View view = this.LIZ;
            if (view != null) {
                view.animate().cancel();
                C786410Ut5.T4(view, 1.0f);
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        if (abstractC214838195w instanceof C20689215xa) {
            C20441214yg.LJIIIZ("SearchingBackgroundComponent", "OnPartnerFound → keep searching background visible during celebration");
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C214839195x.LIZ)) {
            View view2 = this.LIZ;
            if (view2 == null) {
                C20441214yg.LJIIIZ("SearchingBackgroundComponent", "OnCelebrationFinished → background view already null, skipping fade");
                return;
            }
            C20441214yg.LJIIIZ("SearchingBackgroundComponent", "OnCelebrationFinished → fade-out searching background (300ms)");
            view2.animate().cancel();
            view2.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS129S0100000_29(this, 241)).start();
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C960250b5z.LIZ)) {
            C20441214yg.LJIIIZ("SearchingBackgroundComponent", "OnSearchCancelled → hide searching background (instant)");
            View view3 = this.LIZ;
            if (view3 == null) {
                return;
            }
            view3.animate().cancel();
            C786410Ut5.T4(view3, 1.0f);
            C786410Ut5.LJLLLLLL(8, view3);
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C214841195z.LIZ) || Intrinsics.LJFF(abstractC214838195w, C214840195y.LIZ) || Intrinsics.LJFF(abstractC214838195w, C960240b5y.LIZ) || (abstractC214838195w instanceof C960220b5w) || (abstractC214838195w instanceof C1158070gF3) || (abstractC214838195w instanceof C1158080gF4) || (abstractC214838195w instanceof C1158060gF2)) {
        } else {
            throw new C1954807lC();
        }
    }
}
