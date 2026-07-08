package X;

import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.144J, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C144J implements C14G2 {
    public final long LIZ = 0;
    public final String LIZIZ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C144J)) {
            return false;
        }
        C144J c144j = (C144J) obj;
        return this.LIZ == c144j.LIZ && Intrinsics.LJFF(this.LIZIZ, c144j.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoModeAction(actionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subProcessId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        ((TakoContextAbilityImpl) C144I.LIZ()).T71().LIZ(C13LE.LIZ(C144J.class), AFwS318S0000000_30.get$arr$(48));
    }
}
