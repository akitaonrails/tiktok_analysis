package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0TRR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TRR {
    public boolean LIZ = true;
    public final Set<Integer> LIZIZ = new LinkedHashSet();

    public abstract int LIZ();

    public abstract int LIZIZ();

    public abstract List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list);
}
