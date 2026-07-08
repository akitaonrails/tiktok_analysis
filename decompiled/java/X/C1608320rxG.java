package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import java.util.Map;

/* JADX INFO: renamed from: X.0rxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608320rxG {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final Map<String, View> LJFF;

    public /* synthetic */ C1608320rxG(View view, View view2, View view3, View view4, TuxIconView tuxIconView, int i) {
        this(view, (i & 2) != 0 ? null : view2, (i & 4) != 0 ? null : view3, view4, (i & 16) != 0 ? null : tuxIconView, (Map<String, ? extends View>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1608320rxG(View view, View view2, View view3, View view4, View view5, Map<String, ? extends View> map) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        this.LIZLLL = view4;
        this.LJ = view5;
        this.LJFF = map;
    }
}
