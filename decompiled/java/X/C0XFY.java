package X;

import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XFY extends C0XFZ {
    public final List<OneTapLoginShareInfo> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0XFY)) {
            return false;
        }
        C0XFY c0xfy = (C0XFY) obj;
        return Intrinsics.LJFF(this.LIZ, c0xfy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0xfy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0xfy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0xfy.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Map<String, Object> map = this.LIZLLL;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiAccountAppResult(oneTapInfoList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", authAppId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authAppVersion=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XFY(List<OneTapLoginShareInfo> list, String str, String str2, Map<String, ? extends Object> map) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = map;
    }
}
