package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336650DHr {
    public static final int LIZ(AbstractC21673619ry<?> abstractC21673619ry, C21679919sz c21679919sz) {
        int itemCount = 0;
        for (AbstractC21673619ry<? extends RecyclerView.ViewHolder> abstractC21673619ry2 : c21679919sz.LLLI()) {
            if (Intrinsics.LJFF(abstractC21673619ry2, abstractC21673619ry)) {
                return itemCount;
            }
            itemCount += abstractC21673619ry2.getItemCount();
        }
        return -1;
    }
}
