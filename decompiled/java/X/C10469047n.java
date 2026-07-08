package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuGridLayoutManager;

/* JADX INFO: renamed from: X.047n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10469047n extends C0DXR {
    public final int LL;

    public C10469047n(int i) {
        this.LL = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        SkuGridLayoutManager skuGridLayoutManager;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof SkuGridLayoutManager) && (skuGridLayoutManager = (SkuGridLayoutManager) layoutManager) != null && skuGridLayoutManager.LLJILJIL) {
            return;
        }
        if (childAdapterPosition % 2 == 0) {
            rect.bottom = this.LL;
        } else {
            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
    }
}
