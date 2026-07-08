package X;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.model.OpeningTimeInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.detail.container.model.PriceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PriceLevel;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179130gn1 extends FrameLayout {
    public final TuxTextView LL;
    public final ViewGroup LLILLJJLI;
    public final C1203310hQ1 LLILLL;
    public final TuxTextView LLILZ;
    public final LinearLayout LLILZIL;
    public final LinearLayout LLILZLL;

    public static Map LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("1", new PoiDetailTagStyle(null, null, "tux://color?token=UIShapeNeutral4&from=poi_header_tag", "tux://color?token=UIText2&from=poi_header_tag"));
        linkedHashMap.put("2", new PoiDetailTagStyle("tux://icon?token=IconDiamond&color=UIShapeTextOnSecondaryMuted4Or5&from=poi_header_tag", null, "tux://color?token=UIShapeSecondaryMuted5&from=poi_header_tag", "tux://color?token=UIShapeTextOnSecondaryMuted4Or5&from=poi_header_tag"));
        linkedHashMap.put("3", new PoiDetailTagStyle(null, "tux://icon?token=IconChevronDown&color=UIText2&from=poi_header_tag", "tux://color?token=UIShapeNeutral4&from=poi_header_tag", "tux://color?token=UIText2&from=poi_header_tag"));
        return linkedHashMap;
    }

    public final TuxTextView LIZIZ(int i) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = iLIZIZ;
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.a1j);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, getContext());
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        tuxTextView.setBackground(c384050F3z.LIZ(getContext()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('+');
        sbLIZ.append(i);
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        return tuxTextView;
    }

    public final C19M4 LIZLLL(PoiDetailTag poiDetailTag) {
        String str;
        OpeningTimeInfo openingTimeInfo;
        String str2 = null;
        C19M4 c19m4 = new C19M4(getContext(), null, 6);
        c19m4.setTuxFont(61);
        c19m4.setTextColorRes(R.attr.a1j);
        PoiDetailTagContent poiDetailTagContent = poiDetailTag.tagContent;
        if (poiDetailTagContent != null) {
            str = poiDetailTagContent.commonText;
        } else {
            str = null;
        }
        c19m4.setText(str);
        if (poiDetailTag.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_PRICE.getValue()) {
            LIZ(c19m4, poiDetailTag);
        } else if (poiDetailTag.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_OPENING_TIME.getValue()) {
            PoiDetailTagContent poiDetailTagContent2 = poiDetailTag.tagContent;
            if (poiDetailTagContent2 != null && (openingTimeInfo = poiDetailTagContent2.openingTime) != null) {
                str2 = openingTimeInfo.openingTimeText;
            }
            c19m4.setText(str2);
            return c19m4;
        }
        return c19m4;
    }

    public C1179130gn1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.e0z, C786410Ut5.ne(context), this);
        this.LL = (TuxTextView) findViewById(R.id.r4z);
        this.LLILLJJLI = (ViewGroup) findViewById(R.id.th6);
        this.LLILLL = (C1203310hQ1) findViewById(R.id.th5);
        this.LLILZ = (TuxTextView) findViewById(R.id.th3);
        this.LLILZIL = (LinearLayout) findViewById(R.id.pv3);
        this.LLILZLL = (LinearLayout) findViewById(R.id.jsq);
    }

    public static void LIZ(C19M4 c19m4, PoiDetailTag poiDetailTag) {
        PriceInfo priceInfo;
        PoiDetailTagContent poiDetailTagContent = poiDetailTag.tagContent;
        PriceLevel priceLevel = null;
        if (poiDetailTagContent != null) {
            priceInfo = poiDetailTagContent.priceInfo;
            if (priceInfo != null) {
                priceLevel = priceInfo.priceLevel;
            }
        } else {
            priceInfo = null;
        }
        if (poiDetailTag.tagType != EnumC1179480gna.POI_DETAIL_TAG_TYPE_PRICE.getValue()) {
            return;
        }
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
        int i = priceLevel.totalLevel;
        String strLIZIZ = "";
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(priceLevel.currencySymbol);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (i2 == priceLevel.actualLevel - 1) {
                length = strLIZIZ.length();
            }
        }
        int length2 = strLIZIZ.length();
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new C1192330h8J(), length, length2, 17);
        c19m4.setText(spannableString);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103 A[PHI: r10
      0x0103: PHI (r10v2 int) = (r10v0 int), (r10v3 int), (r10v3 int) binds: [B:26:0x0094, B:37:0x00f9, B:46:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<X.C19M4, java.lang.Integer> LIZJ(com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r14, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle r15) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179130gn1.LIZJ(com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle):kotlin.Pair");
    }

    public final void LJFF(PoiDiscoveryCard poiDiscoveryCard, int i) {
        try {
            List<PoiDetailTag> list = poiDiscoveryCard.poiTags;
            if (list == null) {
                return;
            }
            Map<String, PoiDetailTagStyle> mapLJ = poiDiscoveryCard.poiDetailTagStyleMap;
            if (mapLJ == null) {
                mapLJ = LJ();
            }
            LinearLayout linearLayout = this.LLILZLL;
            if (linearLayout != null) {
                C786410Ut5.LJJJJJL(linearLayout);
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            int i2 = 0;
            int i3 = 0;
            for (PoiDetailTag poiDetailTag : list) {
                Pair<C19M4, Integer> pairLIZJ = LIZJ(poiDetailTag, mapLJ.get(String.valueOf(poiDetailTag.tagStyle)));
                C19M4 first = pairLIZJ.getFirst();
                int iIntValue = pairLIZJ.getSecond().intValue();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                first.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = first.getMeasuredWidth() + iIntValue + first.getCompoundDrawablePadding();
                TuxTextView tuxTextViewLIZIZ = LIZIZ((list.size() - i2) - 1);
                tuxTextViewLIZIZ.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                if (i3 + measuredWidth + iLIZIZ + tuxTextViewLIZIZ.getMeasuredWidth() + iLIZIZ + iLIZIZ > i) {
                    break;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.rightMargin = iLIZIZ;
                LinearLayout linearLayout2 = this.LLILZLL;
                if (linearLayout2 != null) {
                    linearLayout2.addView(first, layoutParams);
                }
                i3 += measuredWidth + iLIZIZ;
                i2++;
            }
            int size = list.size() - i2;
            if (size > 0) {
                TuxTextView tuxTextViewLIZIZ2 = LIZIZ(size);
                LinearLayout linearLayout3 = this.LLILZLL;
                if (linearLayout3 != null) {
                    linearLayout3.addView(tuxTextViewLIZIZ2);
                }
            }
            LinearLayout linearLayout4 = this.LLILZLL;
            if (linearLayout4 != null) {
                C339190DRl.LIZLLL(linearLayout4);
            }
            LinearLayout linearLayout5 = this.LLILZIL;
            if (linearLayout5 != null) {
                C339190DRl.LIZIZ(linearLayout5);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.YMAL_ERR, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0011, B:8:0x0014, B:9:0x001a, B:11:0x0020, B:13:0x0065, B:19:0x0070, B:21:0x007a, B:23:0x007e, B:24:0x0081, B:25:0x0082, B:27:0x0086, B:28:0x0089, B:16:0x006a, B:29:0x008b, B:31:0x008f, B:32:0x0092, B:34:0x0096), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0011, B:8:0x0014, B:9:0x001a, B:11:0x0020, B:13:0x0065, B:19:0x0070, B:21:0x007a, B:23:0x007e, B:24:0x0081, B:25:0x0082, B:27:0x0086, B:28:0x0089, B:16:0x006a, B:29:0x008b, B:31:0x008f, B:32:0x0092, B:34:0x0096), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard r16, int r17) {
        /*
            r15 = this;
            r0 = r16
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag> r5 = r0.poiTags     // Catch: java.lang.Exception -> L9a
            if (r5 != 0) goto L7
            return
        L7:
            java.lang.Object r4 = X.C13LP.LJJJLL(r5)     // Catch: java.lang.Exception -> L9a
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r4 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r4     // Catch: java.lang.Exception -> L9a
            android.widget.LinearLayout r0 = r15.LLILZIL     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L14
            X.C786410Ut5.LJJJJJL(r0)     // Catch: java.lang.Exception -> L9a
        L14:
            java.util.Iterator r14 = r5.iterator()     // Catch: java.lang.Exception -> L9a
            r3 = 0
            r13 = 0
        L1a:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L8b
            java.lang.Object r7 = r14.next()     // Catch: java.lang.Exception -> L9a
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r7 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r7     // Catch: java.lang.Exception -> L9a
            X.19M4 r2 = r15.LIZLLL(r7)     // Catch: java.lang.Exception -> L9a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r17
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)     // Catch: java.lang.Exception -> L9a
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)     // Catch: java.lang.Exception -> L9a
            r2.measure(r11, r10)     // Catch: java.lang.Exception -> L9a
            int r12 = r2.getMeasuredWidth()     // Catch: java.lang.Exception -> L9a
            X.19M4 r6 = new X.19M4     // Catch: java.lang.Exception -> L9a
            android.content.Context r9 = r15.getContext()     // Catch: java.lang.Exception -> L9a
            r1 = 0
            r0 = 6
            r6.<init>(r9, r1, r0)     // Catch: java.lang.Exception -> L9a
            r0 = 61
            r6.setTuxFont(r0)     // Catch: java.lang.Exception -> L9a
            r0 = 2131100624(0x7f0603d0, float:1.7813635E38)
            r6.setTextColorRes(r0)     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = " · "
            r6.setText(r0)     // Catch: java.lang.Exception -> L9a
            r6.measure(r11, r10)     // Catch: java.lang.Exception -> L9a
            int r1 = r6.getMeasuredWidth()     // Catch: java.lang.Exception -> L9a
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r4)     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L6a
            int r0 = r13 + r12
            if (r0 <= r8) goto L70
            goto L8b
        L6a:
            int r0 = r13 + r12
            int r0 = r0 + r1
            if (r0 <= r8) goto L70
            goto L8b
        L70:
            java.lang.Object r0 = X.C13LP.LJJJLL(r5)     // Catch: java.lang.Exception -> L9a
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)     // Catch: java.lang.Exception -> L9a
            if (r0 != 0) goto L82
            android.widget.LinearLayout r0 = r15.LLILZIL     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L81
            r0.addView(r6)     // Catch: java.lang.Exception -> L9a
        L81:
            int r13 = r13 + r1
        L82:
            android.widget.LinearLayout r0 = r15.LLILZIL     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L89
            r0.addView(r2)     // Catch: java.lang.Exception -> L9a
        L89:
            int r13 = r13 + r12
            goto L1a
        L8b:
            android.widget.LinearLayout r0 = r15.LLILZIL     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L92
            X.C339190DRl.LIZLLL(r0)     // Catch: java.lang.Exception -> L9a
        L92:
            android.widget.LinearLayout r0 = r15.LLILZLL     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto La5
            X.C339190DRl.LIZIZ(r0)     // Catch: java.lang.Exception -> L9a
            return
        L9a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0hTX r1 = X.C1205490hTX.LIZ
            X.1EMR r0 = X.C1EMR.YMAL_ERR
            r1.LJ(r0, r2)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179130gn1.LJI(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard, int):void");
    }
}
