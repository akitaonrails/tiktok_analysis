package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.GiftUnlockMessage;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.0fHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121100fHQ {
    public final Long LIZ;
    public final ImageModel LIZIZ;
    public final Text LIZJ;
    public final EnumC1120860fH2 LIZLLL;
    public final GiftUnlockMessage LJ;
    public final InterfaceC520940Kbs LJFF;
    public final Integer LJI;
    public final Integer LJII;

    public C1121100fHQ(Long l, ImageModel imageModel, Text text, EnumC1120860fH2 enumC1120860fH2, GiftUnlockMessage giftUnlockMessage, Integer num, Integer num2, int i) {
        enumC1120860fH2 = (i & 8) != 0 ? EnumC1120860fH2.GIFT_UNLOCK : enumC1120860fH2;
        giftUnlockMessage = (i & 16) != 0 ? null : giftUnlockMessage;
        num = (i & 64) != 0 ? null : num;
        num2 = (i & 128) != 0 ? null : num2;
        this.LIZ = l;
        this.LIZIZ = imageModel;
        this.LIZJ = text;
        this.LIZLLL = enumC1120860fH2;
        this.LJ = giftUnlockMessage;
        this.LJFF = null;
        this.LJI = num;
        this.LJII = num2;
    }
}
