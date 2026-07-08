package X;

import Y.ARunnableS112S0100000_12;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Uls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781940Uls implements OnMessageListener, Handler.Callback {
    public static final /* synthetic */ int LLJILJIL = 0;
    public LiveIconView LL;
    public C16F5 LLILLJJLI;
    public View LLILLL;
    public DataChannel LLILZ;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper(), this);
    public C781980Ulw LLILZLL;
    public final Map<Integer, C781980Ulw> LLIZ;
    public final List<Integer> LLIZLLLIL;
    public boolean LLJ;
    public final C781970Ulv LLJI;
    public final ARunnableS112S0100000_12 LLJIJIL;

    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C781940Uls.LIZ():void");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Ulv] */
    public C781940Uls() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LLIZ = linkedHashMap;
        this.LLIZLLLIL = C1697810uHb.LJIILJJIL(5, 4, 3, 2, 1);
        linkedHashMap.put(1, new C781980Ulw(1));
        linkedHashMap.put(2, new C781980Ulw(2));
        linkedHashMap.put(3, new C781980Ulw(3));
        linkedHashMap.put(4, new C781980Ulw(4));
        linkedHashMap.put(5, new C781980Ulw(5));
        this.LLJI = new InterfaceC915240ZvO() { // from class: X.0Ulv
            @Override // X.InterfaceC915240ZvO
            public final void LIZ(int i) {
                this.LIZ.LIZIZ(4, ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vL1().size());
            }
        };
        this.LLJIJIL = new ARunnableS112S0100000_12(this, 404);
    }

    public final void LIZJ(String str) {
        C1143680frq.LJ(this.LL, "tiktok_live_broadcast_demand_8", str, ImageView.ScaleType.CENTER_CROP);
    }

    public final void LIZLLL(boolean z) {
        View view;
        IMessageManager iMessageManager;
        Iterator<Integer> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            C781980Ulw c781980Ulw = (C781980Ulw) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(it2.next().intValue()));
            if (c781980Ulw != null) {
                c781980Ulw.LIZIZ = false;
                c781980Ulw.LIZJ = 0;
            }
        }
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLILZIL.removeMessages(1);
        this.LLILZIL.removeMessages(2);
        this.LLILZIL.removeCallbacks(this.LLJIJIL);
        DataChannel dataChannel2 = this.LLILZ;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(C001A.CHAT.getIntType(), this);
            iMessageManager.removeMessageListener(C001A.MEMBER.getIntType(), this);
            iMessageManager.removeMessageListener(C001A.GIFT.getIntType(), this);
        }
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Id0(this.LLJI);
        this.LLILZ = null;
        this.LLILZLL = null;
        this.LLJ = false;
        if (z && (view = this.LLILLL) != null) {
            C439101nJ.LJI(view);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                this.LLJ = true;
            }
            return true;
        }
        Iterator<Integer> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            C781980Ulw c781980Ulw = (C781980Ulw) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(iIntValue));
            if (c781980Ulw != null) {
                c781980Ulw.LIZIZ = false;
            }
        }
        this.LLJ = false;
        C786410Ut5.LJLJJI(1, 30000L, this.LLILZIL);
        C786410Ut5.LJLJJI(2, 25000L, this.LLILZIL);
        LIZ();
        return true;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof ChatMessage) {
            LIZIZ(2, 1);
            return;
        }
        if (iMessage instanceof MemberMessage) {
            if (((MemberMessage) iMessage).action != 1) {
                return;
            }
            LIZIZ(1, 1);
        } else {
            if (!(iMessage instanceof GiftMessage)) {
                return;
            }
            GiftMessage giftMessage = (GiftMessage) iMessage;
            Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(giftMessage.giftId);
            if ((giftFindGiftById != null || (giftFindGiftById = giftMessage.mGift) != null) && giftFindGiftById.combo && giftMessage.repeatEnd == 0) {
                return;
            }
            LIZIZ(3, 1);
        }
    }

    public final void LIZIZ(int i, int i2) {
        if (i == 6) {
            C0UVE.LJFF("issue");
            LIZJ("float_window_violation_icon.png");
            C16F5 c16f5 = this.LLILLJJLI;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131851244));
            }
            View view = this.LLILLL;
            if (view != null) {
                view.setBackgroundResource(R.drawable.ehl);
            }
            View view2 = this.LLILLL;
            if (view2 != null) {
                C12ES.LJIILL(0, view2);
            }
            LIZLLL(false);
            return;
        }
        C781980Ulw c781980Ulw = (C781980Ulw) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(i));
        if (c781980Ulw != null) {
            c781980Ulw.LIZJ += i2;
        }
        if (this.LLJ) {
            return;
        }
        LIZ();
    }
}
