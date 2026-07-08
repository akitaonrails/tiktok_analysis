package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546310Lbh {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final Function1<CreativeModel, Map<String, String>> LJFF;
    public final Function1<CreativeModel, Boolean> LJI;
    public final Function1<CreativeModel, Boolean> LJII;
    public final Function1<CreativeModel, Boolean> LJIIIIZZ;
    public final InterfaceC1631620sYq<CreativeModel, Integer, String, Unit> LJIIIZ;

    public C546310Lbh() {
        this(0, false, false, null, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C546310Lbh)) {
            return false;
        }
        C546310Lbh c546310Lbh = (C546310Lbh) obj;
        return this.LIZ == c546310Lbh.LIZ && this.LIZIZ == c546310Lbh.LIZIZ && this.LIZJ == c546310Lbh.LIZJ && this.LIZLLL == c546310Lbh.LIZLLL && this.LJ == c546310Lbh.LJ && Intrinsics.LJFF(this.LJFF, c546310Lbh.LJFF) && Intrinsics.LJFF(this.LJI, c546310Lbh.LJI) && Intrinsics.LJFF(this.LJII, c546310Lbh.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c546310Lbh.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c546310Lbh.LJIIIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Function1<CreativeModel, Map<String, String>> function1 = this.LJFF;
        int iHashCode = (iZ2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function12 = this.LJI;
        int iHashCode2 = (iHashCode + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function13 = this.LJII;
        int iHashCode3 = (iHashCode2 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<CreativeModel, Boolean> function14 = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (function14 == null ? 0 : function14.hashCode())) * 31;
        InterfaceC1631620sYq<CreativeModel, Integer, String, Unit> interfaceC1631620sYq = this.LJIIIZ;
        return iHashCode4 + (interfaceC1631620sYq != null ? interfaceC1631620sYq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditConfig(supportMusicRec=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", supportReuse=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", supportSendToDM=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", moveSaveLocalToTop=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", disableEditLocalSaveBtn=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", appendSharePanelMobParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", supportStoryPost=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", forceSaveDraftInEditPage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", reuseDefaultCoverConfig=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", onSaveLocalAuthError=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C546310Lbh(int i, boolean z, boolean z2, Function1 function1, AFwS239S0000000_8 aFwS239S0000000_8, Function1 function12, AFwS239S0000000_8 aFwS239S0000000_82, InterfaceC1631620sYq interfaceC1631620sYq, int i2) {
        boolean z3;
        i = (i2 & 1) != 0 ? 2 : i;
        if ((i2 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z = (i2 & 4) != 0 ? true : z;
        z2 = (i2 & 16) != 0 ? false : z2;
        function1 = (i2 & 32) != 0 ? null : function1;
        aFwS239S0000000_8 = (i2 & 64) != 0 ? null : aFwS239S0000000_8;
        function12 = (i2 & 128) != 0 ? null : function12;
        aFwS239S0000000_82 = (i2 & 256) != 0 ? null : aFwS239S0000000_82;
        interfaceC1631620sYq = (i2 & 512) != 0 ? null : interfaceC1631620sYq;
        this.LIZ = i;
        this.LIZIZ = z3;
        this.LIZJ = z;
        this.LIZLLL = false;
        this.LJ = z2;
        this.LJFF = function1;
        this.LJI = aFwS239S0000000_8;
        this.LJII = function12;
        this.LJIIIIZZ = aFwS239S0000000_82;
        this.LJIIIZ = interfaceC1631620sYq;
    }
}
