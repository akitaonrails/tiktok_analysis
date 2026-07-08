package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726130v1H implements IEvent {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1726130v1H)) {
            return false;
        }
        C1726130v1H c1726130v1H = (C1726130v1H) obj;
        return this.LIZ == c1726130v1H.LIZ && Intrinsics.LJFF(this.LIZIZ, c1726130v1H.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1726130v1H.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1726130v1H.LIZLLL) && Intrinsics.LJFF(this.LJ, c1726130v1H.LJ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.LJ;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECShowLiveBagListEvent(isShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1726130v1H(String str, String str2, Map map) {
        this(str, str2, null, map);
    }

    public C1726130v1H(String str, String str2, String str3, Map map) {
        this.LIZ = true;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = map;
    }
}
