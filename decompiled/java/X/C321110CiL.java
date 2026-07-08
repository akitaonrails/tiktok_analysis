package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321110CiL {
    public final EnumC320720Chi LIZ;
    public final List<Message> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final Exception LJI;
    public final C321240CiY LJII;

    public C321110CiL() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321110CiL)) {
            return false;
        }
        C321110CiL c321110CiL = (C321110CiL) obj;
        return this.LIZ == c321110CiL.LIZ && Intrinsics.LJFF(this.LIZIZ, c321110CiL.LIZIZ) && this.LIZJ == c321110CiL.LIZJ && this.LIZLLL == c321110CiL.LIZLLL && this.LJ == c321110CiL.LJ && this.LJFF == c321110CiL.LJFF && Intrinsics.LJFF(this.LJI, c321110CiL.LJI) && Intrinsics.LJFF(this.LJII, c321110CiL.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31;
        Exception exc = this.LJI;
        return ((iHashCode + (exc == null ? 0 : exc.hashCode())) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageListUpdate(updateType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messages=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loadingMore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loadFailed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", e=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", commonInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C321110CiL(EnumC320720Chi enumC320720Chi, List list, boolean z, boolean z2, boolean z3, int i, Exception exc, C321240CiY c321240CiY, int i2) {
        z = (i2 & 4) != 0 ? true : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        z3 = (i2 & 16) != 0 ? false : z3;
        i = (i2 & 32) != 0 ? 0 : i;
        InterfaceC320970Ci7 interfaceC320970Ci7 = null;
        Object[] objArr = 0;
        exc = (i2 & 64) != 0 ? null : exc;
        c321240CiY = (i2 & 128) != 0 ? new C321240CiY(interfaceC320970Ci7, objArr == true ? 1 : 0, 63) : c321240CiY;
        this.LIZ = enumC320720Chi;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = i;
        this.LJI = exc;
        this.LJII = c321240CiY;
    }
}
