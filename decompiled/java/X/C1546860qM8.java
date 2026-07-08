package X;

import android.app.Application;
import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546860qM8 extends C09AY implements Function0<C1546870qM9> {
    public C1546860qM8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1546870qM9 invoke() {
        Application application;
        Object obj;
        C1540360qBe c1540360qBe = SparkI18nManager.LIZLLL;
        if (c1540360qBe == null || (application = c1540360qBe.LIZIZ) == null) {
            return null;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(application.getCacheDir(), "spark_i18n_res");
            c0vsj.mkdirs();
            C189200o6.m2constructorimpl(c0vsj);
            obj = c0vsj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        File file = (File) obj2;
        if (file != null) {
            return new C1546870qM9(file);
        }
        return null;
    }
}
