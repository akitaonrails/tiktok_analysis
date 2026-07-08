package X;

import com.bytedance.hybrid.spark.raven.data.PageInfo;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161050gJr extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ PageInfo LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ RavenFragment<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161050gJr(int i, PageInfo pageInfo, int i2, RavenFragment<Object> ravenFragment) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = pageInfo;
        this.LLILLL = i2;
        this.LLILZ = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitResponse dispatch responseType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" refreshBodyOnly=");
        PageInfo pageInfo = this.LLILLJJLI;
        sbLIZ.append(pageInfo != null ? pageInfo.refreshBodyOnly : null);
        sbLIZ.append(" hasLoadMore=");
        PageInfo pageInfo2 = this.LLILLJJLI;
        List<String> list = pageInfo2 != null ? pageInfo2.loadMore : null;
        boolean z = false;
        sbLIZ.append(!(list == null || list.isEmpty()));
        sbLIZ.append(" hasInsert=");
        PageInfo pageInfo3 = this.LLILLJJLI;
        sbLIZ.append((pageInfo3 == null || pageInfo3.insert == null) ? false : true);
        sbLIZ.append(" hasDelete=");
        PageInfo pageInfo4 = this.LLILLJJLI;
        if (pageInfo4 != null && pageInfo4.delete != null) {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append(" currentHasMore=");
        PageInfo pageInfo5 = this.LLILLJJLI;
        sbLIZ.append(pageInfo5 != null ? pageInfo5.currentHasMore : null);
        sbLIZ.append(" bodyComponentsSize=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZ.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
