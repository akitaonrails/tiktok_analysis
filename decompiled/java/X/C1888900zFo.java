package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.InteractionVideoCount;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.NoPAControlSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888900zFo {
    public static final InterfaceC1519050pdH LIZ = C100C.LIZ.LJFF().LIZ(1, "privacy_setting");
    public static Boolean LIZIZ;
    public static InteractionVideoCount LIZJ;
    public static NoPAControlSettings LIZLLL;

    public static NoPAControlSettings LIZ() {
        if (LIZLLL == null) {
            NoPAControlSettings noPAControlSettings = null;
            try {
                InterfaceC1519050pdH interfaceC1519050pdH = LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("privacy_user_no_pa_settings_");
                InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
                sbLIZ.append(interfaceC1888940zFsLIZJ != null ? interfaceC1888940zFsLIZJ.LIZLLL() : null);
                noPAControlSettings = (NoPAControlSettings) GsonProtectorUtils.fromJson(C1703730uR9.LIZ(), interfaceC1519050pdH.getString(C2188811AlT.LIZIZ(sbLIZ)), NoPAControlSettings.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZLLL = noPAControlSettings;
        }
        return LIZLLL;
    }

    public static void LIZIZ(InteractionVideoCount interactionVideoCount) {
        if (Intrinsics.LJFF(interactionVideoCount, LIZJ)) {
            return;
        }
        LIZJ = interactionVideoCount;
        String strLIZLLL = null;
        if (interactionVideoCount == null) {
            InterfaceC1519050pdH interfaceC1519050pdH = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("privacy_user_interaction_video_count_");
            InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
            if (interfaceC1888940zFsLIZJ != null) {
                strLIZLLL = interfaceC1888940zFsLIZJ.LIZLLL();
            }
            sbLIZ.append(strLIZLLL);
            interfaceC1519050pdH.remove(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC1519050pdH interfaceC1519050pdH2 = LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("privacy_user_interaction_video_count_");
        InterfaceC1888940zFs interfaceC1888940zFsLIZJ2 = C191871104n.LIZJ();
        if (interfaceC1888940zFsLIZJ2 != null) {
            strLIZLLL = interfaceC1888940zFsLIZJ2.LIZLLL();
        }
        sbLIZ2.append(strLIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        String strLIZJ = C1888930zFr.LIZJ(interactionVideoCount);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        interfaceC1519050pdH2.putString(strLIZIZ, strLIZJ);
    }

    public static void LIZJ(NoPAControlSettings noPAControlSettings) {
        if (Intrinsics.LJFF(noPAControlSettings, LIZLLL)) {
            return;
        }
        LIZLLL = noPAControlSettings;
        String strLIZLLL = null;
        if (noPAControlSettings == null) {
            InterfaceC1519050pdH interfaceC1519050pdH = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("privacy_user_no_pa_settings_");
            InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
            if (interfaceC1888940zFsLIZJ != null) {
                strLIZLLL = interfaceC1888940zFsLIZJ.LIZLLL();
            }
            sbLIZ.append(strLIZLLL);
            interfaceC1519050pdH.remove(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC1519050pdH interfaceC1519050pdH2 = LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("privacy_user_no_pa_settings_");
        InterfaceC1888940zFs interfaceC1888940zFsLIZJ2 = C191871104n.LIZJ();
        if (interfaceC1888940zFsLIZJ2 != null) {
            strLIZLLL = interfaceC1888940zFsLIZJ2.LIZLLL();
        }
        sbLIZ2.append(strLIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        String strLIZJ = C1888930zFr.LIZJ(noPAControlSettings);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        interfaceC1519050pdH2.putString(strLIZIZ, strLIZJ);
    }
}
