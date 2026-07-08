package X;

import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247340iZ2 {
    public static void LIZ(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, Function1 function1, int i) {
        boolean z;
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        C1265780j2m c1265780j2m = new C1265780j2m(function1, z, 0);
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.LIZ(lifecycleOwner, c1265780j2m);
        } else {
            onBackPressedDispatcher.LIZIZ(c1265780j2m);
        }
    }
}
