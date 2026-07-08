package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.19sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21677719sd {
    public final RecyclerView.LayoutManager LIZ;
    public final Map<Integer, C21677819se> LIZIZ;
    public final List<View> LIZJ = new ArrayList();
    public AbstractC21673619ry<?> LIZLLL;

    public final boolean LIZ(int i) {
        return this.LIZIZ.containsKey(Integer.valueOf(i));
    }

    public C21677719sd(RecyclerView.LayoutManager layoutManager, Map<Integer, C21677819se> map) {
        this.LIZ = layoutManager;
        this.LIZIZ = map;
    }
}
