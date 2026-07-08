package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLinkedAnchorNumChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostRefreshUserWhenMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;

/* JADX INFO: renamed from: X.0bRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973440bRG {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZJ() {
        int i = 0;
        for (C954460awe c954460awe : C915980Zwa.LJII().LJIJJ()) {
            if (c954460awe.LJIIJ() && c954460awe.LJIIJJI()) {
                i = 1;
            } else if (c954460awe.LJIIJ()) {
                i = 2;
            }
        }
        if (!C915980Zwa.LJIIIZ().Jf() && !(!C915980Zwa.LJII().LJJIJIL().isEmpty())) {
            return i;
        }
        if (!LiveMatchTeamPairSetting.INSTANCE.isEnable() || !C915980Zwa.LJIIIZ().Jf() || C915980Zwa.LJIIIZ().LJFF() != EnumC958840b3i.TEAM_PAIR) {
            return 3;
        }
        C20441214yg.LIZIZ("CompetitionAnchorLauncherUtil", "QuickCoHost is in team paring. Reset hasHandlingCoHost to 0");
        return 0;
    }

    public static void LIZLLL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.QUICK_INVITING.getReason(), null, null, 14);
                    return;
                }
                return;
            }
            C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.INVITING_OTHER_TO_COHOST.getReason(), null, null, 14);
            return;
        }
        C974490bSx.LJJIFFI(new C974490bSx(), EnumC973450bRH.INVITING_OTHER_TO_COHOST.getReason(), null, null, 14);
    }

    public static List LIZIZ(LiveWidget liveWidget, boolean z) {
        DataChannel dataChannel;
        int size;
        ImageModel imageModel;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (z) {
            for (C954460awe c954460awe : listLLILZLL) {
                IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
                if (iHostFrescoHelper != null) {
                    C754570Tip c754570Tip = c954460awe.LJIJJ;
                    if (c754570Tip != null) {
                        imageModel = c754570Tip.LIZJ;
                    } else {
                        imageModel = null;
                    }
                    iHostFrescoHelper.xW1(imageModel, new InterfaceC177000m8() { // from class: X.0bRI
                        @Override // X.InterfaceC177000m8
                        public final void LIZ(Bitmap bitmap) {
                            C20441214yg.LIZIZ("CompetitionAnchorLauncherUtil", "load icon success");
                        }
                    });
                }
            }
        }
        if (liveWidget != null && (dataChannel = liveWidget.dataChannel) != null) {
            if (listLLILZLL != null) {
                size = listLLILZLL.size();
            } else {
                size = 0;
            }
            dataChannel.zW(BattleLinkedAnchorNumChannel.class, Integer.valueOf(size));
        }
        return listLLILZLL;
    }

    public static boolean LIZ(EnumC974070bSH enumC974070bSH, int i, boolean z) {
        if (i > 0) {
            if (enumC974070bSH == EnumC974070bSH.MATCH_CREATED_SOURCE_RECEIVE_INVITE) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handlingCoHostStatus = ");
                sbLIZ.append(i);
                sbLIZ.append(" from message invite");
                C20441214yg.LJIIIZ("CompetitionAnchorLauncherUtil", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
            if (i == 2) {
                if (!LiveCohostRefreshUserWhenMatchSetting.INSTANCE.isEnable() || z) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851644));
                }
                return false;
            }
            if (i == 1) {
                if (!LiveCohostRefreshUserWhenMatchSetting.INSTANCE.isEnable() || z) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851644));
                }
                return false;
            }
            if (i == 3) {
                if (!LiveCohostRefreshUserWhenMatchSetting.INSTANCE.isEnable() || z) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851644));
                }
                return false;
            }
        }
        return true;
    }
}
