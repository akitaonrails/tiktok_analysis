package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import com.ss.android.ugc.feed.platform.ab.PanelDowngradeConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269821Dsq extends C09AY implements Function0<List<? extends ComponentStrategy>> {
    public C2269821Dsq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ComponentStrategy> invoke() {
        return ((PanelDowngradeConfig) C2269831Dsr.LIZIZ.getValue()).downgradeComponents;
    }
}
