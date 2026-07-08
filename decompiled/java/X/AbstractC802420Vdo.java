package X;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Vdo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC802420Vdo {
    public final C802620Ve8 LIZ;
    public final C0VSJ LIZIZ;
    public final long LIZJ;
    public final C802640VeA LIZLLL;

    public abstract boolean LIZIZ(boolean z);

    public abstract void LJ(long j, boolean z, C0VSJ c0vsj, int i, int i2);

    public static void LIZ(C0VSJ c0vsj) {
        String strLJFF = C2112008Pe.LJFF(c0vsj);
        if (TextUtils.isEmpty(strLJFF)) {
            return;
        }
        Iterator<C802680VeE> it2 = C802680VeE.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            Iterator<ICrashCallback> it3 = it2.next().LIZJ.LJFF(CrashType.ANR).iterator();
            while (it3.hasNext()) {
                try {
                    it3.next().onCrash(CrashType.ANR, strLJFF, null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public final long LIZJ(File file) {
        if (file != null && file.exists()) {
            long jLIZJ = C802620Ve8.LIZJ(file.getName());
            file.renameTo(new C0VSJ(this.LIZIZ, "anr_info.txt"));
            return jLIZJ;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC802420Vdo.LIZLLL(int, int):void");
    }

    public AbstractC802420Vdo(C802620Ve8 c802620Ve8, C0VSJ c0vsj, long j, boolean z) {
        this.LIZ = c802620Ve8;
        this.LIZJ = j;
        C0VSJ c0vsjLIZIZ = C2112008Pe.LIZIZ(C2112008Pe.LIZIZ(c0vsj, C802600Ve6.LIZ()), String.valueOf(j));
        this.LIZIZ = c0vsjLIZIZ;
        this.LIZLLL = new C802640VeA(j, c0vsjLIZIZ, z);
    }
}
