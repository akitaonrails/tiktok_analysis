package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840030WxN extends C09AY implements Function0<Object> {
    public final /* synthetic */ Map<String, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840030WxN(Map<String, ? extends Object> map) {
        super(0);
        this.LL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C840640WyM c840640WyM = C840640WyM.LIZ;
        Map map = (Map) this.LL.get("header");
        c840640WyM.getClass();
        return C840640WyM.LIZLLL(map);
    }
}
