package X;

import com.bytedance.im.core.proto.Response;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C864760XwA extends AbstractC864770XwB {
    public final Response LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C864760XwA) && Intrinsics.LJFF(this.LIZ, ((C864760XwA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteResponse(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C864760XwA(Response response) {
        this.LIZ = response;
    }
}
