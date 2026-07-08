package X;

import com.bytedance.helios.network.api.config.AutoSkipApiConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841420Wzc extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ double LLILLJJLI;
    public final /* synthetic */ CopyOnWriteArrayList<Long> LLILLL;
    public final /* synthetic */ AutoSkipApiConfig LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C841420Wzc(int i, double d, CopyOnWriteArrayList<Long> copyOnWriteArrayList, AutoSkipApiConfig autoSkipApiConfig) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = d;
        this.LLILLL = copyOnWriteArrayList;
        this.LLILZ = autoSkipApiConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("statisticsApiCost skip id: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" average: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" count: ");
        sbLIZ.append(this.LLILLL.size());
        sbLIZ.append(" autoSkipApiConfig: ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
