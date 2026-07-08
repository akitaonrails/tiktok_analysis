package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423450Gj1 extends C0DXR {
    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        InterfaceC1891350zJl item;
        C423460Gj2 c423460Gj2;
        View view2;
        PowerCell powerCell;
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        Object tag = null;
        if ((childViewHolder instanceof PowerCell) && (powerCell = (PowerCell) childViewHolder) != null) {
            item = powerCell.getItem();
        } else {
            item = null;
        }
        if ((item instanceof C423460Gj2) && (c423460Gj2 = (C423460Gj2) item) != null && (view2 = c423460Gj2.LL) != null) {
            tag = view2.getTag();
        }
        if (Intrinsics.LJFF(tag, "resource_header_container_tag")) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        rect.set(iLIZIZ, 0, iLIZIZ, 0);
    }
}
