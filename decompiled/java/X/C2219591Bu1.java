package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Bu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219591Bu1 implements InterfaceC2219621Bu4 {
    public final C1DK1 LIZ;
    public VEAudioCapture LIZJ;
    public C2219601Bu2 LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(264));
    public final List<InterfaceC2219611Bu3> LJI = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Bra, X.1Bu2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void LIZLLL() {
        Integer numValueOf;
        if (this.LJ) {
            return;
        }
        VEAudioCapture vEAudioCapture = new VEAudioCapture();
        this.LIZJ = vEAudioCapture;
        vEAudioCapture.addCaptureListener(this.LIZ.LIZIZ().LJII());
        ?? r1 = new InterfaceC2218081Bra() { // from class: X.1Bu2
            @Override // X.InterfaceC2218081Bra
            public final void onReceive(VEAudioSample vEAudioSample) {
            }

            @Override // X.InterfaceC2218071BrZ
            public final void onError(int i, int i2, String str) {
                if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
                    C2219591Bu1 c2219591Bu1 = this.LIZ;
                    c2219591Bu1.LJ = false;
                    c2219591Bu1.LJFF = false;
                } else {
                    if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
                        return;
                    }
                    this.LIZ.LJFF = false;
                }
            }

            @Override // X.InterfaceC2218071BrZ
            public final void onInfo(int i, int i2, double d, Object obj) {
                int i3 = VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT;
            }
        };
        this.LIZLLL = r1;
        VEAudioCapture vEAudioCapture2 = this.LIZJ;
        if (vEAudioCapture2 != 0) {
            vEAudioCapture2.addCaptureListener(r1);
        }
        VEAudioCapture vEAudioCapture3 = this.LIZJ;
        if (vEAudioCapture3 == null || (numValueOf = Integer.valueOf(vEAudioCapture3.init((VEAudioCaptureSettings) this.LIZIZ.getValue()))) == null || numValueOf.intValue() != 0) {
            this.LJ = false;
        } else {
            this.LJ = true;
        }
    }

    @Override // X.InterfaceC2219621Bu4
    public final synchronized void release() {
        VEAudioCapture vEAudioCapture;
        VEAudioCapture vEAudioCapture2 = this.LIZJ;
        if (vEAudioCapture2 != null) {
            vEAudioCapture2.removeCaptureListener(this.LIZ.LIZIZ().LJII());
        }
        C2219601Bu2 c2219601Bu2 = this.LIZLLL;
        if (c2219601Bu2 != null && (vEAudioCapture = this.LIZJ) != null) {
            vEAudioCapture.removeCaptureListener(c2219601Bu2);
        }
        VEAudioCapture vEAudioCapture3 = this.LIZJ;
        if (vEAudioCapture3 != null) {
            vEAudioCapture3.release();
        }
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2219611Bu3) it2.next()).onRelease();
        }
        if (C296250BjL.LIZIZ()) {
            ((ArrayList) this.LJI).clear();
        }
        this.LJ = false;
        this.LJFF = false;
        this.LIZJ = null;
    }

    @Override // X.InterfaceC2219621Bu4
    public final void LIZ(InterfaceC2219611Bu3 interfaceC2219611Bu3) {
        ((ArrayList) this.LJI).add(interfaceC2219611Bu3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[Catch: all -> 0x0033, LOOP:0: B:14:0x0021->B:16:0x0027, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:8:0x000a, B:10:0x000e, B:13:0x0016, B:14:0x0021, B:16:0x0027, B:12:0x0013), top: B:22:0x0001, inners: #1 }] */
    @Override // X.InterfaceC2219621Bu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ(com.bytedance.bpea.basics.Cert r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.LJFF     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            r2.LIZLLL()     // Catch: java.lang.Throwable -> L33
            com.ss.android.vesdk.VEAudioCapture r0 = r2.LIZJ     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L33
            if (r0 == 0) goto L16
            r0.start(r3)     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L33
            goto L16
        L12:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
        L16:
            r0 = 1
            r2.LJFF = r0     // Catch: java.lang.Throwable -> L33
            java.util.List<X.1Bu3> r0 = r2.LJI     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L33
        L21:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L31
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L33
            X.1Bu3 r0 = (X.InterfaceC2219611Bu3) r0     // Catch: java.lang.Throwable -> L33
            r0.LIZIZ()     // Catch: java.lang.Throwable -> L33
            goto L21
        L31:
            monitor-exit(r2)
            return
        L33:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2219591Bu1.LIZIZ(com.bytedance.bpea.basics.Cert):void");
    }

    @Override // X.InterfaceC2219621Bu4
    public final synchronized void LIZJ(Cert cert) {
        if (!this.LJFF) {
            return;
        }
        VEAudioCapture vEAudioCapture = this.LIZJ;
        if (vEAudioCapture != null) {
            vEAudioCapture.stop(cert);
        }
        this.LJFF = false;
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2219611Bu3) it2.next()).LIZ();
        }
    }

    public C2219591Bu1(C1DK1 c1dk1, InterfaceC2253611DIp interfaceC2253611DIp) {
        this.LIZ = c1dk1;
    }
}
