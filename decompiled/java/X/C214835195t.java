package X;

import Y.ARunnableS42S0101000_31;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.195t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214835195t implements InterfaceC214832195q {
    public C16F5 LIZ;
    public EnumC214828195m LIZIZ = EnumC214828195m.LARGE;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;

    public final void LIZ() {
        C16F5 c16f5 = this.LIZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(C915980Zwa.LJI().LIZ().LJJJJZI().contains(1) ? 2131851877 : 2131851885));
        }
    }

    public final void LIZIZ() {
        C16F5 c16f5 = this.LIZ;
        if (c16f5 == null) {
            return;
        }
        int i = (this.LIZJ && this.LIZIZ == EnumC214828195m.LARGE && !this.LIZLLL) ? 0 : 8;
        C786410Ut5.LLJJJJ(c16f5, i);
        if (i == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyVisibility visible w=");
            sbLIZ.append(c16f5.getWidth());
            sbLIZ.append(" h=");
            sbLIZ.append(c16f5.getHeight());
            sbLIZ.append(" textLen=");
            CharSequence text = c16f5.getText();
            sbLIZ.append(text != null ? text.length() : 0);
            sbLIZ.append(" alpha=");
            sbLIZ.append(c16f5.getAlpha());
            C20441214yg.LJIIIZ("SearchStatusTextComponent", C2188811AlT.LIZIZ(sbLIZ));
            LIZJ();
        }
    }

    public final void LIZJ() {
        View view;
        C16F5 c16f5 = this.LIZ;
        if (c16f5 != null && c16f5.getVisibility() == 0) {
            c16f5.requestLayout();
            Object parent = c16f5.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // X.InterfaceC214832195q
    public void onEvent(AbstractC214838195w abstractC214838195w) {
        String str;
        Integer numValueOf;
        if (abstractC214838195w instanceof C960230b5x) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnSearchStarted path=");
            sbLIZ.append(((C960230b5x) abstractC214838195w).LIZ);
            sbLIZ.append(" lastCategory=");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" → set searchInProgress + apply visibility");
            C20441214yg.LJIIIZ("SearchStatusTextComponent", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ = true;
            this.LIZLLL = false;
            this.LJ++;
            C16F5 c16f5 = this.LIZ;
            if (c16f5 != null) {
                c16f5.animate().cancel();
                C786410Ut5.k5(c16f5, 1.0f);
            }
            LIZ();
            LIZIZ();
            LIZJ();
            return;
        }
        if (abstractC214838195w instanceof C20689215xa) {
            this.LIZJ = false;
            this.LIZLLL = false;
            C16F5 c16f52 = this.LIZ;
            if (c16f52 != null && c16f52.getVisibility() == 0) {
                C20441214yg.LJIIIZ("SearchStatusTextComponent", "OnPartnerFound → fade-out status text (700ms)");
                int i = this.LJ;
                c16f52.animate().cancel();
                c16f52.animate().alpha(0.0f).setDuration(700L).withEndAction(new ARunnableS42S0101000_31(i, this, 19)).start();
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("OnPartnerFound → status text not visible (was=");
            if (c16f52 != null) {
                numValueOf = Integer.valueOf(c16f52.getVisibility());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append("), leave GONE to avoid shifting bottom-stack barrier");
            C20441214yg.LJIIIZ("SearchStatusTextComponent", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C960250b5z.LIZ)) {
            C20441214yg.LJIIIZ("SearchStatusTextComponent", "OnSearchCancelled → hide status text (instant) + clear searchInProgress");
            this.LIZJ = false;
            this.LIZLLL = false;
            this.LJ++;
            C16F5 c16f53 = this.LIZ;
            if (c16f53 == null) {
                return;
            }
            c16f53.animate().cancel();
            C786410Ut5.k5(c16f53, 1.0f);
            C786410Ut5.LLJJJJ(c16f53, 8);
            return;
        }
        if (abstractC214838195w instanceof C1158080gF4) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("OnTileSizeChanged category=");
            C1158080gF4 c1158080gF4 = (C1158080gF4) abstractC214838195w;
            sbLIZ3.append(c1158080gF4.LIZ);
            sbLIZ3.append(" (was=");
            sbLIZ3.append(this.LIZIZ);
            sbLIZ3.append(") → re-evaluate visibility");
            C20441214yg.LJIIIZ("SearchStatusTextComponent", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZIZ = c1158080gF4.LIZ;
            LIZIZ();
            return;
        }
        if (abstractC214838195w instanceof C1158070gF3) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("OnHintVisibilityChanged visible=");
            C1158070gF3 c1158070gF3 = (C1158070gF3) abstractC214838195w;
            sbLIZ4.append(c1158070gF3.LIZ);
            sbLIZ4.append(" searchInProgress=");
            sbLIZ4.append(this.LIZJ);
            sbLIZ4.append(" lastCategory=");
            sbLIZ4.append(this.LIZIZ);
            sbLIZ4.append(" → ");
            if (c1158070gF3.LIZ) {
                str = "hide status text (hint replaces)";
            } else {
                str = "re-evaluate";
            }
            sbLIZ4.append(str);
            C20441214yg.LJIIIZ("SearchStatusTextComponent", C2188811AlT.LIZIZ(sbLIZ4));
            boolean z = c1158070gF3.LIZ;
            this.LIZLLL = z;
            if (z) {
                C16F5 c16f54 = this.LIZ;
                if (c16f54 == null) {
                    return;
                }
                c16f54.animate().cancel();
                C786410Ut5.k5(c16f54, 1.0f);
                C786410Ut5.LLJJJJ(c16f54, 8);
                return;
            }
            LIZIZ();
            return;
        }
        if (abstractC214838195w instanceof C1158060gF2) {
            if (!this.LIZJ) {
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("OnPreferenceTagsChanged tags=");
            sbLIZ5.append(((C1158060gF2) abstractC214838195w).LIZ);
            sbLIZ5.append(" → refresh search status text");
            C20441214yg.LJIIIZ("SearchStatusTextComponent", C2188811AlT.LIZIZ(sbLIZ5));
            LIZ();
            if (!this.LIZJ || this.LIZIZ != EnumC214828195m.LARGE || this.LIZLLL) {
                return;
            }
            LIZJ();
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C214841195z.LIZ)) {
            if (!this.LIZJ) {
                return;
            }
            C20441214yg.LJIIIZ("SearchStatusTextComponent", "OnOverlayShown → refresh status text + remeasure (host container visible)");
            LIZ();
            LIZIZ();
            LIZJ();
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C214839195x.LIZ) || Intrinsics.LJFF(abstractC214838195w, C214840195y.LIZ) || Intrinsics.LJFF(abstractC214838195w, C960240b5y.LIZ) || (abstractC214838195w instanceof C960220b5w)) {
        } else {
            throw new C1954807lC();
        }
    }
}
