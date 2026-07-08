package X;

import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KE0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KE0 extends RecyclerView.ViewHolder {
    public final ViewGroup LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public CountDownTimer LLIZ;
    public final TextView LLIZLLLIL;
    public final RadioButton LLJ;
    public final TextView LLJI;
    public boolean LLJIJIL;

    public C0KE0(View view) {
        super(view);
        view.findViewById(R.id.pxp);
        this.LL = (ViewGroup) view.findViewById(R.id.qlk);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.qln);
        this.LLILLL = (TextView) view.findViewById(R.id.rtt);
        this.LLILZ = (TextView) view.findViewById(R.id.ptw);
        view.findViewById(R.id.rt3);
        this.LLILZIL = (TextView) view.findViewById(R.id.qlp);
        this.LLILZLL = (TextView) view.findViewById(R.id.qli);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.fwn);
        this.LLJ = (RadioButton) view.findViewById(R.id.spi);
        this.LLJI = (TextView) view.findViewById(R.id.sai);
    }
}
