package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QNF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNF {
    public static final boolean LIZJ(SearchSugEntity searchSugEntity) {
        SugExtraInfo sugExtraInfo;
        if (searchSugEntity == null || (sugExtraInfo = searchSugEntity.sugExtraInfo) == null || !sugExtraInfo.isRichSug()) {
            return false;
        }
        return true;
    }

    public static final String LIZLLL(SearchSugEntity searchSugEntity) {
        if (LIZJ(searchSugEntity)) {
            return "enrich_sug";
        }
        return "normal_sug";
    }

    public static final CharSequence LIZ(SearchSugEntity searchSugEntity, Context context) {
        boolean z;
        SpannableString spannableString;
        C01GW c01gw = C257940A8y.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str2 = searchSugEntity.content;
            if (str2 != null) {
                str = str2;
            }
            List<Position> listLIZ = searchSugEntity.LIZ();
            if (listLIZ == null) {
                listLIZ = new ArrayList<>();
            }
            SpannableString spannableString2 = new SpannableString(str);
            if (((Number) c01gw.getValue()).intValue() != 0 && ((Number) C301210BrL.LIZ.getValue()).intValue() == 0) {
                C786410Ut5.p2(spannableString2, new MetricAffectingSpan() { // from class: X.0Hce
                    @Override // android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        if (textPaint == null) {
                            return;
                        }
                        updateMeasureState(textPaint);
                    }

                    @Override // android.text.style.MetricAffectingSpan
                    public final void updateMeasureState(TextPaint textPaint) {
                        textPaint.setTypeface(C1697580uHE.LIZIZ(0.0f, 600, 17.0f, 0.0f, Float.valueOf(17.0f), 0.0f, 0, null, 224));
                    }
                }, 0, spannableString2.length(), 17);
            }
            if (context != null && !TextUtils.isEmpty(str) && !C086I.LIZIZ(listLIZ)) {
                for (Position position : listLIZ) {
                    if (position != null) {
                        int begin = position.getBegin();
                        int end = position.getEnd() + 1;
                        int iMax = Math.max(0, begin);
                        if (!TextUtils.isEmpty(spannableString2) && iMax <= end && iMax < spannableString2.length() && end <= spannableString2.length()) {
                            C786410Ut5.p2(spannableString2, new ForegroundColorSpan(C475630Ikz.LIZIZ(R.attr.a1h, context)), iMax, end, 17);
                        }
                    }
                }
            }
            spannableStringBuilder.append((CharSequence) spannableString2);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        String str3 = searchSugEntity.content;
        List<Position> listLIZ2 = searchSugEntity.LIZ();
        if (str3 != null) {
            str = str3;
        }
        if (context != null && !TextUtils.isEmpty(str) && listLIZ2 != null) {
            spannableString = new SpannableString(str);
            boolean z2 = !C286100BJg.LIZ();
            for (Position position2 : listLIZ2) {
                if (position2 != null) {
                    if (z2) {
                        C345900DhE.LIZ(spannableString, position2.getBegin(), position2.getEnd() + 1);
                    }
                    int begin2 = position2.getBegin();
                    int end2 = position2.getEnd() + 1;
                    int iLIZ = C960203pA.LIZ(R.attr.a1h, context);
                    int iMax2 = Math.max(0, begin2);
                    if (!TextUtils.isEmpty(spannableString) && iMax2 <= end2 && iMax2 < spannableString.length() && end2 <= spannableString.length()) {
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZ), iMax2, end2, 17);
                    }
                }
            }
        } else {
            spannableString = new SpannableString(str);
        }
        spannableStringBuilder2.append((CharSequence) spannableString);
        return spannableStringBuilder2;
    }

    public static final CharSequence LIZIZ(SearchSugEntity searchSugEntity, Context context) {
        String userRelationType;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (searchSugEntity.sugExtraInfo.isVerifiedUser() || searchSugEntity.sugExtraInfo.isBrandShop()) {
            spannableStringBuilder.append((CharSequence) " T");
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_verified_badge;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 1), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 33);
        }
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null) {
            userRelationType = sugExtraInfo.getUserRelationType();
        } else {
            userRelationType = null;
        }
        String strLIZIZ = C317770Ccx.LIZIZ(context, userRelationType);
        if (strLIZIZ.length() > 0) {
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) strLIZIZ);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1k, context)), (spannableStringBuilder.length() - 3) - strLIZIZ.length(), spannableStringBuilder.length(), 33);
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length() - strLIZIZ.length();
            int length2 = spannableStringBuilder.length();
            C786410Ut5.q2(spannableStringBuilder, styleSpan, length, length2, 17);
            C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, 13, Resources.getSystem().getDisplayMetrics())), length, length2, 18);
        }
        return spannableStringBuilder;
    }
}
