package X;

import android.os.Looper;
import com.bytedance.android.livesdk.model.message.BoostCard;
import com.bytedance.android.livesdk.model.message.GiftBoostCardMessage;
import com.bytedance.android.livesdk.rank.impl.boostcard.LiveBoostCardApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00yA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C251600yA implements OnMessageListener {
    public DataChannel LL;
    public long LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILZIL;
    public GiftBoostCardMessage LLILZLL;
    public final C11NJ LLILLL = new C11NJ();
    public final RunnableC514801zW LLIZ = new RunnableC514801zW(this, 94);
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());

    public final void LIZ() {
        List<BoostCard> arrayList;
        List<BoostCard> list;
        String str;
        GiftBoostCardMessage giftBoostCardMessage = this.LLILZLL;
        if (giftBoostCardMessage == null || (arrayList = giftBoostCardMessage.mCards) == null) {
            arrayList = new ArrayList();
        }
        for (BoostCard boostCard : arrayList) {
            String strValueOf = String.valueOf(boostCard.mTaskId);
            String strValueOf2 = String.valueOf(boostCard.mCardId);
            String strValueOf3 = String.valueOf(boostCard.mTaskSource);
            boolean zIsAppForeground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground();
            if (zIsAppForeground) {
                str = "inapp";
            } else {
                if (zIsAppForeground) {
                    throw new C1954807lC();
                }
                str = "outapp";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("receive_boost_card");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(strValueOf, "task_id");
            c474500IjALIZ.LJJII(strValueOf2, "card_id");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(strValueOf3, "task_source");
            c474500IjALIZ.LJJII(str, "event_page");
            c474500IjALIZ.LIZ();
        }
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        GiftBoostCardMessage giftBoostCardMessage2 = this.LLILZLL;
        c784440UpuLIZ.LIZIZ(new C251900yD((giftBoostCardMessage2 == null || (list = giftBoostCardMessage2.mCards) == null) ? 1 : list.size()));
        C480460Ism.LIZ().getClass();
        ((LiveBoostCardApi) C480460Ism.LIZLLL(LiveBoostCardApi.class)).boostCardAck(this.LLILLJJLI, 1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new AnonymousClass0201(0));
        this.LLILZ = false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof GiftBoostCardMessage)) {
            return;
        }
        this.LLILZLL = (GiftBoostCardMessage) iMessage;
        if (this.LLILZ) {
            this.LLIZLLLIL.removeCallbacks(this.LLIZ);
            C786410Ut5.LJLIIL(1000L, this.LLIZLLLIL, this.LLIZ);
        } else {
            this.LLILZIL = true;
        }
    }
}
