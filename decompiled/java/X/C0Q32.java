package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q32, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q32 implements C0PWT {
    public final String LL;

    public C0Q32() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Q32) && Intrinsics.LJFF(this.LL, ((C0Q32) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AttachSearchStackAction(stackIdFromEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().R22().LIZIZ(C13LE.LIZ(C0Q32.class), new C0Q31());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0Q32(int i) {
        this("");
    }

    public C0Q32(String str) {
        this.LL = str;
    }
}
