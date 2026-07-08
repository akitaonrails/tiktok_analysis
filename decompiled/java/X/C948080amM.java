package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0amM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948080amM extends AbstractC948140amS {
    public final Context LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C948080amM) && Intrinsics.LJFF(this.LIZ, ((C948080amM) obj).LIZ);
    }

    public final int hashCode() {
        Context context = this.LIZ;
        if (context == null) {
            return 0;
        }
        return context.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitLayoutSetting(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C948080amM(Context context) {
        this.LIZ = context;
    }
}
