package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.15HC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15HC extends AbstractC683590Qrd {
    public final WidgetManager LL;
    public final DataCenter LLILLJJLI;
    public final ArrayList<ListItemWidget> LLILLL = new ArrayList<>();

    public abstract ListItemWidget LLLFZ(int i);

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public C15HC(WidgetManager widgetManager, DataCenter dataCenter) {
        this.LL = widgetManager;
        this.LLILLJJLI = dataCenter;
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ListItemWidget listItemWidgetLLLFZ;
        C15H8 c15h8;
        if (viewHolder instanceof C15H8) {
            C15H8 c15h82 = (C15H8) viewHolder;
            ListItemWidget listItemWidget = c15h82.LL;
            if (listItemWidget != null && (c15h8 = listItemWidget.LLIZLLLIL) != null && c15h8.getLayoutPosition() == i) {
                listItemWidget.LLIZLLLIL = null;
            }
            if (i < this.LLILLL.size()) {
                listItemWidgetLLLFZ = (ListItemWidget) ListProtector.get(this.LLILLL, i);
                if (!listItemWidgetLLLFZ.LJIILLIIL(viewHolder)) {
                    listItemWidgetLLLFZ = LLLFZ(i);
                    this.LL.RR(listItemWidgetLLLFZ);
                    ListProtector.set(this.LLILLL, i, listItemWidgetLLLFZ);
                }
            } else {
                listItemWidgetLLLFZ = LLLFZ(i);
                this.LL.RR(listItemWidgetLLLFZ);
                this.LLILLL.add(listItemWidgetLLLFZ);
            }
            c15h82.LL = listItemWidgetLLLFZ;
            listItemWidgetLLLFZ.LJIILL(c15h82);
        }
    }
}
