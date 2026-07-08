package X;

import Y.ACallableS435S0100000_32;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.19IH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19IH implements InterfaceC2253451DHz {
    public final C563400M7u LIZ = new C563400M7u(0);
    public final ConcurrentHashMap<String, C19II> LIZIZ = new ConcurrentHashMap<>();
    public String LIZJ;
    public long LIZLLL;
    public long LJ;

    @Override // X.InterfaceC2253431DHx
    public final void end() {
        this.LJ = System.currentTimeMillis();
        C15O7.LIZJ(new ACallableS435S0100000_32(this, 0));
    }

    @Override // X.InterfaceC2253431DHx
    public final void LIZ(String... strArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : strArr) {
            C19II c19ii = this.LIZIZ.get(str);
            if (c19ii != null) {
                if (c19ii.LIZIZ == 0) {
                    c19ii.LIZIZ = jCurrentTimeMillis;
                    c19ii.LIZJ = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Finish -> ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Step ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" end timestamp already exists");
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                C19II c19ii2 = new C19II();
                c19ii2.LIZIZ = jCurrentTimeMillis;
                this.LIZIZ.put(str, c19ii2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Finish callback executed before ");
                sbLIZ3.append(str);
                sbLIZ3.append(" start");
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }

    @Override // X.InterfaceC2253431DHx
    public final void LIZIZ(String... strArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LIZIZ.size() == 0) {
            this.LIZLLL = jCurrentTimeMillis;
        }
        for (String str : strArr) {
            C19II c19ii = this.LIZIZ.get(str);
            if (c19ii != null) {
                if (c19ii.LIZ > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Step ");
                    sbLIZ.append(str);
                    sbLIZ.append(" start timestamp already exists");
                    C2188811AlT.LIZIZ(sbLIZ);
                } else if (c19ii.LIZIZ > 0) {
                    c19ii.LIZ = jCurrentTimeMillis;
                    c19ii.LIZJ = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Start callback executed after ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" finish");
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                C19II c19ii2 = new C19II();
                c19ii2.LIZ = jCurrentTimeMillis;
                this.LIZIZ.put(str, c19ii2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Start -> ");
                sbLIZ3.append(str);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }
}
