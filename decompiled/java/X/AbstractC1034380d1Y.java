package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0d1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1034380d1Y {
    public static View LIZJ(View view) {
        if (view.getId() == R.id.view_rootview) {
            return view;
        }
        Object parent = view.getParent();
        if (parent == null || !(parent instanceof View)) {
            return null;
        }
        return LIZJ((View) parent);
    }

    public final View LIZIZ(View view) {
        return LIZLLL(view, R.id.dgm, new AwS417S0200000_16(this, view, 80));
    }

    public static View LIZLLL(View view, int i, Function0 function0) {
        View view2;
        Object tag = view.getTag(i);
        if (tag != null && (tag instanceof View) && (view2 = (View) tag) != null) {
            return view2;
        }
        View view3 = (View) function0.invoke();
        if (view3 == null) {
            return null;
        }
        view.setTag(i, view3);
        return view3;
    }
}
