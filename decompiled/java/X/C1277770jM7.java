package X;

import Y.ARunnableS0S1102100_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277770jM7 extends C1279000jO6 {
    public final C1278910jNx LIZIZ;
    public final C1277850jMF LIZJ;
    public InterfaceC1277660jLw LIZLLL;
    public EnumC1278980jO4 LJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jLw, X.0jMF] */
    public C1277770jM7(C1278910jNx c1278910jNx) {
        this.LIZIZ = c1278910jNx;
        ?? r0 = new InterfaceC1277660jLw() { // from class: X.0jMF
            @Override // X.InterfaceC1277660jLw
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void LIZIZ(C1278510jNJ c1278510jNJ) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void LIZJ(EnumC1270040j9e enumC1270040j9e) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void LIZLLL(EnumC1278980jO4 enumC1278980jO4) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void LJ(EnumC1276060jJM enumC1276060jJM) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void LJFF(EnumC1270070j9h enumC1270070j9h, EnumC1270230j9x enumC1270230j9x, C1268030j6P c1268030j6P) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void onAudioProfanityDetectedCallback(String str) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void onError(int i, int i2, String str) {
            }

            @Override // X.InterfaceC1277660jLw
            public final void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
            }
        };
        this.LIZJ = r0;
        this.LIZLLL = r0;
        this.LJ = EnumC1278980jO4.Unknown;
        c1278910jNx.getClass();
        c1278910jNx.LJIIIIZZ = new WeakReference<>(this);
    }

    @Override // X.C1279000jO6
    public final void LIZIZ(C1278510jNJ c1278510jNJ) throws JSONException {
        this.LIZLLL.LIZIZ(c1278510jNJ);
        C1277760jM6 c1277760jM6 = this.LIZIZ.LIZLLL;
        if (c1277760jM6 != null) {
            c1277760jM6.reportFirstFrameEventsInternal$RtcEngine_release(c1278510jNJ);
        }
    }

    @Override // X.C1279000jO6
    public final void LIZJ(int i) {
        EnumC1270040j9e.Companion.getClass();
        EnumC1270040j9e enumC1270040j9eLIZ = C1270060j9g.LIZ(i);
        if (enumC1270040j9eLIZ != EnumC1270040j9e.None) {
            this.LIZLLL.LIZJ(enumC1270040j9eLIZ);
        }
    }

    @Override // X.C1279000jO6
    public final void LIZLLL(EnumC1278980jO4 enumC1278980jO4) {
        if (enumC1278980jO4 != this.LJ) {
            this.LJ = enumC1278980jO4;
            this.LIZLLL.LIZLLL(enumC1278980jO4);
        }
    }

    @Override // X.C1279000jO6
    public final void LJ(C1278870jNt c1278870jNt) {
        EnumC1278980jO4 enumC1278980jO4 = c1278870jNt.LJIILJJIL;
        C1278760jNi c1278760jNiLIZIZ = this.LIZIZ.LIZIZ();
        if (c1278760jNiLIZIZ != null && c1278760jNiLIZIZ.LLJ == C1278920jNy.LJFF && enumC1278980jO4 != this.LJ) {
            this.LJ = enumC1278980jO4;
            this.LIZLLL.LIZLLL(enumC1278980jO4);
        }
    }

    @Override // X.C1279000jO6
    public final void LIZ(int i, int i2, String str, Object... objArr) {
        C1278740jNg c1278740jNg;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code1", i).put("code2", i2).put("msg", str).put("exception", "null").put("stackTrace", "");
            if (objArr.length != 0) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : objArr) {
                    jSONArray.put(obj.toString());
                }
                jSONObject.put("extraArgs", jSONArray);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.ioe("VeLiveObserverWrapper", C786410Ut5.J3(jSONObject));
        WeakReference<C1278740jNg> weakReference = this.LIZIZ.LJI;
        if (weakReference != null && (c1278740jNg = weakReference.get()) != null) {
            C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS0S1102100_20(c1278740jNg, System.currentTimeMillis(), i, i2, C786410Ut5.J3(jSONObject), 1));
        }
        EnumC1270030j9d.Companion.getClass();
        this.LIZLLL.onError(C1270050j9f.LIZ(i).getCode(), i2, str);
    }
}
