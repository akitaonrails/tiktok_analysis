package X;

/* JADX INFO: renamed from: X.0OId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617050OId {
    public final boolean LIZIZ(int i) {
        if (LIZ(this, i) == EnumC617060OIe.IDENTITY_CREATOR) {
            return true;
        }
        return false;
    }

    public static EnumC617060OIe LIZ(C617050OId c617050OId, int i) {
        EnumC617060OIe enumC617060OIe = EnumC617060OIe.INVALID;
        c617050OId.getClass();
        EnumC617060OIe enumC617060OIe2 = EnumC617060OIe.typeCache.get(Integer.valueOf(i));
        if (enumC617060OIe2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[WARN] unknown IdentityType: ");
            sbLIZ.append(i);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return enumC617060OIe;
        }
        return enumC617060OIe2;
    }
}
