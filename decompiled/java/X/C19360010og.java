package X;

/* JADX INFO: renamed from: X.10og, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19360010og {
    public final C19371210qU<EnumC19359910of> LIZ = new C19371210qU<>();
    public final C19371210qU<EnumC19359710od> LIZIZ = new C19371210qU<>();
    public EnumC1284950jXh LIZJ = EnumC1284950jXh.TYPE_DEFAULT;
    public boolean LIZLLL;

    public final EnumC1284950jXh LIZ() {
        EnumC1284950jXh enumC1284950jXh;
        EnumC1284950jXh enumC1284950jXh2;
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            EnumC19359910of enumC19359910of = this.LIZ.LIZ;
            int i = enumC19359910of == null ? -1 : C19359810oe.LIZ[enumC19359910of.ordinal()];
            if (i == -1) {
                enumC1284950jXh = EnumC1284950jXh.TYPE_DEFAULT;
            } else if (i == 1) {
                enumC1284950jXh = EnumC1284950jXh.TYPE_LOW;
            } else if (i == 2) {
                enumC1284950jXh = EnumC1284950jXh.TYPE_DEFAULT;
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                enumC1284950jXh = EnumC1284950jXh.TYPE_HIGH;
            }
            this.LIZJ = enumC1284950jXh;
            EnumC19359710od enumC19359710od = this.LIZIZ.LIZ;
            if (enumC19359710od != null) {
                int i2 = C19359810oe.LIZIZ[enumC19359710od.ordinal()];
                if (i2 == 1) {
                    enumC1284950jXh2 = EnumC1284950jXh.TYPE_LOW;
                } else if (i2 == 2) {
                    enumC1284950jXh2 = EnumC1284950jXh.TYPE_DEFAULT;
                } else {
                    if (i2 != 3) {
                        throw new C1954807lC();
                    }
                    enumC1284950jXh2 = EnumC1284950jXh.TYPE_HIGH;
                }
                this.LIZJ = enumC1284950jXh2;
            }
        }
        return this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameBitrateTableConfig(realType=");
        sbLIZ.append(LIZ());
        sbLIZ.append(", complexityType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", businessType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
