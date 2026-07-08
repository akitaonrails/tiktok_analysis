package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDJ extends RecyclerView.ViewHolder {
    public final ConstraintLayout LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final C1841350y17 LLJ;

    public C0KDJ(View view) {
        super(view);
        this.LL = (ConstraintLayout) view.findViewById(R.id.pxp);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.pxs);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.pxu);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.fwn);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.pxv);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.ptw);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.sai);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.qlp);
        C1841350y17 c1841350y17 = (C1841350y17) view.findViewById(R.id.spi);
        c1841350y17.setFocusable(false);
        c1841350y17.setClickable(false);
        this.LLJ = c1841350y17;
    }
}
