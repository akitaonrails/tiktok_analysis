package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056730dbb {
    public static final AtomicReference<String> LIZ = new AtomicReference<>(null);
    public static DialogC1389620mGW LIZIZ;

    public static void LIZ() {
        try {
            DialogC1389620mGW dialogC1389620mGW = LIZIZ;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZIZ = null;
    }

    public static void LIZIZ(String str) {
        if (Intrinsics.LJFF(str, "loading")) {
            LIZIZ = null;
        }
        AtomicReference<String> atomicReference = LIZ;
        while (!atomicReference.compareAndSet(str, null) && atomicReference.get() == str) {
        }
    }
}
