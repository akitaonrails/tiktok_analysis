package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418390Gar extends LinearLayout {
    public TuxTextView LL;

    public C418390Gar(Context context) {
        super(context, null);
        LinearLayout.inflate(getContext(), R.layout.hdg, this);
        this.LL = (TuxTextView) findViewById(R.id.mtf);
    }

    public final void setText(String str) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }
}
