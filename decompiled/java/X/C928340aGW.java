package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnhanceInviteSenseSetting;
import com.bytedance.android.livesdk.model.message.MGOutsideInviteMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aGW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928340aGW implements OnIMMessageListener {
    public static int LLILLJJLI;
    public static WeakReference<DataChannel> LLILLL;
    public static Pair<String, String> LLILZ;
    public static Long LLILZIL;
    public static RunnableC928390aGb LLILZLL;
    public static int LLIZ;
    public static final C928340aGW LL = new C928340aGW();
    public static final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(9));

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "MultiGuestEnhanceInviteSenseHelper";
    }

    public final void LIZ() {
        DataChannel dataChannel;
        C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", "clear");
        WeakReference<DataChannel> weakReference = LLILLL;
        if (weakReference != null && (dataChannel = weakReference.get()) != null) {
            dataChannel.zQ2(this);
        }
        LLILLL = null;
        RunnableC928390aGb runnableC928390aGb = LLILZLL;
        if (runnableC928390aGb != null) {
            C473410IhP.LJ(runnableC928390aGb);
            LLILZLL = null;
        }
        C928420aGe.LIZ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        List urls;
        DataChannel dataChannel;
        Room room;
        C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", "onMessage");
        if (iMessage instanceof MGOutsideInviteMessage) {
            MGOutsideInviteMessage mGOutsideInviteMessage = (MGOutsideInviteMessage) iMessage;
            int i = mGOutsideInviteMessage.followRelation;
            int value = MultiGuestEnhanceInviteSenseSetting.getValue();
            if (value == 1 ? !(i == 3 || i == 1) : !(value == 2 ? i == 3 : value == 3)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("followRelation=");
                sbLIZ.append(mGOutsideInviteMessage.followRelation);
                sbLIZ.append(", expValue = ");
                sbLIZ.append(MultiGuestEnhanceInviteSenseSetting.getValue());
                sbLIZ.append(", return");
                C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            WeakReference<DataChannel> weakReference = LLILLL;
            if (weakReference != null && (dataChannel = weakReference.get()) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getId() == mGOutsideInviteMessage.roomId) {
                C20441214yg.LIZIZ("MultiGuestEnhanceInviteSenseHelper", "onMessage MGOutsideInviteMessage, same roomId");
                return;
            }
            LLIZ++;
            long j = mGOutsideInviteMessage.roomId;
            long j2 = mGOutsideInviteMessage.anchorId;
            ImageModel imageModel = mGOutsideInviteMessage.anchorAvatar;
            if (imageModel == null || (urls = imageModel.getUrls()) == null || (str = (String) C13LP.LJJJLL(urls)) == null) {
                str = "";
            }
            LIZLLL(new C928360aGY(j, j2, str, mGOutsideInviteMessage.inviteTime), false);
        }
    }

    public static final void LIZJ(Context context, EnumC928480aGk enumC928480aGk) {
        DataChannel dataChannel;
        WeakReference<DataChannel> weakReference = LLILLL;
        if (weakReference != null) {
            dataChannel = weakReference.get();
        } else {
            dataChannel = null;
        }
        C786410Ut5.H4(new DialogC929590aIX(context, enumC928480aGk, null, null, null, dataChannel, 0, "invite_receive_bubble", 64));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C928360aGY r4, boolean r5) {
        /*
            java.lang.ref.WeakReference<com.bytedance.ies.sdk.datachannel.DataChannel> r0 = X.C928340aGW.LLILLL
            if (r0 == 0) goto L49
            java.lang.Object r3 = r0.get()
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = (com.bytedance.ies.sdk.datachannel.DataChannel) r3
            if (r3 == 0) goto L49
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r0 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.watch.IWatchLiveService r0 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r0
            if (r0 == 0) goto L27
            boolean r1 = r0.hp1(r3)
            r0 = 1
            if (r1 != r0) goto L27
        L1d:
            java.lang.String r2 = "MultiGuestEnhanceInviteSenseHelper"
            if (r0 == 0) goto L29
            java.lang.String r0 = "postNextShow return. isGameTopic"
            X.C20441214yg.LIZIZ(r2, r0)
            return
        L27:
            r0 = 0
            goto L1d
        L29:
            X.0aAn r0 = X.C924790aAn.LIZLLL()
            T r0 = r0.LIZIZ
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L40
            int r1 = r0.intValue()
            r0 = 2
            if (r0 != r1) goto L40
            java.lang.String r0 = "postNextShow return. linkMicState = Online"
            X.C20441214yg.LIZIZ(r2, r0)
            return
        L40:
            Y.ARunnableS16S0210000_15 r1 = new Y.ARunnableS16S0210000_15
            r0 = 0
            r1.<init>(r3, r5, r4, r0)
            X.C473410IhP.LIZIZ(r1)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C928340aGW.LIZLLL(X.0aGY, boolean):void");
    }

    public static C410901il LJ(int i, List list, List list2) {
        Object next;
        Object next2;
        Long l = LLILZIL;
        LLILZIL = null;
        if (l == null) {
            l = C928400aGc.LLJIJIL;
            C928400aGc.LLJIJIL = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((GuestApplyStillInLineResponse.GuestApplyItem) obj).permitTime != 0) {
                arrayList.add(obj);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new C512401z8(1), arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((GuestApplyStillInLineResponse.GuestApplyItem) obj2).permitTime == 0) {
                arrayList2.add(obj2);
            }
        }
        List listLJLLLL2 = C13LP.LJLLLL(new C512401z8(2), list2);
        C410901il c410901il = new C410901il();
        if (l != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((GuestApplyStillInLineResponse.GuestApplyItem) next).roomId == l.longValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem = (GuestApplyStillInLineResponse.GuestApplyItem) next;
            if (guestApplyItem != null) {
                c410901il.add(new C936690aTz(EnumC937180aUm.APPLY, guestApplyItem, null, list, list2, i, true, 4));
            }
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (((GuestApplyStillInLineResponse.GuestInvitedItem) next2).roomId == l.longValue()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem = (GuestApplyStillInLineResponse.GuestInvitedItem) next2;
            if (guestInvitedItem != null) {
                c410901il.add(new C936690aTz(EnumC937180aUm.INVITED, null, guestInvitedItem, list, list2, i, true, 2));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listLJLLLL) {
            long j = ((GuestApplyStillInLineResponse.GuestApplyItem) obj3).roomId;
            if (l == null || j != l.longValue()) {
                arrayList3.add(obj3);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            c410901il.add(new C936690aTz(EnumC937180aUm.APPLY, (GuestApplyStillInLineResponse.GuestApplyItem) it4.next(), null, list, list2, i, false, 68));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listLJLLLL2) {
            long j2 = ((GuestApplyStillInLineResponse.GuestInvitedItem) obj4).roomId;
            if (l == null || j2 != l.longValue()) {
                arrayList4.add(obj4);
            }
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            c410901il.add(new C936690aTz(EnumC937180aUm.INVITED, null, (GuestApplyStillInLineResponse.GuestInvitedItem) it5.next(), list, list2, i, false, 66));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : arrayList2) {
            long j3 = ((GuestApplyStillInLineResponse.GuestApplyItem) obj5).roomId;
            if (l == null || j3 != l.longValue()) {
                arrayList5.add(obj5);
            }
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            c410901il.add(new C936690aTz(EnumC937180aUm.APPLY, (GuestApplyStillInLineResponse.GuestApplyItem) it6.next(), null, list, list2, i, false, 68));
        }
        return c410901il;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(String str, C928360aGY c928360aGY, boolean z, String str2) {
        int iLJIIL;
        String str3;
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZLLL;
        List listLJJIII;
        int size;
        if (z) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if ((objLJIIIZ instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ) != null && (abstractC928510aGnLIZLLL = interfaceC917640ZzG.LIZLLL()) != null && (listLJJIII = abstractC928510aGnLIZLLL.LJJIII()) != null && (size = listLJJIII.size()) > 0) {
                iLJIIL = size - 1;
            } else {
                iLJIIL = 0;
            }
        } else {
            iLJIIL = C921180a4y.LJIIL((IMultiGuestV3InternalServiceV2) LLIZLLLIL.getValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("guest_cnt", String.valueOf(iLJIIL));
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 1) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_applying", str3);
        linkedHashMap.put("event_position", str2);
        linkedHashMap.put("event_room_id", String.valueOf(c928360aGY.LIZ));
        linkedHashMap.put("event_anchor_id", String.valueOf(c928360aGY.LIZIZ));
        C924660aAa.LJFF(str, "invite_receive", linkedHashMap);
    }
}
