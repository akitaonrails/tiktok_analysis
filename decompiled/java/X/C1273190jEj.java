package X;

import Y.ARunnableS24S1200000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Bundle;
import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS564S0100000_20;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273190jEj extends C1269970j9X {
    public final C1273240jEo LLILLL;
    public C1273160jEg LLILZ;
    public final C1273140jEe LLILZIL;
    public C1269650j91 LLILZLL;
    public boolean LLIZLLLIL;
    public List<C1276780jKW> LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public C1273200jEk LLJILJILJ;
    public int LLIZ = 20;
    public final ConcurrentHashMap<String, VideoFrame> LLJ = new ConcurrentHashMap<>();
    public final VideoFrameStatics LLJILLL = new VideoFrameStatics(2000);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS564S0100000_20(this, 50));
    public final C1273230jEn LLJJI = new InterfaceC1272600jDm() { // from class: X.0jEn
        @Override // X.InterfaceC1272540jDg
        public final void onMessageReceived(int i, int i2, int i3, String str) {
            String str2;
            InterfaceC1273260jEq interfaceC1273260jEq;
            String str3;
            InterfaceC1273260jEq interfaceC1273260jEq2;
            C1273190jEj c1273190jEj = this.LL;
            if (i == 589824) {
                if (i2 != 1) {
                    if (i2 == 2 && (interfaceC1273260jEq2 = c1273190jEj.LLILLL.LJ) != null) {
                        interfaceC1273260jEq2.onError(i3);
                        return;
                    }
                    return;
                }
                String str4 = "";
                if (i3 != 1) {
                    if (i3 != 2 || (interfaceC1273260jEq = c1273190jEj.LLILLL.LJ) == null) {
                        return;
                    }
                    Object[] objArr = new Object[1];
                    C1273200jEk c1273200jEk = c1273190jEj.LLJILJILJ;
                    if (c1273200jEk != null && (str3 = c1273200jEk.LIZJ) != null) {
                        str4 = str3;
                    }
                    objArr[0] = str4;
                    interfaceC1273260jEq.LIZ(35, objArr);
                    return;
                }
                InterfaceC1273260jEq interfaceC1273260jEq3 = c1273190jEj.LLILLL.LJ;
                if (interfaceC1273260jEq3 == null) {
                    return;
                }
                Object[] objArr2 = new Object[1];
                C1273200jEk c1273200jEk2 = c1273190jEj.LLJILJILJ;
                if (c1273200jEk2 != null && (str2 = c1273200jEk2.LIZJ) != null) {
                    str4 = str2;
                }
                objArr2[0] = str4;
                interfaceC1273260jEq3.LIZ(34, objArr2);
            }
        }
    };

    public final Runnable LJIIJ() {
        return (Runnable) this.LLJJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0056 A[PHI: r2
      0x0056: PHI (r2v1 boolean) = 
      (r2v0 boolean)
      (r2v3 boolean)
      (r2v3 boolean)
      (r2v3 boolean)
      (r2v3 boolean)
      (r2v3 boolean)
      (r2v3 boolean)
      (r2v3 boolean)
     binds: [B:40:0x0053, B:16:0x001e, B:18:0x0022, B:20:0x0028, B:22:0x002e, B:24:0x0032, B:26:0x0036, B:28:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI() {
        /*
            r4 = this;
            X.0jEo r0 = r4.LLILLL
            X.0j5Y r1 = r0.LIZJ
            r3 = 1
            if (r1 == 0) goto L52
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r1.LIZ
            if (r0 == 0) goto L52
            com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs r0 = r0.ttlhABSettingsConfigs
            if (r0 == 0) goto L52
            com.ss.lyrax.video.CachePoolConfig r0 = com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs.LJFF
            if (r0 == 0) goto L52
            com.ss.lyrax.video.VideoFramePoolConfig r0 = r0.videoFramePoolConfig
            if (r0 == 0) goto L52
            boolean r0 = r0.enable
            if (r0 != r3) goto L52
            r2 = 1
        L1c:
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r1.LIZ
            if (r0 == 0) goto L56
            com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase r0 = r0.mPushBase
            if (r0 == 0) goto L56
            boolean r0 = r0.LJIILIIL()
            if (r0 != r3) goto L56
            X.0jEo r0 = r4.LLILLL
            X.0j5Y r0 = r0.LIZJ
            if (r0 == 0) goto L56
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.LIZ
            if (r0 == 0) goto L56
            com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase r0 = r0.mPushBase
            if (r0 == 0) goto L56
            boolean r0 = r0.LJIJJLI()
            if (r0 != r3) goto L56
            r1 = 1
        L3f:
            X.0jEo r0 = r4.LLILLL
            X.0j5Y r0 = r0.LIZJ
            if (r0 == 0) goto L58
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.LIZ
            if (r0 == 0) goto L58
            boolean r0 = r0.enableNewVideoBufferPool
            if (r0 != r3) goto L58
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            return r3
        L52:
            r2 = 0
            if (r1 == 0) goto L56
            goto L1c
        L56:
            r1 = 0
            goto L3f
        L58:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1273190jEj.LJIIJJI():boolean");
    }

    @Override // X.C1271610jCB
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractMixManager_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0jEn] */
    public C1273190jEj(C1273240jEo c1273240jEo) {
        this.LLILLL = c1273240jEo;
        this.LLILZIL = new C1273140jEe(c1273240jEo.LIZIZ, c1273240jEo.LIZLLL);
    }

    public static JSONObject LJIIL(C1273200jEk c1273200jEk) throws JSONException {
        EnumC1273220jEm enumC1273220jEm;
        JSONObject jSONObject = new JSONObject();
        if (c1273200jEk != null && (enumC1273220jEm = c1273200jEk.LJI) != null && C1273210jEl.LIZ[enumC1273220jEm.ordinal()] == 1) {
            jSONObject.put("name", "mix_layout_by_effect");
            JSONArray jSONArray = new JSONArray();
            List<C1276780jKW> list = c1273200jEk.LIZIZ;
            if (list != null) {
                Iterator<C1276780jKW> it2 = list.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next().LIZ());
                }
            }
            jSONObject.put("layout", jSONArray);
            jSONObject.put("extraParams", c1273200jEk.LJFF);
        }
        return jSONObject;
    }

    public final void LJIILIIL(int i) {
        this.LLIZ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMixFps: mMixFps = ");
        sbLIZ.append(this.LLIZ);
        AVLog.logKibana(4, "InteractMixManager", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public final void LJIILJJIL(C1273200jEk c1273200jEk) {
        if (C1267520j5a.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startEffectMix: params = ");
            sbLIZ.append(c1273200jEk.toString());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Handler handler = this.LLILLL.LIZIZ;
        if (handler != null) {
            handler.removeCallbacks(LJIIJ());
        }
        Handler handler2 = this.LLILLL.LIZIZ;
        if (handler2 != null) {
            C786410Ut5.LJJZZIII(handler2, new ARunnableS89S0200000_20(c1273200jEk, this, 200));
        }
        Handler handler3 = this.LLILLL.LIZIZ;
        if (handler3 != null) {
            C786410Ut5.LJJZZIII(handler3, LJIIJ());
        }
    }

    public final void LJIILL(List<C1276780jKW> list) {
        Handler handler = this.LLILLL.LIZIZ;
        if (handler != null) {
            handler.removeCallbacks(LJIIJ());
        }
        Handler handler2 = this.LLILLL.LIZIZ;
        if (handler2 != null) {
            C786410Ut5.LJJZZIII(handler2, new ARunnableS89S0200000_20(list, this, 199));
        }
        Handler handler3 = this.LLILLL.LIZIZ;
        if (handler3 != null) {
            C786410Ut5.LJJZZIII(handler3, LJIIJ());
        }
    }

    @Override // X.C1269970j9X, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        String string;
        boolean z;
        if ((videoFrame.getBuffer() instanceof InterfaceC1271560jC6) && ((InterfaceC1271560jC6) videoFrame.getBuffer()).getType() == EnumC1273550jFJ.OES) {
            return;
        }
        if (bundle.containsKey("stream_id")) {
            string = bundle.getString("stream_id");
            z = false;
        } else {
            string = this.LLILLL.LIZ;
            if (string == null) {
                string = "";
            }
            z = true;
        }
        if (LJIIJJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SingleViewRender_");
            sbLIZ.append(this.LL);
            videoFrame.retain(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            videoFrame.retain();
        }
        Handler handler = this.LLILLL.LIZIZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS24S1200000_20(videoFrame, string, z, this, 14));
        }
    }
}
