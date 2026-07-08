package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445070nhx extends AbstractC1445140ni4 {
    public final Long LIZIZ;
    public final boolean LIZJ;

    public C1445070nhx() {
        this(null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445070nhx)) {
            return false;
        }
        C1445070nhx c1445070nhx = (C1445070nhx) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1445070nhx.LIZIZ) && this.LIZJ == c1445070nhx.LIZJ;
    }

    public final int hashCode() {
        Long l = this.LIZIZ;
        return ((l == null ? 0 : l.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPageInitiate(editPageTransitionTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needReportEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1445070nhx(Long l, boolean z) {
        super(EnumC1445080nhy.EDIT_PAGE_INITIATE);
        this.LIZIZ = l;
        this.LIZJ = z;
    }
}
