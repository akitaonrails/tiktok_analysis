package X;

/* JADX INFO: renamed from: X.1D4A, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D4A {
    public static String LIZ(EnumC1283150jUn enumC1283150jUn, EnumC804650VhP enumC804650VhP) {
        String strLIZIZ;
        if (enumC804650VhP != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC804650VhP.getKey());
            sbLIZ.append("_");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("probe_cache_json");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (enumC1283150jUn == EnumC1283150jUn.GAME) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("game_probe_cache_json");
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return strLIZIZ2;
    }
}
