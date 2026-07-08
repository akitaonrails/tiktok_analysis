package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0FO1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FO1 extends AbstractC1585810rMx {
    public final RecyclerView LL;
    public final Function0<List<C0FO3>> LLILLL;
    public final Function2<C0FO3, Integer, Unit> LLILZ;
    public final float LLILLJJLI = 0.5f;
    public final HashSet<String> LLILZIL = new HashSet<>();

    public final void LJJIJIIJIL() {
        int childAdapterPosition;
        double d;
        C0FO3 c0fo3;
        RecyclerView recyclerView = this.LL;
        if (recyclerView == null) {
            return;
        }
        List<C0FO3> listInvoke = this.LLILLL.invoke();
        HashSet hashSet = new HashSet();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) != -1) {
                Rect rect = new Rect();
                if (childAt.getLocalVisibleRect(rect)) {
                    double height = childAt.getHeight();
                    double width = childAt.getWidth();
                    double d2 = rect.left;
                    double d3 = rect.top;
                    double d4 = rect.right;
                    double d5 = rect.bottom;
                    if (d2 != 0.0d) {
                        d = (width - d2) / width;
                    } else if (d4 == width) {
                        if (d3 != 0.0d) {
                            d5 = height - d3;
                        } else if (d5 == height) {
                            d = 1.0d;
                        }
                        d = d5 / height;
                    } else {
                        d = d4 / width;
                    }
                    if (d >= this.LLILLJJLI && (c0fo3 = (C0FO3) C13LP.LJJJLZIJ(childAdapterPosition, listInvoke)) != null) {
                        String resourceId = c0fo3.LIZ.getResourceId();
                        if (resourceId.length() != 0) {
                            hashSet.add(resourceId);
                            if (!this.LLILZIL.contains(resourceId)) {
                                this.LLILZ.invoke(c0fo3, Integer.valueOf(childAdapterPosition));
                            }
                        }
                    }
                }
            }
        }
        this.LLILZIL.clear();
        this.LLILZIL.addAll(hashSet);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJIJIIJIL();
        }
    }

    public C0FO1(RecyclerView recyclerView, AwS549S0100000_5 awS549S0100000_5, AwS619S0100000_5 awS619S0100000_5) {
        this.LL = recyclerView;
        this.LLILLL = awS549S0100000_5;
        this.LLILZ = awS619S0100000_5;
        recyclerView.addOnScrollListener(this);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LJJIJIIJIL();
    }
}
