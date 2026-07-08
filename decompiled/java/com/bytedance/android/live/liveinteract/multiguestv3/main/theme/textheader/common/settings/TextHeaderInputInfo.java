package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes32.dex */
public final class TextHeaderInputInfo {
    public static final TypeAdapter ADAPTER = new TextHeaderInputInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("add_default_shadow_when_no_stroke")
    public boolean addDefaultShadowWhenNoStroke;

    @C09CT("fix_selection_direction")
    public boolean fixSelectionDirection;

    @C09CT("fix_text_header_display_bug")
    public boolean fixTextHeaderDisplayBug;

    @C09CT("max_char_count_limit")
    public int maxCharCountLimit;

    @C09CT("max_lines_count_limit")
    public int maxLinesCountLimit;

    @C09CT("not_measure_by_self")
    public boolean notMeasureBySelf;

    @C09CT("recommend_default_max_text_size")
    public float recommendDefMaxTextSize;

    @C09CT("stroke_multiple_size")
    public float strokeMultipleSize;

    public TextHeaderInputInfo() {
        this(32, 2, true, 2.0f, true, 18.0f, true, true);
    }

    public TextHeaderInputInfo(int i, int i2, boolean z, float f, boolean z2, float f2, boolean z3, boolean z4) {
        this.maxCharCountLimit = i;
        this.maxLinesCountLimit = i2;
        this.notMeasureBySelf = z;
        this.strokeMultipleSize = f;
        this.fixSelectionDirection = z2;
        this.recommendDefMaxTextSize = f2;
        this.fixTextHeaderDisplayBug = z3;
        this.addDefaultShadowWhenNoStroke = z4;
    }
}
