package X;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.android.livesdkapi.host.IHostPullStreamTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1EOR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EOR extends C1EOQ {
    public final String LJFF;
    public final C1EOU LJI;

    @Override // X.C1EOQ, X.InterfaceC1279680jPC
    public final void LJI() {
        this.LJI.LJJIJIIJIL = false;
        super.LJI();
    }

    @Override // X.C1EOQ, X.InterfaceC1279680jPC
    public final void LJIIJ() {
        this.LJI.LJJIJIIJIL = true;
        super.LJIIJ();
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final InterfaceC1488100opM LJIILIIL() {
        return new InterfaceC1488100opM() { // from class: X.1EOT
            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LIZJ(String str) {
            }

            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LJIJI(String str) {
            }

            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LJIL(C587000N0o c587000N0o) {
            }

            @Override // X.InterfaceC1488100opM
            public final /* synthetic */ void LJJI(C587000N0o c587000N0o) {
            }

            @Override // X.InterfaceC1488100opM
            public final void LIZLLL() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJJJJZI(true);
                    C1EOU c1eou = c1eor.LJI;
                    c1eou.LJJIIJZLJL = Boolean.TRUE;
                    c1eou.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void mute() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.mute();
                    C1EOU c1eou = c1eor.LJI;
                    c1eou.LJIL = Boolean.TRUE;
                    c1eou.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void unmute() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJIIIIZZ();
                    C1EOU c1eou = c1eor.LJI;
                    c1eou.LJIL = Boolean.FALSE;
                    c1eou.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIIJ(int i) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZJ = i;
                    c1eor.LIZIZ.LJJIIJZLJL(i);
                    c1eor.LJI.LJJIII = Integer.valueOf(i);
                    c1eor.LJI.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIIZILJ(boolean z) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJJJI(z);
                    c1eor.LJI.LJJIIJ = Boolean.valueOf(z);
                    c1eor.LJI.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIJ(int i) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJIJ(i);
                    c1eor.LJI.LJJIIZ = Integer.valueOf(i);
                    c1eor.LJI.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIJJ(String str) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJJIJIIJI(str);
                    C1EOU c1eou = c1eor.LJI;
                    c1eou.LJJII = str;
                    c1eou.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJJ(int i) {
                C1EOR c1eor = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[LowLatency] configLiveLowLatencyMode:");
                sbLIZ.append(i);
                c1eor.LJJLL(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LJI.LJ();
                try {
                    C1EOU c1eou = this.LIZ.LJI;
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    c1eou.LIZJ = z;
                    boolean zLIZ = c1eou.LIZ();
                    C1EOR c1eor2 = this.LIZ;
                    C1EOU c1eou2 = c1eor2.LJI;
                    if (zLIZ != c1eou2.LIZLLL) {
                        c1eor2.LJJZ(c1eou2.LIZ());
                    }
                    this.LIZ.LJI.LJFF();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.LJI.LJFF();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJJIFFI(C1491030ou5 c1491030ou5) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJJJ(c1491030ou5);
                    C1491050ou7 c1491050ou7 = C1491040ou6.LJIIIZ;
                    c1eor.LJJLL("[LowLatency] set external player builder");
                    C1EOU c1eou = c1eor.LJI;
                    c1eou.LJ = c1491050ou7;
                    c1eou.LJJ = c1491030ou5;
                    c1eou.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIILLIIL(float f, float f2) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJIILLIIL(f, f2);
                    c1eor.LJI.LJIJJ = Float.valueOf(f);
                    c1eor.LJI.LJIJJLI = Float.valueOf(f2);
                    c1eor.LJI.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1488100opM
            public final void LJIJJLI(boolean z, boolean z2) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.LJJIL(z, z2);
                    c1eor.LJI.LJJI = Boolean.valueOf(z);
                    c1eor.LJI.LJJIFFI = Boolean.valueOf(z2);
                    c1eor.LJI.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }
        };
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final List<String> LJIJJ() {
        this.LJI.LIZIZ();
        try {
            List<String> listLJIJJ = super.LJIJJ();
            this.LJI.LIZJ();
            return listLJIJJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJ() {
        this.LJI.LIZIZ();
        try {
            super.LJJ();
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final int LJJI() {
        this.LJI.LIZIZ();
        try {
            int iLJJI = super.LJJI();
            this.LJI.LIZJ();
            return iLJJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final boolean LJJIFFI() {
        this.LJI.LIZIZ();
        try {
            boolean zLJJIFFI = super.LJJIFFI();
            this.LJI.LIZJ();
            return zLJJIFFI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1279680jPC
    public final void LJJJJ() {
        C1EOU c1eou = this.LJI;
        if (c1eou.LJJIJ) {
            return;
        }
        c1eou.LJJIJ = true;
        super.LJJJJ();
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJJJLL() {
        this.LJI.LIZIZ();
        this.LJI.LIZJ();
    }

    @Override // X.C1EOQ, X.InterfaceC1483520ohy
    public final InterfaceC1483510ohx LJJJJZI() {
        return new InterfaceC1483510ohx() { // from class: X.1EOM
            @Override // X.InterfaceC1483510ohx
            public final /* synthetic */ boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1483510ohx
            public final Map<String, Object> LIZ() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    C1698870uJJ c1698870uJJ = c1eor.LIZLLL;
                    if (c1698870uJJ == null) {
                        c1eor.LJI.LIZJ();
                        return null;
                    }
                    HashMap map = new HashMap();
                    String str = c1698870uJJ.LJIIL;
                    if (str == null) {
                        str = "unknown";
                    }
                    map.put("create_enter_method", str);
                    String str2 = c1698870uJJ.LJIILIIL;
                    if (str2 == null) {
                        str2 = "unknown";
                    }
                    map.put("enter_method", str2);
                    String str3 = c1698870uJJ.LJIILJJIL;
                    map.put("enter_action", str3 != null ? str3 : "unknown");
                    map.put("pre_play_type", Integer.valueOf(c1698870uJJ.LJIILL));
                    map.put("unique_id", c1eor.LIZ);
                    map.put("bg_player_mode", Integer.valueOf(c1eor.LIZJ));
                    map.put("is_mute", c1eor.LIZIZ.LJIIIZ(319));
                    c1eor.LJI.LIZJ();
                    return map;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean LJJIJIIJIL() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    boolean z = c1eor.LIZIZ.LIZJ() == EnumC1279670jPB.STOPPED;
                    c1eor.LJI.LIZJ();
                    return z;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean isPlaying() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    boolean z = c1eor.LIZIZ.LIZJ() == EnumC1279670jPB.PLAYED;
                    c1eor.LJI.LIZJ();
                    return z;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1483510ohx
            public final void pause() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.pause();
                    c1eor.LJI.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1483510ohx
            public final void release() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    c1eor.LIZIZ.release();
                    c1eor.LJI.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }
        };
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final InterfaceC1699280uJy LJJLIIJ() {
        return new InterfaceC1699280uJy() { // from class: X.1EOO
            @Override // X.InterfaceC1699280uJy
            public final EnumC1279670jPB LIZJ() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    EnumC1279670jPB enumC1279670jPBLIZJ = c1eor.LIZIZ.LIZJ();
                    if (enumC1279670jPBLIZJ == null) {
                        enumC1279670jPBLIZJ = EnumC1279670jPB.IDLE;
                    }
                    c1eor.LJI.LIZJ();
                    return enumC1279670jPBLIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final boolean LJFF() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    boolean zLJFF = c1eor.LIZIZ.LJFF();
                    c1eor.LJI.LIZJ();
                    return zLJFF;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final Surface LJIIJJI() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    Surface surfaceLJIIJJI = c1eor.LIZIZ.LJIIJJI();
                    c1eor.LJI.LIZJ();
                    return surfaceLJIIJJI;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final JSONObject LJIIZILJ() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    JSONObject jSONObjectLJIIZILJ = c1eor.LIZIZ.LJIIZILJ();
                    c1eor.LJI.LIZJ();
                    return jSONObjectLJIIZILJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final long LJIJJLI() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    long jLJIJJLI = c1eor.LIZIZ.LJIJJLI();
                    c1eor.LJI.LIZJ();
                    return jLJIJJLI;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final Bitmap LJIL() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    Bitmap bitmapLJIL = c1eor.LIZIZ.LJIL();
                    c1eor.LJI.LIZJ();
                    return bitmapLJIL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final long getBitrate() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    long bitrate = c1eor.LIZIZ.getBitrate();
                    c1eor.LJI.LIZJ();
                    return bitrate;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final String getCurrentResolution() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    String currentResolution = c1eor.LIZIZ.getCurrentResolution();
                    if (currentResolution == null) {
                        currentResolution = "";
                    }
                    c1eor.LJI.LIZJ();
                    return currentResolution;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final JSONObject getFirstFrameBlockInfo() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    JSONObject firstFrameBlockInfo = c1eor.LIZIZ.getFirstFrameBlockInfo();
                    c1eor.LJI.LIZJ();
                    return firstFrameBlockInfo;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final int getHeight() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    int height = c1eor.LIZIZ.getHeight();
                    c1eor.LJI.LIZJ();
                    return height;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final C1281010jRL getNetworkState() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    C1281010jRL networkState = c1eor.LIZIZ.getNetworkState();
                    c1eor.LJI.LIZJ();
                    return networkState;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final int getWidth() {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    int width = c1eor.LIZIZ.getWidth();
                    c1eor.LJI.LIZJ();
                    return width;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }

            @Override // X.InterfaceC1699280uJy
            public final String LJIIIZ(int i) {
                C1EOR c1eor = this.LIZ;
                c1eor.LJI.LIZIZ();
                try {
                    String strLJIIIZ = c1eor.LIZIZ.LJIIIZ(i);
                    if (strLJIIIZ == null) {
                        strLJIIIZ = "";
                    }
                    c1eor.LJI.LIZJ();
                    return strLJIIIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1eor.LJI.LIZJ();
                    throw th;
                }
            }
        };
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJLJ() {
        this.LJI.LIZIZ();
        this.LJI.LIZJ();
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void pause() {
        this.LJI.LIZIZ();
        try {
            this.LJI.LJFF = EnumC1279670jPB.PAUSED;
            super.pause();
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void reset() {
        this.LJI.LIZIZ();
        try {
            this.LJI.LJFF = EnumC1279670jPB.STOPPED;
            super.reset();
            this.LJI.LIZLLL();
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void stop() {
        this.LJI.LIZIZ();
        try {
            this.LJI.LJFF = EnumC1279670jPB.STOPPED;
            super.stop();
            C1EOU c1eou = this.LJI;
            c1eou.LJJIJ = false;
            c1eou.LJJIJIIJI = false;
            c1eou.LJJIJIIJIL = false;
            c1eou.LJJIJIL = null;
            c1eou.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    public C1EOR(String str) {
        super(str);
        this.LJFF = "TTKLivePlayer_PlayerImplLiveSupportLowLatency";
        this.LJI = new C1EOU();
        this.LIZIZ.LJJIIJ();
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LIZ(boolean z) {
        this.LJI.LIZIZ();
        try {
            this.LIZIZ.LIZ(z);
            this.LJI.LJJIIZI = Boolean.valueOf(z);
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        C1698870uJJ c1698870uJJLJIIIZ;
        this.LJI.LIZIZ();
        try {
            this.LJI.LJFF = EnumC1279670jPB.PLAYED;
            if (interfaceC1479620obg != null && (c1698870uJJLJIIIZ = interfaceC1479620obg.LJIIIZ()) != null) {
                c1698870uJJLJIIIZ.LJIJ = this.LJI.LJJIJIL;
            }
            super.LJ(interfaceC1479620obg);
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1279680jPC
    public final void LJIJI(boolean z) {
        if (z) {
            C1EOU c1eou = this.LJI;
            if (c1eou.LJJIJIIJI && c1eou.LJJIJIIJIL) {
                LJJLL("[LowLatency] stall end due to firstframe");
                super.LJI();
                this.LJI.LJJIJIIJIL = false;
                LJJLL("[LowLatency] skip onFirstFrame");
                return;
            }
            LJJLL("[LowLatency] onFirstFrame");
            this.LJI.LJJIJIIJI = true;
        }
        super.LJIJI(z);
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJIIJ(EnumC1490990ou1 enumC1490990ou1) {
        this.LJI.LIZIZ();
        try {
            super.LJJIIJ(enumC1490990ou1);
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJIL(String str) {
        this.LJI.LIZIZ();
        try {
            super.LJJIL(str);
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJJIL(InterfaceC1479620obg interfaceC1479620obg) {
        C1698870uJJ c1698870uJJLJIIIZ;
        boolean zLJJIIZI;
        this.LJI.LJFF = EnumC1279670jPB.PREPARING;
        if (interfaceC1479620obg != null && (c1698870uJJLJIIIZ = interfaceC1479620obg.LJIIIZ()) != null) {
            this.LJI.LJ();
            try {
                C1EOU c1eou = this.LJI;
                String str = c1698870uJJLJIIIZ.LJFF;
                if (str != null) {
                    zLJJIIZI = a0.LJJIIZI(str, "\"rtp_token_map\":{\"", false);
                } else {
                    zLJJIIZI = false;
                }
                c1eou.LIZIZ = zLJJIIZI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[LowLatency] switchPlayerIfNecessaryFromPrepare, mDataSourceSupportLowLatency:");
                sbLIZ.append(this.LJI.LIZIZ);
                LJJLL(C2188811AlT.LIZIZ(sbLIZ));
                if (this.LJI.LIZIZ && ((Boolean) C1474810oTv.o6.getValue()).booleanValue()) {
                    if (!this.LJI.LIZJ) {
                        LJJLL("[LowLatency] auto enable low latency mode from prepareNext");
                    }
                    this.LJI.LIZJ = true;
                }
                C1EOU c1eou2 = this.LJI;
                c1eou2.getClass();
                c1eou2.LJI = EnumC1487020onc.PREPARE;
                this.LIZLLL = c1698870uJJLJIIIZ;
                boolean zLIZ = this.LJI.LIZ();
                C1EOU c1eou3 = this.LJI;
                if (zLIZ != c1eou3.LIZLLL) {
                    boolean zLJJZ = LJJZ(c1eou3.LIZ());
                    this.LJI.LJFF();
                    if (zLJJZ) {
                        this.LIZLLL = c1698870uJJLJIIIZ;
                        return;
                    }
                } else {
                    c1eou3.LJFF();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJI.LJFF();
                throw th;
            }
        }
        this.LJI.LIZIZ();
        super.LJJJIL(interfaceC1479620obg);
        C1EOU c1eou4 = this.LJI;
        c1eou4.getClass();
        c1eou4.LJI = EnumC1487020onc.PREPARE;
        this.LJI.LIZJ();
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final int LJJJJIZL(int i) {
        this.LJI.LIZIZ();
        try {
            int iLJJJJIZL = super.LJJJJIZL(i);
            this.LJI.LIZJ();
            return iLJJJJIZL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJJJL(boolean z) {
        this.LJI.LIZIZ();
        try {
            super.LJJJJL(z);
            this.LJI.LJIJI = Boolean.valueOf(z);
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJL(C1699080uJe c1699080uJe) {
        this.LJI.LJ();
        try {
            boolean zLJJZ = false;
            this.LJI.LIZIZ = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[LowLatency] switchPlayerIfNecessaryFromURL, mDataSourceSupportLowLatency:");
            sbLIZ.append(this.LJI.LIZIZ);
            LJJLL(C2188811AlT.LIZIZ(sbLIZ));
            C1EOU c1eou = this.LJI;
            if (c1eou.LIZLLL) {
                zLJJZ = LJJZ(false);
                c1eou = this.LJI;
            }
            c1eou.LJFF();
            if (zLJJZ) {
                return;
            }
            this.LJI.LIZIZ();
            super.LJJL(c1699080uJe);
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LJFF();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJLIIIJLLLLLLLZ(Surface surface) {
        this.LJI.LIZIZ();
        try {
            super.LJJLIIIJLLLLLLLZ(surface);
            C1EOU c1eou = this.LJI;
            c1eou.getClass();
            c1eou.LJIIIZ = EnumC1487030ond.SETSURFACE;
            c1eou.LJIILIIL = surface;
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1279680jPC
    public final void LJJLIL(C1284720jXK c1284720jXK) {
        this.LJI.LJ();
        LJJLL("[LowLatency] onError");
        if (this.LJI.LIZLLL) {
            LJJZ(false);
        }
        this.LJI.LJFF();
        super.LJJLIL(c1284720jXK);
    }

    @Override // X.C1EOQ
    public final void LJJLL(String str) {
        if (C1481110oe5.LIZ) {
            String str2 = this.LJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" <===> ttk hash:");
            sbLIZ.append(this.LIZIZ.hashCode());
            sbLIZ.append(", uniqueId:");
            sbLIZ.append(this.LIZ);
            C1481110oe5.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final boolean LJJZ(boolean z) {
        C1EOS c1eosLIZ;
        float fFloatValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LowLatency] switchPlayer:");
        sbLIZ.append(z);
        LJJLL(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[LowLatency] current player state before switching:");
        sbLIZ2.append(this.LJI.LJFF.name());
        LJJLL(C2188811AlT.LIZIZ(sbLIZ2));
        if (z) {
            LJJLL("[LowLatency] create low latency player");
            c1eosLIZ = null;
            if (this.LJI.LJ == null) {
                LJJLL("[LowLatency] no external player builder, switch fail");
            } else {
                String str = this.LIZ;
                IHostPullStreamTool iHostPullStreamTool = (IHostPullStreamTool) C1161920gLG.LIZJ(IHostPullStreamTool.class);
                if (iHostPullStreamTool == null || (iHostPullStreamTool.cd(null) && iHostPullStreamTool.ni())) {
                    c1eosLIZ = new C1279640jP8(str);
                }
            }
        } else {
            LJJLL("[LowLatency] create live player");
            InterfaceC1699170uJn interfaceC1699170uJn = (InterfaceC1699170uJn) C1126604au.LIZ("com.ss.videoarch.liveplayer.player.LivePlayerServiceImpl");
            if (interfaceC1699170uJn != null) {
                c1eosLIZ = interfaceC1699170uJn.LIZ();
                c1eosLIZ.LJJIIJ();
            } else {
                throw new IllegalStateException("cannot find match live player service, please check your code !");
            }
        }
        boolean zBooleanValue = false;
        if (c1eosLIZ == null) {
            LJJLL("[LowLatency] failed to create player, switch fail");
            return false;
        }
        C1279660jPA c1279660jPALJJJJIZL = this.LIZIZ.LJJJJIZL();
        if (c1279660jPALJJJJIZL != null) {
            this.LJI.LJJIJIL = c1279660jPALJJJJIZL;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[LowLatency] logContext before switch: ");
        Object obj = this.LJI.LJJIJIL;
        if (obj == null) {
            obj = "none";
        }
        sbLIZ3.append(obj);
        LJJLL(C2188811AlT.LIZIZ(sbLIZ3));
        this.LIZIZ.LJJJJI();
        if (z) {
            LJJLL("[LowLatency] releaseLivePlayer");
            this.LIZIZ.LJIILL();
        } else {
            LJJLL("[LowLatency] releaseLowLatencyPlayer");
            this.LIZIZ.LJIILL();
        }
        C1279660jPA c1279660jPA = this.LJI.LJJIJIL;
        if (c1279660jPA != null) {
            c1279660jPA.LIZLLL = System.currentTimeMillis();
        }
        this.LIZIZ = c1eosLIZ;
        c1eosLIZ.LJJII(this);
        C1EOU c1eou = this.LJI;
        c1eou.LIZLLL = z;
        EnumC1487020onc enumC1487020onc = c1eou.LJI;
        if (enumC1487020onc == EnumC1487020onc.STREAMDATA) {
            this.LIZIZ.LJIIL(c1eou.LJII, c1eou.LJIIIIZZ);
        } else if (enumC1487020onc == EnumC1487020onc.PREPARE) {
            this.LIZIZ.LJJJJZ(this.LIZLLL);
        }
        LJJLL("[LowLatency] mute");
        this.LIZIZ.mute();
        Boolean bool = this.LJI.LJIJI;
        if (bool != null) {
            this.LIZIZ.LJIILIIL(bool.booleanValue());
        }
        InterfaceC1279750jPJ interfaceC1279750jPJ = this.LJI.LJJ;
        if (interfaceC1279750jPJ != null) {
            this.LIZIZ.LJJJ(interfaceC1279750jPJ);
        }
        Boolean bool2 = this.LJI.LJJI;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            C1EOS c1eos = this.LIZIZ;
            Boolean bool3 = this.LJI.LJJIFFI;
            if (bool3 != null) {
                zBooleanValue = bool3.booleanValue();
            }
            c1eos.LJJIL(zBooleanValue2, zBooleanValue);
        }
        this.LJI.getClass();
        String str2 = this.LJI.LJJII;
        if (str2 != null) {
            this.LIZIZ.LJJIJIIJI(str2);
        }
        Integer num = this.LJI.LJJIII;
        if (num != null) {
            this.LIZIZ.LJJIIJZLJL(num.intValue());
        }
        Boolean bool4 = this.LJI.LJJIIJ;
        if (bool4 != null) {
            this.LIZIZ.LJJJI(bool4.booleanValue());
        }
        Integer num2 = this.LJI.LJJIIZ;
        if (num2 != null) {
            this.LIZIZ.LJIJ(num2.intValue());
        }
        if (this.LJI.LJFF == EnumC1279670jPB.PLAYED) {
            LJJLL("[LowLatency] resume to play state");
            C1698870uJJ c1698870uJJ = this.LIZLLL;
            if (c1698870uJJ != null) {
                c1698870uJJ.LJIJ = this.LJI.LJJIJIL;
            }
            this.LIZIZ.LJJIIZI(c1698870uJJ);
        }
        Boolean bool5 = this.LJI.LJJIIJZLJL;
        if (bool5 != null) {
            this.LIZIZ.LJJJJZI(bool5.booleanValue());
        }
        Float f = this.LJI.LJIJJ;
        if (f != null) {
            float fFloatValue2 = f.floatValue();
            C1EOS c1eos2 = this.LIZIZ;
            Float f2 = this.LJI.LJIJJLI;
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            c1eos2.LJIILLIIL(fFloatValue2, fFloatValue);
        }
        Boolean bool6 = this.LJI.LJJIIZI;
        if (bool6 != null) {
            this.LIZIZ.LIZ(bool6.booleanValue());
        }
        C1EOU c1eou2 = this.LJI;
        EnumC1487030ond enumC1487030ond = c1eou2.LJIIIZ;
        if (enumC1487030ond == EnumC1487030ond.SETSURFACECONTROL) {
            this.LIZIZ.LJII(c1eou2.LJIIJ, c1eou2.LJIIJJI, c1eou2.LJIIL);
        } else if (enumC1487030ond == EnumC1487030ond.SETSURFACE) {
            this.LIZIZ.setSurface(c1eou2.LJIILIIL);
        } else if (enumC1487030ond == EnumC1487030ond.SETSURFACEWITHTIMEOUT) {
            this.LIZIZ.LJJIJIIJIL(c1eou2.LJIILJJIL, c1eou2.LJIILIIL, c1eou2.LJIILL);
        } else if (enumC1487030ond == EnumC1487030ond.SETSURFACETEXTURE) {
            this.LIZIZ.LJJJLZIJ(c1eou2.LJIILJJIL, c1eou2.LJIJ, c1eou2.LJIILLIIL, c1eou2.LJIIZILJ);
        }
        if (Intrinsics.LJFF(this.LJI.LJIL, Boolean.FALSE)) {
            LJJLL("[LowLatency] unmute");
            this.LIZIZ.LJIIIIZZ();
            return true;
        }
        return true;
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final int getAudioDuckingDurationForLive(int i) {
        this.LJI.LIZIZ();
        try {
            int audioDuckingDurationForLive = super.getAudioDuckingDurationForLive(i);
            this.LJI.LIZJ();
            return audioDuckingDurationForLive;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJIJIL(String str, String str2) {
        boolean zLJJIIZI;
        this.LJI.LJ();
        try {
            C1EOU c1eou = this.LJI;
            if (str != null) {
                zLJJIIZI = a0.LJJIIZI(str, "\"rtp_token_map\":{\"", false);
            } else {
                zLJJIIZI = false;
            }
            c1eou.LIZIZ = zLJJIIZI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[LowLatency] switchPlayerIfNecessaryFromStreamData, mDataSourceSupportLowLatency:");
            sbLIZ.append(this.LJI.LIZIZ);
            LJJLL(C2188811AlT.LIZIZ(sbLIZ));
            C1EOU c1eou2 = this.LJI;
            c1eou2.getClass();
            EnumC1487020onc enumC1487020onc = EnumC1487020onc.STREAMDATA;
            c1eou2.LJI = enumC1487020onc;
            c1eou2.LJII = str;
            c1eou2.LJIIIIZZ = str2;
            boolean zLIZ = this.LJI.LIZ();
            C1EOU c1eou3 = this.LJI;
            if (zLIZ != c1eou3.LIZLLL) {
                boolean zLJJZ = LJJZ(c1eou3.LIZ());
                this.LJI.LJFF();
                if (zLJJZ) {
                    return;
                }
            } else {
                c1eou3.LJFF();
            }
            this.LJI.LIZIZ();
            super.LJJIJIL(str, str2);
            C1EOU c1eou4 = this.LJI;
            c1eou4.getClass();
            c1eou4.LJI = enumC1487020onc;
            c1eou4.LJII = str;
            c1eou4.LJIIIIZZ = str2;
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LJFF();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJJJLI(String str, boolean z) {
        this.LJI.LJFF = EnumC1279670jPB.STOPPED;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sync: ");
        sbLIZ.append(z);
        sbLIZ.append(", playerTag: ");
        sbLIZ.append(str);
        LJJLL(C2188811AlT.LIZIZ(sbLIZ));
        this.LJI.LIZIZ();
        try {
            if (this.LJI.LIZLLL) {
                LJJLL("[LowLatency] releaseLowLatencyPlayer");
                this.LIZIZ.LJIILL();
            } else {
                LJJLL("[LowLatency] releaseLivePlayer");
                if (z) {
                    this.LIZIZ.release();
                } else {
                    this.LIZIZ.LJIILL();
                }
            }
            this.LJI.LIZLLL();
            this.LJI.LIZJ();
            C1479990ocH.LIZ.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZLLL();
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final int LJJJJZ(C1699290uJz c1699290uJz, C1699370uK7 c1699370uK7) {
        this.LJI.LIZIZ();
        try {
            int iLJJJJZ = super.LJJJJZ(c1699290uJz, c1699370uK7);
            this.LJI.LIZJ();
            return iLJJJJZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final int LJJLIIIIJ(int i, byte[] bArr) {
        this.LJI.LIZIZ();
        try {
            int iLJJLIIIIJ = super.LJJLIIIIJ(i, bArr);
            this.LJI.LIZJ();
            return iLJJLIIIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1279680jPC
    public final void onVideoSizeChanged(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LowLatency] onVideoSizeChanged, ");
        sbLIZ.append(i);
        sbLIZ.append(" x ");
        sbLIZ.append(i2);
        LJJLL(C2188811AlT.LIZIZ(sbLIZ));
        super.onVideoSizeChanged(i, i2);
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJII(SurfaceControl surfaceControl, int i, int i2) {
        this.LJI.LIZIZ();
        try {
            super.LJII(surfaceControl, i, i2);
            C1EOU c1eou = this.LJI;
            c1eou.getClass();
            c1eou.LJIIIZ = EnumC1487030ond.SETSURFACECONTROL;
            c1eou.LJIIJ = surfaceControl;
            c1eou.LJIIJJI = i;
            c1eou.LJIIL = i2;
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJIIJZLJL(long j, Surface surface, boolean z) {
        this.LJI.LIZIZ();
        try {
            super.LJJIIJZLJL(j, surface, z);
            C1EOU c1eou = this.LJI;
            c1eou.getClass();
            c1eou.LJIIIZ = EnumC1487030ond.SETSURFACEWITHTIMEOUT;
            c1eou.LJIILIIL = surface;
            c1eou.LJIILJJIL = j;
            c1eou.LJIILL = z;
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }

    @Override // X.C1EOQ, X.InterfaceC1484830ok5
    public final void LJJJLL(long j, C1699310uK1 c1699310uK1, ExecutorService executorService, boolean z) {
        this.LJI.LIZIZ();
        try {
            super.LJJJLL(j, c1699310uK1, executorService, z);
            C1EOU c1eou = this.LJI;
            c1eou.getClass();
            c1eou.LJIIIZ = EnumC1487030ond.SETSURFACETEXTURE;
            c1eou.LJIILLIIL = executorService;
            c1eou.LJIIZILJ = z;
            c1eou.LJIILJJIL = j;
            c1eou.LJIJ = c1699310uK1;
            this.LJI.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LIZJ();
            throw th;
        }
    }
}
