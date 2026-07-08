package X;

import Y.ACListenerS165S0100000_31;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20495015Ho extends RecyclerView.ViewHolder {
    public C15HQ LL;
    public InterfaceC1908130zkp LLILLJJLI;
    public InterfaceC1888280zEo LLILLL;
    public final LinearLayout LLILZ;
    public final RecyclerView LLILZIL;

    public C20495015Ho(View view) {
        super(view);
        this.LLILZ = (LinearLayout) view.findViewById(R.id.nff);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tus);
        this.LLILZIL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager(1, 0, view.getContext(), false));
            recyclerView.setNestedScrollingEnabled(false);
            final boolean zLIZLLL = C426750GoL.LIZLLL(view.getContext());
            recyclerView.addItemDecoration(new C0DXR(zLIZLLL) { // from class: X.0DWw
                public final boolean LL;

                {
                    this.LL = zLIZLLL;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    super.LIZIZ(rect, view2, recyclerView2, c21673919s1);
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    if (childAdapterPosition < 0) {
                        return;
                    }
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null && childAdapterPosition + 1 == adapter.getItemCount()) {
                        if (this.LL) {
                            rect.left = C341940Daq.LIZ(16.0d);
                            return;
                        } else {
                            rect.right = C341940Daq.LIZ(16.0d);
                            return;
                        }
                    }
                    if (this.LL) {
                        rect.left = C341940Daq.LIZ(8.0d);
                    } else {
                        rect.right = C341940Daq.LIZ(8.0d);
                    }
                }
            });
        }
        new C20635015oq(C426750GoL.LIZLLL(view.getContext()), C14KQ.LJIIIIZZ(view.getContext())).LIZIZ(recyclerView);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title_see_all);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 123));
        }
    }
}
