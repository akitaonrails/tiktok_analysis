package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1232804s2 implements InterfaceC1233004s4 {
    public final String LIZ;
    public final Function0<CharSequence> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1232804s2)) {
            return false;
        }
        C1232804s2 c1232804s2 = (C1232804s2) obj;
        return Intrinsics.LJFF(this.LIZ, c1232804s2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1232804s2.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(messageUuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", getText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1233004s4
    public final String LIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1232804s2(String str, Function0<? extends CharSequence> function0) {
        this.LIZ = str;
        this.LIZIZ = function0;
    }
}
