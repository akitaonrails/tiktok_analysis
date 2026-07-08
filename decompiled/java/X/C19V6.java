package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.19V6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19V6 implements C19QU {
    public static final int[] LJJI = {1, 4, 5, 3, 2, 0};
    public final Context LIZ;
    public final Resources LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C19VX LJ;
    public final ArrayList<C21548219Uq> LJFF;
    public final ArrayList<C21548219Uq> LJI;
    public boolean LJII;
    public final ArrayList<C21548219Uq> LJIIIIZZ;
    public final ArrayList<C21548219Uq> LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public CharSequence LJIIL;
    public Drawable LJIILIIL;
    public View LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public C21548219Uq LJIJJLI;
    public boolean LJJ;
    public final ArrayList<C21548219Uq> LJIJI = new ArrayList<>();
    public final CopyOnWriteArrayList<WeakReference<C19V7>> LJIJJ = new CopyOnWriteArrayList<>();
    public boolean LJIL = false;

    public String LJIIIZ() {
        return "android:menu:actionviewstates";
    }

    public C19V6 LJIIJ() {
        return this;
    }

    public final void LJJ() {
        this.LJIILL = false;
        if (this.LJIILLIIL) {
            this.LJIILLIIL = false;
            LJIILL(this.LJIIZILJ);
        }
    }

    public final void clearHeader() {
        this.LJIILIIL = null;
        this.LJIIL = null;
        this.LJIILJJIL = null;
        LJIILL(false);
    }

    @Override // android.view.Menu
    public final void close() {
        LIZJ(true);
    }

    public final ArrayList<C21548219Uq> LJIIJJI() {
        if (!this.LJII) {
            return this.LJI;
        }
        this.LJI.clear();
        int size = this.LJFF.size();
        for (int i = 0; i < size; i++) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(this.LJFF, i);
            if (c21548219Uq.isVisible()) {
                this.LJI.add(c21548219Uq);
            }
        }
        this.LJII = false;
        this.LJIIJ = true;
        return this.LJI;
    }

    public final void LJJI() {
        if (this.LJIILL) {
            return;
        }
        this.LJIILL = true;
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C21548219Uq c21548219Uq = this.LJIJJLI;
        if (c21548219Uq != null) {
            LIZLLL(c21548219Uq);
        }
        this.LJFF.clear();
        LJIILL(true);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.LJJ) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C21548219Uq) ListProtector.get(this.LJFF, i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final int size() {
        return this.LJFF.size();
    }

    public final void LJIIIIZZ() {
        ArrayList<C21548219Uq> arrayListLJIIJJI = LJIIJJI();
        if (this.LJIIJ) {
            boolean zLJFF = false;
            for (WeakReference<C19V7> weakReference : this.LJIJJ) {
                C19V7 c19v7 = weakReference.get();
                if (c19v7 == null) {
                    this.LJIJJ.remove(weakReference);
                } else {
                    zLJFF |= c19v7.LJFF();
                }
            }
            if (zLJFF) {
                this.LJIIIIZZ.clear();
                this.LJIIIZ.clear();
                int size = arrayListLJIIJJI.size();
                for (int i = 0; i < size; i++) {
                    C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(arrayListLJIIJJI, i);
                    if ((c21548219Uq.LJJ & 32) == 32) {
                        this.LJIIIIZZ.add(c21548219Uq);
                    } else {
                        this.LJIIIZ.add(c21548219Uq);
                    }
                }
            } else {
                this.LJIIIIZZ.clear();
                this.LJIIIZ.clear();
                this.LJIIIZ.addAll(LJIIJJI());
            }
            this.LJIIJ = false;
        }
    }

    public boolean LJIIL() {
        return this.LJIL;
    }

    public boolean LJIILIIL() {
        return this.LIZJ;
    }

    public boolean LJIILJJIL() {
        return this.LIZLLL;
    }

    public C19V6(Context context) {
        Resources resources;
        int iN3;
        boolean z = false;
        this.LIZ = context;
        Resources resources2 = context.getResources();
        this.LIZIZ = resources2;
        this.LJFF = new ArrayList<>();
        this.LJI = new ArrayList<>();
        this.LJII = true;
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = new ArrayList<>();
        this.LJIIJ = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C19737612Kg.LIZ;
            if (Build.VERSION.SDK_INT < 28 ? !((iN3 = C786410Ut5.n3((resources = context.getResources()), "config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(iN3)) : C1697070uGP.LIZIZ(viewConfiguration)) {
                z = true;
            }
        }
        this.LIZLLL = z;
    }

    public final void LIZJ(boolean z) {
        if (this.LJIJ) {
            return;
        }
        this.LJIJ = true;
        for (WeakReference<C19V7> weakReference : this.LJIJJ) {
            C19V7 c19v7 = weakReference.get();
            if (c19v7 == null) {
                this.LJIJJ.remove(weakReference);
            } else {
                c19v7.LIZ(this, z);
            }
        }
        this.LJIJ = false;
    }

    public boolean LIZLLL(C21548219Uq c21548219Uq) {
        boolean zLIZJ = false;
        if (!this.LJIJJ.isEmpty() && this.LJIJJLI == c21548219Uq) {
            LJJI();
            for (WeakReference<C19V7> weakReference : this.LJIJJ) {
                C19V7 c19v7 = weakReference.get();
                if (c19v7 == null) {
                    this.LJIJJ.remove(weakReference);
                } else {
                    zLIZJ = c19v7.LIZJ(c21548219Uq);
                    if (zLIZJ) {
                        break;
                    }
                }
            }
            LJJ();
            if (zLIZJ) {
                this.LJIJJLI = null;
            }
        }
        return zLIZJ;
    }

    public boolean LJFF(C21548219Uq c21548219Uq) {
        boolean zLJ = false;
        if (this.LJIJJ.isEmpty()) {
            return false;
        }
        LJJI();
        for (WeakReference<C19V7> weakReference : this.LJIJJ) {
            C19V7 c19v7 = weakReference.get();
            if (c19v7 == null) {
                this.LJIJJ.remove(weakReference);
            } else {
                zLJ = c19v7.LJ(c21548219Uq);
                if (zLJ) {
                    break;
                }
            }
        }
        LJJ();
        if (zLJ) {
            this.LJIJJLI = c21548219Uq;
        }
        return zLJ;
    }

    public void LJIILL(boolean z) {
        if (!this.LJIILL) {
            if (z) {
                this.LJII = true;
                this.LJIIJ = true;
            }
            if (!this.LJIJJ.isEmpty()) {
                LJJI();
                for (WeakReference<C19V7> weakReference : this.LJIJJ) {
                    C19V7 c19v7 = weakReference.get();
                    if (c19v7 == null) {
                        this.LJIJJ.remove(weakReference);
                    } else {
                        c19v7.LJII(z);
                    }
                }
                LJJ();
                return;
            }
            return;
        }
        this.LJIILLIIL = true;
        if (z) {
            this.LJIIZILJ = true;
        }
    }

    public final void LJIIZILJ(C19V7 c19v7) {
        for (WeakReference<C19V7> weakReference : this.LJIJJ) {
            C19V7 c19v72 = weakReference.get();
            if (c19v72 == null || c19v72 == c19v7) {
                this.LJIJJ.remove(weakReference);
            }
        }
    }

    public final void LJIJ(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(LJIIIZ());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C19V6) item.getSubMenu()).LJIJ(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (menuItemFindItem = findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
    }

    public final void LJIJI(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.LJIJJ.isEmpty()) {
            for (WeakReference<C19V7> weakReference : this.LJIJJ) {
                C19V7 c19v7 = weakReference.get();
                if (c19v7 == null) {
                    this.LJIJJ.remove(weakReference);
                } else {
                    int id = c19v7.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        c19v7.LJIIIZ(parcelable);
                    }
                }
            }
        }
    }

    public final void LJIJJ(Bundle bundle) {
        int size = size();
        SparseArray<Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C19V6) item.getSubMenu()).LJIJJ(bundle);
            }
        }
        if (sparseArray != null) {
            C786410Ut5.LJJJ(bundle, LJIIIZ(), sparseArray);
        }
    }

    public final void LJIJJLI(Bundle bundle) {
        Parcelable parcelableLIZIZ;
        if (!this.LJIJJ.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            for (WeakReference<C19V7> weakReference : this.LJIJJ) {
                C19V7 c19v7 = weakReference.get();
                if (c19v7 == null) {
                    this.LJIJJ.remove(weakReference);
                } else {
                    int id = c19v7.getId();
                    if (id > 0 && (parcelableLIZIZ = c19v7.LIZIZ()) != null) {
                        sparseArray.put(id, parcelableLIZIZ);
                    }
                }
            }
            C786410Ut5.LJJJ(bundle, "android:menu:presenters", sparseArray);
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return LIZ(0, 0, 0, this.LIZIZ.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.LIZIZ.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(this.LJFF, i2);
            if (c21548219Uq.LIZ == i) {
                return c21548219Uq;
            }
            if (c21548219Uq.hasSubMenu() && (menuItemFindItem = c21548219Uq.LJIILJJIL.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) ListProtector.get(this.LJFF, i);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((C21548219Uq) ListProtector.get(this.LJFF, i3)).LIZIZ == i) {
                if (i3 >= 0) {
                    int size2 = this.LJFF.size() - i3;
                    while (true) {
                        int i4 = i2 + 1;
                        if (i2 >= size2 || ((C21548219Uq) ListProtector.get(this.LJFF, i3)).LIZIZ != i) {
                            break;
                        }
                        if (i3 < this.LJFF.size()) {
                            ListProtector.remove(this.LJFF, i3);
                        }
                        i2 = i4;
                    }
                    LJIILL(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C21548219Uq) ListProtector.get(this.LJFF, i2)).LIZ == i) {
                if (i2 >= 0 && i2 < this.LJFF.size()) {
                    ListProtector.remove(this.LJFF, i2);
                    LJIILL(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.LJIL = z;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.LIZJ = z;
        LJIILL(false);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return LIZ(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void LIZIZ(C19V7 c19v7, Context context) {
        this.LJIJJ.add(new WeakReference<>(c19v7));
        c19v7.LJIIIIZZ(context, this);
        this.LJIIJ = true;
    }

    public boolean LJ(C19V6 c19v6, MenuItem menuItem) {
        C19VX c19vx = this.LJ;
        if (c19vx != null && c19vx.LIZ(c19v6, menuItem)) {
            return true;
        }
        return false;
    }

    public final C21548219Uq LJI(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C21548219Uq> arrayList = this.LJIJI;
        arrayList.clear();
        LJII(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C21548219Uq) ListProtector.get(arrayList, 0);
        }
        boolean zLJIILIIL = LJIILIIL();
        for (int i2 = 0; i2 < size; i2++) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(arrayList, i2);
            if (zLJIILIIL) {
                c = c21548219Uq.LJIIIZ;
            } else {
                c = c21548219Uq.LJII;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zLJIILIIL && c == '\b' && i == 67))) {
                return c21548219Uq;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (LJI(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return LJIILLIIL(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.LJFF.size();
        for (int i2 = 0; i2 < size; i2++) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(this.LJFF, i2);
            if (c21548219Uq.LIZIZ == i) {
                c21548219Uq.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        int size = this.LJFF.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(this.LJFF, i3);
            if (c21548219Uq.LIZIZ == i) {
                int i4 = c21548219Uq.LJJ;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                c21548219Uq.LJJ = i6;
                if (i4 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            LJIILL(true);
        }
    }

    public final void LJII(List<C21548219Uq> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean zLJIILIIL = LJIILIIL();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        int size = this.LJFF.size();
        for (int i3 = 0; i3 < size; i3++) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(this.LJFF, i3);
            if (c21548219Uq.hasSubMenu()) {
                c21548219Uq.LJIILJJIL.LJII(list, i, keyEvent);
            }
            if (zLJIILIIL) {
                c = c21548219Uq.LJIIIZ;
                i2 = c21548219Uq.LJIIJ;
            } else {
                c = c21548219Uq.LJII;
                i2 = c21548219Uq.LJIIIIZZ;
            }
            if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                char[] cArr = keyData.meta;
                if ((c == cArr[0] || c == cArr[2] || (zLJIILIIL && c == '\b' && i == 67)) && c21548219Uq.isEnabled()) {
                    ((ArrayList) list).add(c21548219Uq);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(android.view.MenuItem r9, X.C19V7 r10, int r11) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19V6.LJIILLIIL(android.view.MenuItem, X.19V7, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean zLJIILLIIL;
        C21548219Uq c21548219UqLJI = LJI(i, keyEvent);
        if (c21548219UqLJI != null) {
            zLJIILLIIL = LJIILLIIL(c21548219UqLJI, null, i2);
        } else {
            zLJIILLIIL = false;
        }
        if ((i2 & 2) != 0) {
            LIZJ(true);
        }
        return zLJIILLIIL;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.LJFF.size();
        for (int i2 = 0; i2 < size; i2++) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(this.LJFF, i2);
            if (c21548219Uq.LIZIZ == i) {
                c21548219Uq.LJI(z2);
                c21548219Uq.setCheckable(z);
            }
        }
    }

    public C21548219Uq LIZ(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (LJJI[i5] << 16) | (65535 & i3);
            C21548219Uq c21548219Uq = new C21548219Uq(this, i, i2, i3, i6, charSequence, this.LJIIJJI);
            ArrayList<C21548219Uq> arrayList = this.LJFF;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((C21548219Uq) ListProtector.get(arrayList, size)).LIZLLL <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            ListProtector.add(arrayList, i4, c21548219Uq);
            LJIILL(true);
            return c21548219Uq;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return LIZ(i, i2, i3, this.LIZIZ.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C21548219Uq c21548219UqLIZ = LIZ(i, i2, i3, charSequence);
        SubMenuC21548419Us subMenuC21548419Us = new SubMenuC21548419Us(this.LIZ, this, c21548219UqLIZ);
        c21548219UqLIZ.LJIILJJIL = subMenuC21548419Us;
        subMenuC21548419Us.setHeaderTitle(c21548219UqLIZ.LJ);
        return subMenuC21548419Us;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return LIZ(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.LIZIZ.getString(i4));
    }

    public final void LJIL(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.LIZIZ;
        if (view != null) {
            this.LJIILJJIL = view;
            this.LJIIL = null;
            this.LJIILIIL = null;
        } else {
            if (i > 0) {
                this.LJIIL = resources.getText(i);
            } else if (charSequence != null) {
                this.LJIIL = charSequence;
            }
            if (i2 > 0) {
                this.LJIILIIL = C800330VaR.LIZIZ(this.LIZ, i2);
            } else if (drawable != null) {
                this.LJIILIIL = drawable;
            }
            this.LJIILJJIL = null;
        }
        LJIILL(false);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) throws Throwable {
        ComponentName componentName2;
        Intent[] intentArr2;
        Intent intent2;
        PackageManager packageManager;
        int iIntValue;
        List<ResolveInfo> listQueryIntentActivityOptions;
        int size;
        Intent intent3;
        int i5;
        PackageManager packageManager2 = this.LIZ.getPackageManager();
        C0WZX c0wzx = new C0WZX("dTF6Tg0zW9KSVEcxRh2JdnOJLjqZvf7BF2gsb8EvUtuaPVKKpZ+WIA==", new String[]{"01789"});
        C0WST c0wst = new C0WST();
        Object[] objArr = {componentName, intentArr, intent, 0};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(4167, "android/content/pm/PackageManager", "queryIntentActivityOptions", packageManager2, objArr, "java.util.List", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(4167, "android/content/pm/PackageManager", "queryIntentActivityOptions", null, objArr, packageManager2, c0wzw, false);
            listQueryIntentActivityOptions = (List) c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    packageManager = (PackageManager) obj;
                } else {
                    packageManager = packageManager2;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    componentName2 = (ComponentName) obj2;
                } else {
                    componentName2 = componentName;
                }
                Object obj3 = objArr2[2];
                if (obj3 != null) {
                    intentArr2 = (Intent[]) obj3;
                } else {
                    intentArr2 = intentArr;
                }
                Object obj4 = objArr2[3];
                if (obj4 != null) {
                    intent2 = (Intent) obj4;
                } else {
                    intent2 = intent;
                }
                Object obj5 = objArr2[4];
                if (obj5 != null) {
                    iIntValue = ((Integer) obj5).intValue();
                } else {
                    iIntValue = 0;
                }
            } else {
                componentName2 = componentName;
                intentArr2 = intentArr;
                intent2 = intent;
                packageManager = packageManager2;
                iIntValue = 0;
            }
            listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName2, intentArr2, intent2, iIntValue);
            c0wst.LIZ(4167, "android/content/pm/PackageManager", "queryIntentActivityOptions", listQueryIntentActivityOptions, objArr, packageManager, c0wzw, true);
        }
        if (listQueryIntentActivityOptions != null) {
            size = listQueryIntentActivityOptions.size();
        } else {
            size = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = (ResolveInfo) ListProtector.get(listQueryIntentActivityOptions, i6);
            int i7 = resolveInfo.specificIndex;
            if (i7 < 0) {
                intent3 = intent;
            } else {
                intent3 = intentArr[i7];
            }
            Intent intent4 = new Intent(intent3);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent4.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C21548219Uq c21548219UqLIZ = LIZ(i, i2, i3, resolveInfo.loadLabel(packageManager2));
            c21548219UqLIZ.setIcon(resolveInfo.loadIcon(packageManager2));
            c21548219UqLIZ.LJI = intent4;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c21548219UqLIZ;
            }
        }
        return size;
    }
}
