package X;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.model.OpeningTimeInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.detail.container.model.PriceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PriceLevel;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179120gn0 extends LinearLayout {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final ViewGroup LLILLL;
    public final C1203310hQ1 LLILZ;
    public final TuxTextView LLILZIL;
    public final LinearLayout LLILZLL;
    public final LinearLayout LLIZ;

    public static Map LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("1", new PoiDetailTagStyle(null, null, "tux://color?token=UIShapeNeutral4&from=poi_header_tag", "tux://color?token=UIText2&from=poi_header_tag"));
        linkedHashMap.put("2", new PoiDetailTagStyle("tux://icon?token=IconDiamond&color=UIShapeTextOnSecondaryMuted4Or5&from=poi_header_tag", null, "tux://color?token=UIShapeSecondaryMuted5&from=poi_header_tag", "tux://color?token=UIShapeTextOnSecondaryMuted4Or5&from=poi_header_tag"));
        linkedHashMap.put("3", new PoiDetailTagStyle(null, "tux://icon?token=IconChevronDown&color=UIText2&from=poi_header_tag", "tux://color?token=UIShapeNeutral4&from=poi_header_tag", "tux://color?token=UIText2&from=poi_header_tag"));
        return linkedHashMap;
    }

    public final TuxTextView LIZIZ(int i) {
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new ViewGroup.MarginLayoutParams(-2, -2));
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

    public C1179120gn0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.e4t, C786410Ut5.ne(context), this);
        this.LL = (TuxTextView) findViewById(R.id.r4z);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.hpq);
        this.LLILLL = (ViewGroup) findViewById(R.id.th6);
        this.LLILZ = (C1203310hQ1) findViewById(R.id.th5);
        this.LLILZIL = (TuxTextView) findViewById(R.id.th3);
        this.LLILZLL = (LinearLayout) findViewById(R.id.pv3);
        this.LLIZ = (LinearLayout) findViewById(R.id.jsq);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1179120gn0.LIZJ(com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle):kotlin.Pair");
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
            LinearLayout linearLayout = this.LLIZ;
            if (linearLayout != null) {
                C786410Ut5.LJJJJJL(linearLayout);
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("card_info_view handleHotelTags  poiId: ");
            sbLIZ.append(poiDiscoveryCard.poiId);
            sbLIZ.append("  poiName: ");
            sbLIZ.append(poiDiscoveryCard.poiName);
            sbLIZ.append("  tagTotalCount: ");
            sbLIZ.append(list.size());
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            Iterator<PoiDetailTag> it2 = list.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    PoiDetailTag next = it2.next();
                    Pair<C19M4, Integer> pairLIZJ = LIZJ(next, mapLJ.get(String.valueOf(next.tagStyle)));
                    C19M4 first = pairLIZJ.getFirst();
                    int iIntValue = pairLIZJ.getSecond().intValue();
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, i2);
                    first.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth = first.getMeasuredWidth();
                    int compoundDrawablePadding = first.getCompoundDrawablePadding();
                    int i5 = measuredWidth + iIntValue + compoundDrawablePadding;
                    TuxTextView tuxTextViewLIZIZ = LIZIZ((list.size() - i3) - 1);
                    tuxTextViewLIZIZ.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = tuxTextViewLIZIZ.getMeasuredWidth();
                    if (i4 + i5 + iLIZIZ + measuredWidth2 <= i) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.rightMargin = iLIZIZ;
                        LinearLayout linearLayout2 = this.LLIZ;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(first, layoutParams);
                        }
                        i4 += i5 + iLIZIZ;
                        i3++;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("card_info_view handleHotelTags  tag: ");
                        sbLIZ2.append(next.tagContent);
                        sbLIZ2.append("  maxWidth: ");
                        sbLIZ2.append(i);
                        sbLIZ2.append("  totalWidth: ");
                        sbLIZ2.append(i4);
                        sbLIZ2.append("  tagViewRealWidth: ");
                        sbLIZ2.append(i5);
                        sbLIZ2.append(" tagViewWidth: ");
                        sbLIZ2.append(measuredWidth);
                        sbLIZ2.append("  drawableWidth: ");
                        sbLIZ2.append(iIntValue);
                        sbLIZ2.append("  drawablePadding: ");
                        sbLIZ2.append(compoundDrawablePadding);
                        sbLIZ2.append("  separatorWidth: ");
                        sbLIZ2.append(iLIZIZ);
                        sbLIZ2.append("  countTextViewWidth: ");
                        sbLIZ2.append(measuredWidth2);
                        sbLIZ2.append("  index: ");
                        sbLIZ2.append(i3);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        i2 = 0;
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("card_info_view handleHotelTags break tag: ");
                        sbLIZ3.append(next.tagContent);
                        sbLIZ3.append("  maxWidth: ");
                        sbLIZ3.append(i);
                        sbLIZ3.append(" totalWidth: ");
                        sbLIZ3.append(i4);
                        sbLIZ3.append("  tagViewRealWidth: ");
                        sbLIZ3.append(i5);
                        sbLIZ3.append("  tagViewWidth: ");
                        sbLIZ3.append(measuredWidth);
                        sbLIZ3.append("  drawableWidth: ");
                        sbLIZ3.append(iIntValue);
                        sbLIZ3.append("  drawablePadding: ");
                        sbLIZ3.append(compoundDrawablePadding);
                        sbLIZ3.append("  separatorWidth: ");
                        sbLIZ3.append(iLIZIZ);
                        sbLIZ3.append("  countTextViewWidth: ");
                        sbLIZ3.append(measuredWidth2);
                        sbLIZ3.append(' ');
                        C2188811AlT.LIZIZ(sbLIZ3);
                        break;
                    }
                } catch (Exception e) {
                    e = e;
                }
            }
            int size = list.size() - i3;
            if (size > 0) {
                TuxTextView tuxTextViewLIZIZ2 = LIZIZ(size);
                LinearLayout linearLayout3 = this.LLIZ;
                if (linearLayout3 != null) {
                    linearLayout3.addView(tuxTextViewLIZIZ2);
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("card_info_view handleHotelTags visible maxWidth: ");
            sbLIZ4.append(i);
            sbLIZ4.append(" totalWidth: ");
            sbLIZ4.append(i4);
            sbLIZ4.append(" remainCount: ");
            sbLIZ4.append(size);
            sbLIZ4.append(' ');
            C2188811AlT.LIZIZ(sbLIZ4);
            LinearLayout linearLayout4 = this.LLIZ;
            if (linearLayout4 != null) {
                C339190DRl.LIZLLL(linearLayout4);
            }
            LinearLayout linearLayout5 = this.LLILZLL;
            if (linearLayout5 != null) {
                C339190DRl.LIZIZ(linearLayout5);
                return;
            }
            return;
        } catch (Exception e2) {
            e = e2;
        }
        TryCatchGuardChecker.doCheck(e);
        C1205490hTX.LIZ.LJ(C1EMR.MAP_MODE_ERR, e);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[Catch: Exception -> 0x00ab, TryCatch #0 {Exception -> 0x00ab, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0011, B:8:0x0014, B:9:0x0028, B:11:0x002e, B:13:0x0073, B:19:0x0080, B:21:0x008a, B:23:0x008e, B:24:0x0091, B:25:0x0092, B:27:0x0096, B:28:0x0099, B:16:0x0079, B:29:0x009c, B:31:0x00a0, B:32:0x00a3, B:34:0x00a7), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[Catch: Exception -> 0x00ab, TryCatch #0 {Exception -> 0x00ab, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0011, B:8:0x0014, B:9:0x0028, B:11:0x002e, B:13:0x0073, B:19:0x0080, B:21:0x008a, B:23:0x008e, B:24:0x0091, B:25:0x0092, B:27:0x0096, B:28:0x0099, B:16:0x0079, B:29:0x009c, B:31:0x00a0, B:32:0x00a3, B:34:0x00a7), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard r16, int r17) {
        /*
            r15 = this;
            r0 = r16
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag> r4 = r0.poiTags     // Catch: java.lang.Exception -> Lab
            if (r4 != 0) goto L7
            return
        L7:
            java.lang.Object r3 = X.C13LP.LJJJLL(r4)     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r3 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r3     // Catch: java.lang.Exception -> Lab
            android.widget.LinearLayout r0 = r15.LLILZLL     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L14
            X.C786410Ut5.LJJJJJL(r0)     // Catch: java.lang.Exception -> Lab
        L14:
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lab
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.lang.Exception -> Lab
            int r14 = X.C814420VxA.LIZIZ(r0)     // Catch: java.lang.Exception -> Lab
            java.util.Iterator r13 = r4.iterator()     // Catch: java.lang.Exception -> Lab
            r1 = 0
            r12 = 0
        L28:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L9c
            java.lang.Object r6 = r13.next()     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r6 = (com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag) r6     // Catch: java.lang.Exception -> Lab
            X.19M4 r2 = r15.LIZLLL(r6)     // Catch: java.lang.Exception -> Lab
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r17
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)     // Catch: java.lang.Exception -> Lab
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)     // Catch: java.lang.Exception -> Lab
            r2.measure(r11, r10)     // Catch: java.lang.Exception -> Lab
            int r9 = r2.getMeasuredWidth()     // Catch: java.lang.Exception -> Lab
            X.19M4 r5 = new X.19M4     // Catch: java.lang.Exception -> Lab
            android.content.Context r8 = r15.getContext()     // Catch: java.lang.Exception -> Lab
            r1 = 0
            r0 = 6
            r5.<init>(r8, r1, r0)     // Catch: java.lang.Exception -> Lab
            r0 = 61
            r5.setTuxFont(r0)     // Catch: java.lang.Exception -> Lab
            r0 = 2131100624(0x7f0603d0, float:1.7813635E38)
            r5.setTextColorRes(r0)     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = " · "
            r5.setText(r0)     // Catch: java.lang.Exception -> Lab
            r5.measure(r11, r10)     // Catch: java.lang.Exception -> Lab
            int r1 = r5.getMeasuredWidth()     // Catch: java.lang.Exception -> Lab
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r3)     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L79
            int r0 = r12 + r9
            int r0 = r0 + r14
            if (r0 <= r7) goto L80
            goto L9c
        L79:
            int r0 = r12 + r9
            int r0 = r0 + r1
            int r0 = r0 + r14
            if (r0 <= r7) goto L80
            goto L9c
        L80:
            java.lang.Object r0 = X.C13LP.LJJJJZI(r4)     // Catch: java.lang.Exception -> Lab
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)     // Catch: java.lang.Exception -> Lab
            if (r0 != 0) goto L92
            android.widget.LinearLayout r0 = r15.LLILZLL     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L91
            r0.addView(r5)     // Catch: java.lang.Exception -> Lab
        L91:
            int r12 = r12 + r1
        L92:
            android.widget.LinearLayout r0 = r15.LLILZLL     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L99
            r0.addView(r2)     // Catch: java.lang.Exception -> Lab
        L99:
            int r12 = r12 + r9
            r1 = 0
            goto L28
        L9c:
            android.widget.LinearLayout r0 = r15.LLILZLL     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto La3
            X.C339190DRl.LIZLLL(r0)     // Catch: java.lang.Exception -> Lab
        La3:
            android.widget.LinearLayout r0 = r15.LLIZ     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto Lb6
            X.C339190DRl.LIZIZ(r0)     // Catch: java.lang.Exception -> Lab
            return
        Lab:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0hTX r1 = X.C1205490hTX.LIZ
            X.1EMR r0 = X.C1EMR.MAP_MODE_ERR
            r1.LJ(r0, r2)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1179120gn0.LJI(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard, int):void");
    }

    public final void LJII(PoiDiscoveryCard poiDiscoveryCard, boolean z, int i, Function0<Unit> function0) {
        float f;
        try {
            TuxTextView tuxTextView = this.LL;
            String strLIZIZ = "";
            if (tuxTextView != null) {
                String str = poiDiscoveryCard.poiName;
                if (str == null) {
                    str = "";
                }
                tuxTextView.setText(str);
            }
            if (z) {
                TuxIconView tuxIconView = this.LLILLJJLI;
                if (tuxIconView != null) {
                    C339190DRl.LIZLLL(tuxIconView);
                }
                TuxIconView tuxIconView2 = this.LLILLJJLI;
                if (tuxIconView2 != null) {
                    C786410Ut5.I7(new AkS87S0100000_18(function0, 46), tuxIconView2);
                }
                if (Intrinsics.LJFF(poiDiscoveryCard.isCollected(), Boolean.TRUE)) {
                    TuxIconView tuxIconView3 = this.LLILLJJLI;
                    if (tuxIconView3 != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1i);
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        tuxIconView3.setTuxIcon(c419910GdJ);
                    }
                } else {
                    TuxIconView tuxIconView4 = this.LLILLJJLI;
                    if (tuxIconView4 != null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_bookmark;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1i);
                        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        tuxIconView4.setTuxIcon(c419910GdJ2);
                    }
                }
            } else {
                TuxIconView tuxIconView5 = this.LLILLJJLI;
                if (tuxIconView5 != null) {
                    C339190DRl.LIZIZ(tuxIconView5);
                }
            }
            if (poiDiscoveryCard.reviewScore != null && poiDiscoveryCard.reviewCount != null && !Intrinsics.LJFF(poiDiscoveryCard.noRating, Boolean.TRUE)) {
                C1203310hQ1 c1203310hQ1 = this.LLILZ;
                float f2 = 0.0f;
                if (c1203310hQ1 != null) {
                    String str2 = poiDiscoveryCard.reviewScore;
                    if (str2 != null) {
                        f = CastFloatProtector.parseFloat(str2);
                    } else {
                        f = 0.0f;
                    }
                    c1203310hQ1.setValue(f);
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                String str3 = poiDiscoveryCard.reviewScore;
                if (str3 != null) {
                    f2 = CastFloatProtector.parseFloat(str3);
                }
                objArr[0] = Float.valueOf(f2);
                String strK4 = C786410Ut5.k4(locale, "%.1f", Arrays.copyOf(objArr, 1));
                String str4 = poiDiscoveryCard.reviewCount;
                if (str4 != null) {
                    long j = CastLongProtector.parseLong(str4);
                    if (j > 0) {
                        strLIZIZ = C1843500y4a.LIZIZ(j);
                    }
                }
                TuxTextView tuxTextView2 = this.LLILZIL;
                if (tuxTextView2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strK4);
                    sbLIZ.append(" (");
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(')');
                    tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                TuxTextView tuxTextView3 = this.LLILZIL;
                if (tuxTextView3 != null) {
                    C426750GoL.LJIIIZ(tuxTextView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, 0, false, 16);
                }
                C339190DRl.LIZLLL(this.LLILLL);
                C339190DRl.LIZLLL(this.LLILZ);
                C339190DRl.LIZLLL(this.LLILZIL);
            } else if (C123100dR.LIZ(poiDiscoveryCard.poiDisplay)) {
                TuxTextView tuxTextView4 = this.LLILZIL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(poiDiscoveryCard.poiDisplay);
                }
                TuxTextView tuxTextView5 = this.LLILZIL;
                if (tuxTextView5 != null) {
                    C426750GoL.LJIIIZ(tuxTextView5, 0, 0, 0, 0, false, 16);
                }
                C339190DRl.LIZLLL(this.LLILLL);
                C339190DRl.LIZLLL(this.LLILZIL);
                C339190DRl.LIZIZ(this.LLILZ);
            } else {
                C339190DRl.LIZIZ(this.LLILLL);
                C339190DRl.LIZIZ(this.LLILZ);
                C339190DRl.LIZIZ(this.LLILZIL);
            }
            if (Intrinsics.LJFF(poiDiscoveryCard.keyCategory, EnumC1177990glB.HOTEL.getCategory())) {
                LJFF(poiDiscoveryCard, i);
            } else {
                LJI(poiDiscoveryCard, i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.MAP_MODE_ERR, e);
        }
    }
}
