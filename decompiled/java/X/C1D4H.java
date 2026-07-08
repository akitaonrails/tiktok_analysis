package X;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1D4H, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D4H implements InterfaceC1692880u9e {
    public final View LIZ;
    public ActionMode LIZIZ;
    public final C1D4F LIZJ = new C1D4F(new AwS579S0100000_35(this, 12));
    public C0Z7X LIZLLL = C0Z7X.Hidden;

    @Override // X.InterfaceC1692880u9e
    public final void hide() {
        this.LIZLLL = C0Z7X.Hidden;
        ActionMode actionMode = this.LIZIZ;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC1692880u9e
    public final C0Z7X getStatus() {
        return this.LIZLLL;
    }

    public C1D4H(View view) {
        this.LIZ = view;
    }

    @Override // X.InterfaceC1692880u9e
    public final void LIZ(C1683130ttv c1683130ttv, Function0 function0, AwS569S0100000_25 awS569S0100000_25, Function0 function02, AwS569S0100000_25 awS569S0100000_252, AwS569S0100000_25 awS569S0100000_253) {
        C1D4F c1d4f = this.LIZJ;
        c1d4f.LIZIZ = c1683130ttv;
        c1d4f.LIZJ = function0;
        c1d4f.LJ = function02;
        c1d4f.LIZLLL = awS569S0100000_25;
        c1d4f.LJFF = awS569S0100000_252;
        c1d4f.LJI = awS569S0100000_253;
        ActionMode actionMode = this.LIZIZ;
        if (actionMode == null) {
            this.LIZLLL = C0Z7X.Shown;
            View view = this.LIZ;
            final C1D4F c1d4f2 = this.LIZJ;
            this.LIZIZ = view.startActionMode(new ActionMode.Callback2(c1d4f2) { // from class: X.1D4G
                public final C1D4F LL;

                {
                    this.LL = c1d4f2;
                }

                @Override // android.view.ActionMode.Callback
                public final void onDestroyActionMode(ActionMode actionMode2) {
                    Function0<Unit> function03 = this.LL.LIZ;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }

                @Override // android.view.ActionMode.Callback
                public final boolean onActionItemClicked(ActionMode actionMode2, MenuItem menuItem) {
                    return this.LL.LIZJ(actionMode2, menuItem);
                }

                @Override // android.view.ActionMode.Callback
                public final boolean onCreateActionMode(ActionMode actionMode2, Menu menu) {
                    this.LL.LIZLLL(actionMode2, menu);
                    return true;
                }

                @Override // android.view.ActionMode.Callback
                public final boolean onPrepareActionMode(ActionMode actionMode2, Menu menu) {
                    return this.LL.LJ(actionMode2, menu);
                }

                @Override // android.view.ActionMode.Callback2
                public final void onGetContentRect(ActionMode actionMode2, View view2, Rect rect) {
                    C1683130ttv c1683130ttv2 = this.LL.LIZIZ;
                    if (rect != null) {
                        rect.set((int) c1683130ttv2.LIZ, (int) c1683130ttv2.LIZIZ, (int) c1683130ttv2.LIZJ, (int) c1683130ttv2.LIZLLL);
                    }
                }
            }, 1);
            return;
        }
        actionMode.invalidate();
    }
}
