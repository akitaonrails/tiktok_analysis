package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FOY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOY extends RecyclerView.ViewHolder {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final C19671011xk LLILZ;
    public final TuxIconView LLILZIL;

    public C0FOY(View view) {
        int iIntValue;
        super(view);
        this.LL = view;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.k1_);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.l1o);
        C19671011xk c19671011xk = (C19671011xk) view.findViewById(R.id.s9d);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, c19671011xk.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        c19671011xk.setBackgroundPaintColor(iIntValue);
        this.LLILZ = c19671011xk;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.tep);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zc, tuxIconView.getContext());
        tuxIconView.setBackgroundColor(numLIZJ2 != null ? numLIZJ2.intValue() : -7829368);
        this.LLILZIL = tuxIconView;
    }
}
