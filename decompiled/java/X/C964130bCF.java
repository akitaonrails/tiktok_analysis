package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bCF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964130bCF implements InterfaceC1112400f3O {
    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return C952230at3.LIZ();
    }

    public static final int LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getScene: scene ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LinkCompetitionGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(str, "catch-bean-invite-guide")) {
            return 7;
        }
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
        C1109770ez9 c1109770ez9LLIIIILZ = c1112330f3H.LLIIIILZ();
        EnumC944980ahM enumC944980ahMLLIIJI = C915980Zwa.LJI().LIZ().LLIIJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleClick, scene: ");
        sbLIZ.append(((CapsuleMessage) c1112330f3H.LJIL).scene);
        sbLIZ.append(",  state = ");
        sbLIZ.append(enumC944980ahMLLIIJI);
        C20441214yg.LIZIZ("LinkCompetitionGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ));
        C973660bRc.LIZ.LJLIIIL(LIZJ(((CapsuleMessage) c1112330f3H.LJIL).scene), c1112330f3H.LLIIIILZ().LJIIIZ, ((CapsuleMessage) c1112330f3H.LJIL).scene, false);
        String str = ((CapsuleMessage) c1112330f3H.LJIL).scene;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            C766270U4b.LIZLLL(2131851537);
            C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.BLOCKED, "multi_guest");
            return false;
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).AE2()) {
            C766270U4b.LIZLLL(2131851533);
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            EnumC973450bRH enumC973450bRH = EnumC973450bRH.COHOST_MODE_SCREEN_SHARE;
            C974540bT2.LLFII(enumC973450bRH, EnumC974510bSz.CAPSULE, 12);
            c974540bT2.LJJJJJ(str, EnumC964160bCI.BLOCKED, enumC973450bRH.getReason());
            return false;
        }
        if (enumC944980ahMLLIIJI == EnumC944980ahM.CONNECTION_SUCCEED) {
            if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "catch-bean-invite-guide")) {
                if (C975140bU0.LIZIZ(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, AFwS250S0000000_15.get$arr$(98))) {
                    C20441214yg.LJIIIZ("LinkCompetitionGuideCapsuleHandler", "handleCatchBeanInviteClick: isCompetitionUnavailable");
                } else {
                    C784440Upu.LIZ().LIZIZ(new C964150bCH(7));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleClick: no scene ");
                sbLIZ2.append(((CapsuleMessage) c1112330f3H.LJIL).scene);
                C20441214yg.LJIIIZ("LinkCompetitionGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.CONTINUE, null);
            return false;
        }
        if (C915980Zwa.LJIIIZ().Jf()) {
            C766270U4b.LIZLLL(2131841103);
            C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.BLOCKED, "quick_cohost");
            return false;
        }
        C974540bT2 c974540bT22 = C974540bT2.LIZ;
        EnumC973450bRH enumC973450bRH2 = EnumC973450bRH.NON_CONNECTION;
        C974540bT2.LLFII(enumC973450bRH2, EnumC974510bSz.CAPSULE, 12);
        c974540bT22.LJJJJJ(str, EnumC964160bCI.BLOCKED, enumC973450bRH2.getReason());
        AwS164S1100000_15 awS164S1100000_15 = new AwS164S1100000_15(c1109770ez9LLIIIILZ, EnumC973640bRa.CATCH_BEANS_GUIDE_CAPSULE.getValue(), 5);
        int i = C945020ahQ.LIZ[EnumC944990ahN.AVAILABLE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    awS164S1100000_15.invoke();
                    return false;
                }
                throw new C1954807lC();
            }
            awS164S1100000_15.invoke();
            return false;
        }
        awS164S1100000_15.invoke();
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstBind: isAnchor ");
        sbLIZ.append(c1112330f3H.LLIILII());
        sbLIZ.append(", scene: ");
        sbLIZ.append(((CapsuleMessage) c1112330f3H.LJIL).scene);
        C20441214yg.LIZIZ("LinkCompetitionGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ));
        C973660bRc.LIZ.LJLIIIL(LIZJ(((CapsuleMessage) c1112330f3H.LJIL).scene), c1112330f3H.LLIIIILZ().LJIIIZ, ((CapsuleMessage) c1112330f3H.LJIL).scene, true);
        C974540bT2.LIZ.LJJJJJL(((CapsuleMessage) c1112330f3H.LJIL).scene);
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filter, message.scene = ");
        sbLIZ.append(capsuleMessage.scene);
        C20441214yg.LIZIZ("LinkCompetitionGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(capsuleMessage.scene, "catch-bean-invite-guide")) {
            return false;
        }
        try {
            if (capsuleMessage.desc != null) {
                if (capsuleMessage.buttonText != null) {
                    if (capsuleMessage.icon != null) {
                        return false;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("filter, message.desc = ");
            sbLIZ2.append(capsuleMessage.desc);
            sbLIZ2.append(", message.buttonText = ");
            sbLIZ2.append(capsuleMessage.buttonText);
            sbLIZ2.append(", message.icon = ");
            sbLIZ2.append(capsuleMessage.icon);
            C20441214yg.LJIIIZ("LinkCompetitionGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
    }
}
