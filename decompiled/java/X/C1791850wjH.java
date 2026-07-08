package X;

/* JADX INFO: renamed from: X.0wjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791850wjH {
    public final EnumC1792040wja LIZ;
    public final String LIZIZ;

    public C1791850wjH(EnumC1792040wja enumC1792040wja) {
        this.LIZ = enumC1792040wja;
        C1152610g6F c1152610g6F = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJIIIIZZ;
        c1152610g6F.LIZ();
        String strLIZIZ = c1152610g6F.LIZJ.iapExternalErrorMsgMapping.get(String.valueOf(enumC1792040wja.getValue()));
        if (strLIZIZ == null || strLIZIZ.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("map_external_error_code_failed_");
            sbLIZ.append(enumC1792040wja.getValue());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZIZ = strLIZIZ;
    }
}
