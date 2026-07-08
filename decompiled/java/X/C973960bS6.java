package X;

import java.util.List;

/* JADX INFO: renamed from: X.0bS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973960bS6 {
    public final EnumC919170a1j LIZ;
    public final List<Long> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveMatchConfiguration(matchType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selfTeam=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C973960bS6(EnumC919170a1j enumC919170a1j, List<Long> list) {
        this.LIZ = enumC919170a1j;
        this.LIZIZ = list;
    }
}
