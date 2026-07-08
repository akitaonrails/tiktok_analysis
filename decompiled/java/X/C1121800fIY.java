package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.PcsServicePlusALogEnableSetting;

/* JADX INFO: renamed from: X.0fIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121800fIY {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(C1121810fIZ c1121810fIZ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("useCreateInfo=");
        sbLIZ.append(c1121810fIZ.LIZ);
        sbLIZ.append(", useSmbQualification=");
        sbLIZ.append(c1121810fIZ.LIZIZ);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(c1121810fIZ.LIZJ);
        sbLIZ.append(", optInStatus=");
        sbLIZ.append(c1121810fIZ.LIZLLL);
        sbLIZ.append(", qualification=");
        sbLIZ.append(c1121810fIZ.LJ);
        sbLIZ.append(", revokeReason=");
        sbLIZ.append(c1121810fIZ.LJFF);
        sbLIZ.append(", isPendingRevoke=");
        sbLIZ.append(c1121810fIZ.LJI);
        sbLIZ.append(", isSmbDeactivated=");
        sbLIZ.append(c1121810fIZ.LJII);
        sbLIZ.append(", iconStatus=");
        sbLIZ.append(c1121810fIZ.LJIIIIZZ);
        sbLIZ.append(", revocationRestored=");
        sbLIZ.append(c1121810fIZ.LJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str, C1121810fIZ c1121810fIZ, String str2) {
        if (!PcsServicePlusALogEnableSetting.INSTANCE.getValue()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewServicePlusWidget entrance action=");
        sbLIZ.append(str);
        sbLIZ.append(", detail=");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        sbLIZ.append(LIZJ(c1121810fIZ));
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(String str, C1121810fIZ c1121810fIZ, String str2) {
        if (!PcsServicePlusALogEnableSetting.INSTANCE.getValue()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewServicePlusWidget smb_qualification_api stage=");
        sbLIZ.append(str);
        sbLIZ.append(", detail=");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        sbLIZ.append(LIZJ(c1121810fIZ));
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
    }
}
