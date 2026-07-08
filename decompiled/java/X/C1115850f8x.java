package X;

import java.util.UUID;

/* JADX INFO: renamed from: X.0f8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115850f8x {
    public final EnumC1115870f8z LIZ;
    public final C1115940f96 LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarketingData(identifier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", model=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1115850f8x(EnumC1115870f8z enumC1115870f8z, C1115940f96 c1115940f96, long j) {
        String string = UUID.randomUUID().toString();
        this.LIZ = enumC1115870f8z;
        this.LIZIZ = c1115940f96;
        this.LIZJ = j;
        this.LIZLLL = string;
    }
}
