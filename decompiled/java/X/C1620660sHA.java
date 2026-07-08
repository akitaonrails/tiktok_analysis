package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.series.feed.profile.assme.SeriesProfileTabAssem;
import com.ss.android.ugc.aweme.series.feed.profile.model.SeriesProfileTabResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620660sHA extends C0DXR {
    public final int $t;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1620660sHA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ$0(C1620660sHA c1620660sHA, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        SeriesProfileTabResponse seriesProfileTabResponse;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && childAdapterPosition == layoutManager.getItemCount() - 1 && ((seriesProfileTabResponse = ((C1572990r2H) ((SeriesProfileTabAssem) c1620660sHA.l0).ip().getState()).LLILZIL) == null || !Intrinsics.LJFF(seriesProfileTabResponse.hasMore, Boolean.TRUE))) {
            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        } else {
            rect.bottom = 0;
        }
    }

    public static final void LIZIZ$1(C1620660sHA c1620660sHA, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int iLIZIZ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (childAdapterPosition == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((C1578940rBs) c1620660sHA.l0).LLILLJJLI)));
        } else {
            iLIZIZ = 0;
        }
        if (childAdapterPosition == ((C1578940rBs) c1620660sHA.l0).LL.getItemCount() - 1) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((C1578940rBs) c1620660sHA.l0).LLILLJJLI)));
        }
        if (C426750GoL.LJ((C1578940rBs) c1620660sHA.l0)) {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ;
        } else {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ2;
        }
    }
}
