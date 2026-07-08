package X;

import android.os.Parcelable;
import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14j2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20344214j2 extends AbstractC20344114j1 {
    public final Parcelable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20344214j2) && Intrinsics.LJFF(this.LIZ, ((C20344214j2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Google(authResultParcelable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20344214j2(AuthResult authResult) {
        this.LIZ = authResult;
    }
}
