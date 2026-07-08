package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679720QlO extends RecyclerView.ViewHolder {
    public final View LL;
    public final HistoryRecordPageVM LLILLJJLI;
    public final C1A3S LLILLL;
    public final C1322110kVd LLILZ;
    public C09HE LLILZIL;

    public C679720QlO(View view, HistoryRecordPageVM historyRecordPageVM, C1A3S c1a3s) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = historyRecordPageVM;
        this.LLILLL = c1a3s;
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.jph);
        this.LLILZ = c1322110kVd;
        c1322110kVd.setAspectRatio(1.0f);
        c1322110kVd.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
    }
}
