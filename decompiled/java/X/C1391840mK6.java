package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mK6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391840mK6 extends AbstractC1391440mJS {
    public final C01GW LIZLLL;
    public final MutableLiveData<Boolean> LJ;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setGravity(17);
        C0HZQ c0hzq = new C0HZQ(linearLayout.getContext(), null, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(4, 0, 4, 0);
        C786410Ut5.N6(c0hzq, layoutParams);
        c0hzq.setSize(0);
        C786410Ut5.D7(c0hzq, new C1401950maP(this, 2));
        linearLayout.addView(c0hzq);
        TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
        C786410Ut5.h9(tuxTextView, new ACListenerS155S0100000_21(this, 143));
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.a1k);
        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-2, -2));
        tuxTextView.setText(tuxTextView.getContext().getString(2131837310));
        linearLayout.addView(tuxTextView);
        return linearLayout;
    }

    public C1391840mK6(Context context) {
        super(context);
        this.LIZLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1239));
        this.LJ = new MutableLiveData<>(Boolean.FALSE);
    }
}
