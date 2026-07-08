package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.sdk.webview.di.IMainServiceForJsb;
import com.ss.android.ugc.aweme.services.MainServiceForJsb;

/* JADX INFO: renamed from: X.0dgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059990dgr {
    public static C1059990dgr LIZIZ;
    public IMainServiceForJsb LIZ;

    public static IMainServiceForJsb LIZ() {
        if (LIZIZ == null) {
            synchronized (C1059990dgr.class) {
                try {
                    if (LIZIZ == null) {
                        IMainServiceForJsb iMainServiceForJsbCreateIMainServiceForJsbbyMonsterPlugin = MainServiceForJsb.createIMainServiceForJsbbyMonsterPlugin(false);
                        if (iMainServiceForJsbCreateIMainServiceForJsbbyMonsterPlugin == null) {
                            throw new IllegalStateException("Please add serviceImpl for IMainServiceForJsb");
                        }
                        C1059990dgr c1059990dgr = new C1059990dgr(iMainServiceForJsbCreateIMainServiceForJsbbyMonsterPlugin);
                        LIZIZ = c1059990dgr;
                        c1059990dgr.LIZ = iMainServiceForJsbCreateIMainServiceForJsbbyMonsterPlugin;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ.LIZ;
    }

    public C1059990dgr(IMainServiceForJsb iMainServiceForJsb) {
        this.LIZ = iMainServiceForJsb;
    }
}
