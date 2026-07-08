package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

/* JADX INFO: renamed from: X.19GO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19GO extends C21458718yP<C19GO> {
    public CharSequence LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public CharSequence LJI;
    public String LJII;
    public CharSequence LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public float LJIILIIL;
    public C19GP LJIILJJIL;
    public DialogInterface.OnClickListener LJIILL;
    public DialogInterface.OnClickListener LJIILLIIL;
    public DialogInterface.OnDismissListener LJIIZILJ;
    public DialogInterface.OnShowListener LJIJ;
    public View.OnClickListener LJIJI;
    public View LJIJJ;
    public View LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public final int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public int LJJIIZ;
    public boolean LJJIIZI;
    public DialogInterface.OnKeyListener LJJIJ;
    public DialogInterface.OnCancelListener LJJIJIIJI;
    public boolean LJJIJIIJIL;

    public final C19GN LIZ() {
        C19GN c19gn = new C19GN(this.LIZ, this);
        c19gn.LLJZIJLIL = this.LJIIIZ;
        c19gn.LLLJIL = this.LJIIJJI;
        c19gn.LLLJL = this.LJIIL;
        c19gn.LLLL = this.LJIILIIL;
        c19gn.LLLLII = this.LJIILJJIL;
        c19gn.LLJLIL = this.LIZLLL;
        c19gn.LLJLLL = this.LJII;
        c19gn.LLJLILLLLZIIL = this.LJ;
        c19gn.LLJLLIL = this.LJI;
        c19gn.LLJLL = this.LJFF;
        c19gn.LLJZ = null;
        c19gn.LLLF = this.LJIILL;
        c19gn.LLLFF = this.LJIILLIIL;
        c19gn.LLLI = this.LJJ;
        c19gn.LLLFZ = this.LJIL;
        c19gn.LLLIIIIL = this.LJJIFFI;
        c19gn.LLLII = this.LJJI;
        c19gn.LLLFFI = this.LJIJI;
        c19gn.LLJJ = this.LJIIIIZZ;
        c19gn.LLLIIIL = this.LJIIZILJ;
        c19gn.LLL = this.LJIIJ;
        c19gn.LLLIIL = this.LJIJ;
        c19gn.LLLIILIL = this.LJJII;
        c19gn.LLLIL = this.LJJIII;
        c19gn.LLLILZ = this.LJJIIJ;
        c19gn.LLLLIIIILLL = this.LJJIJIIJIL;
        c19gn.LLLILZJ = this.LJIJJ;
        c19gn.LLJJIJIL = this.LJIJJLI;
        c19gn.LLLIIII = this.LJJIIJZLJL;
        c19gn.LLLIZZ = this.LJJIIZ;
        c19gn.LLLJ = this.LJJIIZI;
        c19gn.setOnKeyListener(this.LJJIJ);
        c19gn.setOnCancelListener(this.LJJIJIIJI);
        return c19gn;
    }

    public C19GO(Context context) {
        super(context);
        this.LJJIFFI = 17;
        this.LJJIIJ = true;
        this.LJJIIJZLJL = true;
        this.LJJIIZ = -1;
        this.LJJIJIIJIL = true;
    }

    public final void LIZIZ(int i) {
        this.LJII = this.LIZ.getString(i);
    }

    public final void LJI(int i) {
        this.LIZLLL = this.LIZ.getString(i);
    }

    public final void LIZJ(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LIZLLL(onClickListener, this.LIZ.getString(i), z);
    }

    public final void LIZLLL(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJI = charSequence;
        this.LJIILLIIL = onClickListener;
        this.LJJ = z;
    }

    public final void LJ(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LJFF(onClickListener, this.LIZ.getString(i), z);
    }

    public final void LJFF(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJFF = charSequence;
        this.LJIILL = onClickListener;
        this.LJIL = z;
    }
}
