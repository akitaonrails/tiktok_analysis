package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573990MfF {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) throws Throwable {
        String strLIZJ;
        ArrayList arrayList = new ArrayList();
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            for (ImportVideoInfo importVideoInfo : importInfoList) {
                if (importVideoInfo.getHypicDescription() != null) {
                    strLIZJ = importVideoInfo.getHypicDescription();
                } else {
                    String originImportPath = importVideoInfo.getOriginImportPath();
                    if (originImportPath == null && (originImportPath = importVideoInfo.getRealImportPath()) == null) {
                        originImportPath = "";
                    }
                    strLIZJ = LIZJ(originImportPath);
                }
                if (C123100dR.LIZ(strLIZJ)) {
                    arrayList.add(strLIZJ);
                }
            }
        }
        if (!videoPublishEditModel.getEditorProModel().getPipResourcePaths().isEmpty()) {
            Iterator<String> it2 = videoPublishEditModel.getEditorProModel().getPipResourcePaths().iterator();
            while (it2.hasNext()) {
                String strLIZJ2 = LIZJ(it2.next());
                if (C123100dR.LIZ(strLIZJ2)) {
                    arrayList.add(strLIZJ2);
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        return arrayList.toString();
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isCutSameVideoType()) {
            if ((!videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isPhotoMvMode()) && !videoPublishEditModel.isCurrentAutoCutMode() && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor") && !videoPublishEditModel.isDuet() && !C1428470nHB.LLIIJI(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LIZJ(String str) throws Throwable {
        boolean z;
        String strLJ;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && C2286708xd.LIZJ(str)) {
            String string = null;
            String strLJIJJ = C2471909mP.LJIJJ(str, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getHypicDescFromMedia: mimeType = ");
            sbLIZ.append(strLJIJJ);
            sbLIZ.append(", path = ");
            sbLIZ.append(str);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            if (!C2471909mP.LIZ(strLJIJJ)) {
                return "";
            }
            try {
                C2259271Dbp c2259271DbpLJIIZILJ = C2471909mP.LJIIZILJ(str);
                if (c2259271DbpLJIIZILJ != null) {
                    strLJ = c2259271DbpLJIIZILJ.LJ("UserComment");
                } else {
                    strLJ = null;
                }
                if (C123100dR.LIZ(strLJ)) {
                    new p();
                    k kVarLJJIIZ = p.LIZJ(strLJ).LJIILIIL().LJJIIZ("tiktok_developers_3p_anchor_params");
                    if (kVarLJJIIZ != null) {
                        string = kVarLJJIIZ.toString();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getHypicDescFromMedia failed: ");
                sbLIZ2.append(Log.getStackTraceString(e));
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    public static final void LIZLLL(String str, String str2) throws Throwable {
        if (str.length() != 0 && str2.length() != 0 && !Intrinsics.LJFF(str, str2) && C2286708xd.LIZJ(str) && C2286708xd.LIZJ(str2) && C2471909mP.LJJIII(str, false, 6) && C2471909mP.LJJIII(str2, true, 4)) {
            String strLIZJ = LIZJ(str);
            try {
                if (strLIZJ.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("{\"tiktok_developers_3p_anchor_params\":");
                    sbLIZ.append(strLIZJ);
                    sbLIZ.append('}');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C2259271Dbp c2259271DbpLJIIZILJ = C2471909mP.LJIIZILJ(str2);
                    if (c2259271DbpLJIIZILJ != null) {
                        c2259271DbpLJIIZILJ.LJJ(strLIZIZ);
                        c2259271DbpLJIIZILJ.LJIJJLI();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("transHypicMetadata failed: ");
                sbLIZ2.append(Log.getStackTraceString(e));
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
