package X;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: X.19al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21566919al extends AbstractC1397700mTY<C21566919al, C21566519ah> {
    public C21566819ak LJIIIIZZ;
    public C21566819ak LJIIIZ;
    public C21566819ak LJIIJ;

    public C21566919al(Context context) {
        super(context);
    }

    public final void LJII(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LJIIIIZZ(onClickListener, this.LIZ.getText(i), z);
    }

    public final void LJIIIIZZ(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJIIIZ = new C21566819ak(onClickListener, charSequence, z);
    }

    public final void LJIIJ(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        LJIIJJI(onClickListener, this.LIZ.getText(i), z);
    }

    public final void LJIIJJI(DialogInterface.OnClickListener onClickListener, CharSequence charSequence, boolean z) {
        this.LJIIIIZZ = new C21566819ak(onClickListener, charSequence, z);
    }
}
