package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;

/* JADX INFO: renamed from: X.0RW6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RW6 {
    public static final boolean LIZ(Aweme aweme) {
        C698200Ra6.LIZ.getClass();
        if (C698200Ra6.LJ(aweme) || aweme.getHybridLabels() == null || aweme.getHybridLabels().size() <= 0) {
            return false;
        }
        if (((AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), 0)).labelType != HybridLabelTagType.PRIVACY.getValue() && (((AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), 0)).labelType != HybridLabelTagType.UNKNOWN.getValue() || ((AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), 0)).imageUrl == null)) {
            return false;
        }
        return true;
    }
}
