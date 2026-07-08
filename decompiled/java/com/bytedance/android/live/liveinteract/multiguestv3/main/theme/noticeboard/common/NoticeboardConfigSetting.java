package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_board_config")
public final class NoticeboardConfigSetting {
    public static final NoticeboardConfigSetting INSTANCE = new NoticeboardConfigSetting();
    public static final NoticeboardConfig DEFAULT = new NoticeboardConfig("tos-alisg-i-yyebeh8z3m-sg/noticeboard_default_image_1.png", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/noticeboard_default_image_1.png~tplv-0gv1ynv35u-image.image", 30000, 2, 0.0f, 0.4f, 0.3f, 1.0f, 0.0f, 8.0f, true, false, true, 0.85f, 1.15f, true);
    public static final int $stable = 8;

    public static final class NoticeboardConfig {
        public static final TypeAdapter ADAPTER = new NoticeboardConfigSetting_NoticeboardConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("chroma_from")
        public float chromaFrom;

        @C09CT("chroma_to")
        public float chromaTo;

        @C09CT("context_fix")
        public boolean contextFix;

        @C09CT("end_ratio")
        public float endRatio;

        @C09CT("increase_fix")
        public boolean increaseFix;

        @C09CT("lightness_from")
        public float lightnessFrom;

        @C09CT("lightness_to")
        public float lightnessTo;

        @C09CT("merge")
        public float merge;

        @C09CT("playbook_fix")
        public boolean playbookFix;

        @C09CT("recycle_opt")
        public boolean recycleOpt;

        @C09CT("start_ratio")
        public float startRatio;

        @C09CT("strategy")
        public float strategy;

        @C09CT("stub_uri")
        public String stubUri;

        @C09CT("stub_url")
        public String stubUrl;

        @C09CT("time_out")
        public long timeout;

        @C09CT("try_count")
        public long tryCount;

        public NoticeboardConfig() {
            this("tos-alisg-i-yyebeh8z3m-sg/noticeboard_default_image_1.png", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/noticeboard_default_image_1.png~tplv-0gv1ynv35u-image.image", 30000L, 2L, 0.0f, 0.4f, 0.3f, 1.0f, 0.0f, 8.0f, true, false, true, 0.85f, 1.15f, true);
        }

        public NoticeboardConfig(String str, String str2, long j, long j2, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, float f7, float f8, boolean z4) {
            this.stubUri = str;
            this.stubUrl = str2;
            this.timeout = j;
            this.tryCount = j2;
            this.chromaFrom = f;
            this.chromaTo = f2;
            this.lightnessFrom = f3;
            this.lightnessTo = f4;
            this.strategy = f5;
            this.merge = f6;
            this.increaseFix = z;
            this.recycleOpt = z2;
            this.contextFix = z3;
            this.startRatio = f7;
            this.endRatio = f8;
            this.playbookFix = z4;
        }
    }

    public final NoticeboardConfig getSettingValue() {
        return (NoticeboardConfig) SettingsManager.INSTANCE.getValueSafely("multi_guest_board_config", DEFAULT);
    }
}
