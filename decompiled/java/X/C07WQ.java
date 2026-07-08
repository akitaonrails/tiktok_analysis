package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WQ implements C07WR {
    public final Exception LIZ;
    public final String LIZIZ;

    public C07WQ() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WQ) && Intrinsics.LJFF(this.LIZ, ((C07WQ) obj).LIZ);
    }

    public final int hashCode() {
        Exception exc = this.LIZ;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EncryptionKeyLost(exception=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C07WR
    public final String getName() {
        return this.LIZIZ;
    }

    public C07WQ(Exception exc) {
        this.LIZ = exc;
        this.LIZIZ = "PasswordProviderResult_EncryptionKeyLost";
    }
}
