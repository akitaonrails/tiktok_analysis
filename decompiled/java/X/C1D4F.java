package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1D4F, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D4F {
    public final Function0<Unit> LIZ;
    public C1683130ttv LIZIZ;
    public Function0<Unit> LIZJ;
    public Function0<Unit> LIZLLL;
    public Function0<Unit> LJ;
    public Function0<Unit> LJFF;
    public Function0<Unit> LJI;

    public C1D4F(AwS579S0100000_35 awS579S0100000_35) {
        C1683130ttv c1683130ttv = C1683130ttv.LJ;
        this.LIZ = awS579S0100000_35;
        this.LIZIZ = c1683130ttv;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }

    public static void LIZ(Menu menu, C1D4D c1d4d) {
        menu.add(0, c1d4d.getId(), c1d4d.getOrder(), c1d4d.getTitleResource()).setShowAsAction(1);
    }

    public final boolean LIZJ(ActionMode actionMode, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C1D4D.Copy.getId()) {
            Function0<Unit> function0 = this.LIZJ;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == C1D4D.Paste.getId()) {
            Function0<Unit> function02 = this.LIZLLL;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == C1D4D.Cut.getId()) {
            Function0<Unit> function03 = this.LJ;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == C1D4D.SelectAll.getId()) {
            Function0<Unit> function04 = this.LJFF;
            if (function04 != null) {
                function04.invoke();
            }
        } else if (itemId == C1D4D.Autofill.getId()) {
            Function0<Unit> function05 = this.LJI;
            if (function05 != null) {
                function05.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final void LIZLLL(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.LIZJ != null) {
                    LIZ(menu, C1D4D.Copy);
                }
                if (this.LIZLLL != null) {
                    LIZ(menu, C1D4D.Paste);
                }
                if (this.LJ != null) {
                    LIZ(menu, C1D4D.Cut);
                }
                if (this.LJFF != null) {
                    LIZ(menu, C1D4D.SelectAll);
                }
                if (this.LJI != null && Build.VERSION.SDK_INT >= 26) {
                    LIZ(menu, C1D4D.Autofill);
                    return;
                }
                return;
            }
            "onCreateActionMode requires a non-null mode".toString();
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        "onCreateActionMode requires a non-null menu".toString();
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
    }

    public final boolean LJ(ActionMode actionMode, Menu menu) {
        if (actionMode != null && menu != null) {
            LIZIZ(menu, C1D4D.Copy, this.LIZJ);
            LIZIZ(menu, C1D4D.Paste, this.LIZLLL);
            LIZIZ(menu, C1D4D.Cut, this.LJ);
            LIZIZ(menu, C1D4D.SelectAll, this.LJFF);
            LIZIZ(menu, C1D4D.Autofill, this.LJI);
            return true;
        }
        return false;
    }

    public static void LIZIZ(Menu menu, C1D4D c1d4d, Function0 function0) {
        if (function0 != null) {
            if (menu.findItem(c1d4d.getId()) == null) {
                LIZ(menu, c1d4d);
            }
        } else {
            if (menu.findItem(c1d4d.getId()) == null) {
                return;
            }
            menu.removeItem(c1d4d.getId());
        }
    }
}
