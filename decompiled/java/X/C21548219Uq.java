package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.19Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21548219Uq implements InterfaceMenuItemC21548819Uw {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public Intent LJI;
    public char LJII;
    public char LJIIIZ;
    public Drawable LJIIJJI;
    public int LJIIL;
    public final C19V6 LJIILIIL;
    public SubMenuC21548419Us LJIILJJIL;
    public MenuItem.OnMenuItemClickListener LJIILL;
    public CharSequence LJIILLIIL;
    public CharSequence LJIIZILJ;
    public ColorStateList LJIJ;
    public PorterDuff.Mode LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJI;
    public View LJJIFFI;
    public AbstractC21548519Ut LJJII;
    public MenuItem.OnActionExpandListener LJJIII;
    public boolean LJJIIJ;
    public int LJIIIIZZ = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
    public int LJIIJ = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
    public int LJJ = 16;

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final boolean LJ() {
        AbstractC21548519Ut abstractC21548519Ut;
        if ((this.LJJI & 8) == 0) {
            return false;
        }
        if (this.LJJIFFI == null && (abstractC21548519Ut = this.LJJII) != null) {
            this.LJJIFFI = abstractC21548519Ut.LIZLLL(this);
        }
        return this.LJJIFFI != null;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.LJJI & 8) == 0) {
            return false;
        }
        if (this.LJJIFFI == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.LJJIII;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.LJIILIIL.LIZLLL(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final View getActionView() {
        View view = this.LJJIFFI;
        if (view != null) {
            return view;
        }
        AbstractC21548519Ut abstractC21548519Ut = this.LJJII;
        if (abstractC21548519Ut == null) {
            return null;
        }
        View viewLIZLLL = abstractC21548519Ut.LIZLLL(this);
        this.LJJIFFI = viewLIZLLL;
        return viewLIZLLL;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.LJIIJJI;
        if (drawable != null) {
            return LIZLLL(drawable);
        }
        int i = this.LJIIL;
        if (i == 0) {
            return null;
        }
        Drawable drawableLIZ = C14MI.LIZ(this.LJIILIIL.LIZ, i);
        this.LJIIL = 0;
        this.LJIIJJI = drawableLIZ;
        return LIZLLL(drawableLIZ);
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.LJFF;
        return charSequence == null ? this.LJ : charSequence;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.LJIILJJIL != null;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.LJJ & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.LJJ & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.LJJ & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC21548519Ut abstractC21548519Ut = this.LJJII;
        return (abstractC21548519Ut == null || !abstractC21548519Ut.LJI()) ? (this.LJJ & 8) == 0 : (this.LJJ & 8) == 0 && this.LJJII.LIZIZ();
    }

    public final String toString() {
        CharSequence charSequence = this.LJ;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final boolean expandActionView() {
        if (!LJ()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.LJJIII;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.LJIILIIL.LJFF(this);
        }
        return false;
    }

    @Override // X.InterfaceMenuItemC21548819Uw
    public final AbstractC21548519Ut LIZ() {
        return this.LJJII;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.LJIIJ;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.LJIILLIIL;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.LJIJ;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.LJIJI;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.LJI;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.LIZ;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.LJIIIIZZ;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.LJII;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.LIZJ;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.LJIILJJIL;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.LJ;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceMenuItemC21548819Uw
    public final InterfaceMenuItemC21548819Uw LIZIZ(AbstractC21548519Ut abstractC21548519Ut) {
        AbstractC21548519Ut abstractC21548519Ut2 = this.LJJII;
        if (abstractC21548519Ut2 != null) {
            abstractC21548519Ut2.LIZIZ = null;
        }
        this.LJJIFFI = null;
        this.LJJII = abstractC21548519Ut;
        this.LJIILIIL.LJIILL(true);
        AbstractC21548519Ut abstractC21548519Ut3 = this.LJJII;
        if (abstractC21548519Ut3 != null) {
            abstractC21548519Ut3.LJII(new C19V3(this));
        }
        return this;
    }

    public final Drawable LIZLLL(Drawable drawable) {
        if (drawable != null && this.LJIL && (this.LJIJJ || this.LJIJJLI)) {
            drawable = drawable.mutate();
            if (this.LJIJJ) {
                C16GF.LJII(drawable, this.LJIJ);
            }
            if (this.LJIJJLI) {
                C16GF.LJIIIIZZ(drawable, this.LJIJI);
            }
            this.LJIL = false;
        }
        return drawable;
    }

    public final void LJFF(boolean z) {
        this.LJJIIJ = z;
        this.LJIILIIL.LJIILL(false);
    }

    public final void LJI(boolean z) {
        int i;
        int i2 = this.LJJ & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.LJJ = i | i2;
    }

    public final void LJII(boolean z) {
        if (z) {
            this.LJJ |= 32;
        } else {
            this.LJJ &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.LJIILIIL.LIZ;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), i, new LinearLayout(context), false);
        this.LJJIFFI = viewTd;
        this.LJJII = null;
        if (viewTd != null && viewTd.getId() == -1 && (i2 = this.LIZ) > 0) {
            viewTd.setId(i2);
        }
        C19V6 c19v6 = this.LJIILIIL;
        c19v6.LJIIJ = true;
        c19v6.LJIILL(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.LJIIIZ == c) {
            return this;
        }
        this.LJIIIZ = Character.toLowerCase(c);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.LJJ;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.LJJ = i2;
        if (i != i2) {
            this.LJIILIIL.LJIILL(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.LJJ;
        int i3 = 2;
        if ((i2 & 4) != 0) {
            C19V6 c19v6 = this.LJIILIIL;
            c19v6.getClass();
            int i4 = this.LIZIZ;
            int size = c19v6.LJFF.size();
            c19v6.LJJI();
            for (int i5 = 0; i5 < size; i5++) {
                C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(c19v6.LJFF, i5);
                if (c21548219Uq.LIZIZ == i4) {
                    boolean z2 = true;
                    if ((c21548219Uq.LJJ & 4) != 0 && c21548219Uq.isCheckable()) {
                        if (c21548219Uq != this) {
                            z2 = false;
                        }
                        int i6 = c21548219Uq.LJJ;
                        int i7 = i6 & (-3);
                        if (z2) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        c21548219Uq.LJJ = i8;
                        if (i6 != i8) {
                            c21548219Uq.LJIILIIL.LJIILL(false);
                        }
                    }
                }
            }
            c19v6.LJJ();
            return this;
        }
        int i9 = i2 & (-3);
        if (!z) {
            i3 = 0;
        }
        int i10 = i3 | i9;
        this.LJJ = i10;
        if (i2 != i10) {
            this.LJIILIIL.LJIILL(false);
        }
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final InterfaceMenuItemC21548819Uw setContentDescription(CharSequence charSequence) {
        this.LJIILLIIL = charSequence;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.LJJ |= 16;
        } else {
            this.LJJ &= -17;
        }
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.LJIIJJI = null;
        this.LJIIL = i;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.LJIJ = colorStateList;
        this.LJIJJ = true;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.LJIJI = mode;
        this.LJIJJLI = true;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.LJI = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.LJII == c) {
            return this;
        }
        this.LJII = c;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.LJJIII = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.LJIILL = onMenuItemClickListener;
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.LJJI = i;
        C19V6 c19v6 = this.LJIILIIL;
        c19v6.LJIIJ = true;
        c19v6.LJIILL(true);
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.LJ = charSequence;
        this.LJIILIIL.LJIILL(false);
        SubMenuC21548419Us subMenuC21548419Us = this.LJIILJJIL;
        if (subMenuC21548419Us != null) {
            subMenuC21548419Us.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.LJFF = charSequence;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final InterfaceMenuItemC21548819Uw setTooltipText(CharSequence charSequence) {
        this.LJIIZILJ = charSequence;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.LJJ;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.LJJ = i4;
        if (i2 != i4) {
            C19V6 c19v6 = this.LJIILIIL;
            c19v6.LJII = true;
            c19v6.LJIILL(true);
        }
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.LJJIFFI = view;
        this.LJJII = null;
        if (view != null && view.getId() == -1 && (i = this.LIZ) > 0) {
            view.setId(i);
        }
        C19V6 c19v6 = this.LJIILIIL;
        c19v6.LJIIJ = true;
        c19v6.LJIILL(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.LJIIL = 0;
        this.LJIIJJI = drawable;
        this.LJIL = true;
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.LJIILIIL.LIZ.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.LJIIIZ == c && this.LJIIJ == i) {
            return this;
        }
        this.LJIIIZ = Character.toLowerCase(c);
        this.LJIIJ = KeyEvent.normalizeMetaState(i);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.LJII == c && this.LJIIIIZZ == i) {
            return this;
        }
        this.LJII = c;
        this.LJIIIIZZ = KeyEvent.normalizeMetaState(i);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.LJII = c;
        this.LJIIIZ = Character.toLowerCase(c2);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    public static void LIZJ(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // X.InterfaceMenuItemC21548819Uw, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.LJII = c;
        this.LJIIIIZZ = KeyEvent.normalizeMetaState(i);
        this.LJIIIZ = Character.toLowerCase(c2);
        this.LJIIJ = KeyEvent.normalizeMetaState(i2);
        this.LJIILIIL.LJIILL(false);
        return this;
    }

    public C21548219Uq(C19V6 c19v6, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.LJIILIIL = c19v6;
        this.LIZ = i2;
        this.LIZIZ = i;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = charSequence;
        this.LJJI = i5;
    }
}
