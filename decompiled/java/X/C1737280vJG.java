package X;

import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vJG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737280vJG {
    public static final boolean LIZ(EffectPackageDataWrapper effectPackageDataWrapper) {
        List<EffectObjectDataWrapper> list = effectPackageDataWrapper.objectDataList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (EffectObjectDataWrapper effectObjectDataWrapper : effectPackageDataWrapper.objectDataList) {
            if (Intrinsics.LJFF(effectObjectDataWrapper.featureType, "ame_greenscreen")) {
                if (effectObjectDataWrapper != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
