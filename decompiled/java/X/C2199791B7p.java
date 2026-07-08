package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.1B7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199791B7p {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final List<RunnableC2199701B7g> LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public final AtomicLong LJIIIZ;

    public final synchronized int LIZ() {
        return this.LJ.size();
    }

    public final synchronized void LIZJ() {
        this.LJI = false;
    }

    public final String LIZIZ() {
        if (this.LJIIIIZZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append("_");
            String str = this.LIZIZ;
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append("_");
            sbLIZ.append(this.LIZLLL);
            this.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.LJIIIIZZ;
    }

    public final int hashCode() {
        if (this.LJII == 0) {
            this.LJII = LIZIZ().hashCode();
        }
        return this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlRecord{url='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", ip='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", ipFamily='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", isMainUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failedTimes=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isCurrentFailed=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized void LIZLLL(RunnableC2199701B7g runnableC2199701B7g) {
        try {
            this.LJ.remove(runnableC2199701B7g);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final synchronized void LJ(RunnableC2199701B7g runnableC2199701B7g) {
        this.LJ.add(runnableC2199701B7g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2199791B7p)) {
            return false;
        }
        return LIZIZ().equals(((C2199791B7p) obj).LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2199791B7p(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.LJ = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.LJIIIZ = r0
            r3.LIZ = r4
            r2 = 0
            r3.LIZLLL = r2
            r3.LIZIZ = r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L35
            java.lang.String r0 = "."
            int r1 = r5.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L31
            if (r1 <= 0) goto L35
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L31
            if (r1 >= r0) goto L35
            java.lang.String r0 = r5.substring(r2, r1)     // Catch: java.lang.Throwable -> L31
            goto L36
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L35:
            r0 = 0
        L36:
            r3.LIZJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199791B7p.<init>(java.lang.String, java.lang.String):void");
    }

    public C2199791B7p(String str, boolean z) {
        this.LJ = new ArrayList();
        this.LJIIIZ = new AtomicLong();
        this.LIZ = str;
        this.LIZLLL = z;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}
