package X;

import Y.ARunnableS105S0100000_5;
import Y.ARunnableS8S0210000_5;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEAsyncRenderPlayStatusListener;
import com.bytedance.ies.nle.editor_jni.INLEListenerAsyncReleaseEngineUnitResource;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerGetImage;
import com.bytedance.ies.nle.editor_jni.INLEListenerKeyframe;
import com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEListenerSurfaceStatus;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEModelChangeListener;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadConfig;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.KeyFrameCalcalator;
import com.bytedance.ies.nle.editor_jni.KeyframeType;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESetRangeMode;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVEEditorMode;
import com.bytedance.ies.nle.editor_jni.VecFloat;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389960FQs extends C0FRA implements INLEPlayer {
    public final NLEMediaConfig LJ;
    public NLEEditor LJFF;
    public C0FRD LJI;
    public C389940FQq LJII;
    public final List<INLEListenerCommon> LJIIIIZZ;
    public final List<INLEListenerCommon> LJIIIZ;
    public final List<INLEPurePlayer.INLEPurePlayerInfoListener> LJIIJ;
    public INLEListenerCommon LJIIJJI;
    public final ConcurrentHashMap<Long, INLEListenerSeek> LJIIL;
    public final ConcurrentHashMap<Long, INLEListenerSeek> LJIILIIL;
    public long LJIILJJIL;
    public C389990FQv LJIILL;
    public INLEListenerFirstFrame LJIILLIIL;
    public NLEListenerGetImageWrapper LJIIZILJ;
    public INLEListenerPlayerStatus LJIJ;
    public INLEListenerAsyncReleaseEngineUnitResource LJIJI;
    public C0FR0 LJIJJ;
    public SurfaceView LJIJJLI;
    public TextureView LJIL;
    public INLEListenerSurfaceStatus LJJ;
    public final AtomicBoolean LJJI;
    public final AtomicBoolean LJJIFFI;
    public INLEListenerKeyframe LJJII;
    public final C01GW LJJIII;
    public final AtomicBoolean LJJIIJ;
    public INLEModelChangeListener LJJIIJZLJL;
    public boolean LJJIIZ;
    public WeakReference<Function0<Boolean>> LJJIIZI;
    public final List<INLEResourceDownloadStatusListener> LJJIJ;
    public C0FRC LJJIJIIJI;
    public NLEResourceManager LJJIJIIJIL;
    public long LJJIJIL;
    public INLEListenerVideoOutput LJJIJL;

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void clearSkipSeekBlock() {
        this.LJJIIZI = null;
    }

    public final void LIZJ() {
        if (this.LJI == null) {
            C0FRD c0frd = new C0FRD(this.LJ.getEnableCatchExceptionInCallback());
            NLEPlayer nLEPlayerLJFF = LJFF();
            if (nLEPlayerLJFF != null) {
                nLEPlayerLJFF.addMessageListener(c0frd);
            }
            c0frd.delete();
            this.LJI = c0frd;
        }
    }

    public final Gson LIZLLL() {
        return (Gson) this.LJJIII.getValue();
    }

    public final NLEMediaRuntimeController LJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEMediaRuntimeController) c1464240oCs.LJ.getValue();
    }

    public final NLEPlayer LJFF() {
        return this.LIZ.LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0FQq, java.lang.Object] */
    public final void LJII() {
        if (this.LJII == null) {
            ?? r1 = new C0FRG() { // from class: X.0FQq
                @Override // X.C0FRG
                public final void LIZ(int i, int i2, float f, String str) {
                    INLEListenerCommon iNLEListenerCommon = this.LIZ.LJIIJJI;
                    if (iNLEListenerCommon != null) {
                        iNLEListenerCommon.onCallback(i, i2, f, str);
                    }
                }

                @Override // X.C0FRG
                public final void LIZIZ(final int i, final int i2, final float f, final String str) {
                    String str2;
                    Long lValueOf;
                    if (i != 4097) {
                        if (i != 4101) {
                            if (i != 4133) {
                                if (i != 4144) {
                                    if (i == 4145) {
                                        INLEListenerAsyncReleaseEngineUnitResource iNLEListenerAsyncReleaseEngineUnitResource = this.LIZ.LJIJI;
                                        if (iNLEListenerAsyncReleaseEngineUnitResource != null) {
                                            iNLEListenerAsyncReleaseEngineUnitResource.onReleaseEngineUnitResourceError(i2);
                                        }
                                        this.LIZ.LJIJI = null;
                                    }
                                } else {
                                    INLEListenerAsyncReleaseEngineUnitResource iNLEListenerAsyncReleaseEngineUnitResource2 = this.LIZ.LJIJI;
                                    if (iNLEListenerAsyncReleaseEngineUnitResource2 != null) {
                                        iNLEListenerAsyncReleaseEngineUnitResource2.onReleaseEngineUnitResourceSuccess();
                                    }
                                    this.LIZ.LJIJI = null;
                                }
                            } else {
                                final C389960FQs c389960FQs = this.LIZ;
                                if (c389960FQs.LJJIJL != null) {
                                    C786410Ut5.LJJZZIII(c389960FQs.LIZ(), new Runnable() { // from class: X.0FDI
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C389960FQs c389960FQs2 = c389960FQs;
                                            int i3 = i2;
                                            float f2 = f;
                                            C1C7U.LIZ("NLEPlayerPublic$innerSetInfoListener$1@eb16.onInfoCallback$4L");
                                            INLEListenerVideoOutput iNLEListenerVideoOutput = c389960FQs2.LJJIJL;
                                            if (iNLEListenerVideoOutput != null) {
                                                iNLEListenerVideoOutput.onRefresh(i3, C352310DrZ.LIZLLL((long) f2));
                                            }
                                            C1C7U.LIZIZ("NLEPlayerPublic$innerSetInfoListener$1@eb16.onInfoCallback$4L");
                                        }
                                    });
                                }
                            }
                        } else if (!NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt()) {
                            C389960FQs c389960FQs2 = this.LIZ;
                            for (Map.Entry<Long, INLEListenerSeek> entry : c389960FQs2.LJIIL.entrySet()) {
                                if (Math.abs(entry.getKey().longValue() - (LSPassThroughRecordSizeConfig.DEFAULT * f)) <= 1.0f) {
                                    c389960FQs2.LJIIL.remove(entry.getKey());
                                    C786410Ut5.LJJZZIII(c389960FQs2.LIZ(), new ARunnableS105S0100000_5(entry, 101));
                                }
                            }
                        } else if (str != null && (lValueOf = Long.valueOf(CastLongProtector.parseLong(str))) != null) {
                            C389960FQs c389960FQs3 = this.LIZ;
                            synchronized (c389960FQs3.LIZ) {
                                try {
                                    for (Map.Entry<Long, INLEListenerSeek> entry2 : c389960FQs3.LJIILIIL.entrySet()) {
                                        if (entry2.getKey().longValue() <= lValueOf.longValue()) {
                                            c389960FQs3.LJIILIIL.remove(entry2.getKey());
                                            C786410Ut5.LJJZZIII(c389960FQs3.LIZ(), new ARunnableS105S0100000_5(entry2, 102));
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        C786410Ut5.LJJZZIII(this.LIZ.LIZ(), new ARunnableS105S0100000_5(this.LIZ, 103));
                    }
                    Handler handlerLIZ = this.LIZ.LIZ();
                    final C389960FQs c389960FQs4 = this.LIZ;
                    C786410Ut5.LJJZZIII(handlerLIZ, new Runnable() { // from class: X.0FQr
                        @Override // java.lang.Runnable
                        public final void run() {
                            C389960FQs c389960FQs5 = c389960FQs4;
                            int i3 = i;
                            int i4 = i2;
                            float f2 = f;
                            String str3 = str;
                            C1C7U.LIZ("NLEPlayerPublic$innerSetInfoListener$1@eb16.onInfoCallback$5L");
                            Iterator it2 = ((CopyOnWriteArrayList) c389960FQs5.LJIIIIZZ).iterator();
                            while (it2.hasNext()) {
                                ((INLEListenerCommon) it2.next()).onCallback(i3, i4, f2, str3 == null ? "" : str3);
                            }
                            C1C7U.LIZIZ("NLEPlayerPublic$innerSetInfoListener$1@eb16.onInfoCallback$5L");
                        }
                    });
                    for (INLEListenerCommon iNLEListenerCommon : (CopyOnWriteArrayList) this.LIZ.LJIIIZ) {
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        iNLEListenerCommon.onCallback(i, i2, f, str2);
                    }
                }

                @Override // X.C0FRG
                public final void onKeyFrameProcess(String str, long j, String str2, KeyframeType keyframeType) {
                    INLEListenerKeyframe iNLEListenerKeyframe = this.LIZ.LJJII;
                    if (iNLEListenerKeyframe != null) {
                        iNLEListenerKeyframe.onKeyFrameProcess(str, j, str2, keyframeType);
                    }
                }
            };
            C0FRD c0frd = this.LJI;
            if (c0frd != null) {
                ((ArrayList) c0frd.LIZIZ).add(r1);
            }
            this.LJII = r1;
        }
    }

    public final void LJIIIIZZ() {
        SurfaceHolder holder;
        if (this.LJIJJLI == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SurfaceView surfaceView = this.LJIJJLI;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(this.LJIJJ);
        }
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.releaseAndroidSurface();
        }
        this.LJIJJLI = null;
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: unbindSurfaceView ");
            sbLIZ.append(hashCode());
            sbLIZ.append(" cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ.append(" ms");
            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void clearNLEResourceDownloadListener() {
        ((CopyOnWriteArrayList) this.LJJIJ).clear();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void clearPlayerInfoListener() {
        ((CopyOnWriteArrayList) this.LJIIJ).clear();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int destroy() {
        SurfaceHolder holder;
        synchronized (this.LIZ) {
            try {
                if (this.LJJIIJ.get()) {
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        logger.onLog(LogLevel.LEVEL_ERROR, "has already destroyed!");
                    }
                    return -1;
                }
                this.LJJIFFI.set(true);
                this.LJJI.set(false);
                ((CopyOnWriteArrayList) this.LJIIJ).clear();
                ((CopyOnWriteArrayList) this.LJIIIIZZ).clear();
                ((CopyOnWriteArrayList) this.LJIIIZ).clear();
                this.LJIILL = null;
                this.LJIIJJI = null;
                this.LJIILLIIL = null;
                this.LJJIJL = null;
                clearNLEResourceDownloadListener();
                this.LJJIIJZLJL = null;
                this.LJJIJIIJI = null;
                SurfaceView surfaceView = this.LJIJJLI;
                if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                    holder.removeCallback(this.LJIJJ);
                }
                this.LJIJJLI = null;
                TextureView textureView = this.LJIL;
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(null);
                }
                this.LJIL = null;
                NLEPlayer nLEPlayerLJFF = LJFF();
                Integer numValueOf = nLEPlayerLJFF != null ? Integer.valueOf(nLEPlayerLJFF.destroy()) : null;
                LIZIZ();
                this.LIZ.LIZ();
                INLEListenerPlayerStatus iNLEListenerPlayerStatus = this.LJIJ;
                if (iNLEListenerPlayerStatus != null) {
                    iNLEListenerPlayerStatus.onDestroy();
                }
                this.LJIJ = null;
                this.LJJIFFI.set(false);
                this.LJJIIJ.set(true);
                NLEMediaRuntimeController nLEMediaRuntimeControllerLJ = LJ();
                if (nLEMediaRuntimeControllerLJ != null) {
                    nLEMediaRuntimeControllerLJ.clearAndroidImageHolder();
                }
                return numValueOf != null ? numValueOf.intValue() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final String dumpVEClips() {
        String strDumpVEClips;
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                strDumpVEClips = nLEPlayerLJFF != null ? nLEPlayerLJFF.dumpVEClips() : null;
                if (strDumpVEClips == null) {
                    strDumpVEClips = "playerApi destroyed";
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strDumpVEClips;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int flushSeekCmd() {
        int iFlushSeekCmd;
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                iFlushSeekCmd = nLEPlayerLJFF != null ? nLEPlayerLJFF.flushSeekCmd() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iFlushSeekCmd;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final long getDuration() {
        long duration;
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                duration = nLEPlayerLJFF != null ? nLEPlayerLJFF.getDuration() : 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return duration;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final boolean isDestroyed() {
        return this.LJJIIJ.get();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int pause() {
        synchronized (this.LIZ) {
            try {
                this.LJJI.set(false);
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                int iPause = nLEPlayerLJFF.pause();
                INLEListenerPlayerStatus iNLEListenerPlayerStatus = this.LJIJ;
                if (iNLEListenerPlayerStatus != null) {
                    iNLEListenerPlayerStatus.onPause();
                }
                Iterator<INLEPurePlayer.INLEPurePlayerInfoListener> it2 = this.LJIIJ.iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayerPause();
                }
                return iPause;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int play() {
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                this.LJJI.set(true);
                int iPlay = nLEPlayerLJFF.play();
                INLEListenerPlayerStatus iNLEListenerPlayerStatus = this.LJIJ;
                if (iNLEListenerPlayerStatus != null) {
                    iNLEListenerPlayerStatus.onPlay();
                }
                return iPlay;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int preload() {
        synchronized (this.LIZ) {
            try {
                if (this.LJJI.get()) {
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        logger.onLog(LogLevel.LEVEL_INFO, "NLEPlayerPublic#preload(), isPlaying! skip preload!");
                    }
                    return 0;
                }
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF != null) {
                    nLEPlayerLJFF.setEditorMode(NLEVEEditorMode.PREVIEW_ONLY);
                }
                int iPrepare = prepare();
                if (NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt()) {
                    NLEPlayer nLEPlayerLJFF2 = LJFF();
                    if (nLEPlayerLJFF2 != null) {
                        NLESeekFlag nLESeekFlag = NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek;
                        long j = this.LJIILJJIL;
                        this.LJIILJJIL = 1 + j;
                        nLEPlayerLJFF2.seekTime(0L, nLESeekFlag, j);
                    }
                } else {
                    NLEPlayer nLEPlayerLJFF3 = LJFF();
                    if (nLEPlayerLJFF3 != null) {
                        nLEPlayerLJFF3.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
                    }
                }
                return iPrepare;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int prepare() {
        int iPrepare;
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                iPrepare = nLEPlayerLJFF != null ? nLEPlayerLJFF.prepare() : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iPrepare;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int recycleEngine() {
        synchronized (this.LIZ) {
            try {
                this.LJJI.set(false);
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                nLEPlayerLJFF.stop();
                return nLEPlayerLJFF.releaseEngine();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int refreshCurrentFrame() {
        int iRefreshCurrentFrame;
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                iRefreshCurrentFrame = nLEPlayerLJFF != null ? nLEPlayerLJFF.refreshCurrentFrame(0) : -1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iRefreshCurrentFrame;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int releaseResource() {
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                int iReleaseResource = nLEPlayerLJFF.releaseResource();
                LIZIZ();
                return iReleaseResource;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final NLEPlayerState state() {
        NLEPlayerState nLEPlayerStateState;
        if (this.LJJIFFI.get()) {
            return NLEPlayerState.DESTROYING;
        }
        NLEPlayer nLEPlayerLJFF = LJFF();
        return (nLEPlayerLJFF == null || (nLEPlayerStateState = nLEPlayerLJFF.state()) == null) ? NLEPlayerState.ENGINE_NOT_CRATED : nLEPlayerStateState;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int stop() {
        synchronized (this.LIZ) {
            try {
                this.LJJI.set(false);
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                int iStop = nLEPlayerLJFF.stop();
                INLEListenerPlayerStatus iNLEListenerPlayerStatus = this.LJIJ;
                if (iNLEListenerPlayerStatus != null) {
                    iNLEListenerPlayerStatus.onStop();
                }
                return iStop;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void surfaceDestroyed() {
        if (this.LJJIFFI.get()) {
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceDestroyed skip. is destroying");
                return;
            }
            return;
        }
        synchronized (this.LIZ) {
            try {
                if (this.LJJIFFI.get()) {
                    NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                    if (logger2 != null) {
                        logger2.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceDestroyed skip. is destroying");
                    }
                    return;
                }
                NLELoggerListener logger3 = NLE.INSTANCE.getLogger();
                if (logger3 != null) {
                    logger3.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceDestroyed");
                }
                NLEPlayer nLEPlayerLJFF = LJFF();
                this.LJJIJIL = nLEPlayerLJFF != null ? nLEPlayerLJFF.getCurrentPosition() : 0L;
                NLEPlayer nLEPlayerLJFF2 = LJFF();
                if (nLEPlayerLJFF2 != null) {
                    nLEPlayerLJFF2.releaseAndroidSurface();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void unbindSurfaceView() {
        if (!this.LJ.getEnableReleaseSurfaceLock()) {
            LJIIIIZZ();
            return;
        }
        synchronized (this.LIZ) {
            try {
                LJIIIIZZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void cancelAsyncRender() {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.cancelAsyncRender();
        }
        if (this.LJJIJIIJI == null) {
            this.LJJIJIIJI = new C0FRC(this);
        }
        NLEPlayer nLEPlayerLJFF2 = LJFF();
        if (nLEPlayerLJFF2 != null) {
            nLEPlayerLJFF2.addNLEResourceDownloadStatusListener(this.LJJIJIIJI);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final long getCurrentPosition() {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            return nLEPlayerLJFF.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final String getEffectDebugPageUIData() {
        String effectDebugPageUIData;
        NLEPlayer nLEPlayerLJFF = LJFF();
        return (nLEPlayerLJFF == null || (effectDebugPageUIData = nLEPlayerLJFF.getEffectDebugPageUIData()) == null) ? "" : effectDebugPageUIData;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void releaseMagnifierSurface() {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.releaseMagnifierSurface();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekBackward() {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            return nLEPlayerLJFF.seekBackward();
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekForward() {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            return nLEPlayerLJFF.seekForward();
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void addKeyframeListener(INLEListenerKeyframe iNLEListenerKeyframe) {
        if (iNLEListenerKeyframe != null) {
            LIZJ();
            this.LJJII = iNLEListenerKeyframe;
            LJII();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void addNLEResourceDownloadListener(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener) {
        ((CopyOnWriteArrayList) this.LJJIJ).add(iNLEResourceDownloadStatusListener);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0FQv, com.bytedance.ies.nle.editor_jni.INLEListenerCommon] */
    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void addPlayerInfoListener(INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener) {
        if (!((CopyOnWriteArrayList) this.LJIIJ).contains(iNLEPurePlayerInfoListener)) {
            ((CopyOnWriteArrayList) this.LJIIJ).add(iNLEPurePlayerInfoListener);
        }
        if ((!((CopyOnWriteArrayList) this.LJIIJ).isEmpty()) && this.LJIILL == null) {
            ?? r3 = new INLEListenerCommon() { // from class: X.0FQv
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
                public final void onCallback(int i, int i2, float f, String str) {
                    C389960FQs c389960FQs = this.LIZ;
                    if (i != 4097) {
                        if (i != 4098) {
                            if (i != 4116) {
                                if (i == 4133 && c389960FQs.LJJI.get()) {
                                    Iterator it2 = ((CopyOnWriteArrayList) c389960FQs.LJIIJ).iterator();
                                    while (it2.hasNext()) {
                                        ((INLEPurePlayer.INLEPurePlayerInfoListener) it2.next()).onPlayTime(i2, C352310DrZ.LIZLLL((long) f));
                                    }
                                    return;
                                }
                                return;
                            }
                            Iterator it3 = ((CopyOnWriteArrayList) c389960FQs.LJIIJ).iterator();
                            while (it3.hasNext()) {
                                ((INLEPurePlayer.INLEPurePlayerInfoListener) it3.next()).onPrepared();
                            }
                            return;
                        }
                        Iterator it4 = ((CopyOnWriteArrayList) c389960FQs.LJIIJ).iterator();
                        while (it4.hasNext()) {
                            ((INLEPurePlayer.INLEPurePlayerInfoListener) it4.next()).onPlayEnd();
                        }
                        return;
                    }
                    Iterator it5 = ((CopyOnWriteArrayList) c389960FQs.LJIIJ).iterator();
                    while (it5.hasNext()) {
                        ((INLEPurePlayer.INLEPurePlayerInfoListener) it5.next()).onFirstFrameRender();
                    }
                }
            };
            this.LJIILL = r3;
            INLEPlayer.DefaultImpls.addOnInfoListener$default(this, r3, false, 2, null);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int pause(boolean z) {
        synchronized (this.LIZ) {
            try {
                this.LJJI.set(false);
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                int iPause = nLEPlayerLJFF.pause(z);
                INLEListenerPlayerStatus iNLEListenerPlayerStatus = this.LJIJ;
                if (iNLEListenerPlayerStatus != null) {
                    iNLEListenerPlayerStatus.onPause();
                }
                Iterator<INLEPurePlayer.INLEPurePlayerInfoListener> it2 = this.LJIIJ.iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayerPause();
                }
                return iPause;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int refreshCurrentFrame(int i) {
        int iRefreshCurrentFrame;
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF != null) {
                    iRefreshCurrentFrame = nLEPlayerLJFF.refreshCurrentFrame(i);
                } else {
                    iRefreshCurrentFrame = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iRefreshCurrentFrame;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int releaseEngineUnitResourceAsync(INLEListenerAsyncReleaseEngineUnitResource iNLEListenerAsyncReleaseEngineUnitResource) {
        synchronized (this.LIZ) {
            try {
                this.LJJI.set(false);
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                this.LJIJI = iNLEListenerAsyncReleaseEngineUnitResource;
                nLEPlayerLJFF.stop();
                return nLEPlayerLJFF.releaseEngine(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void removeNLEResourceDownloadListener(INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener) {
        ((CopyOnWriteArrayList) this.LJJIJ).remove(iNLEResourceDownloadStatusListener);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void removeOnInfoListener(INLEListenerCommon iNLEListenerCommon) {
        C19719512Dh.LIZ(this.LJIIIIZZ).remove(iNLEListenerCommon);
        C19719512Dh.LIZ(this.LJIIIZ).remove(iNLEListenerCommon);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void removePlayerInfoListener(INLEPurePlayer.INLEPurePlayerInfoListener iNLEPurePlayerInfoListener) {
        C389990FQv c389990FQv;
        ((CopyOnWriteArrayList) this.LJIIJ).remove(iNLEPurePlayerInfoListener);
        if (((CopyOnWriteArrayList) this.LJIIJ).isEmpty() && (c389990FQv = this.LJIILL) != null) {
            removeOnInfoListener(c389990FQv);
            this.LJIILL = null;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final int seekTime(long j) {
        return seekTime(j, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setAsyncRenderPlayStatusListener(INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setAsyncRenderPlayStatusListener(iNLEAsyncRenderPlayStatusListener);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setEditorMode(NLEVEEditorMode nLEVEEditorMode) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setEditorMode(nLEVEEditorMode);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setEnableDirectRenderMode(boolean z) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setEnableDirectRenderMode(z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setEnableFastcvLanc(boolean z) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setEnableFastcvLanc(z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setFirstFrameListener(INLEListenerFirstFrame iNLEListenerFirstFrame) {
        if (iNLEListenerFirstFrame != null) {
            LIZJ();
            this.LJIILLIIL = iNLEListenerFirstFrame;
            LJII();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setNLEModelChangeListener(INLEModelChangeListener iNLEModelChangeListener) {
        NLEEditor nLEEditor;
        NLEModel model;
        this.LJJIIJZLJL = iNLEModelChangeListener;
        if (this.LJJIIZ && (nLEEditor = this.LJFF) != null && (model = nLEEditor.getModel()) != null) {
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_DEBUG, "NLEModelChangeListener sticky callback");
            }
            INLEModelChangeListener iNLEModelChangeListener2 = this.LJJIIJZLJL;
            if (iNLEModelChangeListener2 != null) {
                iNLEModelChangeListener2.onInnerChanged(model);
            }
            this.LJJIIZ = false;
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setOnErrorListener(INLEListenerCommon iNLEListenerCommon) {
        if (iNLEListenerCommon != null) {
            LIZJ();
            this.LJIIJJI = iNLEListenerCommon;
            LJII();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setPlayerStatusListener(INLEListenerPlayerStatus iNLEListenerPlayerStatus) {
        this.LJIJ = iNLEListenerPlayerStatus;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setResourceDownloadConfig(INLEResourceDownloadConfig iNLEResourceDownloadConfig) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setResourceDownloadConfig(iNLEResourceDownloadConfig);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setResourceManager(NLEResourceManager nLEResourceManager) {
        this.LJJIJIIJIL = nLEResourceManager;
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setResourceManager(nLEResourceManager);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setSkipSeekBlock(Function0<Boolean> function0) {
        this.LJJIIZI = new WeakReference<>(function0);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setSurfaceStatusListener(INLEListenerSurfaceStatus iNLEListenerSurfaceStatus) {
        this.LJJ = iNLEListenerSurfaceStatus;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void setVideoOutputListener(INLEListenerVideoOutput iNLEListenerVideoOutput) {
        if (iNLEListenerVideoOutput != null) {
            LIZJ();
            this.LJJIJL = iNLEListenerVideoOutput;
            LJII();
            return;
        }
        this.LJJIJL = null;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void skipNextSeek(boolean z) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setSkipNextSeek(z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void startAsyncResourceDownload(NLEModel nLEModel) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.startAsyncRenderResourceDownload(nLEModel);
        }
    }

    public final void LJI(NLEChromaChannel nLEChromaChannel, String str) {
        C0FR2 c0fr2 = (C0FR2) GsonProtectorUtils.fromJson(LIZLLL(), str, C0FR2.class);
        NLESegmentChromaChannel segment = nLEChromaChannel.getSegment();
        c0fr2.LIZIZ.getClass();
        segment.setIntensity(0.0f);
        NLESegmentChromaChannel segment2 = nLEChromaChannel.getSegment();
        c0fr2.LIZJ.getClass();
        segment2.setShadow(0.0f);
        c0fr2.LIZ.getClass();
        nLEChromaChannel.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getChromaChannelIntensity(), String.valueOf(nLEChromaChannel.getSegment().getIntensity()));
        nLEChromaChannel.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getChromaChannelShadow(), String.valueOf(nLEChromaChannel.getSegment().getShadow()));
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void addOnInfoListener(INLEListenerCommon iNLEListenerCommon, boolean z) {
        if (iNLEListenerCommon != null) {
            LIZJ();
            if (z) {
                ((CopyOnWriteArrayList) this.LJIIIIZZ).add(iNLEListenerCommon);
            } else {
                ((CopyOnWriteArrayList) this.LJIIIZ).add(iNLEListenerCommon);
            }
            LJII();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0FR0, android.view.SurfaceHolder$Callback] */
    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void bindSurfaceView(SurfaceView surfaceView, final boolean z) {
        if (surfaceView == null || Intrinsics.LJFF(surfaceView, this.LJIJJLI)) {
            return;
        }
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: ");
            sbLIZ.append(hashCode());
            sbLIZ.append(" bindSurfaceView ");
            sbLIZ.append(surfaceView.hashCode());
            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setEditorMode(NLEVEEditorMode.PREVIEW_ONLY);
        }
        this.LJJIJIL = 0L;
        ?? r1 = new SurfaceHolder.Callback() { // from class: X.0FR0
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                this.LL.surfaceCreated(surfaceHolder.getSurface(), z);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                this.LL.surfaceDestroyed();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                this.LL.surfaceChanged(i2, i3);
            }
        };
        surfaceView.getHolder().addCallback(r1);
        this.LJIJJLI = surfaceView;
        this.LJIJJ = r1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void bindTextureView(TextureView textureView, final boolean z) {
        if (Intrinsics.LJFF(this.LJIL, textureView)) {
            return;
        }
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: ");
            sbLIZ.append(hashCode());
            sbLIZ.append(" bindTextureView");
            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setEditorMode(NLEVEEditorMode.PREVIEW_ONLY);
        }
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0FQt
            public long LL;
            public Surface LLILLJJLI;

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                long currentPosition;
                if (this.LLILLL.LJJIFFI.get()) {
                    NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                    if (logger2 != null) {
                        logger2.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureDestroyed skip. is destroying");
                    }
                    return true;
                }
                C389960FQs c389960FQs = this.LLILLL;
                synchronized (c389960FQs.LIZ) {
                    try {
                        if (c389960FQs.LJJIFFI.get()) {
                            NLELoggerListener logger3 = NLE.INSTANCE.getLogger();
                            if (logger3 != null) {
                                logger3.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureDestroyed skip. is destroying");
                            }
                            return true;
                        }
                        NLELoggerListener logger4 = NLE.INSTANCE.getLogger();
                        if (logger4 != null) {
                            logger4.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureDestroyed");
                        }
                        NLEPlayer nLEPlayerLJFF2 = c389960FQs.LJFF();
                        if (nLEPlayerLJFF2 != null) {
                            currentPosition = nLEPlayerLJFF2.getCurrentPosition();
                        } else {
                            currentPosition = 0;
                        }
                        this.LL = currentPosition;
                        NLEPlayer nLEPlayerLJFF3 = c389960FQs.LJFF();
                        if (nLEPlayerLJFF3 != null) {
                            nLEPlayerLJFF3.releaseAndroidSurface();
                        }
                        this.LLILLJJLI = null;
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                NLEPlayerState nLEPlayerStateState;
                NLEPlayer nLEPlayerLJFF2;
                NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                if (logger2 != null) {
                    logger2.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureAvailable");
                }
                this.LLILLJJLI = new Surface(surfaceTexture);
                NLEPlayer nLEPlayerLJFF3 = this.LLILLL.LJFF();
                if (nLEPlayerLJFF3 != null) {
                    nLEPlayerLJFF3.setAndroidSurface(this.LLILLJJLI, z);
                }
                NLEPlayer nLEPlayerLJFF4 = this.LLILLL.LJFF();
                if (nLEPlayerLJFF4 != null) {
                    nLEPlayerStateState = nLEPlayerLJFF4.state();
                } else {
                    nLEPlayerStateState = null;
                }
                if (nLEPlayerStateState == NLEPlayerState.STOPPED) {
                    NLEPlayer nLEPlayerLJFF5 = this.LLILLL.LJFF();
                    if (nLEPlayerLJFF5 != null) {
                        nLEPlayerLJFF5.prepare();
                    }
                    if (NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt()) {
                        NLEPlayer nLEPlayerLJFF6 = this.LLILLL.LJFF();
                        if (nLEPlayerLJFF6 != null) {
                            long j = this.LL;
                            NLESeekFlag nLESeekFlag = NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek;
                            C389960FQs c389960FQs = this.LLILLL;
                            long j2 = c389960FQs.LJIILJJIL;
                            c389960FQs.LJIILJJIL = 1 + j2;
                            nLEPlayerLJFF6.seekTime(j, nLESeekFlag, j2);
                        }
                    } else {
                        NLEPlayer nLEPlayerLJFF7 = this.LLILLL.LJFF();
                        if (nLEPlayerLJFF7 != null) {
                            nLEPlayerLJFF7.seekTime(this.LL, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
                        }
                    }
                } else if (nLEPlayerStateState == NLEPlayerState.PREPARED && (nLEPlayerLJFF2 = this.LLILLL.LJFF()) != null) {
                    nLEPlayerLJFF2.refreshCurrentFrame(0);
                }
                INLEListenerSurfaceStatus iNLEListenerSurfaceStatus = this.LLILLL.LJJ;
                if (iNLEListenerSurfaceStatus != null) {
                    iNLEListenerSurfaceStatus.onSurfaceCreatedDone();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                NLEPlayer nLEPlayerLJFF2;
                NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                if (logger2 != null) {
                    LogLevel logLevel2 = LogLevel.LEVEL_INFO;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("NLEVEPublic2: onSurfaceTextureSizeChanged, size: width: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", height: ");
                    sbLIZ2.append(i2);
                    logger2.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (i != 0 && i2 != 0 && (nLEPlayerLJFF2 = this.LLILLL.LJFF()) != null) {
                    nLEPlayerLJFF2.setPreviewSurfaceSize(i, i2);
                }
            }
        });
        this.LJIL = textureView;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final String handleEffectDebugCmd(String str, String str2) {
        String strHandleEffectDebugCmd;
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF == null || (strHandleEffectDebugCmd = nLEPlayerLJFF.handleEffectDebugCmd(str, str2)) == null) {
            return "";
        }
        return strHandleEffectDebugCmd;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekTime(long j, NLESeekFlag nLESeekFlag) {
        Function0<Boolean> function0;
        synchronized (this.LIZ) {
            try {
                WeakReference<Function0<Boolean>> weakReference = this.LJJIIZI;
                if (weakReference != null && (function0 = weakReference.get()) != null && function0.invoke().booleanValue()) {
                    return 0;
                }
                int iSeekTime = -1;
                if (NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt()) {
                    NLEPlayer nLEPlayerLJFF = LJFF();
                    if (nLEPlayerLJFF != null) {
                        long j2 = this.LJIILJJIL;
                        this.LJIILJJIL = 1 + j2;
                        iSeekTime = nLEPlayerLJFF.seekTime(j, nLESeekFlag, j2);
                    }
                    return iSeekTime;
                }
                NLEPlayer nLEPlayerLJFF2 = LJFF();
                if (nLEPlayerLJFF2 != null) {
                    iSeekTime = nLEPlayerLJFF2.seekTime(j, nLESeekFlag);
                }
                return iSeekTime;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekWithFrame(long j, INLEListenerGetImage iNLEListenerGetImage) {
        return seekWithFrame(j, -1, iNLEListenerGetImage);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekWithFrameStable(long j, final INLEListenerGetImage iNLEListenerGetImage) {
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                NLEListenerGetImageWrapper nLEListenerGetImageWrapper = new NLEListenerGetImageWrapper() { // from class: X.0FQz
                    @Override // com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper
                    public final int onGetImageDataCalled(byte[] bArr, int i, int i2, int i3, float f) {
                        int iOnGetImageData = 0;
                        if (this.LIZ.LJ.getEnableCatchExceptionInCallback()) {
                            try {
                                INLEListenerGetImage iNLEListenerGetImage2 = iNLEListenerGetImage;
                                if (iNLEListenerGetImage2 != null) {
                                    iOnGetImageData = iNLEListenerGetImage2.onGetImageData(bArr, i, i2, i3, f);
                                    return iOnGetImageData;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            return iOnGetImageData;
                        }
                        INLEListenerGetImage iNLEListenerGetImage3 = iNLEListenerGetImage;
                        if (iNLEListenerGetImage3 == null) {
                            return 0;
                        }
                        return iNLEListenerGetImage3.onGetImageData(bArr, i, i2, i3, f);
                    }
                };
                this.LJIIZILJ = nLEListenerGetImageWrapper;
                return nLEPlayerLJFF.seekWithFrameStable(j, nLEListenerGetImageWrapper);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void setAndroidMagnifierSurface(Surface surface, boolean z) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setAndroidMagnifierSurface(surface, z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void setAndroidMagnifierSurfaceSize(int i, int i2) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setMagnifierSurfaceSize(i, i2);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void setAndroidSurface(Surface surface, boolean z) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.setAndroidSurface(surface, z);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int setPlayRange(long j, long j2) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            return nLEPlayerLJFF.setPlayRange(j, j2);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void surfaceChanged(int i, int i2) {
        NLEPlayer nLEPlayerLJFF;
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEVEPublic2: surfaceChanged, size: width: ");
            sbLIZ.append(i);
            sbLIZ.append(", height: ");
            sbLIZ.append(i2);
            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i != 0 && i2 != 0 && (nLEPlayerLJFF = LJFF()) != null) {
            nLEPlayerLJFF.setPreviewSurfaceSize(i, i2);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer
    public final void surfaceCreated(Surface surface, boolean z) {
        NLEPlayerState nLEPlayerStateState;
        NLEPlayer nLEPlayerLJFF;
        if (C0FR9.LIZ) {
            C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS8S0210000_5(this, surface, z, 5));
            return;
        }
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceCreated");
        }
        NLEPlayer nLEPlayerLJFF2 = LJFF();
        if (nLEPlayerLJFF2 != null) {
            nLEPlayerLJFF2.setAndroidSurface(surface, z);
        }
        NLEPlayer nLEPlayerLJFF3 = LJFF();
        if (nLEPlayerLJFF3 != null) {
            nLEPlayerStateState = nLEPlayerLJFF3.state();
        } else {
            nLEPlayerStateState = null;
        }
        if (nLEPlayerStateState == NLEPlayerState.STOPPED) {
            NLEPlayer nLEPlayerLJFF4 = LJFF();
            if (nLEPlayerLJFF4 != null) {
                nLEPlayerLJFF4.prepare();
            }
            if (NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt()) {
                NLEPlayer nLEPlayerLJFF5 = LJFF();
                if (nLEPlayerLJFF5 != null) {
                    long j = this.LJJIJIL;
                    NLESeekFlag nLESeekFlag = NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek;
                    long j2 = this.LJIILJJIL;
                    this.LJIILJJIL = 1 + j2;
                    nLEPlayerLJFF5.seekTime(j, nLESeekFlag, j2);
                }
            } else {
                NLEPlayer nLEPlayerLJFF6 = LJFF();
                if (nLEPlayerLJFF6 != null) {
                    nLEPlayerLJFF6.seekTime(this.LJJIJIL, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
        } else if (nLEPlayerStateState == NLEPlayerState.PREPARED && (nLEPlayerLJFF = LJFF()) != null) {
            nLEPlayerLJFF.refreshCurrentFrame(0);
        }
        INLEListenerSurfaceStatus iNLEListenerSurfaceStatus = this.LJJ;
        if (iNLEListenerSurfaceStatus == null) {
            return;
        }
        iNLEListenerSurfaceStatus.onSurfaceCreatedDone();
    }

    public C389960FQs(C1464240oCs c1464240oCs, NLEMediaConfig nLEMediaConfig, NLEEditor nLEEditor) {
        super(c1464240oCs);
        this.LJ = nLEMediaConfig;
        this.LJFF = nLEEditor;
        this.LJIIIIZZ = new CopyOnWriteArrayList();
        this.LJIIIZ = new CopyOnWriteArrayList();
        this.LJIIJ = new CopyOnWriteArrayList();
        this.LJIIL = new ConcurrentHashMap<>();
        this.LJIILIIL = new ConcurrentHashMap<>();
        this.LJJI = new AtomicBoolean(false);
        this.LJJIFFI = new AtomicBoolean(false);
        this.LJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(324));
        this.LJJIIJ = new AtomicBoolean(false);
        this.LJJIJ = new CopyOnWriteArrayList();
        if (this.LJJIJIIJI == null) {
            this.LJJIJIIJI = new C0FRC(this);
        }
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            nLEPlayerLJFF.addNLEResourceDownloadStatusListener(this.LJJIJIIJI);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int handleEffectDebugService(int i, String str, String str2) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            return nLEPlayerLJFF.handleEffectDebugService(i, str, str2);
        }
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void refreshAllKeyframeInfo(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (nLETrack != null && nLETrackSlot != null) {
            KeyFrameCalcalator.refreshKeyframeInfo(nLETrackSlot, j);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekTime(long j, NLESeekFlag nLESeekFlag, INLEListenerSeek iNLEListenerSeek) {
        int iSeekTime;
        synchronized (this.LIZ) {
            try {
                int iSeekTime2 = -1;
                if (!NLEMediaPublicJniJNI.NLEConfigUtil_enableSeekDoneAndRenderCallbackOpt()) {
                    if (iNLEListenerSeek != null) {
                        LIZJ();
                        this.LJIIL.put(Long.valueOf(j), iNLEListenerSeek);
                        LJII();
                    }
                    NLEPlayer nLEPlayerLJFF = LJFF();
                    if (nLEPlayerLJFF != null) {
                        iSeekTime2 = nLEPlayerLJFF.seekTime(j, nLESeekFlag);
                    }
                    if (iSeekTime2 != NLEError.SUCCESS.swigValue()) {
                        NLELoggerListener logger = NLE.INSTANCE.getLogger();
                        if (logger != null) {
                            LogLevel logLevel = LogLevel.LEVEL_WARNING;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("NLEVEPublic2: seekTime ");
                            sbLIZ.append(j);
                            sbLIZ.append(" failed! veResult: ");
                            sbLIZ.append(iSeekTime2);
                            logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        this.LJIIL.remove(Long.valueOf(j));
                    }
                    return iSeekTime2;
                }
                long j2 = this.LJIILJJIL;
                this.LJIILJJIL = 1 + j2;
                if (iNLEListenerSeek != null) {
                    LIZJ();
                    this.LJIILIIL.put(Long.valueOf(j2), iNLEListenerSeek);
                    LJII();
                }
                NLEPlayer nLEPlayerLJFF2 = LJFF();
                if (nLEPlayerLJFF2 != null) {
                    iSeekTime = nLEPlayerLJFF2.seekTime(j, nLESeekFlag, j2);
                } else {
                    iSeekTime = -1;
                }
                if (iSeekTime != NLEError.SUCCESS.swigValue()) {
                    NLELoggerListener logger2 = NLE.INSTANCE.getLogger();
                    if (logger2 != null) {
                        LogLevel logLevel2 = LogLevel.LEVEL_WARNING;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("NLEVEPublic2: seekTime ");
                        sbLIZ2.append(j);
                        sbLIZ2.append(" failed! veResult: ");
                        sbLIZ2.append(iSeekTime);
                        logger2.onLog(logLevel2, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    INLEListenerSeek iNLEListenerSeekRemove = this.LJIILIIL.remove(Long.valueOf(j2));
                    if (iNLEListenerSeekRemove != null) {
                        iNLEListenerSeekRemove.onSeekDone(-1);
                    }
                }
                return iSeekTime;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekWithFrame(long j, int i, final INLEListenerGetImage iNLEListenerGetImage) {
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF == null) {
                    return -1;
                }
                NLEListenerGetImageWrapper nLEListenerGetImageWrapper = new NLEListenerGetImageWrapper() { // from class: X.0FQy
                    @Override // com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper
                    public final int onGetImageDataCalled(byte[] bArr, int i2, int i3, int i4, float f) {
                        int iOnGetImageData = 0;
                        if (this.LIZ.LJ.getEnableCatchExceptionInCallback()) {
                            try {
                                INLEListenerGetImage iNLEListenerGetImage2 = iNLEListenerGetImage;
                                if (iNLEListenerGetImage2 != null) {
                                    iOnGetImageData = iNLEListenerGetImage2.onGetImageData(bArr, i2, i3, i4, f);
                                    return iOnGetImageData;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            return iOnGetImageData;
                        }
                        INLEListenerGetImage iNLEListenerGetImage3 = iNLEListenerGetImage;
                        if (iNLEListenerGetImage3 == null) {
                            return 0;
                        }
                        return iNLEListenerGetImage3.onGetImageData(bArr, i2, i3, i4, f);
                    }
                };
                this.LJIIZILJ = nLEListenerGetImageWrapper;
                return nLEPlayerLJFF.seekWithFrame(j, i, nLEListenerGetImageWrapper);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int setPlayRange(long j, long j2, NLESetRangeMode nLESetRangeMode) {
        NLEPlayer nLEPlayerLJFF = LJFF();
        if (nLEPlayerLJFF != null) {
            return nLEPlayerLJFF.setPlayRange(j, j2, nLESetRangeMode);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final int seekWithSpeed(long j, NLESeekFlag nLESeekFlag, float f, float f2) {
        int iSeekWithSpeed;
        synchronized (this.LIZ) {
            try {
                NLEPlayer nLEPlayerLJFF = LJFF();
                if (nLEPlayerLJFF != null) {
                    iSeekWithSpeed = nLEPlayerLJFF.seekWithSpeed(j, nLESeekFlag, f, f2);
                } else {
                    iSeekWithSpeed = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iSeekWithSpeed;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEPlayer
    public final void refreshAllKeyframeInfo(String str, long j, String str2, NLETrack nLETrack, NLETrackSlot nLETrackSlot, KeyframeType keyframeType) {
        String strFindVEParentIdByNLESlotUUID;
        String strFindVEParentIdByNLESlotUUID2;
        String strFindVEParentIdByNLESlotUUID3;
        String strFindVEParentIdByNLESlotUUID4;
        if (nLETrackSlot != null && nLETrack != null) {
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                LogLevel logLevel = LogLevel.LEVEL_DEBUG;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NLEVEPublic2: mediaRuntimeApi refreshAllKeyframeInfo time=");
                sbLIZ.append(j);
                sbLIZ.append(",parentId=");
                sbLIZ.append(str);
                sbLIZ.append(",json=");
                sbLIZ.append(str2);
                sbLIZ.append(",keyframeType=");
                sbLIZ.append(keyframeType);
                logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (keyframeType != null) {
                NLEChromaChannel nLEChromaChannel = null;
                NLEMask nLEMask = null;
                String strFindVEParentIdByNLESlotUUID5 = null;
                String string = null;
                String strFindVEParentIdByNLESlotUUID6 = null;
                NLEFilter nLEFilter = null;
                switch (C1778420wNc.LIZ[keyframeType.ordinal()]) {
                    case 1:
                        NLEMediaRuntimeController nLEMediaRuntimeControllerLJ = LJ();
                        if (nLEMediaRuntimeControllerLJ != null) {
                            strFindVEParentIdByNLESlotUUID3 = nLEMediaRuntimeControllerLJ.findVEParentIdByNLESlotUUID(nLETrackSlot.getUUID());
                        } else {
                            strFindVEParentIdByNLESlotUUID3 = null;
                        }
                        if (Intrinsics.LJFF(strFindVEParentIdByNLESlotUUID3, str)) {
                            C390000FQw c390000FQw = (C390000FQw) GsonProtectorUtils.fromJson(LIZLLL(), str2, C390000FQw.class);
                            float f = 2;
                            nLETrackSlot.setTransformX(((Number) ListProtector.get(c390000FQw.LIZIZ.LIZ, 0)).floatValue() / f);
                            nLETrackSlot.setTransformY(((Number) ListProtector.get(c390000FQw.LIZIZ.LIZ, 1)).floatValue() / f);
                            c390000FQw.LIZLLL.getClass();
                            float f2 = (float) 0.0d;
                            nLETrackSlot.setScale(f2);
                            c390000FQw.LIZJ.getClass();
                            nLETrackSlot.setRotation(-f2);
                            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                            if (nLESegmentVideoDynamicCast != null) {
                                c390000FQw.LIZ.getClass();
                                nLESegmentVideoDynamicCast.setAlpha(f2);
                            }
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotX(), String.valueOf(nLETrackSlot.getTransformX()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotY(), String.valueOf(nLETrackSlot.getTransformY()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotScale(), String.valueOf(nLETrackSlot.getScale()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotRotation(), String.valueOf(nLETrackSlot.getRotation()));
                            String strNLEKeyFrameTransientExtrakey_getSlotAlpha = NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotAlpha();
                            NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                            if (nLESegmentVideoDynamicCast2 != null) {
                                string = Float.valueOf(nLESegmentVideoDynamicCast2.getAlpha()).toString();
                            }
                            nLETrackSlot.setTransientExtra(strNLEKeyFrameTransientExtrakey_getSlotAlpha, string);
                            break;
                        }
                        break;
                    case 2:
                        VecNLEMaskSPtr masks = nLETrackSlot.getMasks();
                        if (masks != null) {
                            Iterator<NLEMask> it2 = masks.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    NLEMask next = it2.next();
                                    NLEMask nLEMask2 = next;
                                    NLEMediaRuntimeController nLEMediaRuntimeControllerLJ2 = LJ();
                                    if (nLEMediaRuntimeControllerLJ2 != null) {
                                        strFindVEParentIdByNLESlotUUID4 = nLEMediaRuntimeControllerLJ2.findVEParentIdByNLESlotUUID(nLEMask2.getUUID());
                                    } else {
                                        strFindVEParentIdByNLESlotUUID4 = null;
                                    }
                                    if (Intrinsics.LJFF(strFindVEParentIdByNLESlotUUID4, str)) {
                                        nLEMask = next;
                                    }
                                }
                            }
                            NLEMask nLEMask3 = nLEMask;
                            if (nLEMask3 != null) {
                                C0FR1 c0fr1 = (C0FR1) GsonProtectorUtils.fromJson(LIZLLL(), str2, C0FR1.class);
                                NLESegmentMask segment = nLEMask3.getSegment();
                                if (segment != null) {
                                    c0fr1.LIZ.getClass();
                                    segment.setWidth(0.0f);
                                    c0fr1.LIZIZ.getClass();
                                    segment.setHeight(0.0f);
                                    c0fr1.LIZJ.getClass();
                                    segment.setCenterX(0.0f);
                                    c0fr1.LIZLLL.getClass();
                                    segment.setCenterY(0.0f);
                                    c0fr1.LJ.getClass();
                                    segment.setRotation(0.0f);
                                    c0fr1.LJFF.getClass();
                                    segment.setFeather(0.0f);
                                    c0fr1.LJI.getClass();
                                    segment.setRoundCorner(0.0f);
                                    nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskWidth(), String.valueOf(segment.getWidth()));
                                    nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskHeight(), String.valueOf(segment.getHeight()));
                                    nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskCenterX(), String.valueOf(segment.getCenterX()));
                                    nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskCenterY(), String.valueOf(segment.getCenterY()));
                                    nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskRotation(), String.valueOf(segment.getRotation()));
                                    nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskfeather(), String.valueOf(segment.getFeather()));
                                    nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getMaskRoundCorner(), String.valueOf(segment.getRoundCorner()));
                                }
                            }
                        }
                        break;
                    case 3:
                        NLEMediaRuntimeController nLEMediaRuntimeControllerLJ3 = LJ();
                        if (nLEMediaRuntimeControllerLJ3 != null) {
                            strFindVEParentIdByNLESlotUUID5 = nLEMediaRuntimeControllerLJ3.findVEParentIdByNLESlotUUID(nLETrackSlot.getUUID());
                        }
                        if (Intrinsics.LJFF(strFindVEParentIdByNLESlotUUID5, str)) {
                            C389980FQu c389980FQu = (C389980FQu) GsonProtectorUtils.fromJson(LIZLLL(), str2, C389980FQu.class);
                            nLETrackSlot.setTransformX(((Number) ListProtector.get(c389980FQu.LIZ.LIZ, 0)).floatValue());
                            nLETrackSlot.setTransformY(((Number) ListProtector.get(c389980FQu.LIZ.LIZ, 1)).floatValue());
                            nLETrackSlot.setScale(((Number) ListProtector.get(c389980FQu.LIZIZ.LIZ, 0)).floatValue());
                            c389980FQu.LIZJ.getClass();
                            float f3 = (float) 0.0d;
                            nLETrackSlot.setRotation(f3);
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotX(), String.valueOf(nLETrackSlot.getTransformX()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotY(), String.valueOf(nLETrackSlot.getTransformY()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotScale(), String.valueOf(nLETrackSlot.getScale()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotRotation(), String.valueOf(nLETrackSlot.getRotation()));
                            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                            if (nLESegmentTextStickerDynamicCast != null) {
                                nLESegmentTextStickerDynamicCast.getStyle().setBackgroundColorVector(new VecFloat(c389980FQu.LJ.LIZ));
                                nLESegmentTextStickerDynamicCast.getStyle().setTextColorVector(new VecFloat(c389980FQu.LIZLLL.LIZ));
                                nLESegmentTextStickerDynamicCast.getStyle().setOutlineColorVector(new VecFloat(c389980FQu.LJIIIZ.LIZ));
                                NLEStyText style = nLESegmentTextStickerDynamicCast.getStyle();
                                c389980FQu.LJIIIIZZ.getClass();
                                style.setOutlineWidth(f3);
                                nLESegmentTextStickerDynamicCast.getStyle().setShadowColorVector(new VecFloat(c389980FQu.LJFF.LIZ));
                                nLESegmentTextStickerDynamicCast.getStyle().setShadowOffsetX(((Number) ListProtector.get(c389980FQu.LJII.LIZ, 0)).floatValue());
                                nLESegmentTextStickerDynamicCast.getStyle().setShadowOffsetY(((Number) ListProtector.get(c389980FQu.LJII.LIZ, 1)).floatValue());
                                NLEStyText style2 = nLESegmentTextStickerDynamicCast.getStyle();
                                c389980FQu.LJI.getClass();
                                style2.setShadowSmoothing(f3);
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextBackgroundColor(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getBackgroundColor()));
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextColor(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getTextColor()));
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextOutlineColor(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getOutlineColor()));
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextOutlineWidth(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getOutlineWidth()));
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowColor(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getShadowColor()));
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowOffsetX(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getShadowOffsetX()));
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowOffsetY(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getShadowOffsetY()));
                                nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getTextShadowSmoothing(), String.valueOf(nLESegmentTextStickerDynamicCast.getStyle().getShadowSmoothing()));
                            }
                            break;
                        }
                        break;
                    case 4:
                        NLEMediaRuntimeController nLEMediaRuntimeControllerLJ4 = LJ();
                        if (nLEMediaRuntimeControllerLJ4 != null) {
                            strFindVEParentIdByNLESlotUUID6 = nLEMediaRuntimeControllerLJ4.findVEParentIdByNLESlotUUID(nLETrackSlot.getUUID());
                        }
                        if (Intrinsics.LJFF(strFindVEParentIdByNLESlotUUID6, str)) {
                            C390010FQx c390010FQx = (C390010FQx) GsonProtectorUtils.fromJson(LIZLLL(), str2, C390010FQx.class);
                            nLETrackSlot.setTransformX(((Number) ListProtector.get(c390010FQx.LIZ.LIZ, 0)).floatValue());
                            nLETrackSlot.setTransformY(((Number) ListProtector.get(c390010FQx.LIZ.LIZ, 1)).floatValue());
                            nLETrackSlot.setScale(((Number) ListProtector.get(c390010FQx.LIZIZ.LIZ, 0)).floatValue());
                            c390010FQx.LIZJ.getClass();
                            nLETrackSlot.setRotation((float) 0.0d);
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotX(), String.valueOf(nLETrackSlot.getTransformX()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotY(), String.valueOf(nLETrackSlot.getTransformY()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotScale(), String.valueOf(nLETrackSlot.getScale()));
                            nLETrackSlot.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotRotation(), String.valueOf(nLETrackSlot.getRotation()));
                            break;
                        }
                        break;
                    case 5:
                        VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
                        if (filters != null) {
                            Iterator<NLEFilter> it3 = filters.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    NLEFilter next2 = it3.next();
                                    NLEFilter nLEFilter2 = next2;
                                    NLEMediaRuntimeController nLEMediaRuntimeControllerLJ5 = LJ();
                                    if (nLEMediaRuntimeControllerLJ5 != null) {
                                        strFindVEParentIdByNLESlotUUID2 = nLEMediaRuntimeControllerLJ5.findVEParentIdByNLESlotUUID(nLEFilter2.getUUID());
                                    } else {
                                        strFindVEParentIdByNLESlotUUID2 = null;
                                    }
                                    if (Intrinsics.LJFF(strFindVEParentIdByNLESlotUUID2, str)) {
                                        nLEFilter = next2;
                                    }
                                }
                            }
                            NLEFilter nLEFilter3 = nLEFilter;
                            if (nLEFilter3 != null) {
                                C0FR5 c0fr5 = (C0FR5) GsonProtectorUtils.fromJson(LIZLLL(), str2, C0FR5.class);
                                NLESegmentFilter segment2 = nLEFilter3.getSegment();
                                c0fr5.LIZ.getClass();
                                segment2.setIntensity((float) 0.0d);
                                nLEFilter3.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getFilterIntensity(), String.valueOf(nLEFilter3.getSegment().getIntensity()));
                            }
                        }
                        break;
                    case 6:
                        try {
                            VecNLEChromaChannelSPtr chromaChannels = nLETrackSlot.getChromaChannels();
                            if (chromaChannels != null) {
                                Iterator<NLEChromaChannel> it4 = chromaChannels.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        NLEChromaChannel next3 = it4.next();
                                        NLEChromaChannel nLEChromaChannel2 = next3;
                                        NLEMediaRuntimeController nLEMediaRuntimeControllerLJ6 = LJ();
                                        if (nLEMediaRuntimeControllerLJ6 != null) {
                                            strFindVEParentIdByNLESlotUUID = nLEMediaRuntimeControllerLJ6.findVEParentIdByNLESlotUUID(nLEChromaChannel2.getUUID());
                                        } else {
                                            strFindVEParentIdByNLESlotUUID = null;
                                        }
                                        if (Intrinsics.LJFF(strFindVEParentIdByNLESlotUUID, str)) {
                                            nLEChromaChannel = next3;
                                        }
                                    }
                                }
                                NLEChromaChannel nLEChromaChannel3 = nLEChromaChannel;
                                if (nLEChromaChannel3 != null) {
                                    LJI(nLEChromaChannel3, str2);
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                        break;
                }
            }
        }
    }
}
