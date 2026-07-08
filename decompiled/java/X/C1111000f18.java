package X;

import Y.AObjectS360S0100000_17;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftExtendScreenTagShow;
import com.bytedance.android.livesdk.livesetting.gift.LivePSMGiftIconSpaceFixSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceGift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1111000f18 extends AbstractC1110800f0o<GiftMessage> implements InterfaceC1110000ezW, InterfaceC1110040eza {
    public final C1111010f19 LJJI;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        return R.drawable.eyb;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final int LJLJJL() {
        return 1;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LL() {
        return false;
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
            String str = ((GiftMessage) this.LJIL).toMemberNickname;
            if (str != null && !str.isEmpty()) {
                strLIZ = str;
            }
            String str2 = ((GiftMessage) this.LJIL).baseMessage.describe;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(":");
            if (str2.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                strSubstring = str2.substring(strLIZ.length() + 1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (TextUtils.isEmpty(strSubstring)) {
            strSubstring = this.LJIL.baseMessage.describe;
        }
        return C175200lq.LIZJ(((GiftMessage) this.LJIL).fromUser, "：", strSubstring, LJIIL(), LJLLLL(), this);
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 1;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLIIJLIL() {
        return true;
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

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJIIZILJ() {
        return ((GiftMessage) this.LJIL).displayDurationMs > 0;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final long LJJII() {
        long j = ((GiftMessage) this.LJIL).displayDurationMs;
        return j > 0 ? j : super.LJJII();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1111840f2U
    public final void LJJIJIIJIL() {
        List<BadgeStruct> listLJII;
        List<BadgeStruct> badgeList;
        super.LJJIJIIJIL();
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        if (c1109770ez9.LJJ) {
            if (LiveExtendedScreenUiOptimizeSetting.INSTANCE.giftTrayOptimize(c1109770ez9.LJIIIZ) || LiveExtendedScreenGiftOptimizeSetting.INSTANCE.giftMessageViewHolder()) {
                C1111010f19 c1111010f19 = this.LJJI;
                C1109770ez9 c1109770ez92 = this.LJIILIIL;
                User user = getUser();
                BPEAHandler bPEAHandler = this.LJIJJ;
                if (c1111010f19.LIZIZ) {
                    return;
                }
                c1111010f19.LIZIZ = true;
                int i = c1109770ez92.LJJ ? 3 : 1;
                if ((user == null || (badgeList = user.getBadgeList()) == null || !(badgeList.isEmpty() ^ true)) ? false : true) {
                    listLJII = user.getBadgeList();
                } else {
                    C1142400fpm c1142400fpmLJ = C1136820fgm.LJ(c1109770ez92.LJIIIZ);
                    if (c1142400fpmLJ == null) {
                        return;
                    } else {
                        listLJII = c1142400fpmLJ.LJII(user, c1111010f19.LIZ.LJI);
                    }
                }
                if (listLJII == null || listLJII.isEmpty()) {
                    return;
                }
                if (c1111010f19.LIZJ == null) {
                    c1111010f19.LIZJ = new C520950Kbt(bPEAHandler, null, false, c1109770ez92.LIZJ);
                }
                if (c1111010f19.LIZLLL == null) {
                    c1111010f19.LIZLLL = new C520950Kbt(bPEAHandler, null, false, c1109770ez92.LIZJ);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                for (BadgeStruct badgeStruct : listLJII) {
                    if (c1111010f19.LIZ.LLIIZ(badgeStruct, user)) {
                        if (badgeStruct != null) {
                            if (badgeStruct.badgeScene != 8 || !UserLevelBadgeShowEnableSetting.INSTANCE.getValue()) {
                                if (badgeStruct != null) {
                                    if (badgeStruct.badgeScene != 4) {
                                        if (badgeStruct != null) {
                                            if (badgeStruct.badgeScene == 10) {
                                                if (FansClubBadgeShowEnableSetting.INSTANCE.getValue()) {
                                                    arrayList2.add(badgeStruct);
                                                    z = true;
                                                } else if (badgeStruct != null) {
                                                }
                                            }
                                            if ((badgeStruct.badgeScene == 8) || (badgeStruct != null && (badgeStruct.badgeScene == 10 || badgeStruct.badgeScene == 4 || badgeStruct.badgeScene == 6 || badgeStruct.badgeScene == 15))) {
                                                int i2 = badgeStruct.badgeScene;
                                                if (i2 == 6 || i2 == 15) {
                                                    arrayList.add(badgeStruct);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList2.add(badgeStruct);
                        }
                        arrayList.add(badgeStruct);
                    }
                }
                if (z) {
                    C520950Kbt c520950Kbt = c1111010f19.LIZLLL;
                    if (c520950Kbt != null) {
                        c520950Kbt.LJIIIZ = 3;
                    }
                } else {
                    C520950Kbt c520950Kbt2 = c1111010f19.LIZLLL;
                    if (c520950Kbt2 != null) {
                        c520950Kbt2.LJIIIZ = 2;
                    }
                }
                C520950Kbt c520950Kbt3 = c1111010f19.LIZJ;
                if (c520950Kbt3 != null) {
                    c520950Kbt3.LJIIIZ = 3;
                    c520950Kbt3.LJIIIZ(c1109770ez92.LJI, c1109770ez92.LIZ, arrayList, null, new AwS596S0100000_17(c1111010f19, 652), i, user, null, false);
                }
                C520950Kbt c520950Kbt4 = c1111010f19.LIZLLL;
                if (c520950Kbt4 != null) {
                    c520950Kbt4.LJIIIZ(c1109770ez92.LJI, c1109770ez92.LIZ, arrayList2, null, AFwS254S0000000_17.get$arr$(269), i, user, null, false);
                }
            }
        }
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJLI() {
        return (this.LIZJ || !LLIILII() || LJJLJ()) ? false : true;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final Text LLFZ() {
        Text text;
        CharSequence charSequenceLIZ;
        Text text2;
        String str;
        User user = ((GiftMessage) this.LJIL).fromUser;
        return (user == null || user.getId() != UserService.getInstance().user().getCurrentUserId() || (text2 = ((GiftMessage) this.LJIL).displayTextForSender) == null || (str = text2.key) == null || str.isEmpty()) ? (!LLIILII() || (text = ((GiftMessage) this.LJIL).displayTextForAnchor) == null || text.key == null || (charSequenceLIZ = C154600iW.LIZ(text, this)) == null || charSequenceLIZ.length() <= 0) ? super.LLFZ() : text : text2;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((GiftMessage) this.LJIL).publicAreaMessageCommon;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    @Override // X.AbstractC1110790f0n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LLIZLLLIL() {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111000f18.LLIZLLLIL():java.lang.CharSequence");
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((GiftMessage) this.LJIL).fromUser;
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLD() {
        if (LLIILII()) {
            return this;
        }
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILL() {
        if (!LLIILII()) {
            return true;
        }
        MESSAGE message = this.LJIL;
        return ((GiftMessage) message).displayTextForSender == null || !((GiftMessage) message).isFirstSendGift;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJ() {
        return !LLIILII();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final void dispose() {
        super.dispose();
        C1111010f19 c1111010f19 = this.LJJI;
        C520950Kbt c520950Kbt = c1111010f19.LIZJ;
        if (c520950Kbt != null) {
            c520950Kbt.LIZLLL();
        }
        c1111010f19.LIZJ = null;
        C520950Kbt c520950Kbt2 = c1111010f19.LIZLLL;
        if (c520950Kbt2 != null) {
            c520950Kbt2.LIZLLL();
        }
        c1111010f19.LIZLLL = null;
        c1111010f19.LIZIZ = false;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        GiftMessage giftMessage;
        Text text;
        String str;
        GiftMessage giftMessage2;
        Text text2;
        String str2;
        super.onAttach();
        if (LLIILII() && (text2 = (giftMessage2 = (GiftMessage) this.LJIL).displayTextForAnchor) != null && giftMessage2.isFirstSendGift && (str2 = text2.key) != null && !str2.isEmpty()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_system_message_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(text2.key, "starling_key");
            c474500IjALIZ.LIZ();
        }
        User user = ((GiftMessage) this.LJIL).fromUser;
        if (user == null || user.getId() != UserService.getInstance().user().getCurrentUserId() || (text = (giftMessage = (GiftMessage) this.LJIL).displayTextForSender) == null || !giftMessage.isFirstSendGift || (str = text.key) == null || str.isEmpty()) {
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_system_message_show");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJII(text.key, "starling_key");
        c474500IjALIZ2.LIZ();
    }

    public C1111000f18(GiftMessage giftMessage) {
        super(giftMessage);
        this.LJJI = new C1111010f19(this);
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJJJJZ(C1109770ez9 c1109770ez9) {
        super.LJJJJZ(c1109770ez9);
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
            long r0 = r0.colorId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.bytedance.android.live.base.model.ImageModel r2 = r4.LLJLILLLLZIIL(r0)
            if (r2 != 0) goto L4e
            return
        L4e:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostFrescoHelper> r0 = com.bytedance.android.livesdkapi.host.IHostFrescoHelper.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostFrescoHelper r1 = (com.bytedance.android.livesdkapi.host.IHostFrescoHelper) r1
            X.00uE r0 = new X.00uE
            r0.<init>()
            r1.xW1(r2, r0)
            goto L27
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1111000f18.LJJL(X.00m1):void");
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJLI(C1109770ez9 c1109770ez9) {
        this.LJ = false;
        this.LJIIL = null;
        if (c1109770ez9.LJJ) {
            if (LiveExtendedScreenUiOptimizeSetting.INSTANCE.giftTrayOptimize(c1109770ez9.LJIIIZ) || LiveExtendedScreenGiftOptimizeSetting.INSTANCE.giftMessageViewHolder()) {
                this.LJJI.LIZIZ = false;
            }
        }
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
    public final boolean LLJILJILJ(AwS383S0200000_17 awS383S0200000_17) {
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        if (!c1109770ez9.LJJ || ((!LiveExtendedScreenUiOptimizeSetting.INSTANCE.giftTrayOptimize(c1109770ez9.LJIIIZ) && (!LiveExtendedScreenGiftOptimizeSetting.INSTANCE.shouldShowGiftTag() || !LiveGiftExtendScreenTagShow.INSTANCE.isEnabled())) || !((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).canShowGiftTagInPublicScreen(this.LJIILIIL.LJIIIZ, (GiftMessage) this.LJIL))) {
            return false;
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getGiftTagInPublicScreenAsync(this.LJIILIIL.LJIIIZ, (GiftMessage) this.LJIL, new AObjectS360S0100000_17(awS383S0200000_17, 3));
        return true;
    }

    public final CharSequence LLJLIL(CharSequence charSequence) {
        Drawable drawableLJIIJ;
        if (TextUtils.isEmpty(charSequence) || (drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0)) == null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int iLastIndexOf = spannableStringBuilder.toString().lastIndexOf(" . ");
        if (iLastIndexOf < 0) {
            return charSequence;
        }
        int i = iLastIndexOf + 3;
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (LivePSMGiftIconSpaceFixSetting.INSTANCE.enabled()) {
            spannableStringBuilder2.append(' ');
        }
        spannableStringBuilder2.append('(');
        spannableStringBuilder2.append((char) 8288);
        int length = spannableStringBuilder2.length();
        spannableStringBuilder2.append((char) 65532);
        C786410Ut5.q2(spannableStringBuilder2, new C416760GVu(drawableLJIIJ), length, length + 1, 33);
        spannableStringBuilder2.append((char) 8288);
        spannableStringBuilder2.append((CharSequence) String.valueOf(((GiftMessage) this.LJIL).mGift.diamondCount));
        spannableStringBuilder2.append((char) 8288);
        spannableStringBuilder2.append(')');
        C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(getColor()), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.insert(i, (CharSequence) spannableStringBuilder2);
        return spannableStringBuilder;
    }

    public final ImageModel LLJLILLLLZIIL(Long l) {
        List<GiftColorInfo> list;
        ImageModel imageModel;
        Gift gift = ((GiftMessage) this.LJIL).mGift;
        ImageModel imageModelFindImageFromMultiResourceMap = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findImageFromMultiResourceMap(gift);
        if (gift != null) {
            list = gift.colorInfos;
        } else {
            list = null;
        }
        if (l != null && list != null) {
            for (GiftColorInfo giftColorInfo : list) {
                if (Objects.equals(giftColorInfo.colorId, l) && (imageModel = giftColorInfo.giftImage) != null) {
                    return imageModel;
                }
            }
        }
        return imageModelFindImageFromMultiResourceMap;
    }

    public final boolean LLJLL(Text text) {
        List<TextPiece> list;
        C1109770ez9 c1109770ez9;
        Gift gift;
        TextPieceGift textPieceGift;
        if (text != null && (list = text.pieces) != null && !list.isEmpty() && (c1109770ez9 = this.LJIILIIL) != null && c1109770ez9.LJJ && LiveExtendedScreenGiftOptimizeSetting.INSTANCE.shouldFormatGiftWithCoin() && (gift = ((GiftMessage) this.LJIL).mGift) != null && gift.diamondCount > 0) {
            for (TextPiece textPiece : text.pieces) {
                if (textPiece != null && textPiece.type == EnumC1133850fbz.GIFT.getPieceType() && (textPieceGift = textPiece.giftValue) != null && textPieceGift.showType == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJIJIL(int i, User user) {
        C289001Aa.LIZ(i, user);
    }
}
