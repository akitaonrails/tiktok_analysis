package X;

import Y.AfS197S0100000_28;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.message.BizStickerMessage;
import com.bytedance.android.livesdk.model.message.RoomStickerMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AJM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJM extends AbstractC945390ai1<InterfaceC1871320ynS> implements OnMessageListener {
    public final long LL;
    public final List<Integer> LLILLJJLI = C1697810uHb.LJIIJJI(1, 2, 4, 5, 6);

    public C1AJM(long j) {
        this.LL = j;
    }

    public static final String LJJJJZI(int i) {
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        if (context == null) {
            return "";
        }
        String string = context.getString(2131851990);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    public static String LJJJLIIL(String str) {
        if (str != null) {
            List listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{'/'}, false, 0, 6);
            int size = listLJJLIIIJ.size();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJ, size - 2));
            sbLIZ.append('/');
            sbLIZ.append((String) ListProtector.get(listLJJLIIIJ, size - 1));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC1871320ynS interfaceC1871320ynS) {
        super.attachView(interfaceC1871320ynS);
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MODIFY_STICKER.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.mMessageManager;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.BIZ_STICKER_MESSAGE.getIntType(), this);
        }
    }

    public final void LJJJJLL(RoomSticker roomSticker) {
        C1AJX.LIZIZ = SystemClock.elapsedRealtime();
        if (!roomSticker.hasUploadToServer && C342701Ur.LIZ(roomSticker)) {
            return;
        }
        roomSticker.hasUploadToServer = false;
        ((RoomStickerApi) C482260Ivg.LIZJ(RoomStickerApi.class)).deleteRoomStickers(roomSticker.id, this.LL).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0ynR
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RoomStickerPresenter@1cdb.deleteRoomStickers$1");
                C1AJX.LIZIZ(1, 1, "");
                C1C7U.LIZIZ("RoomStickerPresenter@1cdb.deleteRoomStickers$1");
            }
        }, new AfS197S0100000_28(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List<com.bytedance.android.livesdk.model.RoomSticker>] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        ?? arrayList;
        List<C1AJN<?>> listQo2;
        InterfaceC1871320ynS interfaceC1871320ynS;
        if (iMessage instanceof RoomStickerMessage) {
            arrayList = ((RoomStickerMessage) iMessage).stickerList;
        } else if (iMessage instanceof BizStickerMessage) {
            List<RoomSticker> list = ((BizStickerMessage) iMessage).bizSticker;
            arrayList = new ArrayList();
            for (RoomSticker roomSticker : list) {
                if (this.LLILLJJLI.contains(Integer.valueOf(roomSticker.type))) {
                    arrayList.add(roomSticker);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (StickerAudienceEnableSetting.INSTANCE.getValue() == 1) {
            if (C086I.LIZIZ(arrayList)) {
                InterfaceC1871320ynS interfaceC1871320ynS2 = (InterfaceC1871320ynS) this.mView;
                if (interfaceC1871320ynS2 != null) {
                    interfaceC1871320ynS2.U70();
                }
            } else {
                InterfaceC1871320ynS interfaceC1871320ynS3 = (InterfaceC1871320ynS) this.mView;
                if (interfaceC1871320ynS3 != null) {
                    interfaceC1871320ynS3.QN((RoomSticker) C13LP.LJJJLL(arrayList));
                }
            }
        }
        if (arrayList != 0 && !arrayList.isEmpty()) {
            if (C13LP.LJJJLL(arrayList) != null) {
                if (Intrinsics.LJFF(this.dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE) && (interfaceC1871320ynS = (InterfaceC1871320ynS) this.mView) != null) {
                    interfaceC1871320ynS.MU1((RoomSticker) C13LP.LJJJLL(arrayList));
                }
            } else {
                return;
            }
        }
        RoomSticker roomSticker2 = (RoomSticker) C13LP.LJJJLL(arrayList);
        if (roomSticker2 != null) {
            C2177381AJk c2177381AJk = C1AJL.LIZLLL;
            C1AJL.LJFF(this.dataChannel, roomSticker2, Boolean.TRUE, roomSticker2.reviewStatus, "im");
            if (C0UNG.LIZ(roomSticker2)) {
                InterfaceC1874790yt3 interfaceC1874790yt3 = (InterfaceC1874790yt3) this.mView;
                C1AJN<?> c1ajn = null;
                if (interfaceC1874790yt3 != null && (listQo2 = interfaceC1874790yt3.qo2()) != null) {
                    Iterator<C1AJN<?>> it2 = listQo2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1AJN<?> next = it2.next();
                        if (next.getType() == 4) {
                            c1ajn = next;
                            break;
                        }
                    }
                    c1ajn = c1ajn;
                }
                if (c1ajn instanceof C1AJJ) {
                    C2177381AJk c2177381AJk2 = C1AJL.LIZLLL;
                    C1AJL.LJII(this.dataChannel, roomSticker2, Boolean.valueOf(C342601Uq.LIZIZ(((C1AJJ) c1ajn).getContent(), roomSticker2)));
                    C1AJL.LIZJ = SystemClock.elapsedRealtime();
                }
            }
        }
    }
}
