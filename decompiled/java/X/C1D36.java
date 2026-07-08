package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D36, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D36 extends C1D3C {
    public final String LIZIZ;
    public final C1D3B LIZJ = new C1D3B(200);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1D36) && Intrinsics.LJFF(this.LIZIZ, ((C1D36) obj).LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsumeModel(eventType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1D36(String str) {
        this.LIZIZ = str;
    }
}
