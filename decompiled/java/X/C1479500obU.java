package X;

import Y.ARunnableS0S1210000_9;
import Y.ARunnableS14S1100000_9;
import Y.ARunnableS14S1200000_9;
import Y.ARunnableS1S1110000_9;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS2S1201000_9;
import Y.ARunnableS78S0200000_9;
import Y.ARunnableS8S0100001_23;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0obU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479500obU implements InterfaceC1472110oPZ {
    public final /* synthetic */ C1479490obT LIZ;

    @Override // X.InterfaceC1472110oPZ
    public final void LJLLI() {
        C1479490obT c1479490obT = this.LIZ;
        c1479490obT.LJJIII.LIZ(new ARunnableS14S1100000_9(c1479490obT.LJJIIJ, c1479490obT.LJIIIIZZ, 7));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJJZ() {
        if (!C1474810oTv.LLJJJJLIIL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(this.LIZ.LJIIIIZZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onPlaying");
            C1479490obT c1479490obT = this.LIZ;
            C1469250oKx.LIZ = c1479490obT;
            final String str = c1479490obT.LJIIIIZZ;
            final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
            final C1480430ocz c1480430oczLJIIJJI = c1479490obT.LJIIJJI();
            C989260bqm.LIZ(str);
            this.LIZ.LJJIII.LIZ(new Runnable() { // from class: X.0Mxd
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlaying$1");
                    try {
                        OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                        if (onUIPlayListener2 != null) {
                            onUIPlayListener2.onPlaying(str, c1480430oczLJIIJJI);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlaying$1");
                }
            });
            return;
        }
        C1479490obT c1479490obT2 = this.LIZ;
        c1479490obT2.LJJJJL.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VIDEO@");
        sbLIZ2.append(c1479490obT2.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ2)).LIZIZ("onPlaying");
        C1469250oKx.LIZ = c1479490obT2;
        String str2 = c1479490obT2.LJIIIIZZ;
        OnUIPlayListener onUIPlayListener2 = c1479490obT2.LJJIIJ;
        C1480430ocz c1480430oczLJIIJJI2 = c1479490obT2.LJIIJJI();
        C989260bqm.LIZ(str2);
        c1479490obT2.LJJIII.LIZ(new ARunnableS14S1200000_9(onUIPlayListener2, c1480430oczLJIIJJI2, str2, 5));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJJZZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VIDEO@");
        sbLIZ.append(this.LIZ.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onPlayPause");
        if (Intrinsics.LJFF(C1469250oKx.LIZ, this.LIZ)) {
            C1469250oKx.LIZ = null;
        }
        C1479490obT c1479490obT = this.LIZ;
        final String str = c1479490obT.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0Mxe
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlayPause$1");
                try {
                    OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                    if (onUIPlayListener2 != null) {
                        onUIPlayListener2.onPlayPause(str);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlayPause$1");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJJZZIII() {
        if (!C1474810oTv.LLJJJJLIIL()) {
            SimRadar.keyScan("SimplifyPlayerImpl", "onReadyForDisplay", this.LIZ.LJIIIIZZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReadyForDisplay, sourceId:");
            sbLIZ.append(this.LIZ.LJIIIIZZ);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            C1479490obT c1479490obT = this.LIZ;
            if (c1479490obT.LJJIL) {
                c1479490obT.LJJIZ = true;
            }
            final String str = c1479490obT.LJIIIIZZ;
            final OnPreRenderListener onPreRenderListener = c1479490obT.LJJIIJZLJL;
            c1479490obT.LJJIIJZLJL = null;
            C1479510obV c1479510obV = c1479490obT.LJI;
            if (c1479510obV != null) {
                c1479510obV.LIZIZ = null;
            }
            C1479850oc3 c1479850oc3 = c1479490obT.LJJJI;
            if (c1479850oc3.LIZ(str)) {
                c1479850oc3.LIZJ = true;
            }
            this.LIZ.LJJIII.LIZ(new Runnable() { // from class: X.0Mws
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onReadyForDisplay$1");
                    try {
                        OnPreRenderListener onPreRenderListener2 = onPreRenderListener;
                        if (onPreRenderListener2 != null) {
                            onPreRenderListener2.onPreRenderReady(str);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onReadyForDisplay$1");
                }
            });
            return;
        }
        C1479490obT c1479490obT2 = this.LIZ;
        c1479490obT2.LJJJJZI.getClass();
        SimRadar.keyScan("SimplifyPlayerImpl", "onReadyForDisplay", c1479490obT2.LJIIIIZZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onReadyForDisplay, sourceId:");
        sbLIZ2.append(c1479490obT2.LJIIIIZZ);
        C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
        if (c1479490obT2.LJJIL) {
            c1479490obT2.LJJIZ = true;
        }
        String str2 = c1479490obT2.LJIIIIZZ;
        OnPreRenderListener onPreRenderListener2 = c1479490obT2.LJJIIJZLJL;
        c1479490obT2.LJJIIJZLJL = null;
        C1479510obV c1479510obV2 = c1479490obT2.LJI;
        if (c1479510obV2 != null) {
            c1479510obV2.LIZIZ = null;
        }
        C1479850oc3 c1479850oc32 = c1479490obT2.LJJJI;
        if (c1479850oc32.LIZ(str2)) {
            c1479850oc32.LIZJ = true;
        }
        c1479490obT2.LJJIII.LIZ(new ARunnableS14S1100000_9(onPreRenderListener2, str2, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c0 A[PHI: r10
      0x02c0: PHI (r10v15 int) = (r10v14 int), (r10v19 int) binds: [B:129:0x02bc, B:45:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c5 A[PHI: r9 r10
      0x02c5: PHI (r9v15 int) = (r9v14 int), (r9v17 int) binds: [B:132:0x02c1, B:48:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r10v16 int) = (r10v15 int), (r10v18 int) binds: [B:132:0x02c1, B:48:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05b3 A[PHI: r10
      0x05b3: PHI (r10v2 int) = (r10v1 int), (r10v12 int) binds: [B:259:0x05af, B:181:0x03e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b8 A[PHI: r9 r10
      0x05b8: PHI (r9v2 int) = (r9v1 int), (r9v10 int) binds: [B:262:0x05b4, B:184:0x03f0] A[DONT_GENERATE, DONT_INLINE]
      0x05b8: PHI (r10v3 int) = (r10v2 int), (r10v11 int) binds: [B:262:0x05b4, B:184:0x03f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05bd A[PHI: r3 r9 r10
      0x05bd: PHI (r3v11 int) = (r3v10 int), (r3v21 int) binds: [B:265:0x05b9, B:190:0x0409] A[DONT_GENERATE, DONT_INLINE]
      0x05bd: PHI (r9v3 int) = (r9v2 int), (r9v9 int) binds: [B:265:0x05b9, B:190:0x0409] A[DONT_GENERATE, DONT_INLINE]
      0x05bd: PHI (r10v4 int) = (r10v3 int), (r10v10 int) binds: [B:265:0x05b9, B:190:0x0409] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05c2 A[PHI: r3 r5 r9 r10
      0x05c2: PHI (r3v12 int) = (r3v11 int), (r3v20 int) binds: [B:268:0x05be, B:193:0x0415] A[DONT_GENERATE, DONT_INLINE]
      0x05c2: PHI (r5v2 int) = (r5v1 int), (r5v10 int) binds: [B:268:0x05be, B:193:0x0415] A[DONT_GENERATE, DONT_INLINE]
      0x05c2: PHI (r9v4 int) = (r9v3 int), (r9v8 int) binds: [B:268:0x05be, B:193:0x0415] A[DONT_GENERATE, DONT_INLINE]
      0x05c2: PHI (r10v5 int) = (r10v4 int), (r10v9 int) binds: [B:268:0x05be, B:193:0x0415] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05c8 A[PHI: r3 r5 r9 r10 r19
      0x05c8: PHI (r3v13 int) = (r3v12 int), (r3v19 int), (r3v19 int) binds: [B:271:0x05c4, B:196:0x0422, B:198:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x05c8: PHI (r5v3 int) = (r5v2 int), (r5v9 int), (r5v9 int) binds: [B:271:0x05c4, B:196:0x0422, B:198:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x05c8: PHI (r9v5 int) = (r9v4 int), (r9v7 int), (r9v7 int) binds: [B:271:0x05c4, B:196:0x0422, B:198:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x05c8: PHI (r10v6 int) = (r10v5 int), (r10v8 int), (r10v8 int) binds: [B:271:0x05c4, B:196:0x0422, B:198:0x042a] A[DONT_GENERATE, DONT_INLINE]
      0x05c8: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v4 java.lang.String), (r19v4 java.lang.String) binds: [B:271:0x05c4, B:196:0x0422, B:198:0x042a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cc  */
    @Override // X.InterfaceC1472110oPZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL() {
        /*
            Method dump skipped, instruction units count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479500obU.LJLIIIL():void");
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLJJL() {
        if (!C1474810oTv.LLJJJJLIIL()) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRenderFromResume mUIPlayListener:");
                sbLIZ.append(this.LIZ.LJJIIJ);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
            C1479490obT c1479490obT = this.LIZ;
            OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
            if (onUIPlayListener != null) {
                c1479490obT.LJJIII.LIZ(new ARunnableS78S0200000_9(onUIPlayListener, this, 45));
                return;
            }
            return;
        }
        C1479490obT c1479490obT2 = this.LIZ;
        c1479490obT2.LJJJLIIL.getClass();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRenderFromResume mUIPlayListener:");
            sbLIZ2.append(c1479490obT2.LJJIIJ);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
        OnUIPlayListener onUIPlayListener2 = c1479490obT2.LJJIIJ;
        if (onUIPlayListener2 != null) {
            c1479490obT2.LJJIII.LIZ(new ARunnableS78S0200000_9(onUIPlayListener2, c1479490obT2, 46));
        }
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLJJLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VIDEO@");
        sbLIZ.append(this.LIZ.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onCompleteLoaded");
        C1479490obT c1479490obT = this.LIZ;
        final String str = c1479490obT.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0My4
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCompleteLoaded$1");
                try {
                    OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                    if (onUIPlayListener2 != null) {
                        onUIPlayListener2.onCompleteLoaded(str, this.LLILLL.LIZ.LJIIJJI);
                    }
                    C0NBW.LIZIZ().LIZ(str, "PlayerCallback_COMPLETE_LOADED");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onCompleteLoaded$1");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void onCompletion() {
        boolean z = false;
        if (C1474810oTv.LLJJJJLIIL()) {
            C1479490obT c1479490obT = this.LIZ;
            c1479490obT.LJJJJJ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(c1479490obT.LJIIIIZZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onPlayCompleted");
            OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
            if (onUIPlayListener != null) {
                String str = c1479490obT.LJIIIIZZ;
                InterfaceC1479610obf interfaceC1479610obfLJIILJJIL = c1479490obT.LJIILJJIL();
                if (interfaceC1479610obfLJIILJJIL != null && interfaceC1479610obfLJIILJJIL.LJJIIJ()) {
                    z = true;
                }
                if (c1479490obT.LJIILL == 0) {
                    c1479490obT.LJJIII.LIZ(new ARunnableS14S1200000_9(onUIPlayListener, c1479490obT.LJIIJJI(), str, 3));
                }
                c1479490obT.LJIILL++;
                c1479490obT.LJJIII.LIZ(new ARunnableS0S1210000_9(onUIPlayListener, z, c1479490obT, str, 0));
                C0NBW.LIZIZ().LIZ(new C1480270ocj(str, c1479490obT.LJIILL), "PlayerCallback_COMPLETE");
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VIDEO@");
        sbLIZ2.append(this.LIZ.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ2)).LIZIZ("onPlayCompleted");
        C1479490obT c1479490obT2 = this.LIZ;
        OnUIPlayListener onUIPlayListener2 = c1479490obT2.LJJIIJ;
        if (onUIPlayListener2 != null) {
            String str2 = c1479490obT2.LJIIIIZZ;
            InterfaceC1479610obf interfaceC1479610obfLJIILJJIL2 = c1479490obT2.LJIILJJIL();
            if (interfaceC1479610obfLJIILJJIL2 != null && interfaceC1479610obfLJIILJJIL2.LJJIIJ()) {
                z = true;
            }
            C1479490obT c1479490obT3 = this.LIZ;
            if (c1479490obT3.LJIILL == 0) {
                this.LIZ.LJJIII.LIZ(new ARunnableS14S1200000_9(onUIPlayListener2, c1479490obT3.LJIIJJI(), str2, 6));
            }
            C1479490obT c1479490obT4 = this.LIZ;
            c1479490obT4.LJIILL++;
            c1479490obT4.LJJIII.LIZ(new ARunnableS0S1210000_9(onUIPlayListener2, z, this, str2, 1));
            C0NBW.LIZIZ().LIZ(new C1480270ocj(str2, this.LIZ.LJIILL), "PlayerCallback_COMPLETE");
        }
    }

    @Override // X.InterfaceC1472110oPZ
    public final void onPrepare() {
        if (!C1474810oTv.LLJJJJLIIL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(this.LIZ.LJIIIIZZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onPrepare");
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPrepare mPrepareData ");
                sbLIZ2.append(this.LIZ.LJI);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LIZ.LJJJJ(false);
            C1479490obT c1479490obT = this.LIZ;
            final String str = c1479490obT.LJIIIIZZ;
            final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
            c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0obl
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPrepare$1");
                    try {
                        if (onUIPlayListener != null && !C1479780obw.LIZ(this.LLILLL.LIZ.LJI)) {
                            onUIPlayListener.onPlayPrepare(str);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPrepare$1");
                }
            });
            return;
        }
        C1479490obT c1479490obT2 = this.LIZ;
        c1479490obT2.LJJJJZ.getClass();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("VIDEO@");
        sbLIZ3.append(c1479490obT2.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ3)).LIZIZ("onPrepare");
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onPrepare mPrepareData ");
            sbLIZ4.append(c1479490obT2.LJI);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ4));
        }
        c1479490obT2.LJJJJ(false);
        String str2 = c1479490obT2.LJIIIIZZ;
        c1479490obT2.LJJIII.LIZ(new ARunnableS27S1200000_23(c1479490obT2.LJJIIJ, c1479490obT2, str2, 9));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void onPrepared() {
        if (C1474810oTv.LLJJJJLIIL()) {
            C1479490obT c1479490obT = this.LIZ;
            c1479490obT.LJJJJLL.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(c1479490obT.LJIIIIZZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onPrepared");
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPrepared(), surface = ");
                sbLIZ2.append(c1479490obT.LJII);
                sbLIZ2.append(", mPlayer = ");
                sbLIZ2.append(c1479490obT.LIZLLL);
                sbLIZ2.append(" mStatus = ");
                sbLIZ2.append(c1479490obT.LJIJI);
                sbLIZ2.append(", mPrepareOnly:");
                sbLIZ2.append(c1479490obT.LJJIL);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
            }
            boolean z = c1479490obT.LJJ.get();
            if (((Boolean) C1474810oTv.y0.getValue()).booleanValue() && z) {
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", "onPrepared(), isReleasing return");
                return;
            }
            String str = c1479490obT.LJIIIIZZ;
            OnPlayerPreparedListener onPlayerPreparedListener = c1479490obT.LJJIIZ;
            c1479490obT.LJJIIZ = null;
            C1479510obV c1479510obV = c1479490obT.LJI;
            if (c1479510obV != null) {
                c1479510obV.LIZJ = null;
            }
            c1479490obT.LJJIII.LIZ(new ARunnableS28S1100000_23(onPlayerPreparedListener, str, 14));
            c1479490obT.LJIIL = false;
            int i = c1479490obT.LJIJI;
            if (i == 1) {
                if (c1479490obT.LJJIIZI != null) {
                    c1479490obT.LJJJJ(false);
                    c1479490obT.LJJIIZI.getClass();
                }
                c1479490obT.LJIJI = 2;
                c1479490obT.LJIILJJIL = true;
                if (c1479490obT.LJIILIIL) {
                    c1479490obT.LJIJJLI = System.currentTimeMillis();
                    if (!c1479490obT.LJJIL) {
                        c1479490obT.start();
                    }
                }
            } else if (i == 5) {
                c1479490obT.pause();
            }
            String str2 = c1479490obT.LJIIIIZZ;
            C1479850oc3 c1479850oc3 = c1479490obT.LJJJI;
            if (c1479850oc3.LIZ(str2)) {
                c1479850oc3.LIZLLL = true;
            }
            c1479490obT.LJJIII.LIZ(new ARunnableS27S1200000_23(c1479490obT.LJJIIJ, c1479490obT, str2, 10));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("VIDEO@");
        sbLIZ3.append(this.LIZ.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ3)).LIZIZ("onPrepared");
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onPrepared(), surface = ");
            sbLIZ4.append(this.LIZ.LJII);
            sbLIZ4.append(", mPlayer = ");
            sbLIZ4.append(this.LIZ.LIZLLL);
            sbLIZ4.append(" mStatus = ");
            sbLIZ4.append(this.LIZ.LJIJI);
            sbLIZ4.append(", mPrepareOnly:");
            sbLIZ4.append(this.LIZ.LJJIL);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ4));
        }
        boolean z2 = this.LIZ.LJJ.get();
        if (((Boolean) C1474810oTv.y0.getValue()).booleanValue() && z2) {
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", "onPrepared(), isReleasing return");
            return;
        }
        C1479490obT c1479490obT2 = this.LIZ;
        String str3 = c1479490obT2.LJIIIIZZ;
        OnPlayerPreparedListener onPlayerPreparedListener2 = c1479490obT2.LJJIIZ;
        c1479490obT2.LJJIIZ = null;
        C1479510obV c1479510obV2 = c1479490obT2.LJI;
        if (c1479510obV2 != null) {
            c1479510obV2.LIZJ = null;
        }
        c1479490obT2.LJJIII.LIZ(new ARunnableS28S1100000_23(onPlayerPreparedListener2, str3, 15));
        C1479490obT c1479490obT3 = this.LIZ;
        c1479490obT3.LJIIL = false;
        int i2 = c1479490obT3.LJIJI;
        if (i2 == 1) {
            if (c1479490obT3.LJJIIZI != null) {
                c1479490obT3.LJJJJ(false);
                this.LIZ.LJJIIZI.getClass();
            }
            C1479490obT c1479490obT4 = this.LIZ;
            c1479490obT4.LJIJI = 2;
            c1479490obT4.LJIILJJIL = true;
            if (c1479490obT4.LJIILIIL) {
                c1479490obT4.LJIJJLI = System.currentTimeMillis();
                C1479490obT c1479490obT5 = this.LIZ;
                if (!c1479490obT5.LJJIL) {
                    c1479490obT5.start();
                }
            }
        } else if (i2 == 5) {
            c1479490obT3.pause();
        }
        C1479490obT c1479490obT6 = this.LIZ;
        final String str4 = c1479490obT6.LJIIIIZZ;
        C1479850oc3 c1479850oc32 = c1479490obT6.LJJJI;
        if (c1479850oc32.LIZ(str4)) {
            c1479850oc32.LIZLLL = true;
        }
        C1479490obT c1479490obT7 = this.LIZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT7.LJJIIJ;
        c1479490obT7.LJJIII.LIZ(new Runnable() { // from class: X.0obh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPrepared$1");
                try {
                    if (onUIPlayListener != null && !C1479780obw.LIZ(this.LLILLL.LIZ.LJI)) {
                        onUIPlayListener.onPlayPrepared(str4);
                        C0NBW.LIZIZ().LIZ(str4, "PlayerCallback_PREPARED");
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPrepared$1");
            }
        });
    }

    public C1479500obU(C1479490obT c1479490obT) {
        this.LIZ = c1479490obT;
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJL(boolean z) {
        C1479490obT c1479490obT = this.LIZ;
        String str = c1479490obT.LJIIIIZZ;
        c1479490obT.LJJIII.LIZ(new ARunnableS1S1110000_9(c1479490obT.LJJIIJ, str, z, 0));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLIL(final float f) {
        C1479490obT c1479490obT = this.LIZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        final String str = c1479490obT.LJIIIIZZ;
        c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0Mw2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onSpeedChanged$1");
                try {
                    OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                    if (onUIPlayListener2 != null) {
                        onUIPlayListener2.onSpeedChanged(str, f);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onSpeedChanged$1");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLJJI(int i) {
        this.LIZ.LJJIII.LIZ(new ARunnableS8S0100001_23(this, i / 1000.0f, 0));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLJLJ(final long j) {
        C1479490obT c1479490obT = this.LIZ;
        final String str = c1479490obT.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0My0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffered$1");
                try {
                    OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                    if (onUIPlayListener2 instanceof InterfaceC585610Mxz) {
                        ((InterfaceC585610Mxz) onUIPlayListener2).HP1();
                    }
                    OnUIPlayListener onUIPlayListener3 = onUIPlayListener;
                    if (onUIPlayListener3 != null) {
                        onUIPlayListener3.onBufferedTimeMs(str, j);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffered$1");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLL(List<Map<String, Object>> list) {
        C1479490obT c1479490obT = this.LIZ;
        c1479490obT.LJJIII.LIZ(new ARunnableS14S1200000_9(c1479490obT.LJJIIJ, list, c1479490obT.LJIIIIZZ, 9));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLLILLLL(long j) {
        boolean z;
        int iIntValue;
        long jLongValue;
        int iIntValue2;
        long jLongValue2;
        int iIntValue3;
        long j2;
        String str;
        String str2;
        int i;
        int i2;
        C1471500oOa videoInfo;
        boolean z2;
        int iIntValue4;
        long jLongValue3;
        int iIntValue5;
        long jLongValue4;
        int iIntValue6;
        long j3;
        String str3;
        String str4;
        int i3;
        int i4;
        C1471500oOa videoInfo2;
        String str5 = "";
        String str6 = null;
        if (C1474810oTv.LLJJJJLIIL()) {
            final C1479490obT c1479490obT = this.LIZ;
            c1479490obT.LJJJJLI.getClass();
            final String str7 = c1479490obT.LJIIIIZZ;
            C1479510obV c1479510obV = c1479490obT.LJI;
            if (c1479510obV != null && TextUtils.equals(c1479510obV.LJIIIZ, str7)) {
                C1479510obV c1479510obV2 = c1479490obT.LJI;
                if (c1479510obV2.LLJIJIL && j == -1) {
                    return;
                }
                z2 = false;
                c1479510obV2.LLJI = false;
            } else {
                z2 = false;
            }
            C1479850oc3 c1479850oc3 = c1479490obT.LJJJI;
            if (c1479850oc3.LIZ(str7)) {
                c1479850oc3.LIZJ = z2;
                c1479850oc3.LIZIZ = z2;
                c1479850oc3.LIZLLL = z2;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(c1479490obT.LJIIIIZZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onPlayStop");
            if (Intrinsics.LJFF(C1469250oKx.LIZ, c1479490obT)) {
                C1469250oKx.LIZ = null;
            }
            final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
            final JSONObject jSONObject = new JSONObject();
            try {
                c1479490obT.LJ();
                jSONObject.put("is_super_resolution", z2);
                C1472250oPn c1472250oPn = c1479490obT.LIZLLL;
                if (c1472250oPn != null && (videoInfo2 = c1472250oPn.getVideoInfo()) != null) {
                    j3 = C1479490obT.LJIJ(c1479490obT.LIZLLL, videoInfo2).LJFF;
                } else {
                    j3 = 0;
                }
                jSONObject.put("play_bitrate", j3);
                jSONObject.put("sr_fail_reason", (int) c1479490obT.LJFF(11));
                jSONObject.put("sr_per_effect_average_time", c1479490obT.LIZIZ(new AbstractC1472270oPp<Float>() { // from class: X.0oR9
                    {
                        Float.valueOf(0.0f);
                    }
                }));
                jSONObject.put("sr_effect_error_code", c1479490obT.LIZIZ(new AbstractC1472270oPp<Integer>() { // from class: X.0oRA
                }));
                jSONObject.put("sr_effect_error_str", c1479490obT.LIZIZ(new AbstractC1472270oPp<String>() { // from class: X.0oRB
                }));
                jSONObject.put("sr_algorithm_type", c1479490obT.LJFF(12));
                jSONObject.put("audio_codec_format", c1479490obT.LJFF(13));
                jSONObject.put("audio_bitrate", c1479490obT.LJFF(14));
                C1479510obV c1479510obV3 = c1479490obT.LJI;
                if (c1479510obV3 == null || (str3 = c1479510obV3.LLIILII) == null) {
                    str3 = "";
                }
                jSONObject.put("action_type", str3);
                if (!C1474810oTv.LLIILZL()) {
                    C1479510obV c1479510obV4 = c1479490obT.LJI;
                    if (c1479510obV4 != null && c1479510obV4.LLJJJJ) {
                        jSONObject.put("new_key", c1479490obT.LJJIJIIJIL);
                        jSONObject.put("play_url", c1479490obT.LJJIJIL);
                    }
                    jSONObject.put("engine_hash", c1479490obT.LJFF(16));
                    jSONObject.put("surface_hash", c1479490obT.LJFF(17));
                }
                C1479510obV c1479510obV5 = c1479490obT.LJI;
                if (c1479510obV5 != null && c1479510obV5.LLIILZL.longValue() != -1) {
                    long j4 = c1479490obT.LJIL;
                    if (j4 != -1) {
                        jSONObject.put("user_startup_dur", j4 - c1479490obT.LJI.LLIILZL.longValue());
                    }
                }
                if (C1479490obT.LJJLIIIJILLIZJL < ((Number) C1474810oTv.LLLLLZ.getValue()).intValue()) {
                    C1479490obT.LJJLIIIJILLIZJL++;
                    JSONObject jSONObject2 = new JSONObject();
                    if (C1284690jXH.LIZIZ == null) {
                        C1284690jXH.LIZIZ = C1284690jXH.LIZ("video/avc");
                    }
                    C1284700jXI c1284700jXI = C1284690jXH.LIZIZ;
                    if (c1284700jXI == null) {
                        str4 = "";
                    } else {
                        str4 = c1284700jXI.LIZ;
                    }
                    jSONObject2.put("264_decoder_name", str4);
                    if (C1284690jXH.LIZIZ == null) {
                        C1284690jXH.LIZIZ = C1284690jXH.LIZ("video/avc");
                    }
                    C1284700jXI c1284700jXI2 = C1284690jXH.LIZIZ;
                    if (c1284700jXI2 != null) {
                        i3 = c1284700jXI2.LIZIZ;
                    } else {
                        i3 = -1;
                    }
                    jSONObject2.put("264_width_limit", i3);
                    jSONObject2.put("264_height_limit", C1284690jXH.LIZJ());
                    if (C1284690jXH.LIZJ == null) {
                        C1284690jXH.LIZJ = C1284690jXH.LIZ("video/hevc");
                    }
                    C1284700jXI c1284700jXI3 = C1284690jXH.LIZJ;
                    if (c1284700jXI3 != null) {
                        str5 = c1284700jXI3.LIZ;
                    }
                    jSONObject2.put("bytevc1_decoder_name", str5);
                    if (C1284690jXH.LIZJ == null) {
                        C1284690jXH.LIZJ = C1284690jXH.LIZ("video/hevc");
                    }
                    C1284700jXI c1284700jXI4 = C1284690jXH.LIZJ;
                    if (c1284700jXI4 != null) {
                        i4 = c1284700jXI4.LIZIZ;
                    } else {
                        i4 = -1;
                    }
                    jSONObject2.put("bytevc1_width_limit", i4);
                    jSONObject2.put("bytevc1_height_limit", C1284690jXH.LIZIZ());
                    jSONObject.put("hw_codec_info", jSONObject2);
                }
                C1474810oTv.LJIILJJIL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final C1480430ocz c1480430oczLJIIJJI = c1479490obT.LJIIJJI();
            c1480430oczLJIIJJI.LJIILL = j;
            if (!C1474810oTv.LLIILZL()) {
                c1480430oczLJIIJJI.LJIILIIL = (Map) c1479490obT.LIZIZ(C1472510oQD.LIZLLL);
            }
            Integer num = (Integer) c1479490obT.LIZIZ(C1473040oR4.LIZLLL);
            if (num != null) {
                iIntValue4 = num.intValue();
            } else {
                iIntValue4 = 0;
            }
            Long l = (Long) c1479490obT.LIZIZ(C1473050oR5.LIZLLL);
            if (l != null) {
                jLongValue3 = l.longValue();
            } else {
                jLongValue3 = 0;
            }
            Integer num2 = (Integer) c1479490obT.LIZIZ(C1472610oQN.LIZLLL);
            if (num2 != null) {
                iIntValue5 = num2.intValue();
            } else {
                iIntValue5 = 0;
            }
            Long l2 = (Long) c1479490obT.LIZIZ(C1473060oR6.LIZLLL);
            if (l2 != null) {
                jLongValue4 = l2.longValue();
            } else {
                jLongValue4 = 0;
            }
            Integer num3 = (Integer) c1479490obT.LIZIZ(C1472600oQM.LIZLLL);
            if (num3 != null) {
                iIntValue6 = num3.intValue();
            } else {
                iIntValue6 = 0;
            }
            if (!C1474810oTv.LJJLI()) {
                str6 = (String) c1479490obT.LIZIZ(C1473070oR7.LIZLLL);
            }
            try {
                jSONObject.put("engine_seek_count", iIntValue4);
                jSONObject.put("engine_seek_time", jLongValue3);
                jSONObject.put("engine_uPause_count", iIntValue5);
                jSONObject.put("engine_uPause_time", jLongValue4);
                jSONObject.put("engine_tPause_count", 0);
                jSONObject.put("engine_tPause_time", 0L);
                jSONObject.put("engine_has_speed", iIntValue6);
                if (!TextUtils.isEmpty(str6)) {
                    jSONObject.put("engine_ttvqm_string", str6);
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            final HashMap map = new HashMap((Map) c1479490obT.LIZIZ(C1472530oQF.LIZLLL));
            C989250bql.LIZ(str7);
            c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0ocn
                public final void LIZ() {
                    OnUIPlayListener onUIPlayListener2;
                    if (C1479780obw.LIZ(c1479490obT.LJI) || (onUIPlayListener2 = onUIPlayListener) == null) {
                        return;
                    }
                    onUIPlayListener2.onPlayStop(str7);
                    OnUIPlayListener onUIPlayListener3 = onUIPlayListener;
                    String str8 = str7;
                    c1479490obT.LJ();
                    onUIPlayListener3.onPlayStop(str8, false);
                    C1480430ocz c1480430ocz = c1480430oczLJIIJJI;
                    long j5 = jCurrentTimeMillis;
                    c1480430ocz.LIZLLL = j5;
                    c1480430ocz.LJFF = j5;
                    c1480430ocz.LJ = jElapsedRealtime;
                    Map<? extends String, ? extends Object> map2 = map;
                    if (map2 != null) {
                        c1480430ocz.LJIIL.putAll(map2);
                    }
                    onUIPlayListener.onPlayStop(str7, jSONObject, c1480430ocz);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SimplifyPlayerOnPlayStopHelper@7c21.onPlayStop$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SimplifyPlayerOnPlayStopHelper@7c21.onPlayStop$1");
                }
            });
            return;
        }
        C1479490obT c1479490obT2 = this.LIZ;
        final String str8 = c1479490obT2.LJIIIIZZ;
        C1479510obV c1479510obV6 = c1479490obT2.LJI;
        if (c1479510obV6 != null && TextUtils.equals(c1479510obV6.LJIIIZ, str8)) {
            C1479510obV c1479510obV7 = this.LIZ.LJI;
            if (c1479510obV7.LLJIJIL && j == -1) {
                return;
            }
            z = false;
            c1479510obV7.LLJI = false;
        } else {
            z = false;
        }
        C1479850oc3 c1479850oc32 = this.LIZ.LJJJI;
        if (c1479850oc32.LIZ(str8)) {
            c1479850oc32.LIZJ = z;
            c1479850oc32.LIZIZ = z;
            c1479850oc32.LIZLLL = z;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VIDEO@");
        sbLIZ2.append(this.LIZ.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ2)).LIZIZ("onPlayStop");
        if (Intrinsics.LJFF(C1469250oKx.LIZ, this.LIZ)) {
            C1469250oKx.LIZ = null;
        }
        C1479490obT c1479490obT3 = this.LIZ;
        final OnUIPlayListener onUIPlayListener2 = c1479490obT3.LJJIIJ;
        final JSONObject jSONObject3 = new JSONObject();
        try {
            c1479490obT3.LJ();
            jSONObject3.put("is_super_resolution", false);
            C1472250oPn c1472250oPn2 = c1479490obT3.LIZLLL;
            if (c1472250oPn2 != null && (videoInfo = c1472250oPn2.getVideoInfo()) != null) {
                j2 = C1479490obT.LJIJ(c1479490obT3.LIZLLL, videoInfo).LJFF;
            } else {
                j2 = 0;
            }
            jSONObject3.put("play_bitrate", j2);
            jSONObject3.put("sr_fail_reason", (int) c1479490obT3.LJFF(11));
            jSONObject3.put("sr_per_effect_average_time", c1479490obT3.LIZIZ(new AbstractC1472270oPp<Float>() { // from class: X.0oR9
                {
                    Float.valueOf(0.0f);
                }
            }));
            jSONObject3.put("sr_effect_error_code", c1479490obT3.LIZIZ(new AbstractC1472270oPp<Integer>() { // from class: X.0oRA
            }));
            jSONObject3.put("sr_effect_error_str", c1479490obT3.LIZIZ(new AbstractC1472270oPp<String>() { // from class: X.0oRB
            }));
            jSONObject3.put("sr_algorithm_type", c1479490obT3.LJFF(12));
            jSONObject3.put("audio_codec_format", c1479490obT3.LJFF(13));
            jSONObject3.put("audio_bitrate", c1479490obT3.LJFF(14));
            C1479510obV c1479510obV8 = c1479490obT3.LJI;
            if (c1479510obV8 == null || (str = c1479510obV8.LLIILII) == null) {
                str = "";
            }
            jSONObject3.put("action_type", str);
            if (!C1474810oTv.LLIILZL()) {
                C1479510obV c1479510obV9 = c1479490obT3.LJI;
                if (c1479510obV9 != null && c1479510obV9.LLJJJJ) {
                    jSONObject3.put("new_key", c1479490obT3.LJJIJIIJIL);
                    jSONObject3.put("play_url", c1479490obT3.LJJIJIL);
                }
                jSONObject3.put("engine_hash", c1479490obT3.LJFF(16));
                jSONObject3.put("surface_hash", c1479490obT3.LJFF(17));
            }
            C1479510obV c1479510obV10 = c1479490obT3.LJI;
            if (c1479510obV10 != null && c1479510obV10.LLIILZL.longValue() != -1) {
                long j5 = c1479490obT3.LJIL;
                if (j5 != -1) {
                    jSONObject3.put("user_startup_dur", j5 - c1479490obT3.LJI.LLIILZL.longValue());
                }
            }
            if (C1479490obT.LJJLIIIJILLIZJL < ((Number) C1474810oTv.LLLLLZ.getValue()).intValue()) {
                C1479490obT.LJJLIIIJILLIZJL++;
                JSONObject jSONObject4 = new JSONObject();
                if (C1284690jXH.LIZIZ == null) {
                    C1284690jXH.LIZIZ = C1284690jXH.LIZ("video/avc");
                }
                C1284700jXI c1284700jXI5 = C1284690jXH.LIZIZ;
                if (c1284700jXI5 == null) {
                    str2 = "";
                } else {
                    str2 = c1284700jXI5.LIZ;
                }
                jSONObject4.put("264_decoder_name", str2);
                if (C1284690jXH.LIZIZ == null) {
                    C1284690jXH.LIZIZ = C1284690jXH.LIZ("video/avc");
                }
                C1284700jXI c1284700jXI6 = C1284690jXH.LIZIZ;
                if (c1284700jXI6 != null) {
                    i = c1284700jXI6.LIZIZ;
                } else {
                    i = -1;
                }
                jSONObject4.put("264_width_limit", i);
                jSONObject4.put("264_height_limit", C1284690jXH.LIZJ());
                if (C1284690jXH.LIZJ == null) {
                    C1284690jXH.LIZJ = C1284690jXH.LIZ("video/hevc");
                }
                C1284700jXI c1284700jXI7 = C1284690jXH.LIZJ;
                if (c1284700jXI7 != null) {
                    str5 = c1284700jXI7.LIZ;
                }
                jSONObject4.put("bytevc1_decoder_name", str5);
                if (C1284690jXH.LIZJ == null) {
                    C1284690jXH.LIZJ = C1284690jXH.LIZ("video/hevc");
                }
                C1284700jXI c1284700jXI8 = C1284690jXH.LIZJ;
                if (c1284700jXI8 != null) {
                    i2 = c1284700jXI8.LIZIZ;
                } else {
                    i2 = -1;
                }
                jSONObject4.put("bytevc1_width_limit", i2);
                jSONObject4.put("bytevc1_height_limit", C1284690jXH.LIZIZ());
                jSONObject3.put("hw_codec_info", jSONObject4);
            }
            C1474810oTv.LJIILJJIL();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        final C1480430ocz c1480430oczLJIIJJI2 = this.LIZ.LJIIJJI();
        c1480430oczLJIIJJI2.LJIILL = j;
        if (!C1474810oTv.LLIILZL()) {
            c1480430oczLJIIJJI2.LJIILIIL = (Map) this.LIZ.LIZIZ(C1472510oQD.LIZLLL);
        }
        Integer num4 = (Integer) this.LIZ.LIZIZ(C1473040oR4.LIZLLL);
        if (num4 != null) {
            iIntValue = num4.intValue();
        } else {
            iIntValue = 0;
        }
        Long l3 = (Long) this.LIZ.LIZIZ(C1473050oR5.LIZLLL);
        if (l3 != null) {
            jLongValue = l3.longValue();
        } else {
            jLongValue = 0;
        }
        Integer num5 = (Integer) this.LIZ.LIZIZ(C1472610oQN.LIZLLL);
        if (num5 != null) {
            iIntValue2 = num5.intValue();
        } else {
            iIntValue2 = 0;
        }
        Long l4 = (Long) this.LIZ.LIZIZ(C1473060oR6.LIZLLL);
        if (l4 != null) {
            jLongValue2 = l4.longValue();
        } else {
            jLongValue2 = 0;
        }
        Integer num6 = (Integer) this.LIZ.LIZIZ(C1472600oQM.LIZLLL);
        if (num6 != null) {
            iIntValue3 = num6.intValue();
        } else {
            iIntValue3 = 0;
        }
        if (!C1474810oTv.LJJLI()) {
            str6 = (String) this.LIZ.LIZIZ(C1473070oR7.LIZLLL);
        }
        try {
            jSONObject3.put("engine_seek_count", iIntValue);
            jSONObject3.put("engine_seek_time", jLongValue);
            jSONObject3.put("engine_uPause_count", iIntValue2);
            jSONObject3.put("engine_uPause_time", jLongValue2);
            jSONObject3.put("engine_tPause_count", 0);
            jSONObject3.put("engine_tPause_time", 0L);
            jSONObject3.put("engine_has_speed", iIntValue3);
            if (!TextUtils.isEmpty(str6)) {
                jSONObject3.put("engine_ttvqm_string", str6);
            }
        } catch (JSONException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        final HashMap map2 = new HashMap((Map) this.LIZ.LIZIZ(C1472530oQF.LIZLLL));
        C989250bql.LIZ(str8);
        this.LIZ.LJJIII.LIZ(new Runnable() { // from class: X.0ocm
            public final void LIZ() {
                OnUIPlayListener onUIPlayListener3;
                if (C1479780obw.LIZ(this.LLIZLLLIL.LIZ.LJI) || (onUIPlayListener3 = onUIPlayListener2) == null) {
                    return;
                }
                onUIPlayListener3.onPlayStop(str8);
                OnUIPlayListener onUIPlayListener4 = onUIPlayListener2;
                String str9 = str8;
                this.LLIZLLLIL.LIZ.LJ();
                onUIPlayListener4.onPlayStop(str9, false);
                C1480430ocz c1480430ocz = c1480430oczLJIIJJI2;
                long j6 = jCurrentTimeMillis2;
                c1480430ocz.LIZLLL = j6;
                c1480430ocz.LJFF = j6;
                c1480430ocz.LJ = jElapsedRealtime2;
                Map<? extends String, ? extends Object> map3 = map2;
                if (map3 != null) {
                    c1480430ocz.LJIIL.putAll(map3);
                }
                onUIPlayListener2.onPlayStop(str8, jSONObject3, c1480430ocz);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlayStop$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onPlayStop$1");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void onBuffering(final boolean z) {
        C1472250oPn c1472250oPn;
        C1472250oPn c1472250oPn2;
        if (C1474810oTv.LLJJJJLIIL()) {
            C1479490obT c1479490obT = this.LIZ;
            c1479490obT.LJJJJIZL.getClass();
            if (z) {
                SimRadar.traceGroup("SimBuffer").LIZ("buffer").LIZIZ();
            } else {
                SimRadar.traceGroup("SimBuffer").LIZ("buffer").LIZJ();
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBuffering: ");
                sbLIZ.append(z);
                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
            String str = c1479490obT.LJIIIIZZ;
            if (z) {
                if (c1479490obT.LJJIIJ != null && (((c1472250oPn2 = c1479490obT.LIZLLL) != null && c1472250oPn2.LJJJJL() != 0) || c1479490obT.LJIILJJIL)) {
                    c1479490obT.LJJIII.LIZ(new ARunnableS0S1210000_9(c1479490obT.LJJIIJ, z, c1479490obT.LJIIJJI(), str, 2));
                }
                C1477400oY6.LJJJJI.LJJII(System.currentTimeMillis(), str);
                return;
            }
            if (c1479490obT.LJIILJJIL) {
                c1479490obT.LJIL = SystemClock.elapsedRealtime();
            }
            c1479490obT.LJIILJJIL = false;
            c1479490obT.LJJIII.LIZ(new ARunnableS0S1210000_9(c1479490obT.LJJIIJ, z, c1479490obT.LJIIJJI(), str, 3));
            C1477400oY6.LJJJJI.LJJIFFI(System.currentTimeMillis(), str);
            return;
        }
        if (z) {
            SimRadar.traceGroup("SimBuffer").LIZ("buffer").LIZIZ();
        } else {
            SimRadar.traceGroup("SimBuffer").LIZ("buffer").LIZJ();
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onBuffering: ");
            sbLIZ2.append(z);
            C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1479490obT c1479490obT2 = this.LIZ;
        final String str2 = c1479490obT2.LJIIIIZZ;
        if (z) {
            if (c1479490obT2.LJJIIJ != null && (((c1472250oPn = c1479490obT2.LIZLLL) != null && c1472250oPn.LJJJJL() != 0) || this.LIZ.LJIILJJIL)) {
                C1479490obT c1479490obT3 = this.LIZ;
                final OnUIPlayListener onUIPlayListener = c1479490obT3.LJJIIJ;
                final C1480430ocz c1480430oczLJIIJJI = c1479490obT3.LJIIJJI();
                this.LIZ.LJJIII.LIZ(new Runnable() { // from class: X.0Mw0
                    public final void LIZ() {
                        if (onUIPlayListener != null) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            onUIPlayListener.onBuffering(true);
                            onUIPlayListener.onBuffering(str2, true, c1480430oczLJIIJJI);
                            if (C1481110oe5.LIZ) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("onBuffering: ");
                                sbLIZ3.append(z);
                                sbLIZ3.append(" -> ");
                                sbLIZ3.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                                C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffering$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffering$1");
                    }
                });
            }
            C1477400oY6.LJJJJI.LJJII(System.currentTimeMillis(), str2);
            return;
        }
        if (c1479490obT2.LJIILJJIL) {
            c1479490obT2.LJIL = SystemClock.elapsedRealtime();
        }
        C1479490obT c1479490obT4 = this.LIZ;
        c1479490obT4.LJIILJJIL = false;
        final OnUIPlayListener onUIPlayListener2 = c1479490obT4.LJJIIJ;
        final C1480430ocz c1480430oczLJIIJJI2 = c1479490obT4.LJIIJJI();
        this.LIZ.LJJIII.LIZ(new Runnable() { // from class: X.0Mw1
            public final void LIZ() {
                if (onUIPlayListener2 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    onUIPlayListener2.onBuffering(false);
                    onUIPlayListener2.onBuffering(str2, false, c1480430oczLJIIJJI2);
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onBuffering: ");
                        sbLIZ3.append(z);
                        sbLIZ3.append(" -> ");
                        sbLIZ3.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                        C1481110oe5.LIZIZ("SimplifyPlayerImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffering$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffering$2");
            }
        });
        C1477400oY6.LJJJJI.LJJIFFI(System.currentTimeMillis(), str2);
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLIIL(EnumC2281141EQm enumC2281141EQm, int i) {
        C1479490obT c1479490obT = this.LIZ;
        String str = c1479490obT.LJIIIIZZ;
        c1479490obT.LJJIII.LIZ(new ARunnableS2S1201000_9(c1479490obT.LJJIIJ, i, str, enumC2281141EQm, 2));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLILLLLZI(final int i, final long j) {
        C1479490obT c1479490obT = this.LIZ;
        final String str = c1479490obT.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0My1
            public final void LIZ() {
                OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                if (onUIPlayListener2 instanceof InterfaceC585610Mxz) {
                    ((InterfaceC585610Mxz) onUIPlayListener2).HP1();
                }
                OnUIPlayListener onUIPlayListener3 = onUIPlayListener;
                if (onUIPlayListener3 != null) {
                    onUIPlayListener3.onBufferedPercent(str, j, i);
                    C0NBW.LIZIZ().LIZ(new C585640My2(str, j, i), "PlayerCallback_BUFFERED_TIME");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffered$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onBuffered$2");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLJI(final float f, final int i) {
        C1479490obT c1479490obT = this.LIZ;
        final String str = c1479490obT.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0MuL
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onSeekStart$1");
                try {
                    OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                    if (onUIPlayListener2 != null) {
                        onUIPlayListener2.onSeekStart(str, i, f);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onSeekStart$1");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLJLLL(int i, JSONObject jSONObject) {
        C1479490obT c1479490obT = this.LIZ;
        c1479490obT.LJJIII.LIZ(new ARunnableS2S1201000_9(c1479490obT.LJJIIJ, i, c1479490obT.LJIIIIZZ, jSONObject, 3));
    }

    @Override // X.InterfaceC1472110oPZ
    public final void onVideoSizeChanged(final int i, final int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VIDEO@");
        sbLIZ.append(this.LIZ.LJIIIIZZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("onVideoSizeChanged");
        C1479490obT c1479490obT = this.LIZ;
        final String str = c1479490obT.LJIIIIZZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0Mxf
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onVideoSizeChanged$1");
                try {
                    OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                    if (onUIPlayListener2 != null) {
                        onUIPlayListener2.onVideoSizeChanged(str, i, i2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onVideoSizeChanged$1");
            }
        });
    }

    @Override // X.InterfaceC1472110oPZ
    public final void LJLI(int i, int i2, String str) {
        C1479490obT c1479490obT = this.LIZ;
        OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        String str2 = c1479490obT.LJIIIIZZ;
        c1479490obT.LJJIII.LIZ(new ARunnableS14S1200000_9(onUIPlayListener, new Object() { // from class: X.0ocl
        }, str2, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    @Override // X.InterfaceC1472110oPZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJL(int r21, int r22, java.lang.Object r23, java.util.Map r24) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479500obU.LJLJL(int, int, java.lang.Object, java.util.Map):void");
    }

    @Override // X.InterfaceC1472110oPZ
    public final void onFrameAboutToBeRendered(final int i, final long j, final long j2, final Map<Integer, String> map) {
        C1479490obT c1479490obT = this.LIZ;
        final OnUIPlayListener onUIPlayListener = c1479490obT.LJJIIJ;
        if (onUIPlayListener != null) {
            c1479490obT.LJJIII.LIZ(new Runnable() { // from class: X.0MxQ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onFrameAboutToBeRendered$1");
                    try {
                        onUIPlayListener.onFrameAboutToBeRendered(i, j, j2, map);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onFrameAboutToBeRendered$1");
                }
            });
        }
    }
}
