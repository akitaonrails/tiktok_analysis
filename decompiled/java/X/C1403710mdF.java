package X;

import android.media.ExifInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.effect.DescriptionData;
import com.ss.android.ugc.aweme.effect.DescriptionDataWrapper;
import com.ss.android.ugc.aweme.effect.ReuploadMetaData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403710mdF {
    public static final ReuploadMetaData LIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList = new ArrayList();
        EnumC1403640md8[] enumC1403640md8ArrValues = EnumC1403640md8.values();
        ArrayList<Pair> arrayList2 = new ArrayList(enumC1403640md8ArrValues.length);
        for (EnumC1403640md8 enumC1403640md8 : enumC1403640md8ArrValues) {
            arrayList2.add(new Pair(enumC1403640md8, new ArrayList()));
        }
        if (!C1428470nHB.LIZ(videoPublishEditModel) && !C294070Bfp.LIZ()) {
            return null;
        }
        C1403670mdB.LIZJ(arrayList2, videoPublishEditModel);
        LIZIZ(videoPublishEditModel, arrayList2, false);
        C1403670mdB.LIZ(arrayList2, videoPublishEditModel);
        C1403620md6.LIZ(videoPublishEditModel, arrayList, EnumC1403590md3.EFFECT_LIST, "nleExtraEffectKey", "ep_magic_effect_id");
        ReuploadMetaData reuploadMetaData = new ReuploadMetaData(null, null, null, C1428470nHB.LJL(videoPublishEditModel), null, null, null, null, null, null, null, null, null, null);
        arrayList.isEmpty();
        reuploadMetaData.setEffect_list(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        for (Pair pair : arrayList2) {
            EnumC1403640md8 enumC1403640md82 = (EnumC1403640md8) pair.getFirst();
            String strLJJLIIIJ = C13LP.LJJLIIIJ((Iterable) pair.getSecond(), ",", null, null, 0, null, null, 62);
            switch (C1403650md9.LIZ[enumC1403640md82.ordinal()]) {
                case 1:
                    reuploadMetaData.setResource_list(strLJJLIIIJ);
                    break;
                case 2:
                    reuploadMetaData.setEffectsource(strLJJLIIIJ);
                    break;
                case 3:
                    reuploadMetaData.setTab_key(strLJJLIIIJ);
                    break;
                case 4:
                    reuploadMetaData.setPropList(strLJJLIIIJ);
                    break;
                case 5:
                    reuploadMetaData.setMetParentResourceIds(strLJJLIIIJ);
                    break;
                case 6:
                    reuploadMetaData.setProp_selected_from(strLJJLIIIJ);
                    break;
                case 7:
                    reuploadMetaData.setProp_impr_position(strLJJLIIIJ);
                    break;
                case 8:
                    reuploadMetaData.setPropPanelPinType(strLJJLIIIJ);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    reuploadMetaData.setPropCategory(strLJJLIIIJ);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    reuploadMetaData.set_prop_panel_cache_list(strLJJLIIIJ);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    reuploadMetaData.setPropPanelDeliverySource(strLJJLIIIJ);
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        return reuploadMetaData;
    }

    public static final List<ReuploadMetaData> LIZJ(String str) throws Throwable {
        String strLJLIL;
        boolean z;
        DescriptionData descriptionData;
        try {
            ExifInterface exifInterfaceLJIILL = C2471909mP.LJIILL(str);
            if (exifInterfaceLJIILL != null) {
                strLJLIL = C2204961BRm.LJLIL(exifInterfaceLJIILL, "UserComment", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhSwoMpcHhmFvEzk7EbinudFUbZFKzT2Cg==", null));
            } else {
                strLJLIL = null;
            }
            if (strLJLIL == null || strLJLIL.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (descriptionData = ((DescriptionDataWrapper) C08JS.LIZ(strLJLIL, DescriptionDataWrapper.class)).data) != null) {
                List<ReuploadMetaData> list = descriptionData.metData;
                if (list != null) {
                    return list;
                }
            }
            return null;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publish data error: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJFF("UploadInfoHelper", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("publish data error: ");
            sbLIZ2.append(e2.getMessage());
            C201955140j.LJFF("UploadInfoHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public static final List<ReuploadMetaData> LIZLLL(String str) {
        HashMap<String, String> metaData;
        boolean z;
        DescriptionData descriptionData;
        if (C298040BmE.LIZ()) {
            metaData = C0CHQ.LIZ().LJIILL().getMetaData(str);
        } else {
            metaData = TEVideoUtils.getMetaData(str);
        }
        if (metaData != null && !metaData.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            DescriptionDataWrapper descriptionDataWrapper = (DescriptionDataWrapper) C08JS.LIZ(metaData.get("com.apple.quicktime.information"), DescriptionDataWrapper.class);
            if (descriptionDataWrapper != null && (descriptionData = descriptionDataWrapper.data) != null) {
                List<ReuploadMetaData> list = descriptionData.metData;
                if (list != null) {
                    return list;
                }
            }
            return null;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publish data error: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJFF("UploadInfoHelper", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static final ArrayList<ReuploadMetaData> LJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        ArrayList<ReuploadMetaData> arrayList = new ArrayList<>();
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            for (ImportVideoInfo importVideoInfo : importInfoList) {
                if (C2471909mP.LJJIIJ(importVideoInfo.getRealImportPath(), z)) {
                    List<ReuploadMetaData> listLIZJ = LIZJ(importVideoInfo.getRealImportPath());
                    if (listLIZJ != null && (!listLIZJ.isEmpty())) {
                        arrayList.addAll(listLIZJ);
                    }
                } else {
                    List<ReuploadMetaData> listLIZLLL = LIZLLL(importVideoInfo.getRealImportPath());
                    if (listLIZLLL != null && (!listLIZLLL.isEmpty())) {
                        arrayList.addAll(listLIZLLL);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, List<? extends Pair<? extends EnumC1403640md8, ? extends List<String>>> list, boolean z) {
        ArrayList<ReuploadMetaData> arrayListLJ = LJ(videoPublishEditModel, z);
        for (Pair pair : (ArrayList) list) {
            EnumC1403640md8 enumC1403640md8 = (EnumC1403640md8) pair.getFirst();
            List list2 = (List) pair.getSecond();
            for (ReuploadMetaData reuploadMetaData : arrayListLJ) {
                list2.clear();
                switch (C1403650md9.LIZ[enumC1403640md8.ordinal()]) {
                    case 1:
                        String str = reuploadMetaData.resource_list;
                        if (C123100dR.LIZ(str)) {
                            list2.add(str);
                        }
                        break;
                    case 2:
                        String str2 = reuploadMetaData.effectsource;
                        if (C123100dR.LIZ(str2)) {
                            list2.add(str2);
                        }
                        break;
                    case 3:
                        String str3 = reuploadMetaData.tab_key;
                        if (C123100dR.LIZ(str3)) {
                            list2.add(str3);
                        }
                        break;
                    case 4:
                        String str4 = reuploadMetaData.propList;
                        if (C123100dR.LIZ(str4)) {
                            list2.add(str4);
                        }
                        break;
                    case 5:
                        String str5 = reuploadMetaData.metParentResourceIds;
                        if (C123100dR.LIZ(str5)) {
                            list2.add(str5);
                        }
                        break;
                    case 6:
                        String str6 = reuploadMetaData.prop_selected_from;
                        if (C123100dR.LIZ(str6)) {
                            list2.add(str6);
                        }
                        break;
                    case 7:
                        String str7 = reuploadMetaData.prop_impr_position;
                        if (C123100dR.LIZ(str7)) {
                            list2.add(str7);
                        }
                        break;
                    case 8:
                        String str8 = reuploadMetaData.propPanelPinType;
                        if (C123100dR.LIZ(str8)) {
                            list2.add(str8);
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        String str9 = reuploadMetaData.propCategory;
                        if (C123100dR.LIZ(str9)) {
                            list2.add(str9);
                        }
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        String strIs_prop_panel_cache_list = reuploadMetaData.is_prop_panel_cache_list();
                        if (C123100dR.LIZ(strIs_prop_panel_cache_list)) {
                            list2.add(strIs_prop_panel_cache_list);
                        }
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        String str10 = reuploadMetaData.propPanelDeliverySource;
                        if (C123100dR.LIZ(str10)) {
                            list2.add(str10);
                        }
                        break;
                    default:
                        throw new C1954807lC();
                }
            }
        }
    }
}
