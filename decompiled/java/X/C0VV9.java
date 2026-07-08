package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VV9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VV9 extends AbstractC791320V2k implements InterfaceC792700V7s {
    public static final C01GW<C0VV9> LLILZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(354));
    public final List<C0VVA> LLILLJJLI = new ArrayList();
    public boolean LLILLL;

    @Override // X.InterfaceC792700V7s
    public final void LIZLLL(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJII(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIJ(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityStarted(Activity activity) {
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILJJIL(String str) {
        this.LL = true;
        if (this.LLILLL) {
            for (C0VVA c0vva : (ArrayList) this.LLILLJJLI) {
                if (c0vva.LJFF) {
                    try {
                        C0VV8 c0vv8 = c0vva.LIZJ;
                        if (c0vv8 != null && C791390V2r.LJJIII.LIZIZ.LIZIZ()) {
                            c0vv8.LIZLLL = true;
                        }
                        C0VV8 c0vv82 = c0vva.LIZIZ;
                        c0vv82.LIZ = AbstractC791470V2z.LIZIZ;
                        c0vv82.LIZIZ = str;
                        c0vv82.LIZJ = -1L;
                        c0vv82.LIZLLL = false;
                        c0vv82.LJ = false;
                        c0vv82.LJFF = false;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
        this.LL = false;
        if (this.LLILLL) {
            for (C0VVA c0vva : (ArrayList) this.LLILLJJLI) {
                if (c0vva.LJFF) {
                    try {
                        C0VV8 c0vv8 = c0vva.LIZJ;
                        if (c0vv8 != null) {
                            if (z) {
                                c0vv8.LJ = true;
                            }
                            if (c0vva.LIZLLL.size() > 20000) {
                                c0vva.LIZLLL.poll();
                            }
                            c0vva.LIZLLL.add(c0vv8);
                            c0vva.LIZJ = null;
                        }
                        C0VV8 c0vv82 = c0vva.LIZIZ;
                        long j5 = c0vv82.LIZ;
                        if (j5 >= 0) {
                            long j6 = AbstractC791470V2z.LIZIZ;
                            c0vv82.LIZJ = j6;
                            if (j6 - j5 > c0vva.LJIIIZ) {
                                C0VV8 c0vv83 = new C0VV8(j5, c0vv82.LIZIZ);
                                c0vv83.LIZJ = j6;
                                c0vv83.LJFF = c0vv82.LJFF;
                                c0vv83.LIZLLL = c0vv82.LIZLLL;
                                c0vv83.LJ = c0vv82.LJ;
                                c0vva.LIZJ = c0vv83;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }
}
