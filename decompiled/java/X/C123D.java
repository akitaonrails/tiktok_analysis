package X;

import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.123D, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123D extends C123E {
    public final String LIZ = "caption_sticker_";
    public int LIZIZ = -1;

    @Override // X.C123E
    public final String LIZIZ(int i, String str) {
        if (i == -1) {
            i = this.LIZIZ + 1;
        }
        this.LIZIZ = i;
        String str2 = File.separator;
        if (!u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(".png");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
