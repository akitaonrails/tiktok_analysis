package X;

import Y.ACallableS425S0100000_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS17S0200100_20;
import Y.ARunnableS21S0100100_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS6S0100001_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jP8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279640jP8 implements C1EOS, InterfaceC1279380jOi, InterfaceC1279760jPK {
    public final C1277680jLy LL;
    public InterfaceC1279680jPC LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C1EOS
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C1EOS
    public final void LJIILIIL(boolean z) {
    }

    @Override // X.C1EOS
    public final void LJIJ(int i) {
    }

    @Override // X.C1EOS
    public final void LJJ() {
    }

    @Override // X.C1EOS
    public final int LJJI() {
        return 0;
    }

    @Override // X.C1EOS
    public final boolean LJJIFFI() {
        return false;
    }

    @Override // X.C1EOS
    public final /* synthetic */ void LJJIIJ() {
    }

    @Override // X.C1EOS
    public final int LJJIIZ(C1698900uJM c1698900uJM, C1699380uK8 c1699380uK8) {
        return 0;
    }

    @Override // X.C1EOS
    public final void LJJIJIIJI(String str) {
    }

    @Override // X.C1EOS
    public final void LJJIJL(EnumC1490990ou1 enumC1490990ou1) {
    }

    @Override // X.C1EOS
    public final void LJJIL(boolean z, boolean z2) {
    }

    @Override // X.C1EOS
    public final void LJJIZ(C1699080uJe c1699080uJe) {
    }

    @Override // X.C1EOS
    public final void LJJJ(InterfaceC1279750jPJ interfaceC1279750jPJ) {
    }

    @Override // X.C1EOS
    public final void LJJJJI() {
        this.LLILLL = true;
    }

    @Override // X.C1EOS
    public final int LJJJJL(int i) {
        return 0;
    }

    @Override // X.C1EOS
    public final void LJJJJZI(boolean z) {
    }

    @Override // X.C1EOS
    public final long getBitrate() {
        return 0L;
    }

    @Override // X.C1EOS
    public final int stopAuxAudioDucking(int i) {
        return 0;
    }

    @Override // X.C1EOS
    public final int writeAuxAudioDuckingPCM(byte[] bArr, int i) {
        return 0;
    }

    @Override // X.C1EOS
    public final EnumC1279670jPB LIZJ() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null) {
            return EnumC1279670jPB.IDLE;
        }
        int i = C1279400jOk.LIZ[c1277680jLy.LJJIFFI.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? EnumC1279670jPB.IDLE : EnumC1279670jPB.PREPARING : EnumC1279670jPB.STOPPED : EnumC1279670jPB.PAUSED : EnumC1279670jPB.PLAYED : EnumC1279670jPB.IDLE;
    }

    @Override // X.C1EOS
    public final void LJIIIIZZ() {
        Handler handler;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null || (handler = c1277680jLy.LJI) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1277680jLy, 232));
    }

    @Override // X.C1EOS
    public final Surface LJIIJJI() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null) {
            return null;
        }
        return c1277680jLy.LIZLLL;
    }

    @Override // X.C1EOS
    public final void LJIILL() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            c1277680jLy.LJFF(!this.LLILLL);
            C1277680jLy c1277680jLy2 = this.LL;
            Handler handler = c1277680jLy2.LJI;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1277680jLy2, 228));
            }
        }
    }

    @Override // X.C1EOS
    public final JSONObject LJIIZILJ() {
        if (this.LL == null) {
            return null;
        }
        return new JSONObject();
    }

    @Override // X.C1EOS
    public final long LJIJJLI() {
        C1279540jOy c1279540jOy;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null || (c1279540jOy = c1277680jLy.LJJIII) == null) {
            return 0L;
        }
        return c1279540jOy.LJJLL;
    }

    @Override // X.C1EOS
    public final Bitmap LJIL() {
        C1277550jLl c1277550jLl;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null || (c1277550jLl = c1277680jLy.LJ) == null) {
            return null;
        }
        return c1277550jLl.LIZ();
    }

    @Override // X.C1EOS
    public final C1279660jPA LJJJJIZL() {
        C1279540jOy c1279540jOy;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null && (c1279540jOy = c1277680jLy.LJJIII) != null) {
            c1279540jOy.LJIIJJI(System.currentTimeMillis());
            C1278260jMu c1278260jMu = c1279540jOy.LIZ;
            if (c1278260jMu != null) {
                C1279660jPA c1279660jPA = new C1279660jPA();
                c1279660jPA.LIZ = c1278260jMu.LIZ;
                c1279660jPA.LIZIZ = c1278260jMu.LIZIZ;
                c1279660jPA.LIZJ = c1278260jMu.LIZJ;
                c1279660jPA.LJ = c1278260jMu.LJFF;
                c1279660jPA.LJFF = c1278260jMu.LJ;
                return c1279660jPA;
            }
        }
        return null;
    }

    @Override // X.C1EOS
    public final String getCurrentResolution() {
        return this.LL == null ? "" : "origin";
    }

    @Override // X.C1EOS
    public final JSONObject getFirstFrameBlockInfo() {
        if (this.LL == null) {
            return null;
        }
        return new JSONObject();
    }

    @Override // X.C1EOS
    public final int getHeight() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFrameHeight -> ");
        C1277550jLl c1277550jLl = c1277680jLy.LJ;
        sbLIZ.append(c1277550jLl != null ? Integer.valueOf(c1277550jLl.LJIIJJI) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1277550jLl c1277550jLl2 = c1277680jLy.LJ;
        if (c1277550jLl2 != null) {
            return c1277550jLl2.LJIIJJI;
        }
        return 0;
    }

    @Override // X.C1EOS
    public final C1281010jRL getNetworkState() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null) {
            return null;
        }
        C1279690jPD c1279690jPDLIZIZ = C1277680jLy.LIZIZ(1, c1277680jLy.LJJII);
        C1281010jRL c1281010jRL = new C1281010jRL();
        c1281010jRL.LIZ = c1279690jPDLIZIZ.LIZ;
        c1281010jRL.LIZIZ = c1279690jPDLIZIZ.LIZIZ;
        c1281010jRL.LIZJ = c1279690jPDLIZIZ.LIZJ;
        c1281010jRL.LIZLLL = c1279690jPDLIZIZ.LIZLLL;
        c1281010jRL.LJ = c1279690jPDLIZIZ.LJ;
        c1281010jRL.LJFF = c1279690jPDLIZIZ.LJFF;
        c1281010jRL.LJI = c1279690jPDLIZIZ.LJI;
        return c1281010jRL;
    }

    @Override // X.C1EOS
    public final int getWidth() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFrameWidth -> ");
        C1277550jLl c1277550jLl = c1277680jLy.LJ;
        sbLIZ.append(c1277550jLl != null ? Integer.valueOf(c1277550jLl.LJIIJ) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1277550jLl c1277550jLl2 = c1277680jLy.LJ;
        if (c1277550jLl2 != null) {
            return c1277550jLl2.LJIIJ;
        }
        return 0;
    }

    @Override // X.C1EOS
    public final void mute() {
        Handler handler;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null || (handler = c1277680jLy.LJI) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1277680jLy, 231));
    }

    @Override // X.C1EOS
    public final void pause() {
        Handler handler;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null || (handler = c1277680jLy.LJI) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1277680jLy, 226));
    }

    @Override // X.C1EOS
    public final void release() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            c1277680jLy.LJFF(!this.LLILLL);
            C1277680jLy c1277680jLy2 = this.LL;
            Handler handler = c1277680jLy2.LJI;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1277680jLy2, 228));
            }
        }
    }

    @Override // X.C1EOS
    public final void reset() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            c1277680jLy.LJFF(!this.LLILLL);
        }
    }

    @Override // X.C1EOS
    public final void stop() {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            c1277680jLy.LJFF(!this.LLILLL);
        }
    }

    @Override // X.C1EOS
    public final List<String> LJIJJ() {
        return Collections.emptyList();
    }

    public C1279640jP8(String str) {
        C1277700jM0 c1277700jM0 = new C1277700jM0();
        c1277700jM0.LJFF = C1475000oUE.LIZ;
        c1277700jM0.LIZ = C1475000oUE.LIZIZ().getChannel();
        c1277700jM0.LIZJ = String.valueOf(C1475000oUE.LIZIZ().getAppID());
        c1277700jM0.LIZIZ = C1475000oUE.LIZIZ().getAppVersion();
        c1277700jM0.LJ = (String) C1474810oTv.d6.getValue();
        c1277700jM0.LIZLLL = (String) C1474810oTv.e6.getValue();
        C1277680jLy c1277680jLy = new C1277680jLy(c1277700jM0);
        this.LL = c1277680jLy;
        Handler handler = c1277680jLy.LJI;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(this, c1277680jLy, 155));
        }
        Handler handler2 = c1277680jLy.LJI;
        if (handler2 != null) {
            C786410Ut5.LJJZZIII(handler2, new ARunnableS89S0200000_20(this, c1277680jLy, 149));
        }
        Handler handler3 = c1277680jLy.LJI;
        if (handler3 != null) {
            C786410Ut5.LJJZZIII(handler3, new ARunnableS25S1100000_20(c1277680jLy, str, 19));
        }
    }

    @Override // X.C1EOS
    public final void LIZ(boolean z) {
        Handler handler;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null && (handler = c1277680jLy.LJI) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS39S0110000_20(c1277680jLy, z, 17));
        }
    }

    public final void LIZIZ(C1279510jOv c1279510jOv) {
        InterfaceC1279680jPC interfaceC1279680jPC = this.LLILLJJLI;
        if (interfaceC1279680jPC != null) {
            interfaceC1279680jPC.LJJLIL(new C1284720jXK(c1279510jOv.LIZ.ordinal(), c1279510jOv.LIZJ, null, false));
        }
    }

    @Override // X.C1EOS
    public final String LJIIIZ(int i) {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy == null) {
            return "";
        }
        if (i != 57) {
            if (i != 58) {
                if (i != 60) {
                    if (i != 65) {
                        if (i != 150) {
                            switch (i) {
                            }
                            return "";
                        }
                        return c1277680jLy.LIZLLL(150);
                    }
                    return c1277680jLy.LIZLLL(65);
                }
                return c1277680jLy.LIZLLL(60);
            }
            return c1277680jLy.LIZLLL(58);
        }
        return c1277680jLy.LIZLLL(57);
    }

    @Override // X.C1EOS
    public final void LJJII(InterfaceC1279680jPC interfaceC1279680jPC) {
        this.LLILLJJLI = interfaceC1279680jPC;
    }

    @Override // X.C1EOS
    public final void LJJIIJZLJL(int i) {
        C1279540jOy c1279540jOy;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null && (c1279540jOy = c1277680jLy.LJJIII) != null) {
            c1279540jOy.LJJLJLI = i;
        }
    }

    @Override // X.C1EOS
    public final void LJJIIZI(C1698870uJJ c1698870uJJ) {
        C1278260jMu c1278260jMu;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            if (c1698870uJJ != null) {
                String str = c1698870uJJ.LJIIZILJ;
                Handler handler = c1277680jLy.LJI;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, new ARunnableS25S1100000_20(c1277680jLy, str, 20));
                }
            }
            C1279660jPA c1279660jPA = c1698870uJJ.LJIJ;
            if (c1279660jPA != null) {
                c1278260jMu = new C1278260jMu();
                c1278260jMu.LIZ = c1279660jPA.LIZ;
                c1278260jMu.LIZIZ = c1279660jPA.LIZIZ;
                c1278260jMu.LIZJ = c1279660jPA.LIZJ;
                c1278260jMu.LIZLLL = c1279660jPA.LIZLLL;
                c1278260jMu.LJFF = c1279660jPA.LJ;
                c1278260jMu.LJ = c1279660jPA.LJFF;
            } else {
                c1278260jMu = null;
            }
            C1277680jLy c1277680jLy2 = this.LL;
            long jLongValue = ((Long) C1480850odf.LIZJ.getLiveGlobalConfig().LIZ(0L, "time_diff_server_and_client")).longValue();
            Handler handler2 = c1277680jLy2.LJI;
            if (handler2 != null) {
                C786410Ut5.LJJZZIII(handler2, new ARunnableS21S0100100_20(jLongValue, c1277680jLy2, 5));
            }
            C1277680jLy c1277680jLy3 = this.LL;
            c1277680jLy3.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Handler handler3 = c1277680jLy3.LJI;
            if (handler3 != null) {
                C786410Ut5.LJJZZIII(handler3, new ARunnableS17S0200100_20(jCurrentTimeMillis, c1277680jLy3, c1278260jMu, 5));
            }
        }
    }

    @Override // X.C1EOS
    public final void LJJJI(boolean z) {
        Handler handler;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null && (handler = c1277680jLy.LJI) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS39S0110000_20(c1277680jLy, z, 16));
        }
    }

    @Override // X.C1EOS
    public final void LJJJJZ(C1698870uJJ c1698870uJJ) {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            if (c1698870uJJ != null) {
                String str = c1698870uJJ.LJIIZILJ;
                Handler handler = c1277680jLy.LJI;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, new ARunnableS25S1100000_20(c1277680jLy, str, 20));
                }
            }
            this.LL.LJ(c1698870uJJ.LJFF, c1698870uJJ.LJI, true);
        }
    }

    @Override // X.C1EOS
    public final void setSurface(Surface surface) {
        Handler handler;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null && surface != null && (handler = c1277680jLy.LJI) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(surface, c1277680jLy, 151));
        }
    }

    @Override // X.C1EOS
    public final void switchResolution(String str) {
        boolean z;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            if (TextUtils.isEmpty(str)) {
                z = false;
            } else {
                c1277680jLy.LJJIIJZLJL = str;
                if (TextUtils.equals(str, "ao")) {
                    Handler handler = c1277680jLy.LJI;
                    if (handler != null) {
                        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1277680jLy, 230));
                    }
                    C1279540jOy c1279540jOy = c1277680jLy.LJJIII;
                    if (c1279540jOy != null) {
                        c1279540jOy.LJI = true;
                    }
                } else {
                    Handler handler2 = c1277680jLy.LJI;
                    if (handler2 != null) {
                        C786410Ut5.LJJZZIII(handler2, new ARunnableS120S0100000_20(c1277680jLy, 227));
                    }
                }
                z = true;
            }
            InterfaceC1279680jPC interfaceC1279680jPC = this.LLILLJJLI;
            if (interfaceC1279680jPC != null) {
                if (!z) {
                    str = null;
                }
                interfaceC1279680jPC.LJJJJI(str);
            }
        }
    }

    @Override // X.C1EOS
    public final void LJIIL(String str, String str2) {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            if (str2 == null) {
                str2 = "";
            }
            c1277680jLy.LJ(str, str2, false);
        }
    }

    @Override // X.C1EOS
    public final void LJIILLIIL(float f, float f2) {
        Handler handler;
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null && (handler = c1277680jLy.LJI) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS6S0100001_20(f, c1277680jLy, 1));
        }
    }

    @Override // X.C1EOS
    public final void LJII(final SurfaceControl surfaceControl, final int i, final int i2) {
        Handler handler;
        final C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null && Build.VERSION.SDK_INT >= 29 && (handler = c1277680jLy.LJI) != null) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jQI
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceControl surfaceControl2;
                    C1280340jQG c1280340jQG;
                    SurfaceControl surfaceControl3;
                    SurfaceControl.Transaction transaction;
                    SurfaceControl.Transaction transactionReparent;
                    SurfaceControl.Transaction bufferSize;
                    SurfaceControl surfaceControl4 = surfaceControl;
                    C1277680jLy c1277680jLy2 = c1277680jLy;
                    int i3 = i;
                    int i4 = i2;
                    C1C7U.LIZ("LyraxPlayerImpl@d373.setSurfaceControl$1L");
                    if (surfaceControl4 != null) {
                        if (c1277680jLy2.LJIIIZ == null) {
                            C1280340jQG c1280340jQG2 = new C1280340jQG();
                            c1277680jLy2.LJIIIZ = c1280340jQG2;
                            if (Build.VERSION.SDK_INT >= 29) {
                                c1280340jQG2.LIZ.lock();
                                if (c1280340jQG2.LIZIZ == null) {
                                    SurfaceControl.Builder builder = new SurfaceControl.Builder();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("SurfaceControlMgr-");
                                    sbLIZ.append(System.currentTimeMillis());
                                    SurfaceControl surfaceControlBuild = builder.setName(C2188811AlT.LIZIZ(sbLIZ)).setBufferSize(0, 0).build();
                                    c1280340jQG2.LIZIZ = surfaceControlBuild;
                                    if (surfaceControlBuild != null) {
                                        c1280340jQG2.LIZJ = new Surface(surfaceControlBuild);
                                    }
                                }
                                c1280340jQG2.LIZ.unlock();
                            }
                        }
                        C1280340jQG c1280340jQG3 = c1277680jLy2.LJIIIZ;
                        if (c1280340jQG3 != null && (surfaceControl2 = c1280340jQG3.LIZIZ) != null && surfaceControl2.isValid() && (c1280340jQG = c1277680jLy2.LJIIIZ) != null && c1280340jQG.LIZIZ != null && i3 >= 0 && i4 >= 0 && surfaceControl4.isValid() && (surfaceControl3 = c1280340jQG.LIZIZ) != null && surfaceControl3.isValid()) {
                            if (c1280340jQG.LIZLLL == null) {
                                c1280340jQG.LIZLLL = new SurfaceControl.Transaction();
                            }
                            c1280340jQG.LIZ.lock();
                            SurfaceControl surfaceControl5 = c1280340jQG.LIZIZ;
                            if (surfaceControl5 != null && (transaction = c1280340jQG.LIZLLL) != null && (transactionReparent = transaction.reparent(surfaceControl5, surfaceControl4)) != null && (bufferSize = transactionReparent.setBufferSize(surfaceControl5, i3, i4)) != null) {
                                bufferSize.setVisibility(surfaceControl5, true);
                            }
                            SurfaceControl.Transaction transaction2 = c1280340jQG.LIZLLL;
                            if (transaction2 != null) {
                                transaction2.apply();
                            }
                            c1280340jQG.LIZ.unlock();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(c1280340jQG);
                            sbLIZ2.append(" reparent finish, width:");
                            sbLIZ2.append(i3);
                            sbLIZ2.append(", height:");
                            sbLIZ2.append(i4);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C1280340jQG c1280340jQG4 = c1277680jLy2.LJIIIZ;
                            Surface surface = c1280340jQG4 != null ? c1280340jQG4.LIZJ : null;
                            c1277680jLy2.LJIIJ = surface;
                            c1277680jLy2.LIZ(surface);
                        }
                    }
                    C1C7U.LIZIZ("LyraxPlayerImpl@d373.setSurfaceControl$1L");
                }
            });
        }
    }

    @Override // X.C1EOS
    public final void LJJIJIIJIL(long j, Surface surface, boolean z) {
        C1277680jLy c1277680jLy = this.LL;
        if (c1277680jLy != null) {
            if (z) {
                Handler handler = c1277680jLy.LJI;
                if (handler != null) {
                    C1283100jUi.LIZIZ(handler, new ARunnableS89S0200000_20(surface, c1277680jLy, 153));
                    return;
                }
                return;
            }
            Handler handler2 = c1277680jLy.LJI;
            if (handler2 == null) {
                return;
            }
            C786410Ut5.LJJZZIII(handler2, new ARunnableS89S0200000_20(surface, c1277680jLy, 154));
        }
    }

    @Override // X.C1EOS
    public final void LJJJLZIJ(long j, InterfaceC1279730jPH interfaceC1279730jPH, ExecutorService executorService, boolean z) {
        if (z && executorService != null && !executorService.isShutdown()) {
            try {
                executorService.submit(new ACallableS425S0100000_20(this, 12)).get(j, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("InterruptedException");
                    return;
                }
                return;
            } catch (ExecutionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("ExecutionException");
                    return;
                }
                return;
            } catch (TimeoutException e3) {
                TryCatchGuardChecker.doCheck(e3);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("TimeoutException");
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("Exception");
                    return;
                }
                return;
            }
        }
        this.LL.getClass();
    }
}
