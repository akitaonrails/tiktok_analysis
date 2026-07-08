package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560370LyN extends C0M8P {
    public final C19A3 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C560370LyN) && Intrinsics.LJFF(this.LIZIZ, ((C560370LyN) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnResume(groupScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C560370LyN(C19A3 c19a3) {
        super(false);
        this.LIZIZ = c19a3;
    }
}
