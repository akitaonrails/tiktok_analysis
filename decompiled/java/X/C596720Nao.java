package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596720Nao extends AbstractC596640Nag implements InterfaceC596930Nb9 {
    public final Throwable LIZIZ;

    @Override // X.InterfaceC596930Nb9
    public final boolean LIZIZ() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C596720Nao) && Intrinsics.LJFF(this.LIZIZ, ((C596720Nao) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnknownError(throwable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC596930Nb9
    public final String LIZ() {
        return this.LIZIZ.getMessage();
    }

    public C596720Nao(Throwable th) {
        super("unknown_error");
        this.LIZIZ = th;
    }
}
