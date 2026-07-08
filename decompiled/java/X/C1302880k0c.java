package X;

import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0k0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302880k0c {
    public final CharSequence LIZ;
    public final Uri LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C1302410jzr LJFF;
    public PhoneAccountHandle LJI;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallAttributes(displayName=[");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append("], address=[");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("], direction=[");
        sbLIZ.append(this.LIZJ == 2 ? "Outgoing" : "Incoming");
        sbLIZ.append("], callType=[");
        sbLIZ.append(this.LIZLLL == 1 ? "Audio" : "Video");
        sbLIZ.append("], capabilities=[");
        StringBuilder sb = new StringBuilder(e3.e);
        C1302910k0f c1302910k0f = C1302930k0h.LIZ;
        int i = this.LJ;
        c1302910k0f.getClass();
        if (C1302910k0f.LIZ(2, i)) {
            sb.append("SetInactive");
        }
        int i2 = this.LJ;
        c1302910k0f.getClass();
        if (C1302910k0f.LIZ(4, i2)) {
            sb.append(", Stream");
        }
        if (C1302910k0f.LIZ(8, this.LJ)) {
            sb.append(", Transfer");
        }
        sb.append("])");
        sbLIZ.append(sb.toString());
        sbLIZ.append("])");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1302880k0c) {
            C1302880k0c c1302880k0c = (C1302880k0c) obj;
            if (Intrinsics.LJFF(this.LIZ, c1302880k0c.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1302880k0c.LIZIZ) && this.LIZJ == c1302880k0c.LIZJ && this.LIZLLL == c1302880k0c.LIZLLL && this.LJ == c1302880k0c.LJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1302880k0c(CharSequence charSequence, Uri uri, int i, int i2, int i3, C1302410jzr c1302410jzr) {
        this.LIZ = charSequence;
        this.LIZIZ = uri;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = c1302410jzr;
    }
}
