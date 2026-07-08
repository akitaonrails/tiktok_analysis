package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0T9B, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T9B extends FrameLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;

    public C0T9B(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.qm, this, true);
        this.LL = (TuxTextView) findViewById(R.id.tv_title);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.tv_question);
    }
}
