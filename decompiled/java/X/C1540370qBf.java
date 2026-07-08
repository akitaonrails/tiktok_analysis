package X;

import android.app.Application;
import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540370qBf extends C09AY implements Function0<C1546840qM6> {
    public C1540370qBf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1546840qM6 invoke() {
        Application application;
        C1540360qBe c1540360qBe = SparkI18nManager.LIZLLL;
        if (c1540360qBe == null || (application = c1540360qBe.LIZIZ) == null) {
            return null;
        }
        return new C1546840qM6(new Forest(application, new C1533560q0g("", (C1533570q0h) null, 6)));
    }
}
