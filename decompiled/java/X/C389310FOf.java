package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389310FOf extends RecyclerView.ViewHolder {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final C427150Goz LLILZ;
    public final TuxTextView LLILZIL;
    public final View LLILZLL;
    public final C19671011xk LLIZ;
    public final TuxIconView LLIZLLLIL;

    public C389310FOf(View view) {
        int iIntValue;
        super(view);
        this.LL = view;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.k1_);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.l1o);
        this.LLILZ = (C427150Goz) view.findViewById(R.id.cf1);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.cf0);
        this.LLILZLL = view.findViewById(R.id.hjh);
        C19671011xk c19671011xk = (C19671011xk) view.findViewById(R.id.s9d);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, c19671011xk.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        c19671011xk.setBackgroundPaintColor(iIntValue);
        this.LLIZ = c19671011xk;
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.tep);
    }

    public final void I5(int i) {
        ViewGroup.LayoutParams layoutParams;
        if (i <= 0) {
            return;
        }
        View viewFindViewById = this.LL.findViewById(R.id.l1o);
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LL.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }
}
