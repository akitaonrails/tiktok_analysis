package X;

import Y.ALAdapterS3S0200000_6;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421690GgB {
    public static final void LIZ(View view, Function0 function0) {
        if (view.getAlpha() < 1.0f) {
            C786410Ut5.T4(view, 1.0f);
        }
        view.animate().alpha(0.0f).setDuration(200L).setListener(new ALAdapterS3S0200000_6(view, function0, 14)).start();
    }
}
