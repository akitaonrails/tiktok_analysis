package X;

import java.util.concurrent.ForkJoinPool;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S9N, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S9N extends C09AY implements Function0<ForkJoinPool> {
    public C0S9N() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ForkJoinPool invoke() {
        return new ForkJoinPool(C0S9M.LIZ);
    }
}
