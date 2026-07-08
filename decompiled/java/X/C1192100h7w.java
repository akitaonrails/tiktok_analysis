package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192100h7w extends LinearLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;
    public final View LLILZIL;

    public C1192100h7w(Context context) {
        super(context);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e85, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = viewLJLLJ.findViewById(R.id.tmw);
        this.LLILLL = (TuxIconView) viewLJLLJ.findViewById(R.id.tmv);
        this.LLILZ = (TuxTextView) viewLJLLJ.findViewById(R.id.tmy);
        this.LLILZIL = viewLJLLJ.findViewById(R.id.tms);
    }
}
