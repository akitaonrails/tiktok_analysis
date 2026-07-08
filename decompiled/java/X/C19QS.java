package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.19QS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19QS {
    public final Menu LIZ;
    public int LIZIZ = 0;
    public int LIZJ = 0;
    public int LIZLLL = 0;
    public int LJ = 0;
    public boolean LJFF = true;
    public boolean LJI = true;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public CharSequence LJIIJ;
    public CharSequence LJIIJJI;
    public int LJIIL;
    public char LJIILIIL;
    public int LJIILJJIL;
    public char LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public String LJJ;
    public String LJJI;
    public AbstractC21548519Ut LJJIFFI;
    public CharSequence LJJII;
    public CharSequence LJJIII;
    public ColorStateList LJJIIJ;
    public PorterDuff.Mode LJJIIJZLJL;
    public final /* synthetic */ C19QR LJJIIZ;

    public final void LIZIZ(MenuItem menuItem) {
        boolean z;
        MenuItem enabled = menuItem.setChecked(this.LJIJ).setVisible(this.LJIJI).setEnabled(this.LJIJJ);
        boolean z2 = false;
        if (this.LJIIZILJ >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.LJIIJJI).setIcon(this.LJIIL);
        int i = this.LJIJJLI;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.LJJI != null) {
            if (!this.LJJIIZ.LIZJ.isRestricted()) {
                C19QR c19qr = this.LJJIIZ;
                if (c19qr.LIZLLL == null) {
                    c19qr.LIZLLL = C19QR.LIZ(c19qr.LIZJ);
                }
                final Object obj = c19qr.LIZLLL;
                final String str = this.LJJI;
                menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(obj, str) { // from class: X.12wZ
                    public static final Class<?>[] LIZJ = {MenuItem.class};
                    public final Object LIZ;
                    public final Method LIZIZ;

                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        try {
                            if (this.LIZIZ.getReturnType() == Boolean.TYPE) {
                                return ((Boolean) this.LIZIZ.invoke(this.LIZ, menuItem2)).booleanValue();
                            }
                            this.LIZIZ.invoke(this.LIZ, menuItem2);
                            return true;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new RuntimeException(e);
                        }
                    }

                    {
                        this.LIZ = obj;
                        Class<?> cls = obj.getClass();
                        try {
                            this.LIZIZ = cls.getMethod(str, LIZJ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Couldn't resolve menu item onClick handler ");
                            sbLIZ.append(str);
                            sbLIZ.append(" in class ");
                            sbLIZ.append(cls.getName());
                            InflateException inflateException = new InflateException(C2188811AlT.LIZIZ(sbLIZ));
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    }
                });
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.LJIIZILJ >= 2) {
            if (menuItem instanceof C21548219Uq) {
                ((C21548219Uq) menuItem).LJI(true);
            } else if (menuItem instanceof MenuItemC21548719Uv) {
                MenuItemC21548719Uv menuItemC21548719Uv = (MenuItemC21548719Uv) menuItem;
                try {
                    if (menuItemC21548719Uv.LJ == null) {
                        menuItemC21548719Uv.LJ = menuItemC21548719Uv.LIZLLL.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC21548719Uv.LJ.invoke(menuItemC21548719Uv.LIZLLL, Boolean.TRUE);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        String str2 = this.LJJ;
        if (str2 != null) {
            menuItem.setActionView((View) LIZ(str2, C19QR.LJ, this.LJJIIZ.LIZ));
            z2 = true;
        }
        int i2 = this.LJIL;
        if (i2 > 0 && !z2) {
            menuItem.setActionView(i2);
        }
        AbstractC21548519Ut abstractC21548519Ut = this.LJJIFFI;
        if (abstractC21548519Ut != null && (menuItem instanceof InterfaceMenuItemC21548819Uw)) {
            ((InterfaceMenuItemC21548819Uw) menuItem).LIZIZ(abstractC21548519Ut);
        }
        CharSequence charSequence = this.LJJII;
        boolean z3 = menuItem instanceof InterfaceMenuItemC21548819Uw;
        if (z3) {
            ((InterfaceMenuItemC21548819Uw) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C19QT.LJII(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.LJJIII;
        if (z3) {
            ((InterfaceMenuItemC21548819Uw) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C19QT.LJIIL(menuItem, charSequence2);
        }
        char c = this.LJIILIIL;
        int i3 = this.LJIILJJIL;
        if (z3) {
            ((InterfaceMenuItemC21548819Uw) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C19QT.LJI(menuItem, c, i3);
        }
        char c2 = this.LJIILL;
        int i4 = this.LJIILLIIL;
        if (z3) {
            ((InterfaceMenuItemC21548819Uw) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C19QT.LJIIJ(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.LJJIIJZLJL;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC21548819Uw) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C19QT.LJIIIZ(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.LJJIIJ;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC21548819Uw) menuItem).setIconTintList(colorStateList);
            } else {
                if (Build.VERSION.SDK_INT < 26) {
                    return;
                }
                C19QT.LJIIIIZZ(menuItem, colorStateList);
            }
        }
    }

    public C19QS(C19QR c19qr, Menu menu) {
        this.LJJIIZ = c19qr;
        this.LIZ = menu;
    }

    public final <T> T LIZ(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.LJJIIZ.LIZJ.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
