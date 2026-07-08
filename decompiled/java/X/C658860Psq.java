package X;

/* JADX INFO: renamed from: X.0Psq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658860Psq implements InterfaceC0148002o {
    public final EnumC658850Psp LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C658860Psq) && this.LL == ((C658860Psq) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMediaPlayState(simplePlayState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C658860Psq(EnumC658850Psp enumC658850Psp) {
        this.LL = enumC658850Psp;
    }
}
