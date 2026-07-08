package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TCD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCD extends C09AY implements Function1<Aweme, Boolean> {
    public C0TCD() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        boolean zZ2;
        Aweme aweme2 = aweme;
        boolean z = false;
        if (aweme2.isAd()) {
            C14ZO.LIZ.getClass();
            try {
                zZ2 = C1047660dMy.LIZIZ.Z2(aweme2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                zZ2 = false;
            }
            if (zZ2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
