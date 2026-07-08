package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493650oyJ implements InterfaceC1493560oyA {
    public static volatile C1493650oyJ LJIIL;
    public final boolean LIZ;
    public boolean LIZIZ;
    public long LJ;
    public final Keva LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final Context LJIIJ;
    public boolean LIZJ = true;
    public volatile int LIZLLL = -1;
    public long LJFF = 10800;
    public EnumC1493670oyL LJIIJJI = EnumC1493670oyL.TNC_DISABLED;

    public C1493650oyJ(Context context) {
        KevaBuilder.getInstance().setContext(context);
        this.LIZ = C2104008Mc.LIZJ(context);
        this.LJI = KevaImpl.getRepo("tt_stack_config", 1);
        this.LJIIJ = context;
    }

    public static C1493650oyJ LIZIZ(Context context) {
        if (LJIIL == null) {
            synchronized (C1493650oyJ.class) {
                try {
                    if (LJIIL == null) {
                        LJIIL = new C1493650oyJ(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIL;
    }

    public final String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJII);
        sbLIZ.append("_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(boolean z, boolean z2, int i) {
        try {
            if (this.LIZ) {
                this.LJI.storeBoolean("enable_stack_opt", z);
                this.LJI.storeBoolean("enable_stack_opt_fallback_fix", z2);
                this.LJI.storeLong("stack_opt_fallback_fix_interval_s", Long.valueOf(i).longValue());
            }
            if (this.LJIIIIZZ && this.LJIIIZ) {
                this.LJI.storeInt(LIZ("stack_opt_failures"), 0);
                this.LJI.storeLong(LIZ("stack_opt_failure_timestamp"), 0L);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
