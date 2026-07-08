package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0281007r implements Serializable {
    public final String icon;
    public final String text;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0281007r)) {
            return false;
        }
        C0281007r c0281007r = (C0281007r) obj;
        return Intrinsics.LJFF(this.icon, c0281007r.icon) && Intrinsics.LJFF(this.text, c0281007r.text);
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpKeySellingPointState(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0281007r(String str, String str2) {
        this.icon = str;
        this.text = str2;
    }
}
