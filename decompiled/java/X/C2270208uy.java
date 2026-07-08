package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2270208uy {
    public static final String LIZ(List<String> list) {
        boolean z;
        boolean z2;
        String strLIZ;
        int i;
        int i2;
        int i3;
        boolean z3;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str : list) {
                if (str.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
                    boolean zLJIILL = C2286708xd.LJIILL(str);
                    Context context = C1330760kja.LIZ;
                    if (C2471909mP.LJJIIZI(str) && context != null) {
                        strLIZ = C09N5.LIZ(context, C2471909mP.LJIILIIL(str));
                    } else {
                        strLIZ = str;
                    }
                    if (strLIZ != null) {
                        str = strLIZ;
                    }
                    String str2 = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6));
                    if (str2 == null) {
                        str2 = "";
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (videoFileInfo != null) {
                        i = videoFileInfo.width;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("width", i);
                    if (videoFileInfo != null) {
                        i2 = videoFileInfo.height;
                    } else {
                        i2 = 0;
                    }
                    jSONObject.put("height", i2);
                    if (zLJIILL || videoFileInfo == null) {
                        i3 = 0;
                    } else {
                        i3 = videoFileInfo.duration;
                    }
                    jSONObject.put("duration", i3);
                    if (!zLJIILL) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    jSONObject.put("isVideo", z3);
                    jSONObject.put("hasAudio", false);
                    jSONObject.put("path", strLIZ);
                    jSONObject.put("name", str2);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("image");
                    jSONObject.put("includes", jSONArray2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("meta", jSONObject);
                    jSONArray.put(jSONObject2);
                }
            }
            if (jSONArray.length() == 0) {
                return "";
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("image_info_list", jSONArray);
            return C786410Ut5.J3(jSONObject3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to build image_info_list rec_config: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LIZLLL(c1398350mUb, "MixEditingFeatureExtractionService", C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2270208uy.LIZLLL(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final C2268608ui LJ(VideoPublishEditModel videoPublishEditModel, String str) {
        ArrayList arrayList;
        String strLIZLLL;
        ArrayList arrayList2;
        if (videoPublishEditModel != null) {
            C090X.LIZ.getClass();
            if (C090X.LIZIZ()) {
                int size = 0;
                if (C090X.LIZ(videoPublishEditModel, false)) {
                    String creationId = videoPublishEditModel.getCreationId();
                    ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
                    if (importInfoList != null) {
                        size = importInfoList.size();
                    }
                    ArrayList<ImportVideoInfo> importInfoList2 = videoPublishEditModel.getImportInfoList();
                    if (importInfoList2 != null) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(importInfoList2, 10));
                        Iterator<ImportVideoInfo> it2 = importInfoList2.iterator();
                        while (it2.hasNext()) {
                            String realImportPath = it2.next().getRealImportPath();
                            if (realImportPath == null) {
                                realImportPath = "";
                            }
                            arrayList2.add(realImportPath);
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (C2269608us.LIZ()) {
                        C2269208uo.LIZ.getClass();
                        Pair<String, String> pair = C2269208uo.LIZJ;
                        if (pair != null) {
                            if (!Intrinsics.LJFF(pair.getFirst(), C2275708vr.LIZIZ()) && !Intrinsics.LJFF(pair.getFirst(), "empty")) {
                                C2269208uo.LIZJ = null;
                            }
                        }
                    }
                    try {
                        C2269208uo.LIZ.getClass();
                        Pair<String, String> pair2 = C2269208uo.LIZJ;
                        if (pair2 != null) {
                            C2268608ui c2268608ui = new C2268608ui(null, false, null, null, null, 16383);
                            c2268608ui.LIZ = pair2.getFirst();
                            c2268608ui.LJIIJ = pair2.getSecond();
                            return c2268608ui;
                        }
                        return (C2268608ui) C23250099c.LJ(C23271099x.INSTANCE, new C2268808uk(arrayList2, size, creationId, null));
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2268608ui c2268608ui2 = new C2268608ui(null, false, null, null, null, 16383);
                        c2268608ui2.LIZ = "empty";
                        c2268608ui2.LIZJ = Boolean.TRUE;
                        c2268608ui2.LJIIJ = C2268608ui.LIZLLL(arrayList2);
                        return c2268608ui2;
                    }
                }
                ArrayList<ImportVideoInfo> importInfoList3 = videoPublishEditModel.getImportInfoList();
                if (importInfoList3 != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(importInfoList3, 10));
                    Iterator<ImportVideoInfo> it3 = importInfoList3.iterator();
                    while (it3.hasNext()) {
                        String realImportPath2 = it3.next().getRealImportPath();
                        if (realImportPath2 == null) {
                            realImportPath2 = "";
                        }
                        arrayList.add(realImportPath2);
                    }
                } else {
                    arrayList = null;
                }
                List<C2262608tk> listLIZ = C0MH3.LIZ(videoPublishEditModel, Intrinsics.LJFF(str, "list"));
                if (listLIZ != null) {
                    try {
                        return (C2268608ui) C23250099c.LJ(C23271099x.INSTANCE, new C2270108ux(videoPublishEditModel, videoPublishEditModel, arrayList, listLIZ, str, null));
                    } catch (InterruptedException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2268608ui c2268608ui3 = new C2268608ui(null, false, null, null, null, 16383);
                        c2268608ui3.LIZ = "empty";
                        c2268608ui3.LIZJ = Boolean.TRUE;
                        if (C296620Bjw.LIZ()) {
                            C201955140j.LIZLLL(C1398350mUb.LIZIZ, "MixEditingFeatureExtractionService", "uploadFramesForMixEditing InterruptedException: StudioAssetApiUpgradeAB hit, building image_info_list rec_config with BACH features");
                            strLIZLLL = LIZJ(videoPublishEditModel, LIZ(arrayList), str);
                        } else {
                            strLIZLLL = C2268608ui.LIZLLL(arrayList);
                        }
                        c2268608ui3.LJIIJ = strLIZLLL;
                        return c2268608ui3;
                    }
                }
            }
        }
        return null;
    }

    public static final C2269508ur LIZIZ(VideoPublishEditModel videoPublishEditModel, Set set, String str) {
        if (videoPublishEditModel != null && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_enable_extract_visual_features", true, false)) {
            return new C2269508ur(videoPublishEditModel, str, set, videoPublishEditModel.mShootWay, C1428470nHB.LJIILIIL(videoPublishEditModel));
        }
        return null;
    }

    public static final String LIZJ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String string;
        Object objInvoke;
        C2269508ur c2269508urLIZIZ = LIZIZ(videoPublishEditModel, C2295608z4.LIZIZ(), str2);
        if (c2269508urLIZIZ != null && (objInvoke = c2269508urLIZIZ.invoke()) != null) {
            string = objInvoke.toString();
        } else {
            string = null;
        }
        return LIZLLL(str, string);
    }
}
