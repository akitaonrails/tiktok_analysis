package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.Pair;
import tikcast.api.creator_succ.UserParam;

/* JADX INFO: renamed from: X.00uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C226800uA extends AbstractC1110800f0o<InteractionHubGoalMessage> implements InterfaceC1110000ezW {
    public Bitmap LJJI;
    public boolean LJJIFFI;
    public Bitmap LJJII;
    public boolean LJJIII;
    public Pair<Integer, Integer> LJJIIJ;
    public boolean LJJIIJZLJL;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJLJ() {
        return false;
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 8;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJ() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[PHI: r1
      0x002c: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v11 java.lang.String) binds: [B:14:0x002a, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1110790f0n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LLFF() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226800uA.LLFF():java.lang.CharSequence");
    }

    public final String LLJLIL() {
        String str;
        Text text = ((InteractionHubGoalMessage) this.LJIL).interactionTips;
        return (text == null || (str = text.key) == null) ? "" : str;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        UserParam userParam = ((InteractionHubGoalMessage) this.LJIL).userParam;
        if (userParam != null) {
            return userParam.targetUserInfo;
        }
        return null;
    }

    public C226800uA(InteractionHubGoalMessage interactionHubGoalMessage) {
        super(interactionHubGoalMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098 A[RETURN] */
    @Override // X.InterfaceC1110000ezW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL(final X.InterfaceC176300m1 r8) {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.LJJI
            if (r0 == 0) goto La
            if (r8 == 0) goto L9
            r8.LLLL(r0, r7)
        L9:
            return
        La:
            boolean r0 = r7.LJJIFFI
            if (r0 == 0) goto Lf
            return
        Lf:
            MESSAGE extends X.0ffY r0 = r7.LJIL
            com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage r0 = (com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage) r0
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.interactionTips
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L9b
            java.util.List<com.bytedance.android.livesdk.model.message.common.TextPiece> r0 = r0.pieces
            if (r0 == 0) goto L9b
            java.util.Iterator r4 = r0.iterator()
        L21:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.bytedance.android.livesdk.model.message.common.TextPiece r2 = (com.bytedance.android.livesdk.model.message.common.TextPiece) r2
            int r1 = r2.type
            X.0fbz r0 = X.EnumC1133850fbz.GIFT
            int r0 = r0.getPieceType()
            if (r1 != r0) goto L21
            com.bytedance.android.livesdk.model.message.common.TextPieceGift r0 = r2.giftValue
            if (r0 == 0) goto L21
        L3c:
            com.bytedance.android.livesdk.model.message.common.TextPiece r3 = (com.bytedance.android.livesdk.model.message.common.TextPiece) r3
            if (r3 == 0) goto L9b
            MESSAGE extends X.0ffY r0 = r7.LJIL
            com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage r0 = (com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage) r0
            tikcast.api.creator_succ.LiveGoalParam r0 = r0.liveGoalParam
            if (r0 == 0) goto L95
            com.bytedance.android.livesdk.model.Gift r2 = r0.giftInfo
            if (r2 == 0) goto L95
            com.bytedance.android.live.gift.GiftService r0 = com.bytedance.android.live.gift.GiftService.LLILLJJLI
            com.bytedance.android.live.base.model.ImageModel r4 = r0.findImageFromMultiResourceMap(r2)
            com.bytedance.android.livesdk.model.message.common.TextPieceGift r0 = r3.giftValue
            if (r0 == 0) goto L96
            long r0 = r0.colorId
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            if (r3 == 0) goto L96
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r0 = r2.colorInfos
            if (r0 == 0) goto L96
            java.util.Iterator r2 = r0.iterator()
        L66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r1 = r2.next()
            com.bytedance.android.livesdk.gift.model.GiftColorInfo r1 = (com.bytedance.android.livesdk.gift.model.GiftColorInfo) r1
            if (r1 == 0) goto L66
            java.lang.Long r0 = r1.colorId
            if (r0 == 0) goto L66
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L66
            com.bytedance.android.live.base.model.ImageModel r0 = r1.giftImage
            if (r0 == 0) goto L96
            r4 = r0
        L83:
            r7.LJJIFFI = r5
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostFrescoHelper> r0 = com.bytedance.android.livesdkapi.host.IHostFrescoHelper.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostFrescoHelper r1 = (com.bytedance.android.livesdkapi.host.IHostFrescoHelper) r1
            X.00uB r0 = new X.00uB
            r0.<init>()
            r1.xW1(r4, r0)
        L95:
            return
        L96:
            if (r4 != 0) goto L83
            return
        L99:
            r3 = r6
            goto L3c
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226800uA.LJJL(X.00m1):void");
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final void LJJLIIJ(C443120HZe<Bitmap, Integer, Integer> c443120HZe) {
        if (this.LJIILIIL != null) {
            LLJI();
            LLIIIILZ().LJIIIZ(this, new C227000uC(c443120HZe));
        }
    }
}
