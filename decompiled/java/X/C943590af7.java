package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2NotifyCohostEndOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.DisabledMatchTypesParams;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPermissionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0af7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943590af7 {
    public static int LIZ;
    public static boolean LIZIZ;

    public static boolean LIZIZ() {
        boolean z;
        DisabledMatchTypesParams value;
        HashMap<Integer, ArrayList<Integer>> map;
        ArrayList<Integer> arrayList;
        boolean z2 = false;
        if (C970370bMJ.LJI()) {
            EnumC962960bAM enumC962960bAMDn0 = C915980Zwa.LIZIZ().Dn0();
            if (enumC962960bAMDn0 == EnumC962960bAM.UNKNOWN) {
                C962950bAL c962950bAL = EnumC962960bAM.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                c962950bAL.getClass();
                enumC962960bAMDn0 = C962950bAL.LIZLLL(enumC919170a1jXB0);
            }
            if (C970370bMJ.LIZLLL() || (value = LiveMatchPermissionSetting.INSTANCE.getValue()) == null || (map = value.disabledMatchTypesForLinkerMode) == null || (arrayList = map.get(3)) == null) {
                z = true;
            } else {
                Iterator<Integer> it2 = arrayList.iterator();
                z = true;
                while (it2.hasNext()) {
                    int iIntValue = it2.next().intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleCompetitionStatus: type: ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(" bizType?.type: ");
                    sbLIZ.append(enumC962960bAMDn0 != null ? Integer.valueOf(enumC962960bAMDn0.getType()) : null);
                    C20441214yg.LIZIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ));
                    if (enumC962960bAMDn0.getType() == iIntValue) {
                        z = false;
                    }
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleCompetitionStatus: final enable: ");
            sbLIZ2.append(z);
            sbLIZ2.append(", is1V1Match = ");
            sbLIZ2.append(C970370bMJ.LIZLLL());
            sbLIZ2.append(", bizType = ");
            sbLIZ2.append(enumC962960bAMDn0);
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ2));
            if (!z) {
                z2 = true;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("isMatchOngoingAndNotAllowGuest: ");
        sbLIZ3.append(z2);
        C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ3));
        return z2;
    }

    public static int LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStateWhenNewMgStarted");
        sbLIZ.append(", linkedHostCount=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ));
        if (i < 2) {
            return 0;
        }
        if (LIZIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getStateWhenNewMgStarted");
            sbLIZ2.append(", competition_check=false");
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ2));
            return 2;
        }
        if (i > 2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getStateWhenNewMgStarted");
            sbLIZ3.append(", host_size_check=false");
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ3));
            return 3;
        }
        if (!C948770anT.LIZIZ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getStateWhenNewMgStarted");
            sbLIZ4.append(", ab_check=false");
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ4));
            return 3;
        }
        return 1;
    }

    public static void LIZJ(String str, DataChannel dataChannel, InterfaceC954180awC interfaceC954180awC) {
        int size;
        List<LinkUser> listLJI;
        if (interfaceC954180awC != null && (listLJI = C948780anU.LJI(interfaceC954180awC)) != null) {
            size = listLJI.size();
        } else {
            size = 0;
        }
        LIZLLL(dataChannel, size, str);
    }

    public static boolean LIZLLL(DataChannel dataChannel, int i, String str) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notify");
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        sbLIZ.append(", linkedHostCount = ");
        sbLIZ.append(i);
        sbLIZ.append(", currentState=");
        sbLIZ.append(LIZ);
        C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ));
        if (!C948770anT.LJ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("notify");
            sbLIZ2.append(", main feature off");
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C931800aM6.LIZ.getClass();
        Boolean boolValueOf = null;
        if (C931800aM6.LIZIZ()) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null) {
                boolValueOf = Boolean.valueOf(C948780anU.LJIIL(interfaceC954180awCLJIIIZ));
            }
            boolean zLIZIZ = C176600m4.LIZIZ(boolValueOf);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("notify");
            sbLIZ3.append(", notify, phase 2, isInCohost=");
            sbLIZ3.append(zLIZIZ);
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ3));
            if (!zLIZIZ) {
                if (CohostWithGuestPhase2NotifyCohostEndOpt.INSTANCE.isEnabled() && LIZ != 0) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("notify");
                    sbLIZ4.append(", onCohostEnd, state=");
                    sbLIZ4.append(LIZ);
                    C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ4));
                    LJ(0, 0, dataChannel, "onCohostEnd");
                    return true;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("notify");
                sbLIZ5.append(", skip notify, phase 2, in guest scene");
                C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ5));
                return false;
            }
        }
        boolean zLJI = C950220apo.LJI();
        if (CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting.INSTANCE.isEnabled() && zLJI && LIZIZ) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("notify");
            sbLIZ6.append(", skip notify, isAnchor && isCloseMGInProgressForAnchor");
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ6));
            return false;
        }
        if (!C948770anT.LIZJ(C950220apo.LJ())) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("notify");
            sbLIZ7.append(", skip notify, ab is not enabled for current room");
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ7));
            return false;
        }
        if (!zLJI && !CohostWithGuestAudienceSetting.INSTANCE.isEnabled()) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("notify");
            sbLIZ8.append(", skip notify, setting is not enabled for audience & guest");
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ8));
            return false;
        }
        if (LIZ == 0) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("getStateWhenNewMgNotStarted");
            sbLIZ9.append(", linkedHostCount=");
            sbLIZ9.append(i);
            C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ9));
            if (C931800aM6.LIZIZ()) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("getStateWhenNewMgNotStarted");
                sbLIZ10.append(", union_session=true");
                C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ10));
                numValueOf = Integer.valueOf(LIZ(i));
            } else {
                if (!C948770anT.LIZIZ()) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("getStateWhenNewMgNotStarted");
                    sbLIZ11.append(", not all anchors enabled");
                    C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ11));
                    return false;
                }
                if (i != 2) {
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("getStateWhenNewMgNotStarted");
                    sbLIZ12.append(", host count != 2");
                    C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ12));
                    return false;
                }
                if (LIZIZ()) {
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("getStateWhenNewMgNotStarted");
                    sbLIZ13.append(", not allowed in current competition");
                    C20441214yg.LJIIIZ("NotifyMG", C2188811AlT.LIZIZ(sbLIZ13));
                    return false;
                }
                numValueOf = 1;
            }
        } else {
            numValueOf = Integer.valueOf(LIZ(i));
        }
        if (numValueOf != null) {
            return LJ(numValueOf.intValue(), i, dataChannel, str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(int r25, int r26, com.bytedance.ies.sdk.datachannel.DataChannel r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C943590af7.LJ(int, int, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):boolean");
    }
}
