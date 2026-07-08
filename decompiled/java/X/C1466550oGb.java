package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;

/* JADX INFO: renamed from: X.0oGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466550oGb extends C0DXR {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public C1466550oGb(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LIZIZ$0(C1466550oGb c1466550oGb, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            C1428310nGv.LJFF(rect, ((RecyclerView) c1466550oGb.l0).getContext(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 28);
        } else {
            if (childAdapterPosition != ((DescIdeasModule) c1466550oGb.l1).LJFF().getItemCount() - 1) {
                return;
            }
            C1428310nGv.LJFF(rect, ((RecyclerView) c1466550oGb.l0).getContext(), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 22);
        }
    }

    public static final void LIZIZ$1(C1466550oGb c1466550oGb, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i = C1413230msb.LLJIJIL / 2;
        if (childAdapterPosition == 0) {
            C1428310nGv.LJFF(rect, ((RecyclerView) c1466550oGb.l0).getContext(), 0, i, 20);
        } else if (childAdapterPosition == ((C1413230msb) c1466550oGb.l1).LLJI.size() - 1) {
            C1428310nGv.LJFF(rect, ((RecyclerView) c1466550oGb.l0).getContext(), i, i, 20);
        } else {
            C1428310nGv.LJFF(rect, ((RecyclerView) c1466550oGb.l0).getContext(), i, i, 20);
        }
    }
}
