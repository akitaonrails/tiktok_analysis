package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.ailive.MixEditingMaterialModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetConsumerType;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0muo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414600muo {
    public static final boolean LIZ(C1412860ms0 c1412860ms0) {
        int asset_consumer_type = c1412860ms0.LIZ.getAsset_consumer_type();
        if (asset_consumer_type == AssetConsumerType.SOUND_SYNC.getValue()) {
            return C123100dR.LIZ(c1412860ms0.LIZ.getAsset_id());
        }
        if (asset_consumer_type == AssetConsumerType.EDIT_EFFECT.getValue()) {
            return C123100dR.LIZ(c1412860ms0.LIZ.getBusiness_extra().getMusic_id());
        }
        return false;
    }

    public static final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList = new ArrayList();
        if (C565160MEo.LIZ(videoPublishEditModel)) {
            arrayList.add(EnumC1414610mup.AI_ALIVE.getValue());
        }
        if (C1414940mvM.LJI()) {
            arrayList.add(EnumC1414610mup.EDITING_ASSETS.getValue());
        }
        if (!arrayList.isEmpty()) {
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return EnumC1414610mup.EDITING_ASSETS.getValue();
    }

    public static final boolean LIZJ(C2262608tk c2262608tk) {
        String str;
        Boolean bool = c2262608tk.LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C2471909mP.LJJIIZI(c2262608tk.LJ)) {
            str = c2262608tk.LJ;
        } else if (C2471909mP.LJJIIZI(c2262608tk.LIZ)) {
            str = c2262608tk.LIZ;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            if (a0.LJJIIZI(str, "video", false)) {
                return true;
            }
            if (a0.LJJIIZI(str, "image", false)) {
                return false;
            }
        }
        if (c2262608tk.LIZIZ <= 0) {
            return false;
        }
        return true;
    }

    public static final n LIZLLL(NLEResourceNode nLEResourceNode) {
        Number numberValueOf;
        Number numberValueOf2;
        boolean z;
        n nVar = new n();
        if (nLEResourceNode.getWidth() > 0 && nLEResourceNode.getHeight() > 0) {
            nVar.LJJIII(Long.valueOf(nLEResourceNode.getWidth()), "width");
            nVar.LJJIII(Long.valueOf(nLEResourceNode.getHeight()), "height");
        } else {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(nLEResourceNode.getResourceFile());
            if (videoFileInfo != null) {
                numberValueOf = Integer.valueOf(videoFileInfo.width);
            } else {
                numberValueOf = Long.valueOf(nLEResourceNode.getWidth());
            }
            nVar.LJJIII(numberValueOf, "width");
            if (videoFileInfo != null) {
                numberValueOf2 = Integer.valueOf(videoFileInfo.height);
            } else {
                numberValueOf2 = Long.valueOf(nLEResourceNode.getHeight());
            }
            nVar.LJJIII(numberValueOf2, "height");
        }
        nVar.LJJIII(Long.valueOf(nLEResourceNode.getDuration()), "duration");
        if (nLEResourceNode.getResourceType() == NLEResType.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        nVar.LJJII(Boolean.valueOf(z), "isVideo");
        nVar.LJJII(Boolean.FALSE, "hasAudio");
        String resourceFile = nLEResourceNode.getResourceFile();
        if (resourceFile == null) {
            resourceFile = "";
        }
        nVar.LJJIIJ("path", resourceFile);
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1412800mru LJ(MixEditingMaterialModel mixEditingMaterialModel) {
        MixEditingMaterialType mixEditingMaterialType = mixEditingMaterialModel.type;
        String str = mixEditingMaterialModel.name;
        UrlModel urlModel = mixEditingMaterialModel.icon;
        Asset asset = mixEditingMaterialModel.originAsset;
        boolean z = mixEditingMaterialModel.fromRecommend;
        String str2 = mixEditingMaterialModel.itemClickFrom;
        SelectMethodType selectMethodType = mixEditingMaterialModel.selectMethod;
        boolean z2 = mixEditingMaterialModel.insertedMobAsMixMaterial;
        AbstractC1412880ms2 abstractC1412880ms2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        return new C1412800mru(mixEditingMaterialType, str, urlModel, asset, abstractC1412880ms2, z, str2, selectMethodType, mixEditingMaterialModel.manualSelectSubType, z2, objArr, 0, objArr2, 0 == true ? 1 : 0, objArr3, objArr4, 64528);
    }

    public static final boolean LJFF(float f, float f2) {
        if (Math.abs(f - f2) > 0.001f) {
            return true;
        }
        return false;
    }
}
