package X;

import android.app.KeyguardManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176041AEg extends C09AY implements Function0<KeyguardManager> {
    public C2176041AEg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.KeyguardManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ KeyguardManager invoke() {
        C844470XAv.LIZ.getClass();
        ?? H2 = C786410Ut5.H2(C844470XAv.LIZ(), "keyguard");
        if (H2 instanceof KeyguardManager) {
            return H2;
        }
        return null;
    }
}
