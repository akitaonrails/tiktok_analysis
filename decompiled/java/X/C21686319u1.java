package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: renamed from: X.19u1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21686319u1 {
    public C21686419u2 LIZ;

    public final View LIZ(C21673319rv c21673319rv) {
        boolean zBooleanValue;
        C21686419u2 c21686419u2 = this.LIZ;
        List<RecyclerView.ViewHolder> list = c21686419u2.LJIIJ;
        if (list != null) {
            int size = list.size();
            int i = Integer.MAX_VALUE;
            RecyclerView.ViewHolder viewHolder = null;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.get(c21686419u2.LJIIJ, i2);
                if (!c21686419u2.LJIIIZ) {
                    try {
                        zBooleanValue = ((Boolean) C2204961BRm.a0(c21686419u2.LIZ, viewHolder2, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5Sn8defrWuQXD+mhYCWqgzuuD37JYlE01de1ettBGA==", null))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        TryCatchGuardChecker.doCheck(e);
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        continue;
                    }
                }
                int layoutPosition = (viewHolder2.getLayoutPosition() - c21686419u2.LJ) * c21686419u2.LJFF;
                if (layoutPosition >= 0 && layoutPosition < i) {
                    viewHolder = viewHolder2;
                    if (layoutPosition == 0) {
                        break;
                    }
                    i = layoutPosition;
                }
            }
            if (viewHolder == null) {
                return null;
            }
            c21686419u2.LJ = viewHolder.getLayoutPosition() + c21686419u2.LJFF;
            return viewHolder.itemView;
        }
        View viewLJI = c21673319rv.LJI(c21686419u2.LJ);
        c21686419u2.LJ += c21686419u2.LJFF;
        return viewLJI;
    }
}
