package X;

import android.hardware.display.DisplayManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176031AEf extends C09AY implements Function0<DisplayManager> {
    public C2176031AEf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.hardware.display.DisplayManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ DisplayManager invoke() {
        C844470XAv.LIZ.getClass();
        ?? H2 = C786410Ut5.H2(C844470XAv.LIZ(), "display");
        if (H2 instanceof DisplayManager) {
            return H2;
        }
        return null;
    }
}
