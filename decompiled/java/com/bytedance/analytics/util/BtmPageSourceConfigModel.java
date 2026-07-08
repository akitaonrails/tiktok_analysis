package com.bytedance.analytics.util;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class BtmPageSourceConfigModel {

    @C09CT("chain_length")
    public int chainLength = 30;

    @C09CT("cut_chain_page_btms")
    public List<String> cutChainPageBtmList;

    @C09CT("delete_pages")
    public List<String> deletePages;

    @C09CT("delete_video_page_config")
    public List<String> deleteVideoPageConfig;

    @C09CT("merge_search")
    public int mergeSearch;

    @C09CT("merge_search_config")
    public Map<String, ? extends List<String>> mergeSearchConfig;

    @C09CT("need_add_video_page_config")
    public List<String> needAddVideoPageConfig;

    @C09CT("page_btm_map")
    public Map<String, String> pageBtmMap;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public int f10switch;

    @C09CT("write_2_last_create_page")
    public int write2LastCreatePage;

    public BtmPageSourceConfigModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.cutChainPageBtmList = c13bv;
        this.pageBtmMap = C2097608Jq.LJ();
        this.deletePages = c13bv;
        this.deleteVideoPageConfig = c13bv;
        this.needAddVideoPageConfig = c13bv;
        this.mergeSearchConfig = C2097608Jq.LJ();
        this.write2LastCreatePage = 1;
    }
}
