package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554880qZ4 extends C09AY implements Function0<String> {
    public final /* synthetic */ C1554890qZ5 LL;
    public final /* synthetic */ C1554820qYy<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554880qZ4(C1554820qYy c1554820qYy, C1554890qZ5 c1554890qZ5) {
        super(0);
        this.LL = c1554890qZ5;
        this.LLILLJJLI = c1554820qYy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start find source key, this: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" key: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contain key: ");
        sbLIZ.append(((ConcurrentHashMap) this.LL.LIZIZ).containsKey(this.LLILLJJLI));
        sbLIZ.append(", scope: ");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(", source: ");
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append(", tree: ");
        sbLIZ.append(this.LL);
        sbLIZ.append("， host: ");
        sbLIZ.append(this.LL.LIZ.getHost());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
