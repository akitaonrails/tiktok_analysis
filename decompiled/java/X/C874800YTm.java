package X;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874800YTm extends C09AY implements Function0<LruCache<String, C874830YTp>> {
    public C874800YTm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, C874830YTp> invoke() {
        return new LruCache<>(30);
    }
}
