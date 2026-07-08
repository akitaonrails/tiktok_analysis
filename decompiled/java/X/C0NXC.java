package X;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NXC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NXC extends C09AY implements Function0<LruCache<String, C0NX7>> {
    public final /* synthetic */ C0NXA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NXC(C0NXA c0nxa) {
        super(0);
        this.LL = c0nxa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, C0NX7> invoke() {
        return new LruCache<>(Math.max(C595320NWo.LIZ(this.LL.LJ).LIZ, 50));
    }
}
