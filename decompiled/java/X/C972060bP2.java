package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972060bP2 extends RecyclerView.ViewHolder {
    public final InterfaceC972070bP3 LL;
    public final View LLILLJJLI;
    public final C15P4 LLILLL;
    public final LiveIconView LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;

    public C972060bP2(View view, InterfaceC972070bP3 interfaceC972070bP3) {
        super(view);
        this.LL = interfaceC972070bP3;
        this.LLILLJJLI = view.findViewById(R.id.tsc);
        C15P4 c15p4 = (C15P4) view.findViewById(R.id.xng);
        c15p4.LJIILIIL();
        this.LLILLL = c15p4;
        this.LLILZ = (LiveIconView) view.findViewById(R.id.xnh);
        this.LLILZIL = (TextView) view.findViewById(R.id.xni);
        this.LLILZLL = view.findViewById(R.id.xnf);
    }
}
