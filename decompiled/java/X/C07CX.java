package X;

import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07CX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07CX {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1747));

    public static final void LIZ(View view) {
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            view.forceHasOverlappingRendering(false);
        }
    }
}
