package X;

import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726430v1l extends C09AY implements Function0<Boolean> {
    public C1726430v1l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String strLIZ = C2222691Bz1.LIZ();
        return Boolean.valueOf(Intrinsics.LJFF(strLIZ != null ? strLIZ.toUpperCase(Locale.ROOT) : null, "ID"));
    }
}
