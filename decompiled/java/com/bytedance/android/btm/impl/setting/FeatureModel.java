package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C1972007ny;
import com.bytedance.android.btm.api.config.BcmChainInLogger;
import com.bytedance.android.btm.api.config.LoggerBackupAddBtm;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class FeatureModel extends LazyDataBase {

    @C09CT("aLog")
    public int aLog;

    @C09CT("add_debug_to_bcm_chain")
    public int addDebugToBcmChain;

    @C09CT("add_debug_to_event")
    public int addDebugToEvent;

    @C09CT("add_token_in_chain")
    public int addTokenInChain;

    @C09CT("alog_bcm_stack_max_length")
    public int alogBcmStackMaxLength;

    @C09CT("append_btm_page_params")
    public boolean appendBcmPageParams;

    @C09CT("bcm_biz_key_allowlist")
    public BcmWhitelist bcmBizKeyWhitelist;

    @C09CT("bcm_check_pop_dialog_switch")
    public boolean bcmCheckPopDialogSwitch;

    @C09CT("bcm_check_switch")
    public boolean bcmCheckSwitch;

    @C09CT("bcm_report_block_list")
    public List<String> bcmReportBlockList;

    @C09CT("broken_link_btm_list")
    public List<String> brokenLinkBtmList;

    @C09CT("btm_page_show")
    public BtmPageShow btmPageShow;

    @C09CT("btm_quality")
    public BtmQuality btmQuality;

    @C09CT("check_event_switch")
    public int checkEventSwitch;

    @C09CT("debug_tool")
    public DebugToolConfig debugToolConfig;

    @C09CT("enable_bcm_report")
    public int enableBcmReport;

    @C09CT("enable_add_from_unknown_to_btm_chain")
    public boolean enableFromUnknownInChain;

    @C09CT("push_into_link")
    public int enablePushLink;

    @C09CT("enable_set_pre_when_repeat")
    public int enableSetPreWhenRepeat;

    @C09CT("offline_entrance_info_config")
    public EntranceInfoParamsOfflineConfig entranceInfoParamsOfflineConfig;

    @C09CT("errcode_2015_timemillis")
    public long errCode2015Timemillis;

    @C09CT("incorrect_btm_pre")
    public List<PreModel> incorrectBtmPre;

    @C09CT("load_bcm_params_switch")
    public boolean loadBcmParamsSwitch;

    @C09CT("logger_backup_add_btm")
    public LoggerBackupAddBtm loggerBackupAddBtm;

    @C09CT("long_chain_get_params_config")
    public LongChainGetParamsConfig longChainGetParamsConfig;

    @C09CT("new_btm_show_id")
    public int newBtmShowId;

    @C09CT("prefix_need_check_unknown")
    public List<String> noUnknownClass;

    @C09CT("page_need_check_previous_unknown")
    public List<String> noUnknownPrePage;

    @C09CT("pre_cd_non_null")
    public List<PreModel> preCDNonNull;

    @C09CT("record_intent")
    public RecordIntentConfig recordIntent;

    @C09CT("remove_enter_page")
    public int removeEnterPage;

    @C09CT("remove_page_id")
    public int removePageId;

    @C09CT("bcm_chain_in_logger")
    public BcmChainInLogger reportBcmChain;

    @C09CT("btm_list_in_logger")
    public BtmListInLogger reportBtmList;

    @C09CT("show_unknown_page_scheme")
    public int showUnknownPageScheme;

    @C09CT("standard_chain_length")
    public int standardChainLength;

    @C09CT("token_repeat_use")
    public int tokenRepeatUse;

    @C09CT("unknown_dialog_frag_switch")
    public int unknownDialogFragSwitch;

    @C09CT("unknown_page_monitor")
    public UnknownPageMonitor unknownPageMonitor;

    @C09CT("upload_alog_switch")
    public int uploadALog;

    @C09CT("virtual_node")
    public VirtualNode virtualNode;

    @C09CT("buffer_timeout")
    public long bufferTimeout = 3000;

    @C09CT("fe_switch_high_version")
    public boolean feSwitch = true;

    @C09CT("bcm_check_v2")
    public BcmParamsCheck bcmCheckV2 = new BcmParamsCheck();

    @C09CT("show_id_chain_switch")
    public int showIdChain = 2;

    @C09CT("instance_id_switch")
    public int instanceIdSwitch = 3;

    @C09CT("enter_page_wait_start_node")
    public boolean enterPageWaitStartNode = true;

    @C09CT("reissued_enter_page_when_page_show")
    public boolean reissuedEnterPageWhenPageShow = true;

    @C09CT("unknown_switch")
    public int unknownSwitch = 1;

    @C09CT("last_btmId_switch")
    public int lastBtmIdSwitch = 1;

    @C09CT("upload_alog_errCode_list")
    public List<Integer> uploadALogErrorCodeList = new ArrayList();

    @C09CT("upload_alog_gap_seconds")
    public long uploadALogGapSeconds = 300;

    @C09CT("upload_times_per_err")
    public int uploadTimesPerErr = 5;

    @C09CT("schema_path")
    public SchemaPath schemaPath = new SchemaPath();

    public final int LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "alog_bcm_stack_max_length", Integer.valueOf(this.alogBcmStackMaxLength));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.alogBcmStackMaxLength;
        this.alogBcmStackMaxLength = iIntValue;
        return iIntValue;
    }

    public final boolean LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "bcm_check_switch", Boolean.valueOf(this.bcmCheckSwitch));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.bcmCheckSwitch;
        this.bcmCheckSwitch = zBooleanValue;
        return zBooleanValue;
    }

    public final List<String> LIZLLL() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.bcmReportBlockList, String.class, "bcm_report_block_list");
        this.bcmReportBlockList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final long LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "buffer_timeout", Long.valueOf(this.bufferTimeout));
        if (!(objLIZIZ instanceof Long)) {
            objLIZIZ = null;
        }
        Long l = (Long) objLIZIZ;
        long jLongValue = l != null ? l.longValue() : this.bufferTimeout;
        this.bufferTimeout = jLongValue;
        return jLongValue;
    }

    public final int LJFF() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "check_event_switch", Integer.valueOf(this.checkEventSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.checkEventSwitch;
        this.checkEventSwitch = iIntValue;
        return iIntValue;
    }

    public final boolean LJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "enable_add_from_unknown_to_btm_chain", Boolean.valueOf(this.enableFromUnknownInChain));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.enableFromUnknownInChain;
        this.enableFromUnknownInChain = zBooleanValue;
        return zBooleanValue;
    }

    public final boolean LJII() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fe_switch_high_version", Boolean.valueOf(this.feSwitch));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.feSwitch;
        this.feSwitch = zBooleanValue;
        return zBooleanValue;
    }

    public final int LJIIIIZZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "instance_id_switch", Integer.valueOf(this.instanceIdSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.instanceIdSwitch;
        this.instanceIdSwitch = iIntValue;
        return iIntValue;
    }

    public final boolean LJIIIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "load_bcm_params_switch", Boolean.valueOf(this.loadBcmParamsSwitch));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.loadBcmParamsSwitch;
        this.loadBcmParamsSwitch = zBooleanValue;
        return zBooleanValue;
    }

    public final int LJIIJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "remove_page_id", Integer.valueOf(this.removePageId));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.removePageId;
        this.removePageId = iIntValue;
        return iIntValue;
    }

    public final int LJIILIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "show_id_chain_switch", Integer.valueOf(this.showIdChain));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.showIdChain;
        this.showIdChain = iIntValue;
        return iIntValue;
    }

    public final int LJIILJJIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "show_unknown_page_scheme", Integer.valueOf(this.showUnknownPageScheme));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.showUnknownPageScheme;
        this.showUnknownPageScheme = iIntValue;
        return iIntValue;
    }

    public final int LJIILL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "unknown_dialog_frag_switch", Integer.valueOf(this.unknownDialogFragSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.unknownDialogFragSwitch;
        this.unknownDialogFragSwitch = iIntValue;
        return iIntValue;
    }

    public final int LJIILLIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "unknown_switch", Integer.valueOf(this.unknownSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.unknownSwitch;
        this.unknownSwitch = iIntValue;
        return iIntValue;
    }

    public final long LJIIZILJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "upload_alog_gap_seconds", Long.valueOf(this.uploadALogGapSeconds));
        if (!(objLIZIZ instanceof Long)) {
            objLIZIZ = null;
        }
        Long l = (Long) objLIZIZ;
        long jLongValue = l != null ? l.longValue() : this.uploadALogGapSeconds;
        this.uploadALogGapSeconds = jLongValue;
        return jLongValue;
    }

    public FeatureModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.noUnknownPrePage = c13bv;
        this.noUnknownClass = c13bv;
        this.preCDNonNull = c13bv;
        this.incorrectBtmPre = c13bv;
        this.errCode2015Timemillis = 2000L;
        this.removeEnterPage = 1;
        this.bcmBizKeyWhitelist = new BcmWhitelist();
        this.tokenRepeatUse = 1;
        this.reportBcmChain = new BcmChainInLogger();
        this.reportBtmList = new BtmListInLogger();
        this.enablePushLink = 1;
        this.btmQuality = new BtmQuality();
        this.addTokenInChain = 1;
        this.loggerBackupAddBtm = new LoggerBackupAddBtm();
        this.unknownPageMonitor = new UnknownPageMonitor();
        this.showUnknownPageScheme = 1;
        this.debugToolConfig = new DebugToolConfig();
        this.removePageId = 1;
        this.newBtmShowId = 1;
        this.btmPageShow = new BtmPageShow();
        this.enableSetPreWhenRepeat = 1;
        this.virtualNode = new VirtualNode();
        this.standardChainLength = 20;
        this.appendBcmPageParams = true;
        this.entranceInfoParamsOfflineConfig = new EntranceInfoParamsOfflineConfig();
        this.brokenLinkBtmList = c13bv;
        this.addDebugToBcmChain = 1;
        this.addDebugToEvent = 1;
        this.longChainGetParamsConfig = new LongChainGetParamsConfig();
        this.recordIntent = new RecordIntentConfig();
        this.bcmReportBlockList = C1697810uHb.LJIIJJI("query", "search_keyword", "search_action", "prefix_ec_params_ec_search_action", "prefix_ec_params_query", "prefix_ec_params_search_keyword");
    }

    public final BcmParamsCheck LIZJ() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.bcmCheckV2, "bcm_check_v2");
        return this.bcmCheckV2;
    }

    public final BtmListInLogger LJIIJJI() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.reportBtmList, "btm_list_in_logger");
        return this.reportBtmList;
    }

    public final SchemaPath LJIIL() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.schemaPath, "schema_path");
        return this.schemaPath;
    }

    public final VirtualNode LJIJ() {
        C1972007ny.LIZLLL(getLazyDataRootKey(), getLazyDataKey(), this.virtualNode, "virtual_node");
        return this.virtualNode;
    }
}
