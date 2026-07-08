package Y;

import X.C09JN;
import X.C0IJT;
import X.C1AJJ;
import X.C1AJL;
import X.C1AJN;
import X.C1C7U;
import X.C2177381AJk;
import X.C342601Uq;
import X.C474500IjA;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomStickerWrapperWidget;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class AfS37S0210000_33 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS37S0210000_33 afS37S0210000_33, Object obj) {
        Boolean boolValueOf;
        Object next;
        C1C7U.LIZ("RoomStickerWrapperWidget@e743.delayReportDecorationUsed$1");
        if (afS37S0210000_33.z2) {
            List<C1AJN<?>> list = ((RoomStickerWrapperWidget) afS37S0210000_33.l0).LLILLL;
            RoomSticker roomSticker = (RoomSticker) afS37S0210000_33.l1;
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                boolValueOf = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C1AJN) next).LL.id == roomSticker.id) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1AJN c1ajn = (C1AJN) next;
            if (c1ajn != null) {
                RoomSticker roomSticker2 = (RoomSticker) afS37S0210000_33.l1;
                if (c1ajn instanceof C1AJJ) {
                    C1AJJ c1ajj = (C1AJJ) c1ajn;
                    if (c1ajj.LL.type == 4) {
                        boolValueOf = Boolean.valueOf(C342601Uq.LIZIZ(c1ajj.getContent(), roomSticker2));
                    }
                }
            }
            C2177381AJk c2177381AJk = C1AJL.LIZLLL;
            C1AJL.LJI(((RoomStickerWrapperWidget) afS37S0210000_33.l0).dataChannel, (RoomSticker) afS37S0210000_33.l1, boolValueOf);
        }
        int i = ((RoomSticker) afS37S0210000_33.l1).type;
        if (i != 4) {
            if (i == 5 || i == 6) {
                ((RoomStickerWrapperWidget) afS37S0210000_33.l0).LLJILLL = true;
            }
        } else {
            ((RoomStickerWrapperWidget) afS37S0210000_33.l0).LLJJ = true;
        }
        C1C7U.LIZIZ("RoomStickerWrapperWidget@e743.delayReportDecorationUsed$1");
    }

    public static final void accept$1(AfS37S0210000_33 afS37S0210000_33, Object obj) {
        Boolean boolValueOf;
        Object next;
        C1C7U.LIZ("RoomStickerWrapperWidget@e743.delayReportDecorationUsedNew$1");
        if (afS37S0210000_33.z2) {
            List<C1AJN<?>> list = ((RoomStickerWrapperWidget) afS37S0210000_33.l0).LLILLL;
            RoomSticker roomSticker = (RoomSticker) afS37S0210000_33.l1;
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                boolValueOf = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C1AJN) next).LL.id == roomSticker.id) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1AJN c1ajn = (C1AJN) next;
            if (c1ajn != null) {
                RoomSticker roomSticker2 = (RoomSticker) afS37S0210000_33.l1;
                if (c1ajn instanceof C1AJJ) {
                    C1AJJ c1ajj = (C1AJJ) c1ajn;
                    if (c1ajj.LL.type == 4) {
                        boolValueOf = Boolean.valueOf(C342601Uq.LIZIZ(c1ajj.getContent(), roomSticker2));
                    }
                }
            }
            C2177381AJk c2177381AJk = C1AJL.LIZLLL;
            DataChannel dataChannel = ((RoomStickerWrapperWidget) afS37S0210000_33.l0).dataChannel;
            RoomSticker roomSticker3 = (RoomSticker) afS37S0210000_33.l1;
            if (roomSticker3 != null && roomSticker3.type == 4) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_host_character_prop_effective_use");
                c474500IjALIZ.LJJII(String.valueOf(roomSticker3.id), "prop_id");
                c474500IjALIZ.LJJII(roomSticker3.name, "prop_name");
                c474500IjALIZ.LJJII(Integer.valueOf(1 ^ (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0)), "is_origin_words");
                c474500IjALIZ.LJJII(Integer.valueOf(roomSticker3.LIZLLL ? 1 : 0), "is_remember");
                c474500IjALIZ.LJIILJJIL("live_take_detail");
                c474500IjALIZ.LJJII(roomSticker3.LIZ, "resource_id");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LIZ();
            }
        }
        C1C7U.LIZIZ("RoomStickerWrapperWidget@e743.delayReportDecorationUsedNew$1");
    }

    public AfS37S0210000_33(RoomStickerWrapperWidget roomStickerWrapperWidget, RoomSticker roomSticker, int i) {
        this.$t = i;
        this.z2 = true;
        this.l0 = roomStickerWrapperWidget;
        this.l1 = roomSticker;
    }

    public AfS37S0210000_33(boolean z, RoomStickerWrapperWidget roomStickerWrapperWidget, RoomSticker roomSticker, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = roomStickerWrapperWidget;
        this.l1 = roomSticker;
    }
}
