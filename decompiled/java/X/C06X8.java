package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06X8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06X8 extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;

    public C06X8(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        Object first;
        Object second;
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        if (childAdapterPosition == 0) {
            Integer numValueOf = Integer.valueOf(this.LL);
            if (iLIZIZ == 1) {
                i = this.LL;
            } else {
                i = this.LLILLJJLI;
            }
            pair = new Pair(numValueOf, Integer.valueOf(i));
        } else if (childAdapterPosition == iLIZIZ - 1) {
            pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LL));
        } else {
            pair = new Pair(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILLJJLI));
        }
        if (C426750GoL.LIZLLL(view.getContext())) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (C426750GoL.LIZLLL(view.getContext())) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }
}
