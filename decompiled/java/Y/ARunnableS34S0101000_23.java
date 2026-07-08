package Y;

import X.C1466990oHJ;
import X.C1468940oKS;
import X.C1470430oMr;
import X.C1479690obn;
import X.C1490840otm;
import X.C1499180p7E;
import X.C1499230p7J;
import X.C1502140pC0;
import X.C1522950pjZ;
import X.C1522990pjd;
import X.C1523000pje;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1467950oIr;
import X.InterfaceC1499200p7G;
import X.InterfaceC1523020pjg;
import com.bytedance.live.render.engine.alphaplayer.player.TTMultiplePlayerImplV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS34S0101000_23 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void run$13(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1468940oKS.LLLZZ((C1468940oKS) aRunnableS34S0101000_23.l0, aRunnableS34S0101000_23.i1);
    }

    public static final void run$16(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1479690obn.LJIIL((C1479690obn) aRunnableS34S0101000_23.l0, aRunnableS34S0101000_23.i1);
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
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ$0() {
        TTMultiplePlayerImplV2 tTMultiplePlayerImplV2 = (TTMultiplePlayerImplV2) this.l0;
        IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = tTMultiplePlayerImplV2.preparedListener;
        if (onPreparedListener != 0) {
            onPreparedListener.onPrepared(tTMultiplePlayerImplV2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareDecoder, Decoder ");
        sbLIZ.append(this.i1);
        sbLIZ.append(", call onPrepared end");
        C20441214yg.LJIIIZ("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        ((TTMultiplePlayerImplV2) this.l0).LIZJ(this.i1 + 1, "immediately");
    }

    public static final void run$0(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        InterfaceC1523020pjg interfaceC1523020pjgRemove;
        AtomicBoolean atomicBoolean;
        C1522950pjZ c1522950pjZ = (C1522950pjZ) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        C1C7U.LIZ("SocketPlatformMisc@120d.scheduleConnectTimeout$1L");
        c1522950pjZ.LJII.remove(Integer.valueOf(i));
        ConcurrentHashMap<Integer, C1522990pjd> concurrentHashMap = C1523000pje.LIZ;
        C1522990pjd c1522990pjd = concurrentHashMap.get(Integer.valueOf(i));
        if ((c1522990pjd == null || (atomicBoolean = c1522990pjd.LIZIZ) == null || !atomicBoolean.get()) && (interfaceC1523020pjgRemove = c1522950pjZ.LIZJ.remove(Integer.valueOf(i))) != null) {
            C1522990pjd c1522990pjdRemove = concurrentHashMap.remove(Integer.valueOf(i));
            if (c1522990pjdRemove != null) {
                c1522990pjdRemove.LIZIZ.set(false);
                c1522990pjdRemove.LIZ.stopConnection();
            }
            c1522950pjZ.LIZLLL.remove(Integer.valueOf(i));
            c1522950pjZ.LJ.remove(Integer.valueOf(i));
            c1522950pjZ.LJJZZIII(i);
            c1522950pjZ.LJL(new AObjectS397S0100000_23(interfaceC1523020pjgRemove, 2));
            c1522950pjZ.LJL(new AObjectS397S0100000_23(interfaceC1523020pjgRemove, 3));
        }
        C1C7U.LIZIZ("SocketPlatformMisc@120d.scheduleConnectTimeout$1L");
    }

    public static final void run$1(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        InterfaceC1523020pjg interfaceC1523020pjg;
        C1522950pjZ c1522950pjZ = (C1522950pjZ) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        C1C7U.LIZ("SocketPlatformMisc@120d.schedulePendingTimeout$1L");
        c1522950pjZ.LJI.remove(Integer.valueOf(i));
        JSONObject jSONObjectRemove = c1522950pjZ.LJFF.remove(Integer.valueOf(i));
        if (jSONObjectRemove != null && (interfaceC1523020pjg = c1522950pjZ.LIZJ.get(Integer.valueOf(i))) != null) {
            C1502140pC0 c1502140pC0Remove = c1522950pjZ.LJ.remove(Integer.valueOf(i));
            if (c1502140pC0Remove == null) {
                c1502140pC0Remove = C1502140pC0.LIZIZ;
            }
            c1522950pjZ.LJLI(i, c1502140pC0Remove, jSONObjectRemove, interfaceC1523020pjg);
        }
        C1C7U.LIZIZ("SocketPlatformMisc@120d.schedulePendingTimeout$1L");
    }

    public static final void run$10(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1466990oHJ c1466990oHJ = (C1466990oHJ) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1466990oHJ.getClass();
        C1C7U.LIZ("TTVideoEngineImplV2@94da._renderStart$1L");
        InterfaceC1467950oIr interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ;
        if (interfaceC1467950oIr != null) {
            long jLJIIJ = ((C1470430oMr) interfaceC1467950oIr).LJIIJ(63, 0L);
            int i2 = c1466990oHJ.LJLJJL;
            if ((i2 == 1 || (i2 == 0 && jLJIIJ < 0)) && i > 0) {
                C786410Ut5.LJLIIL(i, c1466990oHJ.LJLJJLL, c1466990oHJ.LJLJL);
            }
        }
        C1C7U.LIZIZ("TTVideoEngineImplV2@94da._renderStart$1L");
    }

    public static final void run$11(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1466990oHJ c1466990oHJ = (C1466990oHJ) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1466990oHJ.getClass();
        C1C7U.LIZ("TTVideoEngineImplV2@94da._stop$1L");
        c1466990oHJ.LLLZIL.LLII(i);
        C1C7U.LIZIZ("TTVideoEngineImplV2@94da._stop$1L");
    }

    public static final void run$12(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1466990oHJ c1466990oHJ = (C1466990oHJ) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1466990oHJ.getClass();
        C1C7U.LIZ("TTVideoEngineImplV2@94da._doGetCurrentPlaybackTime$1L");
        c1466990oHJ.g6.LJJIJIIJIL(i);
        C1C7U.LIZIZ("TTVideoEngineImplV2@94da._doGetCurrentPlaybackTime$1L");
    }

    public static final void run$14(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyCurrentPlaybackPosition$1L");
        c1468940oKS.LLLLLZL.LJJJJJ(c1468940oKS.y5, i);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyCurrentPlaybackPosition$1L");
    }

    public static final void run$15(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        boolean zLIZ;
        C1C7U.LIZ("RetrySchedulerImpl@9e9d.doSchedulerRetry$1");
        try {
            try {
                C1490840otm c1490840otm = (C1490840otm) aRunnableS34S0101000_23.l0;
                c1490840otm.LIZIZ(aRunnableS34S0101000_23.i1, c1490840otm.LIZLLL(), true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RetrySchedulerImpl@9e9d.doSchedulerRetry$1");
    }

    public static final void run$2(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTMultiplePlayerImplV2@1a58.prepareDecoder$1");
        try {
            aRunnableS34S0101000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTMultiplePlayerImplV2@1a58.prepareDecoder$1");
    }

    public static final void run$3(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        boolean zLIZ;
        C1C7U.LIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onLost$2");
        try {
            InterfaceC1499200p7G interfaceC1499200p7G = ((C1499230p7J) aRunnableS34S0101000_23.l0).LIZIZ.LIZLLL;
            int i = aRunnableS34S0101000_23.i1;
            NetworkChangeNotifier networkChangeNotifier = ((C1499180p7E) interfaceC1499200p7G).LIZ;
            networkChangeNotifier.LIZLLL = i;
            networkChangeNotifier.LIZJ(i, networkChangeNotifier.getCurrentDefaultNetId());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onLost$2");
    }

    public static final void run$4(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("CronetUrlRequest@8822.onStatus$1");
        try {
            VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = (VersionSafeCallbacks$UrlRequestStatusListener) aRunnableS34S0101000_23.l0;
            switch (aRunnableS34S0101000_23.i1) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                default:
                    throw new IllegalArgumentException("No request status found.");
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 6;
                    break;
                case 8:
                    i = 7;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    i = 8;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    i = 9;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    i = 10;
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    i = 11;
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    i = 12;
                    break;
                case 14:
                    i = 13;
                    break;
                case 15:
                    i = 14;
                    break;
            }
            versionSafeCallbacks$UrlRequestStatusListener.onStatus(i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CronetUrlRequest@8822.onStatus$1");
    }

    public static final void run$5(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyVideoStatusException$1L");
        c1468940oKS.LLLLLZL.LJIJJLI(i);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyVideoStatusException$1L");
    }

    public static final void run$6(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyStreamChanged$1L");
        c1468940oKS.LLLLLZL.LJIJI(c1468940oKS.y5, i);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyStreamChanged$1L");
    }

    public static final void run$7(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyBufferingUpdate$1L");
        c1468940oKS.LLLLLZL.LJIIL(c1468940oKS.y5, i);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyBufferingUpdate$1L");
    }

    public static final void run$8(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyBufferEnd$1L");
        c1468940oKS.LLLLLZL.LJIJJ(i);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyBufferEnd$1L");
    }

    public static final void run$9(ARunnableS34S0101000_23 aRunnableS34S0101000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS34S0101000_23.l0;
        int i = aRunnableS34S0101000_23.i1;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.seekTo$1L");
        c1468940oKS.LJLLI(i, false);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.seekTo$1L");
    }

    public ARunnableS34S0101000_23(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
