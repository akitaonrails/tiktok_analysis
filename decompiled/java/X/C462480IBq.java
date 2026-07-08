package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462480IBq extends C09AY implements Function1<C442480HWs, C442480HWs> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462480IBq(long j, Aweme aweme, String str, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C442480HWs invoke(C442480HWs c442480HWs) {
        Long lValueOf;
        AwemeStatistics statistics;
        C442480HWs c442480HWs2 = c442480HWs;
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(this.LL);
        if (awemeLLILZ == null) {
            awemeLLILZ = this.LLILLJJLI;
        }
        if (awemeLLILZ != null && (statistics = awemeLLILZ.getStatistics()) != null) {
            lValueOf = Long.valueOf(statistics.getCommentCount());
        } else {
            lValueOf = null;
        }
        long jLJFF = C1346420l8q.LJFF(lValueOf);
        if (awemeLLILZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncCommentCountByOffset aid");
            sbLIZ.append(this.LL);
            sbLIZ.append(" offset=");
            sbLIZ.append(this.LLILLL);
            C1344030l4z.LIZJ("CommentSyncSharedVM", C2188811AlT.LIZIZ(sbLIZ));
            long j = this.LLILLL + jLJFF;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("syncCommentCountByOffset aid");
            sbLIZ2.append(this.LL);
            sbLIZ2.append(" originalCount=");
            sbLIZ2.append(jLJFF);
            sbLIZ2.append(" offset=");
            sbLIZ2.append(this.LLILLL);
            sbLIZ2.append(" result=");
            sbLIZ2.append(j);
            C1344030l4z.LIZJ("CommentSyncSharedVM", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LLILZ) {
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Dr(this.LLILLJJLI, j);
            }
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).sr(j, this.LL);
            C1440005kM.LIZ(new C737030Svd(this.LL, Long.valueOf(j)));
            return C442480HWs.LIZ(c442480HWs2, new C291001Au(new C446370Het(this.LL, j)), null, 2);
        }
        throw new NullPointerException("syncCommentCountByOffset aweme is null");
    }
}
