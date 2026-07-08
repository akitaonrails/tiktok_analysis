package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06WG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06WG extends FrameLayout {
    public final TuxTextView LL;

    public C06WG(Context context) {
        super(context, null, 0);
        TuxTextView tuxTextView = (TuxTextView) FrameLayout.inflate(context, R.layout.a1f, this).findViewById(R.id.h0o);
        tuxTextView.LJJJJI(22.0f);
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            marginLayoutParams.leftMargin = iLIZIZ;
            marginLayoutParams.rightMargin = iLIZIZ;
            marginLayoutParams.topMargin = iLIZIZ;
            marginLayoutParams.bottomMargin = iLIZIZ;
            C786410Ut5.W5(tuxTextView, marginLayoutParams);
            this.LL = tuxTextView;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
