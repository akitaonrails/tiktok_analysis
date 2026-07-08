package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.EmoteChatResult;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.text.a0;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0f6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1114400f6c implements InterfaceC1109220eyG {
    public final /* synthetic */ C1114360f6Y LIZ;
    public final /* synthetic */ C1114460f6i LIZIZ;

    public /* synthetic */ C1114400f6c(C1114360f6Y c1114360f6Y, C1114460f6i c1114460f6i) {
        this.LIZ = c1114360f6Y;
        this.LIZIZ = c1114460f6i;
    }

    @Override // X.InterfaceC1109220eyG
    public final void LIZ(final long j) {
        boolean z;
        String str;
        String str2;
        final C1114360f6Y c1114360f6Y = this.LIZ;
        final C1114460f6i c1114460f6i = this.LIZIZ;
        ((InterfaceC1114450f6h) c1114360f6Y.mView).oo1();
        DataChannel dataChannel = c1114360f6Y.dataChannel;
        List<EmoteModel> list = c1114460f6i.LIZ;
        if (ISendCommentEvent.Sender.QUICKEMOTECOMMENT == c1114460f6i.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (dataChannel != null) {
            String str3 = (String) DataChannelGlobal.LLILZ.gg0(C1148170fz5.class);
            String str4 = "comment";
            if (str3 == null) {
                str3 = "comment";
            }
            if (!a0.LJJJIL(str3)) {
                str4 = str3;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_live_emote");
            c474500IjALIZ.LJIJJLI(dataChannel);
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
            if (z) {
                str = "1";
            } else {
                str = "";
            }
            c474500IjALIZ.LJJII(str, "quick_comment_subscribe_type");
            c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS254S0000000_17.get$arr$(467), 30), "privilege_emotes_label");
            if (list.size() == 1) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "4";
            }
            c474500IjALIZ.LJJII(str2, "show_type");
            c474500IjALIZ.LJJII(str4, "show_entrance");
            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "connection_type");
            c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oE2(), "core_connection_type");
            c474500IjALIZ.LIZ();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("start_time", jCurrentTimeMillis, jSONObject);
        C510380Jzw.LJIL("subscription_send_emote_chat_request", jSONObject);
        C11NJ c11nj = c1114360f6Y.LLILLL;
        long id = c1114360f6Y.LLILLJJLI.getId();
        List<EmoteModel> list2 = c1114460f6i.LIZ;
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((CommentApi) C480460Ism.LIZLLL(CommentApi.class)).sendEmote(id, C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS254S0000000_17.get$arr$(102), 30)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0f6e
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1114360f6Y c1114360f6Y2 = c1114360f6Y;
                C1114460f6i c1114460f6i2 = c1114460f6i;
                long j2 = j;
                long j3 = jCurrentTimeMillis;
                BaseResponse baseResponse = (BaseResponse) obj;
                c1114360f6Y2.getClass();
                C1C7U.LIZ("CommentPresenter@1a6e.lambda$sendEmote$8$1L");
                if (c1114360f6Y2.mView != 0 && baseResponse.data != 0) {
                    ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).NL0(c1114360f6Y2.LLILLJJLI.getId(), j2, C181500mr.LIZIZ(c1114360f6Y2.LLILLJJLI.getId(), c1114460f6i2.LIZ, ((EmoteChatResult) baseResponse.data).msgId, UserService.getInstance().user().getCurrentUser(), ((EmoteChatResult) baseResponse.data).user));
                    ((InterfaceC1114450f6h) c1114360f6Y2.mView).Fj0((EmoteChatResult) baseResponse.data);
                    String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, baseResponse.data);
                    JSONObject jSONObject2 = new JSONObject();
                    if (json == null) {
                        json = "";
                    }
                    C0K04.LJFF("response", json, jSONObject2);
                    C0K04.LJ("cost", System.currentTimeMillis() - j3, jSONObject2);
                    C510380Jzw.LJIL("subscription_send_emote_chat_succeed", jSONObject2);
                    C1C7U.LIZIZ("CommentPresenter@1a6e.lambda$sendEmote$8$1L");
                    return;
                }
                C1C7U.LIZIZ("CommentPresenter@1a6e.lambda$sendEmote$8$1L");
            }
        }, new C09JN() { // from class: X.0f6g
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1114360f6Y c1114360f6Y2 = c1114360f6Y;
                long j2 = j;
                long j3 = jCurrentTimeMillis;
                Throwable th = (Throwable) obj;
                c1114360f6Y2.getClass();
                C1C7U.LIZ("CommentPresenter@1a6e.lambda$sendEmote$8$2L");
                if (c1114360f6Y2.mView == 0) {
                    C1C7U.LIZIZ("CommentPresenter@1a6e.lambda$sendEmote$8$2L");
                    return;
                }
                ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).hS(c1114360f6Y2.LLILLJJLI.getId(), j2);
                if (th instanceof Exception) {
                    ((InterfaceC1114450f6h) c1114360f6Y2.mView).XG2((Exception) th);
                }
                JSONObject jSONObject2 = new JSONObject();
                C0K02.LJIIJJI(th, jSONObject2);
                C0K04.LJ("cost", System.currentTimeMillis() - j3, jSONObject2);
                C510380Jzw.LJIL("subscription_send_emote_chat_failed", jSONObject2);
                C1C7U.LIZIZ("CommentPresenter@1a6e.lambda$sendEmote$8$2L");
            }
        }));
    }
}
