package X;

import com.ss.android.ugc.aweme.feed.ab.FeedDiggNoNetExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849610yER extends C09AY implements Function0<C08I9> {
    public C1849610yER() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C08I9 invoke() {
        FeedDiggNoNetExp.DiggNoNetConfig diggNoNetConfigLIZ = FeedDiggNoNetExp.LIZ();
        return new C08I9(diggNoNetConfigLIZ != null ? diggNoNetConfigLIZ.cacheLimitSize : 30);
    }
}
