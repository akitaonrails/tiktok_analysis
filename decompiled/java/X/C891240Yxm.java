package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891240Yxm {
    public final String LIZ = "alert_tones_btn_elem";
    public final String LIZIZ = "ttsocial_chat_alert_tones_btn_show";
    public final String LIZJ = "ttsocial_chat_alert_tones_btn_click";
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C891240Yxm)) {
            return false;
        }
        C891240Yxm c891240Yxm = (C891240Yxm) obj;
        return Intrinsics.LJFF(this.LIZ, c891240Yxm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c891240Yxm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c891240Yxm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c891240Yxm.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NxETConfig(oid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C891240Yxm(Map map) {
        this.LIZLLL = map;
    }
}
