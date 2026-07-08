package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0135002b {
    public final String LIZ;
    public final WeakReference<View> LIZIZ;
    public final C0134002a LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0135002b)) {
            return false;
        }
        C0135002b c0135002b = (C0135002b) obj;
        return Intrinsics.LJFF(this.LIZ, c0135002b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0135002b.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0135002b.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        WeakReference<View> weakReference = this.LIZIZ;
        return ((iHashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceCallModel(clientSessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entranceContentView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", metricModel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0135002b(String str, WeakReference<View> weakReference, C0134002a c0134002a) {
        this.LIZ = str;
        this.LIZIZ = weakReference;
        this.LIZJ = c0134002a;
    }
}
