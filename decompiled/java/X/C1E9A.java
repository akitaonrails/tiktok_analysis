package X;

import com.ss.android.ugc.aweme.translation.exp.CLAPrefetchTaskMemoryOptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9A, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9A extends C09AY implements Function0<Boolean> {
    public C1E9A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((CLAPrefetchTaskMemoryOptConfig) C1E9C.LIZIZ.getValue()).enableClaPrefetchTaskMemoryOpt);
    }
}
