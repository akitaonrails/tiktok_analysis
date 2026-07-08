package com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestFeedSupportNewLayoutSwitchInfoSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFeedSupportNewLayoutSwitchInfoSetting_FeedSupportNewLayoutSwitchInfo_OptTypeAdapter extends TypeAdapter<MultiGuestFeedSupportNewLayoutSwitchInfoSetting.FeedSupportNewLayoutSwitchInfo> {
    public final Gson LIZ;

    public MultiGuestFeedSupportNewLayoutSwitchInfoSetting_FeedSupportNewLayoutSwitchInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFeedSupportNewLayoutSwitchInfoSetting.FeedSupportNewLayoutSwitchInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestFeedSupportNewLayoutSwitchInfoSetting.FeedSupportNewLayoutSwitchInfo feedSupportNewLayoutSwitchInfo = new MultiGuestFeedSupportNewLayoutSwitchInfoSetting.FeedSupportNewLayoutSwitchInfo(true, true, true, true, true, true, true, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1084811495:
                        if (strLJJJJ.equals("online_state_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.onlineStateOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -845446520:
                        if (strLJJJJ.equals("ui_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.uiOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -637958385:
                        if (strLJJJJ.equals("use_injected_layout_manager")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.useInjectedLayoutManager = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -226454462:
                        if (strLJJJJ.equals("search_empty_view_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.searchEmptyViewOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 458811907:
                        if (strLJJJJ.equals("layout_attach_parent_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.layoutAttachParentOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1839562170:
                        if (strLJJJJ.equals("shared_bg_load_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.sharedBgLoadOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1846027302:
                        if (strLJJJJ.equals("opt_link_mic_close_logic")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.optLinkMicCloseLogic = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1850279607:
                        if (strLJJJJ.equals("fix_memory_leak")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.fixMemoryLeak = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1905116384:
                        if (strLJJJJ.equals("add_show_log")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.addShowLog = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2042249244:
                        if (strLJJJJ.equals("fix_multiguest_v3_manager_data_holder_init_way")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feedSupportNewLayoutSwitchInfo.fixMultiGuestV3ManagerDataHolderInitWay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return feedSupportNewLayoutSwitchInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestFeedSupportNewLayoutSwitchInfoSetting.FeedSupportNewLayoutSwitchInfo feedSupportNewLayoutSwitchInfo) throws IOException {
        MultiGuestFeedSupportNewLayoutSwitchInfoSetting.FeedSupportNewLayoutSwitchInfo feedSupportNewLayoutSwitchInfo2 = feedSupportNewLayoutSwitchInfo;
        if (feedSupportNewLayoutSwitchInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ui_opt");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.uiOpt);
        c09dl.LJIILLIIL("shared_bg_load_opt");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.sharedBgLoadOpt);
        c09dl.LJIILLIIL("search_empty_view_opt");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.searchEmptyViewOpt);
        c09dl.LJIILLIIL("layout_attach_parent_opt");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.layoutAttachParentOpt);
        c09dl.LJIILLIIL("add_show_log");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.addShowLog);
        c09dl.LJIILLIIL("fix_multiguest_v3_manager_data_holder_init_way");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.fixMultiGuestV3ManagerDataHolderInitWay);
        c09dl.LJIILLIIL("online_state_opt");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.onlineStateOpt);
        c09dl.LJIILLIIL("fix_memory_leak");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.fixMemoryLeak);
        c09dl.LJIILLIIL("opt_link_mic_close_logic");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.optLinkMicCloseLogic);
        c09dl.LJIILLIIL("use_injected_layout_manager");
        c09dl.LJJJJJL(feedSupportNewLayoutSwitchInfo2.useInjectedLayoutManager);
        c09dl.LJII();
    }
}
