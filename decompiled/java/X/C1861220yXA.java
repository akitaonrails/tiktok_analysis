package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861220yXA {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.3d)));
    public static final int LIZIZ = ((Number) C18074076a.LIZ.getValue()).intValue();

    public static final void LIZ(C1861310yXJ c1861310yXJ, int i, Function1<? super Integer, Unit> function1) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        if (c1861310yXJ == null || (view = c1861310yXJ.LIZ) == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        int iMax = Math.max(i, LIZ);
        if (layoutParams.height == iMax) {
            C07QJ.LIZ.getClass();
            if (C07QJ.LIZIZ()) {
                new Pair("height", Integer.valueOf(iMax));
                return;
            }
        }
        new Pair("height", Integer.valueOf(iMax));
        AnonymousClass1425.LIZ.getClass();
        ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
        if (iTakoDebugServiceLIZ != null) {
            iTakoDebugServiceLIZ.LIZ();
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = iMax;
            function1.invoke(Integer.valueOf(iMax));
        } else {
            layoutParams2 = null;
        }
        C786410Ut5.W5(view, layoutParams2);
    }
}
