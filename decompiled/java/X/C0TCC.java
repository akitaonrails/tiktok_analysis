package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TCC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCC extends C09AY implements Function1<Aweme, Boolean> {
    public C0TCC() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        boolean zB3;
        Aweme aweme2 = aweme;
        boolean z = false;
        if (aweme2.isAd()) {
            C14ZO.LIZ.getClass();
            try {
                zB3 = C1047660dMy.LIZIZ.b3(aweme2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                zB3 = false;
            }
            if (zB3) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
