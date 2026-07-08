package X;

import android.content.Context;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.s0;
import java.io.FileDescriptor;
import kotlin.jvm.internal.AwS434S0200000_33;

/* JADX INFO: renamed from: X.1AMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178261AMu implements InterfaceC2179221AQm {
    public static final /* synthetic */ int LJII = 0;
    public final InterfaceC2178301AMy LIZ;
    public final C01GW LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;
    public volatile long LJI;

    public final void LJIIIZ() {
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = 0L;
    }

    public final TTVideoEngine LJIIIIZZ() {
        return (TTVideoEngine) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC2179221AQm
    public final int LIZ() {
        return LJIIIIZZ().LIZ.LJJJJI;
    }

    @Override // X.InterfaceC2179221AQm
    public final long LIZIZ() {
        return LJIIIIZZ().LJJJIL();
    }

    @Override // X.InterfaceC2179221AQm
    public final long LJFF() {
        return LJIIIIZZ().LJJJLZIJ(60);
    }

    @Override // X.InterfaceC2179221AQm
    public final boolean LJII() {
        Object objLIZ;
        try {
            try {
                objLIZ = C1966507n5.LIZ(LJIIIIZZ());
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                objLIZ = null;
            } catch (NoSuchFieldException e2) {
                TryCatchGuardChecker.doCheck(e2);
                objLIZ = null;
            }
            return ((Boolean) objLIZ).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isPlayingCompletion: ");
            sbLIZ.append(Log.getStackTraceString(th));
            LynxLog.e("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final C1ANF LJIL() {
        return C1AND.LIZ(LJIIIIZZ().LIZ.LJIILL);
    }

    @Override // X.InterfaceC2179221AQm
    public final long getDuration() {
        return LJIIIIZZ().LJJJJL();
    }

    @Override // X.InterfaceC2179221AQm
    public final void pause() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> stop(),  already pause ?: ");
        sbLIZ.append(LJIIIIZZ().LJJLIIIJILLIZJL() == 2);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (LJIIIIZZ().LJJLIIIJILLIZJL() == 2) {
            return;
        }
        LJIIIIZZ().pause();
    }

    @Override // X.InterfaceC2179221AQm
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> release(),  mIsEngineInstantiate ?: ");
        sbLIZ.append(this.LIZJ);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LIZJ) {
            C2178901APg.LIZ("TTAudioEngineImpl", "TTVideoEngine is not instantiate, ignore release.");
        } else {
            LJIIIIZZ().LLI(null);
            LJIIIIZZ().release();
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void resume() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> resume(),  isPlaying ?: ");
        sbLIZ.append(LJIIIIZZ().LIZ.LJIILL == 1);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (LJIIIIZZ().LJJLIIIJILLIZJL() == 2) {
            LJIIIIZZ().play();
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> stop(),  already stop ?: ");
        sbLIZ.append(LJIIIIZZ().LJJLIIIJILLIZJL() == 0);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (LJIIIIZZ().LJJLIIIJILLIZJL() == 0) {
            return;
        }
        LJIIIIZZ().stop();
    }

    @Override // X.InterfaceC2179221AQm
    public final void LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> play(),  startPlayTime is ");
        sbLIZ.append(j);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = true;
        if (this.LJ) {
            LJIIIIZZ().play();
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> setLocalURL(),  localFilePath is ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ();
        LJIIIIZZ().LJIJ(str);
        LJIIIIZZ().prepare();
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJIJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> setDirectURL(),  playUrl is ");
        sbLIZ.append(str);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ();
        LJIIIIZZ().LJIJI(str);
        LJIIIIZZ().prepare();
    }

    public C2178261AMu(Context context, C2179181AQi c2179181AQi) {
        this.LIZ = c2179181AQi;
        this.LIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33(context, this, 163));
    }

    @Override // X.InterfaceC2179221AQm
    public final void LIZJ(EnumC2281151EQn enumC2281151EQn, C1470240oMY c1470240oMY) {
        LJIIIZ();
        if (c1470240oMY == null) {
            C2178901APg.LIZIZ("TTAudioEngineImpl", "videoMode is empty");
            return;
        }
        LJIIIIZZ().LLJJIJI(c1470240oMY);
        LJIIIIZZ().LJIILIIL(enumC2281151EQn);
        LJIIIIZZ().prepare();
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> setDirectUrlUseDataLoader(),  playUrl is ");
        sbLIZ.append(str);
        sbLIZ.append(",   cacheKey is ");
        sbLIZ.append(str2);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ();
        LJIIIIZZ().LJZ(str, str2);
        LJIIIIZZ().prepare();
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJI(final long j, final C2179171AQh c2179171AQh) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> seekToTime(),  time is ?: ");
        sbLIZ.append(j);
        sbLIZ.append(",   mIsSeeking : ");
        sbLIZ.append(this.LIZLLL);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LIZLLL) {
            long j2 = 0;
            if (j >= 0) {
                this.LIZLLL = true;
                long duration = getDuration() - 2000;
                if (0 < duration) {
                    j2 = duration;
                }
                if (j > j2) {
                    j = j2;
                }
                LJIIIIZZ().LJIJJLI((int) j, new s0() { // from class: X.1AMv
                    @Override // cxo.s0
                    public final void LJII(boolean z) {
                        InterfaceC2178281AMw interfaceC2178281AMw = c2179171AQh;
                        long j3 = j;
                        C2178261AMu c2178261AMu = this;
                        if (interfaceC2178281AMw != null) {
                            interfaceC2178281AMw.LIZ(j3, z);
                        }
                        c2178261AMu.LIZLLL = false;
                    }
                });
                return;
            }
        }
        if (c2179171AQh != null) {
            c2179171AQh.LIZ(j, false);
        }
    }

    @Override // X.InterfaceC2179221AQm
    public final void LJIIZILJ(FileDescriptor fileDescriptor, long j, long j2) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ---> setDataSource(),  FileDescriptor is ");
        if (fileDescriptor != null) {
            string = fileDescriptor.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2178901APg.LIZIZ("TTAudioEngineImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ();
        LJIIIIZZ().LJIIZILJ(fileDescriptor, j, j2);
    }
}
