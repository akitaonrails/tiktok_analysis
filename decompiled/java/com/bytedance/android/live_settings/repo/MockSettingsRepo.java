package com.bytedance.android.live_settings.repo;

import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes35.dex */
public class MockSettingsRepo extends BaseRepo {
    public static final MockSettingsRepo INSTANCE = new MockSettingsRepo();

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "MockSettingsRepo";
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepo("live_mock_settings_repo");
    }
}
