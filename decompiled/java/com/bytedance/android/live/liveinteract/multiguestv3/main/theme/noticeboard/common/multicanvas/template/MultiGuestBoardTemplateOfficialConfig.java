package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestBoardTemplateOfficialConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("max_edit_text")
    public long maxEditText;

    @C09CT("render_mill_second_internal")
    public long renderMillSecondInternal;

    @C09CT("tos_mill_second_internal")
    public long tosMillSecondInternal;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestBoardTemplateOfficialConfig_OptTypeAdapter();
    }

    public MultiGuestBoardTemplateOfficialConfig() {
        this(2000L, 500L, 999L);
    }

    public MultiGuestBoardTemplateOfficialConfig(long j, long j2, long j3) {
        this.renderMillSecondInternal = j;
        this.tosMillSecondInternal = j2;
        this.maxEditText = j3;
    }
}
