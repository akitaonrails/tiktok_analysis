package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0MzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586450MzL {
    public static void LIZ(final int i) {
        C15O7.LIZIZ(new Callable() { // from class: X.0JF4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                C1C7U.LIZ("ToastShowUtil@ba63.showNegativeToast$1L");
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                if (validTopActivity == null) {
                    C1C7U.LIZIZ("ToastShowUtil@ba63.showNegativeToast$1L");
                    return null;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(validTopActivity);
                c1389890mGx.LJIIIZ(i2);
                c1389890mGx.LJIIJJI();
                C1C7U.LIZIZ("ToastShowUtil@ba63.showNegativeToast$1L");
                return null;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
