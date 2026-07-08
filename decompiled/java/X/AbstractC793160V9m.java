package X;

import com.bytedance.apm6.cpu.ApmCpuManager;

/* JADX INFO: renamed from: X.0V9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793160V9m extends AbstractC793120V9i {
    public C0V9K LIZIZ;
    public final C793150V9l LIZJ;
    public boolean LIZLLL;

    public abstract long LJFF();

    public abstract boolean LJI(boolean z);

    public abstract boolean LJII();

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZLLL() {
        super.LIZLLL();
        C792490V6x.LIZ(EnumC792970V8t.CPU).LIZIZ(this.LIZJ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0V9l] */
    public AbstractC793160V9m(C793100V9g c793100V9g) {
        super(c793100V9g);
        final long jLJFF = LJFF();
        final long jLJFF2 = LJFF();
        this.LIZJ = new AbstractRunnableC792500V6y(jLJFF, jLJFF2) { // from class: X.0V9l
            public final void LIZ() {
                boolean zLIZ;
                AbstractC793160V9m abstractC793160V9m = this.LLILZ;
                abstractC793160V9m.getClass();
                String cpuSceneString = ApmCpuManager.getInstance().getCpuSceneString();
                boolean z = !cpuSceneString.equals(C0V9N.LIZ);
                C0V9N.LIZ = cpuSceneString;
                if (z) {
                    if (abstractC793160V9m.LJII()) {
                        C792490V6x.LIZ(EnumC792970V8t.CPU).LIZIZ(abstractC793160V9m.LIZJ);
                        return;
                    }
                    return;
                }
                double dLIZ = C0V9Q.LIZ();
                C0VA1 c0va1 = abstractC793160V9m.LIZ.LJ;
                if (c0va1 != null) {
                    float f = (float) dLIZ;
                    C793250V9v c793250V9v = c0va1.LJ;
                    if (c793250V9v.LIZ()) {
                        C0VA1 c0va12 = (C0VA1) c793250V9v.LIZ;
                        if (c0va12.LJFF.LIZLLL == null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("isAbnormalProcess true, cpuSpeed ");
                            sbLIZ.append(f);
                            sbLIZ.append(", configSpeed:null");
                            C2188811AlT.LIZIZ(sbLIZ);
                            boolean z2 = C2040807z4.LIZ;
                        } else if (f >= 0.0f) {
                            if (0.0f > 0.0d) {
                                ((C0VA1) c0va12.LIZLLL.LIZ).LJFF.getClass();
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("isAbnormalProcess true, cpuSpeed ");
                            sbLIZ2.append(f);
                            sbLIZ2.append(", configSpeed:");
                            sbLIZ2.append(0.0f);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            boolean z3 = C2040807z4.LIZ;
                        }
                        zLIZ = C0V9N.LIZ(abstractC793160V9m.LIZIZ, dLIZ, abstractC793160V9m.LIZLLL);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("isAbnormalProcess false, cpuSpeed ");
                        sbLIZ3.append(f);
                        sbLIZ3.append(", not sample environment");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        boolean z4 = C2040807z4.LIZ;
                    }
                    zLIZ = false;
                } else {
                    zLIZ = C0V9N.LIZ(abstractC793160V9m.LIZIZ, dLIZ, abstractC793160V9m.LIZLLL);
                }
                if (abstractC793160V9m.LJI(zLIZ)) {
                    C792490V6x.LIZ(EnumC792970V8t.CPU).LIZIZ(abstractC793160V9m.LIZJ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseProcessDetectState@3a4a.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseProcessDetectState@3a4a.<init>$1");
            }
        };
    }

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public void LIZJ(boolean z) {
        super.LIZJ(z);
        C792490V6x.LIZ(EnumC792970V8t.CPU).LIZIZ(this.LIZJ);
        C793100V9g c793100V9g = this.LIZ;
        synchronized (c793100V9g) {
            c793100V9g.LIZ(c793100V9g.LJIIJJI);
        }
    }

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZ(C0V9K c0v9k, boolean z) {
        super.LIZ(c0v9k, z);
        this.LIZIZ = c0v9k;
        this.LIZLLL = z;
        C792490V6x.LIZ(EnumC792970V8t.CPU).LIZJ(this.LIZJ);
    }
}
