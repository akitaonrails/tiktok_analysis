package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881260Yhg implements Serializable {
    public static final int $stable = 0;
    public final String nameText;
    public final boolean showVerifyIcon;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C881260Yhg)) {
            return false;
        }
        C881260Yhg c881260Yhg = (C881260Yhg) obj;
        return Intrinsics.LJFF(this.nameText, c881260Yhg.nameText) && this.showVerifyIcon == c881260Yhg.showVerifyIcon;
    }

    public int hashCode() {
        return (this.nameText.hashCode() * 31) + C786410Ut5.Z2(this.showVerifyIcon);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatListDecorationName(nameText=");
        sbLIZ.append(this.nameText);
        sbLIZ.append(", showVerifyIcon=");
        sbLIZ.append(this.showVerifyIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C881260Yhg() {
        this("", false);
    }

    public C881260Yhg(String str, boolean z) {
        this.nameText = str;
        this.showVerifyIcon = z;
    }
}
