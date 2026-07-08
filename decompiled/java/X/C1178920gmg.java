package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: renamed from: X.0gmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178920gmg {
    public static final LifecycleOwner LIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            return ((AbstractC738140SxQ) lifecycleOwner).getParent();
        }
        if (lifecycleOwner instanceof PowerCell) {
            return ((PowerCell) lifecycleOwner).getParent();
        }
        return null;
    }
}
