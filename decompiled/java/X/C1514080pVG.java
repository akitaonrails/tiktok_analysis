package X;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514080pVG extends C09AY implements Function0<LruCache<String, Integer>> {
    public C1514080pVG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, Integer> invoke() {
        return new LruCache<>(20);
    }
}
