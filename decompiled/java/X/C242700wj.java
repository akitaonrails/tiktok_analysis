package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftCollection;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C242700wj extends AbstractC1110760f0k<C176100lz> {
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final ImageView LLILZLL;

    public static final int P5() {
        Object obj;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return Intrinsics.LJFF(strValueOf, obj) ? 1 : 0;
    }

    public C242700wj(View view) {
        super(view);
        this.LLILZ = (TextView) view.findViewById(R.id.uz5);
        this.LLILZIL = (TextView) view.findViewById(R.id.uy7);
        this.LLILZLL = (ImageView) view.findViewById(R.id.jxe);
    }

    @Override // X.AbstractC1111020f1A
    public final void L5(final C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
        MESSAGE message;
        GiftCollection giftCollection;
        Gift gift;
        final C176100lz c176100lz = (C176100lz) interfaceC1112060f2q;
        if (this.LLILZ != null && this.LLILZIL != null && this.LLILZLL != null && (message = c176100lz.LJIL) != 0 && (giftCollection = ((GiftCollectionUpdateMessage) message).giftCollection) != null && (gift = giftCollection.gift) != null) {
            long j = giftCollection.round;
            long j2 = gift.id;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("travel_gift_massage_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(j), "round");
            c474500IjALIZ.LJJII(Integer.valueOf(P5()), "is_anchor");
            c474500IjALIZ.LJJII(Long.valueOf(j2), "gift_id");
            c474500IjALIZ.LIZ();
            this.LLILZLL.setImageResource(R.drawable.eqr);
            this.LLILZ.setText(c176100lz.getContent());
            this.LLILZIL.setText(c1109770ez9.LIZ.getString(2131843897));
            C786410Ut5.T7(this.LLILZIL, new View.OnClickListener() { // from class: X.00wi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Long lValueOf;
                    Room room;
                    DataChannel dataChannel = c1109770ez9.LJIIIZ;
                    Long lValueOf2 = null;
                    if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                        lValueOf = Long.valueOf(room.getOwnerUserId());
                        lValueOf2 = Long.valueOf(room.getId());
                    } else {
                        lValueOf = null;
                    }
                    long j3 = ((GiftCollectionUpdateMessage) c176100lz.LJIL).giftCollection.gift.id;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(((GiftCollectionUpdateMessage) c176100lz.LJIL).giftCollection.schemaUrl);
                    sbLIZ.append("&gift_id=");
                    sbLIZ.append(j3);
                    sbLIZ.append("&anchor_id=");
                    sbLIZ.append(lValueOf);
                    sbLIZ.append("&room_id=");
                    sbLIZ.append(lValueOf2);
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C786410Ut5.N3(c1109770ez9.LIZ), UriProtector.parse(new C495520Jby(C2188811AlT.LIZIZ(sbLIZ)).LIZLLL()));
                    C242700wj c242700wj = this;
                    long j4 = ((GiftCollectionUpdateMessage) c176100lz.LJIL).giftCollection.round;
                    c242700wj.getClass();
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("travel_gift_massage_click");
                    c474500IjALIZ2.LJIL();
                    c474500IjALIZ2.LJJII(Long.valueOf(j4), "round");
                    c474500IjALIZ2.LJJII(Integer.valueOf(C242700wj.P5()), "is_anchor");
                    c474500IjALIZ2.LJJII(Long.valueOf(j3), "gift_id");
                    c474500IjALIZ2.LIZ();
                }
            });
        }
    }
}
