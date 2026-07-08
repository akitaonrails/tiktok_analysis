package X;

import Y.ACListenerS165S0100000_31;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15H5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15H5 extends C15H8 {
    public final RecyclerView LLILLJJLI;
    public C15H4 LLILLL;
    public C15H3 LLILZ;
    public C15H6 LLILZIL;
    public final boolean LLILZLL;

    public C15H5(View view, boolean z) {
        super(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title_right);
        TextView textView = (TextView) view.findViewById(R.id.tv_title_left);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tus);
        this.LLILLJJLI = recyclerView;
        textView.setText(view.getContext().getText(2131837785));
        final int iLIZJ = (int) C12ES.LIZJ(16.0f, view.getContext());
        if (C1911780zqi.LIZJ(z)) {
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.0DWY
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int itemCount;
                    super.LIZIZ(rect, view2, recyclerView2, c21673919s1);
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    if (childAdapterPosition < 0) {
                        return;
                    }
                    if (childAdapterPosition % 2 == 0) {
                        rect.right = C341940Daq.LIZ(8.0d);
                    }
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (itemCount % 2 == 0) {
                        AbstractC21673619ry adapter2 = recyclerView2.getAdapter();
                        if (adapter2 != null && childAdapterPosition + 1 == adapter2.getItemCount()) {
                            return;
                        }
                        AbstractC21673619ry adapter3 = recyclerView2.getAdapter();
                        if (adapter3 != null && childAdapterPosition + 2 == adapter3.getItemCount()) {
                            return;
                        }
                        rect.bottom = C341940Daq.LIZ(8.0d);
                        return;
                    }
                    AbstractC21673619ry adapter4 = recyclerView2.getAdapter();
                    if (adapter4 != null && childAdapterPosition + 1 == adapter4.getItemCount()) {
                        return;
                    }
                    rect.bottom = C341940Daq.LIZ(8.0d);
                }
            });
        } else {
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.15H7
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    rect.bottom = iLIZJ;
                }
            });
        }
        recyclerView.setNestedScrollingEnabled(false);
        C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 126));
        recyclerView.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
        tuxTextView.setTuxFont(62);
        this.LLILZLL = z;
    }
}
