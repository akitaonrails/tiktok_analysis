package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351160lGU extends FrameLayout {
    public final TuxTextView LL;
    public AnimatorSet LLILLJJLI;
    public AnimatorSet LLILLL;

    public C1351160lGU(Context context) {
        super(context, null, 0);
        TuxTextView tuxTextView = (TuxTextView) FrameLayout.inflate(context, R.layout.a4c, this).findViewById(R.id.h0o);
        tuxTextView.LJJJJI(32.0f);
        C06WN.LIZ(tuxTextView, 5);
        this.LL = tuxTextView;
    }
}
