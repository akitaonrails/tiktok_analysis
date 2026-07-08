package X;

import java.io.File;

/* JADX INFO: renamed from: X.123J, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123J extends C123E {
    @Override // X.C123E
    public final String LIZIZ(int i, String str) {
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("text_sticker_");
        sbLIZ2.append(i);
        sbLIZ2.append(".png");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
