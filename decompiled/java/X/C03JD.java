package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03JD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JD extends RecyclerView.ViewHolder {
    public final C03JF LL;
    public final String LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final TuxTextView LLILZ;
    public final LinearLayout LLILZIL;
    public final C1841350y17 LLILZLL;
    public final TuxTextView LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final /* synthetic */ C03JB LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03JD(C03JB c03jb, View view, C03JF c03jf) {
        super(view);
        this.LLJI = c03jb;
        this.LL = c03jf;
        this.LLILLJJLI = "aggregate_logistic_description_show_tag";
        this.LLILLL = (ConstraintLayout) view.findViewById(R.id.alz);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.al7);
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.ala);
        this.LLILZLL = (C1841350y17) view.findViewById(R.id.al5);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.al4);
        this.LLIZLLLIL = view.findViewById(R.id.al1);
        this.LLJ = view.findViewById(R.id.al3);
    }
}
