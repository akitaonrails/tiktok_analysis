package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Puy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660180Puy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(178));

    public static void LIZ(View view) {
        if (view instanceof RecyclerView) {
            ((WeakHashMap) LIZ.getValue()).get(view);
            return;
        }
        ViewParent parent = view.getParent();
        while (!(parent instanceof RecyclerView)) {
            if (parent != null) {
                parent = parent.getParent();
            } else {
                return;
            }
        }
        if (parent != null) {
            ((WeakHashMap) LIZ.getValue()).get(parent);
        }
    }
}
