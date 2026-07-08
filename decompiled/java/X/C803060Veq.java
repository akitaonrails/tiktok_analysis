package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.crash.resource.NativeResourceMonitor;

/* JADX INFO: renamed from: X.0Veq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803060Veq extends AbstractC802540Ve0 {
    public static long LJIIIIZZ = 819200;
    public static long LJIIIZ = 512000;
    public static C803480VfW LJIIJ;
    public static C803480VfW LJIIJJI;
    public static C803060Veq LJIIL;
    public C803020Vem LJII;

    @Override // X.AbstractC802540Ve0
    public final void LIZIZ() {
        LJIIJ = new C803480VfW();
        LJIIJJI = new C803480VfW();
        if ((this.LJII.LJIIJJI & 1) != 0) {
            LJIIIIZZ = Math.max(0, NativeResourceMonitor.LJIIIIZZ(7, 0));
            if (LJFF(0)) {
                C803480VfW c803480VfW = LJIIJ;
                if (c803480VfW.LIZJ) {
                    C802300Vdc.LIZ();
                } else {
                    c803480VfW.LIZJ = true;
                    c803480VfW.LIZLLL = 0;
                    new BPEAThread() { // from class: X.0Vep
                        /* JADX WARN: Removed duplicated region for block: B:71:0x01c1 A[PHI: r0
                          0x01c1: PHI (r0v29 long) = (r0v18 long), (r0v22 long), (r0v18 long) binds: [B:67:0x01b5, B:70:0x01bd, B:38:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZJ() {
                            /*
                                Method dump skipped, instruction units count: 469
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C803050Vep.LIZJ():void");
                        }

                        @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("VmMonitorAdapter@a852.executeVmMonitor$1");
                            boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                            try {
                                LIZJ();
                            } finally {
                            }
                            if (zLJ) {
                                C0W9U.LJFF();
                            }
                            C1C7U.LIZIZ("VmMonitorAdapter@a852.executeVmMonitor$1");
                        }

                        {
                            super("mmapWaterLineModeMonitor");
                        }
                    }.start();
                }
            }
        }
        if ((this.LJII.LJIIJJI & 2) != 0) {
            LJIIIIZZ(1);
        }
    }

    public static boolean LJFF(int i) {
        C803480VfW c803480VfW;
        int i2;
        C803480VfW c803480VfW2;
        boolean z;
        if (i == 0) {
            c803480VfW = LJIIJ;
        } else {
            c803480VfW = LJIIJJI;
        }
        if (c803480VfW == null || (i2 = c803480VfW.LIZLLL) == 4 || i2 == -1 || i2 == 5) {
            return false;
        }
        if (!c803480VfW.LIZ && c803480VfW.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VmMonitor: start hook: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            C802300Vdc.LIZ();
            if (i == 0) {
                c803480VfW2 = LJIIJ;
            } else {
                c803480VfW2 = LJIIJJI;
            }
            if (!c803480VfW2.LIZ) {
                int iLJIIIIZZ = NativeResourceMonitor.LJIIIIZZ(1, i);
                if (iLJIIIIZZ == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c803480VfW2.LIZ = z;
                c803480VfW2.LIZIZ = false;
                LJII(i, 1, iLJIIIIZZ);
            }
        }
        return c803480VfW.LIZ;
    }

    public static long LJI(boolean z) {
        C803480VfW c803480VfW;
        C803480VfW c803480VfW2;
        if (z) {
            int iLJIIIIZZ = NativeResourceMonitor.LJIIIIZZ(8, 0);
            if (iLJIIIIZZ < 0 && (c803480VfW2 = LJIIJ) != null) {
                c803480VfW2.LIZLLL = -1;
            }
            long jMax = Math.max(0, iLJIIIIZZ);
            if (jMax < LJIIIZ) {
                LJIIIZ = jMax;
            }
            return jMax - LJIIIZ;
        }
        if (NativeResourceMonitor.LJIIIIZZ(6, 0) < 0 && (c803480VfW = LJIIJ) != null) {
            c803480VfW.LIZLLL = -1;
        }
        return Math.max(0, r1);
    }

    public static void LJIIIIZZ(int i) {
        C802300Vdc.LIZ();
        if (!LJFF(i)) {
            return;
        }
        LJII(i, 3, NativeResourceMonitor.LJIIIIZZ(3, i));
    }

    public static void LJII(int i, int i2, int i3) {
        C803480VfW c803480VfW;
        String str;
        if (i3 != 0) {
            if (i == 0) {
                c803480VfW = LJIIJ;
            } else {
                c803480VfW = LJIIJJI;
            }
            c803480VfW.LIZLLL = -1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VmMonitor: ");
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 6) {
                                    if (i2 != 7) {
                                        str = "unknown command";
                                    } else {
                                        str = "get_vm_size";
                                    }
                                } else {
                                    str = "get_leak_size";
                                }
                            } else {
                                str = "dump";
                            }
                        } else {
                            str = "stop_monitor";
                        }
                    } else {
                        str = "start_monitor";
                    }
                } else {
                    str = "hook";
                }
            } else {
                str = "recover";
            }
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(i3);
            C2188811AlT.LIZIZ(sbLIZ);
            C802300Vdc.LIZ();
        }
    }
}
