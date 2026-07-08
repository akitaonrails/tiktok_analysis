package X;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.189v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212393189v extends C09AY implements Function0<LruCache<String, C212394189w>> {
    public final /* synthetic */ C212392189u LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C212393189v(C212392189u c212392189u) {
        super(0);
        this.LL = c212392189u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, C212394189w> invoke() {
        return new LruCache<>(this.LL.LIZIZ);
    }
}
