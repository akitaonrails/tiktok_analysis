package Y;

import X.C08CX;
import X.C1263604x0;
import X.C1474810oTv;
import X.C1807670x8n;
import X.InterfaceC1666106fj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC700270RdR;
import X.InterfaceC700280RdS;
import Y.AObjectS108S0000000_2;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.assem.GreetingCardPopupAssem;
import com.ss.android.ugc.aweme.camera.GroupCameraInlineMsgAssem;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem;
import com.ss.android.ugc.aweme.chatroom.GroupChatAssem;
import com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler;
import com.ss.android.ugc.aweme.groupshot.AIGroupShotChatroomAssem;
import com.ss.android.ugc.aweme.im.actionbar.viewmodel.ActionBarViewModelImpl;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.AiReplySingleChatAbilityAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BotChatRoomAbilityAssem;
import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarDataControllerAssem;
import com.ss.android.ugc.aweme.im.b2c.analytics.B2CAnalyticsAssem;
import com.ss.android.ugc.aweme.im.b2c.fakeinline.UnlimitedStoryRepliesReminderFakeInlineMsgAssem;
import com.ss.android.ugc.aweme.im.b2c.notice.BusinessSingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem;
import com.ss.android.ugc.aweme.im.messagelist.protocols.GroupChatTypingBubbleAssem;
import com.ss.android.ugc.aweme.im.messagelist.protocols.SingleChatTypingBubbleAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.assem.ReadStateAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.ChatRoomOpenAbilityAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationControlAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataControllerAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.BaseSingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.freqcontrol.PromptUnifiedFrequencyControlAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.interactioncard.InteractionCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.media.PhotoSwapInlineEntranceAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatAssem;
import com.ss.android.ugc.aweme.im.vm.ChatCommonViewModelImpl;
import com.ss.android.ugc.aweme.interactive.task.game.GameChallengeChatroomAssem;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.IMAwemeIdDatabaseAssem;
import com.ss.android.ugc.aweme.publicgroup.preview.ChatPreviewModeVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM;
import com.tts.oecverify.BdTuring;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS55S0000000_2 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            default:
                return null;
        }
    }

    public AObjectS55S0000000_2(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PhotoSwapInlineEntranceAssem.LLIZLLLIL;
        return new MessageListViewModel();
    }

    public static final Object invoke$1(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.0Znm
            public final EnumC1660606eq LIZ = EnumC1660606eq.GREETING_CARD;
            public final C19719912Dl LIZIZ = C13LE.LIZ(GreetingCardPopupAssem.class);
            public final boolean LIZJ = C289800BXm.LIZ();

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                assembler.QQ2(fragment, AFwS248S0000000_14.get$arr$(10));
            }
        };
    }

    public static final Object invoke$10(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06eu
            public final EnumC1660606eq LIZ = EnumC1660606eq.SINGLE_CHAT_TYPING_INDICATOR;
            public final C19719912Dl LIZIZ = C13LE.LIZ(SingleChatTypingBubbleAssem.class);
            public final boolean LIZJ = C1661506ez.LIZIZ();

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$11(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fq
            public final EnumC1660606eq LIZ = EnumC1660606eq.READ_STATE;
            public final C19719912Dl LIZIZ = C13LE.LIZ(ReadStateAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$12(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06et
            public final EnumC1660606eq LIZ = EnumC1660606eq.SOCIAL_PHOTO_SWAP_ANIMATION;
            public final C19719912Dl LIZIZ = C13LE.LIZ(PhotoSwapAnimationControlAssem.class);
            public final boolean LIZJ = C1865360ydq.LIZ();

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$13(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fr
            public final EnumC1660606eq LIZ = EnumC1660606eq.CHAT_ROOM_OPEN_ABILITY;
            public final C19719912Dl LIZIZ = C13LE.LIZ(ChatRoomOpenAbilityAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$14(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fs
            public final EnumC1660606eq LIZ = EnumC1660606eq.SOCIAL_ACTION_BAR;
            public final C19719912Dl LIZIZ = C13LE.LIZ(SocialActionBarDataControllerAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$15(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fu
            public final EnumC1660606eq LIZ = EnumC1660606eq.INTERACTION_CARD;
            public final C19719912Dl LIZIZ = C13LE.LIZ(InteractionCardAssem.class);
            public final boolean LIZJ;

            {
                SettingsManager.LIZLLL().getClass();
                this.LIZJ = SettingsManager.LJ("dm_fortune_cookie", 0) == 1;
            }

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$16(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fi
            public final EnumC1660606eq LIZ = EnumC1660606eq.SOCIAL_PHOTO_SWAP;
            public final C19719912Dl LIZIZ = C13LE.LIZ(PhotoSwapInlineEntranceAssem.class);
            public final boolean LIZJ = C1865360ydq.LIZ();

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$17(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return C1807670x8n.LLLZIL();
    }

    public static final Object invoke$18(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return C1807670x8n.LLLZL();
    }

    public static final Object invoke$19(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return C1807670x8n.LLLZZ();
    }

    public static final Object invoke$2(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fl
            public final EnumC1660606eq LIZ = EnumC1660606eq.AWEME_ID_DATABASE;
            public final C19719912Dl LIZIZ = C13LE.LIZ(IMAwemeIdDatabaseAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$20(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return C1807670x8n.LLLZZIL();
    }

    public static final Object invoke$21(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06ft
            public final EnumC1660606eq LIZ = EnumC1660606eq.SOCIAL_GAME_CHALLENGE;
            public final C19719912Dl LIZIZ = C13LE.LIZ(GameChallengeChatroomAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$22(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatNoticeAssem.LLLLJ;
        return new ChatPreviewModeVM();
    }

    public static final Object invoke$23(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AiReplySingleChatAbilityAssem.LLJILJILJ;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$24(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BotChatRoomAbilityAssem.LLJILLL;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$25(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BotChatRoomAbilityAssem.LLJILLL;
        return new MessageListViewModel();
    }

    public static final Object invoke$26(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC700270RdR() { // from class: X.05m0
            @Override // X.InterfaceC700270RdR
            public final C007N LIZ() {
                C08CX c08cx = C08CX.INSTANCE;
                return new C007N(0, c08cx, c08cx);
            }

            @Override // X.InterfaceC700270RdR
            public final C007N LIZIZ(int i) {
                EnumC1450305m1 enumC1450305m1 = EnumC1450305m1.NORMAL;
                return new C007N(i, C13LQ.LJLIIL(new EnumC1450305m1[]{enumC1450305m1, EnumC1450305m1.MUST_SHOW}), Collections.singleton(enumC1450305m1));
            }

            @Override // X.InterfaceC700270RdR
            public final C007N LIZLLL(int i) {
                EnumC1450305m1 enumC1450305m1 = EnumC1450305m1.NORMAL;
                EnumC1450305m1 enumC1450305m12 = EnumC1450305m1.SKIP_AVOID;
                Set setLJLIIL = C13LQ.LJLIIL(new EnumC1450305m1[]{enumC1450305m1, EnumC1450305m1.MUST_SHOW, enumC1450305m12});
                Set setLJLIIL2 = C13LQ.LJLIIL(new EnumC1450305m1[]{enumC1450305m1, enumC1450305m12});
                if (i != 1) {
                    setLJLIIL2 = setLJLIIL;
                }
                return new C007N(1, setLJLIIL, setLJLIIL2);
            }

            @Override // X.InterfaceC700270RdR
            public final C007N LIZJ(int i, int i2) {
                EnumC1450305m1 enumC1450305m1 = EnumC1450305m1.NORMAL;
                Set setLJLIIL = C13LQ.LJLIIL(new EnumC1450305m1[]{enumC1450305m1, EnumC1450305m1.MUST_SHOW});
                Set setSingleton = Collections.singleton(enumC1450305m1);
                if (i2 != 1) {
                    setSingleton = setLJLIIL;
                }
                return new C007N(i, setLJLIIL, setSingleton);
            }
        };
    }

    public static final Object invoke$27(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC700280RdS() { // from class: X.05li
            /* JADX WARN: Type inference failed for: r0v0, types: [X.050i] */
            @Override // X.InterfaceC700280RdS
            public final C12830050i LIZ(String str, List list) {
                return new InterfaceC12836050o(str, list) { // from class: X.050i
                    public final String LIZ;
                    public final LinkedHashMap<String, C12831050j> LIZIZ;

                    @Override // X.InterfaceC12836050o
                    public final List<String> LIZJ() {
                        return C13LP.LLIIII(this.LIZIZ.keySet());
                    }

                    @Override // X.InterfaceC12836050o
                    public final boolean LJFF() {
                        if (this.LIZIZ.isEmpty()) {
                            return true;
                        }
                        Collection<C12831050j> collectionValues = this.LIZIZ.values();
                        if (collectionValues.isEmpty()) {
                            return true;
                        }
                        Iterator<T> it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            if (!((C12831050j) it2.next()).LIZIZ) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public final String toString() {
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LIZIZ.entrySet(), ", ", null, null, 0, null, new AObjectS108S0000000_2(1), 30);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FcpParticipationCheckerImpl(id=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", ");
                        sbLIZ.append(strLJJLIIIJ);
                        sbLIZ.append(", canParticipate=");
                        sbLIZ.append(LJFF());
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC12836050o
                    public final C1199704mh LIZIZ(String str2) {
                        C12831050j c12831050j = this.LIZIZ.get(str2);
                        if (c12831050j != null) {
                            return c12831050j.LIZJ;
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
                    @Override // X.InterfaceC12836050o
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZLLL(java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.lang.Object>> r8) {
                        /*
                            r7 = this;
                            java.util.Iterator r6 = r8.iterator()
                        L4:
                            boolean r0 = r6.hasNext()
                            if (r0 == 0) goto L84
                            java.lang.Object r0 = r6.next()
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            java.lang.Object r5 = r0.getFirst()
                            java.lang.String r5 = (java.lang.String) r5
                            java.lang.Object r4 = r0.getSecond()
                            java.util.LinkedHashMap<java.lang.String, X.050j> r0 = r7.LIZIZ
                            java.lang.Object r3 = r0.get(r5)
                            X.050j r3 = (X.C12831050j) r3
                            if (r3 == 0) goto L4
                            X.04mh r1 = new X.04mh
                            r0 = 0
                            r1.<init>(r0, r0)
                            r3.LIZJ = r1
                            X.050n r2 = new X.050n
                            r2.<init>(r7, r5)
                            X.050k r1 = r3.LIZ     // Catch: java.lang.Throwable -> L66
                            boolean r0 = r1 instanceof X.C12833050l     // Catch: java.lang.Throwable -> L66
                            if (r0 == 0) goto L4d
                            X.050l r1 = (X.C12833050l) r1     // Catch: java.lang.Throwable -> L66
                            kotlin.jvm.functions.Function1<X.050n, java.lang.Boolean> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L66
                            java.lang.Object r0 = r0.invoke(r2)     // Catch: java.lang.Throwable -> L66
                            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L66
                            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L66
                        L45:
                            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L66
                            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L66
                            goto L72
                        L4d:
                            boolean r0 = r1 instanceof X.C12834050m     // Catch: java.lang.Throwable -> L66
                            if (r0 == 0) goto L60
                            X.050m r1 = (X.C12834050m) r1     // Catch: java.lang.Throwable -> L66
                            kotlin.jvm.functions.Function2<X.050n, java.lang.Object, java.lang.Boolean> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L66
                            java.lang.Object r0 = r0.invoke(r2, r4)     // Catch: java.lang.Throwable -> L66
                            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L66
                            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L66
                            goto L45
                        L60:
                            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> L66
                            r0.<init>()     // Catch: java.lang.Throwable -> L66
                            throw r0     // Catch: java.lang.Throwable -> L66
                        L66:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                            X.00Yq r2 = new X.00Yq
                            r2.<init>(r0)
                            X.C189200o6.m2constructorimpl(r2)
                        L72:
                            java.lang.Boolean r1 = java.lang.Boolean.FALSE
                            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
                            if (r0 == 0) goto L7b
                            r2 = r1
                        L7b:
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r0 = r2.booleanValue()
                            r3.LIZIZ = r0
                            goto L4
                        L84:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C12830050i.LIZLLL(java.util.List):void");
                    }

                    @Override // X.InterfaceC12836050o
                    public final Boolean LJ(String str2) {
                        C12831050j c12831050j = this.LIZIZ.get(str2);
                        if (c12831050j != null) {
                            return Boolean.valueOf(c12831050j.LIZIZ);
                        }
                        return null;
                    }

                    {
                        this.LIZ = str;
                        LinkedHashMap<String, C12831050j> linkedHashMap = new LinkedHashMap<>();
                        for (AbstractC12832050k abstractC12832050k : list) {
                            linkedHashMap.put(abstractC12832050k.LIZ(), new C12831050j(abstractC12832050k));
                        }
                        this.LIZIZ = linkedHashMap;
                    }

                    @Override // X.InterfaceC12836050o
                    public final void LIZ(String str2, String str3, Map<String, ? extends Object> map) {
                        C12831050j c12831050j = this.LIZIZ.get(str2);
                        if (c12831050j == null) {
                            return;
                        }
                        c12831050j.LIZJ = new C1199704mh(str3, map);
                    }
                };
            }
        };
    }

    public static final Object invoke$28(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BaseSingleChatNoticeAssem.LLLJL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$29(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatNoticeAssem.LLLIIIIL;
        return new MessageListViewModel();
    }

    public static final Object invoke$3(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fm
            public final EnumC1660606eq LIZ = EnumC1660606eq.CAMERA_INLINE_MESSAGE;
            public final C19719912Dl LIZIZ = C13LE.LIZ(GroupCameraInlineMsgAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$30(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatNoticeAssem.LLLIIIIL;
        return new TypingRecommendationVM();
    }

    public static final Object invoke$31(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatNoticeAssem.LLLIIIIL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$32(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommonChatNoticeAssem.LLLIIIIL;
        return C1807670x8n.LJJJIL();
    }

    public static final Object invoke$33(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleChatAssem.LLJJJ;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$34(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UnlimitedStoryRepliesReminderFakeInlineMsgAssem.LLILZIL;
        return new MessageListViewModel();
    }

    public static final Object invoke$35(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessChatActionBarDataControllerAssem.LLJILJILJ;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$36(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PromptUnifiedFrequencyControlAssem.LLIZLLLIL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$37(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PromptUnifiedFrequencyControlAssem.LLIZLLLIL;
        return new MessageListViewModel();
    }

    public static final Object invoke$38(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = B2CAnalyticsAssem.LLJJIJI;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$39(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatAssem.LLJJL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$4(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.0qfZ
            public final EnumC1660606eq LIZ = EnumC1660606eq.EASTER_EGG_FOR_SHARE;
            public final C19719912Dl LIZIZ = C13LE.LIZ(EasterEggForShareAssem.class);
            public final boolean LIZJ;

            {
                this.LIZJ = C1558920qfa.LIZ().isFullyLaunch == 1 || C1558920qfa.LIZ().enable == 1;
            }

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                assembler.QQ2(fragment, AFwS264S0000000_24.get$arr$(13));
            }
        };
    }

    public static final Object invoke$40(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatAssem.LLJJL;
        return new ChatPreviewModeVM();
    }

    public static final Object invoke$41(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        String str = (String) C1474810oTv.v5.getValue();
        boolean z = false;
        if (str.length() == 0) {
            return new C1263604x0(true, C08CX.INSTANCE);
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String string = a0.LJLIIIL((String) it2.next()).toString();
            if (string.length() != 0) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                if (Intrinsics.LJFF(lowerCase, "all_pages")) {
                    z = true;
                    break;
                }
                hashSet.add(lowerCase);
            }
        }
        return new C1263604x0(z, hashSet);
    }

    public static final Object invoke$42(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SocialActionBarDataControllerAssem.LLILZIL;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$43(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BusinessSingleChatNoticeAssem.LLLLIIL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$5(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fn
            public final EnumC1660606eq LIZ = EnumC1660606eq.SOCIAL_AI_GROUP_SHOT;
            public final C19719912Dl LIZIZ = C13LE.LIZ(AIGroupShotChatroomAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$6(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06f5
            public final EnumC1660606eq LIZ = EnumC1660606eq.BUSINESS_ACTION_BAR;
            public final C19719912Dl LIZIZ = C13LE.LIZ(BusinessChatActionBarDataControllerAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$7(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06es
            public final EnumC1660606eq LIZ = EnumC1660606eq.UNLIMITED_STORY_REPLIES_REMINDER;
            public final C19719912Dl LIZIZ = C13LE.LIZ(UnlimitedStoryRepliesReminderFakeInlineMsgAssem.class);
            public final boolean LIZJ;

            {
                this.LIZJ = C1665706ff.LIZJ.LJIIIIZZ() && !C1654606ds.LIZIZ();
            }

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$8(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06ev
            public final EnumC1660606eq LIZ = EnumC1660606eq.ANIMATION_QUEUE_MANAGER;
            public final C19719912Dl LIZIZ = C13LE.LIZ(AnimationQueueManagerAssem.class);

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZ.getDefaultEnable();
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public static final Object invoke$9(AObjectS55S0000000_2 aObjectS55S0000000_2) {
        return new InterfaceC1666106fj() { // from class: X.06fo
            public final EnumC1660606eq LIZ = EnumC1660606eq.GROUP_CHAT_TYPING_INDICATOR;
            public final C19719912Dl LIZIZ = C13LE.LIZ(GroupChatTypingBubbleAssem.class);
            public final boolean LIZJ = C1666706fp.LIZIZ();

            @Override // X.InterfaceC1666106fj
            public final boolean LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1666106fj
            public final C19719912Dl LJIILIIL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final EnumC1660606eq getType() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1666106fj
            public final void LIZ(Fragment fragment, Assembler assembler) {
                C1666206fk.LIZ(this, fragment, assembler);
            }
        };
    }

    public AObjectS55S0000000_2(GroupChatNoticeAssem groupChatNoticeAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(GroupChatAssem groupChatAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(ChatRoomAssembler chatRoomAssembler, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(AiReplySingleChatAbilityAssem aiReplySingleChatAbilityAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(BotChatRoomAbilityAssem botChatRoomAbilityAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(BusinessChatActionBarDataControllerAssem businessChatActionBarDataControllerAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(B2CAnalyticsAssem b2CAnalyticsAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(UnlimitedStoryRepliesReminderFakeInlineMsgAssem unlimitedStoryRepliesReminderFakeInlineMsgAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(BusinessSingleChatNoticeAssem businessSingleChatNoticeAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(SocialActionBarDataControllerAssem socialActionBarDataControllerAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(BaseSingleChatNoticeAssem baseSingleChatNoticeAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(CommonChatNoticeAssem commonChatNoticeAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(PromptUnifiedFrequencyControlAssem promptUnifiedFrequencyControlAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(PhotoSwapInlineEntranceAssem photoSwapInlineEntranceAssem, int i) {
        this.$t = i;
    }

    public AObjectS55S0000000_2(SingleChatAssem singleChatAssem, int i) {
        this.$t = i;
    }
}
