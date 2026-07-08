package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PDM implements InterfaceC111300bX {
    public final Bundle LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PDM) && Intrinsics.LJFF(this.LL, ((C0PDM) obj).LL);
    }

    public final int hashCode() {
        Bundle bundle = this.LL;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RestoreInstanceData(savedInstanceState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PDM(Bundle bundle) {
        this.LL = bundle;
    }
}
