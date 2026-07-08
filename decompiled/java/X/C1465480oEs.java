package X;

import android.app.Activity;
import android.graphics.Point;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: renamed from: X.0oEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465480oEs {
    public final String LIZ;
    public final String LIZIZ;

    public C1465480oEs() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        sbLIZ.append(currentUser != null ? currentUser.getNickname() : null);
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = new BDDateFormat("M/D/YYYY").LIZIZ(System.currentTimeMillis(), Locale.getDefault());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x031f  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LIZIZ(android.app.Activity r45, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r46, java.lang.String r47) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465480oEs.LIZIZ(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String):java.util.List");
    }

    public static TextStickerData LIZ(C1465480oEs c1465480oEs, Activity activity, String str, float f, float f2, float f3, Integer num, int i, int i2, String[] strArr, TextStickerData.Pair pair, int i3) throws Throwable {
        TextStickerData.Pair pair2 = pair;
        int i4 = i2;
        int i5 = i;
        String[] strArrLJIILJJIL = null;
        if ((i3 & 32) != 0) {
            num = null;
        }
        if ((i3 & 64) != 0) {
            i5 = 1;
        }
        if ((i3 & 128) != 0) {
            i4 = -1;
        }
        if ((i3 & 256) == 0) {
            strArrLJIILJJIL = strArr;
        }
        if ((i3 & 512) != 0) {
            pair2 = new TextStickerData.Pair(Float.valueOf(1.0f), Boolean.TRUE);
        }
        c1465480oEs.getClass();
        TextStickerData textStickerData = new TextStickerData(str, 1, i4, i5, C1697600uHG.LIZ(2, false), null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, pair2, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -4194336, -1, -1, 4095, null);
        textStickerData.setScale(f3);
        textStickerData.setX(f);
        textStickerData.setY(f2);
        textStickerData.setEditCenterPoint(new Point(C0JAI.LIZJ(activity) / 2, C0JAI.LIZIZ(activity) / 2));
        if (num != null) {
            textStickerData.setFontSize(num.intValue());
        }
        if (strArrLJIILJJIL == null) {
            strArrLJIILJJIL = C123P.LJIILJJIL(textStickerData, activity);
        }
        textStickerData.setTextWrapList(Collections.singletonList(C123P.LIZJ(strArrLJIILJJIL)));
        return textStickerData;
    }
}
