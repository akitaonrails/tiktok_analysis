package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0161, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0161 implements InterfaceC2753014t {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0161) && Intrinsics.LJFF(this.LL, ((AnonymousClass0161) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstanceSource(instanceId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0161(String str) {
        this.LL = str;
    }
}
