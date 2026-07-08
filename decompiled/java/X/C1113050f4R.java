package X;

import Y.AObjectS392S0100000_17;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.event.CommentCountChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSlowFunctionOptABSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePublicScreenVisibleLogSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenChainLogConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSeiAlignOptSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import qo2.w;
import webcast.data.UserIdentity;

/* JADX INFO: renamed from: X.0f4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113050f4R extends AbstractC1113150f4b {
    public final ConcurrentHashMap<Long, AbstractC1110800f0o<?>> LJJZZIII = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, AbstractC1110800f0o<?>> LJL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, C1113230f4j> LJLI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Integer> LJLIIIL;
    public boolean LJLIIL;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public long LLF;
    public View LLFF;
    public AObjectS392S0100000_17 LLFFF;
    public final C1112420f3Q LLFII;
    public final LivePublicScreenChainLogConfigSetting LLFZ;
    public final C1113100f4W LLI;
    public List<String> LLIFFJFJJ;

    @Override // X.AbstractC1113070f4T
    public final void LJJJJL() {
        this.LJLJJLL = 0;
        this.LJLJL = 0;
        this.LJLJJL = 0;
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        this.LJLL = 0;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LL = 0;
        this.LLD = 0;
        this.LJLZ = 0;
        this.LJZ = 0;
        this.LJZI = 0;
        this.LJZL = 0;
        this.LJLLLLLL = 0;
        this.LJLLL = 0;
        this.LJLLLL = 0;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJIII() {
        C1113170f4d c1113170f4d = this.LLI.LIZLLL;
        if (c1113170f4d == null || c1113170f4d.LJ) {
            return;
        }
        C1113280f4o c1113280f4o = (C1113280f4o) ((LinkedHashMap) c1113170f4d.LIZIZ).get(Integer.valueOf(c1113170f4d.LIZJ));
        if (c1113280f4o != null) {
            c1113280f4o.LIZIZ = SystemClock.uptimeMillis();
        }
        c1113170f4d.LIZJ++;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJIIJZLJL() {
        C1113170f4d c1113170f4d = this.LLI.LIZLLL;
        if (c1113170f4d == null || c1113170f4d.LJ) {
            return;
        }
        Map<Integer, C1113280f4o> map = c1113170f4d.LIZIZ;
        Integer numValueOf = Integer.valueOf(c1113170f4d.LIZJ);
        C1113280f4o c1113280f4o = new C1113280f4o();
        c1113280f4o.LIZ = SystemClock.uptimeMillis();
        map.put(numValueOf, c1113280f4o);
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJIJL() {
        this.LL++;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0f3Q] */
    public C1113050f4R() {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        this.LJLIIIL = concurrentHashMap;
        this.LJLIIL = true;
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LLFII = new AbstractC1110770f0l() { // from class: X.0f3Q
            @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
            public final void LJJIFFI(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
                int i;
                int i2;
                if (LivePublicScreenVisibleLogSetting.INSTANCE.getValue() && (i = abstractC1111810f2R.LIZJ) > 0 && (i2 = abstractC1111810f2R.LIZLLL) > 0) {
                    C1113050f4R c1113050f4R = this.LIZIZ;
                    c1113050f4R.LJLZ = i;
                    c1113050f4R.LJZ = i2;
                }
            }

            @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
            public final void LJJIJIIJIL(RecyclerView recyclerView) {
                C1112760f3y c1112760f3y;
                AObjectS392S0100000_17 aObjectS392S0100000_17 = this.LIZIZ.LLFFF;
                if (aObjectS392S0100000_17 != null && (c1112760f3y = (C1112760f3y) aObjectS392S0100000_17.invoke()) != null) {
                    C1113050f4R c1113050f4R = this.LIZIZ;
                    c1113050f4R.LJZI = c1112760f3y.LIZ;
                    c1113050f4R.LJZL = c1112760f3y.LIZIZ;
                }
            }

            @Override // X.AbstractC1110770f0l, X.InterfaceC1112100f2u
            public final void LJIJJ(int i, int i2, int i3, int i4) {
                C1113050f4R c1113050f4R = this.LIZIZ;
                c1113050f4R.LJLIL = i2;
                c1113050f4R.LJLILLLLZI = i4;
                c1113050f4R.LJLJI = i;
                c1113050f4R.LJLJJI = i3;
            }
        };
        this.LLFZ = LivePublicScreenChainLogConfigSetting.INSTANCE;
        this.LLI = new C1113100f4W();
        concurrentHashMap.put("msg_anchor_comment_effective_cnt", 0);
        concurrentHashMap.put("msg_gifter_comment_effective_cnt", 0);
        concurrentHashMap.put("msg_moderator_comment_effective_cnt", 0);
        concurrentHashMap.put("msg_friends_comment_effective_cnt", 0);
        concurrentHashMap.put("msg_fans_comment_effective_cnt", 0);
        concurrentHashMap.put("msg_subscriber_comment_effective_cnt", 0);
        concurrentHashMap.put("drop_anchor_comment_cnt", 0);
        concurrentHashMap.put("drop_gifter_comment_cnt", 0);
        concurrentHashMap.put("drop_moderator_comment_cnt", 0);
        concurrentHashMap.put("drop_friends_comment_cnt", 0);
        concurrentHashMap.put("drop_fans_comment_cnt", 0);
        concurrentHashMap.put("drop_subscriber_comment_cnt", 0);
        concurrentHashMap.put("msg_anchor_comment_cnt", 0);
        concurrentHashMap.put("msg_gifter_comment_cnt", 0);
        concurrentHashMap.put("msg_moderator_comment_cnt", 0);
        concurrentHashMap.put("msg_friends_comment_cnt", 0);
        concurrentHashMap.put("msg_subscriber_comment_cnt", 0);
        concurrentHashMap.put("msg_fans_comment_cnt", 0);
        this.LLIFFJFJJ = C13BV.INSTANCE;
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void onResume() {
        super.onResume();
        this.LLI.LIZ();
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void onUnload() {
        super.onUnload();
        this.LLFF = null;
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        UserIdentity userIdentityLLJJJJLIIL;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        super.LJ(interfaceC1112060f2q);
        if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
            AbstractC1110800f0o<?> abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
            MESSAGE message = abstractC1110800f0o.LJIL;
            if (((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) && (userIdentityLLJJJJLIIL = abstractC1110800f0o.LLJJJJLIIL()) != null) {
                int iIntValue6 = 0;
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap = this.LJLIIIL;
                    Integer num = concurrentHashMap.get("msg_anchor_comment_effective_cnt");
                    if (num != null) {
                        iIntValue5 = num.intValue() + 1;
                    } else {
                        iIntValue5 = 0;
                    }
                    concurrentHashMap.put("msg_anchor_comment_effective_cnt", Integer.valueOf(iIntValue5));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isGiftGiverOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap2 = this.LJLIIIL;
                    Integer num2 = concurrentHashMap2.get("msg_gifter_comment_effective_cnt");
                    if (num2 != null) {
                        iIntValue4 = num2.intValue() + 1;
                    } else {
                        iIntValue4 = 0;
                    }
                    concurrentHashMap2.put("msg_gifter_comment_effective_cnt", Integer.valueOf(iIntValue4));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isModeratorOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap3 = this.LJLIIIL;
                    Integer num3 = concurrentHashMap3.get("msg_moderator_comment_effective_cnt");
                    if (num3 != null) {
                        iIntValue3 = num3.intValue() + 1;
                    } else {
                        iIntValue3 = 0;
                    }
                    concurrentHashMap3.put("msg_moderator_comment_effective_cnt", Integer.valueOf(iIntValue3));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isMutualFollowingWithAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap4 = this.LJLIIIL;
                    Integer num4 = concurrentHashMap4.get("msg_friends_comment_effective_cnt");
                    if (num4 != null) {
                        iIntValue2 = num4.intValue() + 1;
                    } else {
                        iIntValue2 = 0;
                    }
                    concurrentHashMap4.put("msg_friends_comment_effective_cnt", Integer.valueOf(iIntValue2));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isFollowerOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap5 = this.LJLIIIL;
                    Integer num5 = concurrentHashMap5.get("msg_fans_comment_effective_cnt");
                    if (num5 != null) {
                        iIntValue = num5.intValue() + 1;
                    } else {
                        iIntValue = 0;
                    }
                    concurrentHashMap5.put("msg_fans_comment_effective_cnt", Integer.valueOf(iIntValue));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isSubscriberOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap6 = this.LJLIIIL;
                    Integer num6 = concurrentHashMap6.get("msg_subscriber_comment_effective_cnt");
                    if (num6 != null) {
                        iIntValue6 = num6.intValue() + 1;
                    }
                    concurrentHashMap6.put("msg_subscriber_comment_effective_cnt", Integer.valueOf(iIntValue6));
                }
            }
            if (interfaceC1112060f2q instanceof C239700wF) {
                this.LJLLLL++;
            }
            if (LJJJJIZL().LJI) {
                LJJJLIIL(abstractC1110800f0o).LJI = abstractC1110800f0o;
            } else if (!abstractC1110800f0o.LJIILL.LIZ) {
                MESSAGE message2 = abstractC1110800f0o.LJIL;
                if ((message2 instanceof ChatMessage) || (message2 instanceof EmoteChatMessage) || (message2 instanceof GiftMessage)) {
                    LJJJLIIL(abstractC1110800f0o);
                }
            }
            if (interfaceC1112060f2q instanceof C1112330f3H) {
                C1112330f3H c1112330f3H = (C1112330f3H) interfaceC1112060f2q;
                List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) c1112330f3H.LJIL).capsuleType);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (listZ51 != null) {
                    for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                        if (interfaceC1112400f3O != null) {
                            interfaceC1112400f3O.LJIJ(c1112330f3H, linkedHashMap);
                        }
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_capsule_effective_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(LJJJJJ(), "admin_type");
                c474500IjALIZ.LJJII(Long.valueOf(c1112330f3H.LJIL.getMessageId()), "msg_id");
                c474500IjALIZ.LJJII(((CapsuleMessage) c1112330f3H.LJIL).scene, "msg_name");
                c474500IjALIZ.LJJII(Integer.valueOf(((CapsuleMessage) c1112330f3H.LJIL).capsuleType), "msg_type");
                c474500IjALIZ.LJJIIZI(linkedHashMap);
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILJJIL(AbstractC1136060ffY abstractC1136060ffY) {
        EmoteChatMessage emoteChatMessage;
        List<EmoteModel> list;
        int size;
        Object obj;
        ChatMessage chatMessage;
        List<EmoteWithIndex> list2;
        super.LJIILJJIL(abstractC1136060ffY);
        C1118670fDV c1118670fDV = this.LLI.LIZIZ;
        if (c1118670fDV != null) {
            c1118670fDV.LIZJ();
        }
        if (C1110350f05.LIZIZ()) {
            boolean z = true;
            if ((abstractC1136060ffY instanceof ChatMessage) && (list2 = (chatMessage = (ChatMessage) abstractC1136060ffY).f314emotes) != null && (!list2.isEmpty())) {
                List<EmoteWithIndex> list3 = chatMessage.f314emotes;
                if (list3 != null) {
                    size = list3.size();
                } else {
                    size = 0;
                }
                if (chatMessage.userInfo.getId() != UserService.getInstance().user().getCurrentUserId()) {
                    z = false;
                }
            } else if ((abstractC1136060ffY instanceof EmoteChatMessage) && (list = (emoteChatMessage = (EmoteChatMessage) abstractC1136060ffY).emoteList) != null && (!list.isEmpty())) {
                size = emoteChatMessage.emoteList.size();
                if (emoteChatMessage.user.getId() != UserService.getInstance().user().getCurrentUserId()) {
                    z = false;
                }
            } else {
                return;
            }
            if (size > 0) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_live_room_emote_messsage_load");
                c474500IjALIZ.LJJII("received", "type");
                c474500IjALIZ.LJJII(Integer.valueOf(size), "emote_count");
                String str = "1";
                if (LJJJJIZL().LJI) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(obj, "is_anchor");
                if (!z) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(str, "is_from_self");
                c474500IjALIZ.LJJII("live_room_message_list", "show_entrance");
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIIZILJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        UserIdentity userIdentityLLJJJJLIIL;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        super.LJIIZILJ(interfaceC1112060f2q);
        if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
            AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
            MESSAGE message = abstractC1110800f0o.LJIL;
            if (((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) && (userIdentityLLJJJJLIIL = abstractC1110800f0o.LLJJJJLIIL()) != null) {
                int iIntValue6 = 0;
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap = this.LJLIIIL;
                    Integer num = concurrentHashMap.get("msg_anchor_comment_cnt");
                    if (num != null) {
                        iIntValue5 = num.intValue() + 1;
                    } else {
                        iIntValue5 = 0;
                    }
                    concurrentHashMap.put("msg_anchor_comment_cnt", Integer.valueOf(iIntValue5));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isGiftGiverOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap2 = this.LJLIIIL;
                    Integer num2 = concurrentHashMap2.get("msg_gifter_comment_cnt");
                    if (num2 != null) {
                        iIntValue4 = num2.intValue() + 1;
                    } else {
                        iIntValue4 = 0;
                    }
                    concurrentHashMap2.put("msg_gifter_comment_cnt", Integer.valueOf(iIntValue4));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isModeratorOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap3 = this.LJLIIIL;
                    Integer num3 = concurrentHashMap3.get("msg_moderator_comment_cnt");
                    if (num3 != null) {
                        iIntValue3 = num3.intValue() + 1;
                    } else {
                        iIntValue3 = 0;
                    }
                    concurrentHashMap3.put("msg_moderator_comment_cnt", Integer.valueOf(iIntValue3));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isMutualFollowingWithAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap4 = this.LJLIIIL;
                    Integer num4 = concurrentHashMap4.get("msg_friends_comment_cnt");
                    if (num4 != null) {
                        iIntValue2 = num4.intValue() + 1;
                    } else {
                        iIntValue2 = 0;
                    }
                    concurrentHashMap4.put("msg_friends_comment_cnt", Integer.valueOf(iIntValue2));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isFollowerOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap5 = this.LJLIIIL;
                    Integer num5 = concurrentHashMap5.get("msg_fans_comment_cnt");
                    if (num5 != null) {
                        iIntValue = num5.intValue() + 1;
                    } else {
                        iIntValue = 0;
                    }
                    concurrentHashMap5.put("msg_fans_comment_cnt", Integer.valueOf(iIntValue));
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(userIdentityLLJJJJLIIL.isSubscriberOfAnchor))) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap6 = this.LJLIIIL;
                    Integer num6 = concurrentHashMap6.get("msg_subscriber_comment_cnt");
                    if (num6 != null) {
                        iIntValue6 = num6.intValue() + 1;
                    }
                    concurrentHashMap6.put("msg_subscriber_comment_cnt", Integer.valueOf(iIntValue6));
                }
            }
            if ((interfaceC1112060f2q instanceof InterfaceC1112720f3u) && ((InterfaceC1112720f3u) interfaceC1112060f2q).LJIILIIL() && LJJJJIZL().LJI) {
                if (interfaceC1112060f2q instanceof C239500wD) {
                    this.LJLJJL++;
                } else if (interfaceC1112060f2q instanceof C1110310f01) {
                    this.LJLJL++;
                } else if (interfaceC1112060f2q instanceof C180400mg) {
                    this.LJLJJLL++;
                }
            }
            if (interfaceC1112060f2q instanceof C239700wF) {
                this.LJLLL++;
            }
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIJ(int i) {
        C1118720fDa c1118720fDa = this.LLI.LJFF;
        if (c1118720fDa != null) {
            c1118720fDa.LIZJ(i);
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIL(int i) {
        DataChannel dataChannel;
        if (i != 0 && (dataChannel = LJJJJIZL().LJIIIZ) != null) {
            dataChannel.LC0(CommentCountChangeEvent.class, Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJIIJ(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY instanceof ChatMessage) {
            this.LJLJLJ++;
            return;
        }
        if ((abstractC1136060ffY instanceof MemberMessage) && ((MemberMessage) abstractC1136060ffY).action == 1) {
            this.LJLJLLL++;
            return;
        }
        if (abstractC1136060ffY instanceof GiftMessage) {
            this.LJLLILLLL++;
            return;
        }
        if (abstractC1136060ffY instanceof LikeMessage) {
            this.LJLLJ++;
            return;
        }
        if (!(abstractC1136060ffY instanceof SocialMessage)) {
            return;
        }
        if (((int) ((SocialMessage) abstractC1136060ffY).action) == 1) {
            this.LJLL++;
        } else {
            if (((int) ((SocialMessage) abstractC1136060ffY).action) != 3) {
                return;
            }
            this.LJLLI++;
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJJI(int i) {
        C1118710fDZ c1118710fDZ = this.LLI.LJ;
        if (c1118710fDZ != null) {
            c1118710fDZ.LIZJ(i);
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJJJ(int i) {
        C1118730fDb c1118730fDb = this.LLI.LJI;
        if (c1118730fDb != null) {
            c1118730fDb.LIZJ(i);
        }
    }

    @Override // X.AbstractC1113070f4T
    public final void LJJJJLI(boolean z) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        Room room;
        boolean z2 = LJJJJIZL().LJI;
        if (z2) {
            DataChannel dataChannel = LJJJJIZL().LJIIIZ;
            if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
                room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            }
            if (C1083940eJU.LIZIZ(room)) {
                LJJJJZI(z);
                return;
            }
        }
        if (AnchorSlowFunctionOptABSetting.INSTANCE.enable() && z2) {
            View view = this.LLFF;
            if (view != null && (lifecycleOwner = ViewTreeLifecycleOwner.get(view)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C0NOW(this, null, z), 2);
                return;
            } else {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NOX(this, null, z), 3);
                return;
            }
        }
        LJJJJZI(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[PHI: r5
      0x00b1: PHI (r5v3 int) = (r5v1 int), (r5v6 int) binds: [B:38:0x00ac, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(X.AbstractC1136060ffY r8) {
        /*
            r7 = this;
            boolean r1 = r8 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r1 != 0) goto Lb3
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto Lf
        L8:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto Lf
            r0 = r8
            com.bytedance.android.livesdk.model.message.EmoteChatMessage r0 = (com.bytedance.android.livesdk.model.message.EmoteChatMessage) r0
        Lf:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.model.message.RoomMessage
            r6 = 1
            if (r0 == 0) goto L1a
            int r0 = r7.LJLLLLLL
            int r0 = r0 + 1
            r7.LJLLLLLL = r0
        L1a:
            boolean r0 = X.C1110350f05.LIZIZ()
            if (r0 == 0) goto L7f
            if (r1 == 0) goto L89
            r1 = r8
            com.bytedance.android.livesdk.model.message.ChatMessage r1 = (com.bytedance.android.livesdk.model.message.ChatMessage) r1
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteWithIndex> r0 = r1.f314emotes
            if (r0 == 0) goto L87
            int r5 = r0.size()
        L2d:
            com.bytedance.android.live.base.model.user.User r0 = r1.userInfo
            long r3 = r0.getId()
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb1
        L43:
            if (r5 <= 0) goto Lb8
            java.lang.String r0 = "livesdk_sub_live_room_emote_messsage_load"
            X.0IjA r4 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "discarded"
            r4.LJJII(r0, r1)
            java.lang.String r1 = "emote_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.LJJII(r0, r1)
            X.0ez9 r0 = r7.LJJJJIZL()
            boolean r0 = r0.LJI
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r0 == 0) goto L85
            r1 = r3
        L68:
            java.lang.String r0 = "is_anchor"
            r4.LJJII(r1, r0)
            if (r6 != 0) goto L70
            r3 = r2
        L70:
            java.lang.String r0 = "is_from_self"
            r4.LJJII(r3, r0)
            java.lang.String r1 = "show_entrance"
            java.lang.String r0 = "live_room_message_list"
            r4.LJJII(r0, r1)
            r4.LIZ()
        L7f:
            java.lang.String r0 = "hotRoom"
            X.C1091120eV4.LIZ(r8, r0)
            return
        L85:
            r1 = r2
            goto L68
        L87:
            r5 = 0
            goto L2d
        L89:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto Lb8
            r1 = r8
            com.bytedance.android.livesdk.model.message.EmoteChatMessage r1 = (com.bytedance.android.livesdk.model.message.EmoteChatMessage) r1
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteModel> r0 = r1.emoteList
            if (r0 == 0) goto Laf
            int r5 = r0.size()
        L98:
            com.bytedance.android.live.base.model.user.User r0 = r1.user
            long r3 = r0.getId()
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb1
            goto L43
        Laf:
            r5 = 0
            goto L98
        Lb1:
            r6 = 0
            goto L43
        Lb3:
            r0 = r8
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            goto L8
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113050f4R.LJJJJZ(X.0ffY):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x092e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI(boolean r15) {
        /*
            Method dump skipped, instruction units count: 2467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113050f4R.LJJJJZI(boolean):void");
    }

    public final C1113230f4j LJJJLIIL(AbstractC1110800f0o<?> abstractC1110800f0o) {
        List<Integer> list;
        C1113230f4j c1113230f4j = this.LJLI.get(Long.valueOf(abstractC1110800f0o.LJIL.getMessageId()));
        if (c1113230f4j == null) {
            c1113230f4j = new C1113230f4j();
            c1113230f4j.LIZ = abstractC1110800f0o.LJIL.getMessageId();
            c1113230f4j.LIZIZ = abstractC1110800f0o.LJIJ.LIZ;
            this.LJLI.put(Long.valueOf(abstractC1110800f0o.LJIL.getMessageId()), c1113230f4j);
        }
        MESSAGE message = abstractC1110800f0o.LJIL;
        if (message instanceof ChatMessage) {
            String strLJJLIIIJ = null;
            ChatMessage chatMessage = (ChatMessage) message;
            if (chatMessage != null && (list = chatMessage.commentTag) != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, "|", null, null, 0, null, null, 62);
            }
            c1113230f4j.LJFF = strLJJLIIIJ;
        }
        if (c1113230f4j.LIZJ == 0) {
            c1113230f4j.LIZJ = abstractC1110800f0o.LJIILJJIL.LJI;
        }
        c1113230f4j.LIZLLL++;
        c1113230f4j.LJ += abstractC1110800f0o.LJIILJJIL.LJIIIIZZ;
        return c1113230f4j;
    }

    public static String LJJJJLL(C1113230f4j c1113230f4j, AbstractC1110800f0o abstractC1110800f0o) {
        long j;
        long j2;
        String str;
        boolean z;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            if (abstractC1110800f0o != null) {
                CommonMessageData commonMessageData = abstractC1110800f0o.LJIL.baseMessage;
                if (commonMessageData != null) {
                    j = commonMessageData.createTime;
                } else {
                    j = 0;
                }
                if (commonMessageData == null) {
                    j2 = 0;
                } else {
                    j2 = commonMessageData.clientSendTime;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("0:");
                sbLIZ.append(abstractC1110800f0o.LJIL.getMessageId());
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(",1:");
                sbLIZ2.append(abstractC1110800f0o.LJIL.getDecodeStartAtMillis());
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(",2:");
                sbLIZ3.append(abstractC1110800f0o.LJIL.getDecodeEndAtMillis() - abstractC1110800f0o.LJIL.getDecodeStartAtMillis());
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(",3:");
                sbLIZ4.append(abstractC1110800f0o.LJIL.getDispatchAtMillis() - abstractC1110800f0o.LJIL.getDecodeStartAtMillis());
                sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(",4:");
                sbLIZ5.append(abstractC1110800f0o.LJIILJJIL.LJI - abstractC1110800f0o.LJIL.getDecodeStartAtMillis());
                sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                if (j > 0 && abstractC1110800f0o.LJIL.getDecodeStartAtMillis() > 0) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(",6:");
                    sbLIZ6.append(j - abstractC1110800f0o.LJIL.getDecodeStartAtMillis());
                    sb.append(C2188811AlT.LIZIZ(sbLIZ6));
                }
                if (j2 <= 0) {
                    if (j > 0) {
                        if (abstractC1110800f0o.LJIL.getDecodeStartAtMillis() > 0) {
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(",7:");
                            sbLIZ7.append(j - abstractC1110800f0o.LJIL.getDecodeStartAtMillis());
                            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
                        }
                        if (abstractC1110800f0o.LJIILJJIL.LJI > 0) {
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append(",10:");
                            sbLIZ8.append(abstractC1110800f0o.LJIILJJIL.LJI - j);
                            sb.append(C2188811AlT.LIZIZ(sbLIZ8));
                        }
                    }
                } else {
                    if (abstractC1110800f0o.LJIL.getDecodeStartAtMillis() > 0) {
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append(",7:");
                        sbLIZ9.append(j2 - abstractC1110800f0o.LJIL.getDecodeStartAtMillis());
                        sb.append(C2188811AlT.LIZIZ(sbLIZ9));
                    }
                    if (abstractC1110800f0o.LJIILJJIL.LJI > 0) {
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append(",10:");
                        sbLIZ10.append(abstractC1110800f0o.LJIILJJIL.LJI - j2);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ10));
                    }
                }
                if (!C001A.CHAT.wsMethod.equals(abstractC1110800f0o.LJIL.getMethodName())) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(",8:");
                    sbLIZ11.append(abstractC1110800f0o.LJIL.getMethodName());
                    sb.append(C2188811AlT.LIZIZ(sbLIZ11));
                }
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append(",9:");
                sbLIZ12.append(abstractC1110800f0o.LJIL.getMessageFrom());
                sb.append(C2188811AlT.LIZIZ(sbLIZ12));
                CommonMessageData commonMessageData2 = abstractC1110800f0o.LJIL.baseMessage;
                String strLJJLIIIJ = null;
                if (commonMessageData2 != null) {
                    str = commonMessageData2.fromIdc;
                } else {
                    str = null;
                }
                int i = 1;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append(",11:");
                    CommonMessageData commonMessageData3 = abstractC1110800f0o.LJIL.baseMessage;
                    if (commonMessageData3 != null) {
                        str2 = commonMessageData3.fromIdc;
                    } else {
                        str2 = null;
                    }
                    sbLIZ13.append(str2);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ13));
                }
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append(",12:");
                sbLIZ14.append(abstractC1110800f0o.LJIJ.LIZ);
                sb.append(C2188811AlT.LIZIZ(sbLIZ14));
                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                sbLIZ15.append(",13:");
                sbLIZ15.append(abstractC1110800f0o.LJIJ.LIZIZ);
                sb.append(C2188811AlT.LIZIZ(sbLIZ15));
                StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                sbLIZ16.append(",14:");
                sbLIZ16.append(abstractC1110800f0o.LJIILJJIL.LJI);
                sb.append(C2188811AlT.LIZIZ(sbLIZ16));
                if (c1113230f4j != null) {
                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                    sbLIZ17.append(",15:");
                    sbLIZ17.append(c1113230f4j.LIZLLL);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ17));
                    StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                    sbLIZ18.append(",16:");
                    sbLIZ18.append(c1113230f4j.LJ);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ18));
                }
                if (abstractC1110800f0o.LJIL instanceof ChatMessage) {
                    StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                    sbLIZ19.append(",17:");
                    List<Integer> list = ((ChatMessage) abstractC1110800f0o.LJIL).commentTag;
                    if (list != null) {
                        strLJJLIIIJ = C13LP.LJJLIIIJ(list, "|", null, null, 0, null, null, 62);
                    }
                    sbLIZ19.append(strLJJLIIIJ);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ19));
                }
                C1111910f2b c1111910f2b = abstractC1110800f0o.LJII;
                if (c1111910f2b != null) {
                    if (c1111910f2b.LIZJ > 0) {
                        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                        sbLIZ20.append(",18:");
                        sbLIZ20.append(c1111910f2b.LIZJ);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ20));
                    }
                    if (c1111910f2b.LIZIZ > 0) {
                        StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                        sbLIZ21.append(",19:");
                        sbLIZ21.append(c1111910f2b.LIZIZ);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ21));
                    }
                    if (c1111910f2b.LIZ > 0) {
                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                        sbLIZ22.append(",20:");
                        sbLIZ22.append(c1111910f2b.LIZ);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ22));
                    }
                }
                StringBuilder sbLIZ23 = C2188811AlT.LIZ();
                sbLIZ23.append(",21:");
                sbLIZ23.append(abstractC1110800f0o.LJIJ.LIZJ);
                sb.append(C2188811AlT.LIZIZ(sbLIZ23));
                StringBuilder sbLIZ24 = C2188811AlT.LIZ();
                sbLIZ24.append(",22:");
                sbLIZ24.append(abstractC1110800f0o.LJIILJJIL.LIZIZ ? 1 : 0);
                sb.append(C2188811AlT.LIZIZ(sbLIZ24));
                StringBuilder sbLIZ25 = C2188811AlT.LIZ();
                sbLIZ25.append(",23:");
                if (!abstractC1110800f0o.LJIILL.LIZ) {
                    i = 2;
                }
                sbLIZ25.append(i);
                sb.append(C2188811AlT.LIZIZ(sbLIZ25));
                StringBuilder sbLIZ26 = C2188811AlT.LIZ();
                sbLIZ26.append(",24:");
                sbLIZ26.append(C1111970f2h.LIZIZ(abstractC1110800f0o));
                sb.append(C2188811AlT.LIZIZ(sbLIZ26));
            }
            return sb.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIIIZ(InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
        super.LJIIIZ(interfaceC1112060f2q, z);
        if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
            LJJJJZ(((AbstractC1110800f0o) interfaceC1112060f2q).LJIL);
        }
    }

    @Override // X.AbstractC1113150f4b, X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112540f3c
    public final void LJIIJJI(View view, boolean z) {
        List<String> list;
        Room room;
        super.LJIIJJI(view, z);
        this.LLFF = view;
        DataChannel dataChannel = LJJJJIZL().LJIIIZ;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (list = room.rankCommentGroups) == null) {
            list = C13BV.INSTANCE;
        }
        this.LLIFFJFJJ = list;
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
        this.LLF = SystemClock.uptimeMillis();
        if (z) {
            this.LLI.LIZ();
        }
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        C1118660fDU c1118660fDU = this.LLI.LIZJ;
        if (c1118660fDU != null) {
            c1118660fDU.LIZJ();
        }
        interfaceC1112060f2q.LJJJZ().LIZ = j;
        if (LJJJJIZL().LJI) {
            if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
                AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
                if (abstractC1110800f0o.LJIILL.LIZ) {
                    this.LJJZZIII.put(Long.valueOf(abstractC1110800f0o.LJIL.getMessageId()), interfaceC1112060f2q);
                    return;
                } else {
                    this.LJL.put(Long.valueOf(abstractC1110800f0o.LJIL.getMessageId()), interfaceC1112060f2q);
                    return;
                }
            }
            return;
        }
        if (!LivePublicScreenMessageSeiAlignOptSetting.enable() || !(interfaceC1112060f2q instanceof C1110310f01)) {
            return;
        }
        AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) interfaceC1112060f2q;
        if (abstractC1110800f0o2.LJIILL.LIZ || abstractC1110800f0o2.LJIL.isHistoryMessage) {
            return;
        }
        this.LJJLI++;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    @Override // X.AbstractC1113150f4b, X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(long r9, X.InterfaceC1112060f2q r11) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113050f4R.LJJIL(long, X.0f2q):void");
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJJ(List<? extends InterfaceC1112060f2q> list, C1112880f4A c1112880f4A) {
        DataChannel dataChannel;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.TimeStamp timeStamp;
        DataChannel dataChannel2;
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        if (size != 0 && (dataChannel2 = LJJJJIZL().LJIIIZ) != null) {
            dataChannel2.LC0(CommentCountChangeEvent.class, Integer.valueOf(size));
        }
        C1113100f4W c1113100f4W = this.LLI;
        int i = c1112880f4A.LIZ;
        C1118720fDa c1118720fDa = c1113100f4W.LJFF;
        if (c1118720fDa != null) {
            c1118720fDa.LIZJ(i);
        }
        C1113100f4W c1113100f4W2 = this.LLI;
        int i2 = c1112880f4A.LIZIZ;
        C1118730fDb c1118730fDb = c1113100f4W2.LJI;
        if (c1118730fDb != null) {
            c1118730fDb.LIZJ(i2);
        }
        C1113100f4W c1113100f4W3 = this.LLI;
        int i3 = c1112880f4A.LIZJ;
        C1118710fDZ c1118710fDZ = c1113100f4W3.LJ;
        if (c1118710fDZ != null) {
            c1118710fDZ.LIZJ(i3);
        }
        if (this.LJLIIL && (!arrayList.isEmpty())) {
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                if (((InterfaceC1112060f2q) it2.next()).LJFF()) {
                    i4++;
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_public_screen_show");
            c474500IjALIZ.LJJII(Integer.valueOf(arrayList.size()), "show_msg_cnt");
            c474500IjALIZ.LJJII(Integer.valueOf(i4), "show_history_msg_cnt");
            EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
            if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (timeStamp = roomsData.timeStamps) != null) {
                c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - timeStamp.enterRoomStarTime), "show_duration");
            }
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                C1109770ez9 c1109770ez9LJJJJIZL = LJJJJIZL();
                if (c1109770ez9LJJJJIZL != null) {
                    dataChannel = c1109770ez9LJJJJIZL.LJIIIZ;
                } else {
                    dataChannel = null;
                }
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJIIIIZZ();
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                c474500IjALIZ.LJJIJL();
            }
            this.LJLIIL = false;
        }
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILLIIL(AbstractC1136060ffY abstractC1136060ffY, AbstractC1111980f2i abstractC1111980f2i, boolean z, User user) {
        super.LJIILLIIL(abstractC1136060ffY, abstractC1111980f2i, z, user);
        LJJJJZ(abstractC1136060ffY);
    }
}
