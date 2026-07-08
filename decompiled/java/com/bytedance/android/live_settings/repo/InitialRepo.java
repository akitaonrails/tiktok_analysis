package com.bytedance.android.live_settings.repo;

import com.bytedance.keva.Keva;

/* JADX INFO: loaded from: classes35.dex */
public class InitialRepo extends BaseRepo {
    public static final InitialRepo INSTANCE = new InitialRepo();

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public String getTag() {
        return "InitialRepo";
    }

    @Override // com.bytedance.android.live_settings.repo.BaseRepo
    public Keva getDataRepo() {
        return Keva.getRepo("live_settings_initial_repo");
    }
}
