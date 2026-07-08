package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TranslateSearchDesc;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.Set;

/* JADX INFO: renamed from: X.0Q5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664730Q5n {
    public static final C664730Q5n LIZ = new C664730Q5n();

    @InterfaceC1294060jmO
    public static Set LIZIZ() {
        String strLLIIZ;
        String[] strArrLL;
        ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
        if (iTranslationService == null || (strLLIIZ = iTranslationService.LLIIZ()) == null) {
            strLLIIZ = "en";
        }
        Set setLJ = C093Y.LJ(strLLIIZ);
        if (iTranslationService == null || (strArrLL = iTranslationService.LL()) == null) {
            strArrLL = new String[0];
        }
        for (String str : strArrLL) {
            setLJ.add(str);
        }
        return setLJ;
    }

    public static String LIZJ() {
        String strLLIIZ;
        ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
        return (iTranslationService == null || (strLLIIZ = iTranslationService.LLIIZ()) == null) ? "en" : strLLIIZ;
    }

    public static boolean LIZ(Aweme aweme) {
        ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
        if (iTranslationService == null) {
            return false;
        }
        String strLLIIZ = iTranslationService.LLIIZ();
        if (C20702515zj.LIZJ(aweme, strLLIIZ) == null && !iTranslationService.LJJIIZ(aweme, strLLIIZ)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(String str) {
        if (str == null) {
            return false;
        }
        return !LIZIZ().contains(str);
    }

    public static boolean LJFF(Aweme aweme) {
        String strLJIIIZ = C20703515zt.LJIIIZ(aweme);
        C0Q5W.LIZ.getClass();
        if (C0Q5W.LIZIZ() && LIZ(aweme) && LIZLLL(strLJIIIZ)) {
            return true;
        }
        return false;
    }

    public static String LJ(Aweme aweme, TranslateSearchDesc translateSearchDesc) {
        String str;
        String str2;
        String str3 = null;
        if (aweme == null) {
            return null;
        }
        if (translateSearchDesc != null) {
            str = translateSearchDesc.originLanguage;
        } else {
            str = null;
        }
        if (!C123100dR.LIZ(str)) {
            str = null;
        }
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(" searchDesc ");
            if (translateSearchDesc != null) {
                str3 = translateSearchDesc.originLanguage;
            }
            sbLIZ.append(str3);
            sbLIZ.append(" found 👍");
            C2188811AlT.LIZIZ(sbLIZ);
            return str;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(aweme.getAid());
        sbLIZ2.append(" searchDesc ");
        if (translateSearchDesc != null) {
            str2 = translateSearchDesc.originLanguage;
        } else {
            str2 = null;
        }
        sbLIZ2.append(str2);
        sbLIZ2.append(" desc ");
        sbLIZ2.append(aweme.getDescLanguage());
        sbLIZ2.append(" 🌚");
        C2188811AlT.LIZIZ(sbLIZ2);
        String descLanguage = aweme.getDescLanguage();
        if (!C123100dR.LIZ(descLanguage) || descLanguage == null) {
            return null;
        }
        return descLanguage;
    }
}
