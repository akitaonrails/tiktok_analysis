package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0qG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543150qG9 {
    public EnumC1063540dma LIZ;
    public final Set<String> LIZIZ;
    public final Set<String> LIZJ;

    public C1543150qG9() {
        this(null, 7);
    }

    public C1543150qG9(EnumC1063540dma enumC1063540dma, int i) {
        LinkedHashSet linkedHashSet;
        enumC1063540dma = (i & 1) != 0 ? EnumC1063540dma.PUBLIC : enumC1063540dma;
        if ((i & 2) != 0) {
            linkedHashSet = new LinkedHashSet();
        } else {
            linkedHashSet = null;
        }
        LinkedHashSet linkedHashSet2 = (i & 4) != 0 ? new LinkedHashSet() : null;
        this.LIZ = enumC1063540dma;
        this.LIZIZ = linkedHashSet;
        this.LIZJ = linkedHashSet2;
    }
}
