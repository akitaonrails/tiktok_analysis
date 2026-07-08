package X;

import com.ss.android.vesdk.VESize;

/* JADX INFO: renamed from: X.0sPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625690sPH {
    public static final String LIZ(VESize vESize) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(vESize.width);
        sbLIZ.append('x');
        sbLIZ.append(vESize.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downgrade_sticker_preview_resolution_tag ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }
}
