package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oi1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483550oi1 {
    public static boolean LIZ;
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1483570oi3());

    public static boolean LIZ(InterfaceC1483520ohy interfaceC1483520ohy) {
        Map<String, Object> mapLJ;
        String string;
        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI;
        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI2 = interfaceC1483520ohy.LJJJJZI();
        if (interfaceC1483510ohxLJJJJZI2 == null || (mapLJ = interfaceC1483510ohxLJJJJZI2.LIZ()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("is_mute");
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "true") || (interfaceC1483510ohxLJJJJZI = interfaceC1483520ohy.LJJJJZI()) == null || !interfaceC1483510ohxLJJJJZI.isPlaying()) {
            return false;
        }
        return true;
    }
}
