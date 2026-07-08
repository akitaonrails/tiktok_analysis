package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693610uAp {
    public static final /* synthetic */ C1693610uAp LIZ = new C1693610uAp();

    public static InterfaceC1693670uAv LIZIZ(final long j) {
        if (j != 16) {
            return new InterfaceC1693670uAv(j) { // from class: X.0uAr
                public final long LIZIZ;

                @Override // X.InterfaceC1693670uAv
                public final /* synthetic */ InterfaceC1693670uAv LJ(InterfaceC1693670uAv interfaceC1693670uAv) {
                    return C1693680uAw.LIZ(this, interfaceC1693670uAv);
                }

                @Override // X.InterfaceC1693670uAv
                public final AbstractC1668700tWe LJFF() {
                    return null;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1693630uAr) && C1685910tyP.LJ(this.LIZIZ, ((C1693630uAr) obj).LIZIZ);
                }

                public final int hashCode() {
                    return C1685910tyP.LJIIJ(this.LIZIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ColorStyle(value=");
                    sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZIZ));
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1693670uAv
                public final float LIZ() {
                    return C1685910tyP.LJFF(this.LIZIZ);
                }

                @Override // X.InterfaceC1693670uAv
                public final long LIZJ() {
                    return this.LIZIZ;
                }

                {
                    this.LIZIZ = j;
                    if (j == 16) {
                        C1681000tqU.LIZ("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
                    }
                }

                @Override // X.InterfaceC1693670uAv
                public final InterfaceC1693670uAv LIZLLL(Function0 function0) {
                    if (!Intrinsics.LJFF(this, C1693710uAz.LIZIZ)) {
                        return this;
                    }
                    return (InterfaceC1693670uAv) function0.invoke();
                }
            };
        }
        return C1693710uAz.LIZIZ;
    }

    public static InterfaceC1693670uAv LIZ(float f, AbstractC1668700tWe abstractC1668700tWe) {
        if (abstractC1668700tWe == null) {
            return C1693710uAz.LIZIZ;
        }
        if (abstractC1668700tWe instanceof C1680950tqP) {
            return LIZIZ(C1683270tu9.LIZ(f, ((C1680950tqP) abstractC1668700tWe).LIZIZ));
        }
        if (abstractC1668700tWe instanceof AbstractC1682800ttO) {
            return new C1693620uAq((AbstractC1682800ttO) abstractC1668700tWe, f);
        }
        throw new C1954807lC();
    }
}
