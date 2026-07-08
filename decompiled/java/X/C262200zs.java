package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.GameGuessEmoteUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.GameGuessMessageDisplayEvent;
import com.bytedance.android.livesdk.dataChannel.GameGuessPinCardEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.api.GameRevenueRetrofitApi;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;
import com.bytedance.android.livesdk.game.model.GuessRound;
import com.bytedance.android.livesdk.game.model.GuessRoundStats;
import com.bytedance.android.livesdk.game.model.GuessTemplate;
import com.bytedance.android.livesdk.game.model.GuessWidget;
import com.bytedance.android.livesdk.game.model.GuessWidgets;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSlideMemoryLeakFixSettingSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.GameEmoteUpdateMessage;
import com.bytedance.android.livesdk.model.message.GameGuessToastMessage;
import com.bytedance.android.livesdk.model.message.GameGuessWidgetsMessage;
import com.bytedance.android.livesdk.model.message.GameReqSetGuessMessage;
import com.bytedance.android.livesdk.model.message.GuessQuestionAuditMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.game.GuessReportLimitReq;
import webcast.api.game.GuessReqSendCapsuleReq;

/* JADX INFO: renamed from: X.00zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C262200zs implements InterfaceC753440Th0, OnIMMessageListener, InterfaceC1141530foN, InterfaceC1112400f3O {
    public Room LL;
    public IMessageManager LLILLJJLI;
    public GuessWidgets LLILLL;
    public GameGuessToastMessage LLILZ;
    public boolean LLILZIL;
    public DataChannel LLILZLL;
    public GameReqSetGuessMessage LLIZ;
    public C11JF LLJ;
    public C258100zD LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C5182020e(this, 620));
    public final C01GW LLJI = C452501pT.LIZIZ(new C5182020e(this, 621));

    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "guess_widgets";
    }

    @Override // X.InterfaceC753440Th0
    public final Integer LJIIJ() {
        List<GuessWidget> list;
        GuessWidget guessWidget;
        GuessRound guessRound;
        GuessRoundStats guessRoundStats;
        GuessWidgets guessWidgets = this.LLILLL;
        if (guessWidgets == null || (list = guessWidgets.guessWidgets) == null || (guessWidget = (GuessWidget) C13LP.LJJJLL(list)) == null || (guessRound = guessWidget.guessRound) == null || (guessRoundStats = guessRound.guessRoundStats) == null) {
            return null;
        }
        return Integer.valueOf((int) guessRoundStats.memberNums);
    }

    @Override // X.InterfaceC753440Th0
    public final void LJIILL() {
        ((AnonymousClass0100) this.LLJI.getValue()).LIZJ();
        if (LiveSlideMemoryLeakFixSettingSetting.INSTANCE.getValue()) {
            LJJJIL();
        }
    }

    @Override // X.InterfaceC753440Th0
    public final List<String> LJIJJLI() {
        List<GuessWidget> list;
        String str;
        GuessWidgets guessWidgets = this.LLILLL;
        ArrayList arrayList = null;
        if (guessWidgets != null && (list = guessWidgets.guessWidgets) != null) {
            ArrayList<GuessWidget> arrayList2 = new ArrayList();
            for (GuessWidget guessWidget : list) {
                GuessRound guessRound = guessWidget.guessRound;
                if (guessRound != null && (guessRound.guessStatus == 0 || guessRound.guessStatus == 1)) {
                    arrayList2.add(guessWidget);
                }
            }
            for (GuessWidget guessWidget2 : arrayList2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                GuessRound guessRound2 = guessWidget2.guessRound;
                if (guessRound2 == null || (str = guessRound2.roundIdStr) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC753440Th0
    public final void LJJIII() {
        if (LiveSlideMemoryLeakFixSettingSetting.INSTANCE.getValue()) {
            IMessageManager iMessageManager = this.LLILLJJLI;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) this);
            }
            C1548820qPI.LJIIIIZZ("game_guessing_indicator_loaded", this);
            C1548820qPI.LJIIIIZZ("game_guess_widgets_update", this);
            C1548820qPI.LJIIIIZZ("game_guessing_vote_to_indicator", this);
        }
        ((AnonymousClass0100) this.LLJI.getValue()).LIZIZ(true);
    }

    @Override // X.InterfaceC753440Th0
    public final GameGuessToastMessage LJJIIJZLJL() {
        if (!LJJIL(this.LLILZ)) {
            this.LLILZ = null;
        }
        return this.LLILZ;
    }

    public final C262300zt LJJIZ() {
        return (C262300zt) this.LLIZLLLIL.getValue();
    }

    public final String LJJJ() {
        GuessWidgets guessWidgets;
        List<GuessWidget> list;
        GuessWidget guessWidget;
        GuessRound guessRound;
        String str;
        List<GuessWidget> list2;
        GuessWidgets guessWidgets2 = this.LLILLL;
        return (!C500260Jjc.LJJJI((guessWidgets2 == null || (list2 = guessWidgets2.guessWidgets) == null) ? null : Boolean.valueOf(list2.isEmpty() ^ true)) || (guessWidgets = this.LLILLL) == null || (list = guessWidgets.guessWidgets) == null || (guessWidget = (GuessWidget) ListProtector.get(list, 0)) == null || (guessRound = guessWidget.guessRound) == null || (str = guessRound.roundIdStr) == null) ? "" : str;
    }

    public final void LJJJIL() {
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.GAME_GUESS_WIDGETS_MESSAGE.getIntType(), (OnIMMessageListener) this);
            iMessageManager.addMessageListener(C001A.GAME_GUESS_TOAST_MESSAGE.getIntType(), (OnIMMessageListener) this);
            iMessageManager.addMessageListener(C001A.GUESS_QUESTION_AUDIT_MESSAGE.getIntType(), (OnIMMessageListener) this);
            iMessageManager.addMessageListener(C001A.GAME_EMOTE_UPDATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            if (this.LLILZIL) {
                iMessageManager.addMessageListener(C001A.GAME_REQ_SET_GUESS_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
            C1548820qPI.LIZLLL("game_guessing_indicator_loaded", this);
            C1548820qPI.LIZLLL("game_guess_widgets_update", this);
            C1548820qPI.LIZLLL("game_guessing_vote_to_indicator", this);
        }
    }

    public final void LJJJJ() {
        String idStr;
        Room room = this.LL;
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        C11JF c11jf = this.LLJ;
        if (C500260Jjc.LJJIJIL(c11jf != null ? Boolean.valueOf(c11jf.isDisposed()) : null)) {
            C480460Ism.LIZ().getClass();
            GameRevenueRetrofitApi gameRevenueRetrofitApi = (GameRevenueRetrofitApi) C480460Ism.LIZLLL(GameRevenueRetrofitApi.class);
            GuessReportLimitReq guessReportLimitReq = new GuessReportLimitReq();
            guessReportLimitReq.roomIdStr = idStr;
            this.LLJ = (C11JF) gameRevenueRetrofitApi.reportUserWantGuessLimited(guessReportLimitReq).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00zv
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("GameLiveGuessInfoController@64b2.reportUserRequestGuessLimit$2");
                    C1C7U.LIZIZ("GameLiveGuessInfoController@64b2.reportUserRequestGuessLimit$2");
                }
            }, new C516201zk(this, 324));
        }
    }

    @Override // X.InterfaceC753440Th0
    public final void onUnload() {
        C2660011e c2660011e;
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null && (c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class)) != null) {
            ((ConcurrentHashMap) c2660011e.LIZ).remove(InterfaceC753440Th0.class);
        }
        if (this.LLILZIL) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).cL0(41, this);
        }
        C258100zD c258100zD = this.LLJIJIL;
        if (c258100zD != null) {
            c258100zD.LJI();
        }
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        C1548820qPI.LJIIIIZZ("game_guessing_indicator_loaded", this);
        C1548820qPI.LJIIIIZZ("game_guess_widgets_update", this);
        C1548820qPI.LJIIIIZZ("game_guessing_vote_to_indicator", this);
        this.LLILZLL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LL = null;
        this.LLIZ = null;
        C11JF c11jf = this.LLJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJ = null;
        C262300zt c262300ztLJJIZ = LJJIZ();
        if (c262300ztLJJIZ.LIZIZ) {
            C11JF c11jf2 = c262300ztLJJIZ.LIZLLL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            c262300ztLJJIZ.LIZLLL = null;
            c262300ztLJJIZ.LJIIIIZZ = 0;
        }
        C11JF c11jf3 = c262300ztLJJIZ.LJ;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        c262300ztLJJIZ.LJ = null;
        ((AnonymousClass0100) this.LLJI.getValue()).LIZIZ(false);
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return C952230at3.LIZ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // X.InterfaceC1112400f3O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(X.C1112330f3H r6) {
        /*
            r5 = this;
            X.00zt r4 = r5.LJJIZ()
            com.bytedance.android.livesdk.model.message.GameReqSetGuessMessage r0 = r5.LLIZ
            if (r0 == 0) goto Lf
            r4.getClass()
            java.lang.String r3 = r0.requestCntStr
            if (r3 != 0) goto L11
        Lf:
            java.lang.String r3 = "0"
        L11:
            int r2 = r4.LJIIIIZZ
            java.lang.String r1 = "click"
            r0 = 3
            r4.LIZJ(r0, r2, r1, r3)
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r5.LLILZLL
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "open_page_time"
            r2.put(r0, r1)
            java.lang.String r1 = "extra_entrance"
            java.lang.String r0 = "capsule"
            r2.put(r1, r0)
            X.0ez9 r0 = r6.LLIIIILZ()
            android.content.Context r1 = r0.LIZ
            java.lang.String r0 = "audience_request"
            X.C753430Tgz.LJIIL(r0, r2, r3, r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262200zs.LJIIIZ(X.0f3H):boolean");
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
        LJIILJJIL(EnumC262400zu.GUESS_MSG_REQ_GUESS.ordinal(), 3, "publicScreen", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // X.InterfaceC753440Th0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r6) {
        /*
            r5 = this;
            X.00zu r0 = X.EnumC262400zu.GUESS_MSG_REQ_GUESS
            int r0 = r0.ordinal()
            java.lang.String r4 = "click"
            if (r6 != r0) goto L22
            X.00zt r3 = r5.LJJIZ()
            com.bytedance.android.livesdk.model.message.GameReqSetGuessMessage r0 = r5.LLIZ
            if (r0 == 0) goto L19
            r3.getClass()
            java.lang.String r2 = r0.requestCntStr
            if (r2 != 0) goto L1b
        L19:
            java.lang.String r2 = "0"
        L1b:
            int r1 = r3.LJIIIIZZ
            r0 = 2
            r3.LIZJ(r0, r1, r4, r2)
        L21:
            return
        L22:
            X.00zu r0 = X.EnumC262400zu.GUESS_MSG_GUESS_RESULT
            int r0 = r0.ordinal()
            if (r6 != r0) goto L21
            java.lang.String r0 = "livesdk_guessing_anchor_tips_popup"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LL
            r2 = 0
            if (r0 == 0) goto L66
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L3d:
            r3.LJJIJIIJI(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LL
            if (r0 == 0) goto L4c
            long r0 = r0.getOwnerUserId()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L4c:
            r3.LJI(r2)
            java.lang.String r1 = r5.LJJJ()
            java.lang.String r0 = "round_id"
            r3.LJJII(r1, r0)
            r3.LJ(r4)
            java.lang.String r1 = "position"
            java.lang.String r0 = "outofapp"
            r3.LJJII(r0, r1)
            r3.LIZ()
            return
        L66:
            r0 = r2
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262200zs.LJJI(int):void");
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(com.bytedance.android.livesdk.model.message.GameGuessToastMessage r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L58
            java.lang.String r4 = r6.roundIdStr
        L5:
            com.bytedance.android.livesdk.game.model.GuessWidgets r0 = r5.LLILLL
            if (r0 == 0) goto L56
            java.util.List<com.bytedance.android.livesdk.game.model.GuessWidget> r0 = r0.guessWidgets
            if (r0 == 0) goto L56
            java.util.Iterator r2 = r0.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.game.model.GuessWidget r0 = (com.bytedance.android.livesdk.game.model.GuessWidget) r0
            com.bytedance.android.livesdk.game.model.GuessRound r0 = r0.guessRound
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.roundIdStr
        L24:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L11
        L2a:
            com.bytedance.android.livesdk.game.model.GuessWidget r1 = (com.bytedance.android.livesdk.game.model.GuessWidget) r1
            if (r1 == 0) goto L56
            com.bytedance.android.livesdk.game.model.GuessRound r2 = r1.guessRound
            if (r2 == 0) goto L34
            java.lang.String r3 = r2.creatorId
        L34:
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L5a
            int r1 = r2.guessStatus
            r0 = 1
            if (r1 == 0) goto L51
            if (r1 != r0) goto L5a
        L51:
            return r0
        L52:
            r0 = r3
            goto L24
        L54:
            r1 = r3
            goto L2a
        L56:
            r2 = r3
            goto L34
        L58:
            r4 = r3
            goto L5
        L5a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262200zs.LJJIL(com.bytedance.android.livesdk.model.message.GameGuessToastMessage):boolean");
    }

    public final void LJJJI(DataChannel dataChannel) {
        boolean z;
        Room room;
        IMessageManager iMessageManager;
        boolean z2;
        Room room2;
        String str;
        LifecycleOwner lifecycleOwner;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        this.LLILZLL = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LL = room;
        if (room != null) {
            this.LLILLL = room.getGuessWidgets();
        }
        if (this.LLILZIL) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(41, this);
        }
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILLJJLI = iMessageManager;
        LJJJIL();
        if (dataChannel != null) {
            C2659011d.LIZIZ(dataChannel, InterfaceC753440Th0.class, this, false);
        }
        C262300zt c262300ztLJJIZ = LJJIZ();
        DataChannel dataChannel2 = c262300ztLJJIZ.LIZ;
        if (dataChannel2 != null && C500260Jjc.LJIIZILJ(dataChannel2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        c262300ztLJJIZ.LIZIZ = z2;
        DataChannel dataChannel3 = c262300ztLJJIZ.LIZ;
        if (dataChannel3 != null) {
            room2 = (Room) dataChannel3.gg0(RoomChannel.class);
        } else {
            room2 = null;
        }
        c262300ztLJJIZ.LIZJ = room2;
        DataChannel dataChannel4 = c262300ztLJJIZ.LIZ;
        if (dataChannel4 != null && (lifecycleOwner = dataChannel4.LLILZ) != null) {
            dataChannel4.CQ2(GameGuessPinCardEvent.class, lifecycleOwner, new C5183020f(c262300ztLJJIZ, 341));
        }
        ((AnonymousClass0100) this.LLJI.getValue()).LIZJ();
        Room room3 = this.LL;
        if (room3 != null && (str = room3.roomCreateAbParam) != null && !a0.LJJJIL(str)) {
            try {
                if (new JSONObject(str).optBoolean("enable_guessing_onboard_2", false)) {
                    C258100zD c258100zD = this.LLJIJIL;
                    if (c258100zD != null) {
                        c258100zD.LJI();
                    }
                    C258100zD c258100zD2 = new C258100zD(this.LLILZIL);
                    this.LLJIJIL = c258100zD2;
                    c258100zD2.LJFF(dataChannel);
                    LJJJJIZL(null, this.LLILLL);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        GuessWidgets guessWidgets;
        GuessWidget guessWidget;
        GuessRound guessRound;
        String string;
        C258100zD c258100zD;
        C258200zE c258200zE;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        String string2 = null;
        if (iHashCode != 256394734) {
            if (iHashCode != 306688316) {
                if (iHashCode == 548047961 && str.equals("game_guessing_vote_to_indicator")) {
                    try {
                        Map<String, Object> map = C1338270kvh.LIZ;
                        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                        if (interfaceC1107590evd == null || (string = interfaceC1107590evd.getString("widgetRoundId")) == null) {
                            string = "";
                        }
                        if (C500260Jjc.LJJIIZ(string) && (c258100zD = this.LLJIJIL) != null && (c258200zE = c258100zD.LJFF) != null) {
                            c258200zE.LJ.add(string);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("GameLiveGuessController", e);
                        return;
                    }
                }
                return;
            }
            if (str.equals("game_guessing_indicator_loaded") && (guessWidgets = this.LLILLL) != null && (guessWidget = (GuessWidget) C13LP.LJJJLZIJ(0, guessWidgets.guessWidgets)) != null && (guessRound = guessWidget.guessRound) != null) {
                if (guessRound.guessStatus == 0 || guessRound.guessStatus == 1) {
                    LJJJJI(guessWidgets, "game_guessing_indicator_start");
                    return;
                }
                return;
            }
            return;
        }
        if (str.equals("game_guess_widgets_update")) {
            try {
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    string2 = interfaceC1107590evd2.getString("data");
                }
                LJJJJIZL(this.LLILLL, (GuessWidgets) C19748512Ol.LIZIZ.LJII(string2, GuessWidgets.class));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJI("GameLiveGuessController", e2);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        GameEmoteUpdateMessage gameEmoteUpdateMessage;
        GameEmotesTab gameEmotesTab;
        Room room;
        String str;
        Room room2;
        Long lValueOf;
        Long lValueOf2;
        String str2;
        String str3;
        if (iMessage instanceof GameGuessWidgetsMessage) {
            LJJJJIZL(this.LLILLL, ((GameGuessWidgetsMessage) iMessage).guessWidgets);
            return;
        }
        if (iMessage instanceof GuessQuestionAuditMessage) {
            GuessTemplate guessTemplate = ((GuessQuestionAuditMessage) iMessage).guessTemplate;
            if (guessTemplate == null) {
                return;
            }
            C262300zt c262300ztLJJIZ = LJJIZ();
            c262300ztLJJIZ.getClass();
            if (guessTemplate.auditStatus == 2) {
                if (c262300ztLJJIZ.LIZIZ) {
                    DataChannel dataChannel = c262300ztLJJIZ.LIZ;
                    if (dataChannel != null) {
                        dataChannel.LC0(GameGuessMessageDisplayEvent.class, new C774740UaG(C497740JfY.LJIJI(2131851979), EnumC262400zu.GUESS_MSG_AUDIT_STATUS.ordinal(), null, null, 10000L, 26));
                    }
                } else {
                    C766270U4b.LJIIIIZZ(10000L, C497740JfY.LJII(), C497740JfY.LJIJI(2131851979));
                }
            }
            LJJJJI(guessTemplate, "guess_question_audit_result_update");
            return;
        }
        if (iMessage instanceof GameGuessToastMessage) {
            GameGuessToastMessage gameGuessToastMessage = (GameGuessToastMessage) iMessage;
            if (!LJJIL(gameGuessToastMessage)) {
                return;
            }
            this.LLILZ = gameGuessToastMessage;
            LJJJJI(gameGuessToastMessage, "game_guessing_recognize_result");
            C262300zt c262300ztLJJIZ2 = LJJIZ();
            c262300ztLJJIZ2.getClass();
            if (!gameGuessToastMessage.showType && c262300ztLJJIZ2.LIZIZ) {
                return;
            }
            String strLIZ = C297401Dg.LIZ(gameGuessToastMessage.titleStarlingKey);
            if (TextUtils.isEmpty(strLIZ)) {
                return;
            }
            String strJ4 = C786410Ut5.j4(strLIZ, Arrays.copyOf(new Object[]{C297401Dg.LIZ(gameGuessToastMessage.resultStarlingKey)}, 1));
            DataChannel dataChannel2 = c262300ztLJJIZ2.LIZ;
            if (dataChannel2 != null) {
                room2 = (Room) dataChannel2.gg0(RoomChannel.class);
            } else {
                room2 = null;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_guessing_result_suggestions");
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJIJIIJI(lValueOf);
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJI(lValueOf2);
            c474500IjALIZ.LJJII("show", "action_type");
            if (c262300ztLJJIZ2.LIZIZ) {
                str2 = "anchor";
            } else {
                str2 = "moderator";
            }
            c474500IjALIZ.LJJII(str2, "user_type");
            c474500IjALIZ.LJJII(gameGuessToastMessage.roundIdStr, "round_id");
            if (c262300ztLJJIZ2.LIZIZ) {
                str3 = gameGuessToastMessage.showRankStr;
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "show_rank");
            c474500IjALIZ.LJIJJLI(c262300ztLJJIZ2.LIZ);
            c474500IjALIZ.LIZ();
            if (!c262300ztLJJIZ2.LIZIZ) {
                C766270U4b.LJIIIIZZ(10000L, ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopContext(), strJ4);
            } else {
                DataChannel dataChannel3 = c262300ztLJJIZ2.LIZ;
                if (dataChannel3 != null) {
                    dataChannel3.LC0(GameGuessMessageDisplayEvent.class, new C774740UaG(strJ4, EnumC262400zu.GUESS_MSG_SUGGEST.ordinal(), null, null, 10000L, 26));
                }
            }
            C11JF c11jf = c262300ztLJJIZ2.LJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c262300ztLJJIZ2.LJ = null;
            return;
        }
        String strJ42 = "";
        if (iMessage instanceof GameReqSetGuessMessage) {
            GameReqSetGuessMessage gameReqSetGuessMessage = (GameReqSetGuessMessage) iMessage;
            if (LJJIZ().LJIIIIZZ >= CastIntegerProtector.parseInt(gameReqSetGuessMessage.limitSupremacyStr)) {
                LJJJJ();
                return;
            }
            this.LLIZ = gameReqSetGuessMessage;
            C262300zt c262300ztLJJIZ3 = LJJIZ();
            c262300ztLJJIZ3.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(3, 1);
            linkedHashMap.put(1, 1);
            linkedHashMap.put(2, Integer.valueOf(CastIntegerProtector.parseInt(gameReqSetGuessMessage.limitSupremacyStr)));
            Text text = gameReqSetGuessMessage.toastContext;
            if (text == null || (str = text.key) == null) {
                str = "";
            }
            String strLIZ2 = C297401Dg.LIZ(str);
            if (strLIZ2.length() > 0) {
                strJ42 = C786410Ut5.j4(strLIZ2, Arrays.copyOf(new Object[]{gameReqSetGuessMessage.capsuleCntStr}, 1));
            }
            C774740UaG c774740UaG = new C774740UaG(strJ42, EnumC262400zu.GUESS_MSG_REQ_GUESS.ordinal(), linkedHashMap, C2097608Jq.LJIIZILJ((Map) c262300ztLJJIZ3.LJII.getValue()), 10000L, 2);
            DataChannel dataChannel4 = c262300ztLJJIZ3.LIZ;
            if (dataChannel4 == null) {
                return;
            }
            dataChannel4.LC0(GameGuessMessageDisplayEvent.class, c774740UaG);
            return;
        }
        if (!(iMessage instanceof GameEmoteUpdateMessage) || (gameEmotesTab = (gameEmoteUpdateMessage = (GameEmoteUpdateMessage) iMessage).gameEmotesTab) == null) {
            return;
        }
        if (gameEmotesTab.usableGuessingEmotes == null && gameEmotesTab.unusableGuessingEmotes == null) {
            return;
        }
        DataChannel dataChannel5 = this.LLILZLL;
        if (dataChannel5 != null && (room = (Room) dataChannel5.gg0(RoomChannel.class)) != null) {
            room.gameEmotesTab = gameEmoteUpdateMessage.gameEmotesTab;
        }
        DataChannelGlobal.LLILZ.HQ2(GameGuessEmoteUpdateChannel.class, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIJLIJ(com.bytedance.android.livesdk.game.model.GuessWidget r2, int r3) {
        /*
            r1 = 0
            if (r2 == 0) goto L17
            com.bytedance.android.livesdk.game.model.GuessRound r0 = r2.guessRound
            if (r0 == 0) goto Ld
            int r0 = r0.guessStatus
            if (r0 < 0) goto L16
            if (r2 == 0) goto L17
        Ld:
            com.bytedance.android.livesdk.game.model.GuessRound r0 = r2.guessRound
            if (r0 == 0) goto L17
            int r0 = r0.guessStatus
        L13:
            if (r0 > r3) goto L16
            r1 = 1
        L16:
            return r1
        L17:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262200zs.LJJIJLIJ(com.bytedance.android.livesdk.game.model.GuessWidget, int):boolean");
    }

    public final void LJJJJI(Object obj, String str) {
        Boolean bool;
        try {
            DataChannel dataChannel = this.LLILZLL;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(C0TZM.class);
            } else {
                bool = null;
            }
            if (C500260Jjc.LJJIJIIJIL(bool)) {
                return;
            }
            try {
                String strLJIILL = C19748512Ol.LIZIZ.LJIILL(obj);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", strLJIILL);
                AnonymousClass0104.LIZIZ(jSONObject);
                C389001fE.LIZ(str, jSONObject, System.currentTimeMillis(), false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("GameGuessingUtils", e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJI("GameLiveGuessController", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJJJJIZL(com.bytedance.android.livesdk.game.model.GuessWidgets r18, com.bytedance.android.livesdk.game.model.GuessWidgets r19) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262200zs.LJJJJIZL(com.bytedance.android.livesdk.game.model.GuessWidgets, com.bytedance.android.livesdk.game.model.GuessWidgets):void");
    }

    @Override // X.InterfaceC753440Th0
    public final void LJIILJJIL(int i, int i2, String str, boolean z) {
        Long lValueOf;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String idStr;
        Long lValueOf2 = null;
        Boolean boolValueOf = null;
        if (i == EnumC262400zu.GUESS_MSG_REQ_GUESS.ordinal()) {
            C262300zt c262300ztLJJIZ = LJJIZ();
            GameReqSetGuessMessage gameReqSetGuessMessage = this.LLIZ;
            c262300ztLJJIZ.getClass();
            if (!z) {
                String str7 = CardStruct.IStatusCode.DEFAULT;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (Intrinsics.LJFF(str, "broadcast") && gameReqSetGuessMessage != null) {
                                String str8 = gameReqSetGuessMessage.capsuleCntStr;
                                Room room = c262300ztLJJIZ.LIZJ;
                                if (room == null || (idStr = room.getIdStr()) == null) {
                                    idStr = "";
                                }
                                C11JF c11jf = c262300ztLJJIZ.LIZLLL;
                                if (c11jf != null) {
                                    boolValueOf = Boolean.valueOf(c11jf.isDisposed());
                                }
                                if (C500260Jjc.LJJIJIL(boolValueOf)) {
                                    C480460Ism.LIZ().getClass();
                                    GameRevenueRetrofitApi gameRevenueRetrofitApi = (GameRevenueRetrofitApi) C480460Ism.LIZLLL(GameRevenueRetrofitApi.class);
                                    GuessReqSendCapsuleReq guessReqSendCapsuleReq = new GuessReqSendCapsuleReq();
                                    guessReqSendCapsuleReq.capsuleCntStr = str8;
                                    guessReqSendCapsuleReq.roomIdStr = idStr;
                                    c262300ztLJJIZ.LIZLLL = (C11JF) gameRevenueRetrofitApi.requestUserWantGuessSendCapsule(guessReqSendCapsuleReq).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Mo
                                        @Override // X.C09JN
                                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                            C1C7U.LIZ("GuessMessageDisplayManager@eb9f.handleUserReqGuessMessageDisplayResult$2");
                                            C1C7U.LIZIZ("GuessMessageDisplayManager@eb9f.handleUserReqGuessMessageDisplayResult$2");
                                        }
                                    }, new C516201zk(c262300ztLJJIZ, 320));
                                }
                            } else if (Intrinsics.LJFF(str, "publicScreen")) {
                                int i3 = c262300ztLJJIZ.LJIIIIZZ + 1;
                                c262300ztLJJIZ.LJIIIIZZ = i3;
                                if (gameReqSetGuessMessage != null && (str6 = gameReqSetGuessMessage.requestCntStr) != null) {
                                    str7 = str6;
                                }
                                c262300ztLJJIZ.LIZJ(3, i3, "show", str7);
                                c262300ztLJJIZ.LIZ(3);
                            }
                        }
                    } else {
                        int i4 = c262300ztLJJIZ.LJIIIIZZ + 1;
                        c262300ztLJJIZ.LJIIIIZZ = i4;
                        if (gameReqSetGuessMessage != null && (str5 = gameReqSetGuessMessage.requestCntStr) != null) {
                            str7 = str5;
                        }
                        c262300ztLJJIZ.LIZJ(2, i4, "show", str7);
                        c262300ztLJJIZ.LIZ(2);
                    }
                } else {
                    int i5 = c262300ztLJJIZ.LJIIIIZZ + 1;
                    c262300ztLJJIZ.LJIIIIZZ = i5;
                    if (gameReqSetGuessMessage != null && (str4 = gameReqSetGuessMessage.requestCntStr) != null) {
                        str7 = str4;
                    }
                    c262300ztLJJIZ.LIZJ(1, i5, "show", str7);
                    c262300ztLJJIZ.LIZ(1);
                }
            }
            int i6 = LJJIZ().LJIIIIZZ;
            GameReqSetGuessMessage gameReqSetGuessMessage2 = this.LLIZ;
            if (gameReqSetGuessMessage2 != null && (str3 = gameReqSetGuessMessage2.limitSupremacyStr) != null && i6 >= CastIntegerProtector.parseInt(str3)) {
                LJJJJ();
                return;
            }
            return;
        }
        if (i == EnumC262400zu.GUESS_MSG_GUESS_RESULT.ordinal()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guessing_anchor_tips_popup");
            Room room2 = this.LL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJIJIIJI(lValueOf);
            Room room3 = this.LL;
            if (room3 != null) {
                lValueOf2 = Long.valueOf(room3.getOwnerUserId());
            }
            c474500IjALIZ.LJI(lValueOf2);
            c474500IjALIZ.LJJII(LJJJ(), "round_id");
            c474500IjALIZ.LJ("show");
            if (i2 == 2) {
                str2 = "outofapp";
            } else {
                str2 = "inapp";
            }
            c474500IjALIZ.LJJII(str2, "position");
            c474500IjALIZ.LIZ();
        }
    }
}
