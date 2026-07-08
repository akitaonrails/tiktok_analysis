package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIsPlaybookFoldable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bZB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978350bZB {
    public static boolean LIZ() {
        return C176600m4.LIZIZ(Boolean.valueOf(C915980Zwa.LIZLLL().qp0()));
    }

    public static void LIZJ(long j, DataChannel dataChannel, String str, boolean z) {
        if (LIZ()) {
            LIZLLL("match_panel", z, 0L, null);
            C978360bZC.LJIILLIIL(dataChannel, false, j, 0, 4, null, C978360bZC.LJIIL, C978360bZC.LJIIJJI, str, 40);
        }
    }

    public static void LIZLLL(String str, boolean z, long j, C978410bZH c978410bZH) {
        String str2;
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIIL = str;
        String str3 = C978360bZC.LJIIJJI;
        if (!Intrinsics.LJFF(str3, "playbook_guide_capsule") && !Intrinsics.LJFF(str3, "playbook_guide_icon")) {
            if (z) {
                str2 = "room_banner";
            } else {
                str2 = "match_icon";
            }
            C978360bZC.LJIIJJI = str2;
        }
        if (c978410bZH != null) {
            C978360bZC.LJJIIZ(j, c978410bZH);
        }
    }

    public static void LIZIZ(boolean z, String str, boolean z2, int i, String str2, int i2, DataChannel dataChannel, String str3, int i3) {
        boolean z3;
        String str4;
        if ((i3 & 128) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i3 & 256) != 0) {
            dataChannel = null;
        }
        if ((i3 & 512) != 0) {
            str3 = "list";
        }
        C978410bZH c978410bZH = new C978410bZH("match_panel", "", i2);
        if (LIZ()) {
            LIZLLL(str, z, 0L, c978410bZH);
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C978360bZC.LIZIZ(0L, linkedHashMap);
            linkedHashMap.put("action", str2);
            if (LiveMatchIsPlaybookFoldable.INSTANCE.getValue() && z3) {
                String str5 = "fold";
                if (z2) {
                    str4 = "fold";
                } else {
                    str4 = "unfold";
                }
                if (Intrinsics.LJFF(str2, "click")) {
                    if (z2) {
                        str5 = "unfold";
                    }
                } else {
                    str5 = str4;
                }
                linkedHashMap.put("cohost_is_list_foldable", "1");
                linkedHashMap.put("cohost_fold_status", str5);
                if (Intrinsics.LJFF(str2, "click")) {
                    linkedHashMap.put("cohost_click_action", str4);
                }
            } else {
                linkedHashMap.put("cohost_is_list_foldable", CardStruct.IStatusCode.DEFAULT);
            }
            linkedHashMap.put("playbook_num", String.valueOf(i));
            linkedHashMap.put("playbook_list_biz", "10");
            if (LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled()) {
                linkedHashMap.put("cohost_module_type", str3);
            }
            if (C500260Jjc.LJJJI(Boolean.valueOf(C915980Zwa.LIZLLL().qp0()))) {
                C978360bZC.LIZJ(linkedHashMap);
            }
            if (dataChannel != null) {
                C935410aRv.LIZ(dataChannel, "livesdk_multi_anchor_playbook_list_module_show", linkedHashMap);
            }
            C978360bZC.LJJIIZI("livesdk_multi_anchor_playbook_list_module_show", linkedHashMap);
        }
    }
}
