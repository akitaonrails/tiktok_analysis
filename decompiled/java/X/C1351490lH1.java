package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS160S0101000_21;

/* JADX INFO: renamed from: X.0lH1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351490lH1 extends C0DXR {
    public int LL;
    public Function0<Integer> LLILLJJLI;
    public boolean LLILLL;

    public final void LJ(Integer num) {
        if (num == null) {
            this.LL--;
        } else {
            this.LL = num.intValue();
        }
    }

    public C1351490lH1(int i, boolean z, AwS160S0101000_21 awS160S0101000_21) {
        this.LL = i;
        this.LLILLJJLI = awS160S0101000_21;
        this.LLILLL = z;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int viewLayoutPosition;
        int i;
        AbstractC21673619ry adapter;
        int i2;
        AbstractC21673619ry adapter2;
        RecyclerView.LayoutParams layoutParams;
        RecyclerView.LayoutParams layoutParams2;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (this.LLILLL) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if ((layoutParams3 instanceof RecyclerView.LayoutParams) && (layoutParams2 = (RecyclerView.LayoutParams) layoutParams3) != null && layoutParams2.getViewLayoutPosition() >= 7) {
                if (C444960Hcc.LIZIZ()) {
                    rect.left = 0;
                    return;
                } else {
                    rect.right = 0;
                    return;
                }
            }
            int iIntValue = this.LLILLJJLI.invoke().intValue();
            if (C444960Hcc.LIZIZ()) {
                rect.left = Math.max(iIntValue, C0HD5.LIZ(view, Double.valueOf(6.0d)));
                return;
            } else {
                rect.right = Math.max(iIntValue, C0HD5.LIZ(view, Double.valueOf(6.0d)));
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if ((layoutParams4 instanceof RecyclerView.LayoutParams) && (layoutParams = (RecyclerView.LayoutParams) layoutParams4) != null) {
            viewLayoutPosition = layoutParams.getViewLayoutPosition();
        } else {
            viewLayoutPosition = 0;
        }
        int i3 = viewLayoutPosition % this.LL;
        int iIntValue2 = this.LLILLJJLI.invoke().intValue();
        int iLIZ = C0HD5.LIZ(view, Double.valueOf(20.0d));
        if (C444960Hcc.LIZIZ()) {
            rect.right = (i3 * iIntValue2) / this.LL;
            if (viewLayoutPosition == 0 && (adapter2 = recyclerView.getAdapter()) != null && adapter2.getItemViewType(0) == 2) {
                i2 = iLIZ - (iIntValue2 / this.LL);
            } else {
                i2 = iIntValue2 - (((i3 + 1) * iIntValue2) / this.LL);
            }
            rect.left = i2;
            return;
        }
        rect.left = (i3 * iIntValue2) / this.LL;
        if (viewLayoutPosition == 0 && (adapter = recyclerView.getAdapter()) != null && adapter.getItemViewType(0) == 2) {
            i = iLIZ - (iIntValue2 / this.LL);
        } else {
            i = iIntValue2 - (((i3 + 1) * iIntValue2) / this.LL);
        }
        rect.right = i;
    }
}
