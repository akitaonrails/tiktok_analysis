package X;

import Y.ACListenerS161S0100000_27;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807030x7l extends AbstractC1807100x7s<C1805590x5R> {
    public final InterfaceC1807240x86 LL;
    public final TextView LLILLJJLI;
    public final ImageView LLILLL;
    public final TextView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;

    public final void I5(C1805590x5R c1805590x5R) {
        int i;
        this.LLILLJJLI.setText(c1805590x5R.LIZ);
        TextView textView = this.LLILZ;
        int i2 = 0;
        if (c1805590x5R.LIZIZ != null) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, textView);
        this.LLILZ.setText(c1805590x5R.LIZIZ);
        ImageView imageView = this.LLILLL;
        if (!c1805590x5R.LIZJ) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, imageView);
        C786410Ut5.Q7(this.LLILLL, new ACListenerS161S0100000_27(this, 223));
        C500260Jjc.LJLJLJ(this.LLILZIL, c1805590x5R.LJ);
        C500260Jjc.LJLJLJ(this.LLILZLL, c1805590x5R.LJ);
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 224), this.LLILZIL);
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 225), this.LLILZLL);
    }

    public C1807030x7l(ViewGroup viewGroup, InterfaceC1807160x7y interfaceC1807160x7y) {
        super(R.layout.gw5, viewGroup);
        this.LL = interfaceC1807160x7y;
        TextView textView = (TextView) this.itemView.findViewById(R.id.zii);
        this.LLILLJJLI = textView;
        this.LLILLL = (ImageView) this.itemView.findViewById(R.id.leu);
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.zik);
        this.LLILZIL = this.itemView.findViewById(R.id.zl0);
        this.LLILZLL = this.itemView.findViewById(R.id.lgg);
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0);
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        if (drawableLJIIJ != null) {
            drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
        }
        if (C497740JfY.LJJ()) {
            textView.setCompoundDrawables(null, null, drawableLJIIJ, null);
        } else {
            textView.setCompoundDrawables(drawableLJIIJ, null, null, null);
        }
    }
}
