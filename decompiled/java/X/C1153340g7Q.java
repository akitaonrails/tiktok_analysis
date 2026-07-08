package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153340g7Q extends AbstractC1153360g7S {
    public final String LLILLJJLI;

    public C1153340g7Q() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1153340g7Q) && Intrinsics.LJFF(this.LLILLJJLI, ((C1153340g7Q) obj).LLILLJJLI);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IsInActive(string=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1153360g7S, X.InterfaceC1606880ruw
    public final String getString() {
        return this.LLILLJJLI;
    }

    public C1153340g7Q(int i) {
        super("is_inactive");
        this.LLILLJJLI = "is_inactive";
    }
}
