package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418320Gak extends LinearLayout {
    public final View LL;
    public final TuxTextView LLILLJJLI;

    public C418320Gak(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.ck5, this);
        View viewFindViewById = findViewById(R.id.k9v);
        this.LL = viewFindViewById;
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.k9u);
        float fLIZIZ = C418440Gaw.LIZIZ(12);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, getContext());
        if (numLIZJ != null) {
            viewFindViewById.setBackground(new C389930FQp(fLIZIZ, numLIZJ.intValue()));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void setDuration(String str) {
        this.LLILLJJLI.setText(str);
    }
}
