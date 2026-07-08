package X;

import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS103S1000000_19;
import kotlin.jvm.internal.AwS153S1100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245770iWV {
    public final List<MutualUser> LIZ;
    public final int LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function1<TuxPanel, Unit> LJFF;
    public final Function1<TuxPanel, Unit> LJI;
    public final boolean LJII;

    public C1245770iWV() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1245770iWV)) {
            return false;
        }
        C1245770iWV c1245770iWV = (C1245770iWV) obj;
        return Intrinsics.LJFF(this.LIZ, c1245770iWV.LIZ) && this.LIZIZ == c1245770iWV.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1245770iWV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1245770iWV.LIZLLL) && Intrinsics.LJFF(this.LJ, c1245770iWV.LJ) && Intrinsics.LJFF(this.LJFF, c1245770iWV.LJFF) && Intrinsics.LJFF(this.LJI, c1245770iWV.LJI) && this.LJII == c1245770iWV.LJII;
    }

    public final int hashCode() {
        List<MutualUser> list = this.LIZ;
        int iHashCode = (((((((list == null ? 0 : list.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        Function0<Unit> function0 = this.LJ;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<TuxPanel, Unit> function1 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<TuxPanel, Unit> function12 = this.LJI;
        return ((iHashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampusPopupConfig(userList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarStackTotalCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onPrimaryAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onSecondaryAction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onShow=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onCancel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onDismiss=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isDismissable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1245770iWV(List list, int i, Function0 function0, AwS153S1100000_4 awS153S1100000_4, AwS103S1000000_19 awS103S1000000_19, Function1 function1, Function1 function12, boolean z, int i2) {
        Function0<Unit> function02 = (i2 & 8) != 0 ? AFwS207S0000000_19.get$arr$(734) : awS153S1100000_4;
        awS103S1000000_19 = (i2 & 16) != 0 ? null : awS103S1000000_19;
        function1 = (i2 & 32) != 0 ? null : function1;
        function12 = (i2 & 64) != 0 ? null : function12;
        z = (i2 & 128) != 0 ? true : z;
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = awS103S1000000_19;
        this.LJFF = function1;
        this.LJI = function12;
        this.LJII = z;
    }
}
