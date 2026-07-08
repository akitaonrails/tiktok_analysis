package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01EI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EI {
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

    public static final String LIZIZ(String str, String str2) {
        if (Intrinsics.LJFF(str2, "")) {
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
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
