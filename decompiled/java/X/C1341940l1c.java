package X;

import Y.AComparatorS40S0000000_21;
import com.ss.android.ugc.aweme.comment.model.PollInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0l1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341940l1c {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(PollInfo pollInfo) {
        Iterable iterable = pollInfo.optionCountList;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LJLLLL(new AComparatorS40S0000000_21(2), iterable);
    }
}
