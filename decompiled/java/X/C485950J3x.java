package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0J3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485950J3x {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(337));
    public static final Set<Integer> LIZIZ = new LinkedHashSet();

    public static boolean LIZ(int i) {
        return LIZIZ.contains(Integer.valueOf(i));
    }

    public static View LIZJ(ViewGroup viewGroup, int i) {
        return LIZIZ(viewGroup.getContext(), i, viewGroup, true);
    }

    public static void LIZLLL(int i, Context context) {
        LIZIZ.add(Integer.valueOf(i));
        ((IHostPerformanceOpt) LIZ.getValue()).SV1(i, context);
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        return ((IHostPerformanceOpt) LIZ.getValue()).uK2(context, i, viewGroup, z);
    }
}
