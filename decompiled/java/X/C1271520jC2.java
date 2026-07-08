package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS3S0111000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilterImpl;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoStreamHDFilterImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271520jC2 implements InterfaceC1266410j3n {
    public final C1267500j5Y LL;
    public C1266350j3h LLILLJJLI;
    public C1269960j9W LLILLL;
    public C1270180j9s LLILZ;
    public C1270360jAA LLILZIL;
    public C1269990j9Z LLILZLL;
    public C1270630jAb LLIZ;
    public C1275410jIJ LLIZLLLIL;
    public C1267750j5x LLJ;
    public C1271550jC5 LLJI;
    public C1271540jC4 LLJIJIL;
    public C1271620jCC LLJILJIL;
    public C1272100jCy LLJILJILJ;
    public C1267730j5v LLJILLL;
    public InterfaceC1269980j9Y LLJJ;
    public C1271530jC3 LLJJI;
    public C1271530jC3 LLJJIII;
    public TTLHSceneDetector LLJJIJI;
    public InterfaceC1269980j9Y LLJJIJIIJIL;
    public C1271490jBz LLJJIJIL;
    public C1271420jBs LLJJJ;
    public final C1273370jF1 LLJJJIL;
    public InterfaceC1269980j9Y LLJJJJ;
    public boolean LLJJJJJIL;
    public EnumC1269700j96 LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final List<C1271610jCB> LLJL;
    public final Map<String, List<C1271610jCB>> LLJLIL;
    public EnumC1267980j6K LLJLILLLLZIIL;
    public String LLJLL;

    @Override // X.InterfaceC1266410j3n
    public final void release() {
        for (Object obj : C1697810uHb.LJIIJJI(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJI)) {
            if (obj != null) {
                ((C1271610jCB) obj).release();
            }
        }
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJI = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJILJILJ = null;
        this.LLILLJJLI = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r4 = this;
            X.0j6K r1 = r4.LLJLILLLLZIIL
            X.0j6K r0 = X.EnumC1267980j6K.GAME_LIVE
            if (r1 == r0) goto L75
            r4.LIZJ()
            X.0j5x r1 = r4.LLJ
            r3 = 0
            if (r1 == 0) goto L58
            X.0j9W r0 = r4.LLILLL
            if (r0 == 0) goto L15
            r0.LJI(r1)
        L15:
            boolean r0 = r4.LLJJL
            if (r0 != 0) goto L73
            X.0jC5 r0 = r4.LLJI
            if (r0 == 0) goto L69
            r1.LJI(r0)
            X.0jC5 r2 = r4.LLJI
        L22:
            X.0jC3 r0 = r4.LLJJIII
            if (r0 == 0) goto L29
            r1.LJI(r0)
        L29:
            com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector r0 = r4.LLJJIJI
            if (r0 == 0) goto L30
            r1.LJI(r0)
        L30:
            if (r2 == 0) goto L58
            boolean r0 = r4.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L38
            X.0jCC r3 = r4.LLJILJIL
        L38:
            X.0jCy r1 = r4.LLJILJILJ
            if (r3 == 0) goto L45
            r2.LJI(r3)
            if (r1 == 0) goto L67
            r0 = 1
        L42:
            r3.LLJJIII = r0
            r2 = r3
        L45:
            if (r1 == 0) goto L63
            r2.LJI(r1)
        L4a:
            X.0jBz r0 = r4.LLJJIJIL
            if (r0 == 0) goto L51
            r2.LJI(r0)
        L51:
            X.0jF1 r0 = r4.LLJJJIL
            if (r0 == 0) goto L58
            r2.LJI(r0)
        L58:
            X.0jCy r0 = r4.LLJILJILJ
            if (r0 == 0) goto L5f
            r4.LIZ(r0)
        L5f:
            r4.LJIIJ()
            return
        L63:
            r4.LIZ(r2)
            goto L4a
        L67:
            r0 = 0
            goto L42
        L69:
            X.0jC4 r0 = r4.LLJIJIL
            if (r0 == 0) goto L73
            r1.LJI(r0)
            X.0jC4 r2 = r4.LLJIJIL
            goto L22
        L73:
            r2 = r1
            goto L22
        L75:
            r4.LIZJ()
            X.0j5x r1 = r4.LLJ
            if (r1 == 0) goto L83
            X.0j9W r0 = r4.LLILLL
            if (r0 == 0) goto L83
            r0.LJI(r1)
        L83:
            X.0j5x r2 = r4.LLJ
            if (r2 == 0) goto Lb3
            boolean r0 = r4.LLJJL
            if (r0 != 0) goto Lbf
            X.0j5Y r0 = r4.LL
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.LIZ
            com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase r0 = r0.mPushBase
            boolean r0 = r0.LJIILL()
            if (r0 == 0) goto Lbf
            X.0jC4 r1 = r4.LLJIJIL
            if (r1 == 0) goto Lb7
            r2.LJI(r1)
            X.0j5v r0 = r4.LLJILLL
            if (r0 == 0) goto La5
            r1.LJI(r0)
        La5:
            X.0jC3 r0 = r4.LLJJIII
            if (r0 == 0) goto Lac
            r2.LJI(r0)
        Lac:
            com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector r0 = r4.LLJJIJI
            if (r0 == 0) goto Lb3
            r2.LJI(r0)
        Lb3:
            r4.LJIIJ()
            return
        Lb7:
            X.0j5v r0 = r4.LLJILLL
            if (r0 == 0) goto La5
            r2.LJI(r0)
            goto La5
        Lbf:
            X.0j5v r0 = r4.LLJILLL
            if (r0 == 0) goto La5
            r2.LJI(r0)
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271520jC2.LIZIZ():void");
    }

    public final void LIZJ() {
        synchronized (this.LLJL) {
            try {
                for (C1271610jCB c1271610jCB : (ArrayList) this.LLJL) {
                    if (c1271610jCB instanceof C1269960j9W) {
                        ((CopyOnWriteArrayList) ((C1269960j9W) c1271610jCB).LLILLJJLI).clear();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL() {
        if (this.LLJILJIL == null) {
            C1268700j7U c1268700j7U = (C1268700j7U) this.LL.LIZJ.getService(C1268700j7U.class);
            C1271620jCC c1271620jCC = new C1271620jCC(this.LL, this.LLILLJJLI, c1268700j7U != null ? c1268700j7U.LIZ() : null);
            c1271620jCC.LLIZLLLIL = (C1267810j63) c1271620jCC.LLILZ.LIZJ.getService(C1267810j63.class);
            c1271620jCC.LLILZ.LIZJ.getService(C1271790jCT.class);
            c1271620jCC.LLJ = (C1269940j9U) c1271620jCC.LLILZ.LIZJ.getService(C1269940j9U.class);
            C1266350j3h c1266350j3h = c1271620jCC.LLILZIL;
            c1271620jCC.LLJI = c1266350j3h != null ? c1266350j3h.LLJLL : null;
            c1271620jCC.LLJILJIL = new GlRenderDrawer();
            Handler handler = c1271620jCC.LLILZLL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1271620jCC, 185));
            }
            synchronized (this.LLJL) {
                try {
                    ((ArrayList) this.LLJL).add(c1271620jCC);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLJILJIL = c1271620jCC;
        }
    }

    public final void LJI() {
        if (this.LLJJIJIL == null) {
            C1271490jBz c1271490jBz = new C1271490jBz(this.LL);
            synchronized (this.LLJL) {
                try {
                    ((ArrayList) this.LLJL).add(c1271490jBz);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LLJJIJIL = c1271490jBz;
        }
    }

    public final void LJII() {
        if (this.LLJILLL != null) {
            return;
        }
        boolean zLIZ = this.LL.LIZ.ttlhABSettingsConfigs.LIZ();
        C1267730j5v c1267730j5v = new C1267730j5v();
        c1267730j5v.LLILZLL = zLIZ;
        this.LLJILLL = c1267730j5v;
        synchronized (this.LLJL) {
            try {
                ((ArrayList) this.LLJL).add(c1267730j5v);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIIIIZZ(c1267730j5v, "key_pre_encode_fps");
    }

    public final void LJIIJ() {
        C1267750j5x c1267750j5x = this.LLJ;
        if (c1267750j5x != null) {
            LJIIIZ(c1267750j5x, "", true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showPipeline :");
            sbLIZ.append(this.LLJLL);
            AVLog.logKibana(4, "VideoNodeManager", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        this.LLJLL = "";
    }

    @Override // X.InterfaceC1266410j3n
    public final JSONObject LJZI() {
        BmfVideoStreamHDFilterImpl bmfVideoStreamHDFilterImpl;
        C1271540jC4 c1271540jC4 = this.LLJIJIL;
        if (c1271540jC4 == null || (bmfVideoStreamHDFilterImpl = c1271540jC4.LLIZ) == null) {
            return null;
        }
        return bmfVideoStreamHDFilterImpl.getBMFColorCorrectionSetting();
    }

    @Override // X.InterfaceC1266410j3n
    public final JSONObject getStatus() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C1271550jC5 c1271550jC5 = this.LLJI;
        if (c1271550jC5 != null) {
            BmfVideoDenoiseFilterImpl bmfVideoDenoiseFilterImpl = c1271550jC5.LLILZLL;
            if (bmfVideoDenoiseFilterImpl == null || (jSONObject2 = bmfVideoDenoiseFilterImpl.getStatus()) == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("setting", 1);
            jSONObject4.put("video_denoise", jSONObject2);
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("setting", 0);
            jSONObject4.put("video_denoise", jSONObject5);
        }
        C1271540jC4 c1271540jC4 = this.LLJIJIL;
        if (c1271540jC4 != null) {
            BmfVideoStreamHDFilterImpl bmfVideoStreamHDFilterImpl = c1271540jC4.LLIZ;
            if (bmfVideoStreamHDFilterImpl == null || (jSONObject = bmfVideoStreamHDFilterImpl.getStatus()) == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("setting", 2);
            jSONObject4.put("video_streamhd", jSONObject);
        } else {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("setting", 0);
            jSONObject4.put("video_streamhd", jSONObject6);
        }
        jSONObject3.put("bmf_video_filter", jSONObject4);
        return jSONObject3;
    }

    @Override // X.InterfaceC1266410j3n
    public final void start() {
        if (this.LLJLILLLLZIIL != EnumC1267980j6K.GAME_LIVE) {
            LJ();
        } else {
            if (!this.LLJJL) {
                boolean zLJIILL = this.LL.LIZ.mPushBase.LJIILL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enableGameVideoStreamHD:");
                sbLIZ.append(zLJIILL);
                AVLog.logKibana(4, "VideoNodeManager", C2188811AlT.LIZIZ(sbLIZ), null);
                if (zLJIILL && this.LLJIJIL == null) {
                    C1271540jC4 c1271540jC4 = new C1271540jC4(this.LL, this.LLILLJJLI, this.LLJLILLLLZIIL);
                    c1271540jC4.LJIIL();
                    synchronized (this.LLJL) {
                        try {
                            ((ArrayList) this.LLJL).add(c1271540jC4);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    this.LLJIJIL = c1271540jC4;
                }
            }
            LJII();
        }
        LIZIZ();
    }

    public final void LJ() {
        LJII();
        if (!this.LLJJL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableVideoStreamHD:");
            sbLIZ.append(this.LL.LIZ.mPushBase.LJIL());
            AVLog.logKibana(4, "VideoNodeManager", C2188811AlT.LIZIZ(sbLIZ), null);
            if ((this.LL.LIZ.mPushBase.LJIL() || this.LL.LIZ.mPushBase.LJIIJ()) && this.LLJIJIL == null) {
                C1271540jC4 c1271540jC4 = new C1271540jC4(this.LL, this.LLILLJJLI, this.LLJLILLLLZIIL);
                c1271540jC4.LJIIL();
                synchronized (this.LLJL) {
                    try {
                        ((ArrayList) this.LLJL).add(c1271540jC4);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LLJIJIL = c1271540jC4;
            }
            if (!this.LL.LIZ.mPushBase.LJIL()) {
                JSONObject jSONObjectLJJJI = this.LL.LIZ.mPushBase.LJJJI();
                if ((this.LL.LIZ.mPushBase.LJIILIIL & 8) != 0 && jSONObjectLJJJI != null && this.LLJI == null) {
                    final C1271550jC5 c1271550jC5 = new C1271550jC5(this.LL, this.LLILLJJLI);
                    C1268700j7U c1268700j7U = (C1268700j7U) c1271550jC5.LLILLL.LIZJ.getService(C1268700j7U.class);
                    c1271550jC5.LLILZIL = c1268700j7U != null ? c1268700j7U.LIZ() : null;
                    c1271550jC5.LLIZLLLIL = (C1267810j63) c1271550jC5.LLILLL.LIZJ.getService(C1267810j63.class);
                    c1271550jC5.LLILLL.LIZJ.getService(C1271790jCT.class);
                    c1271550jC5.LLJ = (C1269940j9U) c1271550jC5.LLILLL.LIZJ.getService(C1269940j9U.class);
                    C1266350j3h c1266350j3h = c1271550jC5.LLILZ;
                    c1271550jC5.LLJI = c1266350j3h != null ? c1266350j3h.LLJLL : null;
                    JSONObject jSONObjectLJJJI2 = c1271550jC5.LLILLL.LIZ.mPushBase.LJJJI();
                    boolean z = (c1271550jC5.LLILLL.LIZ.mPushBase.LJIILIIL & 1) != 0;
                    C1266350j3h c1266350j3h2 = c1271550jC5.LLILZ;
                    if (c1266350j3h2 != null) {
                        c1266350j3h2.LLLZIIL(-1, -1, jSONObjectLJJJI2 != null && z, false);
                    }
                    if (jSONObjectLJJJI2 != null && z) {
                        try {
                            InterfaceC1283880jVy interfaceC1283880jVy = new InterfaceC1283880jVy() { // from class: X.0j8P
                                @Override // X.InterfaceC1283880jVy
                                public final int[] LJLJLLL() {
                                    return new int[0];
                                }

                                @Override // X.InterfaceC1283880jVy
                                public final void LJLL(float f) {
                                }

                                @Override // X.InterfaceC1283880jVy
                                public final int LJLJJLL() {
                                    C1266350j3h c1266350j3h3 = c1271550jC5.LLILZ;
                                    if (c1266350j3h3 != null) {
                                        return c1266350j3h3.LLIIIILZ();
                                    }
                                    return -1;
                                }

                                @Override // X.InterfaceC1283880jVy
                                public final int LJLJL() {
                                    InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
                                    C1266350j3h c1266350j3h3 = c1271550jC5.LLILZ;
                                    if (c1266350j3h3 == null || (interfaceC1268690j7TLJIJJLI = c1266350j3h3.LJIJJLI()) == null) {
                                        return -1;
                                    }
                                    return (int) interfaceC1268690j7TLJIJJLI.LLILZ();
                                }

                                @Override // X.InterfaceC1283880jVy
                                public final void LJLJLJ(int i) {
                                    C1266350j3h c1266350j3h3 = c1271550jC5.LLILZ;
                                    if (c1266350j3h3 != null) {
                                        c1266350j3h3.LLLZIIL(i, -1, true, false);
                                    }
                                }
                            };
                            Context context = c1271550jC5.LLILLL.LIZIZ.LJIIZILJ;
                            if (context != null) {
                                c1271550jC5.LJIIJ(context, jSONObjectLJJJI2, interfaceC1283880jVy);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    synchronized (this.LLJL) {
                        try {
                            ((ArrayList) this.LLJL).add(c1271550jC5);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    this.LLJI = c1271550jC5;
                }
            }
        }
        if (!this.LLJJLIIIJLLLLLLLZ) {
            LIZLLL();
        }
        LJI();
        C1267500j5Y c1267500j5Y = this.LL;
        if (c1267500j5Y.LIZ.sandboxParams.enableVideoIntercept && this.LLJJJ == null) {
            this.LLJJJ = new C1271420jBs(c1267500j5Y);
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final C1267750j5x LLILZIL() {
        return this.LLJ;
    }

    public final void LIZ(C1269970j9X c1269970j9X) {
        InterfaceC1269980j9Y interfaceC1269980j9Y;
        C1272530jDf c1272530jDf;
        C1267730j5v c1267730j5v = this.LLJILLL;
        if (c1267730j5v != null) {
            c1269970j9X.LJI(c1267730j5v);
        }
        if (this.LLJJJJJIL) {
            interfaceC1269980j9Y = this.LLJJIJIIJIL;
        } else {
            interfaceC1269980j9Y = this.LLJJ;
        }
        if (interfaceC1269980j9Y != null) {
            if (c1269970j9X instanceof C1272100jCy) {
                C1272100jCy c1272100jCy = (C1272100jCy) c1269970j9X;
                EnumC1272790jE5 enumC1272790jE5 = EnumC1272790jE5.SELFSIDE_RENDER_CHAIN;
                if (c1272100jCy.LLJJIJIIJIL.containsKey(enumC1272790jE5) && (c1272530jDf = c1272100jCy.LLJJIJIIJIL.get(enumC1272790jE5)) != null) {
                    c1272530jDf.LJIIIIZZ(interfaceC1269980j9Y);
                }
            }
            c1269970j9X.LJI(interfaceC1269980j9Y);
        }
        InterfaceC1269980j9Y interfaceC1269980j9Y2 = this.LLJJ;
        if (interfaceC1269980j9Y2 != null && this.LLJJJJLIIL == EnumC1269700j96.CameraView_And_SingleViewRender && this.LLJJJJJIL) {
            c1269970j9X.LJI(interfaceC1269980j9Y2);
        }
        C1271420jBs c1271420jBs = this.LLJJJ;
        if (c1271420jBs != null) {
            c1269970j9X.LJI(c1271420jBs);
        }
        C1271530jC3 c1271530jC3 = this.LLJJI;
        if (c1271530jC3 != null) {
            c1269970j9X.LJI(c1271530jC3);
        }
        InterfaceC1269980j9Y interfaceC1269980j9Y3 = this.LLJJJJ;
        if (interfaceC1269980j9Y3 != null) {
            c1269970j9X.LJI(interfaceC1269980j9Y3);
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJFF(boolean z) {
        this.LLJJJJJIL = z;
        LIZIZ();
    }

    public final void LJIIJJI(C1269970j9X c1269970j9X) {
        if (c1269970j9X == null) {
            return;
        }
        synchronized (this.LLJL) {
            try {
                ((ArrayList) this.LLJL).remove(c1269970j9X);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = ((HashMap) this.LLJLIL).values().iterator();
        while (it2.hasNext()) {
            ((List) it2.next()).remove(c1269970j9X);
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJIILLIIL(int i) {
        C1269960j9W c1269960j9W;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 6) {
                        c1269960j9W = null;
                    } else {
                        c1269960j9W = this.LLILZLL;
                    }
                } else {
                    c1269960j9W = this.LLILZIL;
                }
            } else {
                c1269960j9W = this.LLILZ;
            }
        } else {
            c1269960j9W = this.LLIZ;
        }
        this.LLILLL = c1269960j9W;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJIIZILJ(C1273190jEj c1273190jEj) {
        this.LLJJIJIIJIL = c1273190jEj;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJIJJ(EnumC1269700j96 enumC1269700j96) {
        this.LLJJJJLIIL = enumC1269700j96;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJ(C1270360jAA c1270360jAA) {
        this.LLILZIL = c1270360jAA;
        this.LLILLL = c1270360jAA;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJI(C1269990j9Z c1269990j9Z) {
        this.LLILZLL = c1269990j9Z;
        this.LLILLL = c1269990j9Z;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJIIJZLJL(boolean z) {
        Handler handler;
        C1271540jC4 c1271540jC4 = this.LLJIJIL;
        if (c1271540jC4 != null && (handler = c1271540jC4.LLILZLL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS3S0111000_20(c1271540jC4, z, 1));
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJIL(C1275410jIJ c1275410jIJ) {
        this.LLIZLLLIL = c1275410jIJ;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJIZ(EnumC1267980j6K enumC1267980j6K) {
        if (this.LLJILLL == null) {
            LJII();
        }
        C1267730j5v c1267730j5v = this.LLJILLL;
        if (c1267730j5v != null) {
            c1267730j5v.LLILLJJLI = enumC1267980j6K;
        }
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJJI(C1272040jCs c1272040jCs) {
        this.LLJJJJ = c1272040jCs;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJJJJL(EnumC1270450jAJ enumC1270450jAJ) {
        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJavaLIZ;
        TTLHAbnormalDetectorJava tTLHAbnormalDetectorJavaLIZ2;
        int i = C1270460jAK.LIZ[enumC1270450jAJ.ordinal()];
        C1271530jC3 c1271530jC3 = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throw new C1284660jXE(null, 1, null);
                }
                return;
            }
            C1275410jIJ c1275410jIJ = this.LLIZLLLIL;
            if (c1275410jIJ != null && (tTLHAbnormalDetectorJavaLIZ2 = c1275410jIJ.LIZ(EnumC1270450jAJ.kAbnormalDetectNodeCapture)) != null) {
                c1271530jC3 = new C1271530jC3(this.LL, tTLHAbnormalDetectorJavaLIZ2);
                synchronized (this.LLJL) {
                    try {
                        try {
                            try {
                                ((ArrayList) this.LLJL).add(c1271530jC3);
                                LIZIZ();
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
            this.LLJJIII = c1271530jC3;
            return;
        }
        C1275410jIJ c1275410jIJ2 = this.LLIZLLLIL;
        if (c1275410jIJ2 != null && (tTLHAbnormalDetectorJavaLIZ = c1275410jIJ2.LIZ(EnumC1270450jAJ.kAbnormalDetectNodeEffect)) != null) {
            c1271530jC3 = new C1271530jC3(this.LL, tTLHAbnormalDetectorJavaLIZ);
            synchronized (this.LLJL) {
                try {
                    try {
                        try {
                            ((ArrayList) this.LLJL).add(c1271530jC3);
                            LIZIZ();
                        } catch (Throwable th5) {
                            th = th5;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        }
        this.LLJJI = c1271530jC3;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJJLIIL(VideoSink videoSink) {
        if (this.LLJILLL == null) {
            LJII();
        }
        C1267730j5v c1267730j5v = this.LLJILLL;
        if (c1267730j5v != null) {
            c1267730j5v.LLILLL = videoSink;
            LIZIZ();
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJLIIIJL(InterfaceC1269980j9Y interfaceC1269980j9Y) {
        if (this.LLJJ == interfaceC1269980j9Y) {
            return;
        }
        this.LLJJ = interfaceC1269980j9Y;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJLIIIJLLLLLLLZ(VideoSink videoSink) {
        if (this.LLJILLL == null) {
            LJII();
        }
        C1267730j5v c1267730j5v = this.LLJILLL;
        if (c1267730j5v != null) {
            c1267730j5v.LLILZ = videoSink;
            LIZIZ();
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJLIIJ(EnumC1267980j6K enumC1267980j6K) {
        this.LLJLILLLLZIIL = enumC1267980j6K;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJJZ(C1270630jAb c1270630jAb) {
        this.LLIZ = c1270630jAb;
        this.LLILLL = c1270630jAb;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJL(C1272100jCy c1272100jCy) {
        C1272100jCy c1272100jCy2 = this.LLJILJILJ;
        if (c1272100jCy2 != null && c1272100jCy2 != c1272100jCy) {
            LJIIJJI(c1272100jCy2);
        }
        this.LLJILJILJ = c1272100jCy;
        if (c1272100jCy != null) {
            synchronized (this.LLJL) {
                try {
                    if (!((ArrayList) this.LLJL).contains(c1272100jCy)) {
                        ((ArrayList) this.LLJL).add(c1272100jCy);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            LJIIIIZZ(c1272100jCy, "key_effect_resource_validation_query");
            LJIIIIZZ(c1272100jCy, "key_effect_out_fps");
            LJIIIIZZ(c1272100jCy, "key_effect_avg_time");
            LJIIIIZZ(c1272100jCy, "key_effect_node_enable");
            c1272100jCy.LLJJJJLIIL = new InterfaceC1272420jDU() { // from class: X.0jC9
                @Override // X.InterfaceC1272420jDU
                public final /* synthetic */ void LIZIZ(String[] strArr) {
                }

                @Override // X.InterfaceC1272420jDU
                public final /* synthetic */ void LIZJ(String[] strArr) {
                }

                @Override // X.InterfaceC1272420jDU
                public final /* synthetic */ void LIZLLL(String[] strArr) {
                }

                @Override // X.InterfaceC1272420jDU
                public final void LIZ() {
                    this.LIZ.LL.LIZ.getClass();
                    this.LIZ.LIZIZ();
                }
            };
        }
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLIIIL(TTLHSceneDetector tTLHSceneDetector) {
        this.LLJJIJI = tTLHSceneDetector;
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLIL(C1270180j9s c1270180j9s) {
        this.LLILZ = c1270180j9s;
        this.LLILLL = c1270180j9s;
        LIZIZ();
    }

    @Override // X.InterfaceC1266410j3n
    public final void LLF(JSONObject jSONObject) {
        Handler handler;
        C1271540jC4 c1271540jC4 = this.LLJIJIL;
        if (c1271540jC4 != null && (handler = c1271540jC4.LLILZLL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(jSONObject, c1271540jC4, 117));
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final Bundle query(String str) {
        Bundle bundle = new Bundle();
        List list = (List) ((HashMap) this.LLJLIL).get(str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Bundle bundleLJFF = ((C1271610jCB) it2.next()).LJFF(str);
                if (bundleLJFF != null) {
                    C786410Ut5.LJJIIJZLJL(bundle, bundleLJFF);
                }
            }
        }
        return bundle;
    }

    public C1271520jC2(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h) {
        this.LL = c1267500j5Y;
        this.LLILLJJLI = c1266350j3h;
        EnumC1267980j6K enumC1267980j6K = EnumC1267980j6K.NORMAL_LIVE;
        this.LLJJJJLIIL = EnumC1269700j96.CameraView_Render;
        ArrayList arrayList = new ArrayList();
        this.LLJL = arrayList;
        this.LLJLIL = new HashMap();
        this.LLJLILLLLZIIL = enumC1267980j6K;
        if (this.LLJ == null) {
            boolean zLIZ = c1267500j5Y.LIZ.ttlhABSettingsConfigs.LIZ();
            C1267750j5x c1267750j5x = new C1267750j5x();
            c1267750j5x.LLILZ = zLIZ;
            this.LLJ = c1267750j5x;
            synchronized (arrayList) {
                try {
                    arrayList.add(c1267750j5x);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            LJIIIIZZ(c1267750j5x, "key_in_cap_fps");
        }
        this.LLJJJIL = (C1273370jF1) c1267500j5Y.LIZJ.getService(C1273370jF1.class);
        this.LLJLL = "";
    }

    public final void LJIIIIZZ(C1271610jCB c1271610jCB, String str) {
        HashMap map = (HashMap) this.LLJLIL;
        Object arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        List list = (List) arrayList;
        if (!list.contains(c1271610jCB)) {
            list.add(c1271610jCB);
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLJLLL(Bundle bundle, InterfaceC1270140j9o interfaceC1270140j9o) {
        Handler handler;
        C1271490jBz c1271490jBz = this.LLJJIJIL;
        if (c1271490jBz != null && (handler = c1271490jBz.LLIZLLLIL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS53S0300000_20(bundle, c1271490jBz, (C1152850g6d) interfaceC1270140j9o, 33));
        }
    }

    public final void LJIIIZ(C1269960j9W c1269960j9W, String str, boolean z) {
        boolean z2;
        String str2;
        String str3;
        boolean z3;
        if (str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z) {
            str2 = "└── ";
        } else if (str.length() > 0) {
            str2 = "├── ";
        } else {
            str2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJLL);
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(c1269960j9W.LIZLLL());
        sbLIZ.append('\n');
        this.LLJLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        if (z) {
            str3 = "    ";
        } else {
            str3 = "│   ";
        }
        sbLIZ2.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        int i = 0;
        for (Object obj : c1269960j9W.LLILLJJLI) {
            int i2 = i + 1;
            if (i >= 0) {
                Object obj2 = (InterfaceC1269980j9Y) obj;
                if (i == ((CopyOnWriteArrayList) c1269960j9W.LLILLJJLI).size() - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (obj2 instanceof C1269960j9W) {
                    LJIIIZ((C1269960j9W) obj2, strLIZIZ, z3);
                } else if (obj2 instanceof C1267740j5w) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LLJLL);
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append("└── ");
                    sbLIZ3.append(((C1271610jCB) obj2).LIZLLL());
                    sbLIZ3.append('\n');
                    this.LLJLL = C2188811AlT.LIZIZ(sbLIZ3);
                } else if (obj2 instanceof VideoSink) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(this.LLJLL);
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append("└── ");
                    sbLIZ4.append(((VideoSink) obj2).getNodeName());
                    sbLIZ4.append('\n');
                    this.LLJLL = C2188811AlT.LIZIZ(sbLIZ4);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC1266410j3n
    public final void LJLJI(int i, int i2, boolean z) {
        Handler handler;
        if (i != 8) {
            if (i == 32) {
                if (this.LL.LIZ.mPushBase.LJIIJ()) {
                    boolean z2 = true;
                    if (this.LLJLILLLLZIIL == EnumC1267980j6K.GAME_LIVE) {
                        C1271540jC4 c1271540jC4 = this.LLJIJIL;
                        if (c1271540jC4 != null) {
                            if (!z || !this.LL.LIZ.mPushBase.LJIILL()) {
                                z2 = false;
                            }
                            c1271540jC4.LJIIJJI(i2, z2);
                            return;
                        }
                        return;
                    }
                    C1271540jC4 c1271540jC42 = this.LLJIJIL;
                    if (c1271540jC42 == null) {
                        return;
                    }
                    if (!z || !this.LL.LIZ.mPushBase.LJIL()) {
                        z2 = false;
                    }
                    c1271540jC42.LJIIJJI(i2, z2);
                    return;
                }
                C1271540jC4 c1271540jC43 = this.LLJIJIL;
                if (c1271540jC43 == null) {
                    return;
                }
                c1271540jC43.LJIIJJI(i2, z);
                return;
            }
            return;
        }
        C1271550jC5 c1271550jC5 = this.LLJI;
        if (c1271550jC5 == null || (handler = c1271550jC5.LLILZIL) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS3S0111000_20(c1271550jC5, z, i2, 0));
    }
}
