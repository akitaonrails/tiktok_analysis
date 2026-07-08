package X;

import com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X03, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X03 extends C09AY implements Function0<String> {
    public final /* synthetic */ Map<String, List<String>> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0X03(Map<String, ? extends List<String>> map, String str) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTNetServiceImpl.getQueries isHitCache:true size: ");
        sbLIZ.append(this.LL.size());
        sbLIZ.append(" url: ");
        sbLIZ.append(this.LLILLJJLI.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(TTNetServiceImpl.queryLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
