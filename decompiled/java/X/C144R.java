package X;

import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.144R, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C144R implements C14G2 {
    public final C0PHT LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C144R) && Intrinsics.LJFF(this.LIZ, ((C144R) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoStreamBindingAction(streamRoot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        ((TakoContextAbilityImpl) C144I.LIZ()).rg1().LIZ(C13LE.LIZ(C144R.class), AFwS318S0000000_30.get$arr$(51));
    }

    public C144R(C0PHT c0pht) {
        this.LIZ = c0pht;
    }
}
