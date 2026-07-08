package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0m6Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383360m6Q {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getRecReasonTag() != null) {
            return LIZIZ(aweme.getRecReasonTag());
        }
        return LIZJ(aweme.getRecReasonsStruct());
    }

    public static String LIZIZ(RecReasonEntry recReasonEntry) {
        if (recReasonEntry == null || !C08A4.LIZ(Integer.valueOf(recReasonEntry.type))) {
            return "";
        }
        return String.valueOf(recReasonEntry.type);
    }

    public static String LIZJ(RecReasonsStruct recReasonsStruct) {
        List<RecReasonEntry> list;
        if (recReasonsStruct != null) {
            list = recReasonsStruct.reasons;
        } else {
            list = null;
        }
        if (list == null || !(!recReasonsStruct.reasons.isEmpty())) {
            return "";
        }
        return String.valueOf(((RecReasonEntry) ListProtector.get(recReasonsStruct.reasons, 0)).type);
    }
}
