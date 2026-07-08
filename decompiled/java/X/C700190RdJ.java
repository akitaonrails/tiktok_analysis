package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700190RdJ {
    public final ClientStandardModel LIZ;
    public final InterfaceC700020Rd2<?> LIZIZ;
    public final InterfaceC700280RdS LIZJ;
    public final FeedComponentPriorityData LIZLLL;
    public final InterfaceC700270RdR LJ;
    public final C701040Reg LJFF;
    public final Function1<FcpNodeProtocol, Boolean> LJI;
    public final Function1<String, GlobalComponentData> LJII;
    public final C0RXZ LJIIIIZZ;
    public final Function0<InterfaceC699200Rbi<?>> LJIIIZ;

    public C700190RdJ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C700190RdJ)) {
            return false;
        }
        C700190RdJ c700190RdJ = (C700190RdJ) obj;
        return Intrinsics.LJFF(this.LIZ, c700190RdJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c700190RdJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c700190RdJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c700190RdJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c700190RdJ.LJ) && Intrinsics.LJFF(this.LJFF, c700190RdJ.LJFF) && Intrinsics.LJFF(this.LJI, c700190RdJ.LJI) && Intrinsics.LJFF(this.LJII, c700190RdJ.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c700190RdJ.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c700190RdJ.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        FeedComponentPriorityData feedComponentPriorityData = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (feedComponentPriorityData == null ? 0 : feedComponentPriorityData.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        C701040Reg c701040Reg = this.LJFF;
        int iHashCode3 = (iHashCode2 + (c701040Reg == null ? 0 : c701040Reg.hashCode())) * 31;
        Function1<FcpNodeProtocol, Boolean> function1 = this.LJI;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<String, GlobalComponentData> function12 = this.LJII;
        int iHashCode5 = (iHashCode4 + (function12 == null ? 0 : function12.hashCode())) * 31;
        C0RXZ c0rxz = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (c0rxz == null ? 0 : c0rxz.hashCode())) * 31;
        Function0<InterfaceC699200Rbi<?>> function0 = this.LJIIIZ;
        return iHashCode6 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpNormalNodeBuildConfig(clientModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataProvider=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", checkerFactory=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fcpProtocol=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ruleFactory=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nodeStore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", filterCondition=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", globalComponentProvider=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", fcpManager=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", metricAbilityInvoker=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C700190RdJ(ClientStandardModel clientStandardModel, InterfaceC700020Rd2 interfaceC700020Rd2, InterfaceC700280RdS interfaceC700280RdS, FeedComponentPriorityData feedComponentPriorityData, InterfaceC700270RdR interfaceC700270RdR, C0RXZ c0rxz, Function0 function0) {
        this.LIZ = clientStandardModel;
        this.LIZIZ = interfaceC700020Rd2;
        this.LIZJ = interfaceC700280RdS;
        this.LIZLLL = feedComponentPriorityData;
        this.LJ = interfaceC700270RdR;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = c0rxz;
        this.LJIIIZ = function0;
    }
}
