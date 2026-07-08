package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676610tjP<S> implements InterfaceC1676620tjQ<S> {
    public final S LIZ;
    public final S LIZIZ;

    public final int hashCode() {
        S s = this.LIZ;
        int iHashCode = (s != null ? s.hashCode() : 0) * 31;
        S s2 = this.LIZIZ;
        return iHashCode + (s2 != null ? s2.hashCode() : 0);
    }

    @Override // X.InterfaceC1676620tjQ
    public final S LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1676620tjQ
    public final S LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC1676620tjQ) {
            InterfaceC1676620tjQ interfaceC1676620tjQ = (InterfaceC1676620tjQ) obj;
            if (Intrinsics.LJFF(this.LIZ, interfaceC1676620tjQ.LIZIZ()) && Intrinsics.LJFF(this.LIZIZ, interfaceC1676620tjQ.LIZJ())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1676610tjP(S s, S s2) {
        this.LIZ = s;
        this.LIZIZ = s2;
    }

    @Override // X.InterfaceC1676620tjQ
    public final boolean LIZ(Object obj, Object obj2) {
        if (Intrinsics.LJFF(obj, LIZIZ()) && Intrinsics.LJFF(obj2, LIZJ())) {
            return true;
        }
        return false;
    }
}
