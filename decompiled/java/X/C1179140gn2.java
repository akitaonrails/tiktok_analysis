package X;

import android.text.SpannableString;
import com.ss.android.ugc.aweme.poi.detail.container.model.OpeningTimeInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PriceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PriceLevel;

/* JADX INFO: renamed from: X.0gn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179140gn2 {
    public final void LIZ(C19M4 c19m4, C1179160gn4 c1179160gn4) {
        CharSequence charSequence;
        OpeningTimeInfo openingTimeInfo;
        PriceInfo priceInfo;
        PoiDetailTagContent poiDetailTagContent = c1179160gn4.LLILLJJLI.tagContent;
        CharSequence charSequence2 = null;
        priceLevel = null;
        PriceLevel priceLevel = null;
        charSequence = null;
        CharSequence charSequence3 = null;
        if (poiDetailTagContent != null) {
            charSequence = poiDetailTagContent.commonText;
        } else {
            charSequence = null;
        }
        c19m4.setText(charSequence);
        LIZIZ(this, c19m4.getContext(), c19m4, c1179160gn4.LLILLL, c1179160gn4, null, 16);
        int i = c1179160gn4.LLILLJJLI.tagType;
        EnumC1179480gna enumC1179480gna = EnumC1179480gna.POI_DETAIL_TAG_TYPE_PRICE;
        if (i == enumC1179480gna.getValue()) {
            PoiDetailTag poiDetailTag = c1179160gn4.LLILLJJLI;
            PoiDetailTagContent poiDetailTagContent2 = poiDetailTag.tagContent;
            if (poiDetailTagContent2 != null) {
                priceInfo = poiDetailTagContent2.priceInfo;
                if (priceInfo != null) {
                    priceLevel = priceInfo.priceLevel;
                }
            } else {
                priceInfo = null;
            }
            if (poiDetailTag.tagType == enumC1179480gna.getValue()) {
                if (priceInfo != null) {
                    if (priceInfo.priceRange != null) {
                        c19m4.setText(priceInfo.priceRange);
                        return;
                    } else if (priceInfo != null && priceInfo.priceNum != null) {
                        c19m4.setText(priceInfo.priceNum);
                        return;
                    }
                }
                if (priceLevel == null) {
                    return;
                }
                int i2 = priceLevel.totalLevel;
                String strLIZIZ = "";
                int length = 0;
                for (int i3 = 0; i3 < i2; i3++) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(priceLevel.currencySymbol);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (i3 == priceLevel.actualLevel - 1) {
                        length = strLIZIZ.length();
                    }
                }
                int length2 = strLIZIZ.length();
                SpannableString spannableString = new SpannableString(strLIZIZ);
                C786410Ut5.p2(spannableString, new C1192330h8J(), length, length2, 17);
                c19m4.setText(spannableString);
                return;
            }
            return;
        }
        if (c1179160gn4.LLILLJJLI.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_OPENING_TIME.getValue()) {
            PoiDetailTagContent poiDetailTagContent3 = c1179160gn4.LLILLJJLI.tagContent;
            if (poiDetailTagContent3 != null && (openingTimeInfo = poiDetailTagContent3.openingTime) != null) {
                charSequence3 = openingTimeInfo.openingTimeText;
            }
            c19m4.setText(charSequence3);
            c19m4.setTag(1706771800, "hour_bar");
            return;
        }
        if (c1179160gn4.LLILLJJLI.tagType != EnumC1179480gna.POI_DETAIL_TAG_TYPE_CHARTS.getValue()) {
            return;
        }
        PoiDetailTagContent poiDetailTagContent4 = c1179160gn4.LLILLJJLI.tagContent;
        if (poiDetailTagContent4 != null) {
            charSequence2 = poiDetailTagContent4.commonText;
        }
        c19m4.setText(charSequence2);
        c19m4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c19m4.setCompoundDrawablePadding(0);
        c19m4.setTuxFont(82);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1179140gn2 r7, android.content.Context r8, X.C19M4 r9, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle r10, X.C1179160gn4 r11, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r12, int r13) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179140gn2.LIZIZ(X.0gn2, android.content.Context, X.19M4, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle, X.0gn4, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag, int):void");
    }
}
