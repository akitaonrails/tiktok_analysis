package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0dCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041450dCx {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(float f) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        return LIZIZ(f, C1161970gLL.LIZIZ().LIZJ());
    }

    public static void LIZJ(View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
        }
    }

    public static float LIZIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
