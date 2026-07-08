package Y;

import X.C0OCM;
import X.C1C7U;
import X.C2188608ho;
import X.C730000SkI;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS7S0110100_9 implements Callable {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS7S0110100_9 aCallableS7S0110100_9) {
        int iIntValue;
        long jLongValue;
        C1C7U.LIZ("AddYoursDetailAwemeModel@da7e.loadMoreList$1");
        long j = aCallableS7S0110100_9.j2;
        boolean z = aCallableS7S0110100_9.z1;
        Integer num = ((C0OCM) aCallableS7S0110100_9.l0).LLIZ.loadType;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        Long l = ((C0OCM) aCallableS7S0110100_9.l0).LLIZ.cursor;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C0OCM c0ocm = (C0OCM) aCallableS7S0110100_9.l0;
        AddYoursDetailResp addYoursDetailResp = C2188608ho.LIZ().getTopicDetail(j, z, iIntValue, jLongValue, 30, c0ocm.LL, 0, c0ocm.LLILLJJLI).execute().LIZIZ;
        C1C7U.LIZIZ("AddYoursDetailAwemeModel@da7e.loadMoreList$1");
        return addYoursDetailResp;
    }

    public static final Object call$1(ACallableS7S0110100_9 aCallableS7S0110100_9) {
        C1C7U.LIZ("AddYoursDetailAwemeModel@da7e.refreshList$1");
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZ(249372161, Boolean.TRUE, "is_request_network");
        c730000SkI.LIZ(249372161, Boolean.FALSE, "is_use_cache");
        long j = aCallableS7S0110100_9.j2;
        boolean z = aCallableS7S0110100_9.z1;
        C0OCM c0ocm = (C0OCM) aCallableS7S0110100_9.l0;
        AddYoursDetailResp addYoursDetailResp = C2188608ho.LIZ().getTopicDetail(j, z, 1, 0L, 30, c0ocm.LL, 0, c0ocm.LLILLJJLI).execute().LIZIZ;
        C0OCM c0ocm2 = (C0OCM) aCallableS7S0110100_9.l0;
        AddYoursPagination addYoursPagination = addYoursDetailResp.pagination;
        if (addYoursPagination != null) {
            c0ocm2.LLIZ = addYoursPagination;
        }
        C1C7U.LIZIZ("AddYoursDetailAwemeModel@da7e.refreshList$1");
        return addYoursDetailResp;
    }

    public ACallableS7S0110100_9(long j, boolean z, C0OCM c0ocm, int i) {
        this.$t = i;
        this.j2 = j;
        this.z1 = z;
        this.l0 = c0ocm;
    }
}
