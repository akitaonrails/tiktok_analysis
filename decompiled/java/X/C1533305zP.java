package X;

import com.ss.android.ugc.aweme.im.common.model.GroupRecEventTracking;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.05zP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1533305zP implements Serializable {
    public final GroupRecEventTracking eventTracking;
    public final List<Long> recUserIds;
    public final long timestamp;

    public C1533305zP() {
        this(null, null, 0L, 7, null);
    }

    public C1533305zP(List<Long> list, GroupRecEventTracking groupRecEventTracking, long j) {
        this.recUserIds = list;
        this.eventTracking = groupRecEventTracking;
        this.timestamp = j;
    }

    public C1533305zP(List list, GroupRecEventTracking groupRecEventTracking, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : groupRecEventTracking, (i & 4) != 0 ? 0L : j);
    }
}
