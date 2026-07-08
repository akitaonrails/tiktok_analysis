package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: loaded from: classes33.dex */
public final class BugfixModel extends LazyDataBase {

    @C09CT("fix_enter_new_page")
    public int fixEnterNewPage;

    @C09CT("fix_lynx_view_container_unbind")
    public int fixLynxViewContainerUnbind;

    @C09CT("fix_register_page_when_no_resume")
    public int fixRegisterPageWhenNotResume;

    @C09CT("judge_top_activity")
    public int judgeTopActivity = 1;

    @C09CT("fix_page_buffer_null")
    public int fixPageBufferNull = 1;

    @C09CT("fix_background_resume_filter")
    public int fixBackgroundResumeFilter = 1;

    @C09CT("fix_back_ground")
    public int fixBackGround = 1;

    @C09CT("fix_post_resume")
    public int fixPostResume = 1;

    @C09CT("fix_back_internal")
    public int fixBackInternal = 1;

    @C09CT("fix_enter_page_filter_same_page")
    public int fixEnterPageFilterSamePage = 1;

    @C09CT("fix_poll_buffer")
    public int fixPollBuffer = 1;

    @C09CT("fix_unknown_event")
    public int fixUnknownEvent = 3;

    @C09CT("fix_unknown_pre")
    public int fixUnknownPre = 1;

    @C09CT("fix_unknown_pre_2")
    public int fixUnknownPre2 = 1;

    @C09CT("app_observe_v2")
    public int appObserveV2 = 1;

    @C09CT("fix_page_show_gap")
    public int fixPageShowGap = 2;

    @C09CT("fix_disableUserVisibleHint")
    public int fixDisableUserVisibleHint = 1;

    @C09CT("fix_poll_self_buffer")
    public int fixPollSelfBuffer = 1;

    @C09CT("fix_decor_view")
    public int fixDecorView = 1;

    @C09CT("fix_fragment_view")
    public int fixFragmentView = 1;

    @C09CT("disable_userVisibleHintAOP")
    public int disableUserVisibleHintAOP = 1;

    @C09CT("fix_reuse")
    public int fixReuse = 2;

    @C09CT("fix_show_api")
    public int fixShowAPI = 1;

    @C09CT("fix_back_resumer_sort")
    public int fixBackResumerSort = 1;

    @C09CT("fix_back_internal_sort")
    public int fixBackInternalSort = 1;

    @C09CT("fix_back_internal_parent")
    public int fixBackInternalParent = 1;

    @C09CT("fix_native_state")
    public int fixNativeState = 1;

    @C09CT("fix_enterPage")
    public int fixEnterPage = 2;

    @C09CT("fix_multi_top_activity")
    public int fixMultiTopActivity = 1;

    @C09CT("fix_last_page_show")
    public int fixLastPageShow = 1;

    @C09CT("fix_add_node")
    public int fixAddNode = 1;

    @C09CT("fix_bcm_description_big_size")
    public int fixBcmDescriptionBigSize = 1;

    @C09CT("fix_page_params")
    public int fixPageParams = 1;

    @C09CT("fix_page_params_event")
    public int fixPageParamsEvent = 1;

    @C09CT("empty_btm_return")
    public int emptyBtmReturn = 1;

    @C09CT("fix_pre_node")
    public int fixPreNode = 1;

    @C09CT("fix_page_info_stack")
    public int fixPageInfoStack = 1;

    @C09CT("fix_leak")
    public int fixLeak = 1;

    @C09CT("fix_create_set_pre")
    public int fixCreateSetPre = 1;

    @C09CT("fix_activity_first_resume")
    public int fixActivityFirstResume = 1;

    @C09CT("enable_destroyed_page_cache")
    public int enableDestroyedPageCache = 1;

    @C09CT("fix_backup_btm_error")
    public int fixBackupBtmError = 1;

    @C09CT("fix_bcm_chain_0_btm")
    public int fixBcmChain0Btm = 1;

    @C09CT("fix_store_btm_chain")
    public int fixStoreBtmChain = 2;

    @C09CT("fix_store_bcm")
    public int fixStoreBcm = 2;

    @C09CT("fix_store_btm_page_info")
    public int fixStoreBtmPageInfo = 2;

