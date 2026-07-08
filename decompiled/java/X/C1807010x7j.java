package X;

import Y.ACListenerS161S0100000_27;
import Y.AObserverS32S0500000_27;
import android.content.ComponentCallbacks2;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807010x7j extends AbstractC1805770x5j {
    public final ViewGroup LL;
    public final Drawable LLILLJJLI;
    public final Drawable LLILLL;
    public final Drawable LLILZ;

    public C1807010x7j(ViewGroup viewGroup) {
        super(R.layout.hkp, viewGroup);
        this.LL = viewGroup;
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.er4);
        Drawable drawable = null;
        if (drawableLIZIZ != null) {
            int i = C1807210x83.LIZ;
            int i2 = C1807210x83.LIZ;
            drawableLIZIZ.setBounds(0, 0, i2, i2);
            drawableLIZIZ.setTint(C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
        } else {
            drawableLIZIZ = null;
        }
        this.LLILLJJLI = drawableLIZIZ;
        Drawable drawableLIZIZ2 = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.er5);
        if (drawableLIZIZ2 != null) {
            int i3 = C1807210x83.LIZ;
            int i4 = C1807210x83.LIZ;
            drawableLIZIZ2.setBounds(0, 0, i4, i4);
            drawableLIZIZ2.setTint(C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
        } else {
            drawableLIZIZ2 = null;
        }
        this.LLILLL = drawableLIZIZ2;
        Drawable drawableLIZIZ3 = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.er6);
        if (drawableLIZIZ3 != null) {
            int i5 = C1807210x83.LIZ;
            int i6 = C1807210x83.LIZIZ;
            drawableLIZIZ3.setBounds(0, 0, i6, i6);
            drawableLIZIZ3.setTint(C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
            drawable = drawableLIZIZ3;
        }
        this.LLILZ = drawable;
    }

    @Override // X.AbstractC1805770x5j
    public final void I5(C1806990x7h c1806990x7h) {
        LifecycleOwner lifecycleOwner;
        C1806860x7U c1806860x7UAR2 = c1806990x7h.LLILLL.aR2();
        if (c1806860x7UAR2 == null) {
            return;
        }
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(this.itemView.getContext());
        if (componentCallbacks2LIZ instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ;
        } else {
            lifecycleOwner = null;
        }
        C20744116Fj c20744116Fj = (C20744116Fj) this.itemView.findViewById(R.id.dgz);
        TextView textView = (TextView) this.itemView.findViewById(R.id.dh1);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.dh0);
        c1806860x7UAR2.LJFF();
        if (lifecycleOwner != null) {
            c1806860x7UAR2.LIZJ.observe(lifecycleOwner, new AObserverS32S0500000_27(textView, this, textView2, c20744116Fj, c1806860x7UAR2, 0));
        }
        C786410Ut5.i8(c20744116Fj, new ACListenerS161S0100000_27(c1806860x7UAR2, 138));
    }
}
