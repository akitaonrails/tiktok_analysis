package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700180RdI {
    public final String LIZ;
    public final InterfaceC700020Rd2<?> LIZIZ;
    public final InterfaceC700280RdS LIZJ;
    public final FeedComponentPriorityData LIZLLL;
    public final Function2<InterfaceC700210RdL, String, Boolean> LJ;
    public final Function1<String, GlobalComponentData> LJFF;
    public final Function1<String, FcpNodeProtocol> LJI;
    public final Function0<InterfaceC699200Rbi<?>> LJII;
    public final Map<String, ConditionData> LJIIIIZZ;

    public C700180RdI() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C700180RdI)) {
            return false;
        }
        C700180RdI c700180RdI = (C700180RdI) obj;
        return Intrinsics.LJFF(this.LIZ, c700180RdI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c700180RdI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c700180RdI.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c700180RdI.LIZLLL) && Intrinsics.LJFF(this.LJ, c700180RdI.LJ) && Intrinsics.LJFF(this.LJFF, c700180RdI.LJFF) && Intrinsics.LJFF(this.LJI, c700180RdI.LJI) && Intrinsics.LJFF(this.LJII, c700180RdI.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c700180RdI.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        FeedComponentPriorityData feedComponentPriorityData = this.LIZLLL;
        int iHashCode2 = (iHashCode + (feedComponentPriorityData == null ? 0 : feedComponentPriorityData.hashCode())) * 31;
        Function2<InterfaceC700210RdL, String, Boolean> function2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1<String, GlobalComponentData> function1 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<String, FcpNodeProtocol> function12 = this.LJI;
        int iHashCode5 = (iHashCode4 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function0<InterfaceC699200Rbi<?>> function0 = this.LJII;
        int iHashCode6 = (iHashCode5 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Map<String, ConditionData> map = this.LJIIIIZZ;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpNodeBuildConfig(parentKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataProvider=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", checkerFactory=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fcpProtocol=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", signalCustomizer=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", globalComponentProvider=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", nodeProtocolFactory=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", metricAbilityInvoker=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", componentsConditionMap=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C700180RdI(String str, InterfaceC700020Rd2 interfaceC700020Rd2, InterfaceC700280RdS interfaceC700280RdS, FeedComponentPriorityData feedComponentPriorityData, AwS625S0100000_11 awS625S0100000_11, C701450RfL c701450RfL, Function0 function0, Map map) {
        this.LIZ = str;
        this.LIZIZ = interfaceC700020Rd2;
        this.LIZJ = interfaceC700280RdS;
        this.LIZLLL = feedComponentPriorityData;
        this.LJ = awS625S0100000_11;
        this.LJFF = null;
        this.LJI = c701450RfL;
        this.LJII = function0;
        this.LJIIIIZZ = map;
    }
}
