package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.story.experiment.celebration.CelebrationStickerFontConfig;
import com.ss.android.ugc.aweme.story.experiment.celebration.StoryCelebrationConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.064U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C064U {
    public static final C064U LIZ = new C064U();
    public static final StoryCelebrationConfig LIZIZ = new StoryCelebrationConfig(null, null, null, 7, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1073));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1074));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1075));

    public static String LIZJ() {
        C01GW c01gw = LJ;
        if (((CelebrationStickerFontConfig) c01gw.getValue()).getUseClassicTextStyleLang().contains(LIZ())) {
            return ((CelebrationStickerFontConfig) c01gw.getValue()).getClassicFont();
        }
        String str = ((CelebrationStickerFontConfig) c01gw.getValue()).getLanguageCode2FontMap().get(LIZ());
        return str == null ? ((CelebrationStickerFontConfig) c01gw.getValue()).getDefaultFont() : str;
    }

    public static String LIZ() {
        String strLIZ;
        IAVSettingService iAVSettingService = (IAVSettingService) ServiceManager.get().getService(IAVSettingService.class);
        if (iAVSettingService == null) {
            return "";
        }
        C844470XAv.LIZ.getClass();
        InterfaceC1910030znt currentI18nItem = iAVSettingService.getCurrentI18nItem(C844470XAv.LIZ());
        return (currentI18nItem == null || (strLIZ = currentI18nItem.LIZ()) == null) ? "" : strLIZ;
    }

    public static List LIZIZ(Integer num) {
        return (List) ((Map) LIZLLL.getValue()).get(String.valueOf(num));
    }
}
