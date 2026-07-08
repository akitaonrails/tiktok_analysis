package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982610bg3 extends AbstractC982860bgS {
    public static final /* synthetic */ int LJI = 0;
    public final List<C981870ber> LJ;
    public final EnumC982730bgF LJFF;

    public C982610bg3() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982610bg3)) {
            return false;
        }
        C982610bg3 c982610bg3 = (C982610bg3) obj;
        return Intrinsics.LJFF(this.LJ, c982610bg3.LJ) && this.LJFF == c982610bg3.LJFF && Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        return ((this.LJ.hashCode() * 31) + this.LJFF.hashCode()) * 31;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionInviteResult(teams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", giftPermission=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", giftMeta=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982610bg3(C983250bh5 c983250bh5) {
        List<C981870ber> list = c983250bh5.LJ;
        EnumC982730bgF enumC982730bgF = c983250bh5.LJFF;
        this.LJ = list;
        this.LJFF = enumC982730bgF;
    }
}
