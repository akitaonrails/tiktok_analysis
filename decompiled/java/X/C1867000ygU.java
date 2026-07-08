package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.ab.CheckVideoFavoriteCountSettingModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ygU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867000ygU extends C09AY implements Function0<Boolean> {
    public C1867000ygU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CheckVideoFavoriteCountSettingModel checkVideoFavoriteCountSettingModel = C1867010ygV.LIZ;
        CheckVideoFavoriteCountSettingModel checkVideoFavoriteCountSettingModel2 = (CheckVideoFavoriteCountSettingModel) settingsManagerLIZLLL.LJIIIIZZ("check_video_favorite_count_setting", CheckVideoFavoriteCountSettingModel.class, checkVideoFavoriteCountSettingModel);
        if (checkVideoFavoriteCountSettingModel2 != null) {
            checkVideoFavoriteCountSettingModel = checkVideoFavoriteCountSettingModel2;
        }
        Boolean bool = checkVideoFavoriteCountSettingModel.enable;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
