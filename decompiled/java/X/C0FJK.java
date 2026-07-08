package X;

import com.ss.android.ugc.aweme.experiment.TextStickerFollowAppLanguageConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FJK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJK {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(EffectChannelResponse effectChannelResponse, String str) {
        List<Effect> totalEffects;
        if (!Intrinsics.LJFF(str, "language_text_font")) {
            return effectChannelResponse.getAllCategoryEffects();
        }
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) LIZ(C0CHQ.LIZ().getAppLanguage(), effectChannelResponse.getCategoryResponseList(), AFwS234S0000000_5.get$arr$(430));
        if (effectCategoryResponse != null && (totalEffects = effectCategoryResponse.getTotalEffects()) != null) {
            return totalEffects;
        }
        return C13BV.INSTANCE;
    }

    public static Object LIZ(String str, List list, Function1 function1) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str2 = ((TextStickerFollowAppLanguageConfig) C0FJL.LIZIZ.getValue()).suffix;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lowerCase);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "text_sticker_default_category_suffix", "", true);
        if (strLJJ != null) {
            str3 = strLJJ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("default");
        sbLIZ2.append(str3);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        for (Object obj5 : list) {
            Object objInvoke = function1.invoke(obj5);
            if (Intrinsics.LJFF(objInvoke, strLIZIZ)) {
                obj = obj5;
                if (obj5 != null) {
                    break;
                }
            } else if (Intrinsics.LJFF(objInvoke, lowerCase)) {
                obj2 = obj5;
            } else if (Intrinsics.LJFF(objInvoke, strLIZIZ2)) {
                obj3 = obj5;
            } else if (Intrinsics.LJFF(objInvoke, "default")) {
                obj4 = obj5;
            }
        }
        if (obj != null) {
            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("use category with [languageWithSuffix] key=");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" languageKey=");
            sbLIZ3.append(lowerCase);
            sbLIZ3.append(" languageSuffix=");
            sbLIZ3.append(str2);
            sbLIZ3.append(" defaultSuffix=");
            sbLIZ3.append(str3);
            C201955140j.LJIILJJIL(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ3));
            return obj;
        }
        if (obj2 != null) {
            C1465490oEt c1465490oEt2 = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("use category with [language] key=");
            sbLIZ4.append(lowerCase);
            sbLIZ4.append(" languageKey=");
            sbLIZ4.append(lowerCase);
            sbLIZ4.append(" languageSuffix=");
            sbLIZ4.append(str2);
            sbLIZ4.append(" defaultSuffix=");
            sbLIZ4.append(str3);
            C201955140j.LJIILJJIL(c1465490oEt2, C2188811AlT.LIZIZ(sbLIZ4));
            return obj2;
        }
        if (obj3 != null) {
            C1465490oEt c1465490oEt3 = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("use category with [defaultWithSuffix] key=");
            sbLIZ5.append(strLIZIZ2);
            sbLIZ5.append(" languageKey=");
            sbLIZ5.append(lowerCase);
            sbLIZ5.append(" languageSuffix=");
            sbLIZ5.append(str2);
            sbLIZ5.append(" defaultSuffix=");
            sbLIZ5.append(str3);
            C201955140j.LJIILJJIL(c1465490oEt3, C2188811AlT.LIZIZ(sbLIZ5));
            return obj3;
        }
        if (obj4 == null) {
            return null;
        }
        C1465490oEt c1465490oEt4 = C1465490oEt.LIZIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("use category with [default] key=default languageKey=");
        sbLIZ6.append(lowerCase);
        sbLIZ6.append(" languageSuffix=");
        sbLIZ6.append(str2);
        sbLIZ6.append(" defaultSuffix=");
        sbLIZ6.append(str3);
        C201955140j.LJIILJJIL(c1465490oEt4, C2188811AlT.LIZIZ(sbLIZ6));
        return obj4;
    }
}
