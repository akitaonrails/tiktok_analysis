package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03JE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JE extends RecyclerView.ViewHolder {
    public final C03JF LL;
    public final String LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final LinearLayout LLILZ;
    public final C1841350y17 LLILZIL;
    public final /* synthetic */ C03JC LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03JE(C03JC c03jc, View view, C03JF c03jf) {
        super(view);
        this.LLILZLL = c03jc;
        this.LL = c03jf;
        this.LLILLJJLI = "aggregate_logistic_description_show_tag";
        this.LLILLL = (ConstraintLayout) view.findViewById(R.id.aly);
        this.LLILZ = (LinearLayout) view.findViewById(R.id.al_);
        this.LLILZIL = (C1841350y17) view.findViewById(R.id.al9);
    }
}
