package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.api.GiftHistoryNumChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0127, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0127 implements InterfaceC776970Udr, OnMessageListener {
    public DataChannel LL;
    public IMessageManager LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public C11NJ LLILZLL = new C11NJ();
    public final ArrayList<GiftMessage> LLIZ = new ArrayList<>();
    public CopyOnWriteArrayList<AnonymousClass0128> LLIZLLLIL = new CopyOnWriteArrayList<>();
    public final C01GW LLJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(554));

    @Override // X.InterfaceC776970Udr
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC776970Udr
    public final void LIZLLL() {
        IMessageManager iMessageManager;
        this.LLILZIL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopGiftMessageCount() countingGiftMessage = ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(",lastTimeCountingGiftMessage = ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LJIIIZ("GiftHistoryManager", C2188811AlT.LIZIZ(sbLIZ));
        if (System.currentTimeMillis() - this.LLILZ > 18000000 && this.LLILLL >= 3 && (iMessageManager = this.LLILLJJLI) != null) {
            long jLJII = LJII();
            int i = this.LLILLL;
            iMessageManager.insertMessage(new C087700Up(C497740JfY.LJIIL(2131755538, i, Integer.valueOf(i)), jLJII, C497740JfY.LJIJI(2131841966)), true);
            this.LLILZ = System.currentTimeMillis();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_gift_notice_show");
            c474500IjALIZ.LJJII(this.LLJ.getValue(), "anchor_id");
            c474500IjALIZ.LJJII("screen_share", "live_type");
            c474500IjALIZ.LJJII(Long.valueOf(LJII()), "room_id");
            c474500IjALIZ.LIZ();
        }
        this.LLILLL = 0;
    }

    @Override // X.InterfaceC776970Udr
    public final void LJFF() {
        this.LLILLL = 0;
        this.LLILZIL = true;
    }

    public static final long LJII() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    @Override // X.InterfaceC776970Udr
    public final void release() {
        C20441214yg.LJIIIZ("GiftHistoryManager", "release()");
        C11NJ c11nj = this.LLILZLL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILZLL = null;
        CopyOnWriteArrayList<AnonymousClass0128> copyOnWriteArrayList = this.LLIZLLLIL;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.LLIZLLLIL = null;
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLILLJJLI = null;
        this.LL = null;
    }

    @Override // X.InterfaceC776970Udr
    public final List<GiftMessage> LIZ() {
        return this.LLIZ;
    }

    public AnonymousClass0127(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.InterfaceC776970Udr
    public final void LIZJ(AnonymousClass0128 anonymousClass0128) {
        CopyOnWriteArrayList<AnonymousClass0128> copyOnWriteArrayList;
        CopyOnWriteArrayList<AnonymousClass0128> copyOnWriteArrayList2 = this.LLIZLLLIL;
        if ((copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.contains(anonymousClass0128)) && (copyOnWriteArrayList = this.LLIZLLLIL) != null) {
            copyOnWriteArrayList.add(anonymousClass0128);
        }
    }

    @Override // X.InterfaceC776970Udr
    public final void LJ(AnonymousClass0128 anonymousClass0128) {
        CopyOnWriteArrayList<AnonymousClass0128> copyOnWriteArrayList = this.LLIZLLLIL;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(anonymousClass0128);
        }
    }

    @Override // X.InterfaceC776970Udr
    public final void LJI(IMessageManager iMessageManager) {
        if (iMessageManager == null) {
            C20441214yg.LJIIIZ("GiftHistoryManager", "initMessageListener() manager is null");
            return;
        }
        if (Intrinsics.LJFF(this.LLILLJJLI, iMessageManager)) {
            C20441214yg.LJIIIZ("GiftHistoryManager", "initMessageListener() messageManager equal manager");
            return;
        }
        IMessageManager iMessageManager2 = this.LLILLJJLI;
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(this);
        }
        this.LLILLJJLI = iMessageManager;
        iMessageManager.addMessageListener(C001A.GIFT.getIntType(), this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initMessageListener() success roomId = ");
        sbLIZ.append(LJII());
        C20441214yg.LJIIIZ("GiftHistoryManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof GiftMessage)) {
            return;
        }
        GiftMessage giftMessage = (GiftMessage) iMessage;
        Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(giftMessage.giftId);
        if ((giftFindGiftById != null || (giftFindGiftById = giftMessage.mGift) != null) && giftFindGiftById.combo && giftMessage.repeatEnd == 0) {
            return;
        }
        if (this.LLILZIL) {
            this.LLILLL++;
        }
        this.LLIZ.add(iMessage);
        CopyOnWriteArrayList<AnonymousClass0128> copyOnWriteArrayList = this.LLIZLLLIL;
        if (copyOnWriteArrayList != null) {
            Iterator<AnonymousClass0128> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(iMessage);
            }
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zW(GiftHistoryNumChannel.class, Integer.valueOf(this.LLIZ.size()));
        }
    }
}
