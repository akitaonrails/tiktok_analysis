package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X0D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0D extends C09AY implements Function0<String> {
    public final /* synthetic */ HashMap<String, List<String>> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X0D(String str, HashMap map) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlConnectionServiceImpl.getQueries isHitCache:false size: ");
        sbLIZ.append(this.LL.size());
        sbLIZ.append(" url: ");
        sbLIZ.append(this.LLILLJJLI.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(C0X0A.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
