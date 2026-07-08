package X;

import com.ss.ugc.effectplatform.model.PerfMetricEntry;

/* JADX INFO: renamed from: X.13Jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C19989513Jd implements C13H1<PerfMetricEntry> {
    public static final C19989513Jd LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        return new C13HG[]{C13HI.LIZ, C13HK.LIZ};
    }

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public final /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        C19989513Jd c19989513Jd = new C19989513Jd();
        LIZ = c19989513Jd;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.ugc.effectplatform.model.PerfMetricEntry", c19989513Jd, 2);
        c19983913Gz.LJIIJ("freq", true);
        c19983913Gz.LJIIJ("avg", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        int i = 0;
        int iLJIJJLI = 0;
        double dLIZJ = 0.0d;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ == 1) {
                        dLIZJ = interfaceC19986313HxLIZIZ.LIZJ(interfaceC19983313Gt, 1);
                        i |= 2;
                    } else {
                        throw new C13II(iLJIJJ);
                    }
                } else {
                    iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new PerfMetricEntry(i, iLJIJJLI, dLIZJ, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        PerfMetricEntry.write$Self$ckresource_model_release((PerfMetricEntry) obj, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
