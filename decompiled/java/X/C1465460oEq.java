package X;

import android.app.Activity;
import android.graphics.Point;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Locale;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS566S0100000_22;
import nv7.c0;

/* JADX INFO: renamed from: X.0oEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465460oEq {
    public final Activity LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    public C1465460oEq(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        String nickname;
        String strLIZIZ;
        this.LIZ = c19eg;
        this.LIZIZ = videoPublishEditModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null) {
            nickname = currentUser.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(Calendar.getInstance().getTime());
        if (videoPublishEditModel.creativeModel.changeAvatarModel.isFromSocialAvatar) {
            strLIZIZ = C20642515q3.LJI(2131827094);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((char) 10024);
            sbLIZ2.append(C20642515q3.LJI(2131845022));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LJ = strLIZIZ;
        this.LJFF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 843));
        this.LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(271));
    }

    public static TextStickerData LIZ(C1465460oEq c1465460oEq, String str, float f, float f2, float f3, Integer num, int i, int i2, String[] strArr, TextStickerData.Pair pair, int i3) throws Throwable {
        int i4 = i2;
        TextStickerData.Pair pair2 = pair;
        int i5 = i;
        String[] strArrLJIILJJIL = null;
        if ((i3 & 16) != 0) {
            num = null;
        }
        if ((i3 & 32) != 0) {
            i5 = 2;
        }
        if ((i3 & 64) != 0) {
            i4 = -1;
        }
        if ((i3 & 128) == 0) {
            strArrLJIILJJIL = strArr;
        }
        if ((i3 & 256) != 0) {
            pair2 = new TextStickerData.Pair(Float.valueOf(1.0f), Boolean.TRUE);
        }
        TextStickerData textStickerData = new TextStickerData(str, 1, i4, i5, C1697600uHG.LIZ(2, false), null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, pair2, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -4194336, -1, -1, 4095, null);
        textStickerData.setScale(f3);
        textStickerData.setX(f);
        textStickerData.setY(f2);
        textStickerData.setVideoWidth(C0JAI.LIZJ(c1465460oEq.LIZ));
        textStickerData.setVideoHeight((textStickerData.getVideoWidth() * 16) / 9);
        textStickerData.setLayoutWidth(C0JAI.LIZJ(c1465460oEq.LIZ));
        c0 c0Var = c0.LIZ;
        if (c0Var.LIZJ() == c0Var.LIZIZ()) {
            ((Number) C0MUO.LIZ(c1465460oEq.LIZ).getSecond()).intValue();
        }
        textStickerData.setLayoutHeight((textStickerData.getVideoWidth() * 16.0f) / 9);
        textStickerData.setEditCenterPoint(new Point(C0JAI.LIZJ(c1465460oEq.LIZ) / 2, C0JAI.LIZIZ(c1465460oEq.LIZ) / 2));
        if (num != null) {
            textStickerData.setFontSize(num.intValue());
        }
        if (strArrLJIILJJIL == null) {
            strArrLJIILJJIL = C123P.LJIILJJIL(textStickerData, c1465460oEq.LIZ);
        }
        textStickerData.setTextWrapList(Collections.singletonList(C123P.LIZJ(strArrLJIILJJIL)));
        return textStickerData;
    }
}
