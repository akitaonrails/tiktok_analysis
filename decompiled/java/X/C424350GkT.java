package X;

import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424350GkT extends RecyclerView.ViewHolder {
    public final InterfaceC455400HtS LL;
    public final TuxTextView LLILLJJLI;
    public String LLILLL;

    public final void I5(boolean z) {
        Drawable drawableLIZ;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (!z) {
            drawableLIZ = null;
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            drawableLIZ = c384050F3z.LIZ(this.LLILLJJLI.getContext());
        }
        tuxTextView.setBackground(drawableLIZ);
    }

    public C424350GkT(TuxTextView tuxTextView, C455980HuO c455980HuO) {
        super(tuxTextView);
        this.LL = c455980HuO;
        this.LLILLJJLI = tuxTextView;
        C786410Ut5.h9(tuxTextView, new ACListenerS141S0100000_6(this, 151));
    }
}
