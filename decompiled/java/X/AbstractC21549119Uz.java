package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: X.19Uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21549119Uz {
    public final Context LIZ;
    public C830530Wi3<InterfaceMenuItemC21548819Uw, MenuItem> LIZIZ;
    public C830530Wi3<C19QV, SubMenu> LIZJ;

    public AbstractC21549119Uz(Context context) {
        this.LIZ = context;
    }

    public final MenuItem LIZJ(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC21548819Uw) {
            InterfaceMenuItemC21548819Uw interfaceMenuItemC21548819Uw = (InterfaceMenuItemC21548819Uw) menuItem;
            if (this.LIZIZ == null) {
                this.LIZIZ = new C830530Wi3<>();
            }
            MenuItem menuItem2 = this.LIZIZ.get(interfaceMenuItemC21548819Uw);
            if (menuItem2 == null) {
                MenuItemC21548719Uv menuItemC21548719Uv = new MenuItemC21548719Uv(this.LIZ, interfaceMenuItemC21548819Uw);
                this.LIZIZ.put(interfaceMenuItemC21548819Uw, menuItemC21548719Uv);
                return menuItemC21548719Uv;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu LIZLLL(SubMenu subMenu) {
        if (subMenu instanceof C19QV) {
            C19QV c19qv = (C19QV) subMenu;
            if (this.LIZJ == null) {
                this.LIZJ = new C830530Wi3<>();
            }
            SubMenu subMenu2 = this.LIZJ.get(c19qv);
            if (subMenu2 == null) {
                C19V0 c19v0 = new C19V0(this.LIZ, c19qv);
                this.LIZJ.put(c19qv, c19v0);
                return c19v0;
            }
            return subMenu2;
        }
        return subMenu;
    }
}
