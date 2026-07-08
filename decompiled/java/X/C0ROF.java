package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.story.experiment.StoryGuideUploadCardConfigModel;

/* JADX INFO: renamed from: X.0ROF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0ROF {
    public static final C0ROF LIZ = new C0ROF();
    public static final Keva LIZIZ = Keva.getRepo("story_guide_upload_card");
    public static long LIZJ;

    public static void LIZIZ() {
        if (System.currentTimeMillis() - LIZJ < 1000) {
            LIZJ = 0L;
            return;
        }
        LIZJ = System.currentTimeMillis();
        Keva keva = LIZIZ;
        int i = keva.getInt(LIZ("constant_negative_signal_times"), 0) + 1;
        C01GW c01gw = C0ROG.LIZIZ;
        if (i >= ((StoryGuideUploadCardConfigModel) c01gw.getValue()).limitNegativeSignalTimes) {
            keva.storeBoolean(LIZ("shutdown_forever"), true);
            return;
        }
        keva.storeLong(LIZ("offline_until_timestamp"), System.currentTimeMillis() + ((long) (((StoryGuideUploadCardConfigModel) c01gw.getValue()).negativeSignalForbiddenDays * 24 * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT)));
        keva.storeInt(LIZ("constant_negative_signal_times"), i);
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append('-');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
