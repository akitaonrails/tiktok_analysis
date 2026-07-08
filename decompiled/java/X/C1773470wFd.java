package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;

/* JADX INFO: renamed from: X.0wFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773470wFd extends AbstractC1773460wFc<C1772720wEQ> {
    public final View LLJJIJI;
    public C1772720wEQ LLJJIJIIJIL;
    public C1773750wG5 LLJJIJIL;
    public final C1749280vcc LLJJJ;
    public final View LLJJJIL;
    public final View LLJJJJ;
    public final TuxTextView LLJJJJJIL;
    public final C197039127h LLJJJJLIIL;

    @Override // X.AbstractC1773460wFc
    public final void f6() {
        C1772720wEQ c1772720wEQ = this.LLJJIJIIJIL;
        if (c1772720wEQ == null) {
            c1772720wEQ = null;
        }
        if (c1772720wEQ.LJJ != 1) {
            return;
        }
        C786410Ut5.LLLZLZ(this.LLJJJ, 0);
        this.LLJJJ.LJ();
        C1771590wCb.LJIILLIIL = true;
        C1771590wCb.LJIIZILJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC1773460wFc
    public final void h6() {
        C1772720wEQ c1772720wEQ = this.LLJJIJIIJIL;
        if (c1772720wEQ == null) {
            c1772720wEQ = null;
        }
        if (c1772720wEQ.LJJ != 1) {
            return;
        }
        C786410Ut5.LLLZLZ(this.LLJJJ, 8);
        C1771590wCb.LJIILLIIL = false;
        C1771590wCb.LJIIZILJ = 0L;
    }

    @Override // X.AbstractC1773460wFc
    public final void P5(AbstractC1773210wFD abstractC1773210wFD) {
        C1772720wEQ c1772720wEQ = (C1772720wEQ) abstractC1773210wFD;
        this.LLJJIJIIJIL = c1772720wEQ;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindData ECLoadMoreFooterVO = ");
        sbLIZ.append(c1772720wEQ.LJJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("ECLoadMoreFooterViewHolder", strLIZIZ);
        C786410Ut5.LLLZLZ(this.LLJJJ, 8);
        C786410Ut5.LJLLLLLL(8, this.LLJJJIL);
        C786410Ut5.LJLLLLLL(8, this.LLJJJJ);
        C786410Ut5.LLLLZLL(this.LLJJJJJIL, 8);
        int i = c1772720wEQ.LJJ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C786410Ut5.LLLLZLL(this.LLJJJJJIL, 0);
                        this.LLJJJJJIL.setText(this.LLILLJJLI.getResources().getString(2131821575));
                        return;
                    }
                    return;
                }
                C1772690wEN c1772690wEN = c1772720wEQ.LJII.LIZIZ.LIZ;
                if (c1772690wEN != null && c1772690wEN.LIZJ.size() == 1) {
                    C786410Ut5.LJLLLLLL(0, this.LLJJJIL);
                    C786410Ut5.I7(new AjS70S0100000_26(this, 109), this.LLJJJJLIIL);
                    return;
                } else {
                    C786410Ut5.LLLLZLL(this.LLJJJJJIL, 0);
                    this.LLJJJJJIL.setText(this.LLILLJJLI.getResources().getString(2131848087));
                    C786410Ut5.I7(new AjS70S0100000_26(this, 110), this.LLJJJJJIL);
                    return;
                }
            }
            C786410Ut5.LLLZLZ(this.LLJJJ, 0);
            this.LLJJJ.LJ();
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLJJJJ);
    }

    public C1773470wFd(View view, InterfaceC1773310wFN interfaceC1773310wFN) {
        super(view, interfaceC1773310wFN);
        this.LLJJIJI = view;
        this.LLJJJ = (C1749280vcc) view.findViewById(R.id.nnp);
        this.LLJJJIL = view.findViewById(R.id.hc6);
        this.LLJJJJ = view.findViewById(R.id.vfl);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.w24);
        this.LLJJJJLIIL = (C197039127h) view.findViewById(R.id.haz);
    }
}
