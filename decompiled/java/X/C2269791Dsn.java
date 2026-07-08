package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import com.ss.android.ugc.feed.platform.ab.DowngradeConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269791Dsn extends C09AY implements Function0<List<? extends ComponentStrategy>> {
    public C2269791Dsn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ComponentStrategy> invoke() {
        return ((DowngradeConfig) C2269801Dso.LIZIZ.getValue()).downgradeComponents;
    }
}
