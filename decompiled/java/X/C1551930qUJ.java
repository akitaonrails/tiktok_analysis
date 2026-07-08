package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551930qUJ {
    public C1552900qVs LIZ;
    public C1553200qWM LIZIZ;
    public C1552290qUt LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551930qUJ.LIZ():void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Long] */
    public final void LIZIZ() {
        C1552900qVs c1552900qVs = this.LIZ;
        if (c1552900qVs != null) {
            C1552900qVs.LIZLLL.remove(c1552900qVs.LIZIZ);
        }
        C1553200qWM c1553200qWM = this.LIZIZ;
        if (c1553200qWM != null) {
            synchronized (c1553200qWM) {
                C1553200qWM.LIZJ++;
                C1553200qWM.LIZLLL = System.currentTimeMillis();
            }
        }
        final C1552290qUt c1552290qUt = this.LIZJ;
        if (c1552290qUt != null) {
            if (c1552290qUt.LIZ.get() || !c1552290qUt.LIZIZ || System.currentTimeMillis() - C1552290qUt.LJFF.get() > 1800000) {
                if (c1552290qUt.LIZ.get()) {
                    C1552290qUt.LJFF.set(System.currentTimeMillis());
                    return;
                }
                return;
            }
            AbstractC1552990qW1<Long> abstractC1552990qW1 = new AbstractC1552990qW1<Long>() { // from class: X.0qUr
                @Override // X.AbstractC1552990qW1
                public final int LIZIZ() {
                    return 1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1552990qW1
                public final void LIZ() {
                    InterfaceC1553530qWt interfaceC1553530qWt;
                    if (C1552290qUt.LJ.contains(Long.valueOf(((Long) this.LIZIZ).longValue())) && (interfaceC1553530qWt = c1552290qUt.LIZLLL) != null) {
                        final C1553070qW9 c1553070qW9 = (C1553070qW9) interfaceC1553530qWt;
                        if (c1553070qW9.LIZIZ != null) {
                            if (c1553070qW9.LIZ == null) {
                                c1553070qW9.LIZ = C1551510qTd.LIZ.LIZ();
                            }
                            c1553070qW9.LIZ.execute(new AbstractRunnableC21164217s0(c1553070qW9.hashCode()) { // from class: X.0qUq
                                public final void LIZ() {
                                    try {
                                        C1553130qWF.LIZ("gecko-debug-tag", "check request retry start");
                                        Object pipelineData = c1553070qW9.LIZIZ.getPipelineData("req_type");
                                        c1553070qW9.LIZIZ.setPipelineData("req_type", 2);
                                        c1553070qW9.LIZIZ.setPipelineData("original_req_type", pipelineData);
                                        c1553070qW9.LIZIZ.restart();
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C1553130qWF.LIZ("gecko-debug-tag", "check request retry failed");
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("CheckServerRetryCallback@a1a2.onRetry$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("CheckServerRetryCallback@a1a2.onRetry$1");
                                }
                            });
                        }
                    }
                }
            };
            long jCurrentTimeMillis = System.currentTimeMillis();
            abstractC1552990qW1.LIZIZ = Long.valueOf(jCurrentTimeMillis);
            C1553420qWi.LIZ.LIZ(abstractC1552990qW1, 60000L);
            C1552290qUt.LJ.put(c1552290qUt.LIZJ, Long.valueOf(jCurrentTimeMillis));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1552290qUt.LIZJ);
            sbLIZ.append(">>gecko update request retry hit");
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    public final void LIZJ() {
        C1552900qVs c1552900qVs = this.LIZ;
        if (c1552900qVs != null) {
            c1552900qVs.getClass();
        }
        C1552290qUt c1552290qUt = this.LIZJ;
        if (c1552290qUt != null) {
            c1552290qUt.getClass();
        }
        C1553200qWM c1553200qWM = this.LIZIZ;
        if (c1553200qWM != null) {
            synchronized (c1553200qWM) {
                C1553200qWM.LIZJ = 0;
            }
        }
    }
}
