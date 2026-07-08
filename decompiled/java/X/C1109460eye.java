package X;

import Y.ACListenerS53S0101000_15;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAnchorSideShowGuidenceEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestApplyAcceptGuideEvent;
import com.bytedance.android.livesdk.dataChannel.LinkBattleGuideVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVaultBoostingCardSettings;
import com.bytedance.android.livesdk.model.message.BattleNoticeCommonGuide;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkmicAudienceApplyGuide;
import com.bytedance.android.livesdk.model.message.LinkmicAudienceInviteGroupChatMemberGuide;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import com.bytedance.android.livesdk.model.message.UseCriticalStrikeCard;
import com.bytedance.android.livesdk.model.message.UseExtraTimeCard;
import com.bytedance.android.livesdk.model.message.UseSmokeCard;
import com.bytedance.android.livesdk.model.message.UseSpecialEffectCard;
import com.bytedance.android.livesdk.model.message.UseTop2Card;
import com.bytedance.android.livesdk.model.message.UseTop3Card;
import com.bytedance.android.livesdk.model.message.UseVaultGloveCard;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeToast;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0eye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109460eye implements InterfaceC1109090ey3 {
    @Override // X.InterfaceC1109090ey3
    public final void LIZ() {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZJ(C1109030exx c1109030exx) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJI(InterfaceC1109350eyT interfaceC1109350eyT) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJII(AbstractC1109730ez5 abstractC1109730ez5) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZIZ(C1109430eyb c1109430eyb) {
        ((HashMap) c1109430eyb.LIZ).put(LinkMicBattleNoticeMessage.class, new InterfaceC1111800f2Q<LinkMicBattleNoticeMessage>() { // from class: X.00KL
            @Override // X.InterfaceC1111800f2Q
            public final boolean LIZ(IMessage iMessage, C1109770ez9 c1109770ez9) {
                BattleNoticeText battleNoticeText;
                String str;
                BattleNoticeText battleNoticeText2;
                BattleNoticeText battleNoticeText3;
                BattleNoticeText battleNoticeText4;
                LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = (LinkMicBattleNoticeMessage) iMessage;
                int i = linkMicBattleNoticeMessage.noticeType;
                if (i != 5 && i != 0 && i != 4) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i == 6) {
                                        try {
                                            BattleNoticeCommonGuide battleNoticeCommonGuide = linkMicBattleNoticeMessage.commonGuide;
                                            if (battleNoticeCommonGuide != null && battleNoticeCommonGuide.displayText != null) {
                                                if (c1109770ez9.LJI && battleNoticeCommonGuide.exceptAnchor) {
                                                    return true;
                                                }
                                                return false;
                                            }
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            return true;
                                        }
                                    }
                                } else {
                                    try {
                                        BattleNoticeAnchorGuide battleNoticeAnchorGuide = linkMicBattleNoticeMessage.anchorGuide;
                                        if (battleNoticeAnchorGuide != null && (battleNoticeText3 = battleNoticeAnchorGuide.content) != null && battleNoticeText3.text != null) {
                                            if (battleNoticeAnchorGuide == null || (battleNoticeText4 = battleNoticeAnchorGuide.buttonContent) == null || battleNoticeText4.text == null) {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            C973660bRc c973660bRc = C973660bRc.LIZ;
                                            C973660bRc.LIZ.LJLIIIL(i, c1109770ez9.LJIIIZ, null, true);
                                            return false;
                                        }
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    } catch (IllegalArgumentException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        return true;
                                    }
                                }
                            } else {
                                try {
                                    BattleNoticeRuleGuide battleNoticeRuleGuide = linkMicBattleNoticeMessage.battleRuleGuide;
                                    if (battleNoticeRuleGuide != null && battleNoticeRuleGuide.contentText != null) {
                                        if (battleNoticeRuleGuide != null && battleNoticeRuleGuide.buttonContentText != null) {
                                            if (battleNoticeRuleGuide != null && battleNoticeRuleGuide.ruleUrl != null) {
                                                if (InterfaceC1106030et7.a5.LIZIZ().booleanValue()) {
                                                    if (c1109770ez9.LJI) {
                                                        if (!linkMicBattleNoticeMessage.battleRuleGuide.exceptAnchor) {
                                                            C973660bRc c973660bRc2 = C973660bRc.LIZ;
                                                            C973660bRc.LIZ.LJLIIIL(linkMicBattleNoticeMessage.noticeType, c1109770ez9.LJIIIZ, null, true);
                                                            return false;
                                                        }
                                                    } else {
                                                        return false;
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Check failed.");
                                                }
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } catch (IllegalArgumentException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    return true;
                                } catch (IllegalStateException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    return true;
                                }
                            }
                        } else {
                            try {
                                BattleNoticeAnchorGiftGuide battleNoticeAnchorGiftGuide = linkMicBattleNoticeMessage.anchorGiftGuide;
                                if (battleNoticeAnchorGiftGuide != null && (battleNoticeText2 = battleNoticeAnchorGiftGuide.content) != null && battleNoticeText2.text != null) {
                                    return false;
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            } catch (IllegalArgumentException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                return true;
                            }
                        }
                    } else {
                        BattleNoticeToast battleNoticeToast = linkMicBattleNoticeMessage.toast;
                        if (battleNoticeToast != null && (battleNoticeText = battleNoticeToast.content) != null && (str = battleNoticeText.text) != null && !TextUtils.isEmpty(str)) {
                            C766270U4b.LJIIJJI(str);
                        }
                    }
                }
                return true;
            }
        });
        ((HashMap) c1109430eyb.LIZ).put(LinkMicAnchorGuideMessage.class, new InterfaceC1111800f2Q<LinkMicAnchorGuideMessage>() { // from class: X.00KT
            @Override // X.InterfaceC1111800f2Q
            public final boolean LIZ(IMessage iMessage, C1109770ez9 c1109770ez9) {
                int i;
                LinkMicAnchorGuideMessage linkMicAnchorGuideMessage = (LinkMicAnchorGuideMessage) iMessage;
                if (!c1109770ez9.LJI || ((i = linkMicAnchorGuideMessage.guideType) != 4 && i != 9 && i != 6)) {
                    return true;
                }
                return false;
            }
        });
        ((HashMap) c1109430eyb.LIZ).put(LinkMicAudienceNoticeMessage.class, new InterfaceC1111800f2Q<LinkMicAudienceNoticeMessage>() { // from class: X.0aOh
            @Override // X.InterfaceC1111800f2Q
            public final boolean LIZ(IMessage iMessage, C1109770ez9 c1109770ez9) {
                Object objGg0;
                LinkmicAudienceApplyGuide linkmicAudienceApplyGuide;
                User user;
                DataChannel dataChannel;
                boolean zLIZ;
                User user2;
                LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage = (LinkMicAudienceNoticeMessage) iMessage;
                if (c1109770ez9.LJI) {
                    DataChannel dataChannel2 = c1109770ez9.LJIIIZ;
                    if (dataChannel2 != null) {
                        objGg0 = dataChannel2.gg0(LiveModeChannel.class);
                    } else {
                        objGg0 = null;
                    }
                    if (objGg0 == LiveMode.VIDEO || objGg0 == LiveMode.LIVE_VOICE) {
                        int iQZ = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).QZ();
                        int i = linkMicAudienceNoticeMessage.noticeType;
                        if (i == 0) {
                            if (linkMicAudienceNoticeMessage.turnOnGuide != null) {
                                return true;
                            }
                        } else if (i == 1) {
                            LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide = linkMicAudienceNoticeMessage.inviteGuide;
                            if (linkMicAudienceInviteGuide != null && (user2 = linkMicAudienceInviteGuide.user) != null && user2.getSecret() != 1) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("LinkAudienceNoticeMessageFilter_filter displayStrategy:");
                                sbLIZ.append(linkMicAudienceNoticeMessage.inviteGuide.displayStrategy);
                                C20441214yg.LIZIZ("live_guidence", C2188811AlT.LIZIZ(sbLIZ));
                                if (linkMicAudienceNoticeMessage.inviteGuide.displayStrategy == 1 && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nk0(c1109770ez9.LJIIIZ)) {
                                    DataChannel dataChannel3 = c1109770ez9.LJIIIZ;
                                    if (dataChannel3 != null) {
                                        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide2 = linkMicAudienceNoticeMessage.inviteGuide;
                                        dataChannel3.LC0(MultiGuestAnchorSideShowGuidenceEvent.class, new C933460aOm(linkMicAudienceInviteGuide2.user, linkMicAudienceInviteGuide2.linkmicAudienceInviteNoticeReason, linkMicAudienceNoticeMessage.noticeType, false, 24));
                                    }
                                    C20441214yg.LIZIZ("live_guidence", "LinkAudienceNoticeMessageFilter_filter send MultiGuestAnchorSideShowGuidence");
                                    return true;
                                }
                                zLIZ = C489080JFy.LIZ(iQZ, 2);
                                return true ^ zLIZ;
                            }
                        } else if (i == 2) {
                            LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide = linkMicAudienceNoticeMessage.groupChatMemberInviteGuide;
                            if (linkmicAudienceInviteGroupChatMemberGuide != null) {
                                List<Long> list = linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds;
                                if (list != null && list.isEmpty()) {
                                    return true;
                                }
                                return false;
                            }
                        } else if (i == 3) {
                            if (objGg0 != LiveMode.LIVE_VOICE) {
                                if (linkMicAudienceNoticeMessage.inviteGuide.displayStrategy == 1 && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nk0(c1109770ez9.LJIIIZ)) {
                                    DataChannel dataChannel4 = c1109770ez9.LJIIIZ;
                                    if (dataChannel4 != null) {
                                        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide3 = linkMicAudienceNoticeMessage.inviteGuide;
                                        dataChannel4.LC0(MultiGuestAnchorSideShowGuidenceEvent.class, new C933460aOm(linkMicAudienceInviteGuide3.user, linkMicAudienceInviteGuide3.linkmicAudienceInviteNoticeReason, linkMicAudienceNoticeMessage.noticeType, true, 16));
                                    }
                                    C20441214yg.LIZIZ("invite_outside_friend", "emptyMask, online friend");
                                    return true;
                                }
                                zLIZ = C489080JFy.LIZ(iQZ, 2);
                                return true ^ zLIZ;
                            }
                        } else if (i == 5) {
                            if (linkMicAudienceNoticeMessage.inviteGuide.displayStrategy == 1 && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nk0(c1109770ez9.LJIIIZ)) {
                                DataChannel dataChannel5 = c1109770ez9.LJIIIZ;
                                if (dataChannel5 != null) {
                                    LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide4 = linkMicAudienceNoticeMessage.inviteGuide;
                                    dataChannel5.LC0(MultiGuestAnchorSideShowGuidenceEvent.class, new C933460aOm(linkMicAudienceInviteGuide4.user, linkMicAudienceInviteGuide4.linkmicAudienceInviteNoticeReason, linkMicAudienceNoticeMessage.noticeType, false, 16));
                                }
                                C20441214yg.LIZIZ("invite_random_match_guest", "emptyMask, random match guest");
                                return true;
                            }
                        } else if (i == 4 && (linkmicAudienceApplyGuide = linkMicAudienceNoticeMessage.applyGuide) != null && linkmicAudienceApplyGuide.user != null && objGg0 != LiveMode.LIVE_VOICE && C489080JFy.LIZ(iQZ, 2)) {
                            LinkmicAudienceApplyGuide linkmicAudienceApplyGuide2 = linkMicAudienceNoticeMessage.applyGuide;
                            if (linkmicAudienceApplyGuide2 != null && linkmicAudienceApplyGuide2.displayStrategy == 1) {
                                C940770aaZ.LIZ().LIZIZ();
                                List<AbstractC939840aZ4> listLIZIZ = C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : (ArrayList) listLIZIZ) {
                                    if (obj instanceof C934190aPx) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    LinkmicAudienceApplyGuide linkmicAudienceApplyGuide3 = linkMicAudienceNoticeMessage.applyGuide;
                                    if (linkmicAudienceApplyGuide3 != null && (user = linkmicAudienceApplyGuide3.user) != null && (dataChannel = c1109770ez9.LJIIIZ) != null) {
                                        dataChannel.LC0(MultiGuestApplyAcceptGuideEvent.class, new C943510aez(user, linkmicAudienceApplyGuide3.displayPosition, linkmicAudienceApplyGuide3.triggerType, linkmicAudienceApplyGuide3.requestId, linkmicAudienceApplyGuide3.linkmicId));
                                        return true;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
        });
        ((HashMap) c1109430eyb.LIZ).put(LinkMicBattleItemCard.class, new InterfaceC1111800f2Q<LinkMicBattleItemCard>() { // from class: X.00KR
            /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
            @Override // X.InterfaceC1111800f2Q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(com.ss.ugc.live.sdk.message.data.IMessage r9, X.C1109770ez9 r10) {
                /*
                    Method dump skipped, instruction units count: 282
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C00KR.LIZ(com.ss.ugc.live.sdk.message.data.IMessage, X.0ez9):boolean");
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZLLL(InterfaceC1109320eyQ interfaceC1109320eyQ) {
        interfaceC1109320eyQ.LIZIZ(LinkMicAnchorGuideMessage.class, new InterfaceC1109180eyC<LinkMicAnchorGuideMessage>() { // from class: X.00iU
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                LinkMicAnchorGuideMessage linkMicAnchorGuideMessage = (LinkMicAnchorGuideMessage) abstractC1136060ffY;
                int i = linkMicAnchorGuideMessage.guideType;
                if (i != 4 && i != 9 && i != 6) {
                    return new AbstractC1110800f0o<LinkMicAnchorGuideMessage>(linkMicAnchorGuideMessage) { // from class: X.00iV
                        @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
                        public final boolean LJJ() {
                            return true;
                        }

                        @Override // X.AbstractC1110790f0n
                        public final CharSequence LLFF() {
                            return null;
                        }

                        @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                        public final User getUser() {
                            return null;
                        }
                    };
                }
                return new AbstractC1110800f0o<LinkMicAnchorGuideMessage>(linkMicAnchorGuideMessage) { // from class: X.00iT
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
                    public final boolean LJJ() {
                        return true;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }
                };
            }
        });
        interfaceC1109320eyQ.LIZIZ(LinkMicBattleNoticeMessage.class, new InterfaceC1109180eyC<LinkMicBattleNoticeMessage>() { // from class: X.00iJ
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = (LinkMicBattleNoticeMessage) abstractC1136060ffY;
                int i = linkMicBattleNoticeMessage.noticeType;
                if (i != 0 && i != 4 && i != 5) {
                    return new AbstractC1110800f0o<LinkMicBattleNoticeMessage>(linkMicBattleNoticeMessage) { // from class: X.00i5
                        @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                        public final int LIZLLL() {
                            return R.drawable.et6;
                        }

                        @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                        public final User getUser() {
                            return null;
                        }

                        @Override // X.AbstractC1110790f0n
                        public final CharSequence LLFF() {
                            MESSAGE message = this.LJIL;
                            return (((LinkMicBattleNoticeMessage) message).noticeType != 3 || ((LinkMicBattleNoticeMessage) message).anchorGiftGuide == null || ((LinkMicBattleNoticeMessage) message).anchorGiftGuide.content == null) ? (((LinkMicBattleNoticeMessage) message).noticeType != 6 || ((LinkMicBattleNoticeMessage) message).commonGuide == null) ? "" : C1133830fbx.LJIILIIL(((LinkMicBattleNoticeMessage) message).commonGuide.displayText, "") : ((LinkMicBattleNoticeMessage) message).anchorGiftGuide.content.text;
                        }
                    };
                }
                return new AbstractC1110800f0o<LinkMicBattleNoticeMessage>(linkMicBattleNoticeMessage) { // from class: X.00iK
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
                    public final boolean LJJ() {
                        return true;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }
                };
            }
        });
        interfaceC1109320eyQ.LIZIZ(LinkMicAudienceNoticeMessage.class, new InterfaceC1109180eyC<LinkMicAudienceNoticeMessage>() { // from class: X.0aPU
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                return new C933890aPT((LinkMicAudienceNoticeMessage) abstractC1136060ffY);
            }
        });
        interfaceC1109320eyQ.LIZIZ(LinkMicBattleItemCard.class, new InterfaceC1109180eyC<LinkMicBattleItemCard>() { // from class: X.00iL
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                return new AbstractC1110800f0o<LinkMicBattleItemCard>((LinkMicBattleItemCard) abstractC1136060ffY) { // from class: X.00i9
                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
                    public final Text LLFZ() {
                        UseVaultGloveCard useVaultGloveCard;
                        UseTop3Card useTop3Card;
                        UseTop2Card useTop2Card;
                        UseSpecialEffectCard useSpecialEffectCard;
                        UseExtraTimeCard useExtraTimeCard;
                        UseSmokeCard useSmokeCard;
                        UseCriticalStrikeCard useCriticalStrikeCard;
                        MESSAGE message = this.LJIL;
                        if (((LinkMicBattleItemCard) message).msgType == 2 && (useCriticalStrikeCard = ((LinkMicBattleItemCard) message).useCriticalStrikeCard) != null && useCriticalStrikeCard.anchorId == LLIIIILZ().LJIL) {
                            UseCriticalStrikeCard useCriticalStrikeCard2 = ((LinkMicBattleItemCard) this.LJIL).useCriticalStrikeCard;
                            if (useCriticalStrikeCard2 != null) {
                                return useCriticalStrikeCard2.displayContent;
                            }
                            return null;
                        }
                        MESSAGE message2 = this.LJIL;
                        if (((LinkMicBattleItemCard) message2).msgType == 3 && (useSmokeCard = ((LinkMicBattleItemCard) message2).useSmokeCard) != null && useSmokeCard.anchorId == LLIIIILZ().LJIL) {
                            UseSmokeCard useSmokeCard2 = ((LinkMicBattleItemCard) this.LJIL).useSmokeCard;
                            if (useSmokeCard2 != null) {
                                return useSmokeCard2.displayContent;
                            }
                            return null;
                        }
                        MESSAGE message3 = this.LJIL;
                        if (((LinkMicBattleItemCard) message3).msgType == 5 && (useExtraTimeCard = ((LinkMicBattleItemCard) message3).useExtraTimeCard) != null && useExtraTimeCard.anchorId == LLIIIILZ().LJIL) {
                            UseExtraTimeCard useExtraTimeCard2 = ((LinkMicBattleItemCard) this.LJIL).useExtraTimeCard;
                            if (useExtraTimeCard2 != null) {
                                return useExtraTimeCard2.displayContent;
                            }
                            return null;
                        }
                        MESSAGE message4 = this.LJIL;
                        if (((LinkMicBattleItemCard) message4).msgType == 6 && (useSpecialEffectCard = ((LinkMicBattleItemCard) message4).useSpecialEffectCard) != null && useSpecialEffectCard.anchorId == LLIIIILZ().LJIL) {
                            UseSpecialEffectCard useSpecialEffectCard2 = ((LinkMicBattleItemCard) this.LJIL).useSpecialEffectCard;
                            if (useSpecialEffectCard2 != null) {
                                return useSpecialEffectCard2.displayContent;
                            }
                            return null;
                        }
                        MESSAGE message5 = this.LJIL;
                        if (((LinkMicBattleItemCard) message5).msgType == 10 && (useTop2Card = ((LinkMicBattleItemCard) message5).useTop2Card) != null && useTop2Card.anchorId == LLIIIILZ().LJIL && LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                            UseTop2Card useTop2Card2 = ((LinkMicBattleItemCard) this.LJIL).useTop2Card;
                            if (useTop2Card2 != null) {
                                return useTop2Card2.displayContent;
                            }
                            return null;
                        }
                        MESSAGE message6 = this.LJIL;
                        if (((LinkMicBattleItemCard) message6).msgType == 11 && (useTop3Card = ((LinkMicBattleItemCard) message6).useTop3Card) != null && useTop3Card.anchorId == LLIIIILZ().LJIL && LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                            UseTop3Card useTop3Card2 = ((LinkMicBattleItemCard) this.LJIL).useTop3Card;
                            if (useTop3Card2 != null) {
                                return useTop3Card2.displayContent;
                            }
                            return null;
                        }
                        MESSAGE message7 = this.LJIL;
                        if (((LinkMicBattleItemCard) message7).msgType != 12 || (useVaultGloveCard = ((LinkMicBattleItemCard) message7).useVaultGloveCard) == null || useVaultGloveCard.anchorId != LLIIIILZ().LJIL || !LiveMatchVaultBoostingCardSettings.INSTANCE.getValue()) {
                            if (C970370bMJ.LJIIIIZZ()) {
                                return null;
                            }
                            return super.LLFZ();
                        }
                        UseVaultGloveCard useVaultGloveCard2 = ((LinkMicBattleItemCard) this.LJIL).useVaultGloveCard;
                        if (useVaultGloveCard2 != null) {
                            return useVaultGloveCard2.displayContent;
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        if (((LinkMicBattleItemCard) this.LJIL).msgType != 100) {
                            return null;
                        }
                        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                        if (currentUser instanceof User) {
                            return (User) currentUser;
                        }
                        return null;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        C0KVU.LIZ(LLIIIILZ().LJIIIIZZ);
                        long j = LLIIIILZ().LJIL;
                        LinkMicBattleItemCard linkMicBattleItemCard = (LinkMicBattleItemCard) this.LJIL;
                        int i = linkMicBattleItemCard.msgType;
                        if (i == 2) {
                            UseCriticalStrikeCard useCriticalStrikeCard = linkMicBattleItemCard.useCriticalStrikeCard;
                            if (useCriticalStrikeCard != null && useCriticalStrikeCard.anchorId == j) {
                                return LLJLIL(useCriticalStrikeCard.displayContent);
                            }
                            Long lValueOf = Long.valueOf(j);
                            UseCriticalStrikeCard useCriticalStrikeCard2 = ((LinkMicBattleItemCard) this.LJIL).useCriticalStrikeCard;
                            if (C1144640ftO.LJIILIIL(lValueOf, useCriticalStrikeCard2 != null ? Long.valueOf(useCriticalStrikeCard2.anchorId) : null)) {
                                return new SpannableString(C497740JfY.LJIJI(2131843036));
                            }
                        } else if (i == 3) {
                            UseSmokeCard useSmokeCard = linkMicBattleItemCard.useSmokeCard;
                            if (useSmokeCard != null && useSmokeCard.anchorId == j) {
                                return LLJLIL(useSmokeCard.displayContent);
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("MatchType = ");
                            sbLIZ.append(C915980Zwa.LJFF().xB0());
                            C20441214yg.LJ("TeamMateComm", C2188811AlT.LIZIZ(sbLIZ));
                            Long lValueOf2 = Long.valueOf(j);
                            UseSmokeCard useSmokeCard2 = ((LinkMicBattleItemCard) this.LJIL).useSmokeCard;
                            if (C1144640ftO.LJIILIIL(lValueOf2, useSmokeCard2 != null ? Long.valueOf(useSmokeCard2.anchorId) : null)) {
                                return new SpannableString(C497740JfY.LJIJI(2131843038));
                            }
                        } else if (i == 5) {
                            UseExtraTimeCard useExtraTimeCard = linkMicBattleItemCard.useExtraTimeCard;
                            if (useExtraTimeCard != null && useExtraTimeCard.anchorId == j) {
                                return LLJLIL(useExtraTimeCard.displayContent);
                            }
                        } else if (i == 6) {
                            UseSpecialEffectCard useSpecialEffectCard = linkMicBattleItemCard.useSpecialEffectCard;
                            if (useSpecialEffectCard != null && useSpecialEffectCard.anchorId == j) {
                                return LLJLIL(useSpecialEffectCard.displayContent);
                            }
                            Long lValueOf3 = Long.valueOf(j);
                            UseSpecialEffectCard useSpecialEffectCard2 = ((LinkMicBattleItemCard) this.LJIL).useSpecialEffectCard;
                            if (C1144640ftO.LJIILIIL(lValueOf3, useSpecialEffectCard2 != null ? Long.valueOf(useSpecialEffectCard2.anchorId) : null)) {
                                return new SpannableString(C497740JfY.LJIJI(2131843037));
                            }
                        } else {
                            if (i == 100) {
                                return linkMicBattleItemCard.LL;
                            }
                            switch (i) {
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    if (!LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                                        return null;
                                    }
                                    UseTop2Card useTop2Card = ((LinkMicBattleItemCard) this.LJIL).useTop2Card;
                                    if (useTop2Card != null && useTop2Card.anchorId == j) {
                                        return LLJLIL(useTop2Card.displayContent);
                                    }
                                    Long lValueOf4 = Long.valueOf(j);
                                    UseTop2Card useTop2Card2 = ((LinkMicBattleItemCard) this.LJIL).useTop2Card;
                                    if (C1144640ftO.LJIILIIL(lValueOf4, useTop2Card2 != null ? Long.valueOf(useTop2Card2.anchorId) : null)) {
                                        return new SpannableString(C497740JfY.LJIJI(2131853708));
                                    }
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    if (!LiveMatchTop2Top3CardSettings.INSTANCE.getValue()) {
                                        return null;
                                    }
                                    UseTop3Card useTop3Card = ((LinkMicBattleItemCard) this.LJIL).useTop3Card;
                                    if (useTop3Card != null && useTop3Card.anchorId == j) {
                                        return LLJLIL(useTop3Card.displayContent);
                                    }
                                    Long lValueOf5 = Long.valueOf(j);
                                    UseTop3Card useTop3Card2 = ((LinkMicBattleItemCard) this.LJIL).useTop3Card;
                                    if (C1144640ftO.LJIILIIL(lValueOf5, useTop3Card2 != null ? Long.valueOf(useTop3Card2.anchorId) : null)) {
                                        return new SpannableString(C497740JfY.LJIJI(2131853709));
                                    }
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    if (!LiveMatchVaultBoostingCardSettings.INSTANCE.getValue()) {
                                        return null;
                                    }
                                    UseVaultGloveCard useVaultGloveCard = ((LinkMicBattleItemCard) this.LJIL).useVaultGloveCard;
                                    if (useVaultGloveCard != null && useVaultGloveCard.anchorId == j) {
                                        return LLJLIL(useVaultGloveCard.displayContent);
                                    }
                                    Long lValueOf6 = Long.valueOf(j);
                                    UseVaultGloveCard useVaultGloveCard2 = ((LinkMicBattleItemCard) this.LJIL).useVaultGloveCard;
                                    if (C1144640ftO.LJIILIIL(lValueOf6, useVaultGloveCard2 != null ? Long.valueOf(useVaultGloveCard2.anchorId) : null)) {
                                        return new SpannableString(C497740JfY.LJIJI(2131856877));
                                    }
                                    break;
                                default:
                                    return null;
                            }
                        }
                        return null;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
                    public final boolean LLJJIJIL() {
                        return LLFZ() != null;
                    }

                    public static Spannable LLJLIL(Text text) {
                        String strLIZIZ;
                        if (text == null) {
                            return null;
                        }
                        String str = text.defaultPattern;
                        String str2 = text.key;
                        if (C1533950q1J.LJ(str2)) {
                            C1124870fNV.LIZJ().getClass();
                            strLIZIZ = C1124870fNV.LIZIZ(str2);
                        } else {
                            strLIZIZ = null;
                        }
                        if (!TextUtils.isEmpty(strLIZIZ)) {
                            str = strLIZIZ;
                        }
                        return C1133830fbx.LJIILJJIL(str, text, null);
                    }
                };
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJ(AbstractC1111600f26 abstractC1111600f26) {
        abstractC1111600f26.LLLILZ(C154500iV.class, new AbstractC1111810f2R<C154500iV, C2870019g>() { // from class: X.0f0e
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.gq3;
            }

            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "link_guide";
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new AbstractC1110760f0k<C154500iV>(view) { // from class: X.019g
                    public final View LLILZ;

                    {
                        super(view);
                        this.LLILZ = view.findViewById(R.id.eu1);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
                    @Override // X.AbstractC1111020f1A
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void L5(X.C1109770ez9 r5, X.InterfaceC1112060f2q r6) {
                        /*
                            r4 = this;
                            X.00iV r6 = (X.C154500iV) r6
                            MESSAGE extends X.0ffY r0 = r6.LJIL
                            com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage r0 = (com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage) r0
                            int r0 = r0.guideType
                            r3 = 1
                            if (r0 == 0) goto L4c
                            if (r0 != r3) goto L17
                            X.019f r1 = new X.019f
                            android.view.View r0 = r4.itemView
                            r1.<init>(r0)
                        L14:
                            r1.LIZ(r5, r6)
                        L17:
                            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LJIIIZ
                            if (r1 == 0) goto L4a
                            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel> r0 = com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel.class
                            java.lang.Object r0 = r1.gg0(r0)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            if (r0 == 0) goto L4a
                            boolean r2 = r0.booleanValue()
                        L29:
                            android.view.View r0 = r4.LLILZ
                            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                            X.19ME r1 = (X.C19ME) r1
                            if (r2 != 0) goto L46
                            MESSAGE extends X.0ffY r0 = r6.LJIL
                            com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage r0 = (com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage) r0
                            int r0 = r0.guideType
                            if (r0 == r3) goto L46
                            r0 = 1061997773(0x3f4ccccd, float:0.8)
                        L3e:
                            r1.matchConstraintPercentWidth = r0
                            android.view.View r0 = r4.LLILZ
                            X.C786410Ut5.W5(r0, r1)
                            return
                        L46:
                            r0 = 1065185444(0x3f7d70a4, float:0.99)
                            goto L3e
                        L4a:
                            r2 = 0
                            goto L29
                        L4c:
                            X.0aoo r1 = new X.0aoo
                            android.view.View r0 = r4.itemView
                            r1.<init>(r0)
                            goto L14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2870019g.L5(X.0ez9, X.0f2q):void");
                    }
                };
            }
        });
        abstractC1111600f26.LLLILZ(C154300iT.class, new AbstractC1111810f2R<C154300iT, C2848018k>() { // from class: X.0f0d
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.gq2;
            }

            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "battle_pair_remind";
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new AbstractC1110760f0k<C154300iT>(view) { // from class: X.018k
                    @Override // X.AbstractC1111020f1A
                    public final void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
                        String str;
                        long j;
                        int i;
                        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
                        C2849018l c2849018l = new C2849018l(this.itemView);
                        c2849018l.LIZ.setImageResource(R.drawable.et6);
                        C16F5 c16f5 = c2849018l.LIZIZ;
                        LinkMicAnchorGuideMessage linkMicAnchorGuideMessage = (LinkMicAnchorGuideMessage) abstractC1110800f0o.LJIL;
                        String str2 = "";
                        if (linkMicAnchorGuideMessage == null || (str = linkMicAnchorGuideMessage.guideContent) == null) {
                            str = "";
                        }
                        Object[] objArr = new Object[1];
                        OptPairInfo optPairInfo = linkMicAnchorGuideMessage.optPairInfo;
                        if (optPairInfo != null) {
                            j = optPairInfo.expectedTimeSec;
                        } else {
                            j = 0;
                        }
                        objArr[0] = C963140bAe.LJI(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                        c16f5.setText(C786410Ut5.j4(str, Arrays.copyOf(objArr, 1)));
                        LinkMicAnchorGuideMessage linkMicAnchorGuideMessage2 = (LinkMicAnchorGuideMessage) abstractC1110800f0o.LJIL;
                        if (linkMicAnchorGuideMessage2 != null) {
                            i = linkMicAnchorGuideMessage2.guideType;
                        } else {
                            i = -1;
                        }
                        if (abstractC1110800f0o.LJIILJJIL.LIZJ == 1) {
                            if (i != 4) {
                                if (i != 6) {
                                    if (i == 9) {
                                        str2 = "pk_pairing_reservation";
                                    }
                                } else {
                                    str2 = "pk_pairing_change";
                                }
                            } else {
                                str2 = "pk_pairing_alert";
                            }
                            C955400ayA c955400ayA = C955400ayA.LIZ;
                            C955400ayA.LLIIIZ(linkMicAnchorGuideMessage2.optPairInfo, "pk_pairing_notice", str2);
                        }
                    }
                };
            }
        });
        abstractC1111600f26.LLLILZ(C153400iK.class, new AbstractC1111810f2R<C153400iK, C243400wq>() { // from class: X.0f0j
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.gq3;
            }

            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "link_battle_guide";
            }

            @Override // X.AbstractC1111810f2R, X.C0J8P
            public final void LJFF(RecyclerView.ViewHolder viewHolder) {
                ((AbstractC1111020f1A) viewHolder).onViewAttachedToWindow();
                DataChannel dataChannel = LJIIJJI().LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.zW(LinkBattleGuideVisibilityChannel.class, Boolean.TRUE);
                }
            }

            @Override // X.AbstractC1111810f2R, X.C0J8P
            public final void LJI(RecyclerView.ViewHolder viewHolder) {
                super.LJI((AbstractC1111020f1A) viewHolder);
                DataChannel dataChannel = LJIIJJI().LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.zW(LinkBattleGuideVisibilityChannel.class, Boolean.FALSE);
                }
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new AbstractC1110760f0k<C153400iK>(view) { // from class: X.00wq
                    public final View LLILZ;
                    public final ImageView LLILZIL;
                    public final C16F5 LLILZLL;
                    public final C16F5 LLIZ;

                    {
                        super(view);
                        this.LLILZ = view.findViewById(R.id.eu1);
                        this.LLILZIL = (ImageView) view.findViewById(R.id.ep8);
                        this.LLILZLL = (C16F5) view.findViewById(R.id.jc2);
                        this.LLIZ = (C16F5) view.findViewById(R.id.kyu);
                    }

                    @Override // X.AbstractC1111020f1A
                    public final void L5(final C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
                        boolean zBooleanValue;
                        float f;
                        String str;
                        Boolean bool;
                        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
                        this.LLILZIL.setImageResource(R.drawable.et5);
                        DataChannel dataChannel = c1109770ez9.LJIIIZ;
                        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(PublicScreenShrinkChannel.class)) != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        C19ME c19me = (C19ME) this.LLILZ.getLayoutParams();
                        if (zBooleanValue) {
                            f = 0.99f;
                        } else {
                            f = 0.8f;
                        }
                        c19me.matchConstraintPercentWidth = f;
                        C786410Ut5.W5(this.LLILZ, c19me);
                        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = (LinkMicBattleNoticeMessage) abstractC1110800f0o.LJIL;
                        int i = linkMicBattleNoticeMessage.noticeType;
                        if (i != 0) {
                            if (i != 4) {
                                if (i != 5) {
                                    return;
                                }
                            } else {
                                final BattleNoticeRuleGuide battleNoticeRuleGuide = linkMicBattleNoticeMessage.battleRuleGuide;
                                C16F5 c16f5 = this.LLILZLL;
                                C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                                Text text = battleNoticeRuleGuide.contentText;
                                String str2 = null;
                                if (text != null) {
                                    str = text.key;
                                } else {
                                    str = null;
                                }
                                c1124870fNVLIZJ.getClass();
                                String strLIZIZ = C1124870fNV.LIZIZ(str);
                                String str3 = "";
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                                c16f5.setText(strLIZIZ);
                                C16F5 c16f52 = this.LLIZ;
                                C1124870fNV c1124870fNVLIZJ2 = C1124870fNV.LIZJ();
                                Text text2 = battleNoticeRuleGuide.buttonContentText;
                                if (text2 != null) {
                                    str2 = text2.key;
                                }
                                c1124870fNVLIZJ2.getClass();
                                String strLIZIZ2 = C1124870fNV.LIZIZ(str2);
                                if (strLIZIZ2 != null) {
                                    str3 = strLIZIZ2;
                                }
                                c16f52.setText(str3);
                                C786410Ut5.I7(new View.OnClickListener() { // from class: X.018W
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        if (view2 != null && view2.getContext() != null) {
                                            C1109770ez9 c1109770ez92 = c1109770ez9;
                                            if (c1109770ez92.LJIIIZ != null) {
                                                Context context = c1109770ez92.LIZ;
                                                int iLJJI = (int) C497740JfY.LJJI(C465640INu.LIZIZ(context));
                                                C243400wq c243400wq = this;
                                                String str4 = battleNoticeRuleGuide.ruleUrl;
                                                c243400wq.getClass();
                                                C760370TsB c760370TsBLIZ = C0KYL.LIZ(str4);
                                                EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
                                                c760370TsBLIZ.LJJ(iLJJI, enumC760350Ts9);
                                                c760370TsBLIZ.LJIIIZ(402, enumC760350Ts9);
                                                c760370TsBLIZ.LJIJI(8, enumC760350Ts9);
                                                c760370TsBLIZ.LJIIIIZZ("bottom");
                                                String string = c760370TsBLIZ.LIZ().toString();
                                                IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                                                if (iHybridContainerService != null) {
                                                    iHybridContainerService.YC1(context, string, null);
                                                }
                                                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
                                                    InterfaceC1106030et7.a5.LJFF(Boolean.FALSE);
                                                }
                                            }
                                        }
                                    }
                                }, this.LLILZ);
                                return;
                            }
                        }
                        BattleNoticeAnchorGuide battleNoticeAnchorGuide = linkMicBattleNoticeMessage.anchorGuide;
                        this.LLILZLL.setText(battleNoticeAnchorGuide.content.text);
                        this.LLIZ.setText(battleNoticeAnchorGuide.buttonContent.text);
                        C786410Ut5.I7(new ACListenerS53S0101000_15(i, c1109770ez9, 5), this.LLILZ);
                    }
                };
            }

            @Override // X.AbstractC1111810f2R
            /* JADX INFO: renamed from: LJIILL */
            public final void LJFF(AbstractC1111020f1A abstractC1111020f1A) {
                abstractC1111020f1A.onViewAttachedToWindow();
                DataChannel dataChannel = LJIIJJI().LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.zW(LinkBattleGuideVisibilityChannel.class, Boolean.TRUE);
                }
            }

            @Override // X.AbstractC1111810f2R
            /* JADX INFO: renamed from: LJIILLIIL */
            public final void LJI(AbstractC1111020f1A abstractC1111020f1A) {
                super.LJI(abstractC1111020f1A);
                DataChannel dataChannel = LJIIJJI().LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.zW(LinkBattleGuideVisibilityChannel.class, Boolean.FALSE);
                }
            }
        });
        abstractC1111600f26.LLLILZ(C933890aPT.class, new AbstractC1111810f2R<C933890aPT, C933400aOg>() { // from class: X.0f0f
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.gq3;
            }

            @Override // X.AbstractC1111810f2R
            public final String LJIIJ() {
                return "link_audience_notice";
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new C933400aOg(view);
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJFF(InterfaceC1109340eyS interfaceC1109340eyS) {
        if (interfaceC1109340eyS.LIZ()) {
            return;
        }
        interfaceC1109340eyS.LIZLLL(C001A.LINK_MIC_BATTLE_NOTICE.getIntType());
        interfaceC1109340eyS.LIZLLL(C001A.LINK_CO_HOST_GUIDE.getIntType());
        interfaceC1109340eyS.LIZLLL(C001A.LINK_AUDIENCE_NOTICE.getIntType());
        interfaceC1109340eyS.LJIIZILJ(C001A.LINK_MIC_BATTLE_ITEM_CARD.getIntType());
    }
}
