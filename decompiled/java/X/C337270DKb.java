package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.PcsFormFieldsListCell;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337270DKb extends C09AY implements Function2<C03H5, C291001Au<? extends C337280DKc>, Unit> {
    public final /* synthetic */ PcsFormFieldsListCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337270DKb(PcsFormFieldsListCell pcsFormFieldsListCell) {
        super(2);
        this.LL = pcsFormFieldsListCell;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends C337280DKc> c291001Au) {
        RecyclerView recyclerView;
        C337280DKc c337280DKcLIZ;
        final int i;
        final int bindingAdapterPosition;
        C291001Au<? extends C337280DKc> c291001Au2 = c291001Au;
        ViewParent parent = this.LL.itemView.getParent();
        if ((parent instanceof ViewOnAttachStateChangeListenerC20604515jv) && (recyclerView = (RecyclerView) parent) != null && c291001Au2 != null && (c337280DKcLIZ = c291001Au2.LIZ()) != null && (i = c337280DKcLIZ.LIZ) >= 0 && (bindingAdapterPosition = this.LL.getBindingAdapterPosition()) != -1) {
            recyclerView.clearOnScrollListeners();
            final PcsFormFieldsListCell pcsFormFieldsListCell = this.LL;
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0DKa
                public boolean LL;

                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(final RecyclerView recyclerView2, int i2, int i3) {
                    RecyclerView.LayoutManager layoutManager;
                    if (!this.LL && (layoutManager = recyclerView2.getLayoutManager()) != null && layoutManager.findViewByPosition(bindingAdapterPosition) != null) {
                        this.LL = true;
                        recyclerView2.removeOnScrollListener(this);
                        final PcsFormFieldsListCell pcsFormFieldsListCell2 = pcsFormFieldsListCell;
                        final int i4 = i;
                        HandlerHook.viewPost(recyclerView2, new Runnable() { // from class: X.0DKZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PcsFormFieldsListCell@7810.addScrollListener$2$1$onScrolled$1");
                                try {
                                    final PcsFormFieldsListCell pcsFormFieldsListCell3 = pcsFormFieldsListCell2;
                                    final RecyclerView recyclerView3 = recyclerView2;
                                    final int i5 = i4;
                                    final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = pcsFormFieldsListCell3.LLILLJJLI;
                                    if (viewOnAttachStateChangeListenerC20604515jv != null && i5 >= 0) {
                                        viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(i5);
                                        HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new Runnable() { // from class: X.0DKY
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ2;
                                                View viewFindViewByPosition;
                                                int top;
                                                C1C7U.LIZ("PcsFormFieldsListCell@7810.scrollOuterListToFormField$1");
                                                try {
                                                    RecyclerView.LayoutManager layoutManager2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                                                    if (layoutManager2 != null && (viewFindViewByPosition = layoutManager2.findViewByPosition(i5)) != null && (top = ((pcsFormFieldsListCell3.itemView.getTop() + viewOnAttachStateChangeListenerC20604515jv.getTop()) + viewFindViewByPosition.getTop()) - recyclerView3.getPaddingTop()) != 0) {
                                                        recyclerView3.smoothScrollBy(0, top);
                                                    }
                                                } finally {
                                                    if (!zLIZ2) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("PcsFormFieldsListCell@7810.scrollOuterListToFormField$1");
                                            }
                                        });
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PcsFormFieldsListCell@7810.addScrollListener$2$1$onScrolled$1");
                            }
                        });
                    }
                }
            });
            recyclerView.smoothScrollToPosition(bindingAdapterPosition);
        }
        return Unit.LIZ;
    }
}
