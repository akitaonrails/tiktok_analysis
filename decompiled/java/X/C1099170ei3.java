package X;

import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.uikit.setting.LivePanelFrameworkSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ei3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099170ei3 implements InterfaceC20484915Dr {
    public static final C1099170ei3 LIZ = new C1099170ei3();

    public static String LIZJ(String str) {
        if (Intrinsics.LJFF(str, "multi_guest_apply_preview")) {
            return "multi_watch_linkedmic";
        }
        if (!Intrinsics.LJFF(str, "fans_dialog")) {
            return str;
        }
        return "revenue_fans_group_guide";
    }

    @Override // X.InterfaceC20484915Dr
    public final void LIZ(InterfaceC20484815Dq interfaceC20484815Dq) {
        boolean z;
        Object obj;
        Object obj2;
        Map<String, String> map;
        String str;
        String str2;
        String str3;
        DataChannel dataChannelLJ = C475510Ikn.LJ(interfaceC20484815Dq.getFragment());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_frame_show");
        c474500IjALIZ.LJIJJLI(dataChannelLJ);
        if (dataChannelLJ != null && C500260Jjc.LJIIZILJ(dataChannelLJ)) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_anchor");
        if (interfaceC20484815Dq.sk()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "has_slide_close");
        if (interfaceC20484815Dq.eO()) {
            c474500IjALIZ.LJJII(LIZJ(interfaceC20484815Dq.j4()), "start_panel_page");
            c474500IjALIZ.LJJII(LIZJ(interfaceC20484815Dq.gE()), "current_panel_page");
            if (!C929950aJ7.LIZ(interfaceC20484815Dq.gE())) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str4, "has_return");
            SheetOptions sheetOptionsIw = interfaceC20484815Dq.iw();
            if (sheetOptionsIw != null && sheetOptionsIw.fullscreenEnabled) {
                str3 = "full_screen";
            } else {
                SheetOptions sheetOptionsIw2 = interfaceC20484815Dq.iw();
                if (sheetOptionsIw2 != null && sheetOptionsIw2.sheetStyle == 1) {
                    str3 = "fixed_7";
                } else {
                    str3 = "max_6";
                }
            }
            c474500IjALIZ.LJJII(str3, "height_ratio");
        } else {
            LivePanelFrameworkSetting.AllowItem allowItemEd1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).ed1(interfaceC20484815Dq.j4());
            LivePanelFrameworkSetting.AllowItem allowItemEd12 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).ed1(interfaceC20484815Dq.gE());
            String strJ4 = interfaceC20484815Dq.j4();
            if (allowItemEd1 != null && (str2 = allowItemEd1.panelPage) != null) {
                strJ4 = str2;
            }
            c474500IjALIZ.LJJII(strJ4, "start_panel_page");
            String strGE = interfaceC20484815Dq.gE();
            if (allowItemEd12 != null && (str = allowItemEd12.panelPage) != null) {
                strGE = str;
            }
            c474500IjALIZ.LJJII(strGE, "current_panel_page");
            if (allowItemEd12 != null && (map = allowItemEd12.extra) != null) {
                c474500IjALIZ.LJJIIZI(map);
            }
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC20484915Dr
    public final void LIZIZ(InterfaceC20484815Dq interfaceC20484815Dq, int i) {
        boolean z;
        Object obj;
        Object obj2;
        String str;
        Map<String, String> map;
        String str2;
        String str3;
        String str4;
        DataChannel dataChannelLJ = C475510Ikn.LJ(interfaceC20484815Dq.getFragment());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_frame_exit_click");
        c474500IjALIZ.LJIJJLI(dataChannelLJ);
        if (dataChannelLJ != null && C500260Jjc.LJIIZILJ(dataChannelLJ)) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_anchor");
        if (interfaceC20484815Dq.sk()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "has_slide_close");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "other_close";
                    } else {
                        str = "click_return";
                    }
                } else {
                    str = "slide_close";
                }
            } else {
                str = "click_outside_close";
            }
        } else {
            str = "click_close";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        if (interfaceC20484815Dq.eO()) {
            c474500IjALIZ.LJJII(LIZJ(interfaceC20484815Dq.j4()), "start_panel_page");
            c474500IjALIZ.LJJII(LIZJ(interfaceC20484815Dq.gE()), "current_panel_page");
            if (!C929950aJ7.LIZ(interfaceC20484815Dq.gE())) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str5, "has_return");
            SheetOptions sheetOptionsIw = interfaceC20484815Dq.iw();
            if (sheetOptionsIw != null && sheetOptionsIw.fullscreenEnabled) {
                str4 = "full_screen";
            } else {
                SheetOptions sheetOptionsIw2 = interfaceC20484815Dq.iw();
                if (sheetOptionsIw2 != null && sheetOptionsIw2.sheetStyle == 1) {
                    str4 = "fixed_7";
                } else {
                    str4 = "max_6";
                }
            }
            c474500IjALIZ.LJJII(str4, "height_ratio");
        } else {
            LivePanelFrameworkSetting.AllowItem allowItemEd1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).ed1(interfaceC20484815Dq.j4());
            LivePanelFrameworkSetting.AllowItem allowItemEd12 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).ed1(interfaceC20484815Dq.gE());
            String strJ4 = interfaceC20484815Dq.j4();
            if (allowItemEd1 != null && (str3 = allowItemEd1.panelPage) != null) {
                strJ4 = str3;
            }
            c474500IjALIZ.LJJII(strJ4, "start_panel_page");
            String strGE = interfaceC20484815Dq.gE();
            if (allowItemEd12 != null && (str2 = allowItemEd12.panelPage) != null) {
                strGE = str2;
            }
            c474500IjALIZ.LJJII(strGE, "current_panel_page");
            if (allowItemEd12 != null && (map = allowItemEd12.extra) != null) {
                c474500IjALIZ.LJJIIZI(map);
            }
        }
        c474500IjALIZ.LIZ();
    }
}
