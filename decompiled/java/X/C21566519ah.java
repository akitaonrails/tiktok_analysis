package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AlertController;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21566519ah extends AbstractDialogInterfaceC1397690mTX<C21566919al> {
    public final DialogInterfaceC21560019Ze LLIZLLLIL;

    @Override // X.AbstractDialogInterfaceC1397690mTX
    public final Dialog LIZJ() {
        return this.LLIZLLLIL;
    }

    public C21566519ah(C21566919al c21566919al) {
        int iIntValue;
        C444910HcX c444910HcX;
        C444910HcX c444910HcX2;
        super(c21566919al);
        Integer numLIZ = C1308910kAL.LIZ(R.attr.yw, c21566919al.LIZ);
        Context context = c21566919al.LIZ;
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        C21560119Zf c21560119Zf = new C21560119Zf(context, iIntValue);
        final C21566819ak c21566819ak = c21566919al.LJIIIIZZ;
        final C21566819ak c21566819ak2 = c21566919al.LJIIIZ;
        final C21566819ak c21566819ak3 = c21566919al.LJIIJ;
        CharSequence charSequence = c21566919al.LIZIZ;
        if (charSequence != null) {
            c444910HcX = new C444910HcX(charSequence);
            c444910HcX.LIZ(this.LL.LIZ);
        } else {
            c444910HcX = null;
        }
        CharSequence charSequence2 = c21566919al.LIZJ;
        if (charSequence2 != null) {
            c444910HcX2 = new C444910HcX(charSequence2);
            c444910HcX2.LIZ(this.LL.LIZIZ);
        } else {
            c444910HcX2 = null;
        }
        C21560219Zg c21560219Zg = c21560119Zf.LIZ;
        c21560219Zg.LIZLLL = c444910HcX;
        c21560219Zg.LJFF = c444910HcX2;
        c21560219Zg.LJIIL = c21566919al.LJII;
        if (c21566819ak != null) {
            C444910HcX c444910HcX3 = new C444910HcX(c21566819ak.LIZ);
            c444910HcX3.LIZ(this.LL.LJ);
            DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf = new DialogInterfaceOnClickListenerC2189551Amf(c21566819ak, this, 2);
            C21560219Zg c21560219Zg2 = c21560119Zf.LIZ;
            c21560219Zg2.LJI = c444910HcX3;
            c21560219Zg2.LJII = dialogInterfaceOnClickListenerC2189551Amf;
        }
        if (c21566819ak2 != null) {
            C444910HcX c444910HcX4 = new C444910HcX(c21566819ak2.LIZ);
            c444910HcX4.LIZ(this.LL.LJ);
            DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf2 = new DialogInterfaceOnClickListenerC2189551Amf(c21566819ak2, this, 3);
            C21560219Zg c21560219Zg3 = c21560119Zf.LIZ;
            c21560219Zg3.LJIIIIZZ = c444910HcX4;
            c21560219Zg3.LJIIIZ = dialogInterfaceOnClickListenerC2189551Amf2;
        }
        if (c21566819ak3 != null) {
            C444910HcX c444910HcX5 = new C444910HcX(c21566819ak3.LIZ);
            c444910HcX5.LIZ(this.LL.LJ);
            DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf3 = new DialogInterfaceOnClickListenerC2189551Amf(c21566819ak3, this, 4);
            C21560219Zg c21560219Zg4 = c21560119Zf.LIZ;
            c21560219Zg4.LJIIJ = c444910HcX5;
            c21560219Zg4.LJIIJJI = dialogInterfaceOnClickListenerC2189551Amf3;
        }
        DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
        this.LLIZLLLIL = dialogInterfaceC21560019ZeLIZ;
        if (numLIZ == null || numLIZ.intValue() != 0) {
            TypedArray typedArrayObtainStyledAttributes = c21566919al.LIZ.obtainStyledAttributes(null, R$styleable.TuxSystemDialog, R.attr.yw, 0);
            int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSystemDialog__tux_systemDialogWindowBackground, -1);
            Window window = dialogInterfaceC21560019ZeLIZ.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(color));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        LIZ();
        dialogInterfaceC21560019ZeLIZ.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.19aj
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.LL.LJFF(-1, c21566819ak);
                this.LL.LJFF(-2, c21566819ak2);
                this.LL.LJFF(-3, c21566819ak3);
                C21566519ah c21566519ah = this.LL;
                DialogInterface.OnShowListener onShowListener = c21566519ah.LLILZLL;
                if (onShowListener != null) {
                    onShowListener.onShow(c21566519ah);
                }
            }
        });
    }

    public final void LJFF(final int i, final C21566819ak c21566819ak) {
        Button button;
        final DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze = this.LLIZLLLIL;
        AlertController alertController = dialogInterfaceC21560019Ze.LLILZLL;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    alertController.getClass();
                    return;
                }
                button = alertController.LJIIJ;
            } else {
                button = alertController.LJIILJJIL;
            }
        } else {
            button = alertController.LJIJ;
        }
        if (button == null || c21566819ak == null) {
            return;
        }
        C786410Ut5.L7(button, new View.OnClickListener() { // from class: X.19ai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!c21566819ak.LIZIZ) {
                    DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze2 = dialogInterfaceC21560019Ze;
                    dialogInterfaceC21560019Ze2.dismiss();
                    C785410UrT.LIZ(dialogInterfaceC21560019Ze2);
                }
                DialogInterface.OnClickListener onClickListener = c21566819ak.LIZJ;
                if (onClickListener != null) {
                    onClickListener.onClick(this, i);
                }
            }
        });
    }
}
