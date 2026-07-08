package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class SchemaPath extends LazyDataBase {

    @C09CT("enable_monitor_jump_token_diff")
    public final int enableCheckJumpTokenDiff;

    @C09CT("report_router_app_log")
    public int reportRouterAppLog;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public int f19switch = 1;

    @C09CT("block_list")
    public List<String> blackList = C13BV.INSTANCE;

    @C09CT("update_btm_page_enabled")
    public int enableUpdateBtmPage = 1;

    @C09CT("call_v2_api")
    public int callV2Api = 1;

    @C09CT("enable_jsb_create_source_btm_token")
    public int enableJsbCreateToken = 1;

    @C09CT("use_on_attach_view_cb")
    public int useOnAttachViewCb = 1;

    @C09CT("call_v2_api_mall")
    public int callV2ApiMall = 1;

    public final List<String> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.blackList, String.class, "block_list");
        this.blackList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "call_v2_api", Integer.valueOf(this.callV2Api));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.callV2Api;
        this.callV2Api = iIntValue;
        return iIntValue;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "call_v2_api_mall", Integer.valueOf(this.callV2ApiMall));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.callV2ApiMall;
        this.callV2ApiMall = iIntValue;
        return iIntValue;
    }

    public final int LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "enable_monitor_jump_token_diff", Integer.valueOf(this.enableCheckJumpTokenDiff));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.enableCheckJumpTokenDiff;
        this.enableCheckJumpTokenDiff = iIntValue;
        return iIntValue;
    }

    public final int LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "update_btm_page_enabled", Integer.valueOf(this.enableUpdateBtmPage));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.enableUpdateBtmPage;
        this.enableUpdateBtmPage = iIntValue;
        return iIntValue;
    }

    public final int LJFF() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "report_router_app_log", Integer.valueOf(this.reportRouterAppLog));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.reportRouterAppLog;
        this.reportRouterAppLog = iIntValue;
        return iIntValue;
    }

    public final int LJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "switch", Integer.valueOf(this.f19switch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.f19switch;
        this.f19switch = iIntValue;
        return iIntValue;
    }
}
