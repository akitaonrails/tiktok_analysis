package com.bytedance.android.live.wallet.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PopupData {

    @C09CT("scenario_to_display")
    public final Map<String, Boolean> disPlayScenario;

    public PopupData(Map<String, Boolean> map) {
        this.disPlayScenario = map;
    }
}
