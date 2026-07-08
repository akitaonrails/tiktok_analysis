package X;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18DD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DD extends C09AY implements Function0<C18G6> {
    public C18DD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C18G6 invoke() {
        Application applicationLIZIZ = C18IP.LIZ.LIZIZ();
        if (applicationLIZIZ != null) {
            return new C18G6(applicationLIZIZ, "btm_page_show");
        }
        return null;
    }
}
