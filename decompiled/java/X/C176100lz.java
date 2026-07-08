package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.00lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C176100lz extends AbstractC1110800f0o<GiftCollectionUpdateMessage> implements InterfaceC1110000ezW {
    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        return R.drawable.eyb;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        return null;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return null;
    }

    public C176100lz(GiftCollectionUpdateMessage giftCollectionUpdateMessage) {
        super(giftCollectionUpdateMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // X.InterfaceC1110000ezW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL(final X.InterfaceC176300m1 r5) {
        /*
            r4 = this;
            MESSAGE extends X.0ffY r0 = r4.LJIL
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto L5f
            com.bytedance.android.livesdk.model.message.common.Text r3 = r0.displayText
            if (r3 == 0) goto L5f
            java.lang.String r2 = r3.defaultPattern
            java.lang.String r0 = r3.key
            if (r0 == 0) goto L1f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r3.key
            r1.getClass()
            java.lang.String r0 = X.C1124870fNV.LIZIZ(r0)
            if (r0 != 0) goto L21
        L1f:
            if (r2 == 0) goto L5f
        L21:
            java.util.List<com.bytedance.android.livesdk.model.message.common.TextPiece> r0 = r3.pieces
            java.util.Iterator r3 = r0.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r3.next()
            com.bytedance.android.livesdk.model.message.common.TextPiece r2 = (com.bytedance.android.livesdk.model.message.common.TextPiece) r2
            int r1 = r2.type
            X.0fbz r0 = X.EnumC1133850fbz.GIFT
            int r0 = r0.getPieceType()
            if (r1 != r0) goto L27
            com.bytedance.android.livesdk.model.message.common.TextPieceGift r0 = r2.giftValue
            if (r0 == 0) goto L27
            MESSAGE extends X.0ffY r0 = r4.LJIL
            com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage r0 = (com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage) r0
            com.bytedance.android.livesdk.model.message.GiftCollection r0 = r0.giftCollection
            com.bytedance.android.livesdk.model.Gift r0 = r0.gift
            if (r0 != 0) goto L4c
            return
        L4c:
            com.bytedance.android.live.base.model.ImageModel r2 = r0.image
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostFrescoHelper> r0 = com.bytedance.android.livesdkapi.host.IHostFrescoHelper.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostFrescoHelper r1 = (com.bytedance.android.livesdkapi.host.IHostFrescoHelper) r1
            X.00m0 r0 = new X.00m0
            r0.<init>()
            r1.xW1(r2, r0)
            goto L27
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176100lz.LJJL(X.00m1):void");
    }
}
