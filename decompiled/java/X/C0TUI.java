package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TUI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUI implements InterfaceC111300bX {
    public final WeakReference<Activity> LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0TUI)) {
            return false;
        }
        C0TUI c0tui = (C0TUI) obj;
        return Intrinsics.LJFF(this.LL, c0tui.LL) && this.LLILLJJLI == c0tui.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PasskeyManagementHierarchyData(weakActivity=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasPassword=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TUI(WeakReference<Activity> weakReference, boolean z) {
        this.LL = weakReference;
        this.LLILLJJLI = z;
    }
}
