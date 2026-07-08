package X;

import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.144T, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C144T implements C14G2 {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C144T)) {
            return false;
        }
        C144T c144t = (C144T) obj;
        return this.LIZ == c144t.LIZ && this.LIZIZ == c144t.LIZIZ && Intrinsics.LJFF(this.LIZJ, c144t.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c144t.LIZLLL) && Intrinsics.LJFF(this.LJ, c144t.LJ) && Intrinsics.LJFF(this.LJFF, c144t.LJFF);
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBotAction(botId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", botSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", botName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", botAvatar=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", botEnterMethod=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", botProcessId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        ((TakoContextAbilityImpl) C144I.LIZ()).T71().LIZ(C13LE.LIZ(C144T.class), AFwS318S0000000_30.get$arr$(44));
    }

    public C144T(int i, String str, String str2, long j, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
    }
}
