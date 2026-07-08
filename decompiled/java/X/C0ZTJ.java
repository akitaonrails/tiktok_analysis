package X;

import com.ss.android.ugc.aweme.ext.IInteractiveTaskIndexTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTJ {
    public static final String LIZ(C869590Y9l c869590Y9l) {
        AIGroupShotCardTemplate aIGroupShotCardTemplate;
        if (c869590Y9l.getMsgType() != 1812 || (aIGroupShotCardTemplate = (AIGroupShotCardTemplate) C0Z2Z.LIZ(c869590Y9l, AIGroupShotCardTemplate.class)) == null) {
            return null;
        }
        return aIGroupShotCardTemplate.taskId;
    }

    public static final String LIZIZ(BaseTemplate baseTemplate) {
        return baseTemplate.rj().queryData.extras.get("group_shot_template_id");
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null || c869590Y9l.getMsgType() != 1812) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null || c869590Y9l.getMsgType() != 1816) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(C869590Y9l c869590Y9l) {
        AIGroupShotCardTemplate aIGroupShotCardTemplate;
        boolean z = false;
        if (c869590Y9l == null) {
            return false;
        }
        if (C300840Bqk.LIZ()) {
            AIGroupShotCardTemplate aIGroupShotCardTemplate2 = (AIGroupShotCardTemplate) C0Z2Z.LIZ(c869590Y9l, AIGroupShotCardTemplate.class);
            if (aIGroupShotCardTemplate2 == null) {
                return false;
            }
            IInteractiveTaskIndexTracker iInteractiveTaskIndexTracker = (IInteractiveTaskIndexTracker) PluggableExtentionKt.pluggableSpi$default(IInteractiveTaskIndexTracker.class, false, false, false, 14, null);
            if (iInteractiveTaskIndexTracker != null && iInteractiveTaskIndexTracker.LIZIZ(c869590Y9l, aIGroupShotCardTemplate2)) {
                z = true;
            }
            return !z;
        }
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("local_ext_group_shot_hide_card"), "1") || (aIGroupShotCardTemplate = (AIGroupShotCardTemplate) C0Z2Z.LIZ(c869590Y9l, AIGroupShotCardTemplate.class)) == null) {
            return false;
        }
        return !aIGroupShotCardTemplate.hideCard;
    }
}
