package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.List;

/* JADX INFO: renamed from: X.0iGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236040iGo {
    public final List<CollectionDetailModel> LIZ;
    public final List<Long> LIZIZ;
    public final Long LIZJ;

    public C1236040iGo() {
        this((List) null, (List) null, 7);
    }

    public C1236040iGo(List list, List list2, int i) {
        this((List<CollectionDetailModel>) ((i & 1) != 0 ? C13BV.INSTANCE : list), (List<Long>) ((i & 2) != 0 ? C13BV.INSTANCE : list2), (Long) null);
    }

    public C1236040iGo(List<CollectionDetailModel> list, List<Long> list2, Long l) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = l;
    }
}
