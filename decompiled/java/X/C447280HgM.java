package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447280HgM extends LinearLayout {
    public final C0HZQ LL;

    public final C0HZQ getCheckbox() {
        return this.LL;
    }

    public C447280HgM(Context context) {
        super(context);
        C0HZQ c0hzq = new C0HZQ(context, null, 6);
        this.LL = c0hzq;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) C497740JfY.LIZIZ(4.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setGravity(17);
        setOrientation(0);
        c0hzq.setSize(0);
        addView(c0hzq);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, context));
        tuxTextView.setText(context.getString(2131855593));
        C786410Ut5.h9(tuxTextView, new ACListenerS141S0100000_6(this, 12));
        addView(tuxTextView);
    }
}
