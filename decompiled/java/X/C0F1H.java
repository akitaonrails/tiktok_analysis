package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0F1H, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F1H extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final C20627315nb LLILLJJLI;
    public C378700Et2 LLILLL;

    public C0F1H(View view) {
        super(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ha6);
        this.LL = tuxTextView;
        C20627315nb c20627315nb = (C20627315nb) view.findViewById(R.id.hac);
        this.LLILLJJLI = c20627315nb;
        if (tuxTextView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            tuxTextView.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (c20627315nb != null) {
                c20627315nb.setPlaceholderColor(iIntValue);
            } else {
                return;
            }
        } else if (c20627315nb == null) {
            return;
        }
        c20627315nb.setRadius(C418440Gaw.LIZIZ(14));
    }
}
