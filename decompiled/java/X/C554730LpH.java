package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import jv6.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS7S0211000_8;

/* JADX INFO: renamed from: X.0LpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554730LpH {
    public static final <T> T LIZ(Context context, Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C554740LpI.LIZIZ, "DynamicFeatureSplitCompat", "runWithSplitCompatActivityRetry", e);
            a.LIZLLL(context);
            return function0.invoke();
        }
    }

    public static final View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        return LIZJ(C786410Ut5.ne(context), i, viewGroup, z);
    }

    public static final View LIZJ(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return (View) LIZ(layoutInflater.getContext(), new AwS7S0211000_8(layoutInflater, i, viewGroup, z, 3));
    }
}
