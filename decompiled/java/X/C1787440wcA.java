package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787440wcA implements InterfaceC1787390wc5 {
    public final AtomicBoolean LIZ;
    public final AtomicBoolean LIZIZ;
    public final Set<String> LIZJ;
    public final Set<C1556370qbT> LIZLLL;

    public C1787440wcA() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1787440wcA)) {
            return false;
        }
        C1787440wcA c1787440wcA = (C1787440wcA) obj;
        return Intrinsics.LJFF(this.LIZ, c1787440wcA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1787440wcA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1787440wcA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1787440wcA.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IAPStateImpl(hasNotInit=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPaymentLock=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", processingPayments=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pendingPurchases=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1787390wc5
    public final Set<String> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1787390wc5
    public final AtomicBoolean LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1787390wc5
    public final Set<C1556370qbT> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1787390wc5
    public final AtomicBoolean LIZLLL() {
        return this.LIZ;
    }

    public C1787440wcA(Object obj) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        Set<String> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Set<C1556370qbT> setNewSetFromMap2 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LIZ = atomicBoolean;
        this.LIZIZ = atomicBoolean2;
        this.LIZJ = setNewSetFromMap;
        this.LIZLLL = setNewSetFromMap2;
        C1787430wc9.LIZ = this;
    }
}
