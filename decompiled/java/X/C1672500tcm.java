package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0tcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672500tcm implements InterfaceC1680710tq1 {
    public final InterfaceC1631620sYq<InterfaceC1680960tqQ, C1680770tq7, EnumC1671200tag, Unit> LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1672500tcm(InterfaceC1631620sYq<? super InterfaceC1680960tqQ, ? super C1680770tq7, ? super EnumC1671200tag, Unit> interfaceC1631620sYq) {
        this.LIZ = interfaceC1631620sYq;
    }

    public final boolean equals(Object obj) {
        C1672500tcm c1672500tcm;
        if (this == obj) {
            return true;
        }
        InterfaceC1631620sYq<InterfaceC1680960tqQ, C1680770tq7, EnumC1671200tag, Unit> interfaceC1631620sYq = null;
        if ((obj instanceof C1672500tcm) && (c1672500tcm = (C1672500tcm) obj) != null) {
            interfaceC1631620sYq = c1672500tcm.LIZ;
        }
        if (interfaceC1631620sYq == this.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1680710tq1
    public final AbstractC1680810tqB LIZ(long j, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o) {
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        this.LIZ.invoke(c1695950uEbLIZ, new C1680770tq7(j), enumC1671200tag);
        c1695950uEbLIZ.close();
        return new C1680800tqA(c1695950uEbLIZ);
    }
}
