package X;

/* JADX INFO: renamed from: X.0OOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618820OOy {
    public static EnumC618810OOx LIZ(C618820OOy c618820OOy, int i) {
        EnumC618810OOx enumC618810OOx = EnumC618810OOx.NONE;
        c618820OOy.getClass();
        EnumC618810OOx enumC618810OOx2 = EnumC618810OOx.typeCache.get(Integer.valueOf(i));
        if (enumC618810OOx2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[WARN] unknown ItemType: ");
            sbLIZ.append(i);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return enumC618810OOx;
        }
        return enumC618810OOx2;
    }
}
