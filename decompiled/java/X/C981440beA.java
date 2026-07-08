package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0beA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981440beA extends AbstractC981450beB<InterfaceC981630beT> {
    @Override // X.AbstractC981450beB
    public final Set LJJIFFI() {
        return C093Y.LIZJ(EnumC974260bSa.RECEIVED, EnumC974260bSa.ACCEPTED);
    }

    public static EnumC975850bV9 LJJJJJL(EnumC981560beM enumC981560beM) {
        switch (C981430be9.LIZIZ[enumC981560beM.ordinal()]) {
            case 1:
                return EnumC975850bV9.INVITEE_REJECT_BUTTON_CLICK;
            case 2:
                return EnumC975850bV9.HOSTS_LIST_CHANGED;
            case 3:
                return EnumC975850bV9.HOSTS_GUEST_CHANGED;
            case 4:
                return EnumC975850bV9.INVITEE_TIMEOUT;
            case 5:
            case 6:
            case 7:
                return EnumC975850bV9.INVITEE_GAME_UNAVAILABLE;
            case 8:
                return EnumC975850bV9.IN_GIFT_ARENA;
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        if (abstractC982800bgM instanceof C982480bfq) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveMessage");
            sbLIZ.append(", receive another invite again, message=");
            sbLIZ.append(abstractC982800bgM);
            C20441214yg.LJ("CompetitionStateInvitee", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (abstractC982800bgM instanceof C983020bgi) {
            InterfaceC981630beT interfaceC981630beT = (InterfaceC981630beT) LJJII();
            if (interfaceC981630beT != null) {
                interfaceC981630beT.LJIL(abstractC982800bgM);
            }
            AbstractC981450beB.LJJIZ(this, EnumC975850bV9.CANCEL_MESSAGE, abstractC982800bgM, 4);
            return;
        }
        boolean z = true;
        boolean z2 = false;
        if (abstractC982800bgM instanceof C982450bfn) {
            C982450bfn c982450bfn = (C982450bfn) abstractC982800bgM;
            if (c982450bfn.LJFF == EnumC982740bgG.REMATCH) {
                z2 = true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleAcceptMsg isRematch:");
            sbLIZ2.append(z2);
            C20441214yg.LIZIZ("CompetitionStateInvitee", C2188811AlT.LIZIZ(sbLIZ2));
            new C974560bT4().LJJIFFI(c982450bfn);
            if (c982450bfn.LJIIIZ == EnumC974260bSa.START) {
                LJJJJL(c982450bfn, 1);
            }
            InterfaceC981630beT interfaceC981630beT2 = (InterfaceC981630beT) LJJII();
            if (interfaceC981630beT2 == null) {
                return;
            }
            interfaceC981630beT2.LJIILJJIL(c982450bfn);
            return;
        }
        if (abstractC982800bgM instanceof C982870bgT) {
            InterfaceC981630beT interfaceC981630beT3 = (InterfaceC981630beT) LJJII();
            if (interfaceC981630beT3 != null) {
                C982870bgT c982870bgT = (C982870bgT) abstractC982800bgM;
                if (this.LIZIZ != EnumC974260bSa.ACCEPTED) {
                    z = false;
                }
                interfaceC981630beT3.LJJIJIIJI(c982870bgT, z);
            }
            AbstractC981450beB.LJJIZ(this, EnumC975850bV9.REJECT_MESSAGE, abstractC982800bgM, 4);
            return;
        }
        if (abstractC982800bgM instanceof C982470bfp) {
            LJJJJL(abstractC982800bgM, 0);
        } else {
            super.LIZ(abstractC982800bgM);
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZJ(EnumC975850bV9 enumC975850bV9) {
        boolean z;
        EnumC962960bAM enumC962960bAM;
        String strLIZ;
        AbstractC982800bgM abstractC982800bgM;
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stateDidEnter");
        sbLIZ.append(", fromSource=");
        sbLIZ.append(enumC975850bV9);
        C20441214yg.LIZIZ("CompetitionStateInvitee", C2188811AlT.LIZIZ(sbLIZ));
        super.LIZJ(enumC975850bV9);
        EnumC975850bV9 enumC975850bV92 = EnumC975850bV9.INVITER_MEANWHILE_AUTO_ACCEPT;
        if (enumC975850bV9 == enumC975850bV92) {
            z = true;
        } else {
            z = false;
        }
        if (!LJJJJLI(true, z)) {
            return;
        }
        AbstractC982800bgM abstractC982800bgM2 = this.LIZJ;
        if (abstractC982800bgM2 != null) {
            LJJJJIZL(abstractC982800bgM2);
        }
        C961300b7g.LIZ.getClass();
        C961300b7g.LIZIZ("");
        AbstractC982800bgM abstractC982800bgM3 = this.LIZJ;
        if (abstractC982800bgM3 != null) {
            enumC962960bAM = abstractC982800bgM3.LIZJ.LIZ;
        } else {
            enumC962960bAM = null;
        }
        String str = "";
        if (enumC962960bAM == null) {
            strLIZ = "";
        } else {
            C962950bAL c962950bAL = EnumC962960bAM.Companion;
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c962950bAL.getClass();
            strLIZ = C962950bAL.LIZ(enumC962960bAM, size);
            int i = C981430be9.LIZ[enumC962960bAM.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str = "catch_bean";
                }
            } else {
                str = "take_stage";
            }
        }
        if ((enumC975850bV9 == EnumC975850bV9.INVITE_MESSAGE || enumC975850bV9 == EnumC975850bV9.INVITER_MEANWHILE || enumC975850bV9 == enumC975850bV92) && (abstractC982800bgM = this.LIZJ) != null && (abstractC982800bgM instanceof C982480bfq)) {
            C973690bRf c973690bRf = C973690bRf.LIZ;
            long j = abstractC982800bgM.LIZJ.LIZJ;
            C982480bfq c982480bfq = (C982480bfq) abstractC982800bgM;
            long j2 = c982480bfq.LJI;
            boolean zIsRematch = c982480bfq.LJFF.isRematch();
            C158B.LIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("pk_id", String.valueOf(j));
            linkedHashMap.put("pk_inviter_id", String.valueOf(j2));
            linkedHashMap.put("pk_invitee_id", String.valueOf(C950220apo.LJ()));
            String str2 = "1";
            if (zIsRematch) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_oncemore", obj);
            C973690bRf.LJIIIIZZ(linkedHashMap, false);
            linkedHashMap.put("connection_type", str);
            C973690bRf.LJIIL(strLIZ, linkedHashMap);
            C973690bRf.LJIIIZ(linkedHashMap, false);
            C973690bRf.LIZLLL(c973690bRf, linkedHashMap, true, false, 4);
            C973690bRf.LJ(linkedHashMap, null, false);
            C955520ayM.LIZLLL(linkedHashMap);
            if (!C915980Zwa.LIZLLL().L6()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enlarge_mode", str2);
            C973690bRf.LJJIJIIJIL(12, c973690bRf, "livesdk_connection_invited_received", linkedHashMap, false);
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJI(EnumC975850bV9 enumC975850bV9) {
        String str;
        super.LJI(enumC975850bV9);
        if (enumC975850bV9 != EnumC975850bV9.INVITEE_ACCEPT_BUTTON_CLICK) {
            switch (C981430be9.LIZJ[enumC975850bV9.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    str = "active";
                    break;
                case 6:
                    str = "cancelled";
                    break;
                case 7:
                    str = "reject_by_other";
                    break;
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                    str = "cohost_end";
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    str = "time_out";
                    break;
                default:
                    str = "";
                    break;
            }
            InterfaceC981630beT interfaceC981630beTLJJII = LJJII();
            if (interfaceC981630beTLJJII != null) {
                interfaceC981630beTLJJII.LJJI(str);
            }
            InterfaceC981630beT interfaceC981630beTLJJII2 = LJJII();
            if (interfaceC981630beTLJJII2 != null) {
                interfaceC981630beTLJJII2.LIZIZ();
            }
        }
        InterfaceC981630beT interfaceC981630beTLJJII3 = LJJII();
        if (interfaceC981630beTLJJII3 != null) {
            interfaceC981630beTLJJII3.LJJI(enumC975850bV9.getSource());
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJII(long j) {
        super.LJII(j);
        InterfaceC981630beT interfaceC981630beTLJJII = LJJII();
        if (interfaceC981630beTLJJII != null) {
            interfaceC981630beTLJJII.LJIIJJI();
        }
        AbstractC981450beB.LJJIZ(this, EnumC975850bV9.INVITEE_LEAVE_COHOST, null, 6);
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJIILJJIL(boolean z) {
        if (z) {
            InterfaceC981630beT interfaceC981630beTLJJII = LJJII();
            if (interfaceC981630beTLJJII != null) {
                interfaceC981630beTLJJII.LJI();
            }
            InterfaceC981630beT interfaceC981630beTLJJII2 = LJJII();
            if (interfaceC981630beTLJJII2 != null) {
                interfaceC981630beTLJJII2.LJJI("onHostWithGuestsModeChanged");
            }
            AbstractC981450beB.LJJIZ(this, EnumC975850bV9.INVITEE_LEAVE_COHOST, null, 6);
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LIZIZ(EnumC962960bAM enumC962960bAM, String str) {
        super.LIZIZ(enumC962960bAM, str);
        LJJJJLI(false, false);
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJFF(long j, String str) {
        super.LJFF(j, str);
        InterfaceC981630beT interfaceC981630beTLJJII = LJJII();
        if (interfaceC981630beTLJJII != null) {
            interfaceC981630beTLJJII.LJIIJJI();
        }
        InterfaceC981630beT interfaceC981630beTLJJII2 = LJJII();
        if (interfaceC981630beTLJJII2 != null) {
            interfaceC981630beTLJJII2.LJJI("onUserLeft");
        }
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJIILIIL(EnumC962960bAM enumC962960bAM, int i) {
        super.LJIILIIL(enumC962960bAM, i);
        LJJJJLI(false, false);
    }

    public final void LJJJJL(AbstractC982800bgM abstractC982800bgM, int i) {
        boolean z;
        if (abstractC982800bgM instanceof C982470bfp) {
            if (((C982470bfp) abstractC982800bgM).LJFF == EnumC982740bgG.REMATCH) {
                z = true;
            } else {
                z = false;
            }
            C970290bMB c970290bMB = C970290bMB.LIZ;
            C970290bMB.LJIIZILJ(abstractC982800bgM.LIZJ.LIZJ, "open_message", true, z);
            if (i == 0) {
                AbstractC981450beB.LJJJJI(this, EnumC975850bV9.OPEN_MESSAGE, abstractC982800bgM, null, 4);
            }
        }
        if ((abstractC982800bgM instanceof C982450bfn) && i == 1) {
            AbstractC981450beB.LJJJJI(this, EnumC975850bV9.ACCEPT_MESSAGE, abstractC982800bgM, null, 4);
        }
    }

    public final boolean LJJJJLI(boolean z, boolean z2) {
        C982480bfq c982480bfq;
        AbstractC982800bgM abstractC982800bgM = this.LIZJ;
        if (abstractC982800bgM instanceof C982480bfq) {
            c982480bfq = (C982480bfq) abstractC982800bgM;
        } else {
            c982480bfq = null;
        }
        if (c982480bfq != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openInviteePanel");
            sbLIZ.append(", isInitialOpen=");
            sbLIZ.append(z);
            sbLIZ.append(", shouldAutoAccept=");
            sbLIZ.append(z2);
            C20441214yg.LIZIZ("CompetitionStateInvitee", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC981630beT interfaceC981630beTLJJII = LJJII();
            if (interfaceC981630beTLJJII != null) {
                interfaceC981630beTLJJII.LJIIZILJ(c982480bfq, z, z2, C500260Jjc.LJJJI(Boolean.valueOf(this.LIZ.d3())), new AwS559S0100000_15(this, 803), new AwS594S0100000_15(this, 782), new AwS594S0100000_15(this, 783), new AwS594S0100000_15(this, 784));
                return true;
            }
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("openInviteePanel");
        sbLIZ2.append(", triggerMessage is not CompetitionInviteMessage, triggerMessage=");
        sbLIZ2.append(this.LIZJ);
        C20441214yg.LJ("CompetitionStateInvitee", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    public C981440beA(InterfaceC976620bWO interfaceC976620bWO, EnumC974260bSa enumC974260bSa, AbstractC982800bgM abstractC982800bgM) {
        super(interfaceC976620bWO, enumC974260bSa, abstractC982800bgM);
    }

    @Override // X.AbstractC981450beB, X.InterfaceC976690bWV
    public final void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
        super.LJIIIIZZ(i, i2, abnormalDisconnectReason);
        InterfaceC981630beT interfaceC981630beTLJJII = LJJII();
        if (interfaceC981630beTLJJII != null) {
            interfaceC981630beTLJJII.LJIIJJI();
        }
        InterfaceC981630beT interfaceC981630beTLJJII2 = LJJII();
        if (interfaceC981630beTLJJII2 != null) {
            interfaceC981630beTLJJII2.LJJI("onLinkMicFinish");
        }
        AbstractC981450beB.LJJIZ(this, EnumC975850bV9.INVITEE_LEAVE_COHOST, null, 6);
    }
}
