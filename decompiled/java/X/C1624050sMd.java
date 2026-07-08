package X;

import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;

/* JADX INFO: renamed from: X.0sMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624050sMd {
    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZ(InterfaceC1623190sLF interfaceC1623190sLF) {
        String str;
        if (!C1621950sJF.LIZ() || interfaceC1623190sLF == null) {
            return null;
        }
        StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) interfaceC1623190sLF.AG().getValue();
        if (stickerTagChangeData != null) {
            str = stickerTagChangeData.tabName;
        } else {
            str = null;
        }
        if (!interfaceC1623190sLF.isShowing() || str == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prop_panel_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
