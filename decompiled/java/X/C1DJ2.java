package X;

import android.util.Log;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.k;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1DJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DJ2 implements InterfaceC1650240t2s {
    public final C1DK1 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(207));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 107));
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C11RK LJI;
    public final C11RK LJII;
    public final C11RK LJIIIIZZ;

    @Override // X.InterfaceC1650240t2s
    public final void LIZIZ() {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJFF();
            ((InterfaceC2253701DIy) c1dk1.LJ.getValue()).LIZJ();
        }
    }

    @Override // X.InterfaceC1650240t2s
    public final void LIZJ() {
        final C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJJJJJ(new InterfaceC2183551Acz() { // from class: X.1445
                @Override // X.InterfaceC2183551Acz
                public final void onDone(int i) {
                    long length;
                    if (i <= 0) {
                        AnonymousClass1446 anonymousClass1446 = c1dk1.LJIIJ;
                        if (anonymousClass1446 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ret=");
                            sbLIZ.append(i);
                            new Exception(C2188811AlT.LIZIZ(sbLIZ));
                            anonymousClass1446.LIZLLL();
                            return;
                        }
                        return;
                    }
                    AnonymousClass1446 anonymousClass14462 = c1dk1.LJIIJ;
                    if (anonymousClass14462 != null) {
                        anonymousClass14462.LIZ();
                    }
                    String strLJ = ((InterfaceC2253701DIy) c1dk1.LJ.getValue()).LJ();
                    c1dk1.getClass();
                    try {
                        C0VSJ c0vsj = new C0VSJ(strLJ);
                        if (c0vsj.exists()) {
                            length = c0vsj.length();
                        } else {
                            length = -1;
                        }
                        int[] iArr = new int[10];
                        int videoFileInfo = VEUtils.getVideoFileInfo(strLJ, iArr);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("framework=DM event=output_file path=");
                        sbLIZ2.append(strLJ);
                        sbLIZ2.append(" fileSize=");
                        sbLIZ2.append(length);
                        sbLIZ2.append(" probeResult=");
                        sbLIZ2.append(videoFileInfo);
                        sbLIZ2.append(" actualWidth=");
                        sbLIZ2.append(iArr[0]);
                        sbLIZ2.append(" actualHeight=");
                        sbLIZ2.append(iArr[1]);
                        sbLIZ2.append(" actualBitrate=");
                        sbLIZ2.append(iArr[8]);
                        sbLIZ2.append(" actualFps=");
                        sbLIZ2.append(iArr[6]);
                        sbLIZ2.append(" durationMs=");
                        sbLIZ2.append(iArr[3]);
                        sbLIZ2.append(" rawInfo=[");
                        sbLIZ2.append(C13LQ.LJJIL(iArr, ",", null, 62));
                        sbLIZ2.append(']');
                        C189200o6.m2constructorimpl(Integer.valueOf(Log.i("VEMidLayer", C2188811AlT.LIZIZ(sbLIZ2))));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    AnonymousClass1446 anonymousClass14463 = c1dk1.LJIIJ;
                    if (anonymousClass14463 == null) {
                        return;
                    }
                    anonymousClass14463.LJ(strLJ);
                }
            });
        }
    }

    @Override // X.InterfaceC1650240t2s
    public final void LJI() {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJI(true);
        }
    }

    public final C11RK<String> LJIIIIZZ() {
        return (C11RK) this.LJFF.getValue();
    }

    @Override // X.InterfaceC1650240t2s
    public final void init() {
        this.LIZ.LJIIJ = new AnonymousClass1446() { // from class: X.1DJ3
            @Override // X.AnonymousClass1446
            public final void LIZ() {
                this.LIZ.LJIIIIZZ().onNext(C1649000t0s.LLLJL);
            }

            @Override // X.AnonymousClass1446
            public final void LIZIZ() {
                this.LIZ.LJIIIIZZ().onNext(C1649000t0s.LLLJ);
            }

            @Override // X.AnonymousClass1446
            public final void LIZLLL() {
                this.LIZ.LJIIIIZZ().onNext(C1649000t0s.LLLL);
            }

            @Override // X.AnonymousClass1446
            public final void LIZJ(final long j) {
                ((C11RK) this.LIZ.LIZLLL.getValue()).onNext(new Object(j) { // from class: X.1DJ4
                    public final long LIZ;

                    {
                        this.LIZ = j;
                    }
                });
                this.LIZ.LJIIIIZZ().onNext(C1649000t0s.LLLJIL);
            }

            @Override // X.AnonymousClass1446
            public final void LJ(String str) {
                ((C11RK) this.LIZ.LJ.getValue()).onNext(str);
                this.LIZ.LJIIIIZZ().onNext(C1649000t0s.LLLLII);
            }
        };
    }

    @Override // X.InterfaceC1650240t2s
    public final C11RK LIZLLL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1650240t2s
    public final C11RK LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1650240t2s
    public final C11RK LJII() {
        return this.LJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // X.InterfaceC1650240t2s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21166517sN
            if (r0 == 0) goto L6c
            r5 = r7
            X.17sN r5 = (X.C21166517sN) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L87
            X.C155000ia.LIZIZ(r2)
        L22:
            X.1DK1 r3 = r6.LIZ
            monitor-enter(r3)
            goto L72
        L26:
            X.C155000ia.LIZIZ(r2)
            r5.LLILLL = r1
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r3.<init>(r1, r0)
            r3.LJIJJ()
            X.1DK1 r0 = r6.LIZ
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto L63
            X.1DK1 r2 = r6.LIZ
            X.020f r1 = new X.020f
            r0 = 166(0xa6, float:2.33E-43)
            r1.<init>(r3, r0)
            r2.LJFF(r1)
        L4b:
            java.lang.Object r1 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L58
            X.C099Q.LIZJ(r5)
        L58:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L60:
            if (r1 != r4) goto L22
            return r4
        L63:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C189200o6.m2constructorimpl(r0)
            r3.resumeWith(r0)
            goto L4b
        L6c:
            X.17sN r5 = new X.17sN
            r5.<init>(r6, r7)
            goto L12
        L72:
            com.ss.android.vesdk.VERecorder r2 = r3.LIZIZ()     // Catch: java.lang.Throwable -> L84
            X.1447 r1 = new X.1447     // Catch: java.lang.Throwable -> L84
            r1.<init>()     // Catch: java.lang.Throwable -> L84
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.LJJJIL(r0, r1)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L84:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DJ2.LJ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1650240t2s
    public final void LJLJLLL(Surface surface) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LIZJ(surface);
        }
    }

    @Override // X.InterfaceC1650240t2s
    public final void enableAudio(boolean z) {
        EnumC2249751D3t enumC2249751D3t;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            k kVar = c1dk1.LIZIZ().LIZIZ;
            C2254401DLq c2254401DLq = kVar.LJJJJ;
            if (z) {
                enumC2249751D3t = EnumC2249751D3t.ENABLE;
            } else {
                enumC2249751D3t = EnumC2249751D3t.DISABLE;
            }
            c2254401DLq.LJJIII = enumC2249751D3t;
            kVar.LJJJ.LJJIII("RecordMicConfig", enumC2249751D3t.ordinal());
        }
    }

    public C1DJ2(C1DK1 c1dk1, InterfaceC2253611DIp interfaceC2253611DIp) {
        this.LIZ = c1dk1;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(208));
        this.LIZLLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(209));
        this.LJ = c01gwLIZIZ2;
        this.LJFF = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(210));
        this.LJI = (C11RK) c01gwLIZIZ.getValue();
        this.LJII = (C11RK) c01gwLIZIZ2.getValue();
        this.LJIIIIZZ = LJIIIIZZ();
    }

    @Override // X.InterfaceC1650240t2s
    public final void LIZ(int i, int i2) {
        boolean z;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            VEDisplaySettings vEDisplaySettingsLJIIIZ = c1dk1.LIZIZ().LJIIIZ();
            VESize renderSize = vEDisplaySettingsLJIIIZ.getRenderSize();
            if (((double) renderSize.width) / ((double) renderSize.height) == ((double) i) / ((double) i2)) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            if (z2) {
                VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(vEDisplaySettingsLJIIIZ);
                builder.setRenderSize(new VESize(i, i2));
                c1dk1.LIZIZ().LJJI(builder.build());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requested=");
            sbLIZ.append(i);
            sbLIZ.append('x');
            sbLIZ.append(i2);
            sbLIZ.append(" applied=");
            sbLIZ.append(z2);
            sbLIZ.append(" prevRender=");
            sbLIZ.append(renderSize.width);
            sbLIZ.append('x');
            sbLIZ.append(renderSize.height);
            c1dk1.LJ("change_render_size", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
