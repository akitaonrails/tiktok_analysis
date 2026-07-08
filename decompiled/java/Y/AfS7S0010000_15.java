package Y;

import X.C005C;
import X.C09JN;
import X.C0IJT;
import X.C1C7U;
import X.C474500IjA;
import X.C915980Zwa;
import X.C944060afs;
import X.C950220apo;
import X.C954460awe;
import X.C955400ayA;
import X.C955410ayB;
import X.C955540ayO;
import X.C957990b2L;
import X.EnumC950200apm;
import X.EnumC955660aya;
import X.InterfaceC934710aQn;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class AfS7S0010000_15 implements C09JN {
    public final int $t;
    public boolean z0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS7S0010000_15(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final void accept$0(AfS7S0010000_15 afS7S0010000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostApply$1");
        InterfaceC934710aQn.ib.LJFF(Boolean.valueOf(afS7S0010000_15.z0));
        C1C7U.LIZIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostApply$1");
    }

    public static final void accept$1(AfS7S0010000_15 afS7S0010000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostInvites$1");
        InterfaceC934710aQn.hb.LJFF(Boolean.valueOf(afS7S0010000_15.z0));
        C1C7U.LIZIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostInvites$1");
    }

    public static final void accept$2(AfS7S0010000_15 afS7S0010000_15, Object obj) {
        boolean z;
        Object obj2;
        String strLJJJJLI;
        Object obj3;
        Object obj4;
        int i;
        C1C7U.LIZ("LinkReportActiveMonitor@b072.startReportAnchorLinkMicActiveForMultiCoHost$1");
        C955400ayA c955400ayA = C955400ayA.LIZ;
        if (afS7S0010000_15.z0) {
            HashMap map = new HashMap();
            map.put("connection_type", "anchor");
            map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
            for (C954460awe c954460awe : C915980Zwa.LJII().LJIJJ()) {
                if (!c954460awe.LJI() && c954460awe.LJIIJJI() && c954460awe.LJJIIZ == EnumC950200apm.LINKED) {
                    break;
                }
            }
            if (!TextUtils.isEmpty(C955400ayA.LJJJ)) {
                map.put("request_id", C955400ayA.LJJJ);
            }
            map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
            C955540ayO c955540ayOLJIILLIIL = C915980Zwa.LJI().LIZ().LJIILLIIL();
            EnumC955660aya anchorType = C915980Zwa.LJI().LIZ().getAnchorType();
            EnumC955660aya enumC955660aya = EnumC955660aya.INVITEE;
            if (anchorType != enumC955660aya) {
                z = true;
            } else {
                z = false;
            }
            C955410ayB.LIZLLL(map, C955400ayA.LIZLLL, z);
            if (anchorType != enumC955660aya) {
                if (C915980Zwa.LJI().LIZ().LLJJ() != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                map.put("is_icon_show_anchor", String.valueOf(i));
                C955400ayA.LJIJI(String.valueOf(C915980Zwa.LJI().LIZ().LLJLLIL()), map);
            }
            map.put("connection_invitee_id", String.valueOf(C915980Zwa.LJI().LIZ().LLJLLIL()));
            map.put("connection_inviter_id", String.valueOf(C915980Zwa.LJI().LIZ().LJJIJL()));
            map.put("is_shared_screen", C955400ayA.LJJLIIIJ());
            String logId = C915980Zwa.LJI().LIZ().getLogId();
            Object obj5 = "";
            if (logId == null) {
                logId = "";
            }
            map.put("log_id", logId);
            Object objGg0 = DataChannelGlobal.LLILZ.gg0(C944060afs.class);
            if (objGg0 != null || (objGg0 = C915980Zwa.LJI().LIZ().getLogId()) != null) {
                obj5 = objGg0;
            }
            map.put("log_id", obj5);
            String str = "1";
            if (C957990b2L.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL())) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_quick_recommend", obj2);
            map.put("user_type", "anchor");
            String str2 = (String) map.get("request_id");
            if (str2 == null) {
                str2 = C955400ayA.LJJJ;
            }
            String strLJJL = C955400ayA.LJJL(Long.valueOf(C915980Zwa.LJI().LIZ().LLJLLIL()), str2);
            if (C915980Zwa.LJI().LIZ().getAnchorType() == enumC955660aya) {
                strLJJJJLI = C955400ayA.LJJLIIIIJ(Long.valueOf(C915980Zwa.LJI().LIZ().LJJIJL()), strLJJL);
            } else {
                strLJJJJLI = C955400ayA.LJJJJLI(strLJJL);
            }
            map.put("is_from_cohost_over_issue", strLJJJJLI);
            C955400ayA.LJJIII(map);
            map.put("click_time", C950220apo.LJII(false).getType());
            map.put("before_connection_status", C955400ayA.LJJJJZI());
            if (anchorType == enumC955660aya) {
                Integer tagType = C915980Zwa.LJI().LIZ().getTagType();
                int i2 = C005C.COHOST_TYPE.value;
                if (tagType != null && tagType.intValue() == i2) {
                    obj4 = "1";
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_linked_before", obj4);
            } else {
                c955400ayA.LJJIJ(map, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
            }
            C955400ayA.LJII(map);
            EnumC955660aya enumC955660aya2 = EnumC955660aya.INVITER;
            if (enumC955660aya2 == C915980Zwa.LJI().LIZ().getAnchorType()) {
                map.put("is_multi_bubble_guide", CardStruct.IStatusCode.DEFAULT);
            }
            C955400ayA.LJFF(map, false);
            C955400ayA.LJJII(map);
            C955400ayA.LJIIIIZZ(C915980Zwa.LJI().LIZ().LLJLLIL(), map);
            C955400ayA.LJIIL(c955400ayA, map, null, false, 14);
            map.put("source", C955400ayA.LJIIJ);
            C955400ayA.LJ(map);
            C955400ayA.LIZIZ(map);
            C955400ayA.LJJ(null, map);
            C955400ayA.LJJIIZI(c955540ayOLJIILLIIL, map);
            C955400ayA.LJJIJIIJI(c955400ayA, map);
            C955400ayA.LJJIJL(map);
            C955400ayA.LJIL(map);
            if ((anchorType == enumC955660aya2 || anchorType == EnumC955660aya.APPLY) && C955400ayA.LJIILLIIL.length() > 0) {
                map.put("words_type", C955400ayA.LJIILLIIL);
            }
            if (C915980Zwa.LJI().LIZ().LJIIZILJ() != EnumC955660aya.IDLE) {
                map.put("actual_anchor_type", C915980Zwa.LJI().LIZ().LJIIZILJ().getLabel());
            }
            if (C915980Zwa.LJI().LIZ().LLIZLLLIL()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_quick_pairing_waiting", obj3);
            if (!C955400ayA.LJJJI) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_from_queue_reorder", str);
            map.put("strategy_score", C955400ayA.LJJJIL);
            map.put("strategy_name", C955400ayA.LJJJJ);
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_connection_onemin", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LJJIIZI(map);
            c474500IjALIZIZ.LIZ();
        }
        C1C7U.LIZIZ("LinkReportActiveMonitor@b072.startReportAnchorLinkMicActiveForMultiCoHost$1");
    }
}
