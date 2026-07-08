package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1482, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1482 implements Runnable {
    public final /* synthetic */ String LL;

    public AnonymousClass1482(String str) {
        this.LL = str;
    }

    public final void LIZ() {
        AnonymousClass1480 anonymousClass1480 = AnonymousClass1480.LIZ;
        String str = this.LL;
        C148A c148aLIZ = AnonymousClass1480.LIZ(str);
        AnonymousClass1487 anonymousClass1487 = c148aLIZ.LIZIZ;
        if (anonymousClass1487 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tick idle, stop timer business=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c148aLIZ.LIZJ = false;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("trailing-edge flush business=");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        AnonymousClass1480.LIZIZ(anonymousClass1487.LIZ, "observer_trailing_flush", str);
        c148aLIZ.LIZIZ = null;
        C067B.LIZ(anonymousClass1487);
        AnonymousClass1480.LIZIZ.schedule(new AnonymousClass1482(str), (long) (AnonymousClass1480.LIZ(str).LIZ.LIZJ * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ProbeObserverThrottler@f29b.scheduleTick$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProbeObserverThrottler@f29b.scheduleTick$1");
    }
}
