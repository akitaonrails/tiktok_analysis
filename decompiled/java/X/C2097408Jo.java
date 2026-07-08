package X;

import android.os.Looper;
import android.util.Printer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08Jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2097408Jo {
    public static C2097308Jn LIZ;
    public static boolean LIZIZ;

    public static List<Printer> LIZ() {
        C2097308Jn c2097308Jn = LIZ;
        if (c2097308Jn != null) {
            return c2097308Jn.LL;
        }
        return null;
    }

    public static void LIZIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        LIZ = new C2097308Jn();
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            Printer printer = (Printer) declaredField.get(Looper.getMainLooper());
            if (printer != null) {
                ((ArrayList) LIZ.LL).add(printer);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C786410Ut5.LJIIZILJ(Looper.getMainLooper(), LIZ);
    }

    public static void LIZJ(Printer printer) {
        if (printer != null && !((ArrayList) LIZ.LLILLJJLI).contains(printer)) {
            ((ArrayList) LIZ.LLILLJJLI).add(printer);
            LIZ.LLILZ = true;
        }
    }
}
