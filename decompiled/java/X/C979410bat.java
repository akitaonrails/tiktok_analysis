package X;

/* JADX INFO: renamed from: X.0bat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979410bat {
    public static final String LIZ(int i, String str) {
        if (i == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.PLAY.getValue());
            sbLIZ.append('_');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(EnumC1303240k1C.PLAY.getValue());
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(i);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
