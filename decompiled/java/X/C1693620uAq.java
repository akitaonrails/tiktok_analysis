package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693620uAq implements InterfaceC1693670uAv {
    public final AbstractC1682800ttO LIZIZ;
    public final float LIZJ;

    @Override // X.InterfaceC1693670uAv
    public final /* synthetic */ InterfaceC1693670uAv LJ(InterfaceC1693670uAv interfaceC1693670uAv) {
        return C1693680uAw.LIZ(this, interfaceC1693670uAv);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693620uAq)) {
            return false;
        }
        C1693620uAq c1693620uAq = (C1693620uAq) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1693620uAq.LIZIZ) && Float.compare(this.LIZJ, c1693620uAq.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrushStyle(value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1693670uAv
    public final long LIZJ() {
        int i = C1685910tyP.LJIIJJI;
        return C1685910tyP.LJIIJ;
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZJ);
    }

    @Override // X.InterfaceC1693670uAv
    public final float LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1693670uAv
    public final AbstractC1668700tWe LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1693670uAv
    public final InterfaceC1693670uAv LIZLLL(Function0 function0) {
        if (!Intrinsics.LJFF(this, C1693710uAz.LIZIZ)) {
            return this;
        }
        return (InterfaceC1693670uAv) function0.invoke();
    }

    public C1693620uAq(AbstractC1682800ttO abstractC1682800ttO, float f) {
        this.LIZIZ = abstractC1682800ttO;
        this.LIZJ = f;
    }
}
