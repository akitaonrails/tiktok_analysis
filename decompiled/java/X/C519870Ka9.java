package X;

import Y.AfS103S0300000_7;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ka9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519870Ka9 {
    public final void LIZIZ(boolean z, C1109770ez9 c1109770ez9, EmoteModel emoteModel) {
        if (z) {
            C1110530f0N c1110530f0N = new C1110530f0N(4, "fans_sticker", "fans_club_sticker", false);
            c1110530f0N.LJIIJJI = emoteModel;
            DataChannel dataChannel = c1109770ez9.LJIIIZ;
            if (dataChannel != null) {
                dataChannel.LC0(UserWannaSendMessageEvent.class, c1110530f0N);
                return;
            }
            return;
        }
        C11NZ.LJLJJLL(900L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS103S0300000_7(emoteModel, this, c1109770ez9, 7));
    }

    public final void LIZ(C1109770ez9 c1109770ez9, EmoteModel emoteModel, long j, long j2, long j3, int i) {
        Room room;
        String str;
        int i2 = emoteModel.emoteScene;
        if (i2 == 2) {
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(c1109770ez9.LJIIIZ)));
            DataChannel dataChannel = c1109770ez9.LJIIIZ;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room = null;
            }
            boolean zLIZIZ = C518190KTx.LIZIZ(zLJJJI, room);
            boolean z = c1109770ez9.LIZLLL;
            if (!zLIZIZ && !zLJJJI) {
                Context context = c1109770ez9.LIZ;
                if (context != null) {
                    Uri uriLJJJZ = C500260Jjc.LJJJZ(C500260Jjc.LJJJZ(UriProtector.parse("aweme://webcast_fans_club_guide?view_type=0&dialog_type=2&enter_from=sticker&tab_id=0"), "sticker_id", emoteModel.emoteId), "sticker_image", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, emoteModel.image));
                    if (z) {
                        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                        if (iActionHandlerService != null) {
                            iActionHandlerService.handle(context, uriLJJJZ);
                        }
                    } else {
                        C11NZ.LJLJJLL(900L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C515801zg(context, uriLJJJZ, 23));
                    }
                }
            } else {
                LIZIZ(z, c1109770ez9, emoteModel);
            }
            if (j == c1109770ez9.LJIL) {
                if (c1109770ez9.LJI) {
                    str = "live_anchor_c_anchor";
                } else {
                    str = "live_audience_c_anchor";
                }
            } else if (c1109770ez9.LJI) {
                str = "live_anchor_c_audience";
            } else {
                str = "live_audience_c_audience";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_privilege_emote_click");
            c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
            c474500IjALIZ.LJJII(str, "request_page");
            c474500IjALIZ.LJJII("comment_area", "click_position");
            c474500IjALIZ.LJJII(Long.valueOf(j2), "message_id");
            c474500IjALIZ.LJJII(Long.valueOf(j3), "message_release_id");
            c474500IjALIZ.LJJII(emoteModel.emoteId, "privilege_emotes_label");
            if (i != -1) {
                c474500IjALIZ.LJJII(String.valueOf(i), "show_type");
            }
            c474500IjALIZ.LIZ();
            C510380Jzw.LJIL("subscription_publicscreen_emote_click", new JSONObject());
            return;
        }
        if (i2 != 3) {
            return;
        }
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(c1109770ez9.LJIIIZ)));
        boolean zWd2 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2();
        boolean z2 = c1109770ez9.LIZLLL;
        if (!zLJJJI2 && !zWd2) {
            ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).RL1("sticker");
        } else {
            LIZIZ(z2, c1109770ez9, emoteModel);
        }
    }
}
