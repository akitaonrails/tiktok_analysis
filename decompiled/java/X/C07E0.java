package X;

import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07E0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07E0 extends C09AY implements Function0<Boolean> {
    public C07E0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLIZ = C1785606z0.LIZ();
        Boolean bool = Boolean.TRUE;
        int i = Build.VERSION.SDK_INT;
        return C1827607Du.LJIIIIZZ(zLIZ, bool, i >= 28 && i <= 30, new C07E1());
    }
}
