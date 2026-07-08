package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC903280Zc6 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<InterfaceC902960Zba<?>, Object> LIZ = new LinkedHashMap();

    public abstract <T> T LIZ(InterfaceC902960Zba<T> interfaceC902960Zba);

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationExtras(extras=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AbstractC903280Zc6) && Intrinsics.LJFF(this.LIZ, ((AbstractC903280Zc6) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
