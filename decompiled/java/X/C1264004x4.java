package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.04x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264004x4 implements Serializable {
    public final boolean disableWebUrlHandler;

    public C1264004x4() {
        this(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1264004x4) && this.disableWebUrlHandler == ((C1264004x4) obj).disableWebUrlHandler;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.disableWebUrlHandler);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiJumpConfig(disableWebUrlHandler=");
        sbLIZ.append(this.disableWebUrlHandler);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264004x4(boolean z) {
        this.disableWebUrlHandler = z;
    }
}
