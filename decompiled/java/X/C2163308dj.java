package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2163308dj extends C09AY implements Function0<Integer> {
    public C2163308dj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() throws Throwable {
        int length = -1;
        try {
            int iLIZ = C2163208di.LIZ("/sys/devices/system/cpu/possible");
            if (iLIZ == -1) {
                iLIZ = C2163208di.LIZ("/sys/devices/system/cpu/present");
            }
            if (iLIZ == -1) {
                length = new C0VSJ("/sys/devices/system/cpu/").listFiles(C2163208di.LIZ).length;
            } else {
                length = iLIZ;
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return Integer.valueOf(length);
    }
}
