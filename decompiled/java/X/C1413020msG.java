package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.image.phototemplate.utils.Extra;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0msG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413020msG {
    public static final boolean LIZIZ(PhotoTemplateAsset photoTemplateAsset) {
        Asset asset = photoTemplateAsset.getAsset();
        if (asset != null && asset.getAsset_type() == AssetType.PHOTO_BASELINE_SINGLE.getValue()) {
            return true;
        }
        Asset asset2 = photoTemplateAsset.getAsset();
        if (asset2 != null && asset2.getAsset_type() == AssetType.PHOTO_DESIGNER_SINGLE.getValue()) {
            return true;
        }
        Asset asset3 = photoTemplateAsset.getAsset();
        if (asset3 != null && asset3.getAsset_type() == AssetType.PHOTO_ALGO_SINGLE.getValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(PhotoTemplateAsset photoTemplateAsset) {
        Asset asset = photoTemplateAsset.getAsset();
        if (asset == null || asset.getAsset_type() != AssetType.PHOTO_EFFECT.getValue()) {
            return false;
        }
        return true;
    }

    public static final PhotoTemplateAsset LIZLLL(Asset asset) {
        Extra extra;
        String extra2 = asset.getExtra();
        if ((a0.LJJJIL(extra2) || extra2 == null) && (((extra2 = asset.getBusiness_extra().getLoki_extra()) == null || a0.LJJJIL(extra2)) && ((extra2 = asset.getBusiness_extra().getDistribution_extra()) == null || a0.LJJJIL(extra2)))) {
            extra2 = "";
        }
        if (extra2.length() == 0) {
            extra = new Extra(false, "", null, null);
        } else {
            try {
                extra = (Extra) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), extra2, Extra.class);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                extra = new Extra(false, "", null, null);
            }
        }
        return new PhotoTemplateAsset(asset, null, extra.generateNewImage, extra.propId, extra.aiTaskId, extra.operationTaskId);
    }

    public static final boolean LIZ(PhotoTemplateAsset photoTemplateAsset, PhotoTemplateAsset photoTemplateAsset2) {
        String asset_id;
        Asset asset;
        Asset asset2 = photoTemplateAsset.getAsset();
        String asset_id2 = null;
        if (asset2 != null) {
            asset_id = asset2.getAsset_id();
        } else {
            asset_id = null;
        }
        if (photoTemplateAsset2 != null && (asset = photoTemplateAsset2.getAsset()) != null) {
            asset_id2 = asset.getAsset_id();
        }
        if (!Intrinsics.LJFF(asset_id, asset_id2) || photoTemplateAsset2 == null || photoTemplateAsset.getGenerateNewImage() != photoTemplateAsset2.getGenerateNewImage()) {
            return false;
        }
        return true;
    }
}
