package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560480LyY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Function0 function0) {
        function0.invoke();
        if (C1906580ziK.LIZIZ() == null || (C1906580ziK.LIZJ().LJIIZILJ().size() <= 1 && !C0LZR.LIZ())) {
            Intent intentLIZIZ = C2421209eE.LIZIZ(context);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLIZIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZIZ, context);
            C2204961BRm.LJJJJJL(context, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0GY8VZDzhow9zPpWDWW3p", null));
        }
    }
}
