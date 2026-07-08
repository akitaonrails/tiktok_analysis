package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.template.TemplateOperationData;

/* JADX INFO: renamed from: X.0L9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538490L9z {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        String str;
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        C0L62.LIZ.getClass();
        TemplateOperationData templateOperationDataLIZJ = C0L62.LIZJ();
        if (templateOperationDataLIZJ == null || (str = templateOperationDataLIZJ.activityId) == null) {
            str = "@@";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(currentUserID);
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(long j) {
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ());
        sbLIZ.append("auto_cut_album_button_show_time");
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }

    public static void LJ(long j) {
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ());
        sbLIZ.append("template_camera_tab_show_time");
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }

    public static String LIZIZ(C0L65 c0l65, String str) {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        C0L62.LIZ.getClass();
        String string = Keva.getRepo("template_operation").getString(C0L62.LJFF(c0l65, str), "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(currentUserID);
        sbLIZ.append('_');
        sbLIZ.append(string);
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(long j, String str) {
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ(C0L66.LIZ, str));
        sbLIZ.append("auto_cut_tab_show_time");
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }

    public static void LJFF(long j, String str) {
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ(C0L67.LIZ, str));
        sbLIZ.append("template_tab_show_time");
        repo.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
    }
}
