package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20398914rr extends C09AY implements Function0<RecyclerView> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20398914rr(View view) {
        super(0);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        View viewFindViewById = this.LL.findViewById(R.id.txe);
        View view = this.LL;
        final RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        C500260Jjc.LJLJLJ(recyclerView, true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.14sW
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                int itemCount;
                super.LIZIZ(rect, view2, recyclerView2, c21673919s1);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = recyclerView2.findContainingViewHolder(view2);
                if (viewHolderFindContainingViewHolder == null) {
                    return;
                }
                if (viewHolderFindContainingViewHolder.getLayoutPosition() != -1 && viewHolderFindContainingViewHolder.getLayoutPosition() == 0) {
                    if (C426750GoL.LIZLLL(recyclerView.getContext())) {
                        rect.right = C20398214rk.LLJJJJLIIL;
                        rect.left = C20398214rk.LLJJJJJIL;
                        return;
                    } else {
                        rect.left = C20398214rk.LLJJJJLIIL;
                        rect.right = C20398214rk.LLJJJJJIL;
                        return;
                    }
                }
                int layoutPosition = viewHolderFindContainingViewHolder.getLayoutPosition();
                AbstractC21673619ry adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    itemCount = adapter.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (layoutPosition == itemCount - 1) {
                    if (C426750GoL.LIZLLL(recyclerView.getContext())) {
                        rect.left = C20398214rk.LLJJL;
                        rect.right = C20398214rk.LLJJJJJIL;
                        return;
                    } else {
                        rect.left = C20398214rk.LLJJJJJIL;
                        rect.right = C20398214rk.LLJJL;
                        return;
                    }
                }
                int i = C20398214rk.LLJJJJJIL;
                rect.left = i;
                rect.right = i;
            }
        });
        return recyclerView;
    }
}
