package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743660TFc extends LinearLayout {
    public TuxTextView LL;
    public final Context LLILLJJLI;

    public C743660TFc(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = context;
        this.LL = (TuxTextView) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cxe, this, true).findViewById(R.id.ugx);
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            TuxTextView tuxTextView = this.LL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(str);
        }
    }

    public final void setTextColor(int i) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTextColor(i);
    }
}
