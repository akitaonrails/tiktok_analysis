package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261920iwY extends AbstractC1261840iwQ<AbstractC1261980iwe> {
    public final AbstractC1261980iwe LLILLJJLI;
    public final C1262090iwp LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    @Override // X.AbstractC1261840iwQ
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1261920iwY)) {
            return false;
        }
        C1261920iwY c1261920iwY = (C1261920iwY) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1261920iwY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1261920iwY.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1261920iwY.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1261920iwY.LLILZIL);
    }

    @Override // X.AbstractC1261840iwQ
    public final int hashCode() {
        return (((((this.LLILLJJLI.hashCode() * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntryAreaItem(element=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1261840iwQ
    public final /* bridge */ /* synthetic */ InterfaceC1262230ix3 LIZIZ() {
        return this.LLILLJJLI;
    }

    public C1261920iwY(AbstractC1261980iwe abstractC1261980iwe, C1262090iwp c1262090iwp, String str, String str2) {
        this.LLILLJJLI = abstractC1261980iwe;
        this.LLILLL = c1262090iwp;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }
}
