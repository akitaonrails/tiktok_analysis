package Y;

import X.AbstractC21673619ry;
import X.C0LAB;
import X.C13LP;
import X.C1697810uHb;
import X.C1C7U;
import X.C20684815ws;
import X.C559780LxQ;
import X.C562090M2t;
import X.C562110M2v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS14S0100100_8 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS14S0100100_8 aRunnableS14S0100100_8) {
        int iIntValue;
        int size;
        Integer num;
        long j;
        NewCutPlayerActivity newCutPlayerActivity = (NewCutPlayerActivity) aRunnableS14S0100100_8.l0;
        long j2 = aRunnableS14S0100100_8.j1;
        String str = NewCutPlayerActivity._pnsPageId;
        C1C7U.LIZ("NewCutPlayerActivity@18cb.onPlayerProgress$1L");
        RecyclerView recyclerView = (RecyclerView) newCutPlayerActivity.findViewById(R.id.video_list_view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            C559780LxQ c559780LxQ = (C559780LxQ) adapter;
            HashSet hashSet = new HashSet(c559780LxQ.LLILZ);
            c559780LxQ.LLILZ.clear();
            Iterator it2 = ((ArrayList) c559780LxQ.LLILLL).iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    MediaItem mediaItem = (MediaItem) next;
                    if (i2 < ((ArrayList) c559780LxQ.LLILLL).size()) {
                        j = ((MediaItem) ListProtector.get(c559780LxQ.LLILLL, i2)).targetStartTime - mediaItem.targetStartTime;
                    } else {
                        j = mediaItem.duration;
                    }
                    long j3 = mediaItem.targetStartTime;
                    if (j2 < j3) {
                        break;
                    }
                    if (j2 < j3 + j) {
                        c559780LxQ.LLILZ.add(Integer.valueOf(i));
                        break;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            Set setLLIIIZ = C13LP.LLIIIZ(hashSet);
            setLLIIIZ.removeAll(c559780LxQ.LLILZ);
            Set setLLIIIZ2 = C13LP.LLIIIZ(c559780LxQ.LLILZ);
            setLLIIIZ2.removeAll(hashSet);
            setLLIIIZ.addAll(setLLIIIZ2);
            if (!setLLIIIZ.isEmpty()) {
                Integer num2 = (Integer) C13LP.LJJLL(setLLIIIZ);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer num3 = (Integer) C13LP.LJJLIIIJLJLI(setLLIIIZ);
                if (num3 != null) {
                    size = num3.intValue();
                } else {
                    size = ((ArrayList) c559780LxQ.LLILLL).size() - 1;
                }
                c559780LxQ.notifyItemRangeChanged(iIntValue, (size - iIntValue) + 1, 0);
                Set<Integer> set = c559780LxQ.LLILZ;
                if (set != null && (num = (Integer) C13LP.LJJLIIIJLJLI(set)) != null) {
                    int iIntValue2 = num.intValue();
                    if (!recyclerView.isPressed() && recyclerView.getScrollState() != 1 && recyclerView.getScrollState() != 2) {
                        recyclerView.smoothScrollToPosition(Math.min(c559780LxQ.getItemCount(), iIntValue2));
                    }
                }
            }
        }
        C1C7U.LIZIZ("NewCutPlayerActivity@18cb.onPlayerProgress$1L");
    }

    public static final void run$1(ARunnableS14S0100100_8 aRunnableS14S0100100_8) {
        boolean zLIZ;
        C1C7U.LIZ("ReportOncePerformanceHelper@4983.mob$1");
        try {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("type", ((C562110M2v) aRunnableS14S0100100_8.l0).LIZ);
            c0lab.LIZIZ(aRunnableS14S0100100_8.j1, "totaltime");
            C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReportOncePerformanceHelper@4983.mob$1");
    }

    public ARunnableS14S0100100_8(long j, int i) {
        this.$t = i;
        this.l0 = C562090M2t.LIZLLL;
        this.j1 = j;
    }

    public ARunnableS14S0100100_8(NewCutPlayerActivity newCutPlayerActivity, long j, int i) {
        this.$t = i;
        this.l0 = newCutPlayerActivity;
        this.j1 = j;
    }
}
