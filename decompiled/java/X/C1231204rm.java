package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231204rm extends C09AY implements Function0<String> {
    public C1231204rm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String string;
        Integer num = C844470XAv.LIZJ;
        if (num != null) {
            int iIntValue = num.intValue();
            C844470XAv.LIZ.getClass();
            try {
                Application application = C844470XAv.LIZIZ;
                if (application == null) {
                    application = null;
                }
                string = application.getString(iIntValue);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                string = "";
            }
            if (string != null) {
                return string;
            }
        }
        return "";
    }
}
