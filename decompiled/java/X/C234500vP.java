package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.model.GetUserStatusResp;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenCheckDirectionalityCountSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenGreetingDelaySetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveRoomEnterMessageAvoidCapsuleTypesSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.WaveAlgorithmData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.EnterNearByInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PublicCommonDynamicText;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.text.BreakIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00vP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C234500vP extends AbstractC1110800f0o<MemberMessage> {
    public boolean LJJI;
    public Boolean LJJIFFI;
    public C234700vR LJJII;
    public C11JF LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public GetUserStatusResp.Data LJJIIZ;
    public final C234900vT LJJIIZI;
    public final int LJJIJ;
    public int LJJIJIIJI;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final long LJJII() {
        return 3000L;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final int LJLJJL() {
        return 1;
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLD() {
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILII() {
        return false;
    }

    @Override // X.AbstractC1110790f0n
    public final void LLILZ(BadgeStruct badgeStruct) {
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJILLL() {
        return true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        MESSAGE message = this.LJIL;
        return (((MemberMessage) message).action == 1 || ((MemberMessage) message).action == 47) ? R.drawable.eui : R.drawable.eu1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        r9.LJJIJIIJI = 2;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x005e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[PHI: r1 r2
      0x0063: PHI (r1v4 boolean) = (r1v2 boolean), (r1v6 boolean) binds: [B:40:0x0071, B:32:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r2v4 boolean) = (r2v2 boolean), (r2v1 boolean) binds: [B:40:0x0071, B:32:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c A[SYNTHETIC] */
    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIZ() {
        /*
            r9 = this;
            X.0ez9 r0 = r9.LJIILIIL
            boolean r0 = r0.LJI
            r8 = 0
            if (r0 != 0) goto L8
            return r8
        L8:
            boolean r0 = r9.LLJJL()
            if (r0 == 0) goto Lf
            return r8
        Lf:
            java.lang.CharSequence r7 = r9.getContent()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L1a
            return r8
        L1a:
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon r0 = r9.LLIIII()
            r6 = 1
            if (r0 == 0) goto L2a
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon r0 = r9.LLIIII()
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$OperationInfo r0 = r0.operationInfo
            if (r0 == 0) goto L2a
            return r8
        L2a:
            MESSAGE extends X.0ffY r0 = r9.LJIL
            com.bytedance.android.livesdk.model.message.MemberMessage r0 = (com.bytedance.android.livesdk.model.message.MemberMessage) r0
            int r0 = r0.action
            if (r0 != r6) goto L7c
            X.0ez9 r0 = r9.LJIILIIL
            boolean r5 = r0.LJFF()
            if (r5 == 0) goto L7b
            int r1 = r7.length()
            int r0 = r9.LJJIJ
            if (r1 < r0) goto L7b
            int r0 = r9.LJJIJIIJI
            r4 = 2
            if (r0 != 0) goto L67
            r3 = 0
            r2 = 0
            r1 = 0
        L4a:
            int r0 = r7.length()
            if (r3 >= r0) goto L73
            char r0 = r7.charAt(r3)
            byte r0 = java.lang.Character.getDirectionality(r0)
            if (r0 == 0) goto L71
            if (r0 == r6) goto L6f
            if (r0 == r4) goto L6f
            switch(r0) {
                case 14: goto L71;
                case 15: goto L71;
                case 16: goto L6f;
                case 17: goto L6f;
                default: goto L61;
            }
        L61:
            if (r2 == 0) goto L6c
        L63:
            if (r1 == 0) goto L6c
        L65:
            r9.LJJIJIIJI = r4
        L67:
            int r0 = r9.LJJIJIIJI
            if (r0 != r4) goto L7b
            return r8
        L6c:
            int r3 = r3 + 1
            goto L4a
        L6f:
            r1 = 1
            goto L61
        L71:
            r2 = 1
            goto L63
        L73:
            if (r2 == 0) goto L78
            if (r1 == 0) goto L78
            goto L65
        L78:
            r9.LJJIJIIJI = r6
            goto L67
        L7b:
            return r5
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234500vP.LJJIIZ():boolean");
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJIIZI() {
        Boolean bool = this.LJJIFFI;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (this.LJIILIIL.LJFF()) {
            C1109770ez9 c1109770ez9 = this.LJIILIIL;
            if (c1109770ez9.LJI) {
                AbstractC1111980f2i<? extends AbstractC1136060ffY> abstractC1111980f2iLJJIZ = c1109770ez9.LJIIJJI.LJJIZ(this.LJIL);
                C1109770ez9 c1109770ez92 = this.LJIILIIL;
                if (c1109770ez92.LJJI == EnumC1112150f2z.Main && abstractC1111980f2iLJJIZ != null && !abstractC1111980f2iLJJIZ.LJIIIIZZ(c1109770ez92, this.LJIL)) {
                    z = true;
                }
            } else {
                z = this.LIZJ;
            }
        }
        this.LJJIFFI = Boolean.valueOf(z);
        return z;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJJJ() {
        if (LLJLIL(this.LJIILIIL, (MemberMessage) this.LJIL)) {
            return true;
        }
        return super.LJJJJ();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJZI() {
        return this.LJIILIIL.LIZIZ();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final Map<String, String> LJJLIIIJ() {
        Room room;
        PublicCommonDynamicText publicCommonDynamicText;
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        return (c1109770ez9 == null || (room = c1109770ez9.LJII) == null || (publicCommonDynamicText = room.dynamicTextInfo) == null) ? Collections.EMPTY_MAP : publicCommonDynamicText.clientStringRef;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112780f40
    public final C234700vR LJLJJLL() {
        if (this.LJJII == null) {
            this.LJJII = new C234700vR();
        }
        if (((MemberMessage) this.LJIL).action == 46) {
            this.LJJII.LJ = 1;
        }
        return this.LJJII;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1111840f2U
    public final void LJZ() {
        C1110880f0w c1110880f0w;
        MESSAGE message = this.LJIL;
        if (message == 0 || ((MemberMessage) message).hitAbStatus != 2 || (c1110880f0w = this.LJIILJJIL) == null || c1110880f0w.LIZJ != 1) {
            return;
        }
        C161900jh.LIZ(this.LJIILIIL.LJIIIZ, 2);
    }

    @Override // X.AbstractC1110790f0n
    public CharSequence LLFF() {
        MemberMessage memberMessage = (MemberMessage) this.LJIL;
        int i = memberMessage.action;
        if (i != 1) {
            if (i != 3 && i != 4 && i != 5 && i != 6) {
                if (i != 46 && i != 47) {
                    switch (i) {
                        case 8:
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Top");
                            sbLIZ.append(((MemberMessage) this.LJIL).topUserNo);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            String strLLJLILLLLZIIL = LLJLILLLLZIIL((MemberMessage) this.LJIL);
                            if (C497740JfY.LJJ()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(((MemberMessage) this.LJIL).topUserNo);
                                sbLIZ2.append("Top");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                StringBuffer stringBuffer = new StringBuffer(strLLJLILLLLZIIL);
                                stringBuffer.reverse();
                                strLLJLILLLLZIIL = stringBuffer.toString();
                            }
                            String[] strArrSplit = strLLJLILLLLZIIL.split(strLIZIZ);
                            if (strArrSplit[0].length() == strLLJLILLLLZIIL.length()) {
                                return C1133830fbx.LIZ;
                            }
                            SpannableString spannableString = new SpannableString(strLLJLILLLLZIIL);
                            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Fo2().getClass();
                            int iLIZ = C175200lq.LIZ(R.color.a8p);
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iLIZ);
                            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(iLIZ);
                            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(iLIZ);
                            C786410Ut5.o2(spannableString, foregroundColorSpan2, 0, strArrSplit[0].length(), 18);
                            C786410Ut5.o2(spannableString, foregroundColorSpan, strArrSplit[0].length(), strArrSplit[0].length() + strLIZIZ.length(), 18);
                            C786410Ut5.o2(spannableString, foregroundColorSpan3, strArrSplit[0].length() + strLIZIZ.length(), strLLJLILLLLZIIL.length(), 18);
                            C786410Ut5.o2(spannableString, new C1110050ezb(getUser(), iLIZ, null, null, false), 0, spannableString.length(), 18);
                            return spannableString;
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            break;
                        default:
                            return C175200lq.LIZLLL(memberMessage.user, "  ", LLJLILLLLZIIL(memberMessage), LJIIL(), LJLLLL(), this);
                    }
                }
            }
            User user = getUser();
            String strLLJLILLLLZIIL2 = LLJLILLLLZIIL((MemberMessage) this.LJIL);
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Fo2().getClass();
            SpannableString spannableString2 = new SpannableString(strLLJLILLLLZIIL2);
            C786410Ut5.o2(spannableString2, LJJJ(C175200lq.LIZ(R.color.a8p), user), 0, spannableString2.length(), 18);
            return spannableString2;
        }
        if (!LLLFFI() && !((MemberMessage) this.LJIL).isTopUser) {
            return LLIZLLLIL();
        }
        return C175200lq.LJFF(((MemberMessage) this.LJIL).user, LLJLLIL(), LJIIL(), LJLLLL(), this);
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return ((MemberMessage) this.LJIL).action == 1 ? 5 : 0;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((MemberMessage) this.LJIL).publicAreaMessageCommon;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILL() {
        MESSAGE message = this.LJIL;
        return ((MemberMessage) message).action == 1 || ((MemberMessage) message).action == 46;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJ() {
        if (((MemberMessage) this.LJIL).action != 1) {
            return false;
        }
        return (LLIILII() || this.LJIL.baseMessage.foldType != 0) && !(((MemberMessage) this.LJIL).displayStyle == 2 && LLIILII());
    }

    public final String LLJLLIL() {
        String str = ((MemberMessage) this.LJIL).clientEnterSource;
        if (str == null) {
            return "";
        }
        String strReplace = str.replace("live_detail", "");
        if (strReplace.length() < 2) {
            return "";
        }
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV2LIZIZ = C235000vU.LIZIZ(strReplace.substring(1));
        String strLIZ = C0KVU.LIZ(((MemberMessage) this.LJIL).user);
        if (LLLI()) {
            return C497740JfY.LJIJJ(2131840755, strLIZ);
        }
        if (LLLFF()) {
            String strLJIJJ = C497740JfY.LJIJJ(2131842730, strLIZ);
            return ((MemberMessage) this.LJIL).isTopUser ? C497740JfY.LJIJJ(2131853530, Long.valueOf(r1.topUserNo), strLJIJJ) : strLJIJJ;
        }
        if (LLLFZ()) {
            int i = rankTypeV2LIZIZ.type;
            String strLJIJJ2 = i == RankTypeV2.LJIIL.type ? C497740JfY.LJIJJ(2131851084, strLIZ) : i == RankTypeV2.LJIJJLI.type ? C497740JfY.LJIJJ(2131851086, strLIZ) : i == RankTypeV2.LJIL.type ? C497740JfY.LJIJJ(2131851085, strLIZ) : "";
            if (!TextUtils.equals(strLJIJJ2, "")) {
                return strLJIJJ2;
            }
        }
        return LLJLILLLLZIIL((MemberMessage) this.LJIL);
    }

    public final boolean LLLF() {
        Room room;
        EnterNearByInfo enterNearByInfo;
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        return (c1109770ez9 == null || (room = c1109770ez9.LJII) == null || (enterNearByInfo = room.enterNearbyInfo) == null || !enterNearByInfo.showNearbyMsgTag || LLIIII() == null || LLIIII().dynamicDisplayText == null) ? false : true;
    }

    public final boolean LLLFZ() {
        String str = ((MemberMessage) this.LJIL).clientEnterSource;
        if (str == null) {
            return false;
        }
        String strReplace = str.replace("live_detail", "");
        if (strReplace.length() >= 2) {
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            if (C235000vU.LIZIZ(strReplace.substring(1)) != RankTypeV2.LJJIJIIJI) {
                return LLIILII();
            }
        }
        return false;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((MemberMessage) this.LJIL).user;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean instant() {
        if (this.LJIILIIL.LIZIZ()) {
            return false;
        }
        return super.instant();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJIIZILJ() {
        return LJJLJ() && ((MemberMessage) this.LJIL).displayStyle == 1 && this.LJIILIIL.LJI;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final Text LLFZ() {
        if (LLLF()) {
            return LLIIII().dynamicDisplayText;
        }
        if (LLIILII()) {
            MESSAGE message = this.LJIL;
            if (((MemberMessage) message).anchorDisplayText != null) {
                return ((MemberMessage) message).anchorDisplayText;
            }
        }
        return super.LLFZ();
    }

    public final void LLJZIJLIL() {
        C234700vR c234700vRLJLJJLL;
        LiveMode liveMode;
        if (LJJIIZI() && this.LJIILIIL.LJI && (c234700vRLJLJJLL = LJLJJLL()) != null && c234700vRLJLJJLL.LIZIZ && !c234700vRLJLJJLL.LIZJ) {
            WaveAlgorithmData waveAlgorithmData = c234700vRLJLJJLL.LJFF;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_wave_show");
            c474500IjALIZ.LJIJJLI(this.LJIILIIL.LJIIIZ);
            c474500IjALIZ.LJJII(Long.valueOf(LLIIJI()), "to_user_id");
            c474500IjALIZ.LJJII(Long.valueOf(getMessageId()), "msg_id");
            c474500IjALIZ.LJJII(c234700vRLJLJJLL.LIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT, "is_follow");
            c474500IjALIZ.LJJII("wave", Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(LLJJJ(), "admin_type");
            if (getUser() != null) {
                c474500IjALIZ.LJJII(Integer.valueOf(LJLJJI() ? 1 : 0), "is_mark");
            }
            DataChannel dataChannel = this.LJIILIIL.LJIIIZ;
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                c474500IjALIZ.LJJ(liveMode.logStreamingType);
            }
            if (waveAlgorithmData != null) {
                c474500IjALIZ.LJJII(waveAlgorithmData.algorithmVersion, "algorithm_version");
                c474500IjALIZ.LJJII(Integer.valueOf(waveAlgorithmData.isAlgHit ? 1 : 0), "is_alg_hit");
                c474500IjALIZ.LJJII(waveAlgorithmData.predictScore, "predict_score");
                c474500IjALIZ.LJJII(Integer.valueOf(waveAlgorithmData.isRewatch ? 1 : 0), "is_rewatch");
            }
            c474500IjALIZ.LIZ();
            c234700vRLJLJJLL.LIZJ = true;
        }
    }

    public final boolean LLLFF() {
        if (!LLIILII()) {
            return false;
        }
        MESSAGE message = this.LJIL;
        if (((MemberMessage) message).action == 1) {
            return (TextUtils.equals(((MemberMessage) message).clientEnterSource, "live_merge-live_cover") && TextUtils.equals(((MemberMessage) this.LJIL).clientLiveReason, "hour")) || TextUtils.equals(((MemberMessage) this.LJIL).clientEnterSource, "live_detail-hourly_rank");
        }
        return false;
    }

    public final boolean LLLFFI() {
        return LLLI() || LLLFF() || LLLFZ();
    }

    public final boolean LLLI() {
        if (!LLIILII()) {
            return false;
        }
        if ((TextUtils.equals(((MemberMessage) this.LJIL).clientEnterSource, "live_merge-live_cover") && TextUtils.equals(((MemberMessage) this.LJIL).clientLiveReason, "week")) || TextUtils.equals(((MemberMessage) this.LJIL).clientEnterSource, "live_detail-weekly_rank") || TextUtils.equals(((MemberMessage) this.LJIL).clientEnterSource, "live_detail-weekly_rank_notice")) {
            return true;
        }
        return TextUtils.equals(((MemberMessage) this.LJIL).clientEnterSource, "homepage_hot-live_cell") && TextUtils.equals(((MemberMessage) this.LJIL).clientLiveReason, "week");
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final void dispose() {
        super.dispose();
        C11JF c11jf = this.LJJIII;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        this.LJJIII.dispose();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        String str;
        DataChannel dataChannel;
        MemberMessage memberMessage;
        super.onAttach();
        MemberMessage memberMessage2 = (MemberMessage) this.LJIL;
        if (memberMessage2.action == 1 && memberMessage2.user.isSubscribe) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_user_enter_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(this.LJIILIIL.LJIL), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(memberMessage2.baseMessage.roomId), "room_id");
            c474500IjALIZ.LIZ();
        }
        if (memberMessage2.action == 1 && !TextUtils.isEmpty(memberMessage2.userShareType)) {
            if (LLIILII()) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_anchor_share_enter_message_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LJJII(memberMessage2.userShareType, "user_share_type");
                c474500IjALIZIZ.LIZ();
            } else {
                C474500IjA c474500IjALIZIZ2 = C0IJT.LIZIZ("livesdk_share_enter_message_audience_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ2.LJIL();
                c474500IjALIZIZ2.LJJII(memberMessage2.userShareType, "user_share_type");
                c474500IjALIZIZ2.LIZ();
            }
        }
        if (memberMessage2.action == 1 && (memberMessage = (MemberMessage) this.LJIL) != null) {
            long j = memberMessage.lastSubscriptionAction;
            if (j > 0 && j < 4) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscribe_room_in_message_show");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII(Long.valueOf(LLJJIII()), "room_id");
                c474500IjALIZ2.LJJII(Long.valueOf(LJZL()), "anchor_id");
                c474500IjALIZ2.LJJII(memberMessage2.userShareType, "user_share_type");
                c474500IjALIZ2.LJJII(LLIILII() ? "live_take_detail" : "live_detail", "event_page");
                c474500IjALIZ2.LIZ();
            }
        }
        if (this.LJIILIIL.LJIJJLI && !this.LJJI) {
            String str2 = (memberMessage2.action == 1 && TextUtils.equals("nearby", memberMessage2.LL)) ? "self" : "";
            if (LLLF()) {
                str2 = memberMessage2.action == 47 ? "multi_viewer" : "single_viewer";
            }
            if (str2.length() > 0 && (dataChannel = this.LJIILIIL.LJIIIZ) != null) {
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_nearby_label_show");
                c474500IjALIZ3.LJIJJLI(dataChannel);
                LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
                if (liveMode != null) {
                    c474500IjALIZ3.LJJ(liveMode.logStreamingType);
                }
                c474500IjALIZ3.LJJII("live_room", "event_scene");
                c474500IjALIZ3.LJJII(LLIILII() ? "anchor" : C01C5.LIZ(dataChannel) ? "admin" : "viewer", "user_type");
                c474500IjALIZ3.LJJII(str2, "label_type");
                c474500IjALIZ3.LIZ();
            }
        }
        if (this.LJIILIIL.LJIJJLI && !this.LJJI && memberMessage2.action == 1 && memberMessage2.displayStyle != 0 && LLIILII() && getUser() != null) {
            C474500IjA c474500IjALIZIZ3 = C0IJT.LIZIZ("livesdk_live_vip_enter_message_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
            c474500IjALIZIZ3.LJIJJLI(this.LJIILIIL.LJIIIZ);
            c474500IjALIZIZ3.LJI(Long.valueOf(this.LJIILIIL.LJIL));
            c474500IjALIZIZ3.LJJIJIIJI(Long.valueOf(this.LJIILIIL.LJIIZILJ));
            c474500IjALIZIZ3.LJJII(Long.valueOf(getUser().getId()), "vip_user_id");
            c474500IjALIZIZ3.LIZ();
        }
        if (LLLFFI() && (str = ((MemberMessage) this.LJIL).clientEnterSource) != null) {
            String strReplace = str.replace("live_detail", "");
            if (strReplace.length() >= 2) {
                RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                String str3 = C235000vU.LIZIZ(strReplace.substring(1)).rankName;
                C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_rank_pop_notice");
                c474500IjALIZ4.LJIL();
                c474500IjALIZ4.LJJII(Long.valueOf(LLJJIII()), "room_id");
                c474500IjALIZ4.LJJII(Long.valueOf(LJZL()), "anchor_id");
                c474500IjALIZ4.LJJII(Long.valueOf(LLIIJI()), "notice_user_id");
                c474500IjALIZ4.LJJII(str3, "rank_type");
                c474500IjALIZ4.LJJII("user_enter_room_from_rank", "notice_type");
                c474500IjALIZ4.LJJII(LLIILII() ? "anchor" : "user", "user_type");
                c474500IjALIZ4.LJJII(Long.valueOf(LJZL()), "user_id");
                c474500IjALIZ4.LIZ();
            }
        }
        this.LJJI = true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final C234900vT LJIIIZ() {
        return this.LJJIIZI;
    }

    public C234500vP(MemberMessage memberMessage) {
        super(memberMessage);
        this.LJJIIZI = new C234900vT();
        this.LJJIJ = LivePublicScreenCheckDirectionalityCountSetting.INSTANCE.getValue();
        this.LJJIJIIJI = 0;
    }

    public static String LLJLILLLLZIIL(MemberMessage memberMessage) {
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        String strLIZ4 = "";
        if (memberMessage == null) {
            return "";
        }
        User user = memberMessage.operator;
        if (user == null) {
            strLIZ = "";
        } else {
            strLIZ = C0KVU.LIZ(user);
        }
        User user2 = memberMessage.user;
        switch (memberMessage.action) {
            case 1:
                if (memberMessage.isTopUser) {
                    return LLJLLL(2131853530, Long.valueOf(memberMessage.topUserNo), LLJLL(memberMessage));
                }
                return LLJLL(memberMessage);
            case 2:
                if (memberMessage.isTopUser) {
                    return LLJLLL(2131853531, Long.valueOf(memberMessage.topUserNo));
                }
                return LLJLLL(2131853543, new Object[0]);
            case 3:
                if (LLJZ(memberMessage)) {
                    if (user2 == null) {
                        return "";
                    }
                    return LLJLLL(2131853547, C0KVU.LIZ(user2), strLIZ);
                }
                if (user2 == null) {
                    return "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0KVU.LIZ(user2));
                sbLIZ.append(LLJLLL(2131853546, new Object[0]));
                return C2188811AlT.LIZIZ(sbLIZ);
            case 4:
                if (LLJZ(memberMessage)) {
                    if (user2 == null) {
                        return "";
                    }
                    return LLJLLL(2131853549, C0KVU.LIZ(user2), strLIZ);
                }
                if (user2 == null) {
                    return "";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C0KVU.LIZ(user2));
                sbLIZ2.append(LLJLLL(2131853548, new Object[0]));
                return C2188811AlT.LIZIZ(sbLIZ2);
            case 5:
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C0KVU.LIZ(user2));
                sbLIZ3.append(" ");
                sbLIZ3.append(LLJLLL(2131853544, new Object[0]));
                return C2188811AlT.LIZIZ(sbLIZ3);
            case 6:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C0KVU.LIZ(user2));
                sbLIZ4.append(" ");
                sbLIZ4.append(LLJLLL(2131853537, new Object[0]));
                return C2188811AlT.LIZIZ(sbLIZ4);
            case 8:
                if (memberMessage.topUserNo > 0) {
                    if (memberMessage.setToAdmin) {
                        return LLJLLL(2131853536, C0KVU.LIZ(user2), Long.valueOf(memberMessage.topUserNo));
                    }
                    return LLJLLL(2131853535, C0KVU.LIZ(user2), Long.valueOf(memberMessage.topUserNo));
                }
            case 7:
            default:
                return "";
            case BdTuring.TYPE_ECAF /* 9 */:
                Object[] objArr = new Object[2];
                if (user2 == null) {
                    strLIZ3 = "";
                } else {
                    strLIZ3 = C0KVU.LIZ(user2);
                }
                objArr[0] = strLIZ3;
                User user3 = memberMessage.operator;
                if (user3 != null) {
                    strLIZ4 = C0KVU.LIZ(user3);
                }
                objArr[1] = strLIZ4;
                return LLJLLL(2131853547, objArr);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                Object[] objArr2 = new Object[2];
                if (user2 == null) {
                    strLIZ2 = "";
                } else {
                    strLIZ2 = C0KVU.LIZ(user2);
                }
                objArr2[0] = strLIZ2;
                User user4 = memberMessage.operator;
                if (user4 != null) {
                    strLIZ4 = C0KVU.LIZ(user4);
                }
                objArr2[1] = strLIZ4;
                return LLJLLL(2131853549, objArr2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (LLJZ(memberMessage)) {
                    if (user2 == null) {
                        return "";
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(C0KVU.LIZ(user2));
                    sbLIZ5.append(LLJLLL(2131853541, new Object[0]));
                    return C2188811AlT.LIZIZ(sbLIZ5);
                }
                if (user2 == null) {
                    return "";
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(C0KVU.LIZ(user2));
                sbLIZ6.append(LLJLLL(2131853540, new Object[0]));
                return C2188811AlT.LIZIZ(sbLIZ6);
        }
    }

    public static String LLJLL(MemberMessage memberMessage) {
        if (memberMessage.actionDescription == null) {
            if (memberMessage.action != 1) {
                memberMessage.actionDescription = "";
            } else {
                memberMessage.actionDescription = LLJLLL(2131853539, new Object[0]);
            }
        }
        return memberMessage.actionDescription;
    }

    public static boolean LLJZ(MemberMessage memberMessage) {
        User user = memberMessage.operator;
        if (user != null && user.getUserAttr() != null && memberMessage.operator.getUserAttr().isSuperAdmin) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final void LJJIL(int i) {
        GetUserStatusResp.Data data;
        this.LJJIIJZLJL = i;
        if (LJJIIZI() && this.LJIILIIL.LJI && (data = this.LJJIIZ) != null && this.LJJIIJZLJL >= this.LJJIIJ) {
            if (data.userInRoom) {
                LLL(true);
            }
            this.LJJIIZ = null;
        }
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final void LJJJJJL(int i) {
        this.LJJIIJZLJL = i;
        if (LJJIIZI() && this.LJIILIIL.LJI) {
            long j = ((MemberMessage) this.LJIL).showWave;
            if (j == -1) {
                C234700vR c234700vRLJLJJLL = LJLJJLL();
                if (c234700vRLJLJJLL != null) {
                    c234700vRLJLJJLL.LIZ = false;
                    WaveAlgorithmData waveAlgorithmData = ((MemberMessage) this.LJIL).waveAlgorithmData;
                    c234700vRLJLJJLL.LJFF = waveAlgorithmData;
                    if (waveAlgorithmData != null) {
                        c234700vRLJLJJLL.LIZLLL = waveAlgorithmData.isFollow;
                        return;
                    }
                    return;
                }
                return;
            }
            if (j == 1) {
                C234700vR c234700vRLJLJJLL2 = LJLJJLL();
                if (c234700vRLJLJJLL2 == null) {
                    return;
                }
                c234700vRLJLJJLL2.LIZ = false;
                c234700vRLJLJJLL2.LIZIZ = true;
                WaveAlgorithmData waveAlgorithmData2 = ((MemberMessage) this.LJIL).waveAlgorithmData;
                c234700vRLJLJJLL2.LJFF = waveAlgorithmData2;
                if (waveAlgorithmData2 == null) {
                    return;
                }
                c234700vRLJLJJLL2.LIZLLL = waveAlgorithmData2.isFollow;
                return;
            }
            if (LJLJJLL().LJ == 0) {
                this.LJJIIJ = i + 1;
                C786410Ut5.LJLIIL(Math.max(LivePublicScreenGreetingDelaySetting.INSTANCE.getValue(), 0L), this.LJIJJ, new RunnableC514801zW(this, 13));
                return;
            }
            LLL(true);
        }
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public final void LJJJJZ(C1109770ez9 c1109770ez9) {
        super.LJJJJZ(c1109770ez9);
        if (LLLFFI()) {
            MemberMessage memberMessage = (MemberMessage) this.LJIL;
            memberMessage.LLILLJJLI = true;
            memberMessage.LLILLL = false;
        } else {
            MemberMessage memberMessage2 = (MemberMessage) this.LJIL;
            memberMessage2.LLILLJJLI = false;
            memberMessage2.LLILLL = true;
        }
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final void LJJLIIJ(C443120HZe<Bitmap, Integer, Integer> c443120HZe) {
        if (this.LJIILIIL != null) {
            LLJI();
            this.LJIILIIL.LJIIIZ(this, new C227000uC(c443120HZe));
        }
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final CharSequence LJLIL(User user) {
        if (!this.LJIILIIL.LJFF() || !this.LJIILIIL.LJI || (LLIIII() != null && LLIIII().operationInfo != null)) {
            return super.LJLIL(user);
        }
        String strLIZ = C0KVU.LIZ(user);
        int i = this.LJIIJ;
        if (i <= 0) {
            return "";
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(strLIZ);
        int next = characterInstance.next(i);
        if (next == -1) {
            return strLIZ;
        }
        return strLIZ.substring(0, next);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLILLL(BadgeStruct badgeStruct) {
        if (C191100oP.LIZLLL(badgeStruct)) {
            C191100oP.LJFF(LLIIJI(), "comment_area_system_message", LLIILII());
        }
        if (C191100oP.LIZJ(badgeStruct) && badgeStruct != null) {
            C498280JgQ.LIZ(badgeStruct, LLIIJI(), LJZL());
        }
    }

    public final void LLL(boolean z) {
        C234700vR c234700vRLJLJJLL = LJLJJLL();
        if (c234700vRLJLJJLL != null) {
            c234700vRLJLJJLL.LIZIZ = true;
            this.LJIILIIL.LJIIJJI.LJJJI(this);
            if (z) {
                C786410Ut5.LJLIIL(500L, this.LJIJJ, new RunnableC514801zW(this, 12));
            } else {
                if (!this.LJJIIZI.LIZ) {
                    return;
                }
                LLJZIJLIL();
            }
        }
    }

    public static boolean LLJLIL(C1109770ez9 c1109770ez9, MemberMessage memberMessage) {
        List list;
        if (c1109770ez9 != null && memberMessage != null && c1109770ez9.LJI && c1109770ez9.LJJI == EnumC1112150f2z.Main) {
            C1112360f3K c1112360f3K = C1112360f3K.LIZ;
            DataChannel dataChannel = c1109770ez9.LJIIIZ;
            c1112360f3K.getClass();
            if (dataChannel != null && (list = (List) ((LinkedHashMap) C1112360f3K.LIZJ).get(dataChannel)) != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (LiveRoomEnterMessageAvoidCapsuleTypesSetting.INSTANCE.contains(((CapsuleMessage) it2.next()).capsuleType)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String LLJLLL(int i, Object... objArr) {
        Context contextLJII = C497740JfY.LJII();
        if (objArr.length > 0) {
            return contextLJII.getResources().getString(i, objArr);
        }
        return contextLJII.getResources().getString(i);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJIJIL(int i, User user) {
        C289001Aa.LIZ(i, user);
    }
}
