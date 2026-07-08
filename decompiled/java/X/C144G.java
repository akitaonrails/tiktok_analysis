package X;

import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.144G, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C144G implements C14G2 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C144G)) {
            return false;
        }
        C144G c144g = (C144G) obj;
        return Intrinsics.LJFF(this.LIZ, c144g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c144g.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c144g.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoProcessIdUpdateAction(newProcessId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newTakoSessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", newTakoChatId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        ((TakoContextAbilityImpl) C144I.LIZ()).T71().LIZ(C13LE.LIZ(C144G.class), AFwS318S0000000_30.get$arr$(49));
    }

    public C144G(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
