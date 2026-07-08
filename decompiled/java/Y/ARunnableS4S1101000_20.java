package Y;

import X.C1266350j3h;
import X.C1267500j5Y;
import X.C1273190jEj;
import X.C1274810jHL;
import X.C1274820jHM;
import X.C1274830jHN;
import X.C1274860jHQ;
import X.C1277530jLj;
import X.C1278780jNk;
import X.C1282760jUA;
import X.C1301260jy0;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1289180jeW;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.canvas.player.PlayerContext;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS4S1101000_20 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    public static final void run$4(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        LynxEventReporter.lambda$updateGenericInfo$2(aRunnableS4S1101000_20.i2, aRunnableS4S1101000_20.s0, aRunnableS4S1101000_20.l1);
    }

    public static final void run$5(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        LynxEventReporter.lambda$onEvent$1((InterfaceC1289180jeW) aRunnableS4S1101000_20.l1, aRunnableS4S1101000_20.i2, aRunnableS4S1101000_20.s0);
    }

    public static final void run$6(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        LynxEventReporter.lambda$onEvent$0(aRunnableS4S1101000_20.i2, aRunnableS4S1101000_20.s0, (Map) aRunnableS4S1101000_20.l1);
    }

    public final void LIZ$0() {
        int[] iArr = new int[0];
        if (this.i2 == 0) {
            PlayerContext playerContext = (PlayerContext) this.l1;
            if (playerContext.LIZ != null) {
                double d = playerContext.LIZLLL;
                if (d != 0.0d) {
                    playerContext.setCurrentTime(d);
                }
                ((PlayerContext) this.l1).LIZ.getRotation();
                iArr = new int[]{((PlayerContext) this.l1).LIZ.getVideoWidth(), ((PlayerContext) this.l1).LIZ.getVideoHeight(), ((PlayerContext) this.l1).LIZ.getDuration(), 0};
            }
        }
        long j = ((PlayerContext) this.l1).LIZIZ;
        if (j != 0) {
            PlayerContext.nativeNotifyPlayerState(j, this.i2, iArr, this.s0);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        Callback callback;
        C1301260jy0 c1301260jy0 = (C1301260jy0) this.l1;
        if (c1301260jy0.LIZJ[0]) {
            return;
        }
        JavaOnlyMap javaOnlyMapCreateResult = c1301260jy0.LJIIIZ.createResult(this.i2, this.s0);
        javaOnlyMapCreateResult.putString("uri", ((C1301260jy0) this.l1).LIZIZ);
        javaOnlyMapCreateResult.putString("type", ((C1301260jy0) this.l1).LIZLLL);
        ((C1301260jy0) this.l1).LJ.pushMap(javaOnlyMapCreateResult);
        int[] iArr = ((C1301260jy0) this.l1).LJFF;
        iArr[0] = iArr[0] + 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComplete:");
        sbLIZ.append(((C1301260jy0) this.l1).LIZIZ);
        sbLIZ.append(" msg:");
        sbLIZ.append(this.s0);
        sbLIZ.append(" count:");
        sbLIZ.append(((C1301260jy0) this.l1).LJFF[0]);
        LynxLog.i("LynxResourceModule", C2188811AlT.LIZIZ(sbLIZ));
        C1301260jy0 c1301260jy02 = (C1301260jy0) this.l1;
        if (c1301260jy02.LJFF[0] != c1301260jy02.LJI || (callback = c1301260jy02.LJII) == null) {
            return;
        }
        c1301260jy02.LIZJ[0] = true;
        callback.invoke(c1301260jy02.LJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S1101000_20.LIZ$2():void");
    }

    public final void LIZ$3() {
        C1273190jEj c1273190jEj;
        StreamKey streamKey = new StreamKey(((C1274820jHM) this.l1).LIZ.LJJLIIIJJI, this.s0, StreamIndex.STREAM_INDEX_MAIN);
        C1274810jHL c1274810jHL = ((C1274820jHM) this.l1).LIZ;
        if (c1274810jHL.LJJ != null) {
            synchronized (c1274810jHL.LJJIFFI) {
                try {
                    C1274860jHQ c1274860jHQ = (C1274860jHQ) ((ConcurrentHashMap) ((C1274820jHM) this.l1).LIZ.LJJIFFI).remove(this.s0);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove sink uid:");
                    sbLIZ.append(this.s0);
                    sbLIZ.append(",[");
                    sbLIZ.append(this);
                    sbLIZ.append("], mVideoSinkMap.size=");
                    sbLIZ.append(((ConcurrentHashMap) ((C1274820jHM) this.l1).LIZ.LJJIFFI).size());
                    AVLog.ioi("ClientImpl", C2188811AlT.LIZIZ(sbLIZ));
                    if (c1274860jHQ != null) {
                        c1274860jHQ.LJII();
                    }
                    ((C1274820jHM) this.l1).LIZ.LJJIJIIJIL(streamKey);
                    C1274810jHL c1274810jHL2 = ((C1274820jHM) this.l1).LIZ;
                    C1267500j5Y c1267500j5Y = c1274810jHL2.LJLIIL;
                    if (c1267500j5Y != null && c1267500j5Y.LIZ.LJI && (c1273190jEj = c1274810jHL2.LJLLILLLL) != null) {
                        String str = this.s0;
                        Handler handler = c1273190jEj.LLILLL.LIZIZ;
                        if (handler != null) {
                            C786410Ut5.LJJZZIII(handler, new ARunnableS25S1100000_20(c1273190jEj, str, 28));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (((C1274820jHM) this.l1).LIZ.LLIIL() || ((C1274820jHM) this.l1).LIZ.LJJ != null) {
            ((C1274820jHM) this.l1).LIZ.LLFZ(streamKey);
        }
        ((C1274820jHM) this.l1).LIZ.LLIIJI(true, false);
        C1274810jHL c1274810jHL3 = ((C1274820jHM) this.l1).LIZ;
        c1274810jHL3.LJZL.LIZ(c1274810jHL3, 8, this.i2, 0L, this.s0);
    }

    public final void LIZ$4() {
        C1274830jHN c1274830jHN = ((C1274810jHL) this.l1).LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interactId:");
        sbLIZ.append(this.s0);
        sbLIZ.append(",volume:");
        sbLIZ.append(this.i2);
        c1274830jHN.LJIIIIZZ("setRemoteAudioPlaybackVolume", C2188811AlT.LIZIZ(sbLIZ));
        C1274810jHL c1274810jHL = (C1274810jHL) this.l1;
        c1274810jHL.LJI.setRemoteAudioPlaybackVolume(c1274810jHL.LJJLIIIJJI, this.s0, this.i2);
    }

    public static final void run$0(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("VeLivePusherNative@f0e0.scheduleReplayPendingCapturePreviewDisplay$1");
        try {
            ((C1277530jLj) aRunnableS4S1101000_20.l1).LJII(aRunnableS4S1101000_20.i2 + 1, aRunnableS4S1101000_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VeLivePusherNative@f0e0.scheduleReplayPendingCapturePreviewDisplay$1");
    }

    public static final void run$1(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerContext@7b4d.callbackOnThreadTriggerLoad$1");
        try {
            aRunnableS4S1101000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerContext@7b4d.callbackOnThreadTriggerLoad$1");
    }

    public static final void run$10(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        C1278780jNk c1278780jNk = (C1278780jNk) aRunnableS4S1101000_20.l1;
        int i = aRunnableS4S1101000_20.i2;
        String str = aRunnableS4S1101000_20.s0;
        c1278780jNk.getClass();
        C1C7U.LIZ("VeLiveParamsUpdateWrapper@264c.adaptVideoFpsForEncode$1L");
        c1278780jNk.LIZ(i, str);
        C1C7U.LIZIZ("VeLiveParamsUpdateWrapper@264c.adaptVideoFpsForEncode$1L");
    }

    public static final void run$2(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxResourceModule@82cc.resourcePrefetchAwaitComplete$2$onComplete$1");
        try {
            aRunnableS4S1101000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxResourceModule@82cc.resourcePrefetchAwaitComplete$2$onComplete$1");
    }

    public static final void run$3(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreUploadBWProbe@c7a5.startBWTestInternal$1");
        try {
            aRunnableS4S1101000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreUploadBWProbe@c7a5.startBWTestInternal$1");
    }

    public static final void run$7(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.<field>$6$onUserLeave$1");
        try {
            aRunnableS4S1101000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.<field>$6$onUserLeave$1");
    }

    public static final void run$8(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.setRemoteAudioPlaybackVolume$1");
        try {
            aRunnableS4S1101000_20.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.setRemoteAudioPlaybackVolume$1");
    }

    public static final void run$9(ARunnableS4S1101000_20 aRunnableS4S1101000_20) {
        C1266350j3h c1266350j3h = (C1266350j3h) aRunnableS4S1101000_20.l1;
        int i = aRunnableS4S1101000_20.i2;
        String str = aRunnableS4S1101000_20.s0;
        c1266350j3h.getClass();
        C1C7U.LIZ("LiveStream@24e7.adaptVideoFpsForEncode$1L");
        c1266350j3h.LJL(i, str);
        C1C7U.LIZIZ("LiveStream@24e7.adaptVideoFpsForEncode$1L");
    }

    public ARunnableS4S1101000_20(C1282760jUA c1282760jUA, String str, int i) {
        this.$t = i;
        this.l1 = c1282760jUA;
        this.s0 = str;
        this.i2 = 1;
    }

    public ARunnableS4S1101000_20(int i, String str, Object obj, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
