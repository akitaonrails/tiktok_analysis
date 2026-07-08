package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.livesdk.chatroom.api.DonationStickerApi;
import com.bytedance.android.livesdk.model.DonationSticker;
import com.bytedance.android.livesdk.model.message.DecorationModifyMessage;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0f5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114000f5y extends AbstractC945390ai1<InterfaceC1114010f5z> implements OnMessageListener {
    public final long LL;

    public C1114000f5y(long j) {
        this.LL = j;
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC1114010f5z interfaceC1114010f5z) {
        super.attachView(interfaceC1114010f5z);
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MODIFY_DECORATION.getIntType(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        InterfaceC1114010f5z interfaceC1114010f5z;
        C001A messageType = ((BaseMessage) iMessage).getMessageType();
        if (messageType != null && C002W.LIZ[messageType.ordinal()] == 1 && (iMessage instanceof DecorationModifyMessage) && (interfaceC1114010f5z = (InterfaceC1114010f5z) this.mView) != null) {
            List<DonationSticker> list = ((DecorationModifyMessage) iMessage).decorationList;
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                Iterator<DonationSticker> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ());
                }
            }
            interfaceC1114010f5z.Ii0(arrayList);
        }
    }

    public final void LJJJJLL(int i, Map map) {
        ((DonationStickerApi) C482260Ivg.LIZJ(DonationStickerApi.class)).setDecoration(this.LL, i, map).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00LX
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DonationStickerPresenter@ab92.setDonationSticker$1");
                C1C7U.LIZIZ("DonationStickerPresenter@ab92.setDonationSticker$1");
            }
        }, new AfS181S0100000_12(this, 71));
    }
}
