package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class TextHeaderMockConfig {
    public static final TypeAdapter ADAPTER = new TextHeaderMockConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("data_mock")
    public boolean dataMock;

    @C09CT("font_mock")
    public boolean fontMock;

    @C09CT("key_board_mock")
    public boolean keyBoardMock;

    @C09CT("remove_guide_limit")
    public boolean removeGuideLimit;

    public TextHeaderMockConfig() {
        this(false, false, false, false);
    }

    public TextHeaderMockConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.dataMock = z;
        this.removeGuideLimit = z2;
        this.fontMock = z3;
        this.keyBoardMock = z4;
    }
}
