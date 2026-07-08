package X;

import Y.AfS177S0100000_8;
import android.os.SystemClock;
import androidx.lifecycle.LiveDataReactiveStreams;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Mjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576690Mjb extends AbstractC2255721DQs<InterfaceC576910Mjx> implements InterfaceC576910Mjx, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC576910Mjx LLILLJJLI = this;
    public final ShortVideoContext LLILLL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576620MjU.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576630MjV.class, null);
    public final C11NJ LLIZ = new C11NJ();
    public boolean LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C576690Mjb.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C576690Mjb.class, "layoutNLEComponent", "getLayoutNLEComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutNLEApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C576690Mjb.class, "layoutCaptureFlowComponent", "getLayoutCaptureFlowComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutCaptureFlowApiComponent;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJI = 8;
    }

    private final InterfaceC576630MjV X1() {
        return (InterfaceC576630MjV) this.LLILZLL.getValue(this, LLJ[2]);
    }

    private final InterfaceC576770Mjj o2() {
        return (InterfaceC576770Mjj) this.LLILZ.getValue(this, LLJ[0]);
    }

    public final InterfaceC576620MjU Z1() {
        return (InterfaceC576620MjU) this.LLILZIL.getValue(this, LLJ[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLIZ.LIZ(C11NZ.LJJJJJ(LiveDataReactiveStreams.toPublisher(this, o2().r6())).LJJIL(new InterfaceC19483011Ki() { // from class: X.0Mjd
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (!(obj instanceof C579270Mnl) && !(obj instanceof C579290Mnn)) {
                    return false;
                }
                return true;
            }
        }).LJJIFFI().LJJLJLI(new AfS177S0100000_8(this, 74)));
        if (C299870BpB.LIZ() == 0) {
            C11ON c11onLJJJJZI = X1().PT().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0L2x
                /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[PHI: r6
                  0x0050: PHI (r6v4 int) = (r6v1 int), (r6v8 int) binds: [B:23:0x004d, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[PHI: r5 r6
                  0x0072: PHI (r5v4 int) = (r5v1 int), (r5v6 int) binds: [B:34:0x006f, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]
                  0x0072: PHI (r6v5 int) = (r6v4 int), (r6v7 int) binds: [B:34:0x006f, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC1487280oo2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.util.List r9 = (java.util.List) r9
                        boolean r4 = r9 instanceof java.util.Collection
                        r7 = 0
                        r2 = 0
                        if (r4 == 0) goto L2e
                        boolean r0 = r9.isEmpty()
                        if (r0 == 0) goto L2e
                        r6 = 0
                    Lf:
                        boolean r0 = r9.isEmpty()
                        if (r0 == 0) goto L50
                        r5 = 0
                    L16:
                        boolean r0 = r9.isEmpty()
                        if (r0 == 0) goto L72
                    L1c:
                        X.0HZe r4 = new X.0HZe
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                        r4.<init>(r3, r1, r0)
                        return r4
                    L2e:
                        java.util.Iterator r3 = r9.iterator()
                        r6 = 0
                    L33:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L4d
                        java.lang.Object r0 = r3.next()
                        com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia r0 = (com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia) r0
                        com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r1 = r0.mediaType
                        com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r0 = com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType.PHOTO
                        if (r1 != r0) goto L33
                        int r6 = r6 + 1
                        if (r6 >= 0) goto L33
                        X.C1697810uHb.LJIJ()
                        throw r7
                    L4d:
                        if (r4 == 0) goto L50
                        goto Lf
                    L50:
                        java.util.Iterator r3 = r9.iterator()
                        r5 = 0
                    L55:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L6f
                        java.lang.Object r0 = r3.next()
                        com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia r0 = (com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia) r0
                        com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r1 = r0.mediaType
                        com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r0 = com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType.VIDEO
                        if (r1 != r0) goto L55
                        int r5 = r5 + 1
                        if (r5 >= 0) goto L55
                        X.C1697810uHb.LJIJ()
                        throw r7
                    L6f:
                        if (r4 == 0) goto L72
                        goto L16
                    L72:
                        java.util.Iterator r3 = r9.iterator()
                        r2 = 0
                    L77:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L1c
                        java.lang.Object r0 = r3.next()
                        com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia r0 = (com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia) r0
                        com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r1 = r0.mediaType
                        com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r0 = com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType.LIVE_PHOTO
                        if (r1 != r0) goto L77
                        int r2 = r2 + 1
                        if (r2 >= 0) goto L77
                        X.C1697810uHb.LJIJ()
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C536650L2x.apply(java.lang.Object):java.lang.Object");
                }
            });
            C11ON c11onLJJJJZI2 = C11NZ.LJJJJJ(LiveDataReactiveStreams.toPublisher(this, o2().r6())).LJJIL(new InterfaceC19483011Ki() { // from class: X.0Mje
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    return obj instanceof C579250Mnj;
                }
            }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0L2y
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return new C443120HZe(0, 0, 0);
                }
            });
            C1701890uOB.LIZ(c11onLJJJJZI2, "other is null");
            C11NZ c11nzLJJJLL = C11NZ.LJJJLL(c11onLJJJJZI, c11onLJJJJZI2);
            C11RO c11ro = C11S5.LIZIZ;
            this.LLIZ.LIZ(c11nzLJJJLL.LJJJLZIJ(c11ro).LJJLJLI(new C09JN() { // from class: X.0LDK
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CameraLayoutMobComponent@a1e8.onCreate$6");
                    C0LDJ.LIZ.getClass();
                    C0LDJ.LIZJ.offer(new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
                    C1C7U.LIZIZ("CameraLayoutMobComponent@a1e8.onCreate$6");
                }
            }));
            this.LLIZ.LIZ(Z1().OH0().LJJJLZIJ(c11ro).LJJLJLI(new AfS177S0100000_8(this, 75)));
            this.LLIZ.LIZ(C11NZ.LJJJJJ(LiveDataReactiveStreams.toPublisher(this, o2().r6())).LJJIFFI().LJJLJLI(new AfS177S0100000_8(this, 76)));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLIZ.dispose();
    }

    @Override // X.InterfaceC576910Mjx
    public void wg0() {
        if (C299870BpB.LIZ() == 0) {
            C0LDJ c0ldj = C0LDJ.LIZ;
            ShortVideoContext shortVideoContext = this.LLILLL;
            float playFps = Z1().getPlayFps();
            c0ldj.getClass();
            C0LDJ.LIZLLL(shortVideoContext, playFps);
        }
    }

    public InterfaceC576910Mjx W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C576690Mjb(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
