package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.ab.CheckVideoFavoriteCountSettingModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ygW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867020ygW extends C09AY implements Function0<Integer> {
    public C1867020ygW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CheckVideoFavoriteCountSettingModel checkVideoFavoriteCountSettingModel = C1867010ygV.LIZ;
        CheckVideoFavoriteCountSettingModel checkVideoFavoriteCountSettingModel2 = (CheckVideoFavoriteCountSettingModel) settingsManagerLIZLLL.LJIIIIZZ("check_video_favorite_count_setting", CheckVideoFavoriteCountSettingModel.class, checkVideoFavoriteCountSettingModel);
        if (checkVideoFavoriteCountSettingModel2 != null) {
            checkVideoFavoriteCountSettingModel = checkVideoFavoriteCountSettingModel2;
        }
        Integer num = checkVideoFavoriteCountSettingModel.diggThreshold;
        return Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
    }
}
