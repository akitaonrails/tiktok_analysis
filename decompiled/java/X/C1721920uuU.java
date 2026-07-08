package X;

/* JADX INFO: renamed from: X.0uuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721920uuU implements InterfaceC0148002o {
    public final EnumC1721900uuS LL;
    public final EnumC488160JCk LLILLJJLI;

    public C1721920uuU() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721920uuU)) {
            return false;
        }
        C1721920uuU c1721920uuU = (C1721920uuU) obj;
        return this.LL == c1721920uuU.LL && this.LLILLJJLI == c1721920uuU.LLILLJJLI;
    }

    public final int hashCode() {
        EnumC1721900uuS enumC1721900uuS = this.LL;
        int iHashCode = (enumC1721900uuS == null ? 0 : enumC1721900uuS.hashCode()) * 31;
        EnumC488160JCk enumC488160JCk = this.LLILLJJLI;
        return iHashCode + (enumC488160JCk != null ? enumC488160JCk.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QrCodeState(orderStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1721920uuU(EnumC1721900uuS enumC1721900uuS, EnumC488160JCk enumC488160JCk) {
        this.LL = enumC1721900uuS;
        this.LLILLJJLI = enumC488160JCk;
    }

    public static C1721920uuU LIZ(C1721920uuU c1721920uuU, EnumC1721900uuS enumC1721900uuS, EnumC488160JCk enumC488160JCk, int i) {
        if ((i & 1) != 0) {
            enumC1721900uuS = c1721920uuU.LL;
        }
        if ((i & 2) != 0) {
            enumC488160JCk = c1721920uuU.LLILLJJLI;
        }
        c1721920uuU.getClass();
        return new C1721920uuU(enumC1721900uuS, enumC488160JCk);
    }
}
