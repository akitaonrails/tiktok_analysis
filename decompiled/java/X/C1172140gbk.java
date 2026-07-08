package X;

import X.InterfaceC1172200gbq;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS158S0101000_18;

/* JADX INFO: renamed from: X.0gbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172140gbk<T extends InterfaceC1172200gbq> implements InterfaceC1160270gIb<T> {
    public C1172150gbl LIZ = new C1172150gbl();
    public InterfaceC1172180gbo LIZIZ;
    public C1172210gbr LIZJ;

    @Override // X.InterfaceC1160270gIb
    public final void showLoadMoreError() {
        C1172210gbr c1172210gbr = this.LIZJ;
        if (c1172210gbr != null) {
            if ((!((ArrayList) c1172210gbr.LLILZ).isEmpty()) && ((InterfaceC1172200gbq) C13LP.LJJLIIIJJI(c1172210gbr.LLILZ)).getViewType() == 1) {
                List<InterfaceC1172200gbq> list = c1172210gbr.LLILZ;
                ListProtector.remove(list, ((ArrayList) list).size() - 1);
                c1172210gbr.notifyItemRemoved(((ArrayList) c1172210gbr.LLILZ).size());
            }
            c1172210gbr.LLILZLL = false;
        }
    }

    @Override // X.InterfaceC1160270gIb
    public final void LIZIZ(int i) {
        C1172210gbr c1172210gbr = this.LIZJ;
        if (c1172210gbr != null && i >= 0 && i < ((ArrayList) c1172210gbr.LLILZ).size() && ((InterfaceC1172200gbq) ListProtector.get(c1172210gbr.LLILZ, i)).getViewType() != 3) {
            C0CNO.LIZLLL(0L, new AwS158S0101000_18(i, c1172210gbr, 8));
        }
    }

    @Override // X.InterfaceC1160270gIb
    public final void LIZJ(boolean z) {
        C1172210gbr c1172210gbr = this.LIZJ;
        if (c1172210gbr != null) {
            c1172210gbr.LLIZ = z;
            if (z) {
                ((ArrayList) c1172210gbr.LLILZ).clear();
                ((ArrayList) c1172210gbr.LLILZ).add(c1172210gbr.LLILLL.getValue());
                int i = 0;
                do {
                    ((ArrayList) c1172210gbr.LLILZ).add(new C1153380g7U(0, C13BV.INSTANCE));
                    i++;
                } while (i < 12);
            }
            c1172210gbr.notifyDataSetChanged();
        }
    }

    public final void LJ(ViewGroup viewGroup) {
        if (viewGroup.findViewWithTag("unposted_recycler_view") == null) {
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
            recyclerView.setTag("unposted_recycler_view");
            C786410Ut5.p6(recyclerView, new ViewGroup.LayoutParams(-1, -1));
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), this.LIZ.getSpanCount()));
            C1172210gbr c1172210gbr = new C1172210gbr(this.LIZ, this.LIZIZ);
            this.LIZJ = c1172210gbr;
            recyclerView.setAdapter(c1172210gbr);
            final int itemPadding = this.LIZ.getItemPadding();
            recyclerView.addItemDecoration(new C0DXR(itemPadding) { // from class: X.0DWq
                public final int LL;

                {
                    this.LL = itemPadding;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    GridLayoutManager gridLayoutManager;
                    C21681919tJ c21681919tJ;
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                            int i = gridLayoutManager.LLILLJJLI;
                            if (1 == c21681919tJ.LLILLJJLI) {
                                int i2 = c21681919tJ.LL;
                                int i3 = this.LL;
                                rect.left = (i2 * i3) / i;
                                rect.right = i3 - (((i2 + 1) * i3) / i);
                                rect.top = i3;
                            }
                        }
                    }
                }
            });
            viewGroup.addView(recyclerView);
        }
    }

    @Override // X.InterfaceC1160270gIb
    public final void LIZ(List<? extends T> list, boolean z) {
        C1172210gbr c1172210gbr = this.LIZJ;
        if (c1172210gbr != null) {
            if ((!((ArrayList) c1172210gbr.LLILZ).isEmpty()) && ((InterfaceC1172200gbq) C13LP.LJJLIIIJJI(c1172210gbr.LLILZ)).getViewType() == 1) {
                List<InterfaceC1172200gbq> list2 = c1172210gbr.LLILZ;
                ListProtector.remove(list2, ((ArrayList) list2).size() - 1);
                c1172210gbr.notifyItemRemoved(((ArrayList) c1172210gbr.LLILZ).size());
            }
            int size = ((ArrayList) c1172210gbr.LLILZ).size();
            ((ArrayList) c1172210gbr.LLILZ).addAll(list);
            c1172210gbr.LLILZIL = z;
            c1172210gbr.LLILZLL = false;
            c1172210gbr.notifyItemRangeInserted(size, ((ArrayList) c1172210gbr.LLILZ).size() - size);
        }
    }

    @Override // X.InterfaceC1160270gIb
    public final void LIZLLL(List<? extends T> list, boolean z) {
        C1172210gbr c1172210gbr = this.LIZJ;
        if (c1172210gbr != null) {
            ((ArrayList) c1172210gbr.LLILZ).clear();
            ((ArrayList) c1172210gbr.LLILZ).add(c1172210gbr.LLILLL.getValue());
            ((ArrayList) c1172210gbr.LLILZ).addAll(list);
            c1172210gbr.LLILZIL = z;
            c1172210gbr.LLILZLL = false;
            c1172210gbr.notifyDataSetChanged();
        }
    }
}
