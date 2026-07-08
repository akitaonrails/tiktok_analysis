package X;

import android.graphics.PointF;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0MOG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOG {
    public static String LIZJ(long j) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2);
        int i2 = calendar.get(5);
        calendar.setTimeInMillis(j);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        if (i3 == i && i4 == i2) {
            return new BDDateFormat("ll").LIZIZ(j, Locale.getDefault());
        }
        return new BDDateFormat("MMM YYYY").LIZIZ(j, Locale.getDefault());
    }

    public static void LIZIZ(CreativeModel creativeModel, int i, int i2) {
        if (creativeModel.onThisDayData.isFromOnThisDay() && creativeModel.onThisDayData.getNeedAdjustStickers() && C566870MLd.LIZ(creativeModel.onThisDayData) && i > 0 && i2 > 0) {
            creativeModel.stickerModel.textStickerModels = LIZ(creativeModel.onThisDayData.getTextStyle(), i, creativeModel.stickerModel.textStickerModels, i2, i, i2);
            creativeModel.onThisDayData.setNeedAdjustStickers(false);
        }
    }

    public static List LIZ(int i, int i2, List list, int i3, int i4, int i5) {
        C0MOH c0moh = (C0MOH) ((LinkedHashMap) C576300Miy.LIZ).get(Integer.valueOf(i));
        if (c0moh != null && i2 > 0 && i3 > 0 && i4 > 0 && i5 > 0) {
            PointF pointFLIZ = c0moh.LIZ(i4, i5);
            float f = i2 / 2.0f;
            float f2 = i3 / 2.0f;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TextStickerModel textStickerModel = (TextStickerModel) it2.next();
                if (textStickerModel.getBusinessSource() == C0F7T.ON_THIS_DAY_TITLE) {
                    BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
                    C0MOI c0moi = C0MOH.LIZ;
                    float f3 = i4 * pointFLIZ.x;
                    c0moi.getClass();
                    if (C426750GoL.LJFF()) {
                        f3 = -f3;
                    }
                    arrayList.add(TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, f, f2, 0, 0, 0, 0, i2, i3, i2, i3, false, null, 0.0f, 0.0f, 0.0f, 0.0f, f3, i5 * pointFLIZ.y, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6322273, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
                } else if (textStickerModel.getBusinessSource() == C0F7T.ON_THIS_DAY_TIME) {
                    BaseStickerModel baseStickerModel2 = textStickerModel.getBaseStickerModel();
                    C0MOI c0moi2 = C0MOH.LIZ;
                    float f4 = (i4 * pointFLIZ.x) + c0moh.LIZJ().x;
                    c0moi2.getClass();
                    if (C426750GoL.LJFF()) {
                        f4 = -f4;
                    }
                    arrayList.add(TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(baseStickerModel2, 0, 0, null, 0, 0, f, f2, 0, 0, 0, 0, i2, i3, i2, i3, false, null, 0.0f, 0.0f, 0.0f, 0.0f, f4, (i5 * pointFLIZ.y) + c0moh.LIZJ().y, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6322273, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
                } else {
                    arrayList.add(textStickerModel);
                }
            }
            return arrayList;
        }
        return list;
    }
}
