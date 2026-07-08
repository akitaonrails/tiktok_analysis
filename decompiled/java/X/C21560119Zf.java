package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: X.19Zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21560119Zf {
    public final C21560219Zg LIZ;
    public final int LIZIZ;

    public final DialogInterfaceC21560019Ze LIZ() {
        DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze = new DialogInterfaceC21560019Ze(this.LIZ.LIZ, this.LIZIZ);
        final C21560219Zg c21560219Zg = this.LIZ;
        final AlertController alertController = dialogInterfaceC21560019Ze.LLILZLL;
        View view = c21560219Zg.LJ;
        if (view != null) {
            alertController.LJJIIJ = view;
        } else {
            CharSequence charSequence = c21560219Zg.LIZLLL;
            if (charSequence != null) {
                alertController.LJ = charSequence;
                TextView textView = alertController.LJJII;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c21560219Zg.LIZJ;
            if (drawable != null) {
                alertController.LJJI = drawable;
                alertController.LJJ = 0;
                ImageView imageView = alertController.LJJIFFI;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                    alertController.LJJIFFI.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c21560219Zg.LJFF;
        if (charSequence2 != null) {
            alertController.LJFF = charSequence2;
            TextView textView2 = alertController.LJJIII;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c21560219Zg.LJI;
        if (charSequence3 != null) {
            alertController.LIZLLL(-1, charSequence3, c21560219Zg.LJII);
        }
        CharSequence charSequence4 = c21560219Zg.LJIIIIZZ;
        if (charSequence4 != null) {
            alertController.LIZLLL(-2, charSequence4, c21560219Zg.LJIIIZ);
        }
        CharSequence charSequence5 = c21560219Zg.LJIIJ;
        if (charSequence5 != null) {
            alertController.LIZLLL(-3, charSequence5, c21560219Zg.LJIIJJI);
        }
        if (c21560219Zg.LJIILLIIL != null || c21560219Zg.LJIIZILJ != null) {
            C19MK c19mk = (C19MK) C786410Ut5.Sd(alertController.LJJIJIIJI, c21560219Zg.LIZIZ, null);
            final int i = c21560219Zg.LJIJJ ? alertController.LJJIJIIJIL : alertController.LJJIJIL;
            ListAdapter listAdapter = c21560219Zg.LJIIZILJ;
            if (listAdapter == null) {
                final Context context = c21560219Zg.LIZ;
                final CharSequence[] charSequenceArr = c21560219Zg.LJIILLIIL;
                listAdapter = new ArrayAdapter<CharSequence>(context, i, charSequenceArr) { // from class: X.0mEu
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public final long getItemId(int i2) {
                        return i2;
                    }

                    @Override // android.widget.BaseAdapter, android.widget.Adapter
                    public final boolean hasStableIds() {
                        return true;
                    }
                };
            }
            alertController.LJJIIJZLJL = listAdapter;
            alertController.LJJIIZ = c21560219Zg.LJIJJLI;
            if (c21560219Zg.LJIJ != null) {
                AdapterView.OnItemClickListener c1847850yBb = new AdapterView.OnItemClickListener() { // from class: X.19XE
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j) {
                        c21560219Zg.LJIJ.onClick(alertController.LIZIZ, i2);
                        if (!c21560219Zg.LJIJJ) {
                            C19GU c19gu = alertController.LIZIZ;
                            c19gu.dismiss();
                            C785410UrT.LIZ(c19gu);
                        }
                    }
                };
                if (C1848410yCV.LIZ) {
                    c1847850yBb = new C1847850yBb(c1847850yBb);
                }
                c19mk.setOnItemClickListener(c1847850yBb);
            }
            if (c21560219Zg.LJIJJ) {
                c19mk.setChoiceMode(1);
            }
            alertController.LJI = c19mk;
        }
        View view2 = c21560219Zg.LJIJI;
        if (view2 != null) {
            alertController.LJII = view2;
            alertController.LJIIIIZZ = 0;
            alertController.LJIIIZ = false;
        }
        dialogInterfaceC21560019Ze.setCancelable(this.LIZ.LJIIL);
        if (this.LIZ.LJIIL) {
            dialogInterfaceC21560019Ze.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC21560019Ze.setOnCancelListener(this.LIZ.LJIILIIL);
        dialogInterfaceC21560019Ze.setOnDismissListener(this.LIZ.LJIILJJIL);
        DialogInterface.OnKeyListener onKeyListener = this.LIZ.LJIILL;
        if (onKeyListener != null) {
            dialogInterfaceC21560019Ze.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC21560019Ze;
    }

    public C21560119Zf(Context context) {
        this(context, DialogInterfaceC21560019Ze.LJJZ(0, context));
    }

    public C21560119Zf(Context context, int i) {
        this.LIZ = new C21560219Zg(new ContextThemeWrapper(context, DialogInterfaceC21560019Ze.LJJZ(i, context)));
        this.LIZIZ = i;
    }

    public final void LIZIZ(int i, DialogInterface.OnClickListener onClickListener) {
        C21560219Zg c21560219Zg = this.LIZ;
        c21560219Zg.LJIIIIZZ = c21560219Zg.LIZ.getText(i);
        this.LIZ.LJIIIZ = onClickListener;
    }

    public final void LIZJ(int i, DialogInterface.OnClickListener onClickListener) {
        C21560219Zg c21560219Zg = this.LIZ;
        c21560219Zg.LJI = c21560219Zg.LIZ.getText(i);
        this.LIZ.LJII = onClickListener;
    }
}
