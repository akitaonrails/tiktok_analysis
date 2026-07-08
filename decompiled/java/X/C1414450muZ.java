package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0muZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414450muZ {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (((Boolean) C284700BDw.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (C301690Bs7.LIZ() && !u4.LJJIJ(videoPublishEditModel) && u4.LJIIIIZZ(videoPublishEditModel) && !C1428470nHB.LJJJJJ(videoPublishEditModel) && !C1428470nHB.LJLLLL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(ArrayList<C1412800mru> arrayList) {
        for (C1412800mru c1412800mru : arrayList) {
            if (c1412800mru.LIZ == MixEditingMaterialType.CANCEL_TYPE) {
                if (c1412800mru != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean LIZLLL(ArrayList<C1412800mru> arrayList) {
        for (C1412800mru c1412800mru : arrayList) {
            if (c1412800mru.LIZ == MixEditingMaterialType.UNKNOWN_TYPE) {
                if (c1412800mru != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final String LJ(Asset asset) {
        String distribution_extra = asset.getBusiness_extra().getDistribution_extra();
        if (distribution_extra != null && distribution_extra.length() > 0) {
            return distribution_extra;
        }
        String extra = asset.getExtra();
        if (extra.length() <= 0) {
            return null;
        }
        return extra;
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        MixEditingMaterialType mixEditingMaterialType;
        boolean z;
        boolean z2;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        SelectedMaterialItem selectedMaterialItem = creativeModel.mixEditingModel.selectedMaterialItem;
        if (selectedMaterialItem != null) {
            mixEditingMaterialType = selectedMaterialItem.materialType;
        } else {
            mixEditingMaterialType = null;
        }
        if (mixEditingMaterialType == MixEditingMaterialType.LYRICS_RULE_TEMPLATE) {
            z = true;
        } else {
            z = false;
        }
        AutoCutThemeData autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(creativeModel);
        if (autoCutThemeDataLIZJ != null && autoCutThemeDataLIZJ.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        if ((!(!videoPublishEditModel.getEffectList().isEmpty()) || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_mix_editing_effect_apply_sound_sync", true, false) || videoPublishEditModel.getMediaModelList().size() <= 1) && !LJIIJJI(videoPublishEditModel) && videoPublishEditModel.getEditMusicSyncMode() && videoPublishEditModel.creativeModel.musicBuzModel.music != null) {
            return true;
        }
        return false;
    }

    public static final String LIZIZ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        String strValueOf;
        String str;
        if (((Boolean) C284480BDa.LIZ.getValue()).booleanValue()) {
            AutoCutThemeData autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(videoPublishEditModel.creativeModel);
            if (autoCutThemeDataLIZJ != null) {
                if (C703302op.LIZ(autoCutThemeDataLIZJ.templateId)) {
                    str = autoCutThemeDataLIZJ.templateId;
                } else {
                    str = autoCutThemeDataLIZJ.musicId;
                }
                if (str != null) {
                    return str;
                }
            }
            Asset assetLIZ = C1414150mu5.LIZ(interfaceC1452170ntP);
            if (assetLIZ != null) {
                return assetLIZ.getAsset_id();
            }
            return null;
        }
        AutoCutThemeData autoCutThemeDataLIZJ2 = C1403130mcJ.LIZJ(videoPublishEditModel.creativeModel);
        if (autoCutThemeDataLIZJ2 != null) {
            if (C703302op.LIZ(autoCutThemeDataLIZJ2.templateId)) {
                strValueOf = autoCutThemeDataLIZJ2.templateId;
            } else {
                strValueOf = String.valueOf(autoCutThemeDataLIZJ2.musicId);
            }
            if (strValueOf != null) {
                return strValueOf;
            }
        }
        return new AwS566S0100000_22(interfaceC1452170ntP, 1049).toString();
    }

    public static final void LJFF(List list, Function1 function1) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((Boolean) function1.invoke(it2.next())).booleanValue()) {
                it2.remove();
            }
        }
    }

    public static final boolean LJI(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModelLIZ;
        C1414930mvL.LIZ.getClass();
        if (!C1414930mvL.LJIIJ(videoPublishEditModel) || interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || !C0EYQ.LJIIJ(nLEModelLIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModelLIZ;
        C1414930mvL.LIZ.getClass();
        if (!C1414930mvL.LJIIJ(videoPublishEditModel) || interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || !C0EYQ.LJIIJJI(nLEModelLIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModelLIZ;
        C1414930mvL.LIZ.getClass();
        if (!C1414930mvL.LJIIJ(videoPublishEditModel) || interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || !C0EYQ.LJIILJJIL(nLEModelLIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        String strLJIIZILJ;
        CelebrationData celebrationData;
        Integer celebrationType;
        NLEModel nLEModelLIZ;
        String templateId = null;
        if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null) {
            strLJIIZILJ = C0EYQ.LJIIZILJ(nLEModelLIZ);
            if (strLJIIZILJ == null) {
                return false;
            }
        } else {
            NLEModel nleModel = videoPublishEditModel.getNleModel();
            if (nleModel != null) {
                strLJIIZILJ = C0EYQ.LJIIZILJ(nleModel);
            } else {
                strLJIIZILJ = null;
            }
        }
        if (!C0MQ1.LIZ() || (celebrationData = videoPublishEditModel.creativeModel.celebrationData) == null || (celebrationType = celebrationData.getCelebrationType()) == null || celebrationType.intValue() != 2) {
            return false;
        }
        CelebrationData celebrationData2 = videoPublishEditModel.creativeModel.celebrationData;
        if (celebrationData2 != null) {
            templateId = celebrationData2.getTemplateId();
        }
        if (!Intrinsics.LJFF(strLJIIZILJ, templateId)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModelLIZ;
        C1414930mvL.LIZ.getClass();
        if (!C1414930mvL.LJIIJ(videoPublishEditModel) || interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || !C0EYQ.LJIILLIIL(nLEModelLIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        C1414930mvL.LIZ.getClass();
        if (C1414930mvL.LJIIJ(videoPublishEditModel) && C0EYU.LIZ(interfaceC1452170ntP, videoPublishEditModel)) {
            return true;
        }
        return false;
    }
}
