package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.00mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C181000mm extends AbstractC1110800f0o<GiftGalleryMessage> implements InterfaceC1110000ezW, InterfaceC1110040eza {
    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        return R.drawable.eyb;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        String strLIZ;
        String strSubstring = null;
        try {
            if (getUser() != null) {
                strLIZ = C0KVU.LIZ(getUser());
                strLIZ.toString();
            } else {
                strLIZ = "";
            }
            String str = ((GiftGalleryMessage) this.LJIL).baseMessage.describe;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(":");
            if (str.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                strSubstring = str.substring(strLIZ.length() + 1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (TextUtils.isEmpty(strSubstring)) {
            strSubstring = this.LJIL.baseMessage.describe;
        }
        return C175200lq.LIZJ(((GiftGalleryMessage) this.LJIL).user, "：", strSubstring, LJIIL(), LJLLLL(), this);
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 1;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILII() {
        return true;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJILLL() {
        return true;
    }

    @Override // X.InterfaceC1110040eza
    public final void LIZIZ() {
        C1121570fIB c1121570fIB = new C1121570fIB();
        c1121570fIB.LIZJ = "interaction_msg";
        DataChannel dataChannel = this.LJIILIIL.LJIIIZ;
        if (dataChannel != null) {
            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interaction_message_click");
        c474500IjALIZ.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ.LJJII(this.LJIILL.LIZ ? "fold" : "unfold", "msg_position");
        c474500IjALIZ.LJJII(1, "msg_type");
        c474500IjALIZ.LJJII("content", "click_position");
        c474500IjALIZ.LJJII(LLIILII() ? "anchor" : "viewer", "admin_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJLI() {
        return (this.LIZJ || !LLIILII() || LJJLJ()) ? false : true;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((GiftGalleryMessage) this.LJIL).publicAreaMsgCommon;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((GiftGalleryMessage) this.LJIL).user;
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLD() {
        if (LLIILII()) {
            return this;
        }
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJ() {
        return !LLIILII();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        super.onAttach();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_public_msg_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        GiftGalleryMessage.GiftInfo giftInfo = ((GiftGalleryMessage) this.LJIL).giftInfo;
        String str = "";
        c474500IjALIZ.LJJII(giftInfo != null ? Long.valueOf(giftInfo.lightedUpGiftId) : "", "gift_id");
        c474500IjALIZ.LJJII(String.valueOf(this.LJIILIIL.LJII.author().getId()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(this.LJIILIIL.LJII.getId()), "room_id");
        int i = ((GiftGalleryMessage) this.LJIL).msgType;
        if (i == 1) {
            str = "new_gift_collect";
        } else if (i == 2) {
            str = "gift_gallery_lit_up";
        } else if (i == 3) {
            str = "title_overtake";
        } else if (i == 4) {
            str = "user_recall_guide";
        }
        c474500IjALIZ.LJJII(str, "msg_type");
        if (this.LJIILIIL.LJI) {
            c474500IjALIZ.LJJII("anchor", "user_type");
        } else {
            c474500IjALIZ.LJJII("user", "user_type");
        }
        c474500IjALIZ.LIZ();
    }

    public C181000mm(GiftGalleryMessage giftGalleryMessage) {
        super(giftGalleryMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // X.InterfaceC1110000ezW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL(final X.InterfaceC176300m1 r11) {
        /*
            r10 = this;
            MESSAGE extends X.0ffY r0 = r10.LJIL
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto L88
            com.bytedance.android.livesdk.model.message.common.Text r3 = r0.displayText
            if (r3 == 0) goto L88
            java.lang.String r2 = r3.defaultPattern
            java.lang.String r0 = r3.key
            if (r0 == 0) goto L1f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r3.key
            r1.getClass()
            java.lang.String r0 = X.C1124870fNV.LIZIZ(r0)
            if (r0 != 0) goto L21
        L1f:
            if (r2 == 0) goto L88
        L21:
            java.util.List<com.bytedance.android.livesdk.model.message.common.TextPiece> r0 = r3.pieces
            java.util.Iterator r9 = r0.iterator()
        L27:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r8 = r9.next()
            com.bytedance.android.livesdk.model.message.common.TextPiece r8 = (com.bytedance.android.livesdk.model.message.common.TextPiece) r8
            int r1 = r8.type
            X.0fbz r0 = X.EnumC1133850fbz.GIFT
            int r0 = r0.getPieceType()
            if (r1 != r0) goto L27
            com.bytedance.android.livesdk.model.message.common.TextPieceGift r0 = r8.giftValue
            if (r0 == 0) goto L27
            MESSAGE extends X.0ffY r0 = r10.LJIL
            com.bytedance.android.livesdk.model.message.GiftGalleryMessage r0 = (com.bytedance.android.livesdk.model.message.GiftGalleryMessage) r0
            com.bytedance.android.livesdk.model.message.GiftGalleryMessage$GiftInfo r0 = r0.giftInfo
            if (r0 == 0) goto L87
            com.bytedance.android.livesdk.model.Gift r0 = r0.gift
            if (r0 == 0) goto L87
            com.bytedance.android.live.base.model.ImageModel r6 = r0.image
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r0 = r0.colorInfos
            if (r0 == 0) goto L76
            java.util.Iterator r7 = r0.iterator()
        L57:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r5 = r7.next()
            com.bytedance.android.livesdk.gift.model.GiftColorInfo r5 = (com.bytedance.android.livesdk.gift.model.GiftColorInfo) r5
            java.lang.Long r0 = r5.colorId
            long r3 = r0.longValue()
            com.bytedance.android.livesdk.model.message.common.TextPieceGift r0 = r8.giftValue
            long r1 = r0.colorId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
            com.bytedance.android.live.base.model.ImageModel r0 = r5.giftImage
            if (r0 == 0) goto L76
            r6 = r0
        L76:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostFrescoHelper> r0 = com.bytedance.android.livesdkapi.host.IHostFrescoHelper.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostFrescoHelper r1 = (com.bytedance.android.livesdkapi.host.IHostFrescoHelper) r1
            X.00mn r0 = new X.00mn
            r0.<init>()
            r1.xW1(r6, r0)
            goto L27
        L87:
            return
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181000mm.LJJL(X.00m1):void");
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final CharSequence LJLIL(User user) {
        return C0KVU.LIZ(user);
    }

    @Override // X.AbstractC1110790f0n
    public final void LJZI(UserProfileEvent userProfileEvent) {
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        if (c1109770ez9 != null && c1109770ez9.LJJI == EnumC1112150f2z.ExtendedGift) {
            userProfileEvent.mEventPage = "live_gift_record";
        }
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJILJIL(User user) {
        C289001Aa.LIZIZ(user);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJIJIL(int i, User user) {
        C289001Aa.LIZ(i, user);
    }
}
