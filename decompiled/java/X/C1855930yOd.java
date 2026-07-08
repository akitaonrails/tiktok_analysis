package X;

import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855930yOd implements C14G2 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1855930yOd) && Intrinsics.LJFF(this.LIZ, ((C1855930yOd) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoConversationAction(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        ((TakoContextAbilityImpl) C144I.LIZ()).T71().LIZ(C13LE.LIZ(C1855930yOd.class), AFwS314S0000000_27.get$arr$(27));
    }

    public C1855930yOd(String str) {
        this.LIZ = str;
    }
}
