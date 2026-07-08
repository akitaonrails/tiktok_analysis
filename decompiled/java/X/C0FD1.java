package X;

import Y.ARunnableS103S0100000_3;
import android.graphics.PointF;
import android.os.Looper;
import android.util.Size;
import android.view.SurfaceView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLESetRangeMode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FD1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FD1 implements C0E55 {
    public final C0E48 LIZ;
    public final MutableLiveData<Long> LIZIZ;
    public final MutableLiveData<C0E51> LIZJ;
    public final MutableLiveData LIZLLL;
    public final MutableLiveData LJ;
    public volatile boolean LJFF;
    public final C560530Lyd<Long> LJI;
    public final C560530Lyd<Pair<Long, Long>> LJII;
    public volatile float[] LJIIIIZZ;
    public volatile CopyOnWriteArrayList<Function0<Unit>> LJIIIZ;
    public final Object LJIIJ;
    public INLEPlayer LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public boolean LJIIZILJ;
    public final CopyOnWriteArrayList<INLEListenerVideoOutput> LJIJ;
    public final CopyOnWriteArrayList<INLEListenerFirstFrame> LJIJI;
    public boolean LJIJJ;
    public final C0FD3 LJIJJLI;
    public final C0FD4 LJIL;
    public final C0FD5 LJJ;

    @Override // X.C0E55
    public final void LJIJJ() {
        if (LJJIJIIJIL()) {
            long[] jArr = new long[2];
            this.LIZ.Bq(jArr);
            LJJIIZI(jArr[0] + ((long) LSPassThroughRecordSizeConfig.DEFAULT), jArr[1] - ((long) 30000), false, true);
        }
    }

    @Override // X.C0E55
    public final void LJIILIIL() {
        INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
        if (iNLEMediaSessionF1 != null) {
            iNLEMediaSessionF1.setDataSource(C350870DpF.LJI(this.LIZ));
        }
    }

    @Override // X.C0E55
    public final void LJIJJLI() {
        if (this.LJIILIIL) {
            long jJh = Jh();
            INLEPlayer iNLEPlayer = this.LJIIJJI;
            if (iNLEPlayer != null) {
                iNLEPlayer.setPlayRange(0L, -1L, NLESetRangeMode.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
            }
            LIZIZ(jJh);
        }
        this.LJIILIIL = false;
        this.LJIIZILJ = false;
        this.LJII.LJIIIZ(null);
    }

    @Override // X.C0E55
    public final void LJJI() {
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        if (iNLEPlayer != null) {
            iNLEPlayer.setVideoOutputListener(null);
        }
        INLEPlayer iNLEPlayer2 = this.LJIIJJI;
        if (iNLEPlayer2 != null) {
            iNLEPlayer2.removeOnInfoListener(this.LJJ);
        }
        INLEPlayer iNLEPlayer3 = this.LJIIJJI;
        if (iNLEPlayer3 != null) {
            iNLEPlayer3.removeOnInfoListener(this.LJIL);
        }
    }

    @Override // X.C0E55
    public final void LJJIIJ() {
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        if (iNLEPlayer != null) {
            iNLEPlayer.setVideoOutputListener(this.LJIJJLI);
        }
        INLEPlayer iNLEPlayer2 = this.LJIIJJI;
        if (iNLEPlayer2 != null) {
            iNLEPlayer2.removeOnInfoListener(this.LJJ);
        }
        INLEPlayer iNLEPlayer3 = this.LJIIJJI;
        if (iNLEPlayer3 != null) {
            iNLEPlayer3.removeOnInfoListener(this.LJIL);
        }
        INLEPlayer iNLEPlayer4 = this.LJIIJJI;
        if (iNLEPlayer4 != null) {
            iNLEPlayer4.addOnInfoListener(this.LJJ, false);
        }
        INLEPlayer iNLEPlayer5 = this.LJIIJJI;
        if (iNLEPlayer5 != null) {
            INLEPlayer.DefaultImpls.addOnInfoListener$default(iNLEPlayer5, this.LJIL, false, 2, null);
        }
    }

    public final boolean LJJIJIIJIL() {
        return this.LIZ.Ls() && !this.LIZ.a5();
    }

    @Override // X.C0E55
    public final void flushSeekCmd() {
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        if (iNLEPlayer != null) {
            iNLEPlayer.flushSeekCmd();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flushSeekCmd1, thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        C355090Dw3.LIZIZ("EP_ANR_OPT", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0E55
    public final Size getInitSize() {
        SurfaceView surfaceViewLJIJJLI = this.LIZ.LJIJJLI();
        int width = surfaceViewLJIJJLI != null ? surfaceViewLJIJJLI.getWidth() : 0;
        SurfaceView surfaceViewLJIJJLI2 = this.LIZ.LJIJJLI();
        return LJJIJIIJI(C350870DpF.LJI(this.LIZ).getCanvasRatio(), width, surfaceViewLJIJJLI2 != null ? surfaceViewLJIJJLI2.getHeight() : 0);
    }

    @Override // X.C0E55
    public final long Jh() {
        if (!LJJIJIIJIL()) {
            return 0L;
        }
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        return (iNLEPlayer != null ? iNLEPlayer.getCurrentPosition() : 0L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.C0E55
    public final void onDestroy() {
        if (LJJIJIIJIL()) {
            INLEPlayer iNLEPlayer = this.LJIIJJI;
            if (iNLEPlayer != null) {
                iNLEPlayer.removeOnInfoListener(this.LJJ);
            }
            INLEPlayer iNLEPlayer2 = this.LJIIJJI;
            if (iNLEPlayer2 != null) {
                iNLEPlayer2.removeOnInfoListener(this.LJIL);
            }
            if (this.LIZ.jg()) {
                return;
            }
            INLEPlayer iNLEPlayer3 = this.LJIIJJI;
            if (iNLEPlayer3 != null) {
                iNLEPlayer3.releaseResource();
            }
            INLEPlayer iNLEPlayer4 = this.LJIIJJI;
            if (iNLEPlayer4 != null) {
                iNLEPlayer4.destroy();
            }
        }
    }

    @Override // X.C0E55
    public final void prepare() {
        INLEPlayer iNLEPlayer;
        if (!LJJIJIIJIL() || (iNLEPlayer = this.LJIIJJI) == null) {
            return;
        }
        iNLEPlayer.prepare();
    }

    @Override // X.C0E55
    public final long qq() {
        if (!LJJIJIIJIL()) {
            return 0L;
        }
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        return (iNLEPlayer != null ? iNLEPlayer.getDuration() : 0L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.C0E55
    public final /* bridge */ /* synthetic */ C560530Lyd LIZJ() {
        return this.LJI;
    }

    @Override // X.C0E55
    public final MutableLiveData LIZLLL() {
        return this.LJ;
    }

    @Override // X.C0E55
    public final MutableLiveData LJ() {
        return this.LIZLLL;
    }

    @Override // X.C0E55
    public final /* bridge */ /* synthetic */ C560530Lyd LJJIFFI() {
        return this.LJII;
    }

    @Override // X.C0E55
    public final boolean LJJIJ() {
        return this.LJIILIIL;
    }

    @Override // X.C0E55
    public final float[] LLJLLIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0E55
    public final boolean isPlaying() {
        return this.LJFF;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0FD4] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0FD5] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0FD3] */
    public C0FD1(C0E48 c0e48) {
        this.LIZ = c0e48;
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.LIZIZ = mutableLiveData;
        MutableLiveData<C0E51> mutableLiveData2 = new MutableLiveData<>();
        this.LIZJ = mutableLiveData2;
        this.LIZLLL = mutableLiveData;
        this.LJ = mutableLiveData2;
        new ArrayList();
        this.LJI = new C560530Lyd<>();
        this.LJII = new C560530Lyd<>();
        this.LJIIIZ = new CopyOnWriteArrayList<>();
        this.LJIIJ = new Object();
        new BPEAHandler(Looper.getMainLooper());
        this.LJIIL = true;
        this.LJIILJJIL = true;
        this.LJIJ = new CopyOnWriteArrayList<>();
        this.LJIJI = new CopyOnWriteArrayList<>();
        this.LJIJJ = true;
        this.LJIJJLI = new INLEListenerVideoOutput() { // from class: X.0FD3
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                C0FD1 c0fd1 = this.LL;
                synchronized (c0fd1.LJIIJ) {
                    try {
                        Iterator<INLEListenerVideoOutput> it2 = c0fd1.LJIJ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onRefresh(i, j);
                        }
                        if (!c0fd1.LJIIL) {
                            return;
                        }
                        if (i == 0) {
                            if (c0fd1.LJFF) {
                                c0fd1.LIZIZ.postValue(Long.valueOf(j));
                            }
                        } else if (i == 1) {
                            c0fd1.LJI.LJIIIZ(Long.valueOf(j));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        };
        this.LJIL = new INLEListenerCommon() { // from class: X.0FD4
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str) {
                if (4359 == i) {
                    Iterator<INLEListenerFirstFrame> it2 = this.LIZ.LJIJI.iterator();
                    while (it2.hasNext()) {
                        it2.next().onRendered();
                    }
                } else if (4098 == i) {
                    C0FD1 c0fd1 = this.LIZ;
                    c0fd1.LIZJ.postValue(new C0E51(c0fd1.LJIJJ, c0fd1.LJIILIIL));
                    C0FD1 c0fd12 = this.LIZ;
                    if (c0fd12.LJIJJ) {
                        c0fd12.pause(false);
                    }
                }
            }
        };
        this.LJJ = new INLEListenerCommon() { // from class: X.0FD5
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str) {
                if (i != 4101 && i != 4148) {
                    return;
                }
                Iterator<Function0<Unit>> it2 = this.LIZ.LJIIIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
            }
        };
    }

    @Override // X.C0E55
    public final void LIZ(Function0<Unit> function0) {
        this.LJIIIZ.remove(function0);
    }

    @Override // X.C0E55
    public final void LIZIZ(long j) {
        LJFF(j, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, new INLEListenerSeek() { // from class: X.0FD9
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
            public final void onSeekDone(int i) {
            }
        });
    }

    @Override // X.C0E55
    public final void LJI(SurfaceView surfaceView) {
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        if (iNLEPlayer != null) {
            INLEPurePlayer.DefaultImpls.setAndroidMagnifierSurface$default(iNLEPlayer, surfaceView.getHolder().getSurface(), false, 2, null);
        }
        INLEPlayer iNLEPlayer2 = this.LJIIJJI;
        if (iNLEPlayer2 != null) {
            iNLEPlayer2.setAndroidMagnifierSurfaceSize(surfaceView.getWidth(), surfaceView.getHeight());
        }
    }

    @Override // X.C0E55
    public final void LJII(NLETrackSlot nLETrackSlot) {
        INLEStickerRuntime stickerApi;
        if (NLESegmentSticker.dynamicCast(nLETrackSlot.getMainSegment()) == null && NLESegmentTextTemplate.dynamicCast(nLETrackSlot.getMainSegment()) == null) {
            throw new IllegalStateException("only support NLESegmentSticker and NLESegmentTextTemplate");
        }
        INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
        if (iNLEMediaSessionF1 != null && (stickerApi = iNLEMediaSessionF1.getStickerApi()) != null) {
            stickerApi.stopStickerAnimationPreview();
        }
    }

    @Override // X.C0E55
    public final void LJIIIZ(INLEListenerFirstFrame iNLEListenerFirstFrame) {
        this.LJIJI.remove(iNLEListenerFirstFrame);
    }

    @Override // X.C0E55
    public final void LJIILL(boolean z) {
        this.LJIJJ = z;
    }

    @Override // X.C0E55
    public final void LJIILLIIL(INLEPlayer iNLEPlayer) {
        this.LJIIJJI = iNLEPlayer;
    }

    @Override // X.C0E55
    public final void LJIIZILJ(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // X.C0E55
    public final void LJIL(C363090ELj c363090ELj) {
        this.LJIJI.add(c363090ELj);
    }

    @Override // X.C0E55
    public final void LJJ(INLEListenerVideoOutput iNLEListenerVideoOutput) {
        this.LJIJ.add(iNLEListenerVideoOutput);
    }

    @Override // X.C0E55
    public final void LJJIII(INLEListenerVideoOutput iNLEListenerVideoOutput) {
        this.LJIJ.remove(iNLEListenerVideoOutput);
    }

    @Override // X.C0E55
    public final void LJJIIJZLJL(Function0<Unit> function0) {
        if (this.LJIIIZ.contains(function0)) {
            return;
        }
        this.LJIIIZ.add(function0);
    }

    @Override // X.C0E55
    public final void LJJIIZ(Integer num) {
        if (LJJIJIIJIL()) {
            if (num == null) {
                INLEPlayer iNLEPlayer = this.LJIIJJI;
                if (iNLEPlayer != null) {
                    iNLEPlayer.refreshCurrentFrame();
                }
            } else {
                INLEPlayer iNLEPlayer2 = this.LJIIJJI;
                if (iNLEPlayer2 != null) {
                    iNLEPlayer2.refreshCurrentFrame(num.intValue());
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshCurrentFrame, thread=");
            sbLIZ.append(C786410Ut5.u3().getName());
            C355090Dw3.LIZIZ("EP_ANR_OPT", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJJIJIL(boolean z) {
        boolean z2;
        Long lValueOf;
        if (LJJIJIIJIL()) {
            this.LJII.LJIIIZ(new Pair<>(Long.valueOf(this.LJIILLIIL), Long.valueOf(this.LJIILL)));
            if (this.LJIIZILJ && this.LJIILIIL) {
                z2 = false;
            } else {
                INLEPlayer iNLEPlayer = this.LJIIJJI;
                if (iNLEPlayer != null) {
                    iNLEPlayer.setPlayRange(this.LJIILLIIL, this.LJIILL, NLESetRangeMode.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                }
                z2 = true;
            }
            this.LJIILIIL = true;
            if (!z && C351220Dpo.LLLLLLL(this.LJIILL) - Jh() >= 30) {
                if (z2) {
                    lValueOf = Long.valueOf(Jh());
                } else {
                    lValueOf = null;
                }
            } else {
                lValueOf = Long.valueOf(C351220Dpo.LLLLLLL(this.LJIILLIIL));
            }
            INLEPlayer iNLEPlayer2 = this.LJIIJJI;
            if (iNLEPlayer2 != null) {
                iNLEPlayer2.flushSeekCmd();
            }
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1487);
            if (lValueOf != null) {
                ba(lValueOf.longValue(), new C0FX3(awS549S0100000_5, 24));
                lValueOf.longValue();
            } else {
                awS549S0100000_5.invoke();
            }
        }
    }

    @Override // X.C0E55
    public final void LLIL(boolean z) {
        if (this.LJIIZILJ) {
            LJJIJIL(false);
            return;
        }
        if (!LJJIJIIJIL()) {
            return;
        }
        this.LJFF = true;
        if (!z && qq() - Jh() < 50) {
            LJJIIZ(null);
            LIZIZ(0L);
        }
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        if (iNLEPlayer != null) {
            iNLEPlayer.play();
        }
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(1);
    }

    @Override // X.C0E55
    public final void Wj(boolean z) {
        this.LJFF = z;
    }

    @Override // X.C0E55
    public final void onVisibilityChanged(boolean z) {
        if (z) {
            INLEPlayer iNLEPlayer = this.LJIIJJI;
            if (iNLEPlayer != null) {
                iNLEPlayer.setVideoOutputListener(this.LJIJJLI);
            }
            INLEPlayer iNLEPlayer2 = this.LJIIJJI;
            if (iNLEPlayer2 != null) {
                iNLEPlayer2.removeOnInfoListener(this.LJJ);
            }
            INLEPlayer iNLEPlayer3 = this.LJIIJJI;
            if (iNLEPlayer3 != null) {
                iNLEPlayer3.removeOnInfoListener(this.LJIL);
            }
            INLEPlayer iNLEPlayer4 = this.LJIIJJI;
            if (iNLEPlayer4 != null) {
                iNLEPlayer4.addOnInfoListener(this.LJJ, false);
            }
            INLEPlayer iNLEPlayer5 = this.LJIIJJI;
            if (iNLEPlayer5 != null) {
                INLEPlayer.DefaultImpls.addOnInfoListener$default(iNLEPlayer5, this.LJIL, false, 2, null);
                return;
            }
            return;
        }
        INLEPlayer iNLEPlayer6 = this.LJIIJJI;
        if (iNLEPlayer6 != null) {
            iNLEPlayer6.setVideoOutputListener(null);
        }
        INLEPlayer iNLEPlayer7 = this.LJIIJJI;
        if (iNLEPlayer7 != null) {
            iNLEPlayer7.removeOnInfoListener(this.LJJ);
        }
        INLEPlayer iNLEPlayer8 = this.LJIIJJI;
        if (iNLEPlayer8 != null) {
            iNLEPlayer8.removeOnInfoListener(this.LJIL);
        }
        this.LIZIZ.postValue(-1L);
    }

    @Override // X.C0E55
    public final void pause(boolean z) {
        if (LJJIJIIJIL()) {
            C350870DpF.LJIIJ(this.LIZ, "is_play_while_exit_edit", Boolean.valueOf(this.LJFF));
            Jh();
            INLEPlayer iNLEPlayer = this.LJIIJJI;
            if (iNLEPlayer != null) {
                iNLEPlayer.pause();
            }
            this.LJFF = false;
            if (this.LJIILIIL && !this.LJIIZILJ) {
                LJIJJLI();
            }
            if (z) {
                LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).setValue(0);
            } else {
                LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(0);
            }
        }
    }

    @Override // X.C0E55
    public final void setActive(boolean z) {
        this.LJIIL = z;
    }

    @Override // X.C0E55
    public final void skipNextSeek(boolean z) {
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
        if (iNLEMediaSessionF1 != null && (playerApi = iNLEMediaSessionF1.getPlayerApi()) != null) {
            playerApi.skipNextSeek(z);
        }
    }

    @Override // X.C0E55
    public final void LJIJI(long j, INLEListenerSeek iNLEListenerSeek) {
        LJJII(j, iNLEListenerSeek);
    }

    @Override // X.C0E55
    public final void LJJII(long j, INLEListenerSeek iNLEListenerSeek) {
        if (j >= 0 && LJJIJIIJIL()) {
            C350870DpF.LJIIIZ(this.LIZ, "move_track_to_position", Long.valueOf(j));
            ba(C351220Dpo.LLLLLLL(j), iNLEListenerSeek);
        }
    }

    @Override // X.C0E55
    public final void ba(long j, INLEListenerSeek iNLEListenerSeek) {
        LJFF(j, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, iNLEListenerSeek);
    }

    public static Size LJJIJIIJI(float f, int i, int i2) {
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > f) {
            float f4 = f3 * f;
            if (Math.abs(f4) <= Float.MAX_VALUE) {
                return new Size((int) f4, i2);
            }
            return new Size(720, 1280);
        }
        float f5 = f2 / f;
        if (Math.abs(f5) <= Float.MAX_VALUE) {
            return new Size(i, (int) f5);
        }
        return new Size(720, 1280);
    }

    @Override // X.C0E55
    public final void LJFF(long j, NLESeekFlag nLESeekFlag, final INLEListenerSeek iNLEListenerSeek) {
        C0FD7 c0fd7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek, thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" position=");
        sbLIZ.append(j);
        sbLIZ.append(" seekFlag=");
        sbLIZ.append(nLESeekFlag);
        C355090Dw3.LIZIZ("SeekingLog", C2188811AlT.LIZIZ(sbLIZ));
        if (LJJIJIIJIL()) {
            this.LJFF = false;
            Integer numValueOf = null;
            if (nLESeekFlag == NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek) {
                c0fd7 = new C0FD7(this) { // from class: X.0FD6
                    @Override // X.C0FD7, com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                    public final void onSeekDone(int i) {
                        super.onSeekDone(i);
                        iNLEListenerSeek.onSeekDone(i);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this);
                    }
                };
                qq();
            } else {
                c0fd7 = null;
            }
            INLEPlayer iNLEPlayer = this.LJIIJJI;
            if (iNLEPlayer != null) {
                numValueOf = Integer.valueOf(iNLEPlayer.seekTime(C351220Dpo.LLLLLLJ(j), nLESeekFlag, c0fd7));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("seekTime, thread=");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C355090Dw3.LIZIZ("EP_ANR_OPT", C2188811AlT.LIZIZ(sbLIZ2));
            if ((numValueOf == null || numValueOf.intValue() != 0) && c0fd7 != null) {
                c0fd7.onSeekDone(-1);
            }
        }
    }

    @Override // X.C0E55
    public final void LJIIIIZZ(long j, long j2, boolean z) {
        if (z) {
            LJIJI(j, C351110Dpd.LIZ);
        }
        this.LJIILIIL = true;
        this.LJIILLIIL = j;
        this.LJIILL = j2;
        this.LJIIZILJ = true;
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        if (iNLEPlayer != null) {
            iNLEPlayer.setPlayRange(j, j2, NLESetRangeMode.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
        }
    }

    @Override // X.C0E55
    public final void LJIIJ(NLEModel nLEModel, boolean z, Function0<Unit> function0) {
        if (!this.LJIILJJIL) {
            return;
        }
        C355090Dw3.LIZIZ("EP_ANR_OPT", "setDataSourceV1");
        AwS249S0300000_5 awS249S0300000_5 = new AwS249S0300000_5(this, (C0FD1) nLEModel, (NLEModel) function0, (Function0<Unit>) 29);
        if (z) {
            C786410Ut5.LJJZZIII(this.LIZ.wm(), new ARunnableS103S0100000_3((Object) awS249S0300000_5, 137));
        } else {
            awS249S0300000_5.invoke();
        }
    }

    @Override // X.C0E55
    public final void LJIIJJI(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        INLEPlayer iNLEPlayer = this.LJIIJJI;
        if (iNLEPlayer != null) {
            iNLEPlayer.refreshAllKeyframeInfo(j, nLETrack, nLETrackSlot);
        }
    }

    @Override // X.C0E55
    public final void LJIIL(float f, float f2, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek, thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" position=");
        sbLIZ.append(j);
        sbLIZ.append(" seekPxSpeed=");
        sbLIZ.append(f);
        sbLIZ.append(" seekDurationSpeed=");
        sbLIZ.append(f2);
        C355090Dw3.LIZIZ("SeekingLog", C2188811AlT.LIZIZ(sbLIZ));
        if (LJJIJIIJIL()) {
            this.LJFF = false;
            INLEPlayer iNLEPlayer = this.LJIIJJI;
            if (iNLEPlayer != null) {
                iNLEPlayer.seekWithSpeed(C351220Dpo.LLLLLLJ(j), NLESeekFlag.EDITOR_SEEK_FLAG_OnGoing, f2, f);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("seekWithSpeed1, thread=");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C355090Dw3.LIZIZ("EP_ANR_OPT", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.C0E55
    public final void LJIJ(long j, Boolean bool, Function0<Unit> function0) {
        if (LJJIJIIJIL()) {
            LJFF(j, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, new C0FX2(bool, function0, 13));
        }
    }

    @Override // X.C0E55
    public final void LJJIIZI(long j, long j2, boolean z, boolean z2) {
        this.LJIILLIIL = j;
        this.LJIILL = j2;
        this.LJIIZILJ = z;
        LJJIJIL(z2);
    }

    @Override // X.C0E55
    public final void LJIILJJIL(float f, float f2, float f3, float f4, InterfaceC1685420txc<? super SurfaceView, ? super Float, ? super Float, ? super Float, ? super Float, Unit> interfaceC1685420txc) {
        PairIntInt pairIntInt;
        int width;
        int height;
        INLEMediaRuntime mediaRuntimeApi;
        INLEMediaRuntime mediaRuntimeApi2;
        this.LJIIIIZZ = new float[]{f, f2, f3, f4};
        INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
        if (iNLEMediaSessionF1 == null || (mediaRuntimeApi2 = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi2.getInitSize()) == null) {
            pairIntInt = new PairIntInt(0, 0);
        }
        if (pairIntInt.getFirst() != 0 && pairIntInt.getSecond() != 0) {
            C817403Hg c817403Hg = new C817403Hg();
            c817403Hg.element = f3 / pairIntInt.getFirst();
            C817403Hg c817403Hg2 = new C817403Hg();
            c817403Hg2.element = f4 / pairIntInt.getSecond();
            SurfaceView surfaceViewLJIJJLI = this.LIZ.LJIJJLI();
            if (surfaceViewLJIJJLI != null) {
                width = surfaceViewLJIJJLI.getWidth();
            } else {
                width = 0;
            }
            SurfaceView surfaceViewLJIJJLI2 = this.LIZ.LJIJJLI();
            if (surfaceViewLJIJJLI2 != null) {
                height = surfaceViewLJIJJLI2.getHeight();
            } else {
                height = 0;
            }
            PointF pointF = new PointF(width / 2.0f, height / 2.0f);
            int i = -((int) ((pointF.x - (f3 / 2.0f)) - f));
            float f5 = (pointF.y - (f4 / 2)) - f2;
            if (Intrinsics.LJFF(C0E5G.LIZ(EnumC357850E1f.ENABLE_SURFACE_VIEW_PROPERTY_API), Boolean.TRUE)) {
                SurfaceView surfaceViewLJIJJLI3 = this.LIZ.LJIJJLI();
                if (surfaceViewLJIJJLI3 != null) {
                    C0FD2 c0fd2 = new C0FD2(c817403Hg, c817403Hg2, this, width, height, f3, f4, pointF, f5, i, surfaceViewLJIJJLI3, interfaceC1685420txc);
                    if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        C1524705y1.LIZJ(new AwS549S0100000_5(c0fd2, 1488));
                        return;
                    } else {
                        c0fd2.invoke();
                        return;
                    }
                }
                return;
            }
            INLEMediaSession iNLEMediaSessionF12 = this.LIZ.f1();
            if (iNLEMediaSessionF12 != null && (mediaRuntimeApi = iNLEMediaSessionF12.getMediaRuntimeApi()) != null) {
                mediaRuntimeApi.setDisplayState(c817403Hg.element, c817403Hg2.element, 0.0f, i, (int) f5);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setDisplayState, thread=");
            sbLIZ.append(C786410Ut5.u3().getName());
            C355090Dw3.LIZIZ("EP_ANR_OPT", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
