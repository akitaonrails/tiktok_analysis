package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CD5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CD5 extends C09AY implements Function0<Integer> {
    public C0CD5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C0CD2.LJFF().getInt("net_pre_connect_opt_interval", C0CD4.LIZ.interval));
    }
}
