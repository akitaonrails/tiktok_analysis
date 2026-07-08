package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TUG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUG implements InterfaceC111300bX {
    public final WeakReference<Activity> LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0TUG)) {
            return false;
        }
        C0TUG c0tug = (C0TUG) obj;
        return Intrinsics.LJFF(this.LL, c0tug.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0tug.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecurityCheckUpHierarchyData(weakActivity=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TUG(WeakReference<Activity> weakReference, String str) {
        this.LL = weakReference;
        this.LLILLJJLI = str;
    }
}
