package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMoreMaxSize;

/* JADX INFO: renamed from: X.0tR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1665250tR5 extends AbstractC1643460srw<UIAnnotationAssetUIMore> {
    public final UIAnnotationAssetUIMoreMaxSize LIZ() {
        T t = this.LIZ;
        if (t != 0) {
            return ((UIAnnotationAssetUIMore) t).getMaxSize();
        }
        return null;
    }

    public AbstractC1665250tR5(UIAnnotationAssetUIMore uIAnnotationAssetUIMore) {
        super(uIAnnotationAssetUIMore);
        if (uIAnnotationAssetUIMore == null) {
            return;
        }
        uIAnnotationAssetUIMore.getAlgorithmRequirement();
    }
}
