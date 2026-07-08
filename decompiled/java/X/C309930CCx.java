package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309930CCx extends C09AY implements Function0<Boolean> {
    public C309930CCx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getBoolean("optimize_preloadfeedcache", false));
    }
}
