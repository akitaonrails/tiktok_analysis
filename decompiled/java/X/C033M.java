package X;

import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.033M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C033M {
    public final BizIdentity LIZ;
    public final Map<C03CR, Map<String, Function1<String, AnonymousClass0329>>> LIZIZ;

    public C033M(BizIdentity bizIdentity) {
        this.LIZ = bizIdentity;
        C03CR c03cr = C03CR.US_FULL_SCREEN;
        Map<String, Function1<String, AnonymousClass0329>> map = C033S.LIZ;
        C03CR c03cr2 = C03CR.US_COMBINED_SKU;
        Map<String, Function1<String, AnonymousClass0329>> map2 = C033R.LIZ;
        C03CR c03cr3 = C03CR.SEA_FULL_SCREEN;
        Map<String, Function1<String, AnonymousClass0329>> map3 = C033Q.LIZ;
        C03CR c03cr4 = C03CR.SEA_COMBINED_SKU;
        Map<String, Function1<String, AnonymousClass0329>> map4 = C033L.LIZ;
        this.LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(c03cr, C033S.LIZ), new Pair(c03cr2, C033R.LIZ), new Pair(c03cr3, C033Q.LIZ), new Pair(c03cr4, C033L.LIZ));
    }
}
