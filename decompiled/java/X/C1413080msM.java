package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;

/* JADX INFO: renamed from: X.0msM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413080msM {
    public static final long LIZ(AVMusic aVMusic) {
        if (aVMusic != null) {
            return C20012413Ry.LJIIJ(aVMusic.path);
        }
        return 0L;
    }

    public static final boolean LIZIZ(Asset asset) {
        if (asset.getAsset_type() != AssetType.PUGC_TEMPLATE.getValue() && asset.getAsset_type() != AssetType.AI_ALIVE_TEMPLATE.getValue() && asset.getAsset_type() != AssetType.UGC_TEMPLATE.getValue()) {
            return false;
        }
        return true;
    }
}
