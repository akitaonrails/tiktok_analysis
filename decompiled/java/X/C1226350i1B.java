package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226350i1B implements InterfaceC111300bX {
    public final Aweme LL;
    public final C0Y8T LLILLJJLI;
    public final C1371590lnR LLILLL;
    public final Map<String, String> LLILZ;

    public C1226350i1B() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226350i1B)) {
            return false;
        }
        C1226350i1B c1226350i1B = (C1226350i1B) obj;
        return Intrinsics.LJFF(this.LL, c1226350i1B.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1226350i1B.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1226350i1B.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1226350i1B.LLILZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        C0Y8T c0y8t = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c0y8t == null ? 0 : c0y8t.hashCode())) * 31;
        C1371590lnR c1371590lnR = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1371590lnR == null ? 0 : c1371590lnR.hashCode())) * 31;
        Map<String, String> map = this.LLILZ;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePostAndGroupPanelConfig(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", conversation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sharePanelConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1226350i1B(Aweme aweme, C0Y8T c0y8t, C1371590lnR c1371590lnR, Map<String, String> map) {
        this.LL = aweme;
        this.LLILLJJLI = c0y8t;
        this.LLILLL = c1371590lnR;
        this.LLILZ = map;
    }
}