    @C09CT("fix_store_singleton_map")
    public int fixStoreSingletonMap = 2;

    @C09CT("fix_store_error_other")
    public int fixStoreError = 2;

    @C09CT("fix_second_resume_miss")
    public int fixSecondResumeMiss = 1;

    @C09CT("fix_second_resume_miss_page_buffer")
    public int fixSecondResumeMissPageBuffer = 1;

    @C09CT("save_source_btm_token")
    public int saveSourceBtmToken = 1;

    public final int LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "disable_userVisibleHintAOP", Integer.valueOf(this.disableUserVisibleHintAOP));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.disableUserVisibleHintAOP;
        this.disableUserVisibleHintAOP = iIntValue;
        return iIntValue;
    }

    public final int LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "enable_destroyed_page_cache", Integer.valueOf(this.enableDestroyedPageCache));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.enableDestroyedPageCache;
        this.enableDestroyedPageCache = iIntValue;
        return iIntValue;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_back_resumer_sort", Integer.valueOf(this.fixBackResumerSort));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixBackResumerSort;
        this.fixBackResumerSort = iIntValue;
        return iIntValue;
    }

    public final int LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_backup_btm_error", Integer.valueOf(this.fixBackupBtmError));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixBackupBtmError;
        this.fixBackupBtmError = iIntValue;
        return iIntValue;
    }

    public final int LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_fragment_view", Integer.valueOf(this.fixFragmentView));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixFragmentView;
        this.fixFragmentView = iIntValue;
        return iIntValue;
    }

    public final int LJFF() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_leak", Integer.valueOf(this.fixLeak));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixLeak;
        this.fixLeak = iIntValue;
        return iIntValue;
    }

    public final int LJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_lynx_view_container_unbind", Integer.valueOf(this.fixLynxViewContainerUnbind));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixLynxViewContainerUnbind;
        this.fixLynxViewContainerUnbind = iIntValue;
        return iIntValue;
    }

    public final int LJII() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_page_params_event", Integer.valueOf(this.fixPageParamsEvent));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixPageParamsEvent;
        this.fixPageParamsEvent = iIntValue;
        return iIntValue;
    }

    public final int LJIIIIZZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_page_show_gap", Integer.valueOf(this.fixPageShowGap));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixPageShowGap;
        this.fixPageShowGap = iIntValue;
        return iIntValue;
    }

    public final int LJIIIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_poll_buffer", Integer.valueOf(this.fixPollBuffer));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixPollBuffer;
        this.fixPollBuffer = iIntValue;
        return iIntValue;
    }

    public final int LJIIJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_post_resume", Integer.valueOf(this.fixPostResume));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixPostResume;
        this.fixPostResume = iIntValue;
        return iIntValue;
    }

    public final int LJIIJJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_reuse", Integer.valueOf(this.fixReuse));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixReuse;
        this.fixReuse = iIntValue;
        return iIntValue;
    }

    public final int LJIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_store_bcm", Integer.valueOf(this.fixStoreBcm));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixStoreBcm;
        this.fixStoreBcm = iIntValue;
        return iIntValue;
    }

    public final int LJIILIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_store_btm_chain", Integer.valueOf(this.fixStoreBtmChain));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixStoreBtmChain;
        this.fixStoreBtmChain = iIntValue;
        return iIntValue;
    }

    public final int LJIILJJIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_store_btm_page_info", Integer.valueOf(this.fixStoreBtmPageInfo));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixStoreBtmPageInfo;
        this.fixStoreBtmPageInfo = iIntValue;
        return iIntValue;
    }

    public final int LJIILL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_store_error_other", Integer.valueOf(this.fixStoreError));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixStoreError;
        this.fixStoreError = iIntValue;
        return iIntValue;
    }

    public final int LJIILLIIL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_store_singleton_map", Integer.valueOf(this.fixStoreSingletonMap));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixStoreSingletonMap;
        this.fixStoreSingletonMap = iIntValue;
        return iIntValue;
    }

    public final int LJIIZILJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "fix_unknown_event", Integer.valueOf(this.fixUnknownEvent));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.fixUnknownEvent;
        this.fixUnknownEvent = iIntValue;
        return iIntValue;
    }
}
