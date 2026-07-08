package X;

import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700340RdY {
    public static final boolean LIZ(RuleHitState ruleHitState) {
        if (ruleHitState != null && !Intrinsics.LJFF(ruleHitState.isHit(), Boolean.FALSE)) {
            return false;
        }
        return true;
    }
}
