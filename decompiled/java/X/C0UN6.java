package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import com.bytedance.android.livesdk.model.RoomEffect;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UN6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UN6 extends C2217421BqW implements Function1<Integer, Unit> {
    public C0UN6(Object obj) {
        super(1, obj, LiveStickerPropsDialog.class, "updateStickerUi", "updateStickerUi(I)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Sticker sticker;
        String str;
        T next;
        C946060aj6<RoomEffect> c946060aj6NR;
        C946050aj5 c946050aj5LIZIZ;
        int iIntValue = num.intValue();
        LiveStickerPropsDialog liveStickerPropsDialog = (LiveStickerPropsDialog) this.receiver;
        liveStickerPropsDialog.getClass();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue == 3 && !(!((ArrayList) C342601Uq.LJFF()).isEmpty())) {
                    int i = liveStickerPropsDialog.LLIZ + 1;
                    liveStickerPropsDialog.LLIZ = i;
                    if (i <= 1) {
                        liveStickerPropsDialog.RR().LJFF();
                        C20441214yg.LJ("LiveStickerPropsDialog", "failed to fetch stickers!");
                        liveStickerPropsDialog.MR();
                    }
                }
            } else {
                List<C0U74<RoomSticker>> listLJFF = C342601Uq.LJFF();
                ArrayList<C0U74> arrayList = (ArrayList) listLJFF;
                if (!arrayList.isEmpty()) {
                    liveStickerPropsDialog.RR().LIZLLL();
                    if (true ^ arrayList.isEmpty()) {
                        C0U6J c0u6j = liveStickerPropsDialog.LLILZIL;
                        if (c0u6j == null) {
                            c0u6j = null;
                        }
                        c0u6j.setData(listLJFF);
                        C946060aj6<RoomEffect> c946060aj6NR2 = liveStickerPropsDialog.NR();
                        if (c946060aj6NR2 != null) {
                            DataChannel dataChannel = liveStickerPropsDialog.dataChannel;
                            if (dataChannel != null) {
                                sticker = (Sticker) dataChannel.gg0(C0UN7.class);
                            } else {
                                sticker = null;
                            }
                            RoomEffect roomEffectLIZ = c946060aj6NR2.LIZ();
                            if (roomEffectLIZ != null) {
                                str = roomEffectLIZ.id;
                            } else {
                                str = null;
                            }
                            if (sticker != null) {
                                if (!Intrinsics.LJFF(sticker.LIZ, str) && (c946060aj6NR = liveStickerPropsDialog.NR()) != null && (c946050aj5LIZIZ = c946060aj6NR.LIZIZ()) != null) {
                                    c946050aj5LIZIZ.LIZLLL("has_params");
                                }
                            } else if (C500260Jjc.LJJIIZ(str)) {
                                C259800zU c259800zU = new C259800zU();
                                for (C0U74 c0u74 : arrayList) {
                                    if (c259800zU.element == 0) {
                                        Iterator it2 = c0u74.LIZIZ.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (Intrinsics.LJFF(((Sticker) next).LIZ, str)) {
                                                    break;
                                                }
                                            } else {
                                                next = 0;
                                                break;
                                            }
                                        }
                                        c259800zU.element = next;
                                    }
                                }
                                RoomSticker roomSticker = (RoomSticker) c259800zU.element;
                                if (roomSticker != null) {
                                    liveStickerPropsDialog.SR(roomSticker);
                                }
                            }
                        }
                    }
                }
            }
        } else if (!(!((ArrayList) C342601Uq.LJFF()).isEmpty())) {
            liveStickerPropsDialog.RR().LJI();
            C20441214yg.LJ("LiveStickerPropsDialog", "loading to fetch stickers!");
        }
        return Unit.LIZ;
    }
}
