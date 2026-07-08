package X;

/* JADX INFO: renamed from: X.1BDK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BDK implements Runnable, Comparable<C1BDK> {
    public final C1BCC LL;
    public final C1BDN LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;

    public final void LIZJ() {
        this.LLILLJJLI.LIZIZ(this);
        this.LLILZIL = System.currentTimeMillis();
        this.LL.run();
        this.LLILZLL = System.currentTimeMillis() - this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("taskName: ");
        sbLIZ.append(this.LL.LLJIJIL);
        sbLIZ.append("， taskId： ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", waitTime: ");
        sbLIZ.append(this.LLILZIL - this.LLILZ);
        sbLIZ.append(", costTime: ");
        sbLIZ.append(this.LLILZLL);
        C2188811AlT.LIZIZ(sbLIZ);
        C2200821BBo.LIZ.getClass();
        C1BDO c1bdo = C2200821BBo.LJIL;
        if (c1bdo != null) {
            C1BDL c1bdl = new C1BDL();
            C1BCC c1bcc = this.LL;
            c1bdl.LIZ = c1bcc.LLJIJIL;
            c1bdl.LIZIZ = this.LLILZIL - this.LLILZ;
            c1bdl.LIZJ = this.LLILZLL;
            c1bdl.LIZLLL = c1bcc.LLILZ.getPriority();
            if (!this.LL.LLJILJILJ.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String str : this.LL.LLJILJILJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(',');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
                c1bdl.LJ = sb.toString();
            }
            c1bdo.LIZ(c1bdl);
        }
        this.LLILLJJLI.LIZLLL(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("WrapperMiloTask@b5c6.run");
        try {
            LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WrapperMiloTask@b5c6.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("taskName: ");
        sbLIZ.append(this.LL.LLJIJIL);
        sbLIZ.append(", resType: ");
        sbLIZ.append(this.LL.LLILLJJLI);
        sbLIZ.append(", priority: ");
        sbLIZ.append(this.LL.LLILZ.getPriority());
        sbLIZ.append(", schedulerType: ");
        sbLIZ.append(this.LL.LLILZIL);
        sbLIZ.append(", submitTime: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", taskid: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", dependenciesTaskId: ");
        sbLIZ.append(this.LL.LLILLL);
        sbLIZ.append(", executeStartTime: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", executeCostTime: ");
        sbLIZ.append(this.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1BDK c1bdk) {
        C1BDK c1bdk2 = c1bdk;
        if (c1bdk2 == null) {
            return 1;
        }
        if (this.LL.LLILZ.getPriority() == c1bdk2.LL.LLILZ.getPriority()) {
            return (int) (this.LLILZ - c1bdk2.LLILZ);
        }
        return c1bdk2.LL.LLILZ.getPriority() - this.LL.LLILZ.getPriority();
    }

    public C1BDK(C1BCC c1bcc, C1BDN c1bdn) {
        this.LL = c1bcc;
        this.LLILLJJLI = c1bdn;
    }
}
