package X;

import android.media.ExifInterface;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.effect.DescriptionData;
import com.ss.android.ugc.aweme.effect.DescriptionDataWrapper;
import com.ss.android.ugc.aweme.effect.ReuploadMetaData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403720mdG {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList(LIZIZ(videoPublishEditModel, false));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.LJFF(((CreateAnchorInfo) obj).getSubtype(), "")) {
                arrayList3.add(obj);
            }
        }
        arrayList2.addAll(arrayList3);
        C1429600nJ0.LIZJ(arrayList2, videoPublishEditModel);
        C1429600nJ0.LIZIZ(arrayList2, videoPublishEditModel);
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("aigc_offline_anchor_restore_killswitch", false)) {
            C1429450nIl.LIZLLL(arrayList2, videoPublishEditModel, null, null, false, 28);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(((CreateAnchorInfo) obj2).getKeyword())) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        ArrayList arrayList6 = new ArrayList(C1429600nJ0.LJII(videoPublishEditModel));
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (true ^ Intrinsics.LJFF(((CreateAnchorInfo) obj3).getSubtype(), "")) {
                arrayList7.add(obj3);
            }
        }
        arrayList6.addAll(0, arrayList7);
        arrayList5.addAll(arrayList6);
        ArrayList arrayList8 = null;
        if (C0EYU.LIZIZ(videoPublishEditModel, null, null)) {
            str = "1";
        } else {
            str = null;
        }
        ArrayList arrayList9 = new ArrayList();
        if (C294070Bfp.LIZ()) {
            ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
            if (importInfoList != null) {
                for (ImportVideoInfo importVideoInfo : importInfoList) {
                    List<ReuploadMetaData> listLIZLLL = C1403710mdF.LIZLLL(importVideoInfo.getRealImportPath());
                    if (listLIZLLL != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (!listLIZLLL.isEmpty())) {
                        arrayList9.addAll(listLIZLLL);
                    }
                    List<ReuploadMetaData> listLIZJ = C1403710mdF.LIZJ(importVideoInfo.getRealImportPath());
                    if (listLIZJ != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && (!listLIZJ.isEmpty())) {
                        arrayList9.addAll(listLIZJ);
                    }
                }
            }
            ReuploadMetaData reuploadMetaDataLIZ = C1403710mdF.LIZ(videoPublishEditModel);
            if (reuploadMetaDataLIZ != null) {
                arrayList9.add(reuploadMetaDataLIZ);
            }
            try {
                if (!arrayList9.isEmpty()) {
                    arrayList8 = arrayList9;
                }
                return C08JS.LIZLLL(new DescriptionDataWrapper(new DescriptionData("aweme", arrayList5, arrayList8, str)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("generateMetaInfo error: ");
                sbLIZ.append(th.getMessage());
                C201955140j.LJFF("UploadInfoHelper", C2188811AlT.LIZIZ(sbLIZ));
                return "";
            }
        }
        try {
            return C08JS.LIZLLL(new DescriptionDataWrapper(new DescriptionData("aweme", arrayList5, null, str)));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("generateMetaInfo error: ");
            sbLIZ2.append(th2.getMessage());
            C201955140j.LJFF("UploadInfoHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return "";
        }
    }

    public static final List<CreateAnchorInfo> LIZIZ(VideoPublishEditModel videoPublishEditModel, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        DescriptionData descriptionData;
        boolean z4;
        DescriptionData descriptionData2;
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null && !importInfoList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        List list = C13BV.INSTANCE;
        ArrayList<ImportVideoInfo> importInfoList2 = videoPublishEditModel.getImportInfoList();
        if (importInfoList2 != null) {
            List list2 = list;
            for (ImportVideoInfo importVideoInfo : importInfoList2) {
                if (C2471909mP.LJJIIJ(importVideoInfo.getRealImportPath(), z)) {
                    ExifInterface exifInterfaceLJIILL = C2471909mP.LJIILL(importVideoInfo.getRealImportPath());
                    String strLJLIL = null;
                    if (exifInterfaceLJIILL != null) {
                        strLJLIL = C2204961BRm.LJLIL(exifInterfaceLJIILL, "UserComment", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhSwoMpcHhmFvEzk7EbinudFUbZFKzT2Cg==", null));
                    }
                    if (strLJLIL != null && strLJLIL.length() != 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        list = C13BV.INSTANCE;
                    } else {
                        try {
                            DescriptionDataWrapper descriptionDataWrapper = (DescriptionDataWrapper) C08JS.LIZ(strLJLIL, DescriptionDataWrapper.class);
                            if (descriptionDataWrapper == null || (descriptionData2 = descriptionDataWrapper.data) == null || (list = descriptionData2.effectList) == null) {
                                list = C13BV.INSTANCE;
                            }
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getAnchors error: ");
                            sbLIZ.append(e.getMessage());
                            C201955140j.LJFF("UploadInfoHelper", C2188811AlT.LIZIZ(sbLIZ));
                            list = C13BV.INSTANCE;
                        }
                    }
                } else {
                    HashMap<String, String> metaData = TEVideoUtils.getMetaData(importVideoInfo.getRealImportPath());
                    if (metaData != null && !metaData.isEmpty()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        list2 = C13BV.INSTANCE;
                    } else {
                        try {
                            DescriptionDataWrapper descriptionDataWrapper2 = (DescriptionDataWrapper) C08JS.LIZ(metaData.get("com.apple.quicktime.information"), DescriptionDataWrapper.class);
                            if (descriptionDataWrapper2 == null || (descriptionData = descriptionDataWrapper2.data) == null || (list2 = descriptionData.effectList) == null) {
                                list2 = C13BV.INSTANCE;
                            }
                        } catch (s e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getAnchors error: ");
                            sbLIZ2.append(e2.getMessage());
                            C201955140j.LJFF("UploadInfoHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            list2 = C13BV.INSTANCE;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    arrayList.addAll(list);
                }
                if (!list2.isEmpty()) {
                    arrayList.addAll(list2);
                }
            }
        }
        return arrayList;
    }
}
