package X;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299570jvH extends C09AY implements Function0<SharedPreferences> {
    public C1299570jvH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        C1522030pi5 c1522030pi5 = C1299550jvF.LIZLLL;
        if (c1522030pi5 == null) {
            c1522030pi5 = null;
        }
        return C810670Vr7.LIZJ(c1522030pi5.LIZ, 0, "sp_lynx_settings_downloader");
    }
}
