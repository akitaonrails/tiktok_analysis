package X;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: X.19Uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ActionProviderVisibilityListenerC21548619Uu extends AbstractC21548519Ut implements ActionProvider.VisibilityListener {
    public C19V4 LIZJ;
    public final ActionProvider LIZLLL;
    public final /* synthetic */ MenuItemC21548719Uv LJ;

    @Override // X.AbstractC21548519Ut
    public final boolean LIZ() {
        return this.LIZLLL.hasSubMenu();
    }

    @Override // X.AbstractC21548519Ut
    public final boolean LIZIZ() {
        return this.LIZLLL.isVisible();
    }

    @Override // X.AbstractC21548519Ut
    public final View LIZJ() {
        return this.LIZLLL.onCreateActionView();
    }

    @Override // X.AbstractC21548519Ut
    public final boolean LJ() {
        return this.LIZLLL.onPerformDefaultAction();
    }

    @Override // X.AbstractC21548519Ut
    public final boolean LJI() {
        return this.LIZLLL.overridesItemVisibility();
    }

    @Override // X.AbstractC21548519Ut
    public final View LIZLLL(MenuItem menuItem) {
        return this.LIZLLL.onCreateActionView(menuItem);
    }

    @Override // X.AbstractC21548519Ut
    public final void LJFF(SubMenuC21548419Us subMenuC21548419Us) {
        this.LIZLLL.onPrepareSubMenu(this.LJ.LIZLLL(subMenuC21548419Us));
    }

    @Override // X.AbstractC21548519Ut
    public final void LJII(C19V3 c19v3) {
        this.LIZJ = c19v3;
        this.LIZLLL.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C19V4 c19v4 = this.LIZJ;
        if (c19v4 != null) {
            C19V6 c19v6 = ((C19V3) c19v4).LIZ.LJIILIIL;
            c19v6.LJII = true;
            c19v6.LJIILL(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionProviderVisibilityListenerC21548619Uu(MenuItemC21548719Uv menuItemC21548719Uv, Context context, ActionProvider actionProvider) {
        super(context);
        this.LJ = menuItemC21548719Uv;
        this.LIZLLL = actionProvider;
    }
}
