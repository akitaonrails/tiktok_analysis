package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.094N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C094N<T> {
    public static final C094O LIZIZ = new C094O();
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return LIZLLL(this.LIZ);
    }

    public /* synthetic */ C094N(Object obj) {
        this.LIZ = obj;
    }

    public static final Throwable LIZ(Object obj) {
        C094M c094m;
        if (!(obj instanceof C094M) || (c094m = (C094M) obj) == null) {
            return null;
        }
        return c094m.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T LIZIZ(Object obj) {
        if (obj instanceof C094O) {
            return null;
        }
        return obj;
    }

    public static final void LIZJ(Object obj) throws Throwable {
        Throwable th;
        if (!(obj instanceof C094O)) {
            return;
        }
        if ((obj instanceof C094M) && (th = ((C094M) obj).LIZ) != null) {
            throw th;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Trying to call 'getOrThrow' on a failed channel result: ");
        sbLIZ.append(obj);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static String LIZLLL(Object obj) {
        if (obj instanceof C094M) {
            return ((C094M) obj).toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Value(");
        sbLIZ.append(obj);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.LIZ;
        if (!(obj instanceof C094N) || !Intrinsics.LJFF(obj2, ((C094N) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
