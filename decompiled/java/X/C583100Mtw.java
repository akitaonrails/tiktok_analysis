package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.experiment.FeedPlayProgressContinueConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mtw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583100Mtw extends C09AY implements Function0<LruCache<String, C582220MsW>> {
    public C583100Mtw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, C582220MsW> invoke() {
        C583820Mv6.LIZ.getClass();
        return new LruCache<>(((FeedPlayProgressContinueConfig) C583820Mv6.LIZIZ.getValue()).maxCount);
    }
}
