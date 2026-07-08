package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0W9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818570W9f extends AbstractC818580W9g {
    public String LIZ;
    public byte[] LIZIZ;
    public EnumC816340W0q LIZJ;

    /* JADX WARN: Type inference failed for: r3v3, types: [X.0W9e] */
    public final C818560W9e LIZ() {
        String strLIZIZ = "";
        if (this.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(" backendName");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZJ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" priority");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (strLIZIZ.isEmpty()) {
            final String str = this.LIZ;
            final byte[] bArr = this.LIZIZ;
            final EnumC816340W0q enumC816340W0q = this.LIZJ;
            return new AbstractC818550W9d(str, bArr, enumC816340W0q) { // from class: X.0W9e
                public final String LIZ;
                public final byte[] LIZIZ;
                public final EnumC816340W0q LIZJ;

                public final int hashCode() {
                    return ((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.LIZIZ)) * 1000003) ^ this.LIZJ.hashCode();
                }

                @Override // X.AbstractC818550W9d
                public final String LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.AbstractC818550W9d
                public final byte[] LIZJ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC818550W9d
                public final EnumC816340W0q LIZLLL() {
                    return this.LIZJ;
                }

                public final boolean equals(Object obj) {
                    byte[] bArrLIZJ;
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AbstractC818550W9d)) {
                        return false;
                    }
                    AbstractC818550W9d abstractC818550W9d = (AbstractC818550W9d) obj;
                    if (this.LIZ.equals(abstractC818550W9d.LIZIZ())) {
                        byte[] bArr2 = this.LIZIZ;
                        if (abstractC818550W9d instanceof C818560W9e) {
                            bArrLIZJ = ((C818560W9e) abstractC818550W9d).LIZIZ;
                        } else {
                            bArrLIZJ = abstractC818550W9d.LIZJ();
                        }
                        if (Arrays.equals(bArr2, bArrLIZJ) && this.LIZJ.equals(abstractC818550W9d.LIZLLL())) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = bArr;
                    this.LIZJ = enumC816340W0q;
                }
            };
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Missing required properties:");
        sbLIZ3.append(strLIZIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final C818570W9f LIZIZ(String str) {
        if (str != null) {
            this.LIZ = str;
            return this;
        }
        throw new NullPointerException("Null backendName");
    }

    public final C818570W9f LIZJ(EnumC816340W0q enumC816340W0q) {
        if (enumC816340W0q != null) {
            this.LIZJ = enumC816340W0q;
            return this;
        }
        throw new NullPointerException("Null priority");
    }
}
