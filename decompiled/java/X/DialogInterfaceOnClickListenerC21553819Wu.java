package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: X.19Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class DialogInterfaceOnClickListenerC21553819Wu implements InterfaceC21554019Ww, DialogInterface.OnClickListener {
    public DialogInterfaceC21560019Ze LL;
    public ListAdapter LLILLJJLI;
    public CharSequence LLILLL;
    public final /* synthetic */ C21553719Wt LLILZ;

    @Override // X.InterfaceC21554019Ww
    public final Drawable LJFF() {
        return null;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJII(Drawable drawable) {
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.InterfaceC21554019Ww
    public final int LJIIIZ() {
        return 0;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJIIJJI(int i) {
    }

    @Override // X.InterfaceC21554019Ww
    public final int LJIIL() {
        return 0;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJIILIIL(int i) {
    }

    @Override // X.InterfaceC21554019Ww
    public final void dismiss() {
        DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze = this.LL;
        if (dialogInterfaceC21560019Ze != null) {
            dialogInterfaceC21560019Ze.dismiss();
            C785410UrT.LIZ(dialogInterfaceC21560019Ze);
            this.LL = null;
        }
    }

    @Override // X.InterfaceC21554019Ww
    public final boolean isShowing() {
        DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze = this.LL;
        if (dialogInterfaceC21560019Ze != null) {
            return dialogInterfaceC21560019Ze.isShowing();
        }
        return false;
    }

    @Override // X.InterfaceC21554019Ww
    public final CharSequence getHintText() {
        return this.LLILLL;
    }

    public DialogInterfaceOnClickListenerC21553819Wu(C21553719Wt c21553719Wt) {
        this.LLILZ = c21553719Wt;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJIIJ(CharSequence charSequence) {
        this.LLILLL = charSequence;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJIILJJIL(ListAdapter listAdapter) {
        this.LLILLJJLI = listAdapter;
    }

    @Override // X.InterfaceC21554019Ww
    public final void LJI(int i, int i2) {
        if (this.LLILLJJLI == null) {
            return;
        }
        C21560119Zf c21560119Zf = new C21560119Zf(this.LLILZ.getPopupContext());
        CharSequence charSequence = this.LLILLL;
        if (charSequence != null) {
            c21560119Zf.LIZ.LIZLLL = charSequence;
        }
        ListAdapter listAdapter = this.LLILLJJLI;
        int selectedItemPosition = this.LLILZ.getSelectedItemPosition();
        C21560219Zg c21560219Zg = c21560119Zf.LIZ;
        c21560219Zg.LJIIZILJ = listAdapter;
        c21560219Zg.LJIJ = this;
        c21560219Zg.LJIJJLI = selectedItemPosition;
        c21560219Zg.LJIJJ = true;
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
        this.LL = dialogInterfaceC21560019ZeLIZ;
        C19MK c19mk = dialogInterfaceC21560019ZeLIZ.LLILZLL.LJI;
        c19mk.setTextDirection(i);
        c19mk.setTextAlignment(i2);
        C786410Ut5.D4(this.LL);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.LLILZ.setSelection(i);
        if (this.LLILZ.getOnItemClickListener() != null) {
            this.LLILZ.performItemClick(null, i, this.LLILLJJLI.getItemId(i));
        }
        dismiss();
    }
}
