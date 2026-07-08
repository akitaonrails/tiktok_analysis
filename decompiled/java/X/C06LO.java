package X;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06LO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06LO {
    public static FrameLayout LIZ(int i, Context context, Function1 function1) {
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, i));
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        c1749280vcc.LJ();
        function1.invoke(c1749280vcc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(c1749280vcc, layoutParams);
        return frameLayout;
    }
}
