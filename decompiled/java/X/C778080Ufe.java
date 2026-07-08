package X;

import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Ufe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778080Ufe implements OnIMMessageListener, InterfaceC777850UfH {
    public final DataChannel LL;
    public IMessageManager LLILZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(235));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(234));
    public final ConcurrentHashMap<Class<? extends IMessage>, InterfaceC778470UgH<? extends IMessage>> LLILZIL = new ConcurrentHashMap<>();

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "GameInteractionNoticeStrategy";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public C778080Ufe(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void LIZ(IMessageManager iMessageManager) {
        if (this.LL == null || this.LLILZ != null) {
            return;
        }
        this.LLILZ = iMessageManager;
        this.LLILZIL.put(GoodyBagMessage.class, new C779000Uh8());
        this.LLILZIL.put(RedEnvelopMessage.class, new C0TLM());
        this.LLILZIL.put(LiveStreamGoalServerMessage.class, new C778980Uh6());
        Iterator<Class<? extends IMessage>> it2 = this.LLILZIL.keySet().iterator();
        while (it2.hasNext()) {
            InterfaceC778470UgH<? extends IMessage> interfaceC778470UgH = this.LLILZIL.get(it2.next());
            if (interfaceC778470UgH != null) {
                IMessageManager iMessageManager2 = this.LLILZ;
                if (iMessageManager2 != null) {
                    iMessageManager2.addAsyncMessageListener(interfaceC778470UgH.LIZ(), this);
                }
                interfaceC778470UgH.LIZIZ(this.LL);
            }
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            EnumC777480Ueg enumC777480Ueg = EnumC777480Ueg.GAME_INTERACTION;
            C777840UfG.LJI(enumC777480Ueg, this);
            C777840UfG.LIZ(enumC777480Ueg, this);
        }
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        if (abstractC777950UfR instanceof C778150Ufl) {
            C778150Ufl c778150Ufl = (C778150Ufl) abstractC777950UfR;
            C155100ib.LIZJ(c778150Ufl.LJ, c778150Ufl.LJFF);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            InterfaceC778470UgH<? extends IMessage> interfaceC778470UgH = this.LLILZIL.get(iMessage.getClass());
            if (interfaceC778470UgH != null) {
                interfaceC778470UgH.onMessage(iMessage);
            }
        }
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        String str;
        long id;
        if (abstractC777950UfR instanceof C778150Ufl) {
            if (enumC778130Ufj == EnumC778130Ufj.USER_CLICK) {
                C778150Ufl c778150Ufl = (C778150Ufl) abstractC777950UfR;
                String str2 = c778150Ufl.LJ;
                String str3 = c778150Ufl.LJFF;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_floating_interact_tips_close");
                c474500IjALIZ.LJJII(Long.valueOf(C155100ib.LIZ()), "anchor_id");
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                c474500IjALIZ.LJJII(str2, "tips_type");
                c474500IjALIZ.LJJII(str3, "content_type");
                c474500IjALIZ.LIZ();
            }
            C778150Ufl c778150Ufl2 = (C778150Ufl) abstractC777950UfR;
            C204543151x c204543151x = c778150Ufl2.LJII;
            if (c204543151x != null) {
                if (c204543151x.LIZ().contains(1)) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gift_guide_start_remind_toast");
                    c474500IjALIZ2.LJJII(Long.valueOf(((Number) this.LLILLL.getValue()).longValue()), "anchor_id");
                    c474500IjALIZ2.LJJII(String.valueOf(((Number) this.LLILLJJLI.getValue()).longValue()), "room_id");
                    c474500IjALIZ2.LJJII("game_cheer_moment", "toast_type");
                    c474500IjALIZ2.LJJII(c778150Ufl2.LJII.LJI(), "unique_id");
                    c474500IjALIZ2.LIZ();
                }
                if (c778150Ufl2.LJII.LIZ().contains(2)) {
                    int iLIZIZ = c778150Ufl2.LJII.LIZIZ();
                    if (iLIZIZ != 2) {
                        if (iLIZIZ != 3) {
                            str = "creator_won";
                        } else {
                            str = "creator_defeat";
                        }
                    } else {
                        str = "creator_splendid";
                    }
                    C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_highlight_moment_broadcast_show");
                    c474500IjALIZ3.LJJII(Long.valueOf(((Number) this.LLILLL.getValue()).longValue()), "anchor_id");
                    c474500IjALIZ3.LJJII(String.valueOf(((Number) this.LLILLJJLI.getValue()).longValue()), "room_id");
                    c474500IjALIZ3.LJJII("anchor", "user_type");
                    c474500IjALIZ3.LJJII("screen_share", "live_type");
                    c474500IjALIZ3.LJJII(str, "highlight_moment_type");
                    c474500IjALIZ3.LIZ();
                }
            }
        }
    }
}
