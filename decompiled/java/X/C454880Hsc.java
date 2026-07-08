package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454880Hsc implements InterfaceC454950Hsj {
    public final C19EG LIZ;
    public final View LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454880Hsc)) {
            return false;
        }
        C454880Hsc c454880Hsc = (C454880Hsc) obj;
        return Intrinsics.LJFF(this.LIZ, c454880Hsc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c454880Hsc.LIZIZ) && this.LIZJ == c454880Hsc.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromQuoted(fragmentActivity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", view=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", refMsgId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454880Hsc(C19EG c19eg, View view, long j) {
        this.LIZ = c19eg;
        this.LIZIZ = view;
        this.LIZJ = j;
    }
}
