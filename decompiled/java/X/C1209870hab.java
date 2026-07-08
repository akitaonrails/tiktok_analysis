package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209870hab {
    public final KeyEvent LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        KeyEvent keyEvent = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyEvent(nativeKeyEvent=");
        sbLIZ.append(keyEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        KeyEvent keyEvent = this.LIZ;
        if (!(obj instanceof C1209870hab) || !Intrinsics.LJFF(keyEvent, ((C1209870hab) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
