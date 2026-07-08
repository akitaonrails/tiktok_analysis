package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z3N, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3N {
    public static final String LIZ(Object obj) {
        InterfaceC888500YtM interfaceC888500YtM;
        if ((obj instanceof InterfaceC888500YtM) && (interfaceC888500YtM = (InterfaceC888500YtM) obj) != null) {
            return interfaceC888500YtM.getSessionId();
        }
        return "";
    }

    public static final boolean LIZIZ(InterfaceC888500YtM interfaceC888500YtM, Object obj) {
        if (obj == interfaceC888500YtM) {
            return true;
        }
        if (!(obj instanceof InterfaceC888500YtM)) {
            return false;
        }
        return Intrinsics.LJFF(interfaceC888500YtM.getSessionId(), ((InterfaceC888500YtM) obj).getSessionId());
    }
}
