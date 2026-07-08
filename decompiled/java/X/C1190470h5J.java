package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190470h5J extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final TuxTextView LLILZ;

    public C1190470h5J(Context context) {
        super(context);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e7k, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = viewLJLLJ.findViewById(R.id.rax);
        this.LLILZ = (TuxTextView) viewLJLLJ.findViewById(R.id.raw);
        this.LLILLL = viewLJLLJ.findViewById(R.id.ray);
    }
}
