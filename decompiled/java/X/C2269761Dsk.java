package X;

import com.ss.android.ugc.feed.platform.ab.CellDowngradeConfig;
import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269761Dsk extends C09AY implements Function0<List<? extends ComponentStrategy>> {
    public C2269761Dsk() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ComponentStrategy> invoke() {
        return ((CellDowngradeConfig) C2269771Dsl.LIZIZ.getValue()).downgradeComponents;
    }
}
