package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915890ZwR {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public EnumC356420DyC LIZIZ;

    static {
        new C915900ZwS();
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayTraceNode{fromPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nodeState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(C915890ZwR.class, cls) && Intrinsics.LJFF(this.LIZ, ((C915890ZwR) obj).LIZ)) {
            return true;
        }
        return false;
    }

    public C915890ZwR(String str, EnumC356420DyC enumC356420DyC) {
        this.LIZ = str;
        this.LIZIZ = enumC356420DyC;
    }
}
