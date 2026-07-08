package X;

import android.app.Application;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21246218Cm extends C09AY implements Function0<C18G6> {
    public C21246218Cm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C18G6 invoke() {
        Application applicationLIZIZ = C18IP.LIZ.LIZIZ();
        if (applicationLIZIZ != null) {
            return new C18G6(applicationLIZIZ, "btm_process_resume_cache");
        }
        return null;
    }
}
