package X;

import android.os.Bundle;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2036407yM implements IEvent {
    public final Bundle LIZ;
    public final Integer LIZIZ;
    public final Map<String, String> LIZJ;
    public final Map<String, Object> LIZLLL;
    public final boolean LJ;

    public C2036407yM() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2036407yM)) {
            return false;
        }
        C2036407yM c2036407yM = (C2036407yM) obj;
        return Intrinsics.LJFF(this.LIZ, c2036407yM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2036407yM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2036407yM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2036407yM.LIZLLL) && this.LJ == c2036407yM.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        Map<String, Object> map = this.LIZLLL;
        return ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
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
        sbLIZ.append("OpenMultiVideoInnerFlowEvent(toDetailBundle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loadMoreConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isGeneralization=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2036407yM(Bundle bundle, Integer num, Map map, Map map2) {
        this.LIZ = bundle;
        this.LIZIZ = num;
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = false;
    }
}
