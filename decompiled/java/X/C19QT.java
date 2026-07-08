package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: X.19QT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19QT {
    public static int LIZ(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static CharSequence LIZIZ(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static ColorStateList LIZJ(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static PorterDuff.Mode LIZLLL(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static int LJ(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static CharSequence LJFF(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static MenuItem LJII(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static MenuItem LJIIIIZZ(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static MenuItem LJIIIZ(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static MenuItem LJIIL(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    public static MenuItem LJI(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    public static MenuItem LJIIJ(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    public static MenuItem LJIIJJI(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }
}
