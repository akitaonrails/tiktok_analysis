package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0VCG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCG {
    public final LinkedList<C0VCJ> LIZ = new LinkedList<>();
    public final LinkedList<C0VCO> LIZIZ = new LinkedList<>();
    public final LinkedList<C0VCF> LIZJ = new LinkedList<>();
    public final int LIZLLL = 200;
    public boolean LJ;

    public final void LIZ(final C0VCC c0vcc) {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        C793980VCq.LIZ.LIZIZ(new Runnable() { // from class: X.0VCH
            public final void LIZ() {
                LinkedList<C0VCJ> linkedList;
                LinkedList<C0VCO> linkedList2;
                LinkedList<C0VCF> linkedList3;
                try {
                    synchronized (this.LLILLJJLI.LIZ) {
                        try {
                            linkedList = new LinkedList(this.LLILLJJLI.LIZ);
                            this.LLILLJJLI.LIZ.clear();
                        } finally {
                        }
                    }
                    for (C0VCJ c0vcj : linkedList) {
                        C0VCG c0vcg = this.LLILLJJLI;
                        C0VCC c0vcc2 = c0vcc;
                        c0vcg.getClass();
                        if (c0vcj != null && !TextUtils.isEmpty(c0vcj.LIZIZ)) {
                            c0vcc2.LJIIL(c0vcj);
                        }
                    }
                    synchronized (this.LLILLJJLI.LIZIZ) {
                        try {
                            linkedList2 = new LinkedList(this.LLILLJJLI.LIZIZ);
                            this.LLILLJJLI.LIZIZ.clear();
                        } finally {
                        }
                    }
                    for (C0VCO c0vco : linkedList2) {
                        C0VCG c0vcg2 = this.LLILLJJLI;
                        C0VCC c0vcc3 = c0vcc;
                        c0vcg2.getClass();
                        C0VCG.LIZIZ(c0vcc3, c0vco);
                    }
                    synchronized (this.LLILLJJLI.LIZJ) {
                        try {
                            linkedList3 = new LinkedList(this.LLILLJJLI.LIZJ);
                            this.LLILLJJLI.LIZJ.clear();
                        } finally {
                        }
                    }
                    for (C0VCF c0vcf : linkedList3) {
                        C0VCG c0vcg3 = this.LLILLJJLI;
                        C0VCC c0vcc4 = c0vcc;
                        c0vcg3.getClass();
                        if (c0vcf != null && !TextUtils.isEmpty(c0vcf.LIZIZ)) {
                            if (c0vcf.LIZIZ.equals("api_error")) {
                                c0vcc4.LJ(c0vcf);
                            } else if (c0vcf.LIZIZ.equals("api_all")) {
                                c0vcc4.LJFF(c0vcf);
                            }
                        }
                    }
                } catch (Throwable th) {
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CacheData@8023.handleCacheData$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CacheData@8023.handleCacheData$1");
            }
        });
    }

    public final void LIZJ(C0VCF c0vcf) {
        synchronized (this.LIZJ) {
            try {
                if (this.LIZJ.size() > this.LIZLLL) {
                    this.LIZJ.poll();
                }
                this.LIZJ.add(c0vcf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(C0VCJ c0vcj) {
        synchronized (this.LIZ) {
            try {
                if (this.LIZ.size() > this.LIZLLL) {
                    this.LIZ.poll();
                }
                this.LIZ.add(c0vcj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(C0VCC c0vcc, C0VCO c0vco) {
        if (c0vco == null) {
            return;
        }
        c0vcc.getClass();
        try {
            if (c0vcc.LJII != null && !TextUtils.isEmpty(null) && c0vcc.LJII.opt(null) != null) {
                C793910VCj.LIZ.LIZIZ(c0vco.LIZIZ(c0vcc.LJJII), CastLongProtector.parseLong(c0vcc.LJIL));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
