package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0y1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841510y1N extends RecyclerView.ViewHolder {
    public final TuxIconView LL;
    public final C197039127h LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;
    public final C01GW LLILZIL;

    public C1841510y1N(View view) {
        super(view);
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.g8d);
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.unpin_button);
        this.LLILLJJLI = c197039127h;
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.yf7);
        this.LLILZ = this.itemView.findViewById(R.id.uqb);
        this.LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1412));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = 0;
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c197039127h.LJJJJL(new AwS606S0100000_27(c384050F3z.LIZ(this.itemView.getContext()), 660));
    }

    public final void I5(boolean z) {
        C1841520y1O c1841520y1O;
        int size;
        C384050F3z c384050F3z = new C384050F3z();
        if (getBindingAdapterPosition() == 0 || z) {
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(16));
        }
        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        if (bindingAdapter instanceof C1841520y1O) {
            c1841520y1O = (C1841520y1O) bindingAdapter;
        } else {
            c1841520y1O = null;
        }
        if (c1841520y1O != null) {
            size = c1841520y1O.LL.size();
        } else {
            size = 1;
        }
        if (getBindingAdapterPosition() == size - 1 || z) {
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(16));
        }
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
        Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
        if (z) {
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
            c19659111vp.LIZIZ(2);
            drawableLIZ = C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(this.itemView.getContext()));
        }
        this.itemView.setBackground(drawableLIZ);
    }

    public final void L5(boolean z) {
        int i;
        View view = this.LLILZ;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }
}
