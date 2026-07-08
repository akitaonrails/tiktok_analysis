package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.037x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7931037x extends LinearLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;

    public C7931037x(Context context) {
        super(context, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b18, this, true);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.us_combined_label_content);
        this.LLILLJJLI = (TuxIconView) viewTd.findViewById(R.id.us_combined_label_icon);
    }
}
