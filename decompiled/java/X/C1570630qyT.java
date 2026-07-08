package X;

import android.content.Context;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.homepage.ui.slide.AbsTabScrollProfileStrategy;

/* JADX INFO: renamed from: X.0qyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570630qyT {
    public static void LIZ(Context context) {
        Rect rect;
        boolean zLIZLLL = C426750GoL.LIZLLL(context);
        AbsTabScrollProfileStrategy.LLILLL = zLIZLLL;
        if (zLIZLLL) {
            rect = new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)), C497820Jfg.LIZ(context));
        } else {
            rect = new Rect(C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)), 0, C497820Jfg.LIZIZ(context), C497820Jfg.LIZ(context));
        }
        AbsTabScrollProfileStrategy.LLILZ.set(rect);
    }
}
