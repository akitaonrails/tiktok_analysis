package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0079, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0079 {
    public final String LIZ;
    public List<Integer> LIZIZ;
    public ArrayList<String> LIZJ;

    public AnonymousClass0079() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0079)) {
            return false;
        }
        AnonymousClass0079 anonymousClass0079 = (AnonymousClass0079) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0079.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0079.LIZIZ) && Intrinsics.LJFF(this.LIZJ, anonymousClass0079.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ArrayList<String> arrayList = this.LIZJ;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricEffectPanelTrimInfo(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", trimPoints=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trimTypes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(String str) {
        String str2;
        if (str != null && str.length() != 0 && (str2 = this.LIZ) != null && str2.length() != 0 && Intrinsics.LJFF(str2, str)) {
            return true;
        }
        return false;
    }

    public AnonymousClass0079(String str, int i) {
        this.LIZ = (i & 1) != 0 ? null : str;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}
