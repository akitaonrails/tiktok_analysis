package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cn7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025430cn7 extends AbstractC1025510cnF {
    public final AbstractC1025700cnY LIZIZ;
    public final AbstractC1025700cnY LIZJ;
    public final EnumC1036160d4Q LIZLLL;
    public final EnumC1027220cq0 LJ;
    public final NonAdWebModel LJFF;
    public final AiAgentConfig LJI;
    public final boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public C1025430cn7() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1025430cn7)) {
            return false;
        }
        C1025430cn7 c1025430cn7 = (C1025430cn7) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1025430cn7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1025430cn7.LIZJ) && this.LIZLLL == c1025430cn7.LIZLLL && this.LJ == c1025430cn7.LJ && Intrinsics.LJFF(this.LJFF, c1025430cn7.LJFF) && Intrinsics.LJFF(this.LJI, c1025430cn7.LJI) && this.LJII == c1025430cn7.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        NonAdWebModel nonAdWebModel = this.LJFF;
        int iHashCode2 = (iHashCode + (nonAdWebModel == null ? 0 : nonAdWebModel.hashCode())) * 31;
        AiAgentConfig aiAgentConfig = this.LJI;
        return ((iHashCode2 + (aiAgentConfig != null ? aiAgentConfig.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CRouterCustomBusinessModel(lynxLPType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", webLPType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lpFromScene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", iabCreateScene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nonAdWebModel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", aiAgentConfig=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isGPMiniCardFullScreen=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1025510cnF
    public final boolean LIZ() {
        return this.LJII;
    }

    public static C1025430cn7 LIZIZ(C1025430cn7 c1025430cn7, C1025470cnB c1025470cnB, EnumC1036160d4Q enumC1036160d4Q, int i) {
        AbstractC1025700cnY abstractC1025700cnY;
        EnumC1027220cq0 enumC1027220cq0;
        NonAdWebModel nonAdWebModel;
        boolean z;
        EnumC1036160d4Q enumC1036160d4Q2 = enumC1036160d4Q;
        AbstractC1025700cnY abstractC1025700cnY2 = c1025470cnB;
        AiAgentConfig aiAgentConfig = null;
        if ((i & 1) != 0) {
            abstractC1025700cnY = c1025430cn7.LIZIZ;
        } else {
            abstractC1025700cnY = null;
        }
        if ((i & 2) != 0) {
            abstractC1025700cnY2 = c1025430cn7.LIZJ;
        }
        if ((i & 4) != 0) {
            enumC1036160d4Q2 = c1025430cn7.LIZLLL;
        }
        if ((i & 8) != 0) {
            enumC1027220cq0 = c1025430cn7.LJ;
        } else {
            enumC1027220cq0 = null;
        }
        if ((i & 16) != 0) {
            nonAdWebModel = c1025430cn7.LJFF;
        } else {
            nonAdWebModel = null;
        }
        if ((i & 32) != 0) {
            aiAgentConfig = c1025430cn7.LJI;
        }
        if ((i & 64) != 0) {
            z = c1025430cn7.LJII;
        } else {
            z = false;
        }
        return new C1025430cn7(abstractC1025700cnY, abstractC1025700cnY2, enumC1036160d4Q2, enumC1027220cq0, nonAdWebModel, aiAgentConfig, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1025430cn7(AbstractC1025700cnY abstractC1025700cnY, AbstractC1025700cnY abstractC1025700cnY2, NonAdWebModel nonAdWebModel, AiAgentConfig aiAgentConfig, int i) {
        EnumC1036160d4Q enumC1036160d4Q;
        EnumC1027220cq0 enumC1027220cq0;
        NonAdWebModel nonAdWebModel2 = nonAdWebModel;
        AbstractC1025700cnY abstractC1025700cnY3 = abstractC1025700cnY2;
        AbstractC1025700cnY abstractC1025700cnY4 = (i & 1) != 0 ? C1025680cnW.LIZIZ : abstractC1025700cnY;
        abstractC1025700cnY3 = (i & 2) != 0 ? C1025680cnW.LIZIZ : abstractC1025700cnY3;
        if ((i & 4) != 0) {
            enumC1036160d4Q = EnumC1036160d4Q.DEFAULT;
        } else {
            enumC1036160d4Q = null;
        }
        if ((i & 8) != 0) {
            enumC1027220cq0 = EnumC1027220cq0.NORMAL;
        } else {
            enumC1027220cq0 = null;
        }
        this(abstractC1025700cnY4, abstractC1025700cnY3, enumC1036160d4Q, enumC1027220cq0, (i & 16) != 0 ? null : nonAdWebModel2, (i & 32) == 0 ? aiAgentConfig : null, false);
    }

    public C1025430cn7(AbstractC1025700cnY abstractC1025700cnY, AbstractC1025700cnY abstractC1025700cnY2, EnumC1036160d4Q enumC1036160d4Q, EnumC1027220cq0 enumC1027220cq0, NonAdWebModel nonAdWebModel, AiAgentConfig aiAgentConfig, boolean z) {
        super(z);
        this.LIZIZ = abstractC1025700cnY;
        this.LIZJ = abstractC1025700cnY2;
        this.LIZLLL = enumC1036160d4Q;
        this.LJ = enumC1027220cq0;
        this.LJFF = nonAdWebModel;
        this.LJI = aiAgentConfig;
        this.LJII = z;
    }
}
