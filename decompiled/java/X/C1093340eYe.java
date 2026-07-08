package X;

import Y.ARunnableS117S0100000_17;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093340eYe implements InterfaceC1093320eYc {
    public final String LIZ;
    public boolean LIZIZ = false;
    public final C1093350eYf LIZJ;
    public UUID LIZLLL;

    @Override // X.InterfaceC1093320eYc
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop ticker trigger name=");
        sbLIZ.append(this.LIZ);
        C227400uG.LIZ("TickerTrigger", C2188811AlT.LIZIZ(sbLIZ));
        UUID uuid = this.LIZLLL;
        if (uuid != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) ((ConcurrentHashMap) this.LIZJ.LIZIZ).remove(uuid);
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            C1093350eYf c1093350eYf = this.LIZJ;
            c1093350eYf.LIZ.shutdownNow();
            ((ConcurrentHashMap) c1093350eYf.LIZIZ).clear();
            this.LIZLLL = null;
        }
        this.LIZIZ = true;
    }

    @Override // X.InterfaceC1093320eYc
    public final EnumC1093260eYW LIZ() {
        return EnumC1093260eYW.TICKER;
    }

    @Override // X.InterfaceC1093320eYc
    public final boolean isFrozen() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1093320eYc
    public final boolean LIZIZ(C473440IhS c473440IhS) {
        if (C1093310eYb.LIZ(this, c473440IhS) && Intrinsics.LJFF(c473440IhS.LJ, this.LIZ)) {
            return true;
        }
        return false;
    }

    public C1093340eYe(String str, Long l) {
        long jLongValue;
        this.LIZ = str;
        C1093350eYf c1093350eYf = new C1093350eYf();
        this.LIZJ = c1093350eYf;
        if (this.LIZLLL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start ticker trigger name=");
            sbLIZ.append(str);
            sbLIZ.append(", interval=");
            long jLongValue2 = 60000;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 60000;
            }
            sbLIZ.append(jLongValue);
            C227400uG.LIZ("TickerTrigger", C2188811AlT.LIZIZ(sbLIZ));
            if (l != null && l.longValue() > 0) {
                jLongValue2 = l.longValue() * 1000;
            }
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 295);
            UUID uuidRandomUUID = UUID.randomUUID();
            ((ConcurrentHashMap) c1093350eYf.LIZIZ).put(uuidRandomUUID, c1093350eYf.LIZ.scheduleWithFixedDelay(aRunnableS117S0100000_17, 0L, jLongValue2, TimeUnit.MILLISECONDS));
            this.LIZLLL = uuidRandomUUID;
        }
    }
}
