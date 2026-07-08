package X;

import com.ss.android.ugc.aweme.memory.MemoryOptWhenAnrABParameters;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188691AlH extends C09AY implements Function0<MemoryOptWhenAnrABParameters> {
    public C2188691AlH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.memory.MemoryOptWhenAnrABParameters, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MemoryOptWhenAnrABParameters invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        MemoryOptWhenAnrABParameters memoryOptWhenAnrABParameters = C2188671AlF.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(MemoryOptWhenAnrABParameters.class, memoryOptWhenAnrABParameters, "memory_optimize_when_anr", true);
        return LJJII != 0 ? LJJII : memoryOptWhenAnrABParameters;
    }
}
