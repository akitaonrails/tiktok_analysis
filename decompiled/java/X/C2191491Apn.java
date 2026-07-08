package X;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Apn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191491Apn extends C09AY implements Function0<C2191481Apm> {
    public C2191491Apn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Apm] */
    @Override // kotlin.jvm.functions.Function0
    public final C2191481Apm invoke() {
        return new AbstractC2191091Ap9() { // from class: X.1Apm
            public static long LIZJ(C2191511App c2191511App) {
                if (C2191131ApD.LIZ().shouldSubtractConnectTime) {
                    return (((c2191511App.getTotalTime() - c2191511App.getConnectTime()) - c2191511App.getSslTime()) - c2191511App.getDnsTime()) - c2191511App.getSendTime();
                }
                return c2191511App.getTotalTime();
            }

            @Override // X.AbstractC2191091Ap9
            public final C2191511App LIZ(Uri uri, long j, boolean z, C1494850p0F c1494850p0F) {
                String string = uri.toString();
                long j2 = c1494850p0F.LJIILLIIL;
                if (j2 < 0) {
                    j2 = 0;
                }
                long j3 = c1494850p0F.LJIIL;
                if (j3 < 0) {
                    j3 = 0;
                }
                long j4 = c1494850p0F.LJIIJ;
                if (j4 < 0) {
                    j4 = 0;
                }
                long j5 = c1494850p0F.LJIIJJI;
                if (j5 < 0) {
                    j5 = 0;
                }
                long j6 = c1494850p0F.LJIILIIL;
                if (j6 < 0) {
                    j6 = 0;
                }
                long j7 = c1494850p0F.LJIILL;
                if (j7 < 0) {
                    j7 = 0;
                }
                C2191511App c2191511App = new C2191511App(string, j, z, j2, j3, j4, j5, j6, j7);
                if (c2191511App.getContentLength() >= C2191131ApD.LIZ().ignoreBelowSize) {
                    if (C2191131ApD.LIZ().ignoreNotHitCdn && !c2191511App.getHitCdnCache()) {
                        return null;
                    }
                    if (C2191131ApD.LIZ().ignoreMaxCost > 0 && LIZJ(c2191511App) > C2191131ApD.LIZ().ignoreMaxCost) {
                        return null;
                    }
                    c2191511App.setSpeed(c2191511App.getContentLength() / LIZJ(c2191511App));
                    return c2191511App;
                }
                return null;
            }
        };
    }
}
