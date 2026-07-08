package X;

/* JADX INFO: renamed from: X.1DhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2262701DhM {
    public static final /* synthetic */ int LIZ = 0;

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract EnumC868950Y6z LIZJ();

    public abstract String LIZLLL();

    public abstract boolean LJ();

    public abstract boolean LJFF();

    static {
        C2262711DhN c2262711DhN = new C2262711DhN();
        final String str = "";
        c2262711DhN.LIZ = "";
        byte b = (byte) (((byte) (c2262711DhN.LIZJ | 1)) | 2);
        c2262711DhN.LIZJ = b;
        final EnumC868950Y6z enumC868950Y6z = EnumC868950Y6z.READ_AND_WRITE;
        if (enumC868950Y6z == null) {
            throw new NullPointerException("Null filePurpose");
        }
        c2262711DhN.LIZIZ = enumC868950Y6z;
        if (b == 3) {
            new AbstractC2262701DhM(str, enumC868950Y6z) { // from class: X.1DhL
                public final String LIZIZ;
                public final EnumC868950Y6z LIZJ;

                @Override // X.AbstractC2262701DhM
                public final void LIZ() {
                }

                @Override // X.AbstractC2262701DhM
                public final void LIZIZ() {
                }

                @Override // X.AbstractC2262701DhM
                public final boolean LJ() {
                    return false;
                }

                @Override // X.AbstractC2262701DhM
                public final boolean LJFF() {
                    return false;
                }

                public final int hashCode() {
                    return ((((((((((this.LIZIZ.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 0) * 1000003) ^ 0) * 1000003) ^ this.LIZJ.hashCode();
                }

                public final String toString() {
                    return "FileComplianceOptions{fileOwner=" + this.LIZIZ + ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.LIZJ) + "}";
                }

                @Override // X.AbstractC2262701DhM
                public final EnumC868950Y6z LIZJ() {
                    return this.LIZJ;
                }

                @Override // X.AbstractC2262701DhM
                public final String LIZLLL() {
                    return this.LIZIZ;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (obj instanceof AbstractC2262701DhM) {
                        AbstractC2262701DhM abstractC2262701DhM = (AbstractC2262701DhM) obj;
                        if (this.LIZIZ.equals(abstractC2262701DhM.LIZLLL()) && !abstractC2262701DhM.LJ() && !abstractC2262701DhM.LJFF()) {
                            abstractC2262701DhM.LIZ();
                            abstractC2262701DhM.LIZIZ();
                            if (this.LIZJ.equals(abstractC2262701DhM.LIZJ())) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }

                {
                    this.LIZIZ = str;
                    this.LIZJ = enumC868950Y6z;
                }
            };
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (c2262711DhN.LIZ == null) {
            sb.append(" fileOwner");
        }
        if ((c2262711DhN.LIZJ & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((c2262711DhN.LIZJ & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (c2262711DhN.LIZIZ == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
