package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchThreePlayerEncouragementCapsuleDailyMax;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchThreePlayerEncouragementCapsuleMaxIgnored;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchThreePlayerEncouragementCapsulePerLiveMax;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964140bCG implements InterfaceC1112400f3O {
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

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
        FragmentManager fragmentManager;
        C1109770ez9 c1109770ez9LLIIIILZ = c1112330f3H.LLIIIILZ();
        EnumC944980ahM enumC944980ahMLLIIJI = C915980Zwa.LJI().LIZ().LLIIJI();
        String str = ((CapsuleMessage) c1112330f3H.LJIL).scene;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleClick, state = ");
        sbLIZ.append(enumC944980ahMLLIIJI);
        C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJI().LIZ().LLILZIL("pk_guide");
        C973660bRc.LJJZ = "click_match_guide";
        LIZJ(c1112330f3H, false);
        if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "triple-cohost-encouragement") && C915980Zwa.LJII().LLI() == EnumC950120ape.Linked && !C915980Zwa.LJFF().co0() && C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE && C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_CATCH_BEANS) {
            long jLJIIL = C930540aK4.LJIIL();
            C20337914i1<Map<Long, Integer>> c20337914i1 = InterfaceC1104970erP.L2;
            Map<Long, Integer> mapLIZIZ = c20337914i1.LIZIZ();
            mapLIZIZ.put(Long.valueOf(jLJIIL), 0);
            c20337914i1.LJFF(mapLIZIZ);
            C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", "TRIPLE_CO_HOST_ENCOURAGEMENT click!");
        }
        int i = -1;
        if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "match_ai_commentary_guide")) {
            if (!C915980Zwa.LJFF().RY(false).isIdle()) {
                if (C915980Zwa.LJ().jG()) {
                    C766270U4b.LIZLLL(2131853690);
                    C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.BLOCKED, "ai_commentary_already_on");
                    return false;
                }
                DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                    Context context = c1109770ez9LLIIIILZ.LIZ;
                    List listLJIIJJI = C1697810uHb.LJIIJJI(C497740JfY.LJIJI(2131853715), C497740JfY.LJIJI(2131853716));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int size = listLJIIJJI.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        spannableStringBuilder.append((CharSequence) "• ");
                        spannableStringBuilder.append((CharSequence) ListProtector.get(listLJIIJJI, i2));
                        if (i2 != listLJIIJJI.size() - 1) {
                            spannableStringBuilder.append('\n');
                        }
                    }
                    C1845100y7A.LIZIZ(context, fragmentManager, new C1845110y7B(spannableStringBuilder, new C1845120y7C(C497740JfY.LJIJI(2131853722), new AwS629S0100000_15(c1109770ez9LLIIIILZ, 78), true), new C1845120y7C(C497740JfY.LJIJI(2131853719), AFwS299S0000000_15.get$arr$(32), true), "ai_capsule_guide", c1109770ez9LLIIIILZ.LJIIIZ, "show_turn_on_button", "turn_on", "close"));
                }
                C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.CONTINUE, null);
                return false;
            }
            C766270U4b.LIZLLL(2131853698);
            C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.BLOCKED, "match_over");
            return false;
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).AE2()) {
            C766270U4b.LIZLLL(2131853126);
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            EnumC973450bRH enumC973450bRH = EnumC973450bRH.COHOST_MODE_SCREEN_SHARE;
            C974540bT2.LLFII(enumC973450bRH, EnumC974510bSz.CAPSULE, 12);
            c974540bT2.LJJJJJ(str, EnumC964160bCI.BLOCKED, enumC973450bRH.getReason());
            return false;
        }
        if (enumC944980ahMLLIIJI == EnumC944980ahM.CONNECTION_SUCCEED) {
            String str2 = ((CapsuleMessage) c1112330f3H.LJIL).scene;
            switch (str2.hashCode()) {
                case -1992036877:
                    if (str2.equals("match-rule-guide")) {
                        i = 4;
                    }
                    break;
                case -1222220224:
                    if (str2.equals("match-invite-guide")) {
                        i = 0;
                    }
                    break;
                case -561887615:
                    if (str2.equals("triple-cohost-encouragement")) {
                        i = 6;
                    }
                    break;
                case 1328763988:
                    if (str2.equals("match-multi-invite-guide")) {
                        i = 5;
                    }
                    break;
            }
            C784440Upu.LIZ().LIZIZ(new C964150bCH(i));
            C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.CONTINUE, null);
            return false;
        }
        if (C915980Zwa.LJIIIZ().Jf()) {
            if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "triple-cohost-encouragement")) {
                C766270U4b.LIZLLL(2131853314);
            } else {
                C766270U4b.LIZLLL(2131841103);
            }
            C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.BLOCKED, "quick_cohost");
            return false;
        }
        if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "triple-cohost-encouragement")) {
            C766270U4b.LIZLLL(2131853314);
            C974540bT2.LIZ.LJJJJJ(str, EnumC964160bCI.BLOCKED, "in_match");
            return false;
        }
        String value = EnumC973640bRa.PK_GUIDE.getValue();
        AwS164S1100000_15 awS164S1100000_15 = new AwS164S1100000_15(c1109770ez9LLIIIILZ, value, 9);
        int i3 = C945030ahR.LIZ[EnumC944990ahN.AVAILABLE.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            awS164S1100000_15.invoke();
            C973660bRc.LIZ.LJL(value, false, C915980Zwa.LJI().LIZ().LJIILLIIL());
            C974540bT2 c974540bT22 = C974540bT2.LIZ;
            EnumC973450bRH enumC973450bRH2 = EnumC973450bRH.NON_CONNECTION;
            C974540bT2.LLFII(enumC973450bRH2, EnumC974510bSz.CAPSULE, 12);
            c974540bT22.LJJJJJ(str, EnumC964160bCI.BLOCKED, enumC973450bRH2.getReason());
            return false;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
        LIZJ(c1112330f3H, true);
        C974540bT2.LIZ.LJJJJJL(((CapsuleMessage) c1112330f3H.LJIL).scene);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_host_notice");
        c474500IjALIZ.LJIJJLI(c1112330f3H.LLIIIILZ().LJIIIZ);
        c474500IjALIZ.LJJII("show", "event_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1112330f3H r5, boolean r6) {
        /*
            boolean r0 = r5.LLIILII()
            if (r0 == 0) goto L29
            MESSAGE extends X.0ffY r0 = r5.LJIL
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            java.lang.String r1 = r0.scene
            int r0 = r1.hashCode()
            r2 = 0
            switch(r0) {
                case -1992036877: goto L53;
                case -1318816605: goto L48;
                case -1222220224: goto L3e;
                case -561887615: goto L34;
                case 1328763988: goto L2a;
                default: goto L14;
            }
        L14:
            r4 = -1
        L15:
            if (r6 == 0) goto L5d
            X.0bRc r3 = X.C973660bRc.LIZ
            MESSAGE extends X.0ffY r0 = r5.LJIL
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            java.lang.String r2 = r0.scene
            X.0ez9 r0 = r5.LLIIIILZ()
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJIIIZ
            r0 = 1
            r3.LJLIIIL(r4, r1, r2, r0)
        L29:
            return
        L2a:
            java.lang.String r0 = "match-multi-invite-guide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r4 = 5
            goto L15
        L34:
            java.lang.String r0 = "triple-cohost-encouragement"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r4 = 6
            goto L15
        L3e:
            java.lang.String r0 = "match-invite-guide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r4 = 0
            goto L15
        L48:
            java.lang.String r0 = "match_ai_commentary_guide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r4 = 8
            goto L15
        L53:
            java.lang.String r0 = "match-rule-guide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r4 = 4
            goto L15
        L5d:
            X.0bRc r3 = X.C973660bRc.LIZ
            MESSAGE extends X.0ffY r0 = r5.LJIL
            com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
            java.lang.String r1 = r0.scene
            X.0ez9 r0 = r5.LLIIIILZ()
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.LJIIIZ
            r3.LJLIIIL(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C964140bCG.LIZJ(X.0f3H, boolean):void");
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("filter, message.scene = ");
        sbLIZ.append(capsuleMessage.scene);
        C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(capsuleMessage.scene, "match-rule-guide")) {
            return true;
        }
        if (!Intrinsics.LJFF(capsuleMessage.scene, "match-invite-guide") && !Intrinsics.LJFF(capsuleMessage.scene, "match-multi-invite-guide")) {
            if (Intrinsics.LJFF(capsuleMessage.scene, "triple-cohost-encouragement")) {
                long jLJIIL = C930540aK4.LJIIL();
                try {
                    C20337914i1<Map<Long, Integer>> c20337914i1 = InterfaceC1104970erP.L2;
                    Map<Long, Integer> mapLIZIZ = c20337914i1.LIZIZ();
                    Integer num = mapLIZIZ.get(Long.valueOf(jLJIIL));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int value = LiveMatchThreePlayerEncouragementCapsuleMaxIgnored.INSTANCE.getValue();
                    if (iIntValue >= value) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("max ignored value hit!, maxIgnoreValue = ");
                        sbLIZ2.append(value);
                        C20441214yg.LJ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ2));
                        return true;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(new SimpleDateFormat("yyMMdd").format(new Date()));
                    sbLIZ3.append('_');
                    sbLIZ3.append(jLJIIL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    C20337914i1<Map<String, Integer>> c20337914i12 = InterfaceC1104970erP.N2;
                    Map<String, Integer> mapLIZIZ2 = c20337914i12.LIZIZ();
                    Integer num2 = mapLIZIZ2.get(strLIZIZ);
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    LiveMatchThreePlayerEncouragementCapsuleDailyMax liveMatchThreePlayerEncouragementCapsuleDailyMax = LiveMatchThreePlayerEncouragementCapsuleDailyMax.INSTANCE;
                    if (iIntValue2 >= liveMatchThreePlayerEncouragementCapsuleDailyMax.getValue()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("daily max hit!, LiveMatchThreePlayerEncouragementCapsuleDailyMax.getValue() = ");
                        sbLIZ4.append(liveMatchThreePlayerEncouragementCapsuleDailyMax.getValue());
                        C20441214yg.LJ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ4));
                        return true;
                    }
                    C20337914i1<Map<String, Integer>> c20337914i13 = InterfaceC1104970erP.M2;
                    Map<String, Integer> mapLIZIZ3 = c20337914i13.LIZIZ();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(C930540aK4.LJIIJ());
                    sbLIZ5.append('_');
                    sbLIZ5.append(jLJIIL);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                    Integer num3 = mapLIZIZ3.get(strLIZIZ2);
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    LiveMatchThreePlayerEncouragementCapsulePerLiveMax liveMatchThreePlayerEncouragementCapsulePerLiveMax = LiveMatchThreePlayerEncouragementCapsulePerLiveMax.INSTANCE;
                    if (iIntValue3 >= liveMatchThreePlayerEncouragementCapsulePerLiveMax.getValue()) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("per live count max hit!, LiveMatchThreePlayerEncouragementCapsulePerLiveMax.getValue() = ");
                        sbLIZ6.append(liveMatchThreePlayerEncouragementCapsulePerLiveMax.getValue());
                        C20441214yg.LJ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ6));
                        return true;
                    }
                    Long lValueOf = Long.valueOf(jLJIIL);
                    Integer num4 = mapLIZIZ.get(Long.valueOf(jLJIIL));
                    if (num4 != null) {
                        iIntValue4 = num4.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    mapLIZIZ.put(lValueOf, Integer.valueOf(iIntValue4 + 1));
                    c20337914i1.LJFF(mapLIZIZ);
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("current user's max show count = ");
                    sbLIZ7.append(mapLIZIZ.get(Long.valueOf(jLJIIL)));
                    C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ7));
                    Integer num5 = mapLIZIZ2.get(strLIZIZ);
                    if (num5 != null) {
                        iIntValue5 = num5.intValue();
                    } else {
                        iIntValue5 = 0;
                    }
                    mapLIZIZ2.put(strLIZIZ, Integer.valueOf(iIntValue5 + 1));
                    c20337914i12.LJFF(mapLIZIZ2);
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("current daily show count = ");
                    sbLIZ8.append(mapLIZIZ2.get(strLIZIZ));
                    sbLIZ8.append(", dateStringWithUserId = ");
                    sbLIZ8.append(strLIZIZ);
                    C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ8));
                    Integer num6 = mapLIZIZ3.get(strLIZIZ2);
                    if (num6 != null) {
                        iIntValue6 = num6.intValue();
                    } else {
                        iIntValue6 = 0;
                    }
                    mapLIZIZ3.put(strLIZIZ2, Integer.valueOf(iIntValue6 + 1));
                    c20337914i13.LJFF(mapLIZIZ3);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("current per live show count = ");
                    Integer num7 = mapLIZIZ3.get(strLIZIZ2);
                    if (num7 != null) {
                        iIntValue7 = num7.intValue();
                    } else {
                        iIntValue7 = 0;
                    }
                    sbLIZ9.append(iIntValue7);
                    sbLIZ9.append(", roomIdWithUserId = ");
                    sbLIZ9.append(strLIZIZ2);
                    C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", C2188811AlT.LIZIZ(sbLIZ9));
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_triple_cohost_encouragement_error");
                    c474500IjALIZ.LJJII(e.getMessage(), "exception");
                    c474500IjALIZ.LJJII(1, Scene.SCENE_SERVICE);
                    c474500IjALIZ.LIZ();
                    return true;
                }
            }
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).AE2()) {
                C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", "ServiceManager.getService(IInteractService::class.java).isInScreenShareCoHost()");
                return true;
            }
            if (!Intrinsics.LJFF(capsuleMessage.scene, "match-rule-guide")) {
                return false;
            }
            try {
                if (capsuleMessage.desc != null) {
                    if (capsuleMessage.buttonText != null) {
                        if (capsuleMessage.schema != null) {
                            if (InterfaceC1106030et7.a5.LIZIZ().booleanValue()) {
                                return false;
                            }
                            throw new IllegalStateException("Check failed.");
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return true;
            } catch (IllegalStateException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return true;
            }
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
        } catch (IllegalArgumentException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return true;
        }
    }
}
