package X;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284800jXS extends AbstractC1284860jXY {
    public static final AtomicInteger LJIIIZ = new AtomicInteger(0);
    public int LIZIZ;
    public int LIZJ;
    public volatile SurfaceControl LIZLLL;
    public volatile Surface LJ;
    public volatile int LJFF = 1;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final SurfaceControl.Transaction LJII = new SurfaceControl.Transaction();
    public RunnableC1284810jXT LJIIIIZZ;

    @Override // X.InterfaceC1472350oPx
    public final void destroy() {
        this.LJFF = 2;
        RunnableC1284810jXT runnableC1284810jXT = this.LJIIIIZZ;
        if (runnableC1284810jXT != null) {
            this.LJI.removeCallbacks(runnableC1284810jXT);
        }
        C786410Ut5.LJJZZIII(this.LJI, new Runnable() { // from class: X.0jXQ
            @Override // java.lang.Runnable
            public final void run() {
                C1284800jXS c1284800jXS = this.LL;
                C1C7U.LIZ("MBSurfaceControlSessionV2@199b.destroy$1L");
                SurfaceControl surfaceControl = c1284800jXS.LIZLLL;
                final boolean z = false;
                if (surfaceControl != null) {
                    c1284800jXS.LJII.reparent(surfaceControl, null);
                    c1284800jXS.LJII.setBufferSize(surfaceControl, 0, 0);
                    c1284800jXS.LJII.setVisibility(surfaceControl, false);
                    c1284800jXS.LJII.apply();
                }
                final Surface surface = c1284800jXS.LJ;
                c1284800jXS.LJ = null;
                final SurfaceControl surfaceControl2 = c1284800jXS.LIZLLL;
                CopyOnWriteArrayList<SurfaceControl> copyOnWriteArrayList = C1284790jXR.LIZ;
                int iIntValue = ((Number) C1474810oTv.r5.getValue()).intValue();
                if (iIntValue > 0 && surfaceControl2 != null) {
                    CopyOnWriteArrayList<SurfaceControl> copyOnWriteArrayList2 = C1284790jXR.LIZ;
                    if (copyOnWriteArrayList2.size() < iIntValue) {
                        copyOnWriteArrayList2.add(surfaceControl2);
                        if (C1481110oe5.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("storedOtherTextureList storedSurfaceControlList:");
                            sbLIZ.append(copyOnWriteArrayList2);
                            C1481110oe5.LIZIZ("SurfaceControlPool", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        z = true;
                    }
                }
                Runnable runnable = new Runnable() { // from class: X.0jVW
                    @Override // java.lang.Runnable
                    public final void run() {
                        Surface surface2 = surface;
                        boolean z2 = z;
                        SurfaceControl surfaceControl3 = surfaceControl2;
                        C1C7U.LIZ("MBSurfaceControlSessionV2@199b.destroy$lambda$10$1L");
                        if (surface2 != null) {
                            surface2.release();
                        }
                        if (!z2 && surfaceControl3 != null) {
                            surfaceControl3.release();
                        }
                        C1C7U.LIZIZ("MBSurfaceControlSessionV2@199b.destroy$lambda$10$1L");
                    }
                };
                if (((Boolean) C1474810oTv.B5.getValue()).booleanValue()) {
                    try {
                        C1475000oUE.LIZLLL.execute(runnable);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        runnable.run();
                    }
                } else {
                    runnable.run();
                }
                c1284800jXS.LJII.close();
                c1284800jXS.LIZLLL = null;
                C1C7U.LIZIZ("MBSurfaceControlSessionV2@199b.destroy$1L");
            }
        });
    }

    @Override // X.InterfaceC1472350oPx
    public final Surface LIZJ() {
        Surface surface = this.LJ;
        if (surface != null) {
            return surface;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = LJFF(this.LIZIZ, this.LIZJ);
        }
        SurfaceControl surfaceControl = this.LIZLLL;
        if (surfaceControl == null || !surfaceControl.isValid()) {
            return null;
        }
        Surface surface2 = new Surface(surfaceControl);
        this.LJ = surface2;
        return surface2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1284800jXS() {
        /*
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.LJFF = r0
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            r4.LJI = r1
            android.view.SurfaceControl$Transaction r0 = new android.view.SurfaceControl$Transaction
            r0.<init>()
            r4.LJII = r0
            java.util.concurrent.CopyOnWriteArrayList<android.view.SurfaceControl> r0 = X.C1284790jXR.LIZ
            X.01GW r0 = X.C1474810oTv.r5
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L5a
            java.util.concurrent.CopyOnWriteArrayList<android.view.SurfaceControl> r3 = X.C1284790jXR.LIZ
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5a
            r0 = 0
            java.lang.Object r2 = r3.remove(r0)
            android.view.SurfaceControl r2 = (android.view.SurfaceControl) r2
            boolean r0 = X.C1481110oe5.LIZ
            if (r0 == 0) goto L58
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchSurfaceControl storedSurfaceControlList:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", result:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SurfaceControlPool"
            X.C1481110oe5.LIZIZ(r0, r1)
        L58:
            if (r2 != 0) goto L7d
        L5a:
            android.view.SurfaceControl$Builder r2 = new android.view.SurfaceControl$Builder
            r2.<init>()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Vod-init-"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = X.C1284800jXS.LJIIIZ
            int r0 = r0.incrementAndGet()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            android.view.SurfaceControl$Builder r0 = r2.setName(r0)
            android.view.SurfaceControl r2 = r0.build()
        L7d:
            r4.LIZLLL = r2
            android.view.SurfaceControl r1 = r4.LIZLLL
            if (r1 == 0) goto L8a
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r1)
            r4.LJ = r0
        L8a:
            boolean r0 = X.C1481110oe5.LIZ
            if (r0 == 0) goto Laf
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "init generate. mSurfaceControl:"
            r1.append(r0)
            android.view.SurfaceControl r0 = r4.LIZLLL
            r1.append(r0)
            java.lang.String r0 = ", mSurface:"
            r1.append(r0)
            android.view.Surface r0 = r4.LJ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MBSurfaceControlSessionV2"
            X.C1481110oe5.LIZIZ(r0, r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1284800jXS.<init>():void");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MBSurfaceControlSessionV2:[mSurfaceControl:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mSurface:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", surface valid:");
        Surface surface = this.LJ;
        sbLIZ.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        sbLIZ.append("].");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SurfaceControl LJFF(int i, int i2) {
        SurfaceControl surfaceControl = this.LIZLLL;
        if (surfaceControl != null) {
            return surfaceControl;
        }
        if (this.LJFF == 2) {
            return null;
        }
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("MBSurfaceControlSessionV2", "default generate. should not go here.it will init in default");
        }
        SurfaceControl.Builder builder = new SurfaceControl.Builder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Vod-default-");
        sbLIZ.append(LJIIIZ.incrementAndGet());
        SurfaceControl surfaceControlBuild = builder.setName(C2188811AlT.LIZIZ(sbLIZ)).setBufferSize(i, i2).build();
        this.LIZLLL = surfaceControlBuild;
        return surfaceControlBuild;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0jXT, java.lang.Runnable] */
    @Override // X.InterfaceC1472350oPx
    public final void LIZIZ(final SurfaceControl surfaceControl, final Integer num, final Integer num2) {
        int iIntValue;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZIZ = iIntValue;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        this.LIZJ = iIntValue2;
        RunnableC1284810jXT runnableC1284810jXT = this.LJIIIIZZ;
        if (runnableC1284810jXT != null) {
            this.LJI.removeCallbacks(runnableC1284810jXT);
        }
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            ?? r1 = new Runnable() { // from class: X.0jXT
                @Override // java.lang.Runnable
                public final void run() {
                    C1284800jXS c1284800jXS = this.LL;
                    SurfaceControl surfaceControl2 = surfaceControl;
                    Integer num3 = num;
                    Integer num4 = num2;
                    C1C7U.LIZ("MBSurfaceControlSessionV2@199b.setParentSurfaceControl$1L");
                    c1284800jXS.LJI(surfaceControl2, num3, num4);
                    C1C7U.LIZIZ("MBSurfaceControlSessionV2@199b.setParentSurfaceControl$1L");
                }
            };
            C786410Ut5.LJJZZIII(this.LJI, r1);
            this.LJIIIIZZ = r1;
            return;
        }
        LJI(surfaceControl, num, num2);
    }

    public final void LJI(SurfaceControl surfaceControl, Integer num, Integer num2) {
        SurfaceControl surfaceControlLJFF;
        int iIntValue;
        int iIntValue2;
        if (surfaceControl != null && !surfaceControl.isValid()) {
            return;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parentSurfaceControl:");
            sbLIZ.append(surfaceControl);
            sbLIZ.append(", width:");
            sbLIZ.append(num);
            sbLIZ.append(", height:");
            sbLIZ.append(num2);
            sbLIZ.append(", this:");
            sbLIZ.append(this);
            C1481110oe5.LIZIZ("MBSurfaceControlSessionV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJFF == 2 || (surfaceControlLJFF = LJFF(this.LIZIZ, this.LIZJ)) == null || !surfaceControlLJFF.isValid()) {
            return;
        }
        try {
            SurfaceControl.Transaction transactionReparent = this.LJII.reparent(surfaceControlLJFF, surfaceControl);
            boolean z = false;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (num2 == null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = num2.intValue();
            }
            SurfaceControl.Transaction bufferSize = transactionReparent.setBufferSize(surfaceControlLJFF, iIntValue, iIntValue2);
            if (surfaceControl != null) {
                z = true;
            }
            bufferSize.setVisibility(surfaceControlLJFF, z).apply();
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("finish reparent. parentSurfaceControl:");
                sbLIZ2.append(surfaceControl);
                sbLIZ2.append(", width:");
                sbLIZ2.append(num);
                sbLIZ2.append(", height:");
                sbLIZ2.append(num2);
                sbLIZ2.append(", this:");
                sbLIZ2.append(this);
                C1481110oe5.LIZIZ("MBSurfaceControlSessionV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1474810oTv.LLJJIII()) {
                C1475000oUE.LJIIIIZZ().onReportBizException("mediabox_crash_exception", e, "MBSurfaceV2ControlCrash", null, true);
            }
        }
    }
}
