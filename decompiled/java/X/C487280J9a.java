package X;

import android.app.Activity;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487280J9a {
    public static final List<C487300J9c> LIZ = new ArrayList();

    public static void LIZJ(InterfaceC487330J9f interfaceC487330J9f) {
        LIZLLL(new AwS551S0100000_7(interfaceC487330J9f, 825));
    }

    public static void LIZLLL(final Function0 function0) {
        if (!Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            ExecutorC2044107zb.LL.execute(new Runnable() { // from class: X.0J9Z
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ConfigurationChangedManager@4c32.runOnMainThread$1");
                    try {
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ConfigurationChangedManager@4c32.runOnMainThread$1");
                }
            });
        } else {
            function0.invoke();
        }
    }

    public static void LIZ(int i, InterfaceC487330J9f interfaceC487330J9f) {
        LIZLLL(new C487290J9b(new C487300J9c(i, new WeakReference(interfaceC487330J9f))));
    }

    public static void LIZIZ(Activity activity, InterfaceC487330J9f interfaceC487330J9f) {
        LIZ(activity.hashCode(), interfaceC487330J9f);
    }
}
