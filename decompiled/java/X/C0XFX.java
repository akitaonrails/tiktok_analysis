package X;

import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XFX extends C0XFZ {
    public final OneTapLoginShareInfo LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0XFX)) {
            return false;
        }
        C0XFX c0xfx = (C0XFX) obj;
        return Intrinsics.LJFF(this.LIZ, c0xfx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0xfx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0xfx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0xfx.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Map<String, Object> map = this.LIZLLL;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleAccountAppResult(oneTapInfo=");
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

    public C0XFX(OneTapLoginShareInfo oneTapLoginShareInfo, String str, String str2, Map<String, ? extends Object> map) {
        this.LIZ = oneTapLoginShareInfo;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = map;
    }
}
