package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS73S0200000_4;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC336530DHf implements View.OnLayoutChangeListener {
    public C336550DHh LL;
    public boolean LLILLL;
    public final SparseIntArray LLILLJJLI = new SparseIntArray();
    public int LLILZ = -1;
    public final int LLILZIL = (int) (((double) Resources.getSystem().getDisplayMetrics().heightPixels) * 0.75d);
    public final int LLILZLL = C341940Daq.LIZ(60.0d);

    public final void LIZ() {
        RecyclerView recyclerView;
        int height;
        View view;
        C336550DHh c336550DHh = this.LL;
        if (c336550DHh == null || (recyclerView = c336550DHh.LIZLLL) == null || (height = recyclerView.getHeight()) == 0) {
            return;
        }
        C336540DHg.LIZ(this.LL, height + 1, new AwS583S0100000_4(this, 331));
        this.LLILLL = true;
        C336550DHh c336550DHh2 = this.LL;
        if (c336550DHh2 == null || (view = c336550DHh2.LIZ) == null) {
            return;
        }
        HandlerHook.viewPostDelay(view, new ARunnableS104S0100000_4(this, 130), 100L);
    }

    public final void LIZJ() {
        View view;
        View view2;
        int i;
        int height;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        C336550DHh c336550DHh = this.LL;
        if (c336550DHh == null || this.LLILLL) {
            return;
        }
        RecyclerView recyclerView = c336550DHh.LIZLLL;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        int iLIZ = 0;
        if ((adapter != null ? adapter.getItemCount() : c336550DHh.LIZIZ) < 2 && (view9 = c336550DHh.LIZ) != null) {
            ViewGroup.LayoutParams layoutParams = view9.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = Math.max(0, C336540DHg.LIZ);
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(view9, layoutParams);
        }
        RecyclerView recyclerView2 = c336550DHh.LIZLLL;
        AbstractC21673619ry adapter2 = recyclerView2.getAdapter();
        int itemCount = adapter2 != null ? adapter2.getItemCount() : c336550DHh.LIZIZ;
        int i2 = C322630Ckn.LIZ[c336550DHh.LJIIIIZZ.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                int i3 = itemCount - 1;
                i = 0;
                for (int i4 = c336550DHh.LIZIZ; i4 < i3; i4++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(i4);
                    if (!Intrinsics.LJFF(viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null, c336550DHh.LIZ)) {
                        if (viewHolderFindViewHolderForAdapterPosition != null && (view3 = viewHolderFindViewHolderForAdapterPosition.itemView) != null && view3.getHeight() != 0) {
                            this.LLILLJJLI.put(i4, (viewHolderFindViewHolderForAdapterPosition == null || (view4 = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? 0 : view4.getHeight());
                        }
                        i += this.LLILLJJLI.get(i4);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("state.targetPosition");
                sbLIZ.append(c336550DHh.LIZIZ);
                sbLIZ.append(" rv.adapter?.itemCount ");
                AbstractC21673619ry adapter3 = recyclerView2.getAdapter();
                sbLIZ.append(adapter3 != null ? Integer.valueOf(adapter3.getItemCount()) : null);
                C2188811AlT.LIZIZ(sbLIZ);
                height = c336550DHh.LIZLLL.getHeight() - this.LLILZLL;
            } else if (i2 == 5) {
                iLIZ = c336550DHh.LJIIIIZZ.LIZJ.invoke(c336550DHh, recyclerView2, Integer.valueOf(this.LLILZLL)).intValue();
            } else if (i2 == 6) {
                iLIZ = c336550DHh.LJFF;
            } else if (i2 == 7) {
                int i5 = itemCount - 1;
                i = 0;
                for (int i6 = c336550DHh.LIZIZ; i6 < i5; i6++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(i6);
                    if (!Intrinsics.LJFF(viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView : null, c336550DHh.LIZ)) {
                        if (viewHolderFindViewHolderForAdapterPosition2 != null && (view5 = viewHolderFindViewHolderForAdapterPosition2.itemView) != null && view5.getHeight() != 0) {
                            this.LLILLJJLI.put(i6, (viewHolderFindViewHolderForAdapterPosition2 == null || (view6 = viewHolderFindViewHolderForAdapterPosition2.itemView) == null) ? 0 : view6.getHeight());
                        }
                        i += this.LLILLJJLI.get(i6);
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("state.targetPosition");
                sbLIZ2.append(c336550DHh.LIZIZ);
                sbLIZ2.append(" rv.adapter?.itemCount ");
                AbstractC21673619ry adapter4 = recyclerView2.getAdapter();
                sbLIZ2.append(adapter4 != null ? Integer.valueOf(adapter4.getItemCount()) : null);
                C2188811AlT.LIZIZ(sbLIZ2);
                height = c336550DHh.LIZLLL.getHeight();
            } else if (i2 == 8) {
                int i7 = itemCount - 1;
                int i8 = 0;
                for (int i9 = c336550DHh.LIZIZ + 1; i9 < i7; i9++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = recyclerView2.findViewHolderForAdapterPosition(i9);
                    if (!Intrinsics.LJFF(viewHolderFindViewHolderForAdapterPosition3 != null ? viewHolderFindViewHolderForAdapterPosition3.itemView : null, c336550DHh.LIZ)) {
                        if (viewHolderFindViewHolderForAdapterPosition3 != null && (view7 = viewHolderFindViewHolderForAdapterPosition3.itemView) != null && view7.getHeight() != 0) {
                            this.LLILLJJLI.put(i9, (viewHolderFindViewHolderForAdapterPosition3 == null || (view8 = viewHolderFindViewHolderForAdapterPosition3.itemView) == null) ? 0 : view8.getHeight());
                        }
                        i8 += this.LLILLJJLI.get(i9);
                    }
                }
                int height2 = !c336550DHh.LJII ? c336550DHh.LIZLLL.getHeight() : c336550DHh.LJI;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("state.targetPosition");
                sbLIZ3.append(c336550DHh.LIZIZ);
                sbLIZ3.append(" rv.adapter?.itemCount ");
                AbstractC21673619ry adapter5 = recyclerView2.getAdapter();
                sbLIZ3.append(adapter5 != null ? Integer.valueOf(adapter5.getItemCount()) : null);
                C2188811AlT.LIZIZ(sbLIZ3);
                iLIZ = height2 - i8;
            }
            iLIZ = height - i;
        } else {
            int i10 = itemCount - 1;
            int i11 = 0;
            for (int i12 = c336550DHh.LIZIZ + 1; i12 < i10; i12++) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition4 = recyclerView2.findViewHolderForAdapterPosition(i12);
                if (!Intrinsics.LJFF(viewHolderFindViewHolderForAdapterPosition4 != null ? viewHolderFindViewHolderForAdapterPosition4.itemView : null, c336550DHh.LIZ)) {
                    if (viewHolderFindViewHolderForAdapterPosition4 != null && (view = viewHolderFindViewHolderForAdapterPosition4.itemView) != null && view.getHeight() != 0) {
                        this.LLILLJJLI.put(i12, (viewHolderFindViewHolderForAdapterPosition4 == null || (view2 = viewHolderFindViewHolderForAdapterPosition4.itemView) == null) ? 0 : view2.getHeight());
                    }
                    i11 += this.LLILLJJLI.get(i12);
                }
            }
            iLIZ = C341940Daq.LIZ(10.0d) + (((!c336550DHh.LJII ? c336550DHh.LIZLLL.getHeight() : c336550DHh.LJI) - this.LLILZLL) - i11);
        }
        if (c336550DHh.LJFF != iLIZ && c336550DHh.LIZIZ != -1) {
            C336540DHg.LIZ(c336550DHh, Math.max(iLIZ, C336540DHg.LIZ), new AwS370S0200000_4(this, c336550DHh, 102));
        }
        if (iLIZ >= 0 || this.LLILZ == iLIZ) {
            return;
        }
        this.LLILZ = iLIZ;
        HandlerHook.viewPost(recyclerView, new ARunnableS73S0200000_4(recyclerView, c336550DHh, 42));
    }

    public final boolean LIZIZ(int i, String str, C321610Cj9 c321610Cj9) {
        boolean z;
        String str2;
        C321610Cj9 c321610Cj92;
        C336550DHh c336550DHh = this.LL;
        if (c336550DHh != null && c336550DHh.LIZIZ == i) {
            z = true;
        } else {
            z = false;
        }
        C336550DHh c336550DHhLIZ = null;
        if (z) {
            if (c336550DHh != null) {
                str2 = c336550DHh.LIZJ;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                C336550DHh c336550DHh2 = this.LL;
                if (c336550DHh2 != null) {
                    c321610Cj92 = c336550DHh2.LJIIIIZZ;
                } else {
                    c321610Cj92 = null;
                }
                if (Intrinsics.LJFF(c321610Cj92, c321610Cj9)) {
                    return false;
                }
            }
        }
        C336550DHh c336550DHh3 = this.LL;
        if (c336550DHh3 != null) {
            c336550DHhLIZ = C336550DHh.LIZ(c336550DHh3, null, i, str, 0, 0, c321610Cj9, 761);
        }
        this.LL = c336550DHhLIZ;
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iMax;
        C336550DHh c336550DHh = this.LL;
        if (c336550DHh != null && (iMax = Math.max(c336550DHh.LIZLLL.getHeight(), c336550DHh.LJI)) > c336550DHh.LJI) {
            this.LL = C336550DHh.LIZ(c336550DHh, null, 0, null, 0, iMax, null, 959);
        }
        LIZJ();
    }
}
