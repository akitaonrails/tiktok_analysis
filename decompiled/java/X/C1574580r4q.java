package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IShareAwemeCacheService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0r4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574580r4q implements IShareAwemeCacheService {
    public static final C1574580r4q LIZIZ = new C1574580r4q();
    public final /* synthetic */ IShareAwemeCacheService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZ(List list, C1556020qau c1556020qau, Function1 function1) {
        this.LIZ.LIZ(list, c1556020qau, function1);
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZIZ(long j, C1574370r4V c1574370r4V, Aweme aweme, C1556040qaw c1556040qaw) {
        this.LIZ.LIZIZ(j, c1574370r4V, aweme, c1556040qaw);
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZJ(long j) {
        this.LIZ.LIZJ(j);
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LIZLLL(C1574380r4W c1574380r4W, List list) {
        this.LIZ.LIZLLL(c1574380r4W, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final Aweme LJ(long j, AbstractC1574450r4d abstractC1574450r4d, AbstractC1556090qb1 abstractC1556090qb1) {
        return this.LIZ.LJ(j, abstractC1574450r4d, abstractC1556090qb1);
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LJFF(AbstractC1574500r4i abstractC1574500r4i) {
        this.LIZ.LJFF(abstractC1574500r4i);
    }

    @Override // com.ss.android.ugc.aweme.service.IShareAwemeCacheService
    public final void LJI(List<Long> list, AbstractC1574450r4d abstractC1574450r4d, AbstractC1574500r4i abstractC1574500r4i, Function1<? super Integer, Unit> function1) {
        this.LIZ.LJI(list, abstractC1574450r4d, abstractC1574500r4i, function1);
    }

    public C1574580r4q() {
        IShareAwemeCacheService iShareAwemeCacheService = (IShareAwemeCacheService) PluggableExtentionKt.pluggableSpi$default(IShareAwemeCacheService.class, false, false, false, 14, null);
        if (iShareAwemeCacheService != null) {
            this.LIZ = iShareAwemeCacheService;
        } else {
            "no implement IShareAwemeCacheService".toString();
            throw new IllegalStateException("no implement IShareAwemeCacheService");
        }
    }
}
