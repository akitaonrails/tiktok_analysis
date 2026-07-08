package X;

import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MX2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MX2 extends C0MX3 {
    public final PortraitStyleItem LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MX2)) {
            return false;
        }
        C0MX2 c0mx2 = (C0MX2) obj;
        return Intrinsics.LJFF(this.LIZ, c0mx2.LIZ) && this.LIZIZ == c0mx2.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StyleItem(style=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0MX3
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.C0MX3
    public final int LIZIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0MX2(com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.LIZ = r3
            r2.LIZIZ = r4
            java.lang.String r0 = r3.styleId
            if (r0 == 0) goto L20
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L30
        L20:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "index_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
        L30:
            r2.LIZJ = r0
            r0 = 1
            r2.LIZLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MX2.<init>(com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem, int):void");
    }
}
