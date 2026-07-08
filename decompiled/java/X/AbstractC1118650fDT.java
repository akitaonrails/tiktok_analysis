package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fDT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1118650fDT implements InterfaceC1113260f4m {
    public final double LIZ;
    public long LIZJ;
    public boolean LJ;
    public final Map<Long, C1118690fDX> LIZIZ = new LinkedHashMap();
    public final C1118680fDW LIZLLL = new C1118680fDW();

    public final void LIZJ() {
        if (this.LJ) {
            return;
        }
        long jUptimeMillis = (SystemClock.uptimeMillis() - this.LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        Map<Long, C1118690fDX> map = this.LIZIZ;
        Long lValueOf = Long.valueOf(jUptimeMillis);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c1118690fDX = linkedHashMap.get(lValueOf);
        if (c1118690fDX == null) {
            c1118690fDX = new C1118690fDX();
            linkedHashMap.put(lValueOf, c1118690fDX);
        }
        ((C1118690fDX) c1118690fDX).LIZ++;
    }

    @Override // X.InterfaceC1113260f4m
    public final void start() {
        this.LIZJ = SystemClock.uptimeMillis();
        this.LJ = new SecureRandom().nextDouble() > this.LIZ;
    }

    public AbstractC1118650fDT(double d) {
        this.LIZ = d;
    }

    @Override // X.InterfaceC1113260f4m
    public final void LIZ(Map<String, String> map) {
        int i;
        int i2;
        if (this.LJ) {
            return;
        }
        long jUptimeMillis = (SystemClock.uptimeMillis() - this.LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j = 0;
        if (0 <= jUptimeMillis) {
            i = 0;
            while (true) {
                C1118690fDX c1118690fDX = (C1118690fDX) ((LinkedHashMap) this.LIZIZ).get(Long.valueOf(j));
                if (c1118690fDX == null) {
                    c1118690fDX = new C1118690fDX();
                }
                int i3 = c1118690fDX.LIZ;
                i += i3;
                C1118680fDW c1118680fDW = this.LIZLLL;
                c1118680fDW.LIZIZ = Math.max(i3, c1118680fDW.LIZIZ);
                if ((this instanceof C1118660fDU) && (i2 = c1118690fDX.LIZ) != 0) {
                    C1118680fDW c1118680fDW2 = this.LIZLLL;
                    c1118680fDW2.LIZJ = Math.min(i2, c1118680fDW2.LIZJ);
                }
                if (j == jUptimeMillis) {
                    break;
                } else {
                    j++;
                }
            }
        } else {
            i = 0;
        }
        this.LIZLLL.LIZ = (i * 1.0f) / (jUptimeMillis + 1);
        LIZIZ(map);
        C1118680fDW c1118680fDW3 = this.LIZLLL;
        c1118680fDW3.LIZ = 0.0f;
        c1118680fDW3.LIZIZ = 0;
        c1118680fDW3.LIZJ = Integer.MAX_VALUE;
        ((LinkedHashMap) this.LIZIZ).clear();
        this.LJ = false;
    }
}
