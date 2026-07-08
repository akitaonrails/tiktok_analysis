package X;

import Y.AObjectS250S0100000_33;
import Y.AsS58S0100000_33;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: renamed from: X.1A3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3Q extends RecyclerView.ViewHolder {
    public final View LL;
    public C1A3S LLILLJJLI;
    public final HistoryRecordPageVM LLILLL;
    public final RecyclerView LLILZ;
    public final C1749280vcc LLILZIL;
    public final C16G0 LLILZLL;
    public boolean LLIZ;
    public final AObjectS250S0100000_33 LLIZLLLIL;

    public final void I5() {
        this.LLILZIL.LJ();
        this.LLILLL.zQ2(this.LL.getContext(), this.LLILLJJLI, new C1A3P(0, 0, 6, 0), false, new AwS647S0100000_33(this, 62));
    }

    public C1A3Q(View view, C1A3S c1a3s, HistoryRecordPageVM historyRecordPageVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c1a3s;
        this.LLILLL = historyRecordPageVM;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fey);
        this.LLILZ = recyclerView;
        this.LLILZIL = (C1749280vcc) view.findViewById(R.id.jq0);
        this.LLILZLL = (C16G0) view.findViewById(R.id.jpc);
        this.LLIZ = true;
        this.LLIZLLLIL = new AObjectS250S0100000_33(this, 14);
        recyclerView.setAdapter(new C679750QlR(this.LLILLJJLI, historyRecordPageVM));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        I5();
        recyclerView.addOnScrollListener(new AsS58S0100000_33(this, 8));
    }
}
