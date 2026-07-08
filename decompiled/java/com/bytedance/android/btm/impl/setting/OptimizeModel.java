package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class OptimizeModel extends LazyDataBase {

    @C09CT("disable_jump_queue")
    public int disableJumpQueue;

    @C09CT("enable_check_set_bcm")
    public final int enableCheckSetBcm;

    @C09CT("err_close_list")
    public List<Integer> errCloseList;

    @C09CT("generate_show_id_by_empty_host")
    public List<String> generateShowIdByEmptyHost;

    @C09CT("local_store_opt")
    public int localStoreOpt;

    @C09CT("optimize_create_node")
    public int optCreateNode;

    @C09CT("optimize_to_string")
    public final int optimizeToString;

    @C09CT("remove_needless_event_key")
    public int removeNeedlessEventKey;

    @C09CT("same_unit_params")
    public int sameUnitParams;

    @C09CT("set_page_bcm_default_value")
    public final boolean setPageBcmDefaultValue;

    @C09CT("enable_btm_page_show_opt")
    public int enableBtmPageShowOpt = 1;

    @C09CT("chain_map_size")
    public int chainMapSize = 20000;

    @C09CT("event_map_size")
    public int eventMapSize = 20000;

    @C09CT("bcm_map_size")
    public int bcmMapSize = 10000;

    @C09CT("duration_map_size")
    public int durationMapSize = 10000;

    @C09CT("low_memory")
    public int lowMemory = 1;

    @C09CT("alog_thread_version")
    public int alogVersion = 2;

    @C09CT("alog_sleep_timemillis")
    public long alogSleepTimeMillis = Mp4ScreenVideoLoadTimeout.CONTROL;

    @C09CT("alog_upload_delay_timemillis")
    public long alogUploadDelayTimeMillis = 60000;

    @C09CT("event_check_sleep_alog_sleep_timemillis")
    public long eventCheckSleepTimeMillis = 10000;

    @C09CT("event_queue_capacity")
    public int eventQueueCapacity = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("enable_recovery_alog")
    public int enableRecoveryALog = 1;

    @C09CT("weak_fragment_view_map")
    public int weakFragmentViewMap = 1;

    @C09CT("unit_buffer_btm")
    public int unitBufferBtm = 1;

    @C09CT("opt_tab")
    public int optTab = 1;

    public final long LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "alog_sleep_timemillis", Long.valueOf(this.alogSleepTimeMillis));
        if (!(objLIZIZ instanceof Long)) {
            objLIZIZ = null;
        }
        Long l = (Long) objLIZIZ;
        long jLongValue = l != null ? l.longValue() : this.alogSleepTimeMillis;
        this.alogSleepTimeMillis = jLongValue;
        return jLongValue;
    }

    public final long LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "alog_upload_delay_timemillis", Long.valueOf(this.alogUploadDelayTimeMillis));
        if (!(objLIZIZ instanceof Long)) {
            objLIZIZ = null;
        }
        Long l = (Long) objLIZIZ;
        long jLongValue = l != null ? l.longValue() : this.alogUploadDelayTimeMillis;
        this.alogUploadDelayTimeMillis = jLongValue;
        return jLongValue;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "alog_thread_version", Integer.valueOf(this.alogVersion));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.alogVersion;
        this.alogVersion = iIntValue;
        return iIntValue;
    }

    public final int LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "bcm_map_size", Integer.valueOf(this.bcmMapSize));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.bcmMapSize;
        this.bcmMapSize = iIntValue;
        return iIntValue;
    }

    public final int LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "chain_map_size", Integer.valueOf(this.chainMapSize));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.chainMapSize;
        this.chainMapSize = iIntValue;
        return iIntValue;
    }

    public final int LJFF() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "disable_jump_queue", Integer.valueOf(this.disableJumpQueue));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.disableJumpQueue;
        this.disableJumpQueue = iIntValue;
        return iIntValue;
    }

    public final int LJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "duration_map_size", Integer.valueOf(this.durationMapSize));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.durationMapSize;
        this.durationMapSize = iIntValue;
        return iIntValue;
    }

    public final int LJII() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "enable_btm_page_show_opt", Integer.valueOf(this.enableBtmPageShowOpt));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.enableBtmPageShowOpt;
        this.enableBtmPageShowOpt = iIntValue;
        return iIntValue;
    }

    public final int LJIIIIZZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "enable_check_set_bcm", Integer.valueOf(this.enableCheckSetBcm));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.enableCheckSetBcm;
        this.enableCheckSetBcm = iIntValue;
        return iIntValue;
    }

    public final int LJIIIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "enable_recovery_alog", Integer.valueOf(this.enableRecoveryALog));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.enableRecoveryALog;
        this.enableRecoveryALog = iIntValue;
        return iIntValue;
    }

    public final List<Integer> LJIIJ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.errCloseList, Integer.TYPE, "err_close_list");
        this.errCloseList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final long LJIIJJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event_check_sleep_alog_sleep_timemillis", Long.valueOf(this.eventCheckSleepTimeMillis));
        if (!(objLIZIZ instanceof Long)) {
            objLIZIZ = null;
        }
        Long l = (Long) objLIZIZ;
        long jLongValue = l != null ? l.longValue() : this.eventCheckSleepTimeMillis;
        this.eventCheckSleepTimeMillis = jLongValue;
        return jLongValue;
    }

    public final int LJIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event_map_size", Integer.valueOf(this.eventMapSize));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.eventMapSize;
        this.eventMapSize = iIntValue;
        return iIntValue;
    }

    public final int LJIILIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event_queue_capacity", Integer.valueOf(this.eventQueueCapacity));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.eventQueueCapacity;
        this.eventQueueCapacity = iIntValue;
        return iIntValue;
    }

    public final List<String> LJIILJJIL() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.generateShowIdByEmptyHost, String.class, "generate_show_id_by_empty_host");
        this.generateShowIdByEmptyHost = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LJIILL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "local_store_opt", Integer.valueOf(this.localStoreOpt));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.localStoreOpt;
        this.localStoreOpt = iIntValue;
        return iIntValue;
    }

    public final int LJIILLIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "low_memory", Integer.valueOf(this.lowMemory));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.lowMemory;
        this.lowMemory = iIntValue;
        return iIntValue;
    }

    public final int LJIIZILJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "optimize_create_node", Integer.valueOf(this.optCreateNode));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.optCreateNode;
        this.optCreateNode = iIntValue;
        return iIntValue;
    }

    public final int LJIJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "opt_tab", Integer.valueOf(this.optTab));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.optTab;
        this.optTab = iIntValue;
        return iIntValue;
    }

    public final int LJIJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "optimize_to_string", Integer.valueOf(this.optimizeToString));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.optimizeToString;
        this.optimizeToString = iIntValue;
        return iIntValue;
    }

    public final int LJIJJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "remove_needless_event_key", Integer.valueOf(this.removeNeedlessEventKey));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.removeNeedlessEventKey;
        this.removeNeedlessEventKey = iIntValue;
        return iIntValue;
    }

    public final int LJIJJLI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "same_unit_params", Integer.valueOf(this.sameUnitParams));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.sameUnitParams;
        this.sameUnitParams = iIntValue;
        return iIntValue;
    }

    public final boolean LJIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "set_page_bcm_default_value", Boolean.valueOf(this.setPageBcmDefaultValue));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.setPageBcmDefaultValue;
        this.setPageBcmDefaultValue = zBooleanValue;
        return zBooleanValue;
    }

    public final int LJJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "unit_buffer_btm", Integer.valueOf(this.unitBufferBtm));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.unitBufferBtm;
        this.unitBufferBtm = iIntValue;
        return iIntValue;
    }

    public final int LJJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "weak_fragment_view_map", Integer.valueOf(this.weakFragmentViewMap));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.weakFragmentViewMap;
        this.weakFragmentViewMap = iIntValue;
        return iIntValue;
    }

    public OptimizeModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.generateShowIdByEmptyHost = c13bv;
        this.errCloseList = c13bv;
        this.localStoreOpt = 7;
        this.optimizeToString = 1;
    }
}
