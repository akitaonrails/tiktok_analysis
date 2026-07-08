package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: X.19V1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19V1 extends AbstractC21549119Uz implements Menu {
    public final C19QU LIZLLL;

    @Override // android.view.Menu
    public final void clear() {
        C830530Wi3<InterfaceMenuItemC21548819Uw, MenuItem> c830530Wi3 = this.LIZIZ;
        if (c830530Wi3 != null) {
            c830530Wi3.clear();
        }
        C830530Wi3<C19QV, SubMenu> c830530Wi32 = this.LIZJ;
        if (c830530Wi32 != null) {
            c830530Wi32.clear();
        }
        this.LIZLLL.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.LIZLLL.close();
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.LIZLLL.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final int size() {
        return this.LIZLLL.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return LIZJ(this.LIZLLL.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return LIZLLL(this.LIZLLL.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return LIZJ(this.LIZLLL.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return LIZJ(this.LIZLLL.getItem(i));
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.LIZIZ != null) {
            int i2 = 0;
            while (true) {
                C830530Wi3<InterfaceMenuItemC21548819Uw, MenuItem> c830530Wi3 = this.LIZIZ;
                if (i2 >= c830530Wi3.LLILLL) {
                    break;
                }
                if (c830530Wi3.LJFF(i2).getGroupId() == i) {
                    this.LIZIZ.LJI(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.LIZLLL.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.LIZIZ != null) {
            int i2 = 0;
            while (true) {
                C830530Wi3<InterfaceMenuItemC21548819Uw, MenuItem> c830530Wi3 = this.LIZIZ;
                if (i2 >= c830530Wi3.LLILLL) {
                    break;
                }
                if (c830530Wi3.LJFF(i2).getItemId() == i) {
                    this.LIZIZ.LJI(i2);
                    break;
                }
                i2++;
            }
        }
        this.LIZLLL.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.LIZLLL.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return LIZJ(this.LIZLLL.add(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return LIZLLL(this.LIZLLL.addSubMenu(charSequence));
    }

    public C19V1(Context context, C19QU c19qu) {
        super(context);
        if (c19qu != null) {
            this.LIZLLL = c19qu;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.LIZLLL.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.LIZLLL.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.LIZLLL.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.LIZLLL.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.LIZLLL.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.LIZLLL.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return LIZJ(this.LIZLLL.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return LIZLLL(this.LIZLLL.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return LIZJ(this.LIZLLL.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return LIZLLL(this.LIZLLL.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int iAddIntentOptions = this.LIZLLL.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = LIZJ(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }
}
