package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19VG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19VG extends C19W7 {
    public final C19V9 LIZ;
    public final Window.Callback LIZIZ;
    public final C21550719Vp LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final ArrayList<InterfaceC21550619Vo> LJI = new ArrayList<>();
    public final ARunnableS133S0100000_33 LJII = new ARunnableS133S0100000_33(this, 2);

    @Override // X.C19W7
    public final void LJII() {
    }

    @Override // X.C19W7
    public final void LJIIL(boolean z) {
    }

    @Override // X.C19W7
    public final void LJIILJJIL() {
        LJIJJ(2, 2);
    }

    @Override // X.C19W7
    public final void LJIILL() {
        LJIJJ(0, 8);
    }

    @Override // X.C19W7
    public final void LJIILLIIL(boolean z) {
    }

    @Override // X.C19W7
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.C19W7
    public final boolean LIZIZ() {
        if (!this.LIZ.LJIILL()) {
            return false;
        }
        this.LIZ.collapseActionView();
        return true;
    }

    @Override // X.C19W7
    public final int LIZLLL() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.C19W7
    public final Context LJ() {
        return this.LIZ.getContext();
    }

    @Override // X.C19W7
    public final void LJFF() {
        this.LIZ.setVisibility(8);
    }

    @Override // X.C19W7
    public final boolean LJI() {
        this.LIZ.LIZ.removeCallbacks(this.LJII);
        this.LIZ.LIZ.postOnAnimation(this.LJII);
        return true;
    }

    @Override // X.C19W7
    public final void LJIIIIZZ() {
        this.LIZ.LIZ.removeCallbacks(this.LJII);
    }

    @Override // X.C19W7
    public final boolean LJIIJJI() {
        return this.LIZ.LIZIZ();
    }

    public final Menu LJIJI() {
        if (!this.LJ) {
            C19V9 c19v9 = this.LIZ;
            InterfaceC21549519Vd interfaceC21549519Vd = new InterfaceC21549519Vd() { // from class: X.19VQ
                public boolean LL;

                @Override // X.InterfaceC21549519Vd
                public final boolean LIZIZ(C19V6 c19v6) {
                    this.LLILLJJLI.LIZIZ.onMenuOpened(108, c19v6);
                    return true;
                }

                @Override // X.InterfaceC21549519Vd
                public final void LIZ(C19V6 c19v6, boolean z) {
                    if (this.LL) {
                        return;
                    }
                    this.LL = true;
                    this.LLILLJJLI.LIZ.LJIIL();
                    this.LLILLJJLI.LIZIZ.onPanelClosed(108, c19v6);
                    this.LL = false;
                }
            };
            C19VX c19vx = new C19VX() { // from class: X.19VP
                @Override // X.C19VX
                public final boolean LIZ(C19V6 c19v6, MenuItem menuItem) {
                    return false;
                }

                @Override // X.C19VX
                public final void LIZIZ(C19V6 c19v6) {
                    if (this.LL.LIZ.LIZJ()) {
                        this.LL.LIZIZ.onPanelClosed(108, c19v6);
                    } else {
                        if (!this.LL.LIZIZ.onPreparePanel(0, null, c19v6)) {
                            return;
                        }
                        this.LL.LIZIZ.onMenuOpened(108, c19v6);
                    }
                }
            };
            C19V8 c19v8 = c19v9.LIZ;
            c19v8.LLLFZ = interfaceC21549519Vd;
            c19v8.LLLI = c19vx;
            C19VD c19vd = c19v8.LL;
            if (c19vd != null) {
                c19vd.LLJJJ = interfaceC21549519Vd;
                c19vd.LLJJJIL = c19vx;
            }
            this.LJ = true;
        }
        return this.LIZ.LIZ.getMenu();
    }

    @Override // X.C19W7
    public final void LIZJ(boolean z) {
        if (z == this.LJFF) {
            return;
        }
        this.LJFF = z;
        int size = this.LJI.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC21550619Vo) ListProtector.get(this.LJI, i)).LIZ();
        }
    }

    @Override // X.C19W7
    public final boolean LJIIJ(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            LJIIJJI();
        }
        return true;
    }

    @Override // X.C19W7
    public final void LJIILIIL(boolean z) {
        LJIJJ(4, 4);
    }

    @Override // X.C19W7
    public final void LJIIZILJ(CharSequence charSequence) {
        this.LIZ.setWindowTitle(charSequence);
    }

    @Override // X.C19W7
    public final boolean LJIIIZ(int i, KeyEvent keyEvent) {
        int deviceId;
        Menu menuLJIJI = LJIJI();
        if (menuLJIJI == null) {
            return false;
        }
        if (keyEvent != null) {
            deviceId = keyEvent.getDeviceId();
        } else {
            deviceId = -1;
        }
        int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
        boolean z = true;
        if (keyboardType == 1) {
            z = false;
        }
        menuLJIJI.setQwertyMode(z);
        return menuLJIJI.performShortcut(i, keyEvent, 0);
    }

    public final void LJIJJ(int i, int i2) {
        C19V9 c19v9 = this.LIZ;
        c19v9.LJII((i & i2) | ((~i2) & c19v9.LIZIZ));
    }

    public C19VG(C19V8 c19v8, CharSequence charSequence, C19W8 c19w8) {
        C21550319Vl c21550319Vl = new C21550319Vl(this);
        c19v8.getClass();
        C19V9 c19v9 = new C19V9(c19v8, false);
        this.LIZ = c19v9;
        c19w8.getClass();
        this.LIZIZ = c19w8;
        c19v9.LJIIJJI = c19w8;
        c19v8.setOnMenuItemClickListener(c21550319Vl);
        c19v9.setWindowTitle(charSequence);
        this.LIZJ = new C21550719Vp(this);
    }
}
