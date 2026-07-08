package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0euv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107150euv {
    public static volatile SubPinCard LIZ;
    public static final ConcurrentHashMap<Long, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<WeakReference<InterfaceC1107230ev3>> LIZJ = new CopyOnWriteArrayList<>();

    public static boolean LIZIZ(String str) {
        Map<String, String> mapLIZ = InterfaceC1106030et7.Z7.LIZ();
        if (mapLIZ != null && mapLIZ.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(long j) {
        return Intrinsics.LJFF(LIZIZ.get(Long.valueOf(j)), Boolean.TRUE);
    }

    public static void LIZLLL(InterfaceC1107230ev3 interfaceC1107230ev3) {
        for (WeakReference<InterfaceC1107230ev3> weakReference : LIZJ) {
            InterfaceC1107230ev3 interfaceC1107230ev32 = weakReference.get();
            if (interfaceC1107230ev32 == null || interfaceC1107230ev32 == interfaceC1107230ev3) {
                LIZJ.remove(weakReference);
            }
        }
    }

    public static String LIZ(long j, long j2, long j3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(j2);
        sbLIZ.append('_');
        sbLIZ.append(j3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
