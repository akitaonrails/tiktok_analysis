package X;

/* JADX INFO: renamed from: X.0iel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250890iel {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(EnumC1584360rKc enumC1584360rKc, EnumC1253890ijb enumC1253890ijb, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC1584360rKc.getKey());
            sbLIZ.append("_tab_");
            sbLIZ.append(enumC1253890ijb.getValue());
            sbLIZ.append('_');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(enumC1584360rKc.getKey());
        sbLIZ2.append("_tab_");
        sbLIZ2.append(enumC1253890ijb.getValue());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
