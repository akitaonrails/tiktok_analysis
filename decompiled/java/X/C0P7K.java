package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0P7K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P7K {
    public static final void LIZ(RecyclerView recyclerView) {
        C0PVB c0pvb;
        AbstractC683590Qrd abstractC683590Qrd;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if ((adapter instanceof C0PVB) && (c0pvb = (C0PVB) adapter) != null) {
            List<View> listLLLI = c0pvb.LLLI();
            if (!listLLLI.isEmpty()) {
                for (int size = ((ArrayList) listLLLI).size() - 1; size < 1; size++) {
                    View view = (View) ListProtector.get(listLLLI, size);
                    c0pvb.LLLIILIL(size);
                    if (view.getParent() != null) {
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(recyclerView, view);
                        recyclerView.removeView(view);
                    }
                }
            }
            AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = c0pvb.LL;
            if ((abstractC21673619ry instanceof C645130PSd) && (abstractC683590Qrd = (AbstractC683590Qrd) abstractC21673619ry) != null) {
                abstractC683590Qrd.clearData();
            }
        }
    }
}
