package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.power.applog.PowerLogger$start$1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTQ implements InterfaceC794610VFb, C0VT6 {
    public C0VA1 LIZIZ;
    public PowerLogger$start$1 LIZJ;
    public boolean LIZLLL;
    public C798290VTf LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public long LIZ = 30000;
    public String LJ = "";
    public String LJFF = "";
    public final C0VTO LJI = new Runnable() { // from class: X.0VTO
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("PowerLogger@8dfe.periodUploadRunnable$1");
            try {
                if (!C2214201BlK.LJIIJJI) {
                    C798300VTg.LIZ.getClass();
                    C798300VTg.LIZ();
                }
                PowerLogger$start$1 powerLogger$start$1 = this.LL.LIZJ;
                if (powerLogger$start$1 == null) {
                    powerLogger$start$1 = null;
                }
                C786410Ut5.LJLIIL(120000L, powerLogger$start$1, this);
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("PowerLogger@8dfe.periodUploadRunnable$1");
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0VTO] */
    public C0VTQ(Looper looper) {
    }

    @Override // X.C0VT6
    public final void LIZ(boolean z) {
        PowerLogger$start$1 powerLogger$start$1 = null;
        if (!this.LIZLLL && z) {
            PowerLogger$start$1 powerLogger$start$12 = this.LIZJ;
            if (powerLogger$start$12 == null) {
                powerLogger$start$12 = null;
            }
            C786410Ut5.LJLILLLLZI(powerLogger$start$12, 81);
        }
        if (this.LIZLLL && !z) {
            PowerLogger$start$1 powerLogger$start$13 = this.LIZJ;
            if (powerLogger$start$13 != null) {
                powerLogger$start$1 = powerLogger$start$13;
            }
            C786410Ut5.LJLILLLLZI(powerLogger$start$1, 81);
        }
        this.LIZLLL = z;
    }

    @Override // X.InterfaceC794610VFb
    public final void LIZIZ(String str, String str2) {
        if (str != null && str2 != null) {
            if (C2214201BlK.LJIIJJI) {
                str2 = "background";
                str = "unknown";
            }
            if (Intrinsics.LJFF(str, this.LJ) && Intrinsics.LJFF(str2, this.LJFF)) {
                return;
            }
            this.LJ = str;
            this.LJFF = str2;
            PowerLogger$start$1 powerLogger$start$1 = this.LIZJ;
            if (powerLogger$start$1 == null) {
                powerLogger$start$1 = null;
            }
            C786410Ut5.LJLILLLLZI(powerLogger$start$1, 81);
        }
    }
}
