package X;

import com.ss.android.ugc.aweme.newselector.repository.RelatedUserList;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.05zT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1533705zT implements Serializable {
    public final Map<Long, RelatedUserList> relatedUserListMap;
    public final long timestamp;

    public C1533705zT() {
        this(C2097608Jq.LJ(), 0L);
    }

    public C1533705zT(Map<Long, RelatedUserList> map, long j) {
        this.relatedUserListMap = map;
        this.timestamp = j;
    }
}
