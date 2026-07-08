package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091830eWD extends LinearLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;

    public C1091830eWD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.LJLLJ(getContext(), R.layout.ecp, this);
        this.LL = (TuxTextView) findViewById(R.id.mry);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.mqw);
    }
}
