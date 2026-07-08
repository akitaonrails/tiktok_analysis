package X;

import Y.ARunnableS19S1200000_15;
import Y.ARunnableS89S0200000_20;
import android.os.Looper;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAICommentaryAudioPlaybackSetting;
import com.bytedance.android.livesdk.model.message.AudioMeta;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: renamed from: X.0jwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300300jwS {
    public static InterfaceC774130UYh LIZIZ;
    public static C0IEB LIZJ;
    public static DataChannel LJFF;
    public static WeakReference<InterfaceC986180blo> LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIJ;
    public static final C1300300jwS LIZ = new C1300300jwS();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(91));
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public static int LJI = -1;
    public static final RunnableC986190blp LJIIIZ = RunnableC986190blp.LL;

    public static void LJI() {
        C20441214yg.LIZIZ("AICommentaryPlayer", "removeTimeOut: ");
        if (LiveMatchAICommentaryAudioPlaybackSetting.INSTANCE.isPlayTimeoutEnable()) {
            LJ.removeCallbacks(LJIIIZ);
            LJII = null;
        }
    }

    public static void LJIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPlayAudio: duckingId ");
        sbLIZ.append(LJI);
        C20441214yg.LIZIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.stop();
        }
        LJIIIZ(LJI);
        LJI();
    }

    public final void LJFF() {
        LJIIJ();
        InterfaceC774130UYh interfaceC774130UYh = LIZIZ;
        if (interfaceC774130UYh != null) {
            interfaceC774130UYh.setEventListener(null);
        }
        InterfaceC774130UYh interfaceC774130UYh2 = LIZIZ;
        if (interfaceC774130UYh2 != null) {
            interfaceC774130UYh2.setErrorListener(null);
        }
        InterfaceC774130UYh interfaceC774130UYh3 = LIZIZ;
        if (interfaceC774130UYh3 != null) {
            interfaceC774130UYh3.stop();
        }
        InterfaceC774130UYh interfaceC774130UYh4 = LIZIZ;
        if (interfaceC774130UYh4 != null) {
            interfaceC774130UYh4.release();
        }
        LIZIZ = null;
        LIZJ = null;
        LJI();
        DataChannelGlobal.LLILZ.zQ2(this);
        LJFF = null;
        C20441214yg.LIZIZ("AICommentaryPlayer", "release");
    }

    public static void LJII(C973720bRi c973720bRi) {
        if (c973720bRi.LJFF <= 0) {
            c973720bRi.LJFF = C974520bT0.LIZ();
        }
    }

    public static void LJIIIZ(int i) {
        C0IEB c0ieb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopAudienceDucking: duckingId ");
        sbLIZ.append(i);
        sbLIZ.append(", this.duckingId ");
        sbLIZ.append(LJI);
        C20441214yg.LIZIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (i > 0 && (c0ieb = LIZJ) != null) {
            c0ieb.stopAuxAudioDucking(i);
        }
        LJI = -1;
    }

    public final void LJ(DataChannel dataChannel) {
        boolean z;
        boolean z2 = false;
        if (!C163000js.LIZ() && !SettingsManager.INSTANCE.getBooleanValue("live_match_ai_commentary_audience_enable", false)) {
            return;
        }
        LJFF = dataChannel;
        DataChannelGlobal.LLILZ.DQ2(LiveStreamGlobalChannel.class, this, AFwS250S0000000_15.get$arr$(227));
        LIZJ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Qt1().LIZLLL(C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init avplayer != null: ");
        if (LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", roomPlayer2 != null: ");
        if (LIZJ != null) {
            z2 = true;
        }
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(InterfaceC986180blo interfaceC986180blo, String str) {
        C20441214yg.LJIIIZ("AICommentaryPlayer", "audiencePlayComplete:");
        if (!LJIIIIZZ) {
            LJI();
            interfaceC986180blo.onComplete(str);
            LJIIIIZZ = true;
        }
    }

    public static void LJIIIIZZ(final C973720bRi c973720bRi, final C976350bVx c976350bVx) {
        boolean z;
        boolean z2;
        int i;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        List<C936770aU7> listLJJIIJZLJL = C915980Zwa.LJII().LJJIIJZLJL();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIIJZLJL, 10));
        Iterator<C936770aU7> it2 = listLJJIIJZLJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LIZ));
        }
        boolean zContains = arrayList.contains(Long.valueOf(currentUserId));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPlay: isGuestInCHWithMG ");
        sbLIZ.append(zContains);
        sbLIZ.append(", isAnchor ");
        sbLIZ.append(c973720bRi.LIZ);
        sbLIZ.append(", avPlayer != null ");
        boolean z3 = true;
        if (LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", roomPlayer2 != null ");
        if (LIZJ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
        LiveMatchAICommentaryAudioPlaybackSetting liveMatchAICommentaryAudioPlaybackSetting = LiveMatchAICommentaryAudioPlaybackSetting.INSTANCE;
        if (liveMatchAICommentaryAudioPlaybackSetting.isPlayTimeoutEnable()) {
            LJI();
            LJIIIIZZ = false;
            AudioMeta audioMeta = c973720bRi.LIZIZ.commentaryMeta;
            if (audioMeta != null) {
                i = audioMeta.audioDurationMs;
            } else {
                i = 0;
            }
            long playTimeoutExtraTimeMs = (long) (i + liveMatchAICommentaryAudioPlaybackSetting.getPlayTimeoutExtraTimeMs());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startTimeOut: timeoutDuration ");
            sbLIZ2.append(playTimeoutExtraTimeMs);
            C20441214yg.LIZIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            if (playTimeoutExtraTimeMs > 0) {
                LJII = new WeakReference<>(c976350bVx);
                C786410Ut5.LJLIIL(playTimeoutExtraTimeMs, LJ, LJIIIZ);
            }
        }
        if (!c973720bRi.LIZ && !zContains) {
            ((ExecutorService) LIZLLL.getValue()).execute(new ARunnableS89S0200000_20(c976350bVx, c973720bRi, 192));
            return;
        }
        if (c973720bRi.LIZIZ.audioStream != null && LIZIZ != null) {
            ((ExecutorService) LIZLLL.getValue()).execute(new Runnable() { // from class: X.0bli
                public final void LIZ() throws Throwable {
                    try {
                        C1300300jwS c1300300jwS = C1300300jwS.LIZ;
                        C973720bRi c973720bRi2 = c973720bRi;
                        c1300300jwS.getClass();
                        c973720bRi2.LJ = C974520bT0.LIZ();
                        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(C497740JfY.LJII()), "ai_commentary_anchor_audio.aac");
                        C0VSV c0vsv = new C0VSV(c0vsj);
                        try {
                            c0vsv.write(c973720bRi.LIZIZ.audioStream);
                            C2107108Nh.LIZ(c0vsv, null);
                            String absolutePath = c0vsj.getAbsolutePath();
                            if (absolutePath != null) {
                                C786410Ut5.LJJZZIII(C1300300jwS.LJ, new ARunnableS19S1200000_15(c973720bRi, absolutePath, c976350bVx, 1));
                            } else {
                                C1300300jwS.LIZ(c976350bVx, null, "Anchor: filePath is null");
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                C2107108Nh.LIZ(c0vsv, th);
                                                throw th;
                                            } catch (Exception e) {
                                                e = e;
                                                TryCatchGuardChecker.doCheck(e);
                                                C1300300jwS c1300300jwS2 = C1300300jwS.LIZ;
                                                InterfaceC986180blo interfaceC986180blo = c976350bVx;
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("Anchor: exception ");
                                                sbLIZ3.append(e);
                                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                                c1300300jwS2.getClass();
                                                C1300300jwS.LIZ(interfaceC986180blo, null, strLIZIZ);
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("saveAudioStreamToFile: e ");
                                                sbLIZ4.append(e);
                                                C20441214yg.LJIIIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ4));
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                th = null;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AICommentaryPlayer@aab7.startPlayForAnchor$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AICommentaryPlayer@aab7.startPlayForAnchor$1");
                }
            });
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("startPlayForAnchor: avPlayer is null ");
        if (LIZIZ != null) {
            z3 = false;
        }
        sbLIZ3.append(z3);
        C20441214yg.LJIIIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ3));
        LIZ(c976350bVx, null, null);
    }

    public static void LIZ(InterfaceC986180blo interfaceC986180blo, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchorPlayComplete: filePath ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        }
        if (!LJIIIIZZ) {
            LJI();
            interfaceC986180blo.onComplete(str2);
            LJIIIIZZ = true;
        }
    }

    public static void LIZLLL(int i, InterfaceC986180blo interfaceC986180blo, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAudienceException: duckingId ");
        sbLIZ.append(i);
        sbLIZ.append(", errorReason ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ(i);
        LIZIZ(interfaceC986180blo, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0172 A[PHI: r0 r20
      0x0172: PHI (r0v46 long) = (r0v42 long), (r0v48 long) binds: [B:47:0x014a, B:59:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r20v3 byte[]) = (r20v1 byte[]), (r20v5 byte[]) binds: [B:47:0x014a, B:59:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:87:0x024d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C973720bRi r30, byte[] r31, com.bytedance.android.livesdk.model.message.AudioMeta r32, X.C0IEB r33, int r34, X.InterfaceC986180blo r35) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1300300jwS.LIZJ(X.0bRi, byte[], com.bytedance.android.livesdk.model.message.AudioMeta, X.0IEB, int, X.0blo):void");
    }
}
