package X;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookQueueEntityStatusChannel;
import com.bytedance.android.livesdk.chatroom.api.SubQueue;
import com.bytedance.android.livesdk.model.message.SubQueueMessage;
import com.bytedance.android.livesdkapi.depend.model.live.QueueInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01f4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C388001f4 implements OnIMMessageListener, InterfaceC1098110egL, InterfaceC1141530foN {
    public IMessageManager LL;
    public Context LLILLJJLI;
    public boolean LLILLL;
    public DataChannel LLILZ;
    public C388101f5 LLILZIL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "sub_im_message";
    }

    @Override // X.InterfaceC1098110egL
    public final void onUnload() {
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        C1548820qPI.LJIIIIZZ("anchor_subscribe_queue_start", this);
        this.LLILLJJLI = null;
        this.LLILZ = null;
        this.LL = null;
        C388101f5 c388101f5 = this.LLILZIL;
        if (c388101f5 != null) {
            AnonymousClass0956 anonymousClass0956 = c388101f5.LJFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c388101f5.LJI.LJ();
        }
        this.LLILZIL = null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public final JSONObject LIZ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    LIZ(jSONObject2);
                    jSONObject.put(next, jSONObject2);
                } else if (obj instanceof Long) {
                    jSONObject.put(next, String.valueOf(((Number) obj).longValue()));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("SubQueueHelper", e);
            }
        }
        return jSONObject;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strAsString;
        String strAsString2;
        long jLongValue;
        int iAsInt;
        C388101f5 c388101f5;
        InterfaceC1871820yoG interfaceC1871820yoG;
        InterfaceC1871820yoG interfaceC1871820yoG2;
        InterfaceC1871820yoG interfaceC1871820yoG3;
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_subscribe_queue_start")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null || (interfaceC1871820yoG3 = interfaceC1107590evd.get("queue_name")) == null || (strAsString = interfaceC1871820yoG3.asString()) == null) {
                strAsString = "";
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (interfaceC1871820yoG2 = interfaceC1107590evd2.get("queue_id")) == null || (strAsString2 = interfaceC1871820yoG2.asString()) == null) {
                strAsString2 = CardStruct.IStatusCode.DEFAULT;
            }
            Long lLJJLIL = C500260Jjc.LJJLIL(strAsString2);
            if (lLJJLIL != null) {
                jLongValue = lLJJLIL.longValue();
            } else {
                jLongValue = 0;
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null && (interfaceC1871820yoG = interfaceC1107590evd3.get("queue_type")) != null) {
                iAsInt = interfaceC1871820yoG.asInt();
            } else {
                iAsInt = 0;
            }
            C388101f5 c388101f52 = this.LLILZIL;
            if (c388101f52 == null) {
                this.LLILZIL = new C388101f5(iAsInt, jLongValue, this.LLILZ, strAsString);
            } else {
                c388101f52.LIZ = jLongValue;
                c388101f52.LIZIZ = strAsString;
                c388101f52.LIZJ = iAsInt;
            }
            Context context = this.LLILLJJLI;
            if (context != null && (c388101f5 = this.LLILZIL) != null) {
                C23250099c.LIZLLL(c388101f5.LJ, null, null, new C388201f6(context, c388101f5, null), 3);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C388101f5 c388101f5;
        C388101f5 c388101f52;
        C11KS c11ksLJIIJ;
        Context context;
        C388101f5 c388101f53;
        if (iMessage instanceof SubQueueMessage) {
            try {
                JSONObject jSONObject = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, iMessage));
                LIZ(jSONObject);
                C389001fE.LIZ("live_subscription_queue_indicator_message", jSONObject, System.currentTimeMillis(), false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
            SubQueueMessage subQueueMessage = (SubQueueMessage) iMessage;
            int i = subQueueMessage.messageTypeAction;
            if (i != 2) {
                if (i != 3) {
                    long j = 0;
                    if (i != 4) {
                        if (i == 5 && (context = this.LLILLJJLI) != null && (c388101f53 = this.LLILZIL) != null) {
                            SubQueue subQueue = subQueueMessage.queue;
                            if (subQueue != null) {
                                j = subQueue.waitingCount;
                            }
                            c388101f53.LJ(j, context);
                            return;
                        }
                        return;
                    }
                    Context context2 = this.LLILLJJLI;
                    if (context2 == null || (c388101f52 = this.LLILZIL) == null) {
                        return;
                    }
                    User user = subQueueMessage.currentUser;
                    SubQueue subQueue2 = subQueueMessage.queue;
                    if (c388101f52.LIZ < 0) {
                        return;
                    }
                    AnonymousClass0956 anonymousClass0956 = c388101f52.LJFF;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C388801fC c388801fCLIZLLL = c388101f52.LIZLLL(c388101f52.LIZ);
                    C388501f9 c388501f9 = new C388501f9();
                    String strLJIJJ = C497740JfY.LJIJJ(2131855471, C0KVU.LIZ(user));
                    TextView textView = c388801fCLIZLLL.LLILLL;
                    if (textView != null) {
                        textView.setText(strLJIJJ);
                    }
                    if (subQueue2 != null) {
                        j = subQueue2.waitingCount;
                    }
                    c388801fCLIZLLL.LLILZLL.LJIIIIZZ = String.valueOf(j);
                    c388501f9.LIZ = EnumC395001gC.FADE;
                    InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
                    if (effectBoardService != null && (c11ksLJIIJ = effectBoardService.LJIIJ(context2, c388801fCLIZLLL, c388501f9)) != null) {
                        c388101f52.LJI.LIZ(c11ksLJIIJ.LJJIIZ(new C09JN() { // from class: X.00M0
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("QueueBoardPresent@5aad.updateBoard$1");
                                C1C7U.LIZIZ("QueueBoardPresent@5aad.updateBoard$1");
                            }
                        }, new C09JN() { // from class: X.00KB
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("QueueBoardPresent@5aad.updateBoard$2");
                                C766270U4b.LJIIJJI(((Throwable) obj).getMessage());
                                C1C7U.LIZIZ("QueueBoardPresent@5aad.updateBoard$2");
                            }
                        }));
                    }
                    c388101f52.LJFF = C23250099c.LIZLLL(c388101f52.LJ, null, null, new C388301f7(context2, c388101f52, null), 3);
                    return;
                }
                if (this.LLILLJJLI == null || (c388101f5 = this.LLILZIL) == null) {
                    return;
                }
                c388101f5.LIZIZ();
                return;
            }
            DataChannel dataChannel = this.LLILZ;
            if (dataChannel == null) {
                return;
            }
            dataChannel.zW(PlaybookQueueEntityStatusChannel.class, Boolean.TRUE);
        }
    }

    public final void LIZIZ(Context context, DataChannel dataChannel) {
        boolean z;
        IMessageManager iMessageManager;
        QueueInfo queueInfo;
        C388101f5 c388101f5;
        this.LLILLJJLI = context;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLL = z;
        this.LLILZ = dataChannel;
        DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.SUB_QUEUE_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        if (dataChannel != null) {
            C2659011d.LIZIZ(dataChannel, InterfaceC1098110egL.class, this, false);
        }
        if (this.LLILLL && C781520UlC.LJIIJJI(C751980Tee.LIZJ(dataChannel))) {
            C1548820qPI.LIZLLL("anchor_subscribe_queue_start", this);
            InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
            if (effectBoardService != null) {
                effectBoardService.LJIIL(null, new C387501ez());
            }
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            if (roomLJJLIIIIJ != null && (queueInfo = roomLJJLIIIIJ.queueInfo) != null && queueInfo.status == 2) {
                C388101f5 c388101f52 = this.LLILZIL;
                long jLongValue = 0;
                if (c388101f52 == null) {
                    Long lLJJLIL = C500260Jjc.LJJLIL(queueInfo.queueId);
                    if (lLJJLIL != null) {
                        jLongValue = lLJJLIL.longValue();
                    }
                    this.LLILZIL = new C388101f5(0, jLongValue, dataChannel, queueInfo.queueTitle);
                } else {
                    Long lLJJLIL2 = C500260Jjc.LJJLIL(queueInfo.queueId);
                    if (lLJJLIL2 != null) {
                        jLongValue = lLJJLIL2.longValue();
                    }
                    c388101f52.LIZ = jLongValue;
                    C388101f5 c388101f53 = this.LLILZIL;
                    if (c388101f53 != null) {
                        c388101f53.LIZIZ = queueInfo.queueTitle;
                    }
                }
                if (context != null && (c388101f5 = this.LLILZIL) != null) {
                    c388101f5.LIZ(queueInfo.memberCount, context);
                }
            }
        }
        IMessageManager iMessageManager2 = this.LL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.SUB_QUEUE_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
    }
}
