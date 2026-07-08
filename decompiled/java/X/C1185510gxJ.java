package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185510gxJ {
    public final C1185780gxk LIZ;
    public final C603820NmG<String, C1185690gxb> LIZIZ;

    public C1185510gxJ(C1185780gxk c1185780gxk) {
        int iIntValue;
        this.LIZ = c1185780gxk;
        Integer numValueOf = Integer.valueOf(c1185780gxk.LIZJ);
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 4;
        }
        this.LIZIZ = new C603820NmG<>(iIntValue);
    }

    public final Pair<SlashPage, EnumC1202700hP2> LIZ(String str) {
        Pair<SlashPage, EnumC1202700hP2> pair = null;
        if (this.LIZIZ.LIZJ(str) == null) {
            return null;
        }
        synchronized (this) {
            try {
                C1185690gxb c1185690gxbLIZJ = this.LIZIZ.LIZJ(str);
                if (c1185690gxbLIZJ == null) {
                    return null;
                }
                if (LIZIZ(c1185690gxbLIZJ.LIZ)) {
                    pair = new Pair<>(c1185690gxbLIZJ.LIZIZ, c1185690gxbLIZJ.LIZJ);
                } else {
                    this.LIZIZ.LJ(str);
                }
                return pair;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZIZ(long j) {
        if (System.currentTimeMillis() - j <= this.LIZ.LIZIZ) {
            return true;
        }
        return false;
    }
}
