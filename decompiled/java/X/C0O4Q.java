package X;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O4Q extends C09AY implements Function0<C0O4R> {
    public final /* synthetic */ C0O4P<PO> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O4Q(C0O4P<PO> c0o4p) {
        super(0);
        this.LL = c0o4p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0O4R] */
    @Override // kotlin.jvm.functions.Function0
    public final C0O4R invoke() {
        final int i = this.LL.LIZIZ;
        return new LruCache<String, C0O4V<Object>>(i) { // from class: X.0O4R
        };
    }
}
