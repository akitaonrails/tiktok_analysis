package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PAP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PAP implements C0PWT {
    public final Aweme LL;

    public C0PAP() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PAP) && Intrinsics.LJFF(this.LL, ((C0PAP) obj).LL);
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordInnerFlowConsumeVideoAction(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0PAP.class), AFwS293S0000000_10.get$arr$(137));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PAP(Aweme aweme) {
        this.LL = aweme;
    }
}
