package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05VT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05VT extends C0M8P {
    public final String LIZIZ;

    public C05VT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05VT) && Intrinsics.LJFF(this.LIZIZ, ((C05VT) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DismissPreview(exitReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05VT(String str) {
        super(false);
        this.LIZIZ = str;
    }

    public /* synthetic */ C05VT(int i) {
        this("back");
    }
}
