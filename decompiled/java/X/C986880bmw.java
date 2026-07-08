package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;

/* JADX INFO: renamed from: X.0bmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986880bmw extends C0DXR {
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

    public C986880bmw(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LIZIZ$0(C986880bmw c986880bmw, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (C13LP.LJJJLZIJ(childAdapterPosition, ((TemplateFragment) c986880bmw.l0).LLJ.LL) instanceof C953550avB) {
            int iLJ = ((GridLayoutManager) c986880bmw.l1).LLIZ.LJ(childAdapterPosition, 2);
            int iLIZ = C439101nJ.LIZ(8);
            int iLIZ2 = C439101nJ.LIZ(3);
            if (iLJ == 0) {
                rect.left = iLIZ;
                rect.right = iLIZ2;
            } else {
                rect.left = iLIZ2;
                rect.right = iLIZ;
            }
            rect.bottom = C439101nJ.LIZ(6);
        }
    }

    public static final void LIZIZ$1(C986880bmw c986880bmw, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (C13LP.LJJJLZIJ(childAdapterPosition, ((C969930bLb) c986880bmw.l0).LL) instanceof C953550avB) {
            int iLJ = ((GridLayoutManager) c986880bmw.l1).LLIZ.LJ(childAdapterPosition, 2);
            int iLIZ = C439101nJ.LIZ(8);
            int iLIZ2 = C439101nJ.LIZ(3);
            if (iLJ == 0) {
                rect.left = iLIZ;
                rect.right = iLIZ2;
            } else {
                rect.left = iLIZ2;
                rect.right = iLIZ;
            }
            rect.bottom = C439101nJ.LIZ(6);
        }
    }
}
