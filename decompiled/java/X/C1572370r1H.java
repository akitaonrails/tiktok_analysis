package X;

import com.ss.android.ugc.aweme.vibefeed.feed.component.VibeRetentionComponent;

/* JADX INFO: renamed from: X.0r1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572370r1H {
    public static boolean LIZ() {
        if (C1576040r7C.LIZ() && C1576040r7C.LJFF().skipRetentionPopupFreq) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_retention_popup_");
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        sbLIZ.append(strLIZ);
        return !VibeRetentionComponent.LLILZLL.getValue().getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_retention_popup_");
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        sbLIZ.append(strLIZ);
        VibeRetentionComponent.LLILZLL.getValue().storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }
}
