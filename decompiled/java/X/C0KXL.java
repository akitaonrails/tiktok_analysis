package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubLiveOnlyChatStayMsSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXL implements InterfaceC1108270ewj, OnIMMessageListener {
    public static final long LLJI = ((long) SubLiveOnlyChatStayMsSetting.INSTANCE.getValue()) * 1000;
    public final Room LL;
    public final Context LLILLJJLI;
    public final C1108220ewe LLILLL;
    public final DataChannel LLILZ;
    public IMessageManager LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C0KXO());
    public final C01GW LLJ = C452501pT.LIZIZ(new C0KXP(this));

    @Override // X.InterfaceC1108270ewj
    public final int LIZJ() {
        return 0;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "sub_only_chat";
    }

    @Override // X.InterfaceC1108270ewj
    public final void onHide() {
    }

    @Override // X.InterfaceC1108270ewj
    public final void onShow() {
        User owner;
        String secUid;
        this.LLIZ = true;
        this.LLILZLL = 0L;
        ((Handler) this.LLIZLLLIL.getValue()).removeCallbacks((Runnable) this.LLJ.getValue());
        long jLIZIZ = C963140bAe.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("server show time stamp ");
        sbLIZ.append(jLIZIZ);
        C20441214yg.LIZIZ("SubOnlyChatSceneStrategy", C2188811AlT.LIZIZ(sbLIZ));
        Room room = this.LL;
        if (room != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
            C0JT6<Map<String, List<String>>> c0jt6 = C0KPJ.Ne;
            Map<String, List<String>> mapLIZ = c0jt6.LIZ();
            if (mapLIZ == null) {
                mapLIZ = C2097608Jq.LJ();
            }
            List<String> list = mapLIZ.get(secUid);
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(list);
            ListProtector.add(arrayList, 0, String.valueOf(jLIZIZ));
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZ);
            linkedHashMap.put(secUid, arrayList);
            c0jt6.LIZJ(linkedHashMap);
        }
        C0JT6<List<Long>> c0jt62 = C0KPJ.Oe;
        List<Long> listLIZ = c0jt62.LIZ();
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(listLIZ);
        Room room2 = this.LL;
        arrayList2.add(Long.valueOf(room2 != null ? room2.getId() : 0L));
        c0jt62.LIZJ(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    @Override // X.InterfaceC1108270ewj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KXL.LIZIZ():boolean");
    }

    @Override // X.InterfaceC1108270ewj
    public final void LIZLLL() {
        ((Handler) this.LLIZLLLIL.getValue()).removeCallbacks((Runnable) this.LLJ.getValue());
    }

    @Override // X.InterfaceC1108270ewj
    public final void LJ() {
        DataChannel dataChannel = this.LLILZ;
        IMessageManager iMessageManager = dataChannel != null ? (IMessageManager) dataChannel.gg0(C776250Uch.class) : null;
        this.LLILZIL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), (OnIMMessageListener) this);
        }
        if (C494680Jac.LJIIJ(this.LLILZ)) {
            this.LLILZLL = System.currentTimeMillis();
            C786410Ut5.LJLIIL(LLJI, (Handler) this.LLIZLLLIL.getValue(), (Runnable) this.LLJ.getValue());
        }
    }

    public final Function0<Unit> LJFF() {
        return new C0KXM(this);
    }

    public final String LJI() {
        User owner;
        SubscribeInfo subscribeInfo;
        Integer numValueOf;
        Room room = this.LL;
        return (room == null || (owner = room.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null || (numValueOf = Integer.valueOf(subscribeInfo.status)) == null) ? "" : numValueOf.intValue() == 3 ? C497740JfY.LJIJI(2131840938) : numValueOf.intValue() == 1 ? C497740JfY.LJIJI(2131840938) : "";
    }

    public final String LJII() {
        User owner;
        SubscribeInfo subscribeInfo;
        Integer numValueOf;
        long jLIZIZ = C0KQ3.LIZIZ(this.LL);
        Room room = this.LL;
        return (room == null || (owner = room.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null || (numValueOf = Integer.valueOf(subscribeInfo.status)) == null) ? "" : numValueOf.intValue() == 3 ? C786410Ut5.j4(C497740JfY.LJIJI(2131840940), Arrays.copyOf(new Object[]{Long.valueOf(jLIZIZ)}, 1)) : numValueOf.intValue() == 1 ? C497740JfY.LJIJI(2131840939) : "";
    }

    public final String LJIIIIZZ() {
        User owner;
        SubscribeInfo subscribeInfo;
        Room room = this.LL;
        Integer numValueOf = (room == null || (owner = room.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null) ? null : Integer.valueOf(subscribeInfo.status);
        if (numValueOf != null) {
            if (numValueOf.intValue() == 3) {
                return C497740JfY.LJIJI(2131853353);
            }
            if (numValueOf.intValue() == 1) {
                return C497740JfY.LJIJI(2131853354);
            }
        }
        return C497740JfY.LJIJI(2131853353);
    }

    @Override // X.InterfaceC1108270ewj
    public final void onUnload() {
        IMessageManager iMessageManager = this.LLILZIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        ((Handler) this.LLIZLLLIL.getValue()).removeCallbacks((Runnable) this.LLJ.getValue());
    }

    @Override // X.InterfaceC1108270ewj
    public final C1108330ewp LIZ() {
        return new C1108330ewp(LJIIIIZZ(), LJII(), LJI(), LJFF());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        if (iMessage instanceof RoomVerifyMessage) {
            int i = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i == 36) {
                Room room = this.LL;
                if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null) {
                    roomAuthStatus2.chatSubOnly = true;
                }
                this.LLILZLL = System.currentTimeMillis();
                C786410Ut5.LJLIIL(LLJI, (Handler) this.LLIZLLLIL.getValue(), (Runnable) this.LLJ.getValue());
                return;
            }
            if (i != 37) {
                return;
            }
            Room room2 = this.LL;
            if (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null) {
                roomAuthStatus.chatSubOnly = false;
            }
            this.LLILZLL = 0L;
            this.LLILLL.LIZIZ(this);
        }
    }

    public C0KXL(Room room, Context context, C1108220ewe c1108220ewe, DataChannel dataChannel) {
        this.LL = room;
        this.LLILLJJLI = context;
        this.LLILLL = c1108220ewe;
        this.LLILZ = dataChannel;
    }
}
