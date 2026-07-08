package X;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679730QlP extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final RecyclerView LLILLL;

    public final void I5(C09HF c09hf) {
        C679740QlQ c679740QlQ;
        String imageUrl;
        String imageUrl2;
        String imageUrl3;
        this.LLILLJJLI.setText(c09hf.getDayDescription());
        AbstractC21673619ry adapter = this.LLILLL.getAdapter();
        if ((adapter instanceof C679740QlQ) && (c679740QlQ = (C679740QlQ) adapter) != null) {
            ArrayList<C09HE> historyRecords = c09hf.getHistoryRecords();
            ArrayList<C09HE> arrayList = c679740QlQ.LLILLL;
            c679740QlQ.LLILLL = historyRecords;
            int i = 0;
            if (arrayList != null && !arrayList.isEmpty() && !historyRecords.isEmpty()) {
                Iterator<C09HE> it2 = historyRecords.iterator();
                int i2 = 0;
                int i3 = 0;
                while (it2.hasNext()) {
                    int i4 = i3 + 1;
                    String imageUrl4 = it2.next().getImageUrl();
                    C09HE c09he = (C09HE) C13LP.LJJJLL(arrayList);
                    if (c09he != null) {
                        imageUrl3 = c09he.getImageUrl();
                    } else {
                        imageUrl3 = null;
                    }
                    if (Intrinsics.LJFF(imageUrl4, imageUrl3)) {
                        i2 = i3;
                    }
                    i3 = i4;
                }
                if (i2 != 0) {
                    c679740QlQ.notifyItemRangeInserted(0, i2 + 1);
                }
                while (i < arrayList.size() && i2 < historyRecords.size()) {
                    C09HE c09he2 = (C09HE) C13LP.LJJJLZIJ(i, arrayList);
                    if (c09he2 != null) {
                        imageUrl = c09he2.getImageUrl();
                    } else {
                        imageUrl = null;
                    }
                    C09HE c09he3 = (C09HE) C13LP.LJJJLZIJ(i2, historyRecords);
                    if (c09he3 != null) {
                        imageUrl2 = c09he3.getImageUrl();
                    } else {
                        imageUrl2 = null;
                    }
                    if (Intrinsics.LJFF(imageUrl, imageUrl2)) {
                        i++;
                        i2++;
                    } else {
                        c679740QlQ.notifyItemRemoved(i2);
                        i++;
                    }
                }
                if (i2 < historyRecords.size() - 1) {
                    c679740QlQ.notifyItemRangeInserted(i2, historyRecords.size() - i2);
                    return;
                }
                return;
            }
            c679740QlQ.notifyDataSetChanged();
        }
    }

    public C679730QlP(View view, HistoryRecordPageVM historyRecordPageVM, C1A3S c1a3s) {
        int iLIZIZ;
        super(view);
        this.LL = view;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.fg4);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.jpx);
        this.LLILLL = recyclerView;
        recyclerView.setAdapter(new C679740QlQ(c1a3s, historyRecordPageVM));
        recyclerView.setLayoutManager(new WrapGridLayoutManager(4, 1, view.getContext(), false));
        try {
            iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 1, Resources.getSystem().getDisplayMetrics()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = 0;
        }
        recyclerView.addItemDecoration(new C345780Dh2(4, iLIZIZ, false));
    }
}
