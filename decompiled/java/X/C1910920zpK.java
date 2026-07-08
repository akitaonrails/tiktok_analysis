package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.choosemusic.settings.CommercialMusicPageInfo;

/* JADX INFO: renamed from: X.0zpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910920zpK {
    public static final CommercialMusicPageInfo LIZ = new CommercialMusicPageInfo(null);

    public static String LIZ() {
        CommercialMusicPageInfo commercialMusicPageInfo = LIZ;
        try {
            commercialMusicPageInfo = (CommercialMusicPageInfo) SettingsManager.LIZLLL().LJIIIIZZ("tt_commercial_music_info", CommercialMusicPageInfo.class, commercialMusicPageInfo);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (commercialMusicPageInfo != null) {
            return commercialMusicPageInfo.commercialMusicSchema;
        }
        return null;
    }
}
