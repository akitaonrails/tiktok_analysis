package X;

import android.view.View;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceShoppingIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePcsFixBusinessIconConflictSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1102740eno implements InterfaceC1102890eo3, InterfaceC1102900eo4 {
    public static final EnumC1102740eno ANCHOR_PARTNERSHIP;
    public static final EnumC1102740eno ANCHOR_PARTNERSHIP_DROPS;
    public static final EnumC1102740eno ANCHOR_SERVICE_PLUS;
    public static final EnumC1102740eno ANCHOR_SUBSCRIPTION;
    public static final EnumC1102740eno AUDIENCE_INTERACTION_FEATURES;
    public static final EnumC1102740eno AUDIENCE_LANDSCAPE_PARTNERSHIP;
    public static final EnumC1102740eno AUDIENCE_PARTNERSHIP;
    public static final EnumC1102740eno AUDIENCE_SERVICE_PLUS;
    public static final EnumC1102740eno AUDIENCE_SLOT;
    public static final EnumC1102740eno AUDIENCE_SUBSCRIPTION;
    public static final EnumC1102740eno COHOST;
    public static final EnumC1102740eno CUSTOM_POLL;
    public static final C1102850enz Companion;
    public static final EnumC1102740eno DUMMY_FAST_GIFT;
    public static final EnumC1102740eno DUMMY_GIFT;
    public static final EnumC1102740eno EFFECT;
    public static final EnumC1102740eno FAST_GIFT;
    public static final EnumC1102740eno GIFT;
    public static final EnumC1102740eno ICON_SLOT;
    public static final EnumC1102740eno INTERACTION_FEATURES;
    public static final EnumC1102740eno INTERACTION_PK;
    public static final EnumC1102740eno INTERACTIVE_PLAZA;
    public static final EnumC1102740eno LANDSCAPE_MESSAGE;
    public static final /* synthetic */ EnumC1102740eno[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC1102740eno MORE;
    public static final EnumC1102740eno MULTIGUEST;
    public static final EnumC1102740eno MULTI_GUEST_BACK;
    public static final EnumC1102740eno MULTI_GUEST_JOIN;
    public static final EnumC1102740eno MULTI_GUEST_LIVE_SHOW;
    public static final EnumC1102740eno MULTI_GUEST_MANAGE;
    public static final EnumC1102740eno MULTI_GUEST_MIC;
    public static final EnumC1102740eno MULTI_GUEST_PLAY;
    public static final EnumC1102740eno MULTI_GUEST_PLAY_BOOK;
    public static final EnumC1102740eno MULTI_GUEST_SWITCH;
    public static final EnumC1102740eno MULTI_GUEST_VIDEO;
    public static final EnumC1102740eno QUESTION;
    public static final EnumC1102740eno SHARE;
    public static final EnumC1102740eno SLOT;
    public static final EnumC1102740eno TRY_MODE_COHOST;
    public static final EnumC1102740eno TRY_MODE_MULTIGUEST;
    public static final EnumC1102740eno VOTE;
    public final Map<EnumC1099930ejH, C1102970eoB> LL;
    public final String LLILLJJLI;
    public InterfaceC1102890eo3 LLILLL;
    public InterfaceC1102900eo4 LLILZ;
    public final Map<EnumC1102740eno, Long> LLILZIL = new LinkedHashMap();

    public static InterfaceC2044707zh<EnumC1102740eno> getEntries() {
        return LLIZ;
    }

    static {
        EnumC1102740eno enumC1102740eno = new EnumC1102740eno(0, "QUESTION", "QAndA", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(329)));
        QUESTION = enumC1102740eno;
        EnumC1102740eno enumC1102740eno2 = new EnumC1102740eno(1, "CUSTOM_POLL", "CustomPollEntrance", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(221)));
        CUSTOM_POLL = enumC1102740eno2;
        EnumC1102740eno enumC1102740eno3 = new EnumC1102740eno(2, "VOTE", "Vote", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(322)));
        VOTE = enumC1102740eno3;
        EnumC1102740eno enumC1102740eno4 = new EnumC1102740eno(3, "INTERACTIVE_PLAZA", "Plaza", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(323)));
        INTERACTIVE_PLAZA = enumC1102740eno4;
        EnumC1102740eno enumC1102740eno5 = new EnumC1102740eno(4, "INTERACTION_PK", "Battle", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(325)));
        INTERACTION_PK = enumC1102740eno5;
        EnumC1102740eno enumC1102740eno6 = new EnumC1102740eno(5, "COHOST", "LinkMic", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(326)));
        COHOST = enumC1102740eno6;
        EnumC1102740eno enumC1102740eno7 = new EnumC1102740eno(6, "TRY_MODE_COHOST", "LinkMic", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(328)));
        TRY_MODE_COHOST = enumC1102740eno7;
        EnumC1102740eno enumC1102740eno8 = new EnumC1102740eno(7, "MULTIGUEST", "Interactive", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(330)));
        MULTIGUEST = enumC1102740eno8;
        EnumC1102740eno enumC1102740eno9 = new EnumC1102740eno(8, "TRY_MODE_MULTIGUEST", "Interactive", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(332)));
        TRY_MODE_MULTIGUEST = enumC1102740eno9;
        EnumC1102740eno enumC1102740eno10 = new EnumC1102740eno(9, "MULTI_GUEST_VIDEO", "Video", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(214)));
        MULTI_GUEST_VIDEO = enumC1102740eno10;
        EnumC1102740eno enumC1102740eno11 = new EnumC1102740eno(10, "MULTI_GUEST_MIC", "Microphone", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(215)));
        MULTI_GUEST_MIC = enumC1102740eno11;
        EnumC1102740eno enumC1102740eno12 = new EnumC1102740eno(11, "MULTI_GUEST_MANAGE", "MultiGuestReverse", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(216)));
        MULTI_GUEST_MANAGE = enumC1102740eno12;
        EnumC1102740eno enumC1102740eno13 = new EnumC1102740eno(12, "MULTI_GUEST_LIVE_SHOW", "MultiGuestLiveShow", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(318)));
        MULTI_GUEST_LIVE_SHOW = enumC1102740eno13;
        EnumC1102740eno enumC1102740eno14 = new EnumC1102740eno(13, "MULTI_GUEST_PLAY", "MultiGuestPlay", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(319)));
        MULTI_GUEST_PLAY = enumC1102740eno14;
        EnumC1102740eno enumC1102740eno15 = new EnumC1102740eno(14, "MULTI_GUEST_PLAY_BOOK", "MultiGuestPlayBook", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(321)));
        MULTI_GUEST_PLAY_BOOK = enumC1102740eno15;
        EnumC1102740eno enumC1102740eno16 = new EnumC1102740eno(15, "MULTI_GUEST_SWITCH", "MultiGuestSwitch", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(218)));
        MULTI_GUEST_SWITCH = enumC1102740eno16;
        EnumC1102740eno enumC1102740eno17 = new EnumC1102740eno(16, "MULTI_GUEST_BACK", "MultiGuestBack", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(324)));
        MULTI_GUEST_BACK = enumC1102740eno17;
        EnumC1102740eno enumC1102740eno18 = new EnumC1102740eno(17, "MULTI_GUEST_JOIN", "MultiGuestJoin", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(219)));
        MULTI_GUEST_JOIN = enumC1102740eno18;
        EnumC1102740eno enumC1102740eno19 = new EnumC1102740eno(18, "SLOT", "AnchorBottomSlot", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(327)));
        SLOT = enumC1102740eno19;
        EnumC1102740eno enumC1102740eno20 = new EnumC1102740eno(19, "AUDIENCE_SLOT", "AudienceBottomRightSlot", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(331)));
        AUDIENCE_SLOT = enumC1102740eno20;
        EnumC1102740eno enumC1102740eno21 = new EnumC1102740eno(20, "ICON_SLOT", "AudienceBottomLeftSlot", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(333)));
        ICON_SLOT = enumC1102740eno21;
        EnumC1102740eno enumC1102740eno22 = new EnumC1102740eno(21, "INTERACTION_FEATURES", "InteractGroup", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(334)));
        INTERACTION_FEATURES = enumC1102740eno22;
        EnumC1102740eno enumC1102740eno23 = new EnumC1102740eno(22, "AUDIENCE_INTERACTION_FEATURES", "InteractGroup", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(335)));
        AUDIENCE_INTERACTION_FEATURES = enumC1102740eno23;
        EnumC1102740eno enumC1102740eno24 = new EnumC1102740eno(23, "SHARE", "Share", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(336)));
        SHARE = enumC1102740eno24;
        EnumC1102740eno enumC1102740eno25 = new EnumC1102740eno(24, "EFFECT", "Decoration", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(337)));
        EFFECT = enumC1102740eno25;
        EnumC1102740eno enumC1102740eno26 = new EnumC1102740eno(25, "MORE", "Group", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(338)));
        MORE = enumC1102740eno26;
        EnumC1102740eno enumC1102740eno27 = new EnumC1102740eno(26, "LANDSCAPE_MESSAGE", "ClearMessage", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(339)));
        LANDSCAPE_MESSAGE = enumC1102740eno27;
        EnumC1102740eno enumC1102740eno28 = new EnumC1102740eno(27, "GIFT", "Gift", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(340)));
        GIFT = enumC1102740eno28;
        EnumC1102740eno enumC1102740eno29 = new EnumC1102740eno(28, "FAST_GIFT", "InstantGift", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(220)));
        FAST_GIFT = enumC1102740eno29;
        EnumC1102740eno enumC1102740eno30 = new EnumC1102740eno(29, "DUMMY_GIFT", "Gift", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(341)));
        DUMMY_GIFT = enumC1102740eno30;
        EnumC1102740eno enumC1102740eno31 = new EnumC1102740eno(30, "DUMMY_FAST_GIFT", "InstantGift", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(222)));
        DUMMY_FAST_GIFT = enumC1102740eno31;
        EnumC1102740eno enumC1102740eno32 = new EnumC1102740eno(31, "ANCHOR_PARTNERSHIP", "AnchorGamePartnership", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(342)));
        ANCHOR_PARTNERSHIP = enumC1102740eno32;
        EnumC1102740eno enumC1102740eno33 = new EnumC1102740eno(32, "ANCHOR_PARTNERSHIP_DROPS", "AnchorPartnershipDrops", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(343)));
        ANCHOR_PARTNERSHIP_DROPS = enumC1102740eno33;
        EnumC1102740eno enumC1102740eno34 = new EnumC1102740eno(33, "AUDIENCE_PARTNERSHIP", "AudienceGamePartnership", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(314)));
        AUDIENCE_PARTNERSHIP = enumC1102740eno34;
        EnumC1102740eno enumC1102740eno35 = new EnumC1102740eno(34, "AUDIENCE_LANDSCAPE_PARTNERSHIP", "AudienceGamePartnership", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(315)));
        AUDIENCE_LANDSCAPE_PARTNERSHIP = enumC1102740eno35;
        EnumC1102740eno enumC1102740eno36 = new EnumC1102740eno(35, "ANCHOR_SERVICE_PLUS", "small_and_medium_business", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(316)));
        ANCHOR_SERVICE_PLUS = enumC1102740eno36;
        EnumC1102740eno enumC1102740eno37 = new EnumC1102740eno(36, "ANCHOR_SUBSCRIPTION", "Subscription", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(317)));
        ANCHOR_SUBSCRIPTION = enumC1102740eno37;
        EnumC1102740eno enumC1102740eno38 = new EnumC1102740eno(37, "AUDIENCE_SUBSCRIPTION", "AudienceSubscription", C1103080eoM.LIZLLL(AFwS283S0000000_35.get$arr$(217)));
        AUDIENCE_SUBSCRIPTION = enumC1102740eno38;
        EnumC1102740eno enumC1102740eno39 = new EnumC1102740eno(38, "AUDIENCE_SERVICE_PLUS", "AudienceServicePlus", C1103080eoM.LIZLLL(AFwS254S0000000_17.get$arr$(320)));
        AUDIENCE_SERVICE_PLUS = enumC1102740eno39;
        EnumC1102740eno[] enumC1102740enoArr = {enumC1102740eno, enumC1102740eno2, enumC1102740eno3, enumC1102740eno4, enumC1102740eno5, enumC1102740eno6, enumC1102740eno7, enumC1102740eno8, enumC1102740eno9, enumC1102740eno10, enumC1102740eno11, enumC1102740eno12, enumC1102740eno13, enumC1102740eno14, enumC1102740eno15, enumC1102740eno16, enumC1102740eno17, enumC1102740eno18, enumC1102740eno19, enumC1102740eno20, enumC1102740eno21, enumC1102740eno22, enumC1102740eno23, enumC1102740eno24, enumC1102740eno25, enumC1102740eno26, enumC1102740eno27, enumC1102740eno28, enumC1102740eno29, enumC1102740eno30, enumC1102740eno31, enumC1102740eno32, enumC1102740eno33, enumC1102740eno34, enumC1102740eno35, enumC1102740eno36, enumC1102740eno37, enumC1102740eno38, enumC1102740eno39};
        LLILZLL = enumC1102740enoArr;
        LLIZ = new C2254308sP(enumC1102740enoArr);
        Companion = new C1102850enz();
    }

    public static EnumC1102740eno[] values() {
        return (EnumC1102740eno[]) LLILZLL.clone();
    }

    public final String getIdentifier() {
        return this.LLILLJJLI;
    }

    public static InterfaceC1102930eo7 LIZJ(DataChannel dataChannel) {
        return ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0(dataChannel);
    }

    public static EnumC1102740eno valueOf(String str) {
        return (EnumC1102740eno) C08FF.LIZ(EnumC1102740eno.class, str);
    }

    public final String getScene(DataChannel dataChannel) {
        EnumC1088870eRR enumC1088870eRRLJFF;
        if (dataChannel == null) {
            return "unknow";
        }
        InterfaceC1102930eo7 interfaceC1102930eo7LIZJ = LIZJ(dataChannel);
        if (interfaceC1102930eo7LIZJ != null && (enumC1088870eRRLJFF = ((C1102690enj) interfaceC1102930eo7LIZJ).LJFF(this)) != null) {
            int i = C1088860eRQ.LIZ[enumC1088870eRRLJFF.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (C500260Jjc.LJIIZILJ(dataChannel)) {
                        return "AnchorRightBottom";
                    }
                    return "AudienceRightBottom";
                }
                return "other";
            }
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                return "AnchorLeftBottom";
            }
            return "AudienceLeftBottom";
        }
        return "other";
    }

    public final View getView(DataChannel dataChannel) {
        InterfaceC1102930eo7 interfaceC1102930eo7LIZJ = LIZJ(dataChannel);
        if (interfaceC1102930eo7LIZJ != null) {
            return ((C1102690enj) interfaceC1102930eo7LIZJ).LJI(this);
        }
        return null;
    }

    public final TBViewModel getViewModel(DataChannel dataChannel) {
        InterfaceC1102930eo7 interfaceC1102930eo7LIZJ = LIZJ(dataChannel);
        if (interfaceC1102930eo7LIZJ != null) {
            return ((C1102690enj) interfaceC1102930eo7LIZJ).LJII(this);
        }
        return null;
    }

    public final void hide(DataChannel dataChannel) {
        setVisibility(dataChannel, 8, null);
    }

    @Override // X.InterfaceC1102890eo3
    public Integer icon(EnumC1099930ejH enumC1099930ejH) {
        InterfaceC1102890eo3 interfaceC1102890eo3;
        Integer numIcon;
        InterfaceC1102890eo3 interfaceC1102890eo32 = this.LLILLL;
        if (interfaceC1102890eo32 == null || (numIcon = interfaceC1102890eo32.icon(enumC1099930ejH)) == null) {
            C1102970eoB c1102970eoB = this.LL.get(enumC1099930ejH);
            if (c1102970eoB != null && (interfaceC1102890eo3 = c1102970eoB.LIZ) != null) {
                return interfaceC1102890eo3.icon(enumC1099930ejH);
            }
            return null;
        }
        return numIcon;
    }

    @Override // X.InterfaceC1102890eo3
    public C1102880eo2 iconConfig(EnumC1099930ejH enumC1099930ejH) {
        InterfaceC1102890eo3 interfaceC1102890eo3;
        C1102880eo2 c1102880eo2IconConfig;
        InterfaceC1102890eo3 interfaceC1102890eo32 = this.LLILLL;
        if (interfaceC1102890eo32 == null || (c1102880eo2IconConfig = interfaceC1102890eo32.iconConfig(enumC1099930ejH)) == null) {
            C1102970eoB c1102970eoB = this.LL.get(enumC1099930ejH);
            if (c1102970eoB != null && (interfaceC1102890eo3 = c1102970eoB.LIZ) != null) {
                return interfaceC1102890eo3.iconConfig(enumC1099930ejH);
            }
            return null;
        }
        return c1102880eo2IconConfig;
    }

    @Override // X.InterfaceC1102900eo4
    public boolean isLiveDesignLayout(EnumC1099930ejH enumC1099930ejH) {
        C1102970eoB c1102970eoB;
        InterfaceC1102900eo4 interfaceC1102900eo4;
        if (this.LLILZ != null || (c1102970eoB = this.LL.get(enumC1099930ejH)) == null || (interfaceC1102900eo4 = c1102970eoB.LIZIZ) == null || !interfaceC1102900eo4.isLiveDesignLayout(enumC1099930ejH)) {
            return false;
        }
        return true;
    }

    public final boolean isShowing(DataChannel dataChannel) {
        TBViewModel viewModel = getViewModel(dataChannel);
        if (viewModel == null || !viewModel.isVisible()) {
            return false;
        }
        return true;
    }

    public final boolean isShowingInInteractionDialog(DataChannel dataChannel) {
        Boolean boolValueOf;
        InterfaceC1102930eo7 interfaceC1102930eo7LIZJ = LIZJ(dataChannel);
        if (interfaceC1102930eo7LIZJ != null) {
            boolValueOf = Boolean.valueOf(((C1102690enj) interfaceC1102930eo7LIZJ).LJIIIZ(this));
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    @Override // X.InterfaceC1102900eo4
    public Integer layoutID(EnumC1099930ejH enumC1099930ejH) {
        InterfaceC1102900eo4 interfaceC1102900eo4;
        Integer numLayoutID;
        InterfaceC1102900eo4 interfaceC1102900eo42 = this.LLILZ;
        if (interfaceC1102900eo42 == null || (numLayoutID = interfaceC1102900eo42.layoutID(enumC1099930ejH)) == null) {
            C1102970eoB c1102970eoB = this.LL.get(enumC1099930ejH);
            if (c1102970eoB != null && (interfaceC1102900eo4 = c1102970eoB.LIZIZ) != null) {
                return interfaceC1102900eo4.layoutID(enumC1099930ejH);
            }
            return null;
        }
        return numLayoutID;
    }

    public final void show(DataChannel dataChannel) {
        show(dataChannel, null);
    }

    @Override // X.InterfaceC1102890eo3
    public Integer text(EnumC1099930ejH enumC1099930ejH) {
        InterfaceC1102890eo3 interfaceC1102890eo3;
        Integer numText;
        InterfaceC1102890eo3 interfaceC1102890eo32 = this.LLILLL;
        if (interfaceC1102890eo32 == null || (numText = interfaceC1102890eo32.text(enumC1099930ejH)) == null) {
            C1102970eoB c1102970eoB = this.LL.get(enumC1099930ejH);
            if (c1102970eoB != null && (interfaceC1102890eo3 = c1102970eoB.LIZ) != null) {
                return interfaceC1102890eo3.text(enumC1099930ejH);
            }
            return null;
        }
        return numText;
    }

    @Override // X.InterfaceC1102890eo3
    public Integer title(EnumC1099930ejH enumC1099930ejH) {
        InterfaceC1102890eo3 interfaceC1102890eo3;
        Integer numTitle;
        InterfaceC1102890eo3 interfaceC1102890eo32 = this.LLILLL;
        if (interfaceC1102890eo32 == null || (numTitle = interfaceC1102890eo32.title(enumC1099930ejH)) == null) {
            C1102970eoB c1102970eoB = this.LL.get(enumC1099930ejH);
            if (c1102970eoB != null && (interfaceC1102890eo3 = c1102970eoB.LIZ) != null) {
                return interfaceC1102890eo3.title(enumC1099930ejH);
            }
            return null;
        }
        return numTitle;
    }

    public final Unit unload(DataChannel dataChannel) {
        InterfaceC1102930eo7 interfaceC1102930eo7LIZJ = LIZJ(dataChannel);
        if (interfaceC1102930eo7LIZJ != null) {
            ((C1102690enj) interfaceC1102930eo7LIZJ).LJIIJJI(this);
            return Unit.LIZ;
        }
        return null;
    }

    public final void withDataConfig(InterfaceC1102890eo3 interfaceC1102890eo3) {
        this.LLILLL = interfaceC1102890eo3;
    }

    public final void withLayoutConfig(InterfaceC1102900eo4 interfaceC1102900eo4) {
        this.LLILZ = interfaceC1102900eo4;
    }

    public final void setMaxWidth(DataChannel dataChannel, Integer num) {
        TBViewModel viewModel = getViewModel(dataChannel);
        if (viewModel != null) {
            viewModel.xQ2(num);
        }
    }

    public final void setMinWidth(DataChannel dataChannel, Integer num) {
        TBViewModel viewModel = getViewModel(dataChannel);
        if (viewModel != null) {
            viewModel.yQ2(num);
        }
    }

    public final void setVisibility(DataChannel dataChannel, int i) {
        setVisibility(dataChannel, i, null);
    }

    public final void setWidthMode(DataChannel dataChannel, C0KX7 c0kx7) {
        TBViewModel viewModel = getViewModel(dataChannel);
        if (viewModel != null) {
            viewModel.AQ2(c0kx7);
        }
    }

    public final void show(DataChannel dataChannel, String str) {
        setVisibility(dataChannel, 0, str);
    }

    public final Unit load(DataChannel dataChannel, InterfaceC1102810env interfaceC1102810env, boolean z) {
        Unit unit;
        boolean zLJI = MethodIDManager.LJI(72009);
        InterfaceC1102930eo7 interfaceC1102930eo7LIZJ = LIZJ(dataChannel);
        if (interfaceC1102930eo7LIZJ != null) {
            ((C1102690enj) interfaceC1102930eo7LIZJ).LJIIJ(this, interfaceC1102810env, z);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return unit;
    }

    public final void logToolbarButtonShow(DataChannel dataChannel, EnumC1102740eno enumC1102740eno, String str) {
        logToolbarButtonShow(dataChannel, enumC1102740eno, str, null);
    }

    public final void setVisibility(DataChannel dataChannel, int i, String str) {
        boolean z;
        boolean zBooleanValue;
        TBViewModel viewModel = getViewModel(dataChannel);
        if (viewModel != null) {
            if (LivePcsFixBusinessIconConflictSetting.INSTANCE.getValue() && Intrinsics.LJFF(this.LLILLJJLI, "AudienceServicePlus") && i == 0) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Pair pair = (Pair) dataChannelGlobal.gg0(PcsAudienceShoppingIconVisibleChannel.class);
                if (C473420IhQ.LIZIZ(pair, "ToolbarButtonV2", "setVisibility.AUDIENCE_SERVICE_PLUS_IDENTIFIER", (Room) dataChannelGlobal.gg0(C930940aKi.class))) {
                    if (pair != null && (zBooleanValue = ((Boolean) pair.getSecond()).booleanValue())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ToolbarButtonV2.setVisibility.AUDIENCE_SERVICE_PLUS_IDENTIFIER shoppingIconVisible=");
                        sbLIZ.append(zBooleanValue);
                        sbLIZ.append(" return");
                        C20441214yg.LIZIZ("ServiceIconConflictsResolution", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!viewModel.isVisible() && i == 0) {
                logToolbarButtonShow(dataChannel, this, str);
            }
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            viewModel.zQ2(z, true);
        }
    }

    public EnumC1102740eno(int i, String str, String str2, Map map) {
        this.LL = map;
        this.LLILLJJLI = str2;
    }

    public final void logToolbarButtonShow(DataChannel dataChannel, EnumC1102740eno enumC1102740eno, String str, Map<String, String> map) {
        long jLongValue;
        String str2;
        Room room;
        Long l = (Long) ((LinkedHashMap) this.LLILZIL).get(enumC1102740eno);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLongValue < 50) {
            return;
        }
        this.LLILZIL.put(enumC1102740eno, Long.valueOf(jCurrentTimeMillis));
        if (str == null) {
            str = enumC1102740eno.LLILLJJLI;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_button_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(getScene(dataChannel), "button_scene");
        c474500IjALIZ.LJJII(C500260Jjc.LLFF(dataChannel), "user_type");
        c474500IjALIZ.LJJII(str, "button_name");
        if (C497740JfY.LJIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        c474500IjALIZ.LJJII(str2, "room_orientation");
        if (Intrinsics.LJFF(str, SHARE.LLILLJJLI) && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.ecommerceActivityInfo != null) {
            c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        }
        c474500IjALIZ.LIZ();
    }

    public static /* synthetic */ Unit load$default(EnumC1102740eno enumC1102740eno, DataChannel dataChannel, InterfaceC1102810env interfaceC1102810env, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            return enumC1102740eno.load(dataChannel, interfaceC1102810env, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
    }
}
