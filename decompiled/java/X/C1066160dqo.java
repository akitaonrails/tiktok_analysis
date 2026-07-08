package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066160dqo {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC497601wk LJ;
    public final Context LJFF;
    public Drawable LJI;
    public Function0<Unit> LJII;

    public final void LIZ(Drawable drawable) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<C1066180dqq>>> concurrentHashMap = C1066190dqr.LJI;
        synchronized (concurrentHashMap) {
            try {
                ConcurrentHashMap<String, CopyOnWriteArrayList<C1066180dqq>> concurrentHashMap2 = concurrentHashMap.get(this.LIZ);
                if (concurrentHashMap2 != null) {
                    CopyOnWriteArrayList<C1066180dqq> copyOnWriteArrayList = concurrentHashMap2.get(this.LIZIZ);
                    if (copyOnWriteArrayList != null) {
                        for (C1066180dqq c1066180dqq : copyOnWriteArrayList) {
                            C1322100kVc c1322100kVc = c1066180dqq.LIZIZ.get();
                            if (c1322100kVc != null && Intrinsics.LJFF(c1322100kVc.getTag(-1420091667), this.LIZIZ)) {
                                InterfaceC497601wk interfaceC497601wk = this.LJ;
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1066170dqp(this, c1322100kVc, drawable, c1066180dqq, null), 2);
                            }
                        }
                    }
                    CopyOnWriteArrayList<C1066180dqq> copyOnWriteArrayList2 = concurrentHashMap2.get(this.LIZIZ);
                    if (copyOnWriteArrayList2 != null) {
                        C19719612Di.LJJIIJ(copyOnWriteArrayList2, new AwS595S0100000_16(this, 248), true);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1066160dqo(String str, String str2, String str3, boolean z, InterfaceC497601wk interfaceC497601wk, Context context) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = interfaceC497601wk;
        this.LJFF = context;
    }
}
