package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.PastMemoryTextFontConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Mix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576290Mix {
    public static final C576290Mix LIZ = new C576290Mix();
    public static final PastMemoryTextFontConfig LIZIZ = new PastMemoryTextFontConfig(null, null, null, null, null, 31, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(32));

    public static Map LIZIZ() {
        C01GW c01gw = LIZJ;
        if (((PastMemoryTextFontConfig) c01gw.getValue()).useClassicTextStyleLang.contains(LIZ())) {
            return ((PastMemoryTextFontConfig) c01gw.getValue()).specialDefaultFontMap;
        }
        Map<Integer, String> map = ((PastMemoryTextFontConfig) c01gw.getValue()).languageCode2FontMap.get(LIZ());
        return map == null ? ((PastMemoryTextFontConfig) c01gw.getValue()).defaultFontMap : map;
    }

    public static String LIZ() {
        String strLIZ;
        IAVSettingService iAVSettingService = (IAVSettingService) ServiceManager.get().getService(IAVSettingService.class);
        if (iAVSettingService != null) {
            C844470XAv.LIZ.getClass();
            InterfaceC1910030znt currentI18nItem = iAVSettingService.getCurrentI18nItem(C844470XAv.LIZ());
            if (currentI18nItem != null && (strLIZ = currentI18nItem.LIZ()) != null) {
                return strLIZ;
            }
        }
        return "";
    }
}
