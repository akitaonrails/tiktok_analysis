package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Xks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857760Xks {
    public static final void LIZ(String str) {
        C201955140j.LJII(C830690WiJ.LIZIZ, str);
        C1AF0.LIZJ(str);
    }

    public static final void LIZJ(Map map) {
        C201955140j.LJII(C830690WiJ.LIZIZ, "caption_text_compat");
        C1AF0.LIZLLL("caption_text_compat", map);
    }

    public static final void LIZIZ(Throwable th, Map map) {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleIllegalVideoDesc");
        sbLIZ.append(' ');
        sbLIZ.append(map);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        C1AF0.LJI(th, "handleIllegalVideoDesc", map);
    }
}
