package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.EsportsMatchUpdateMessage;
import com.bytedance.android.livesdk.model.message.EsportsScoreBoardUpdateMessage;
import com.bytedance.android.livesdk.model.message.GameGuessWidgetsMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.net.URLDecoder;
import java.util.List;

/* JADX INFO: renamed from: X.0z3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881370z3f implements InterfaceC520420Kb2 {
    public final Context LIZ;
    public ViewGroup LJ;
    public FrameLayout LJFF;
    public C1881360z3e LJI;
    public DataChannel LJII;
    public Room LJIIIIZZ;
    public IMessageManager LJIIIZ;
    public C1881400z3i LJIIJ;
    public final int LIZIZ = C001A.ESPORTS_MATCH_UPDATE_MESSAGE.getIntType();
    public final int LIZJ = C001A.ESPORTS_SCORE_BOARD_UPDATE_MESSAGE.getIntType();
    public final int LIZLLL = C001A.GAME_GUESS_WIDGETS_MESSAGE.getIntType();
    public String LJIIJJI = "";
    public String LJIIL = "";

    @Override // X.InterfaceC520420Kb2
    public final void LIZIZ() {
        C1881360z3e c1881360z3e = this.LJI;
        if (c1881360z3e != null) {
            c1881360z3e.LJIIL();
        }
    }

    @Override // X.InterfaceC520420Kb2
    public final void LLLZZ() {
        C1881360z3e c1881360z3e = this.LJI;
        if (c1881360z3e != null) {
            c1881360z3e.LJIJI();
        }
    }

    @Override // X.InterfaceC520420Kb2
    public final void onDestroy() {
        IMessageManager iMessageManager;
        C1881400z3i c1881400z3i = this.LJIIJ;
        if (c1881400z3i != null && (iMessageManager = this.LJIIIZ) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) c1881400z3i);
        }
        C1881360z3e c1881360z3e = this.LJI;
        if (c1881360z3e != null) {
            c1881360z3e.LJI();
        }
        this.LJI = null;
    }

    @Override // X.InterfaceC520420Kb2
    public final void onHide() {
        C1881360z3e c1881360z3e = this.LJI;
        if (c1881360z3e != null) {
            c1881360z3e.LJIIL();
        }
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(this.LJFF, viewGroup);
        }
    }

    @Override // X.InterfaceC520420Kb2
    public final void onShow() {
        String strDecode;
        String idStr;
        List urls;
        String string;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        ImageModel imageModel;
        String strDecode2 = "";
        if (this.LJFF == null) {
            this.LJFF = new FrameLayout(this.LIZ);
        }
        ViewGroup viewGroup = this.LJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ViewGroup viewGroup2 = this.LJ;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.LJFF, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        if (this.LJI == null) {
            C1881360z3e c1881360z3e = new C1881360z3e(this.LIZ);
            try {
                strDecode = URLDecoder.decode(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.LJIIL), "lynxurl"), "UTF-8");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strDecode = "";
            }
            c1881360z3e.LLJILJILJ = strDecode;
            Room room = this.LJIIIIZZ;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            C1882380z5I.LJI(c1881360z3e.LJII(), "room_id", idStr);
            Room room2 = this.LJIIIIZZ;
            if (room2 == null || (imageModel = room2.background) == null || (urls = imageModel.getUrls()) == null) {
                urls = C13BV.INSTANCE;
            }
            c1881360z3e.LLJILLL = urls;
            Room room3 = this.LJIIIIZZ;
            if (room3 == null || (interfaceC2262081DgMAuthor = room3.author()) == null || (string = Long.valueOf(interfaceC2262081DgMAuthor.getId()).toString()) == null) {
                string = "";
            }
            C1882380z5I.LJI(c1881360z3e.LJII(), "author_id", string);
            try {
                strDecode2 = URLDecoder.decode(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.LJIIL), "biz_name"), "UTF-8");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            c1881360z3e.LLJJ = strDecode2;
            C1882380z5I.LJI(c1881360z3e.LJII(), "biz_name", strDecode2);
            C1882380z5I.LJI(c1881360z3e.LJIIIIZZ(), "biz_name", strDecode2);
            Room room4 = this.LJIIIIZZ;
            C1882380z5I.LJI(c1881360z3e.LJII(), "gs_guessing_xtab_ab_param", Long.valueOf(room4 != null ? room4.gsGuessingXtabAbParam : 0L));
            this.LJI = c1881360z3e;
            FrameLayout frameLayout = this.LJFF;
            if (frameLayout != null) {
                c1881360z3e.h(frameLayout);
            }
        }
        C1881360z3e c1881360z3e2 = this.LJI;
        if (c1881360z3e2 != null) {
            c1881360z3e2.LJIJI();
        }
    }

    public C1881370z3f(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC520420Kb2
    public final void LIZJ(ViewGroup viewGroup) {
        this.LJ = viewGroup;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0z3i] */
    public final void LIZ(DataChannel dataChannel, String str) {
        String strDecode;
        IMessageManager iMessageManager;
        this.LJII = dataChannel;
        this.LJIIIIZZ = (Room) dataChannel.gg0(RoomChannel.class);
        try {
            strDecode = URLDecoder.decode(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "biz_name"), "UTF-8");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strDecode = "";
        }
        this.LJIIJJI = strDecode;
        this.LJIIL = str;
        DataChannel dataChannel2 = this.LJII;
        if (dataChannel2 != null) {
            iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LJIIIZ = iMessageManager;
        this.LJIIJ = new OnIMMessageListener() { // from class: X.0z3i
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "GamePartnershipEsportsXtabWidget";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.ASYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                C1881360z3e c1881360z3e;
                C1881370z3f c1881370z3f = this.LL;
                c1881370z3f.getClass();
                if (iMessage instanceof EsportsMatchUpdateMessage) {
                    C1881360z3e c1881360z3e2 = c1881370z3f.LJI;
                    if (c1881360z3e2 != null) {
                        C20441214yg.LIZIZ("ESportsMixPageHost", "notifyESportsMatchUpdate");
                        c1881360z3e2.LJIIIZ().getEventCenter().LIZIZ(iMessage, "esports_match_update");
                        return;
                    }
                    return;
                }
                if (iMessage instanceof EsportsScoreBoardUpdateMessage) {
                    C1881360z3e c1881360z3e3 = c1881370z3f.LJI;
                    if (c1881360z3e3 == null) {
                        return;
                    }
                    C20441214yg.LIZIZ("ESportsMixPageHost", "notifyESportsScoreUpdate");
                    c1881360z3e3.LJIIIZ().getEventCenter().LIZIZ(iMessage, "esports_score_update");
                    return;
                }
                if (!(iMessage instanceof GameGuessWidgetsMessage) || (c1881360z3e = c1881370z3f.LJI) == null) {
                    return;
                }
                C20441214yg.LIZIZ("ESportsMixPageHost", "notifyGuessWidgetsUpdate");
                c1881360z3e.LJIIIZ().getEventCenter().LIZIZ(iMessage, "esport_xtab_game_guess_widgets_update");
            }
        };
        if (iMessageManager != null) {
            String str2 = this.LJIIJJI;
            int iHashCode = str2.hashCode();
            if (iHashCode != -697920873) {
                if (iHashCode != 98708951) {
                    if (iHashCode == 109264530 && str2.equals("score")) {
                        iMessageManager.addMessageListener(this.LIZJ, (OnIMMessageListener) this.LJIIJ);
                        return;
                    }
                } else if (str2.equals("guess")) {
                    iMessageManager.addMessageListener(this.LIZIZ, (OnIMMessageListener) this.LJIIJ);
                    iMessageManager.addMessageListener(this.LIZLLL, (OnIMMessageListener) this.LJIIJ);
                    return;
                }
            } else if (str2.equals("schedule")) {
                iMessageManager.addMessageListener(this.LIZIZ, (OnIMMessageListener) this.LJIIJ);
                iMessageManager.addMessageListener(this.LIZLLL, (OnIMMessageListener) this.LJIIJ);
                return;
            }
            this.LJIIJ = null;
        }
    }
}
