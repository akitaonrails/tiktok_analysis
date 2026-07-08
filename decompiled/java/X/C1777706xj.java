package X;

import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1777706xj extends C09AY implements Function0<Integer> {
    public C1777706xj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Integer, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return C1827607Du.LIZJ(C1787906zN.LIZ() && Build.VERSION.SDK_INT >= 24, 1, new C1772706wv());
    }
}
