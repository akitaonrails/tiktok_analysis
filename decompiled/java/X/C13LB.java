package X;

import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13LB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LB implements C14G2 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13LB) && Intrinsics.LJFF(this.LIZ, ((C13LB) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoDebounceAction(debounceKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C13LC<C13A2> c13lcLIZ;
        ITakoContextAbility iTakoContextAbilityLIZIZ = C144I.LIZIZ();
        if (iTakoContextAbilityLIZIZ == null || (c13lcLIZ = ((TakoContextAbilityImpl) iTakoContextAbilityLIZIZ).LIZ()) == null) {
            return;
        }
        c13lcLIZ.LIZ(C13LE.LIZ(C13LB.class), AFwS318S0000000_30.get$arr$(45));
    }

    public C13LB(String str) {
        this.LIZ = str;
    }
}
