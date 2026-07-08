package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS16S1300000_20;
import Y.ARunnableS21S0100100_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS4S0110100_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import com.ss.lyrax.ILyraxAudio;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277680jLy {
    public static final /* synthetic */ int LJJIIZ = 0;
    public ILyraxSubscriber LIZ;
    public ILyraxEngine LIZIZ;
    public ILyraxAudio LIZJ;
    public Surface LIZLLL;
    public C1277550jLl LJ;
    public SafeHandlerThread LJFF;
    public Handler LJI;
    public GLThread LJII;
    public Handler LJIIIIZZ;
    public C1280340jQG LJIIIZ;
    public Surface LJIIJ;
    public final C1277700jM0 LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILLIIL;
    public ArrayList<String> LJIIZILJ;
    public ARunnableS120S0100000_20 LJIJ;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public String LJIL;
    public InterfaceC1279380jOi LJJI;
    public LyraxNetworkQualityStats LJJII;
    public final C1279540jOy LJJIII;
    public boolean LJJIIJ;
    public int LJIILL = 10;
    public int LJIJI = -1;
    public int LJJ = 100;
    public EnumC1279390jOj LJJIFFI = EnumC1279390jOj.IDLE;
    public String LJJIIJZLJL = "origin";

    public final void LIZJ() {
        C1280340jQG c1280340jQG = this.LJIIIZ;
        if (c1280340jQG != null) {
            c1280340jQG.LIZ.lock();
            SurfaceControl surfaceControl = c1280340jQG.LIZIZ;
            if (surfaceControl != null) {
                surfaceControl.release();
            }
            Surface surface = c1280340jQG.LIZJ;
            if (surface != null) {
                surface.release();
            }
            c1280340jQG.LIZIZ = null;
            c1280340jQG.LIZJ = null;
            c1280340jQG.LIZ.unlock();
        }
        this.LJIIIZ = null;
        C1277550jLl c1277550jLl = this.LJ;
        if (c1277550jLl != null) {
            c1277550jLl.LIZJ();
        }
        this.LJ = null;
        ILyraxSubscriber iLyraxSubscriber = this.LIZ;
        if (iLyraxSubscriber != null) {
            iLyraxSubscriber.dispose();
        }
        this.LIZ = null;
        ILyraxAudio iLyraxAudio = this.LIZJ;
        if (iLyraxAudio != null) {
            iLyraxAudio.dispose();
        }
        this.LIZJ = null;
        ILyraxEngine iLyraxEngine = this.LIZIZ;
        if (iLyraxEngine != null) {
            iLyraxEngine.dispose();
        }
        this.LIZIZ = null;
    }

    public C1277680jLy(C1277700jM0 c1277700jM0) {
        Handler handler;
        if (!LyraxSoLoadState.isLyraxNativeReady()) {
            return;
        }
        GLThreadManager.setForceUseRealGLVersion(false, true);
        GLThreadManager.setEnableUpGradeGLESVersion(true);
        GLThreadManager.setGLAllocFailListener(new InterfaceC1268500j7A(this) { // from class: X.0jNa
            @Override // X.InterfaceC1268500j7A
            public final void LJ(String str) {
            }
        });
        GLThread gLThreadLIZ = C1271160jBS.LIZ(EnumC1270220j9w.COMMON_GL, "TTLHCommonGLThread");
        this.LJII = gLThreadLIZ;
        gLThreadLIZ.start();
        GLThread gLThread = this.LJII;
        if (gLThread != null) {
            handler = gLThread.getHandler();
        } else {
            handler = null;
        }
        this.LJIIIIZZ = handler;
        SafeHandlerThread safeHandlerThreadLIZIZ = C1271160jBS.LIZIZ();
        this.LJFF = safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ.start();
        SafeHandlerThread safeHandlerThread = this.LJFF;
        this.LJI = safeHandlerThread != null ? safeHandlerThread.getHandler() : null;
        this.LJIIJJI = c1277700jM0;
        this.LJJIII = new C1279540jOy(c1277700jM0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0jOl] */
    public final void LIZ(Surface surface) {
        if (surface == null) {
            return;
        }
        Intrinsics.LJFF(this.LIZLLL, surface);
        this.LIZLLL = surface;
        C1277550jLl c1277550jLl = this.LJ;
        if (c1277550jLl != null) {
            c1277550jLl.LJ(surface);
            return;
        }
        C1277550jLl c1277550jLl2 = new C1277550jLl(this.LJII, this.LJIIIIZZ, new InterfaceC1278300jMy() { // from class: X.0jOl
            @Override // X.InterfaceC1278300jMy
            public final void onFirstFrameRendered() {
                Handler handler;
                C1277680jLy c1277680jLy = this.LIZ;
                ARunnableS120S0100000_20 aRunnableS120S0100000_20 = c1277680jLy.LJIJ;
                if (aRunnableS120S0100000_20 != null && (handler = c1277680jLy.LJI) != null) {
                    handler.removeCallbacks(aRunnableS120S0100000_20);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1277680jLy c1277680jLy2 = this.LIZ;
                Handler handler2 = c1277680jLy2.LJI;
                if (handler2 != null) {
                    C786410Ut5.LJJZZIII(handler2, new ARunnableS21S0100100_20(jCurrentTimeMillis, c1277680jLy2, 9));
                }
            }

            @Override // X.InterfaceC1278300jMy
            public final void LIZIZ() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1277680jLy c1277680jLy = this.LIZ;
                Handler handler = c1277680jLy.LJI;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, new ARunnableS21S0100100_20(jCurrentTimeMillis, c1277680jLy, 8));
                }
            }

            @Override // X.InterfaceC1278300jMy
            public final void LIZLLL() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1277680jLy c1277680jLy = this.LIZ;
                Handler handler = c1277680jLy.LJI;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, new ARunnableS21S0100100_20(jCurrentTimeMillis, c1277680jLy, 10));
                }
            }

            @Override // X.InterfaceC1278300jMy
            public final void LIZ(JSONObject jSONObject) {
                C1277680jLy c1277680jLy = this.LIZ;
                Handler handler = c1277680jLy.LJI;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(jSONObject, c1277680jLy, 152));
                }
            }

            @Override // X.InterfaceC1278300jMy
            public final void LIZJ(int i) {
                C1277680jLy c1277680jLy = this.LIZ;
                Handler handler = c1277680jLy.LJI;
                if (handler != null) {
                    C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(i, c1277680jLy, 17));
                }
            }
        });
        this.LJ = c1277550jLl2;
        c1277550jLl2.LJ(this.LIZLLL);
        ILyraxSubscriber iLyraxSubscriber = this.LIZ;
        if (iLyraxSubscriber == null) {
            return;
        }
        iLyraxSubscriber.addVideoFrameSink(this.LJ, LyraxVideoPixelFormat.UNKNOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String LIZLLL(int i) {
        C1278260jMu c1278260jMu;
        String string;
        if (i != 57) {
            if (i != 58) {
                if (i != 60) {
                    if (i != 65 && i != 150) {
                        if (i != 303) {
                            if (i != 308) {
                                if (i != 313) {
                                    Object objValueOf = null;
                                    if (i != 305) {
                                        if (i != 306) {
                                            if (i != 310) {
                                                if (i != 311) {
                                                    switch (i) {
                                                        case 317:
                                                            break;
                                                        case 318:
                                                            return "origin";
                                                        case 319:
                                                            return String.valueOf(this.LJJIIJ);
                                                        default:
                                                            C1279540jOy c1279540jOy = this.LJJIII;
                                                            if (c1279540jOy == null) {
                                                                return null;
                                                            }
                                                            if (i != 301) {
                                                                if (i != 302) {
                                                                    if (i != 304) {
                                                                        if (i != 307) {
                                                                            if (i != 309) {
                                                                                if (i != 312) {
                                                                                    if (i != 315) {
                                                                                        if (i == 316 && (c1278260jMu = c1279540jOy.LIZ) != null && (string = Long.valueOf(c1278260jMu.LIZJ).toString()) != null) {
                                                                                            return string;
                                                                                        }
                                                                                    } else {
                                                                                        return String.valueOf(c1279540jOy.LJJLIIIJLLLLLLLZ);
                                                                                    }
                                                                                } else {
                                                                                    return String.valueOf(c1279540jOy.LJJLIIIJLJLI);
                                                                                }
                                                                            } else {
                                                                                return c1279540jOy.LJJLIIIJL;
                                                                            }
                                                                        } else {
                                                                            return c1279540jOy.LJJLIIIJJIZ;
                                                                        }
                                                                    } else {
                                                                        return String.valueOf(c1279540jOy.LJJLIIIJJI);
                                                                    }
                                                                } else {
                                                                    C1278260jMu c1278260jMu2 = c1279540jOy.LIZ;
                                                                    if (c1278260jMu2 != null) {
                                                                        objValueOf = Long.valueOf(c1278260jMu2.LJFF);
                                                                    }
                                                                    return String.valueOf(objValueOf);
                                                                }
                                                            } else {
                                                                C1278260jMu c1278260jMu3 = c1279540jOy.LIZ;
                                                                if (c1278260jMu3 != null) {
                                                                    objValueOf = Long.valueOf(c1278260jMu3.LJ);
                                                                }
                                                                return String.valueOf(objValueOf);
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else {
                                                return "origin";
                                            }
                                        } else {
                                            C1277550jLl c1277550jLl = this.LJ;
                                            if (c1277550jLl != null) {
                                                objValueOf = Integer.valueOf(c1277550jLl.LJIILIIL);
                                            }
                                            return String.valueOf(objValueOf);
                                        }
                                    } else {
                                        C1277550jLl c1277550jLl2 = this.LJ;
                                        if (c1277550jLl2 != null) {
                                            objValueOf = Integer.valueOf(c1277550jLl2.LJIIL);
                                        }
                                        return String.valueOf(objValueOf);
                                    }
                                }
                            } else {
                                return "rtc";
                            }
                        } else {
                            return this.LJJIIJZLJL;
                        }
                    }
                } else {
                    return "rtc";
                }
            } else {
                return "origin";
            }
        }
        return "";
    }

    public final void LJFF(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Handler handler = this.LJI;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS4S0110100_20(this, z, jCurrentTimeMillis, 1));
        }
    }

    public static C1279690jPD LIZIZ(int i, LyraxNetworkQualityStats lyraxNetworkQualityStats) {
        if (lyraxNetworkQualityStats != null) {
            return new C1279690jPD(i, lyraxNetworkQualityStats.rxQuality.value(), lyraxNetworkQualityStats.totalBandwidth, lyraxNetworkQualityStats.rtt, (int) (lyraxNetworkQualityStats.fractionLost * ((double) 100)), lyraxNetworkQualityStats.jitter, lyraxNetworkQualityStats.timestamp_ms);
        }
        return new C1279690jPD(i, 0, 0, 0, 0, 0, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.String] */
    public final boolean LJ(String str, String str2, boolean z) {
        long j;
        String strOptString;
        C1279540jOy c1279540jOy;
        if (TextUtils.isEmpty(str)) {
            C1279540jOy c1279540jOy2 = this.LJJIII;
            if (c1279540jOy2 != null) {
                c1279540jOy2.LIZIZ(EnumC1279610jP5.LyraxPlayerPullLocation_Init, EnumC1277970jMR.DATA_SOURCE_INVALID.value());
            }
            return false;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject, "common"), "rtp_token_map");
            Iterator<String> itKeys = jSONObject2.keys();
            if (itKeys.hasNext()) {
                ?? next = itKeys.next();
                c259800zU.element = next;
                c259800zU2.element = JSONObjectProtectorUtils.getString(jSONObject2, (String) next);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("common");
            if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("session_id")) != null && strOptString.length() != 0 && (c1279540jOy = this.LJJIII) != null) {
                c1279540jOy.LJIIIZ = strOptString;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!TextUtils.isEmpty((CharSequence) c259800zU.element) && !TextUtils.isEmpty((CharSequence) c259800zU2.element)) {
            if (TextUtils.equals(this.LJIILIIL, (CharSequence) c259800zU.element) && TextUtils.equals(this.LJIILJJIL, (CharSequence) c259800zU2.element)) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                j = jCurrentTimeMillis;
            } else {
                j = 0;
            }
            C1279540jOy c1279540jOy3 = this.LJJIII;
            if (c1279540jOy3 != null) {
                if (j > 0) {
                    c1279540jOy3.LJJ = j;
                } else {
                    c1279540jOy3.LJJ = 0L;
                }
                if (jCurrentTimeMillis > 0) {
                    c1279540jOy3.LJIL = jCurrentTimeMillis;
                    c1279540jOy3.LJLIIIL = "player_init_start";
                }
            }
            String str3 = (String) c259800zU.element;
            this.LJIILIIL = str3;
            this.LJIILJJIL = (String) c259800zU2.element;
            if (c1279540jOy3 != null) {
                c1279540jOy3.LJIIJJI = str3;
            }
            Handler handler = this.LJI;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS16S1300000_20(c259800zU2, this, c259800zU, str2, 5));
            }
            return true;
        }
        C1279540jOy c1279540jOy4 = this.LJJIII;
        if (c1279540jOy4 != null) {
            c1279540jOy4.LIZIZ(EnumC1279610jP5.LyraxPlayerPullLocation_Init, EnumC1277970jMR.TOKEN_INVALID.value());
        }
        return false;
    }
}
