package Y;

import X.C0II9;
import X.C1077790e9Z;
import X.C1106110etF;
import X.C1113800f5e;
import X.C1114370f6Z;
import X.C1115010f7b;
import X.C1115020f7c;
import X.C1119590fEz;
import X.C1135810ff9;
import X.C20441214yg;
import X.C2188811AlT;
import X.C785220UrA;
import X.C785230UrB;
import X.C785270UrF;
import X.C786410Ut5;
import X.C842240X2g;
import X.C924810aAp;
import X.C974320bSg;
import X.EnumC1087640ePS;
import X.EnumC1120860fH2;
import X.InterfaceC1078490eAh;
import X.InterfaceC1103130eoR;
import X.InterfaceC481170Itv;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS313S0200000_17 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        ((C1115020f7c) aObjectS313S0200000_17.l0).LIZ.NR((EmoteModel) aObjectS313S0200000_17.l1, (SpannableStringBuilder) obj);
        return null;
    }

    public static final Object invoke$1(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS313S0200000_17.l0;
        View view = (View) aObjectS313S0200000_17.l1;
        portraitAudienceInteractionFragment.D = true;
        if (portraitAudienceInteractionFragment.E != null) {
            portraitAudienceInteractionFragment.TU(view);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS313S0200000_17.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS313S0200000_17.l1;
        c1106110etF.getClass();
        c1106110etF.onClick(interfaceC1103130eoR.LJ());
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS313S0200000_17.l0;
        DataChannel dataChannel = (DataChannel) aObjectS313S0200000_17.l1;
        c1106110etF.getClass();
        if (((Integer) obj).intValue() == 2) {
            EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.BACKPACK_ACTIVATED_GIFTS;
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C785220UrA c785220UrA = new C785220UrA(c1106110etF.LL.LJ());
            c785220UrA.LJIJJ = "Must show bubble";
            c785220UrA.LJFF(C842240X2g.LIZ(c1106110etF.LLILZIL.getOwner().getAvatarMedium()));
            c785220UrA.LJJIII = true;
            c785220UrA.LJJIIJ = true;
            c785220UrA.LJ = new ACListenerS172S0000000_17(0);
            c1113800f5e.LJ(new C1119590fEz(c785220UrA), enumC1120860fH2, dataChannel);
        } else {
            EnumC1120860fH2 enumC1120860fH22 = EnumC1120860fH2.ANCHOR_PLAYBOOK_SETTING;
            C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
            C785230UrB c785230UrB = new C785230UrB(c1106110etF.LL.LJ());
            c785230UrB.LJIJJ = "Normal bubble";
            c785230UrB.LJ = new ACListenerS172S0000000_17(1);
            c1113800f5e2.LJ(new C785270UrF(c785230UrB), enumC1120860fH22, dataChannel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS313S0200000_17.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS313S0200000_17.l1;
        c1106110etF.getClass();
        if (!C924810aAp.LJ().LJIILIIL && c1106110etF.LLLI) {
            C20441214yg.LIZIZ("CoHostSuggestionToolTip", "Left multi-guest");
            c1106110etF.LIZJ(interfaceC1103130eoR.LJ());
            c1106110etF.LLLI = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS313S0200000_17.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS313S0200000_17.l1;
        c1106110etF.getClass();
        if (!((C974320bSg) obj).LIZIZ && c1106110etF.LLLI) {
            C20441214yg.LIZIZ("CoHostSuggestionToolTip", "Left cohost, in single live");
            c1106110etF.LIZJ(interfaceC1103130eoR.LJ());
            c1106110etF.LLLI = false;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("re-show the ongoing item: ");
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("GiftTrayMultiHost", C2188811AlT.LIZIZ(sbLIZ));
        if (obj != null) {
            ((Queue) aObjectS313S0200000_17.l1).add(obj);
        }
        MutableLiveData mutableLiveData = (MutableLiveData) aObjectS313S0200000_17.l0;
        Integer num = (Integer) mutableLiveData.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        mutableLiveData.setValue(Integer.valueOf(iIntValue + 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        ((C1115010f7b) aObjectS313S0200000_17.l0).LIZ.NR((EmoteModel) aObjectS313S0200000_17.l1, (SpannableStringBuilder) obj);
        return null;
    }

    public static final Object invoke$3(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS313S0200000_17.l0;
        IBannerService iBannerService = (IBannerService) aObjectS313S0200000_17.l1;
        C1077790e9Z c1077790e9Z = (C1077790e9Z) obj;
        if (absAudienceInteractionFragment.NS() && absAudienceInteractionFragment.LLJLL == null && c1077790e9Z.LIZIZ == EnumC1087640ePS.LEVEL_NORMAL) {
            absAudienceInteractionFragment.hS(iBannerService);
            return null;
        }
        return null;
    }

    public static final Object invoke$4(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS313S0200000_17.l0;
        View view = (View) aObjectS313S0200000_17.l1;
        portraitAudienceInteractionFragment.E = (C0II9) obj;
        if (portraitAudienceInteractionFragment.D) {
            portraitAudienceInteractionFragment.TU(view);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aObjectS313S0200000_17.l0;
        View view = (View) aObjectS313S0200000_17.l1;
        liveEmojiInputDialogFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            if (view.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view);
                C1114370f6Z.LJIIIIZZ(liveEmojiInputDialogFragment.LLILLL);
                C20441214yg.LJ("InputFragment", "Receive StarCommentEntranceVisibleEvent, true.");
            }
        } else {
            C786410Ut5.LJLLLLLL(8, view);
            C20441214yg.LJ("InputFragment", "Receive StarCommentEntranceVisibleEvent, false.");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS313S0200000_17.l0;
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS313S0200000_17.l1;
        if (!portraitAudienceInteractionFragment.LLZL.hasAttached) {
            interfaceC1078490eAh.invoke(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS313S0200000_17.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS313S0200000_17.l1;
        c1106110etF.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1106110etF.class.getSimpleName());
        sbLIZ.append("_guestClickEmptyContainer receive MultiGuestGuestShowSharePanelEvent");
        C20441214yg.LIZIZ("voice_chat", C2188811AlT.LIZIZ(sbLIZ));
        c1106110etF.LLJJJJ = true;
        c1106110etF.onClick(interfaceC1103130eoR.LJ());
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS313S0200000_17.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS313S0200000_17.l1;
        c1106110etF.getClass();
        c1106110etF.onClick(interfaceC1103130eoR.LJ());
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS313S0200000_17 aObjectS313S0200000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS313S0200000_17.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS313S0200000_17.l1;
        c1106110etF.LLLIIII = (InterfaceC481170Itv) obj;
        c1106110etF.onClick(interfaceC1103130eoR.LJ());
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS313S0200000_17(Object obj, MutableLiveData<Integer> mutableLiveData, Queue<C1135810ff9> queue) {
        this.$t = queue;
        this.l0 = obj;
        this.l1 = mutableLiveData;
    }
}
