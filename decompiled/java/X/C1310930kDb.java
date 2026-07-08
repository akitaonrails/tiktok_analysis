package X;

import com.lynx.tasm.eventreport.LynxEventReporter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0kDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310930kDb {
    public static final C01GW<Long> LJ = C452501pT.LIZIZ(new C1310920kDa());
    public final InterfaceC1631620sYq<Long, Integer, Long, Unit> LIZ;
    public int LIZIZ;
    public long LIZJ;
    public volatile boolean LIZLLL;

    public final void LIZ() {
        if (this.LIZLLL) {
            final C238400w2 c238400w2 = new C238400w2();
            long jLongValue = ((long) (this.LIZIZ + 1)) * LJ.getValue().longValue();
            c238400w2.element = jLongValue;
            if (jLongValue > 7200) {
                c238400w2.element = 7200L;
            }
            LynxEventReporter.delayRunOnReportThread(new Runnable() { // from class: X.0kDc
                @Override // java.lang.Runnable
                public final void run() {
                    C1310930kDb c1310930kDb = this.LL;
                    C238400w2 c238400w22 = c238400w2;
                    C1C7U.LIZ("LynxMemoryReportTimer@8824.scheduleNextReport$1L");
                    if (c1310930kDb.LIZLLL) {
                        c1310930kDb.LIZJ += c238400w22.element;
                        c1310930kDb.LIZIZ++;
                        c1310930kDb.LIZ.invoke(Long.valueOf(C1310930kDb.LJ.getValue().longValue()), Integer.valueOf(c1310930kDb.LIZIZ), Long.valueOf(c1310930kDb.LIZJ));
                        c1310930kDb.LIZ();
                    }
                    C1C7U.LIZIZ("LynxMemoryReportTimer@8824.scheduleNextReport$1L");
                }
            }, c238400w2.element * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    public C1310930kDb(InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LIZ = interfaceC1631620sYq;
    }
}
