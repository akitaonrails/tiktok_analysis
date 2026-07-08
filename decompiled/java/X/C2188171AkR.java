package X;

import com.ss.android.ugc.aweme.experiment.HeapGcRegulatorConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188171AkR extends C09AY implements Function0<HeapGcRegulatorConfig> {
    public C2188171AkR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.HeapGcRegulatorConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final HeapGcRegulatorConfig invoke() {
        ?? LJJIIJ = C0C64.LJIILLIIL().LJJIIJ(true, "heap_gc_regulator", 31744, HeapGcRegulatorConfig.class, null, 2);
        if (LJJIIJ == 0) {
            return null;
        }
        return LJJIIJ;
    }
}
