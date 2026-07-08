package X;

import android.content.Context;
import android.os.Message;
import android.view.Surface;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.s0;
import fyo.e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471190oO5 implements InterfaceC1467780oIa, InterfaceC1469360oL8 {
    public volatile TTVideoEngine LL;
    public final Context LLILLL;
    public final C1471230oO9 LLILZ;
    public InterfaceC1469360oL8 LLILZIL;
    public InterfaceC1467780oIa LLILZLL;
    public InterfaceC1467770oIZ LLIZ;
    public InterfaceC1471260oOC LLIZLLLIL;
    public C1473600oRy LLJI;
    public final Object LLILLJJLI = new Object();
    public int LLJIJIL = -1;
    public volatile boolean LLJILJIL = false;
    public boolean LLJILJILJ = false;
    public boolean LLJILLL = false;
    public boolean LLJJ = false;
    public boolean LLJJI = false;
    public boolean LLJJIII = false;
    public final C1471250oOB LLJJIJI = new s0() { // from class: X.0oOB
        @Override // cxo.s0
        public final void LJII(boolean z) {
            if (!z) {
                C1471190oO5 c1471190oO5 = this.LL;
                if (c1471190oO5.LLJIJIL != -1) {
                    c1471190oO5.LL.LLILII(this.LL.LLJIJIL);
                    this.LL.LLJIJIL = -1;
                }
                this.LL.LJII(true);
                return;
            }
            this.LL.LJII(z);
        }
    };
    public final WeakHandler.IHandler LLJJIJIIJIL = new WeakHandler.IHandler() { // from class: X.0oO6
        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            int i;
            C1471190oO5 c1471190oO5;
            InterfaceC1469360oL8 interfaceC1469360oL8;
            C1473690oS7 c1473690oS7;
            if (message.what == 201) {
                C1471190oO5 c1471190oO52 = this.LL;
                C1471230oO9 c1471230oO9 = c1471190oO52.LLILZ;
                if (c1471230oO9 == null || (c1473690oS7 = c1471230oO9.LJIILIIL) == null || (i = c1473690oS7.LJIIIZ) <= 0) {
                    i = 167;
                }
                if (c1471190oO52.LL != null) {
                    if (HandlerHook.getMessageObj(message.obj) != null) {
                        ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue();
                    }
                    int iLJJJIL = this.LL.LL.LJJJIL();
                    if (this.LL.LL.LJJJJL() > 0 && (interfaceC1469360oL8 = (c1471190oO5 = this.LL).LLILZIL) != null) {
                        interfaceC1469360oL8.LJJJJJ(c1471190oO5.LL, iLJJJIL);
                    }
                }
                C1471190oO5 c1471190oO53 = this.LL;
                if ((c1471190oO53.LLJILJILJ && c1471190oO53.LL != null && c1471190oO53.LL.LIZ.LJIILL == 0) || !this.LL.LIZLLL()) {
                    return;
                }
                this.LL.LLJJIJIL.sendMessageDelayed(this.LL.LLJJIJIL.obtainMessage(201), i);
            }
        }
    };
    public final WeakHandler LLJJIJIL = new WeakHandler(this.LLJJIJIIJIL);
    public final s LLJ = new s();

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJIIJ(int i, int i2) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJIJ(Map map) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
    }

    @Override // X.InterfaceC1469360oL8
    public final /* synthetic */ void LJJLIIIIJ(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            android.content.Context r0 = r5.LLILLL
            r4 = 1
            com.ss.ttvideoengine.TTVideoEngine.LLIL(r0, r4)
            com.ss.ttvideoengine.TTVideoEngine r0 = r5.LL
            if (r0 != 0) goto L66
            X.0WPS r0 = X.C0WPS.instance
            r1 = 2
            r0.setLoggerVersion(r1)
            X.0oOC r0 = r5.LLIZLLLIL
            r3 = 0
            if (r0 == 0) goto L67
            int r0 = r0.LIZ()
            if (r0 < 0) goto L67
            X.0oOC r0 = r5.LLIZLLLIL
            int r2 = r0.LIZ()
            if (r2 != r1) goto L68
            r0 = 1
        L24:
            r5.LLJJIII = r0
            com.ss.ttvideoengine.TTVideoEngine r1 = new com.ss.ttvideoengine.TTVideoEngine
            android.content.Context r0 = r5.LLILLL
            r1.<init>(r0, r2)
            r5.LL = r1
            com.ss.ttvideoengine.TTVideoEngine r0 = r5.LL
            r0.LLJILLL(r5)
            com.ss.ttvideoengine.TTVideoEngine r0 = r5.LL
            r0.LLJJ(r5)
            X.0oIZ r0 = r5.LLIZ
            if (r0 == 0) goto L44
            com.ss.ttvideoengine.TTVideoEngine r1 = r5.LL
            X.0oIZ r0 = r5.LLIZ
            r1.LJLZ(r0)
        L44:
            com.ss.ttvideoengine.TTVideoEngine r1 = r5.LL
            r0 = 12
            r1.LIZJ(r0, r3)
            com.ss.ttvideoengine.TTVideoEngine r1 = r5.LL
            r0 = 492(0x1ec, float:6.9E-43)
            r1.LIZJ(r0, r4)
            com.ss.ttvideoengine.TTVideoEngine r2 = r5.LL
            r1 = 471(0x1d7, float:6.6E-43)
            r0 = 3
            r2.LIZJ(r1, r0)
            com.ss.ttvideoengine.TTVideoEngine r1 = r5.LL
            r0 = 7
            r1.LIZJ(r0, r3)
            com.ss.ttvideoengine.TTVideoEngine r1 = r5.LL
            r0 = 5
            r1.LIZJ(r0, r0)
        L66:
            return
        L67:
            r2 = 0
        L68:
            r0 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1471190oO5.LIZ():void");
    }

    public final boolean LIZLLL() {
        return this.LLJILJILJ && this.LL != null && this.LL.LJJLIIIJILLIZJL() == 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oOA, X.0oRy] */
    public final void LJIIJ() {
        ?? r1;
        if (!this.LLJILJIL) {
            LJIILJJIL(true);
        }
        if (this.LL == null) {
            LynxLog.i("VideoController", "VideoEngine not initialized");
            return;
        }
        if (LJIIZILJ() && (r1 = this.LLJI) != 0) {
            r1.s3(new Runnable() { // from class: X.0oO8
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoController@d897.play$1");
                    try {
                        LynxLog.i("VideoController", "Do trigger video engine play in video controller");
                        TTVideoEngine tTVideoEngine = this.LL.LL;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.play();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoController@d897.play$1");
                }
            });
            return;
        }
        TTVideoEngine tTVideoEngine = this.LL;
        if (tTVideoEngine != null) {
            tTVideoEngine.play();
        }
    }

    public final boolean LJIIZILJ() {
        Map<String, String> map;
        String str;
        C1471230oO9 c1471230oO9 = this.LLILZ;
        C1473690oS7 c1473690oS7 = c1471230oO9 != null ? c1471230oO9.LJIILIIL : null;
        if (c1473690oS7 == null || (map = c1473690oS7.LJIIIIZZ) == null || (str = map.get("experimental-force-prepare-play-after-surface-available")) == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJ(TTVideoEngine tTVideoEngine) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJ(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJI(e eVar) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJI(eVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0oOA, X.0oRy] */
    public final void LJII(boolean z) {
        String str;
        WeakHandler weakHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek_complete:");
        if (z) {
            str = "done";
        } else {
            str = "fail";
        }
        sbLIZ.append(str);
        LynxLog.d("VideoController", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJI.r3();
        if (LIZLLL() && (weakHandler = this.LLJJIJIL) != null) {
            weakHandler.sendEmptyMessage(201);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIIIZ(tTVideoEngine);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
        LynxLog.d("VideoController", "onPrepared");
        this.LLJILJILJ = true;
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIILIIL(tTVideoEngine);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0oOA, X.0oRy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0oOA, X.0oRy] */
    public final void LJIILJJIL(final boolean z) {
        ?? r1;
        ?? r0;
        if (!this.LLJILJIL && !this.LLJILLL) {
            this.LLJILLL = true;
            synchronized (this.LLILLJJLI) {
                try {
                    if (this.LL == null) {
                        LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (this.LL != null) {
                InterfaceC1471260oOC interfaceC1471260oOC = this.LLIZLLLIL;
                if (interfaceC1471260oOC != null) {
                    interfaceC1471260oOC.LIZIZ(this.LL, this.LLILZ);
                }
                this.LL.LIZJ(160, 1);
                this.LL.LIZJ(509, 1);
                this.LL.LIZJ(402, 1);
                C1471230oO9 c1471230oO9 = this.LLILZ;
                String str = c1471230oO9.LIZIZ;
                if (c1471230oO9.LJFF != null) {
                    TTVideoEngine tTVideoEngine = this.LL;
                    C1471230oO9 c1471230oO92 = this.LLILZ;
                    tTVideoEngine.LJZ(c1471230oO92.LJFF, c1471230oO92.LJ);
                } else if (c1471230oO9.LJI != null) {
                    this.LL.LJIJ(this.LLILZ.LJI);
                } else if (str != null) {
                    if (!c1471230oO9.LJII) {
                        C1470240oMY c1470240oMY = new C1470240oMY();
                        try {
                            C1473400oRe c1473400oRe = new C1473400oRe();
                            c1473400oRe.LIZJ(new JSONObject(c1471230oO9.LIZIZ));
                            c1470240oMY.LJJIJLIJ(c1473400oRe);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1470240oMY = null;
                        }
                        c1471230oO9.LJIIIIZZ = c1470240oMY;
                        c1471230oO9.LJII = true;
                    }
                    C1470240oMY c1470240oMY2 = c1471230oO9.LJIIIIZZ;
                    if (c1470240oMY2 != null) {
                        this.LL.LJIL(c1470240oMY2);
                        if (c1470240oMY2.LJIIJ(EnumC1469940oM4.DASH)) {
                            this.LL.LIZJ(17, 1);
                            this.LL.LIZJ(33, 1);
                            this.LL.LIZJ(473, 3);
                        }
                    }
                } else if (c1471230oO9.LIZ != null) {
                    this.LL.LIZJ(21, 1);
                    this.LL.LJJIIZ(this.LLILZ.LIZ);
                    if (this.LLILZ.LIZJ != null) {
                        this.LL.LJJI(2, this.LLILZ.LIZJ);
                        if (this.LLILZ.LIZLLL != null) {
                            TTVideoEngine tTVideoEngine2 = this.LL;
                            C1471230oO9 c1471230oO93 = this.LLILZ;
                            final String str2 = c1471230oO93.LIZJ;
                            final String str3 = c1471230oO93.LIZLLL;
                            tTVideoEngine2.LIZ.LLLLLZ = new InterfaceC1467770oIZ(str2, str3) { // from class: X.0Uz0
                                public final String LIZ;
                                public final String LIZIZ;

                                {
                                    this.LIZ = str2;
                                    this.LIZIZ = str3;
                                }

                                @Override // X.InterfaceC1467770oIZ
                                public final String LIZ(int i, Map map) {
                                    StringBuilder sb = new StringBuilder();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("https://");
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append("/?");
                                    sbLIZ.append(this.LIZ);
                                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                                    return sb.toString();
                                }
                            };
                        }
                    }
                }
            }
            if (this.LL == null) {
                LynxLog.i("VideoController", "VideoEngine not initialized");
                this.LLJILLL = false;
                return;
            }
            if (!this.LLJILJIL && (r0 = this.LLJI) != 0) {
                r0.t3();
            }
            if (LJIIZILJ() && (r1 = this.LLJI) != 0) {
                r1.s3(new Runnable() { // from class: X.0oO7
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VideoController@d897.prepare$1");
                        try {
                            LynxLog.i("VideoController", "Do trigger video engine prepare in video controller");
                            TTVideoEngine tTVideoEngine3 = this.LLILLJJLI.LL;
                            if (!z && tTVideoEngine3 != null) {
                                tTVideoEngine3.prepare();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VideoController@d897.prepare$1");
                    }
                });
            } else {
                TTVideoEngine tTVideoEngine3 = this.LL;
                if (!z && tTVideoEngine3 != null) {
                    tTVideoEngine3.prepare();
                }
            }
            this.LLJILJIL = true;
            this.LLJILLL = false;
            return;
        }
        LynxLog.i("VideoController", "Failed to trigger prepare in videoController for prepareCalled or preparing");
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIILL(TTVideoEngine tTVideoEngine) {
        WeakHandler weakHandler;
        if (!tTVideoEngine.LIZ.LJJJ && (weakHandler = this.LLJJIJIL) != null) {
            weakHandler.removeMessages(201);
        }
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIILL(tTVideoEngine);
        }
    }

    public final void LJIILLIIL(Surface surface) {
        if (surface == null) {
            this.LLJJ = false;
        } else {
            if (this.LL == null || this.LLJJ) {
                return;
            }
            this.LLJJ = true;
            LynxLog.i("VideoController", "Set surface to video engine");
            this.LL.setSurface(surface);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJJ(int i) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIJJ(i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJJLI(int i) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIJJLI(i);
        }
    }

    @Override // X.InterfaceC1467780oIa
    public final void LJJJIL(C1467470oI5 c1467470oI5) {
        InterfaceC1467780oIa interfaceC1467780oIa = this.LLILZLL;
        if (interfaceC1467780oIa != null) {
            interfaceC1467780oIa.LJJJIL(c1467470oI5);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJJLIIIJJIZ(tTVideoEngine);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0oOB] */
    public C1471190oO5(Context context, C1471230oO9 c1471230oO9) {
        this.LLILLL = context;
        this.LLILZ = c1471230oO9;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0oOA, X.0oRy] */
    @Override // X.InterfaceC1469360oL8
    public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LynxLog.d("VideoController", "play_back_state_changed -> error");
                        WeakHandler weakHandler = this.LLJJIJIL;
                        if (weakHandler != null) {
                            weakHandler.removeMessages(201);
                        }
                    }
                } else {
                    LynxLog.d("VideoController", "play_back_state_changed -> paused");
                }
            } else {
                LynxLog.d("VideoController", "play_back_state_changed -> playing");
                WeakHandler weakHandler2 = this.LLJJIJIL;
                if (weakHandler2 != null) {
                    weakHandler2.sendEmptyMessage(201);
                }
                ?? r0 = this.LLJI;
                if (r0 != 0) {
                    r0.q3();
                }
            }
        } else {
            LynxLog.d("VideoController", "play_back_state_changed -> stopped");
        }
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LIZJ(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoStreamBitrateChanged ->");
        sbLIZ.append(enumC2281151EQn.toString(0));
        LynxLog.d("VideoController", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJFF(i, enumC2281151EQn);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIIL(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadStateChanged:");
        sbLIZ.append(i);
        LynxLog.d("VideoController", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LynxLog.d("VideoController", "load_state_changed -> error");
                }
            } else {
                LynxLog.d("VideoController", "load_state_changed -> stalled");
                LynxLog.d("VideoController", "onBufferStart");
            }
        } else {
            LynxLog.d("VideoController", "load_state_changed -> playable");
            LynxLog.d("VideoController", "onBufferEnd");
        }
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIJ(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIJI(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJII(int i, int i2) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJJII(i, i2);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJJJJJ(tTVideoEngine, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJL(e eVar, String str) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJJL(eVar, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oOA, X.0oRy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1469360oL8
    public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
        this.LLJI.onVideoSizeChanged(i, i2);
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJIIJJI(tTVideoEngine, i, i2);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJJLIIL(int i, int i2, int i3) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJJJLIIL(i, i2, i3);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map<Integer, String> map) {
        InterfaceC1469360oL8 interfaceC1469360oL8 = this.LLILZIL;
        if (interfaceC1469360oL8 != null) {
            interfaceC1469360oL8.LJJJJJL(tTVideoEngine, i, j, j2, map);
        }
    }
}
