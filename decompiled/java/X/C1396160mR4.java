package X;

import Y.ACListenerS155S0100000_21;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0mR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396160mR4 extends RecyclerView.ViewHolder {
    public final C2385709Wl LL;
    public AwS635S0100000_21 LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final C422820Gi0 LLILZIL;
    public final C1841350y17 LLILZLL;
    public final C01GW LLIZ;

    public C1396160mR4(C2385709Wl c2385709Wl, View view) {
        super(view);
        this.LL = c2385709Wl;
        this.LLILLL = (TextView) view.findViewById(R.id.p0w);
        this.LLILZ = (TextView) view.findViewById(R.id.fs0);
        view.findViewById(R.id.verify_iv);
        this.LLILZIL = (C422820Gi0) view.findViewById(R.id.biz);
        C1841350y17 c1841350y17 = (C1841350y17) view.findViewById(R.id.dqk);
        this.LLILZLL = c1841350y17;
        this.LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1328));
        view.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.fht));
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 163), view);
        C786410Ut5.e9(c1841350y17, new ACListenerS155S0100000_21(this, 164));
    }
}
