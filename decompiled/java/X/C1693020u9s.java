package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693020u9s extends AbstractC1693010u9r {
    public final String LIZ;
    public final C1693060u9w LIZIZ;
    public final InterfaceC1693170uA7 LIZJ;

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1693060u9w c1693060u9w = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1693060u9w != null ? c1693060u9w.hashCode() : 0)) * 31;
        InterfaceC1693170uA7 interfaceC1693170uA7 = this.LIZJ;
        return iHashCode2 + (interfaceC1693170uA7 != null ? interfaceC1693170uA7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkAnnotation.Clickable(tag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1693010u9r
    public final InterfaceC1693170uA7 LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1693010u9r
    public final C1693060u9w LIZIZ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693020u9s)) {
            return false;
        }
        C1693020u9s c1693020u9s = (C1693020u9s) obj;
        if (Intrinsics.LJFF(this.LIZ, c1693020u9s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1693020u9s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1693020u9s.LIZJ)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C1693020u9s(String str, InterfaceC1693170uA7 interfaceC1693170uA7) {
        this(str, null, interfaceC1693170uA7);
    }

    public C1693020u9s(String str, C1693060u9w c1693060u9w, InterfaceC1693170uA7 interfaceC1693170uA7) {
        this.LIZ = str;
        this.LIZIZ = c1693060u9w;
        this.LIZJ = interfaceC1693170uA7;
    }
}
