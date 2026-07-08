package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C045000Ee implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public C045000Ee() {
        this(null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C045000Ee)) {
            return false;
        }
        C045000Ee c045000Ee = (C045000Ee) obj;
        return Intrinsics.LJFF(this.LL, c045000Ee.LL) && Intrinsics.LJFF(this.LLILLJJLI, c045000Ee.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c045000Ee.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("invitee_cnt", this.LL);
        linkedHashMap.put("invitee_uid", this.LLILLJJLI);
        linkedHashMap.put("follow_status", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendAddYoursInvitationInviteeGroup(inviteeCnt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", inviteeUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C045000Ee(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
