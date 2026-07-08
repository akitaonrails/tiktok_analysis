package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDN extends C09AY implements Function0<Integer> {
    public C0CDN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C0CD2.LJFF().getInt("optimize_downdgrade_firebaseminutes", -1));
    }
}
