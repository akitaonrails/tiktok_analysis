package X;

import Y.ACListenerS161S0100000_27;
import Y.ACListenerS59S0101000_27;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class DialogC1840040xz0 extends AbstractDialogC423201kk {
    public final InterfaceC1840050xz1 LLJILJIL;
    public final Long LLJILJILJ;
    public final Pair<Long, Long> LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final boolean LLJJIII;
    public C16F5 LLJJIJI;
    public LiveEditText LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C16FS LLJJJ;
    public C16FS LLJJJIL;
    public C16FS LLJJJJ;
    public C16FS LLJJJJJIL;
    public C16FS LLJJJJLIIL;
    public C16FS LLJJL;
    public C16FS LLJJLIIIJLLLLLLLZ;
    public C16FS LLJL;
    public C16FS LLJLIL;
    public C16FS LLJLILLLLZIIL;
    public C16FS LLJLL;
    public C16FS LLJLLIL;
    public final ActionModeCallbackC1857400yR0 LLJLLL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g9e;
    }

    public final void LJLIIL() {
        C16F5 c16f5 = this.LLJJIJIL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131843577, this.LLJILLL.getSecond()));
        }
        C16F5 c16f52 = this.LLJJIJIL;
        if (c16f52 != null) {
            C12ES.LJIILL(0, c16f52);
        }
        C16FS c16fs = this.LLJJJIL;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
    }

    @Override // X.AbstractDialogC423201kk
    public final void LJL() {
        String string;
        this.LLJJIJI = (C16F5) findViewById(R.id.gpg);
        this.LLJIJIL = findViewById(R.id.gcb);
        this.LLJJIJIIJIL = (LiveEditText) findViewById(R.id.gcc);
        this.LLJJJ = (C16FS) findViewById(R.id.gca);
        this.LLJJIJIL = (C16F5) findViewById(R.id.gcd);
        this.LLJJJIL = (C16FS) findViewById(R.id.gce);
        this.LLJJJJ = (C16FS) findViewById(R.id.gc1);
        this.LLJJJJJIL = (C16FS) findViewById(R.id.gc2);
        this.LLJJJJLIIL = (C16FS) findViewById(R.id.gc3);
        this.LLJJL = (C16FS) findViewById(R.id.gc4);
        this.LLJJLIIIJLLLLLLLZ = (C16FS) findViewById(R.id.gc5);
        this.LLJL = (C16FS) findViewById(R.id.gc6);
        this.LLJLIL = (C16FS) findViewById(R.id.gc7);
        this.LLJLILLLLZIIL = (C16FS) findViewById(R.id.gc8);
        this.LLJLL = (C16FS) findViewById(R.id.gc9);
        this.LLJLLIL = (C16FS) findViewById(R.id.gc_);
        LiveEditText liveEditText = this.LLJJIJIIJIL;
        if (liveEditText != null) {
            if (this.LLJJIII) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLJILLL.getFirst().longValue());
                sbLIZ.append(" - ");
                sbLIZ.append(this.LLJILLL.getSecond().longValue());
                liveEditText.setHint(C2188811AlT.LIZIZ(sbLIZ));
            }
            liveEditText.requestFocus();
            liveEditText.setShowSoftInputOnFocus(false);
            liveEditText.setLongClickable(false);
            liveEditText.setClickable(false);
            liveEditText.setTextIsSelectable(false);
            liveEditText.setCustomSelectionActionModeCallback(this.LLJLLL);
            liveEditText.addTextChangedListener(new C1864790ycv(this, 5));
            Long l = this.LLJILJILJ;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            LJLIIIL(string);
        }
        LJLI(this.LLJJJJ, 0);
        LJLI(this.LLJJJJJIL, 1);
        LJLI(this.LLJJJJLIIL, 2);
        LJLI(this.LLJJL, 3);
        LJLI(this.LLJJLIIIJLLLLLLLZ, 4);
        LJLI(this.LLJL, 5);
        LJLI(this.LLJLIL, 6);
        LJLI(this.LLJLILLLLZIIL, 7);
        LJLI(this.LLJLL, 8);
        LJLI(this.LLJLLIL, 9);
        C16FS c16fs = this.LLJJJ;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS161S0100000_27(this, 123));
        }
        C16FS c16fs2 = this.LLJJJIL;
        if (c16fs2 != null) {
            c16fs2.setText(C497740JfY.LJIJI(this.LLJJI));
        }
        C16FS c16fs3 = this.LLJJJIL;
        if (c16fs3 != null) {
            C786410Ut5.h8(c16fs3, new ACListenerS161S0100000_27(this, 124));
        }
        C16F5 c16f5 = this.LLJJIJI;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(this.LLJJ));
        }
    }

    public final void LJLIIIL(String str) {
        LiveEditText liveEditText = this.LLJJIJIIJIL;
        if (liveEditText != null) {
            liveEditText.setText(str);
            liveEditText.setSelection(String.valueOf(C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmr5oXHNxRWdoZQbaplU7nK5yWtaRePtjB97beeAawE2uAfk=", null))).length());
        }
    }

    public final void LJLI(C16FS c16fs, int i) {
        if (c16fs != null) {
            c16fs.setText(String.valueOf(i));
            C786410Ut5.h8(c16fs, new ACListenerS59S0101000_27(this, i, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0yR0] */
    public DialogC1840040xz0(Context context, C935090aRP c935090aRP, Long l, Pair pair) {
        super(context, false);
        this.LLJILJIL = c935090aRP;
        this.LLJILJILJ = l;
        this.LLJILLL = pair;
        this.LLJJ = 2131843370;
        this.LLJJI = 2131843369;
        this.LLJJIII = true;
        this.LLJLLL = new ActionMode.Callback() { // from class: X.0yR0
            @Override // android.view.ActionMode.Callback
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        };
    }
}
