package X;

import com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X01, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X01 extends C09AY implements Function0<String> {
    public final /* synthetic */ HashMap<String, String> LL;
    public final /* synthetic */ C080U LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X01(HashMap<String, String> map, C080U c080u) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = c080u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTNetServiceImpl.getCookies isHitCache:false size: ");
        sbLIZ.append(this.LL.size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(this.LLILLJJLI.LIZIZ.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(TTNetServiceImpl.cookieLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
