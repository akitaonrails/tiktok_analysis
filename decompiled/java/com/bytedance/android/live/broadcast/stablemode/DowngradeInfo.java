package com.bytedance.android.live.broadcast.stablemode;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.EnumC642220PGy;
import X.EnumC775860Uc4;
import X.EnumC775890Uc7;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class DowngradeInfo {
    public transient boolean LIZ;

    @C09CT("change_type")
    public String changeType;

    @C09CT("direction")
    public final String direction;

    @C09CT("extra")
    public final Map<String, Object> extra;

    @C09CT("level")
    public final String level;

    @C09CT("prev_level")
    public final String preLevel;

    @C09CT("reason")
    public final List<String> reason;

    @C09CT("target_level")
    public final String targetLevel;

    @C09CT("anchor_stable_mode_host_score")
    public final List<Float> triggerScores;

    public DowngradeInfo() {
        this(null, null, null, null, null, null, null, null, false, 511, null);
    }

    public DowngradeInfo(String str, String str2, String str3, String str4, String str5, List<Float> list, List<String> list2, Map<String, ? extends Object> map, boolean z) {
        this.preLevel = str;
        this.level = str2;
        this.targetLevel = str3;
        this.changeType = str4;
        this.direction = str5;
        this.triggerScores = list;
        this.reason = list2;
        this.extra = map;
        this.LIZ = z;
    }

    public DowngradeInfo(String str, String str2, String str3, String str4, String str5, List list, List list2, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC775860Uc4.NONE.getLevelName() : str, (i & 2) != 0 ? EnumC775860Uc4.NONE.getLevelName() : str2, (i & 4) != 0 ? EnumC775860Uc4.NONE.getLevelName() : str3, (i & 8) != 0 ? EnumC775890Uc7.NO_CHANGE.getChangeTypeName() : str4, (i & 16) != 0 ? EnumC642220PGy.NORMAL.getDirectionName() : str5, (i & 32) != 0 ? C13BV.INSTANCE : list, (i & 64) != 0 ? C13BV.INSTANCE : list2, (i & 128) != 0 ? C2097608Jq.LJ() : map, (i & 256) != 0 ? false : z);
    }
}
