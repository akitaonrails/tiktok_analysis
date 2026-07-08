package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0h5H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190450h5H extends FrameLayout {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final C1189590h3t LLILLL;

    public C1190450h5H(Context context) {
        super(context);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e7r, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (TuxTextView) viewLJLLJ.findViewById(R.id.rb7);
        this.LLILLL = (C1189590h3t) viewLJLLJ.findViewById(R.id.cik);
    }
}
