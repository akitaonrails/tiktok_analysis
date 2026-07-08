package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: X.19Us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class SubMenuC21548419Us extends C19V6 implements SubMenu {
    public final C19V6 LJJIFFI;
    public final C21548219Uq LJJII;

    @Override // X.C19V6
    public final String LJIIIZ() {
        int i;
        C21548219Uq c21548219Uq = this.LJJII;
        if (c21548219Uq == null || (i = c21548219Uq.LIZ) == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:menu:actionviewstates");
        sbLIZ.append(":");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C19V6
    public final C19V6 LJIIJ() {
        return this.LJJIFFI.LJIIJ();
    }

    @Override // X.C19V6
    public final boolean LJIIL() {
        return this.LJJIFFI.LJIIL();
    }

    @Override // X.C19V6
    public final boolean LJIILIIL() {
        return this.LJJIFFI.LJIILIIL();
    }

    @Override // X.C19V6
    public final boolean LJIILJJIL() {
        return this.LJJIFFI.LJIILJJIL();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.LJJII;
    }

    @Override // X.C19V6
    public final boolean LIZLLL(C21548219Uq c21548219Uq) {
        return this.LJJIFFI.LIZLLL(c21548219Uq);
    }

    @Override // X.C19V6
    public final boolean LJFF(C21548219Uq c21548219Uq) {
        return this.LJJIFFI.LJFF(c21548219Uq);
    }

    @Override // X.C19V6, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.LJJIFFI.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        LJIL(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        LJIL(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        LJIL(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.LJJII.setIcon(i);
        return this;
    }

    @Override // X.C19V6, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.LJJIFFI.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        LJIL(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        LJIL(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.LJJII.setIcon(drawable);
        return this;
    }

    @Override // X.C19V6
    public final boolean LJ(C19V6 c19v6, MenuItem menuItem) {
        if (!super.LJ(c19v6, menuItem) && !this.LJJIFFI.LJ(c19v6, menuItem)) {
            return false;
        }
        return true;
    }

    public SubMenuC21548419Us(Context context, C19V6 c19v6, C21548219Uq c21548219Uq) {
        super(context);
        this.LJJIFFI = c19v6;
        this.LJJII = c21548219Uq;
    }
}
