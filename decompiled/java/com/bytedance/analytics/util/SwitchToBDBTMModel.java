package com.bytedance.analytics.util;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class SwitchToBDBTMModel implements Serializable {

    @C09CT("tiktok_btm_params_allow_list")
    public final List<String> paramsAllowList;

    @C09CT("tiktok_btm_switch_to_bdbtm_long_chain")
    public final boolean realSwitch;

    @C09CT("tiktok_btm_switch_to_bdbtm")
    public final boolean realSwitch4GlobalProps;

    @C09CT("send_diff_track")
    public final boolean sendDiffTrack;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final boolean f11switch;

    public SwitchToBDBTMModel() {
        this(false, false, false, null, false, 31, null);
    }

    public SwitchToBDBTMModel(boolean z, boolean z2, boolean z3, List<String> list, boolean z4) {
        this.f11switch = z;
        this.realSwitch4GlobalProps = z2;
        this.realSwitch = z3;
        this.paramsAllowList = list;
        this.sendDiffTrack = z4;
    }

    public SwitchToBDBTMModel(boolean z, boolean z2, boolean z3, List list, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? true : z4);
    }
}
