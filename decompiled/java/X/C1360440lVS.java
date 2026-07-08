package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360440lVS implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final List<String> LLILZ;
    public final boolean LLILZIL;
    public final C1360400lVO LLILZLL;
    public final Function0<Unit> LLIZ;

    public C1360440lVS() {
        this(null, null, -1, C13BV.INSTANCE, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360440lVS)) {
            return false;
        }
        C1360440lVS c1360440lVS = (C1360440lVS) obj;
        return Intrinsics.LJFF(this.LL, c1360440lVS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1360440lVS.LLILLJJLI) && this.LLILLL == c1360440lVS.LLILLL && Intrinsics.LJFF(this.LLILZ, c1360440lVS.LLILZ) && this.LLILZIL == c1360440lVS.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1360440lVS.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1360440lVS.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C1360400lVO c1360400lVO = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (c1360400lVO == null ? 0 : c1360400lVO.hashCode())) * 31;
        Function0<Unit> function0 = this.LLIZ;
        return iHashCode3 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarStickerBannerConfig(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", expressions=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showGuidance=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", defaultSelection=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onGuidanceShow=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1360440lVS(String str, String str2, int i, List<String> list, boolean z, C1360400lVO c1360400lVO, Function0<Unit> function0) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = c1360400lVO;
        this.LLIZ = function0;
    }
}
