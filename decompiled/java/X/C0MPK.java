package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0MPK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MPK {
    public static boolean LJ() {
        return ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService().showMvThemeRecordMode();
    }

    public static String LIZ(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIZI(creativeInfo, "");
    }

    public static String LIZIZ(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIL(creativeInfo);
    }

    public static String LIZJ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleDateFormat.format(time));
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZLLL(MvThemeData mvThemeData) {
        Effect effect;
        if (mvThemeData == null || (effect = mvThemeData.effect) == null || C580130Mp9.LIZ(effect.getTags())) {
            return false;
        }
        return mvThemeData.effect.getTags().contains("NeedServerAlgorithm");
    }
}
