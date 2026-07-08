package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1268020j6O implements InterfaceC1277660jLw {
    public final /* synthetic */ C1266350j3h LIZ;

    public C1268020j6O(C1266350j3h c1266350j3h) {
        this.LIZ = c1266350j3h;
    }

    @Override // X.InterfaceC1277660jLw
    public final void LIZ(int i) {
        C1269160j8E c1269160j8E;
        C1269910j9R c1269910j9RLJIJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VeLivePusherObserver onNetworkQualityV3:");
        sbLIZ.append(i);
        AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ.l.LIZ.mPushBase.LJIILLIIL() && (c1269160j8E = this.LIZ.LLILZLL) != null && (c1269910j9RLJIJJ = c1269160j8E.LJIJJ()) != null) {
            c1269910j9RLJIJJ.LJ(i, c1269910j9RLJIJJ.LIZIZ.LIZJ);
        }
    }

    @Override // X.InterfaceC1277660jLw
    public final void LIZIZ(C1278510jNJ c1278510jNJ) {
        if (this.LIZ.LLILZLL.LJLJI.LJJIFFI && c1278510jNJ.LIZIZ == EnumC1277870jMH.Send) {
            C1269520j8o.LIZ("start");
        }
    }

    @Override // X.InterfaceC1277660jLw
    public final void LIZJ(EnumC1270040j9e enumC1270040j9e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VeLivePusherObserver onStatusChange:");
        sbLIZ.append(enumC1270040j9e);
        AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJJZZIII(this.LIZ.LL, new ARunnableS89S0200000_20(this, enumC1270040j9e, 212));
    }

    @Override // X.InterfaceC1277660jLw
    public final void LIZLLL(EnumC1278980jO4 enumC1278980jO4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VeLivePusherObserver onNetworkQuality:");
        sbLIZ.append(enumC1278980jO4);
        AVLog.ioi("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        C1266350j3h c1266350j3h = this.LIZ;
        C1269160j8E c1269160j8E = c1266350j3h.LLILZLL;
        if (c1269160j8E != null && c1269160j8E.LJJJLZIJ && enumC1278980jO4 != null && enumC1278980jO4 != EnumC1278980jO4.Unknown) {
            int i = C1270020j9c.LJFF[enumC1278980jO4.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1266350j3h.LJJLIIIIJ(104, 10, 3);
                        return;
                    }
                    return;
                }
                c1266350j3h.LJJLIIIIJ(104, 10, 2);
                return;
            }
            c1266350j3h.LJJLIIIIJ(104, 10, 1);
        }
    }

    @Override // X.InterfaceC1277660jLw
    public final void LJ(EnumC1276060jJM enumC1276060jJM) {
        if (C1270020j9c.LIZIZ[enumC1276060jJM.ordinal()] == 1) {
            C1266350j3h c1266350j3h = this.LIZ;
            if (c1266350j3h.l.LIZ.mPushBase.LJIIIIZZ) {
                c1266350j3h.LLLIL();
            }
        }
    }

    @Override // X.InterfaceC1277660jLw
    public final void onAudioProfanityDetectedCallback(String str) {
        this.LIZ.LLLIILIL(50, 0, str);
    }

    @Override // X.InterfaceC1277660jLw
    public final void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        if (lyraxTranscoderFeatureEvent != null && lyraxTranscoderFeatureEvent.eventType != null) {
            this.LIZ.LLILZLL.LIZ.mVPassInteractCfg.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("eventType", lyraxTranscoderFeatureEvent.eventType.value());
                jSONObject.put("featureName", lyraxTranscoderFeatureEvent.featureName);
                jSONObject.put("errorCode", lyraxTranscoderFeatureEvent.errorCode);
                jSONObject.put("message", lyraxTranscoderFeatureEvent.message);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AVLog.logApiCall("LiveCoreAPI", "onFeatureEvent", jSONObject);
            C786410Ut5.LJJZZIII(this.LIZ.LL, new ARunnableS120S0100000_20(this, lyraxTranscoderFeatureEvent, 366));
        }
    }

    @Override // X.InterfaceC1277660jLw
    public final void LJFF(EnumC1270070j9h enumC1270070j9h, EnumC1270230j9x enumC1270230j9x, C1268030j6P c1268030j6P) throws Exception {
        int i;
        int i2;
        String str;
        C1267280j5C c1267280j5C;
        String stackTraceString = Log.getStackTraceString(new Throwable());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveStreamChangeFrom_log. stack:");
        sbLIZ.append(stackTraceString);
        AVLog.logKibana(4, "LiveStream", C2188811AlT.LIZIZ(sbLIZ), null);
        if (enumC1270070j9h != null && enumC1270230j9x != null) {
            if (C1271270jBd.LIZ.LIZ.LIZLLL) {
                int i3 = c1268030j6P.LIZJ;
                C1266350j3h c1266350j3h = this.LIZ;
                c1266350j3h.LLZZ = Math.max(c1266350j3h.LLZZ, i3);
                if (EnumC1270070j9h.Net.getCode() == enumC1270070j9h.getCode() && EnumC1270230j9x.Down.getCode() == enumC1270230j9x.getCode()) {
                    C1266350j3h c1266350j3h2 = this.LIZ;
                    c1266350j3h2.LLJJL(c1266350j3h2.LLZZ, i3, 1);
                }
            } else {
                C1266350j3h c1266350j3h3 = this.LIZ;
                c1266350j3h3.LLZLLLL = Math.max(c1266350j3h3.LLZLLLL, c1268030j6P.LIZIZ);
                if (EnumC1270070j9h.Net.getCode() == enumC1270070j9h.getCode() && EnumC1270230j9x.Down.getCode() == enumC1270230j9x.getCode()) {
                    C1266350j3h c1266350j3h4 = this.LIZ;
                    c1266350j3h4.LLJJL(c1266350j3h4.LLZLLLL, c1268030j6P.LIZIZ, 1);
                }
            }
            C1266350j3h c1266350j3h5 = this.LIZ;
            c1266350j3h5.getClass();
            EnumC1270070j9h enumC1270070j9h2 = EnumC1270070j9h.Net;
            if ((enumC1270070j9h == enumC1270070j9h2 || enumC1270070j9h == EnumC1270070j9h.Performance) && (i = c1268030j6P.LIZIZ) > 0 && (i2 = c1268030j6P.LIZJ) > 0 && c1268030j6P.LIZ > 0) {
                C1269160j8E c1269160j8E = c1266350j3h5.LLILZLL;
                c1269160j8E.getClass();
                C1269140j8C c1269140j8C = c1269160j8E.LJLJI;
                c1269140j8C.LJIILL = i;
                c1269140j8C.LJIILLIIL = i2;
                c1266350j3h5.LLILZLL.LJLJI.getClass();
                int i4 = C1270020j9c.LJ[enumC1270070j9h.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        str = "";
                    } else {
                        str = "performance";
                    }
                } else {
                    str = "network";
                }
                c1266350j3h5.LLLZLZ(-1, -1, str);
            }
            if (this.LIZ.LLJJ()) {
                C1266350j3h c1266350j3h6 = this.LIZ;
                c1266350j3h6.LLZILL = c1268030j6P.LIZIZ;
                c1266350j3h6.LLZL = c1268030j6P.LIZJ;
                c1266350j3h6.LLZLI = c1268030j6P.LIZ;
            }
            C1269160j8E c1269160j8E2 = this.LIZ.LLILZLL;
            if (c1269160j8E2 != null && c1269160j8E2.LIZLLL() && this.LIZ.LLILZLL.LJJII() == 3) {
                if (enumC1270070j9h == enumC1270070j9h2) {
                    C1266350j3h c1266350j3h7 = this.LIZ;
                    int i5 = c1266350j3h7.LLZZJLIL;
                    int i6 = c1266350j3h7.LLZZLLIL;
                    int i7 = c1266350j3h7.LLZZZIL;
                    int i8 = c1268030j6P.LIZIZ;
                    int i9 = c1268030j6P.LIZJ;
                    int i10 = c1268030j6P.LIZ;
                    HashMap map = new HashMap();
                    if (enumC1270230j9x == EnumC1270230j9x.Up) {
                        map.put("adaptive_strategy_name", "game_network_up");
                        map.put("adaptive_strategy_status", "up");
                        map.put("adaptive_strategy_status_list", "game_network_up");
                    } else if (enumC1270230j9x == EnumC1270230j9x.Down) {
                        map.put("adaptive_strategy_name", "game_network_down");
                        map.put("adaptive_strategy_status", "down");
                        map.put("adaptive_strategy_status_list", "game_network_down");
                    }
                    if (i5 == i8 && i6 == i9 && i7 == i10) {
                        map.put("adaptive_strategy_status", "default");
                        map.put("adaptive_strategy_status_list", "game_network_default");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(i8);
                        sbLIZ2.append("_");
                        sbLIZ2.append(i9);
                        sbLIZ2.append("_");
                        sbLIZ2.append(i10);
                        jSONObject.put("net_resolution_level", C2188811AlT.LIZIZ(sbLIZ2));
                        map.put("adaptive_strategy_level_list", C786410Ut5.J3(jSONObject));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1267280j5C c1267280j5C2 = c1266350j3h7.LLZZZZ;
                    if (c1267280j5C2 != null) {
                        c1267280j5C2.LJIIJ = map;
                    }
                } else if (enumC1270070j9h == EnumC1270070j9h.Performance && (c1267280j5C = this.LIZ.LLZZZZ) != null) {
                    c1267280j5C.LJIIJ = new HashMap();
                }
                C1266350j3h c1266350j3h8 = this.LIZ;
                int i11 = c1266350j3h8.LLZZJLIL;
                int i12 = c1266350j3h8.LLZZLLIL;
                int i13 = c1266350j3h8.LLZZZIL;
                int i14 = c1268030j6P.LIZIZ;
                c1266350j3h8.LLZZJLIL = i14;
                int i15 = c1268030j6P.LIZJ;
                c1266350j3h8.LLZZLLIL = i15;
                c1266350j3h8.LLZZZIL = c1268030j6P.LIZ;
                String strLLIIIL = c1266350j3h8.LLIIIL(i14, i15);
                if (strLLIIIL != null && !TextUtils.isEmpty(strLLIIIL)) {
                    this.LIZ.LLILZLL.LJJIIJ = strLLIIIL;
                    return;
                }
                C1266350j3h c1266350j3h9 = this.LIZ;
                c1266350j3h9.LLZZJLIL = i11;
                c1266350j3h9.LLZZLLIL = i12;
                c1266350j3h9.LLZZZIL = i13;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // X.InterfaceC1277660jLw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(int r9, int r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1268020j6O.onError(int, int, java.lang.String):void");
    }
}
