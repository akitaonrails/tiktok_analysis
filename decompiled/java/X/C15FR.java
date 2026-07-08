package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15FR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FR {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15FR)) {
            return false;
        }
        C15FR c15fr = (C15FR) obj;
        c15fr.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null) && this.LIZ == c15fr.LIZ && this.LIZIZ == c15fr.LIZIZ && this.LIZJ == c15fr.LIZJ && this.LIZLLL == c15fr.LIZLLL && this.LJ == c15fr.LJ;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "BonusSenderTraceInfo(logId=null, giftId=0, currentUserId=0, taskType=null, taskTypeNum=0, taskSessionId=null, progressBefore=0, progressAfter=" + this.LIZ + ", sendSuccessTimestamp=0, sendSuccessLocalMs=0, sendSuccessPkRemainTime=0, sendSuccessTaskProgressRemainTime=0, receiveImTimestamp=" + this.LIZIZ + ", receiveImLocalMs=" + this.LIZJ + ", updateUiTimestamp=" + this.LIZLLL + ", updateUiLocalMs=" + this.LJ + ')';
    }

    public static String LIZ() {
        JSONObject jSONObject = C975320bUI.LIZ;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        long jLJJJJJL = interfaceC973730bRjYf2 != null ? interfaceC973730bRjYf2.LJJJJJL() : 0L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLJJJJJL);
        sbLIZ.append(',');
        sbLIZ.append(0L);
        sbLIZ.append(',');
        sbLIZ.append((String) null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
