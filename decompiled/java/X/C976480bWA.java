package X;

import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import java.util.List;

/* JADX INFO: renamed from: X.0bWA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976480bWA {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public List<C976800bWg> LJFF;
    public List<BattleUserArmy> LJI;
    public int LJII = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C976480bWA) && this.LIZ == ((C976480bWA) obj).LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveMatchTeam(teamId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C976480bWA(long j) {
        this.LIZ = j;
    }
}
