package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138320fjC extends AbstractC23273099z {
    public static final C1138330fjD LLILLJJLI = new InterfaceC23272099y<C1138320fjC>() { // from class: X.0fjD
    };
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1138320fjC) && Intrinsics.LJFF(this.LL, ((C1138320fjC) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoroutineName(");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1138320fjC(String str) {
        super(LLILLJJLI);
        this.LL = str;
    }
}
