package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.os.Handler;
import com.bytedance.android.livesdk.performance.memory.MemoryTriggerSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177641AKk {
    public final C2177651AKl LIZ;
    public final C2177571AKd LIZIZ;
    public final Context LIZJ;
    public final long LIZLLL;
    public final Handler LJ;
    public final ARunnableS133S0100000_33 LJFF = new ARunnableS133S0100000_33(this, 129);

    public final void LIZ() {
        try {
            C2177651AKl c2177651AKl = this.LIZ;
            Context context = this.LIZJ;
            c2177651AKl.getClass();
            C1776980wLI c1776980wLILIZLLL = C2177651AKl.LIZLLL(context);
            if (c1776980wLILIZLLL.LIZJ <= 0) {
                C786410Ut5.LJLIIL(MemoryTriggerSetting.INSTANCE.getNormalIntervalMs(), this.LJ, this.LJFF);
                return;
            }
            EnumC2177591AKf enumC2177591AKf = c1776980wLILIZLLL.LIZ;
            if (enumC2177591AKf != EnumC2177591AKf.NORMAL) {
                C2177651AKl c2177651AKl2 = this.LIZ;
                C1776970wLH c1776970wLH = new C1776970wLH(EnumC2177591AKf.NONE, -1L, -1L);
                c2177651AKl2.getClass();
                this.LIZIZ.LIZ(EnumC1783030wV3.SCHEDULED, C2177651AKl.LIZ(c1776970wLH, c1776980wLILIZLLL), this.LIZLLL, EnumC1153480g7e.LIVEHOST);
            }
            C786410Ut5.LJLIIL(C2177631AKj.LIZ[enumC2177591AKf.ordinal()] == 1 ? MemoryTriggerSetting.INSTANCE.getNormalIntervalMs() * ((long) 2) : MemoryTriggerSetting.INSTANCE.getNormalIntervalMs(), this.LJ, this.LJFF);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("MemoryTrigger", "Error in scheduled check", e);
            C786410Ut5.LJLIIL(MemoryTriggerSetting.INSTANCE.getNormalIntervalMs(), this.LJ, this.LJFF);
        }
    }

    public C2177641AKk(C2177651AKl c2177651AKl, C2177571AKd c2177571AKd, Context context, long j, Handler handler) {
        this.LIZ = c2177651AKl;
        this.LIZIZ = c2177571AKd;
        this.LIZJ = context;
        this.LIZLLL = j;
        this.LJ = handler;
    }
}
