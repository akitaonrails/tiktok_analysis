package X;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463210oBD {
    public static final C1463210oBD LIZ = new C1463210oBD();

    public static void LIZ(Activity activity, Function0 function0) {
        if (activity.isFinishing()) {
            function0.invoke();
            return;
        }
        C21566919al c21566919al = new C21566919al(activity);
        c21566919al.LIZ(2131833241);
        c21566919al.LJII(2131833236, null, false);
        c21566919al.LJIIJ(2131833240, new DialogInterfaceOnClickListenerC1466630oGj(function0, 0), false);
        new C21566519ah(c21566919al).LIZLLL();
    }
}
