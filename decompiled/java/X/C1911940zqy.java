package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911940zqy extends C09AY implements Function0<Boolean> {
    public C1911940zqy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Keva keva = C1911930zqx.LIZIZ;
        if (keva.contains("is_new_user_key")) {
            return Boolean.valueOf(keva.getBoolean("is_new_user_key", false));
        }
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        keva.storeBoolean("is_new_user_key", boolLIZLLL.booleanValue());
        return boolLIZLLL;
    }
}
