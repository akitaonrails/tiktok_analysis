package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AGV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0AGV extends C09AY implements Function0<Integer> {
    public C0AGV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "mallopt_purge_native_level", true));
    }
}
