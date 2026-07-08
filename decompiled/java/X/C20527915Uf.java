package X;

/* JADX INFO: renamed from: X.15Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20527915Uf {
    public static EnumC20527415Ua LIZ(EnumC20527415Ua enumC20527415Ua) {
        if (enumC20527415Ua == null) {
            return EnumC20527415Ua.FIRST_LIGHT_WEIGHT;
        }
        int i = C20527815Ue.LIZ[enumC20527415Ua.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC20527415Ua.SECOND_FULL_DATA;
                }
                throw new C1954807lC();
            }
            return EnumC20527415Ua.SECOND_FULL_DATA;
        }
        return EnumC20527415Ua.FIRST_FULL_DATA;
    }
}
