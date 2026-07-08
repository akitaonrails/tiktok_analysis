package com.bytedance.android.live_settings.repo;

import X.C1152340g5o;
import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.DataCenter;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class SettingsRepo extends BaseRepo {
    public static final Map<String, Keva> REPO_CACHE = new HashMap();
    public static final SettingsRepo INSTANCE = new SettingsRepo();

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "SettingsRepo";
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepo("live_settings_repo");
    }

    public void loadSplitRepos() {
        for (ScopeValue scopeValue : ScopeValue.values()) {
            realGetDataRepo(scopeValue);
        }
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public boolean contains(String str) {
        if (super.contains(str)) {
            return true;
        }
        ScopeValue scopeValueByKey = DataCenter.getScopeValueByKey(str);
        if (scopeValueByKey == null) {
            return false;
        }
        return realGetDataRepo(scopeValueByKey).contains(str);
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepoByScope(ScopeValue scopeValue) {
        String str;
        switch (C1152340g5o.LIZ[scopeValue.ordinal()]) {
            case 1:
                str = "live-linkmic-repo";
                break;
            case 2:
                str = "live-broadcast-repo";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                str = "live-watchlive-repo";
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                str = "live-revenue-repo";
                break;
            default:
                str = "live-default";
                break;
        }
        return Keva.getRepo(str);
    }
}
