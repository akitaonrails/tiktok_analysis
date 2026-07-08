package X;

import Y.AObjectS287S0200000_11;
import Y.AObserverS176S0200000_11;
import Y.AObserverS215S0100000_11;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.mediabox.playerui.viewmodel.SeekbarVM;

/* JADX INFO: renamed from: X.0S3V, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S3V extends C0S3Z {
    public final String LJIIIIZZ;
    public final C01GW LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public final C01GW LJIIL;
    public final C0S3U LJIILIIL;

    public final C0S3W LJIIIZ() {
        return (C0S3W) this.LJIIIZ.getValue();
    }

    @Override // X.C0S34, X.C0S3C
    public final void LJII() {
        InterfaceC1484830ok5 player;
        C0S3W c0s3wLJIIIZ = LJIIIZ();
        if (c0s3wLJIIIZ != null) {
            c0s3wLJIIIZ.setProgress(0, false);
        }
        C0S3W c0s3wLJIIIZ2 = LJIIIZ();
        if (c0s3wLJIIIZ2 != null) {
            c0s3wLJIIIZ2.LIZIZ(this.LJIILIIL);
        }
        C0S3W c0s3wLJIIIZ3 = LJIIIZ();
        if (c0s3wLJIIIZ3 != null) {
            c0s3wLJIIIZ3.LIZ();
        }
        C0S3W c0s3wLJIIIZ4 = LJIIIZ();
        if (c0s3wLJIIIZ4 != null) {
            c0s3wLJIIIZ4.LIZLLL();
        }
        InterfaceC715080S3e interfaceC715080S3e = this.LJFF;
        if (interfaceC715080S3e == null || (player = interfaceC715080S3e.getPlayer()) == null) {
            return;
        }
        player.LJJIIZ((InterfaceC1482530ogN) this.LJIIL.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0S3U] */
    public C0S3V(final C0S3T c0s3t) {
        super(c0s3t);
        this.LJIIIIZZ = C0S3Y.LIZ("SeekbarPresenter");
        this.LJIIIZ = C452501pT.LIZIZ(new AObjectS287S0200000_11(this, c0s3t, 0));
        this.LJIIJJI = -1L;
        this.LJIIL = C452501pT.LIZIZ(new AObjectS287S0200000_11(this, c0s3t, 1));
        this.LJIILIIL = new C1DZP() { // from class: X.0S3U
            @Override // X.C1DZP
            public final void LIZ() {
                MutableLiveData<C715070S3d> mutableLiveData;
                C715070S3d c715070S3d = new C715070S3d();
                this.LIZ.LJIIIZ().LJFF();
                c715070S3d.LIZ = C0S3R.START_TOUCH;
                SeekbarVM seekbarVMLJIIIIZZ = this.LIZ.LJIIIIZZ();
                if (seekbarVMLJIIIIZZ != null && (mutableLiveData = seekbarVMLJIIIIZZ.LLILLJJLI) != null) {
                    mutableLiveData.setValue(c715070S3d);
                }
                C0S3W c0s3wLJIIIZ = this.LIZ.LJIIIZ();
                if (c0s3wLJIIIZ != null) {
                    c0s3wLJIIIZ.getProgress();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
            @Override // X.C1DZP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ() {
                /*
                    r8 = this;
                    X.0S3T r0 = r2
                    X.1DZF r0 = r0.LIZ
                    r0.getClass()
                    X.0S3V r0 = r8.LIZ
                    X.0S3W r4 = r0.LJIIIZ()
                    r1 = 0
                    if (r4 == 0) goto L35
                    X.0S3V r0 = r8.LIZ
                    X.0S3e r0 = r0.LJFF
                    if (r0 == 0) goto L6f
                    X.0ok5 r0 = r0.getPlayer()
                    if (r0 == 0) goto L6f
                    X.0oiV r0 = r0.getPlayState()
                    if (r0 == 0) goto L6f
                    int r3 = r0.getState()
                    r2 = 1
                    if (r3 == r2) goto L32
                    r0 = 2
                    if (r3 == r0) goto L32
                    r0 = 3
                    if (r3 == r0) goto L32
                    r0 = 4
                    if (r3 != r0) goto L6f
                L32:
                    r4.setEnableTimeOut(r2)
                L35:
                    X.0S3d r2 = new X.0S3d
                    r2.<init>()
                    X.0S3V r0 = r8.LIZ
                    X.0S3W r0 = r0.LJIIIZ()
                    if (r0 == 0) goto L45
                    r0.LJFF()
                L45:
                    X.0S3R r0 = X.C0S3R.END_TOUCH
                    r2.LIZ = r0
                    X.0S3V r0 = r8.LIZ
                    com.ss.android.ugc.mediabox.playerui.viewmodel.SeekbarVM r0 = r0.LJIIIIZZ()
                    if (r0 == 0) goto L58
                    androidx.lifecycle.MutableLiveData<X.0S3d> r0 = r0.LLILLJJLI
                    if (r0 == 0) goto L58
                    r0.setValue(r2)
                L58:
                    X.0S3V r0 = r8.LIZ
                    X.0S3W r0 = r0.LJIIIZ()
                    if (r0 == 0) goto L64
                    int r1 = r0.getProgress()
                L64:
                    X.0S3V r7 = r8.LIZ
                    long r3 = r7.LJIIJJI
                    r5 = 0
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 > 0) goto L71
                    return
                L6f:
                    r2 = 0
                    goto L32
                L71:
                    X.0S3T r2 = r2
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 <= 0) goto L96
                    float r1 = (float) r1
                    float r0 = (float) r3
                    float r1 = r1 / r0
                    r0 = 100
                    float r0 = (float) r0
                    float r1 = r1 * r0
                    r0 = 1120403456(0x42c80000, float:100.0)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 > 0) goto L96
                    X.0S3e r0 = r7.LJFF
                    if (r0 == 0) goto L91
                    X.0ok5 r0 = r0.getPlayer()
                    if (r0 == 0) goto L91
                    r0.seek(r1)
                L91:
                    X.1DZF r0 = r2.LIZ
                    r0.getClass()
                L96:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0S3U.LIZIZ():void");
            }

            @Override // X.C1DZP
            public final void onProgressChanged(int i) {
                MutableLiveData<C715040S3a> mutableLiveData;
                MutableLiveData<C715040S3a> mutableLiveData2;
                C0S3V c0s3v = this.LIZ;
                if (c0s3v.LJIIJ) {
                    SeekbarVM seekbarVMLJIIIIZZ = c0s3v.LJIIIIZZ();
                    if (seekbarVMLJIIIIZZ != null && (mutableLiveData2 = seekbarVMLJIIIIZZ.LLILLL) != null) {
                        C715040S3a c715040S3a = new C715040S3a();
                        c715040S3a.LIZ = i;
                        c715040S3a.LIZIZ = true;
                        c715040S3a.LIZJ = false;
                        mutableLiveData2.setValue(c715040S3a);
                    }
                    String str = this.LIZ.LJIIIIZZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("seekbar progress change by drag: ");
                    sbLIZ.append(i);
                    C1481110oe5.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                SeekbarVM seekbarVMLJIIIIZZ2 = c0s3v.LJIIIIZZ();
                if (seekbarVMLJIIIIZZ2 != null && (mutableLiveData = seekbarVMLJIIIIZZ2.LLILLL) != null) {
                    C715040S3a c715040S3a2 = new C715040S3a();
                    c715040S3a2.LIZ = i;
                    c715040S3a2.LIZIZ = false;
                    c715040S3a2.LIZJ = false;
                    mutableLiveData.setValue(c715040S3a2);
                }
                String str2 = this.LIZ.LJIIIIZZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("seekbar progress change: ");
                sbLIZ2.append(i);
                C1481110oe5.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
        new AObserverS215S0100000_11(this, 35);
        new AObserverS176S0200000_11(this, c0s3t, 6);
        new AObserverS215S0100000_11(this, 36);
        new AObserverS215S0100000_11(this, 37);
    }
}
