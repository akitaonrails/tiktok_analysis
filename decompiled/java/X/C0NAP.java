package X;

import Y.AObjectS384S0100000_9;
import Y.AObjectS62S0000000_9;
import Y.ARunnableS14S1100000_9;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.mediabox.playerui.componnents.cover.preloader.VideoCoverPreloader$init$1;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NAP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAP {
    public static final C01GW<C0NAP> LJIIJJI = C452501pT.LIZIZ(new AObjectS62S0000000_9(44));
    public static final C603820NmG<String, Boolean> LJIIL = new C603820NmG<>(32);
    public VideoCoverPreloader$init$1 LIZLLL;
    public boolean LJI;
    public final ArrayList<C0NAS> LIZ = new ArrayList<>();
    public String LIZIZ = "";
    public final HandlerThread LIZJ = new HandlerThread("VideoCoverPreloader");
    public final ExecutorC587170N1f LJ = new Executor() { // from class: X.0N1f
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            VideoCoverPreloader$init$1 videoCoverPreloader$init$1 = this.LL.LIZLLL;
            if (videoCoverPreloader$init$1 != null) {
                C786410Ut5.LJJZZIII(videoCoverPreloader$init$1, runnable);
            }
        }
    };
    public C0NAT LJFF = new C0NAT() { // from class: X.0NAU
        @Override // X.C0NAT
        public final int LIZ() {
            return 5;
        }

        @Override // X.C0NAT
        public final boolean LIZIZ() {
            return true;
        }

        @Override // X.C0NAT
        public final boolean LIZJ() {
            return true;
        }

        @Override // X.C0NAT
        public final boolean LIZLLL() {
            return true;
        }

        @Override // X.C0NAT
        public final boolean LJ(String str) {
            return true;
        }

        @Override // X.C0NAT
        public final boolean LJFF() {
            return false;
        }
    };
    public final C603820NmG<String, Boolean> LJII = new C603820NmG<>(10);
    public final C603820NmG<String, Boolean> LJIIIIZZ = new C603820NmG<>(64);
    public final CopyOnWriteArrayList<Pair<Integer, Runnable>> LJIIIZ = new CopyOnWriteArrayList<>();
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AObjectS384S0100000_9(this, 33));

    public final boolean LIZLLL() {
        return this.LJFF.LIZJ();
    }

    public final int LJ(String str) {
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((C0NAS) ListProtector.get(this.LIZ, i)).LIZ)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.mediabox.playerui.componnents.cover.preloader.VideoCoverPreloader$init$1] */
    public final void LJFF(C1487240ony c1487240ony) {
        if (this.LJI) {
            return;
        }
        this.LJFF = c1487240ony;
        if (LIZLLL()) {
            this.LIZJ.start();
            final Looper looperW2 = C786410Ut5.W2(this.LIZJ);
            this.LIZLLL = new BPEAHandler(looperW2) { // from class: com.ss.android.ugc.mediabox.playerui.componnents.cover.preloader.VideoCoverPreloader$init$1
                /* JADX WARN: Removed duplicated region for block: B:110:0x0291  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x02a1 A[LOOP:3: B:112:0x029b->B:114:0x02a1, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x020a  */
                @Override // android.os.Handler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void handleMessage(android.os.Message r10) {
                    /*
                        Method dump skipped, instruction units count: 712
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.mediabox.playerui.componnents.cover.preloader.VideoCoverPreloader$init$1.handleMessage(android.os.Message):void");
                }
            };
            C1478160oZK.LIZ().LJJI(new InterfaceC1475290oUh() { // from class: X.0NAQ
                @Override // X.InterfaceC1475290oUh
                public final void LIZLLL(List<SimVideoUrlModel> list) {
                }

                @Override // X.InterfaceC1475290oUh
                public final void LJFF(SimVideoUrlModel simVideoUrlModel) {
                }

                @Override // X.InterfaceC1475290oUh
                public final void LIZJ(Pair<SimVideoUrlModel, String> pair) {
                    SimVideoUrlModel simVideoUrlModel;
                    String sourceId;
                    if (pair != null && (simVideoUrlModel = (SimVideoUrlModel) pair.first) != null && (sourceId = simVideoUrlModel.getSourceId()) != null) {
                        C0NAP c0nap = this.LL;
                        if (c0nap.LJFF.LJFF()) {
                            c0nap.LJIIIIZZ.LIZLLL(sourceId, Boolean.TRUE);
                            ARunnableS14S1100000_9 aRunnableS14S1100000_9 = new ARunnableS14S1100000_9(c0nap, sourceId, 20);
                            boolean z = C587180N1g.LIZ;
                            if (C587180N1g.LIZ) {
                                c0nap.LIZIZ(aRunnableS14S1100000_9, 1);
                                return;
                            } else {
                                aRunnableS14S1100000_9.run();
                                return;
                            }
                        }
                        c0nap.LJIIIIZZ(sourceId);
                    }
                }
            });
            OnUIPlayListener onUIPlayListener = new OnUIPlayListener() { // from class: X.0N1e
                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                    return C583620Mum.LIZ(this);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                    C583620Mum.LIZIZ(this, str, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
                    C583620Mum.LIZJ(this, str, j, i);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
                    C583620Mum.LIZLLL(this, str, j);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(String str, boolean z) {
                    C583620Mum.LJ(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(boolean z) {
                    C583620Mum.LJI(this, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onCrosstalkHappened(String str) {
                    C583620Mum.LJIIIIZZ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
                    C583620Mum.LJIIIZ(this, str, list);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
                    C583620Mum.LJIIJ(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                    C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(boolean z) {
                    C583620Mum.LJIIL(this, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                    C583620Mum.LJIILIIL(this, i, j, j2, map);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                    C583620Mum.LJIILJJIL(this, str, c1480420ocy);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onLoopPlay(String str, int i) {
                    C583620Mum.LJIILL(this, str, i);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                    C583620Mum.LJIILLIIL(this, str, c1480290ocl);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPausePlay(String str) {
                    C583620Mum.LJIIZILJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJIJ(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompleted(String str) {
                    C583620Mum.LJIJI(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompleted(String str, int i) {
                    C583620Mum.LJIJJ(this, str, i);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                    C583620Mum.LJIJJLI(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJIL(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
                    C583620Mum.LJJIFFI(this, c1481290oeN);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                    C583620Mum.LJJ(this, str, c1481290oeN);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayPause(String str) {
                    C583620Mum.LJJII(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayPrepare(String str) {
                    C583620Mum.LJJIII(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayPrepared(String str) {
                    C583620Mum.LJJIIJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayProgressChange(float f) {
                    C583620Mum.LJJIIJZLJL(this, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                    C583620Mum.LJJIIZ(this, str, j, j2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayRelease(String str) {
                    C583620Mum.LJJIIZI(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
                    C583620Mum.LJJIJIIJI(this, str, jSONObject);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str, boolean z) {
                    C583620Mum.LJJIJIL(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                    C583620Mum.LJJIJL(this, str, i, jSONObject);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJIL(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                    C583620Mum.LJJIZ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreparePlay(String str) {
                    C583620Mum.LJJJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJJI(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                    C583620Mum.LJJJJ(this, c1480420ocy);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
                    C583620Mum.LJJJJI(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                    C583620Mum.LJJJJIZL(this, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onResumePlay(String str) {
                    C583620Mum.LJJJJJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJJJJL(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
                    C583620Mum.LJJJJLI(this, c1481290oeN);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                    C583620Mum.LJJJJL(this, str, c1481290oeN);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSeekEnd(String str, boolean z) {
                    C583620Mum.LJJJJLL(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSeekStart(String str, int i, float f) {
                    C583620Mum.LJJJJZ(this, str, i, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSpeedChanged(String str, float f) {
                    C583620Mum.LJJJJZI(this, str, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onStopPlay(String str) {
                    C583620Mum.LJJJLIIL(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
                    C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoSecondFrame(String str) {
                    C583620Mum.LJJJLZIJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
                    C583620Mum.LJJJZ(this, str, i, i2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str) {
                    if (str != null) {
                        this.LL.LJII.LIZLLL(str, Boolean.FALSE);
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlaying(String str) {
                    if (this.LL.LJFF.LJFF()) {
                        ARunnableS14S1100000_9 aRunnableS14S1100000_9 = new ARunnableS14S1100000_9(this.LL, str, 21);
                        boolean z = C587180N1g.LIZ;
                        if (C587180N1g.LIZ) {
                            this.LL.LIZIZ(aRunnableS14S1100000_9, 2);
                            return;
                        } else {
                            aRunnableS14S1100000_9.run();
                            return;
                        }
                    }
                    this.LL.LJII(str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onCompleteLoaded(String str, boolean z) {
                    VideoCoverPreloader$init$1 videoCoverPreloader$init$1;
                    Message messageObtainMessage;
                    if (this.LL.LJFF.LJFF()) {
                        boolean z2 = C587180N1g.LIZ;
                        return;
                    }
                    C0NAP c0nap = this.LL;
                    if (c0nap.LIZLLL() && c0nap.LJFF.LIZLLL() && str != null && str.length() != 0 && (videoCoverPreloader$init$1 = c0nap.LIZLLL) != null && (messageObtainMessage = videoCoverPreloader$init$1.obtainMessage(3, str)) != null) {
                        messageObtainMessage.sendToTarget();
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                    if (str != null) {
                        this.LL.LJII.LIZLLL(str, Boolean.TRUE);
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                    VideoCoverPreloader$init$1 videoCoverPreloader$init$1;
                    Message messageObtainMessage;
                    C0NAP c0nap = this.LL;
                    if (c0nap.LIZLLL() && str != null && str.length() != 0 && z && Intrinsics.LJFF(c0nap.LJII.LIZJ(str), Boolean.TRUE) && (videoCoverPreloader$init$1 = c0nap.LIZLLL) != null && (messageObtainMessage = videoCoverPreloader$init$1.obtainMessage(4, str)) != null) {
                        messageObtainMessage.sendToTarget();
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                    if (str != null) {
                        this.LL.LJII.LIZLLL(str, Boolean.FALSE);
                    }
                }
            };
            List<OnUIPlayListener> list = C585450Mxj.LLILLJJLI;
            if (!list.contains(onUIPlayListener)) {
                list.add(onUIPlayListener);
            }
            if (this.LJFF.LJFF()) {
                boolean z = C587180N1g.LIZ;
                C587180N1g.LIZ((C587200N1i) this.LJIIJ.getValue());
            }
            this.LJI = true;
        }
    }

    public final void LJI(String str) {
        VideoCoverPreloader$init$1 videoCoverPreloader$init$1;
        Message messageObtainMessage;
        if (LIZLLL() && str != null && str.length() != 0 && (videoCoverPreloader$init$1 = this.LIZLLL) != null && (messageObtainMessage = videoCoverPreloader$init$1.obtainMessage(6, str)) != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    public final void LJII(String str) {
        VideoCoverPreloader$init$1 videoCoverPreloader$init$1;
        Message messageObtainMessage;
        if (LIZLLL() && this.LJFF.LIZLLL() && !TextUtils.isEmpty(str) && (videoCoverPreloader$init$1 = this.LIZLLL) != null && (messageObtainMessage = videoCoverPreloader$init$1.obtainMessage(5, str)) != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    public final void LJIIIIZZ(String str) {
        VideoCoverPreloader$init$1 videoCoverPreloader$init$1;
        Message messageObtainMessage;
        boolean zLJI = MethodIDManager.LJI(71664);
        if (LIZLLL() && this.LJFF.LIZIZ() && str != null && str.length() != 0 && (videoCoverPreloader$init$1 = this.LIZLLL) != null && (messageObtainMessage = videoCoverPreloader$init$1.obtainMessage(2, str)) != null) {
            messageObtainMessage.sendToTarget();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static boolean LIZJ(String str, String str2) {
        if (str == null) {
            return false;
        }
        C603820NmG<String, Boolean> c603820NmG = LJIIL;
        Boolean boolLIZJ = c603820NmG.LIZJ(str);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolLIZJ, bool)) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        boolean zLJII = C1328130kfL.LJIILIIL().LJIILL().LJII(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(UriProtector.parse(str2)), null));
        if (zLJII) {
            c603820NmG.LIZLLL(str, bool);
        }
        return zLJII;
    }

    public final void LIZIZ(Runnable runnable, int i) {
        for (Pair<Integer, Runnable> pair : this.LJIIIZ) {
            Integer num = (Integer) pair.first;
            if (num != null && num.intValue() == i) {
                this.LJIIIZ.remove(pair);
            }
        }
        this.LJIIIZ.add(new Pair<>(Integer.valueOf(i), runnable));
    }

    public final void LIZ(String str, boolean z, List list) {
        VideoCoverPreloader$init$1 videoCoverPreloader$init$1;
        Message messageObtainMessage;
        if (LIZLLL() && str != null && str.length() != 0 && this.LJFF.LJ(str) && (videoCoverPreloader$init$1 = this.LIZLLL) != null && (messageObtainMessage = videoCoverPreloader$init$1.obtainMessage(1, new C0NAR(new ArrayList(list), z, str))) != null) {
            messageObtainMessage.sendToTarget();
        }
    }
}
