package X;

import X.C1466990oHJ;
import X.C1467080oHS;
import X.C1467190oHd;
import X.C1467520oIA;
import X.C1468890oKN;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1467240oHi;
import X.InterfaceC1467290oHn;
import X.InterfaceC1468000oIw;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.fetcher.AVMDLURLFetcherBridge;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467080oHS extends C1467250oHj implements InterfaceC1467680oIQ, InterfaceC1470190oMT {
    public static boolean LJIIZILJ;
    public static C1467930oIp LJIJ;
    public final Context LJ;
    public Handler LJFF;
    public InterfaceC1467150oHZ LJI;
    public InterfaceC1468000oIw LJII;
    public final ArrayList<String> LJIIIIZZ;
    public final ArrayList<String> LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;

    @Override // X.InterfaceC1467180oHc
    public final /* synthetic */ void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1467180oHc
    public final /* synthetic */ void LJIIIZ() {
    }

    @Override // X.InterfaceC1467180oHc
    public final /* synthetic */ void LJIILJJIL(int i) {
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIJ() {
        this.LJIIJJI = null;
    }

    @Override // X.InterfaceC1467180oHc
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC1467180oHc
    public final /* synthetic */ void onReset() {
    }

    @Override // X.InterfaceC1467180oHc
    public final /* synthetic */ void onVideoSizeChanged(int i, int i2) {
    }

    @Override // X.InterfaceC1467910oIn
    public final String LIZJ() {
        return this.LJI.LIZJ();
    }

    @Override // X.InterfaceC1470190oMT
    public final void LJI() {
        InterfaceC1468000oIw interfaceC1468000oIw = this.LJII;
        if (interfaceC1468000oIw != null) {
            ((C1466990oHJ) interfaceC1468000oIw).LLLL(0L, "mdlcacheend");
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIIJJI() {
        C1466990oHJ c1466990oHJ = ((C1467520oIA) this.LIZLLL).LIZJ;
        if (!(c1466990oHJ.A1 == null && c1466990oHJ.LJIIIIZZ == null) && LJJ()) {
            LJJIIZI(5, 0L);
        }
    }

    public final void LJIJI() {
        this.LJI.LJJ(this, this.LJIIJ);
        if (this.LJIIIIZZ != null) {
            for (int i = 0; i < this.LJIIIIZZ.size(); i++) {
                this.LJI.LJJI((String) ListProtector.get(this.LJIIIIZZ, i));
            }
        }
        LJJIIJ();
        InterfaceC1467290oHn interfaceC1467290oHn = ((C1467520oIA) this.LIZLLL).LIZJ.LJIL;
        if (interfaceC1467290oHn.LIZJ()) {
            ((C1467190oHd) interfaceC1467290oHn).LJIIJ.clear();
        }
    }

    public final boolean LJJ() {
        return C790030Uyv.LIZ.LJII == 1 ? this.LJIIL == 1 : this.LJIILIIL > 0;
    }

    public final void LJJI() {
        int iLJIILIIL = this.LJI.LJIILIIL();
        if (iLJIILIIL == EnumC1469720oLi.InitializeError.ordinal()) {
            this.LIZJ.LIZ(176, this.LJI.LJIJJ());
        }
        this.LIZJ.LIZJ(175, iLJIILIIL);
    }

    public final void LJJIII() {
        if (this.LJIILLIIL || this.LIZIZ.LJIIJ(4302) <= 0) {
            return;
        }
        C1466990oHJ c1466990oHJ = ((C1467520oIA) this.LIZLLL).LIZJ;
        InterfaceC1467290oHn interfaceC1467290oHn = c1466990oHJ.LJIL;
        InterfaceC1467950oIr interfaceC1467950oIr = c1466990oHJ.A1;
        if (interfaceC1467950oIr == null && (interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ) == null) {
            return;
        }
        this.LJIILLIIL = true;
        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
        long jLJIIJ = c1470430oMr.LJIIJ(752, -1L);
        if (jLJIIJ > 0) {
            this.LJI.LJIJ(33, this.LIZ.LJIL, jLJIIJ, interfaceC1467290oHn.getVideoId());
        }
        long jLJIIJ2 = c1470430oMr.LJIIJ(753, -1L);
        if (jLJIIJ2 > 0) {
            this.LJI.LJIJ(32, this.LIZ.LJIL, jLJIIJ2, interfaceC1467290oHn.getVideoId());
        }
        this.LJI.LJIJ(31, this.LIZ.LJIL, this.LIZ.LJI, interfaceC1467290oHn.getVideoId());
        this.LJI.LJIJ(30, this.LIZ.LJIL, this.LIZ.LJIIIIZZ, interfaceC1467290oHn.getVideoId());
        this.LJI.LJIJ(22, this.LIZ.LJIL, this.LIZ.LJFF, interfaceC1467290oHn.getVideoId());
    }

    public final void LJJIIJ() {
        this.LJIIIIZZ.clear();
        this.LJIIIZ.clear();
        this.LJIIJ = null;
        ((ConcurrentHashMap) this.LIZ.LJJIFFI).clear();
    }

    public final void LJJIJ() {
        long jMax;
        C1466990oHJ c1466990oHJ = ((C1467520oIA) this.LIZLLL).LIZJ;
        InterfaceC1467950oIr interfaceC1467950oIr = c1466990oHJ.A1;
        if (interfaceC1467950oIr == null && (interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ) == null) {
            return;
        }
        if (LJJ() || this.LJI.LJIL()) {
            C1467070oHR c1467070oHR = this.LIZ;
            if (c1467070oHR.LJIILJJIL || c1467070oHR.LJIILL) {
                return;
            }
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
            long jLJIIJ = c1470430oMr.LJIIJ(73, -1L);
            long jLJIIJ2 = c1470430oMr.LJIIJ(72, -1L);
            int iLJI = c1470430oMr.LJI(62, 0);
            int iLJI2 = c1470430oMr.LJI(61, 0);
            if (iLJI == 1 && iLJI2 == 1) {
                jMax = Math.max(0L, Math.min(jLJIIJ, jLJIIJ2));
            } else if (iLJI2 == 1) {
                jMax = Math.max(0L, jLJIIJ);
            } else if (iLJI != 1) {
                return;
            } else {
                jMax = Math.max(0L, jLJIIJ2);
            }
            LJJIIZI(5, jMax);
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJJZZIII() {
        String videoId = ((C1467520oIA) this.LIZLLL).LIZJ.LJIL.getVideoId();
        if (this.LIZIZ.LJIIJ(4302) > 0) {
            this.LJI.LJIJ(29, this.LIZ.LJIL, System.currentTimeMillis(), videoId);
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void onRenderStart() {
        LJJIIZI(0, this.LIZ.LJFF);
        LJJIII();
    }

    @Override // X.InterfaceC1467180oHc
    public final void onStop() {
        LJIJI();
        C1468890oKN c1468890oKN = ((C1467520oIA) this.LIZLLL).LIZJ.N0;
        if (c1468890oKN != null) {
            c1468890oKN.LJ = 0L;
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJ() {
        LJJIII();
    }

    @Override // X.InterfaceC1467180oHc
    public final void onRelease() {
        LJIJI();
    }

    @Override // X.InterfaceC1467180oHc
    public final void LIZ(boolean z) {
        if (this.LJFF == null) {
            final Looper looperLJII = C795730VJj.LJII();
            this.LJFF = new BPEAHandler(looperLJII) { // from class: com.ss.ttvideoengine.component.DataLoaderComponentImpl$1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    HashMap<String, String> map;
                    InterfaceC1468000oIw interfaceC1468000oIw;
                    String str;
                    InterfaceC1468000oIw interfaceC1468000oIw2;
                    C1C7U.LIZ("DataLoaderComponentImpl@88f1.initUsingHandle$1");
                    super.handleMessage(message);
                    if (message.what == 10) {
                        String str2 = (String) HandlerHook.getMessageObj(message.obj);
                        long j = message.arg1;
                        int i = message.arg2;
                        InterfaceC1467290oHn interfaceC1467290oHn = ((C1467520oIA) this.LL.LIZLLL).LIZJ.LJIL;
                        if (interfaceC1467290oHn.LIZJ()) {
                            map = ((C1467190oHd) interfaceC1467290oHn).LJIIJ;
                        } else {
                            map = new HashMap<>();
                        }
                        String str3 = map.get("video");
                        String str4 = map.get("audio");
                        if (this.LL.LIZ.LIZIZ == 5) {
                            C1C7U.LIZIZ("DataLoaderComponentImpl@88f1.initUsingHandle$1");
                            return;
                        }
                        if (!TextUtils.isEmpty(str4) && str4.equals(str2)) {
                            this.LL.LIZJ.LJII(j);
                            this.LL.LIZJ.LIZJ(183, i);
                        } else if (!TextUtils.isEmpty(str3) && str3.equals(str2)) {
                            this.LL.LIZJ.LJ(j);
                            this.LL.LIZJ.LIZJ(182, i);
                        }
                        int iLJIIJ = this.LL.LIZIZ.LJIIJ(764);
                        if (iLJIIJ != 0 && String.valueOf(iLJIIJ).equals(str2)) {
                            C1467080oHS c1467080oHS = this.LL;
                            c1467080oHS.getClass();
                            C1468890oKN c1468890oKN = ((C1467520oIA) c1467080oHS.LIZLLL).LIZJ.N0;
                            if (c1468890oKN != null) {
                                c1468890oKN.LJ = j;
                            }
                            c1467080oHS.LIZJ.LJIILJJIL(j);
                            C1467080oHS c1467080oHS2 = this.LL;
                            InterfaceC1467240oHi interfaceC1467240oHi = c1467080oHS2.LIZJ;
                            int iLJIIJ2 = c1467080oHS2.LIZIZ.LJIIJ(767);
                            boolean z2 = true;
                            if (iLJIIJ2 != 1) {
                                z2 = false;
                            }
                            interfaceC1467240oHi.LJIILLIIL(z2);
                        }
                        ArrayList<String> arrayList = this.LL.LJIIIZ;
                        String str5 = "";
                        if (arrayList != null && arrayList.contains(str2)) {
                            C1467080oHS c1467080oHS3 = this.LL;
                            long j2 = c1467080oHS3.LJIILL + j;
                            c1467080oHS3.LJIILL = j2;
                            c1467080oHS3.LIZJ.LJIIIIZZ(j2);
                            this.LL.LIZJ.LIZJ(181, i);
                            if ((map.size() < 2 || map.containsValue(str2)) && (interfaceC1468000oIw2 = this.LL.LJII) != null) {
                                ((C1466990oHJ) interfaceC1468000oIw2).LLLL(j, "mdlfilepathhitcachesize");
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("using mdl cache, key :");
                            sbLIZ.append(str2);
                            sbLIZ.append(" size = ");
                            sbLIZ.append(j);
                            sbLIZ.append(" groupid = ");
                            if (!TextUtils.isEmpty(this.LL.LJIIJJI)) {
                                str5 = this.LL.LJIIJJI;
                            }
                            sbLIZ.append(str5);
                            sbLIZ.append(" miss reason = ");
                            sbLIZ.append(i);
                            C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            ArrayList<String> arrayList2 = this.LL.LJIIIIZZ;
                            if (arrayList2 != null && arrayList2.contains(str2)) {
                                C1467080oHS c1467080oHS4 = this.LL;
                                long j3 = c1467080oHS4.LJIILL + j;
                                c1467080oHS4.LJIILL = j3;
                                c1467080oHS4.LIZJ.LJIIIIZZ(j3);
                                if ((map.size() < 2 || map.containsValue(str2)) && (interfaceC1468000oIw = this.LL.LJII) != null) {
                                    ((C1466990oHJ) interfaceC1468000oIw).LLLL(j, "mdlhitcachesize");
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("using mdl cache, key :");
                                sbLIZ2.append(str2);
                                sbLIZ2.append(" size = ");
                                sbLIZ2.append(j);
                                sbLIZ2.append(" groupid = ");
                                if (!TextUtils.isEmpty(this.LL.LJIIJJI)) {
                                    str5 = this.LL.LJIIJJI;
                                }
                                sbLIZ2.append(str5);
                                sbLIZ2.append(" miss reason = ");
                                sbLIZ2.append(i);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                        String strLJIIJJI = this.LL.LIZIZ.LJIIJJI();
                        if (strLJIIJJI != null && strLJIIJJI.equals(str2)) {
                            this.LL.LIZJ.LJIILL(j);
                            this.LL.LIZJ.LIZJ(250, i);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("tts using mdl cache, ");
                            if (j > 0) {
                                str = "hit";
                            } else {
                                str = "miss";
                            }
                            sbLIZ3.append(str);
                            sbLIZ3.append(", key :");
                            sbLIZ3.append(str2);
                            sbLIZ3.append(" size = ");
                            sbLIZ3.append(j);
                            sbLIZ3.append(" groupid = ");
                            sbLIZ3.append(this.LL.LJIIJJI);
                            sbLIZ3.append(" miss reason = ");
                            sbLIZ3.append(i);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    }
                    C1C7U.LIZIZ("DataLoaderComponentImpl@88f1.initUsingHandle$1");
                }
            };
        }
    }

    @Override // X.InterfaceC1467680oIQ
    public final String LIZIZ(String str) {
        String str2;
        InterfaceC1467150oHZ interfaceC1467150oHZ = this.LJI;
        if (TextUtils.isEmpty(this.LJIIJJI)) {
            str2 = str;
        } else {
            str2 = this.LJIIJJI;
        }
        String strLIZIZ = interfaceC1467150oHZ.LIZIZ(str2);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            this.LJI.LJIIZILJ(str);
        }
        return strLIZIZ;
    }

    @Override // X.InterfaceC1467680oIQ
    public final String LIZLLL(String str) {
        return this.LJI.LIZLLL(str);
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJFF(e eVar) {
        String strLIZLLL;
        if (this.LIZIZ.LJIIJ(4302) > 0 && eVar.LIZ < 0) {
            this.LJI.LJIJ(34, this.LIZ.LJIL, eVar.LIZ, ((C1467520oIA) this.LIZLLL).LIZJ.LJIL.getVideoId());
        }
        if (this.LJIILJJIL != 0 && this.LJI.LJIIJ(9018) != 0) {
            if (this.LJI.LJIIJ(9020) != 0 || this.LJI.LJ(eVar.LIZ)) {
                HashMap map = null;
                if (this.LJIILJJIL != 0) {
                    map = new HashMap();
                    synchronized (this) {
                        try {
                            strLIZLLL = this.LJI.LIZLLL(this.LIZ.LJIL);
                        } finally {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (strLIZLLL != null && !TextUtils.isEmpty(strLIZLLL)) {
                        try {
                            JSONObject jSONObject = new JSONObject(strLIZLLL);
                            try {
                                if (!jSONObject.isNull("err_code")) {
                                    map.put("mdl_err_code", Integer.valueOf(((Number) jSONObject.get("err_code")).intValue()));
                                }
                                if (!jSONObject.isNull("sub_err_code")) {
                                    map.put("mdl_sub_err_code", Integer.valueOf(((Number) jSONObject.get("sub_err_code")).intValue()));
                                }
                            } catch (Exception e) {
                            }
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
                eVar.LJ.putAll(map);
            }
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIIJ(e eVar) {
        String str;
        C1467670oIP c1467670oIP = this.LIZ.LJJ;
        if (c1467670oIP.LIZJ) {
            str = c1467670oIP.LIZIZ;
        } else {
            str = c1467670oIP.LIZ;
        }
        if ((eVar.LIZJ.equals("kTTVideoErrorDomainVideoOSPlayer") || eVar.equals("kTTVideoErrorDomainVideoExoPlayer") || eVar.LIZ == -499975) && !TextUtils.isEmpty(str) && str.startsWith("mdl")) {
            InterfaceC1467290oHn interfaceC1467290oHn = ((C1467520oIA) this.LIZLLL).LIZJ.LJIL;
            if (interfaceC1467290oHn.LIZ() && interfaceC1467290oHn.getUrl().startsWith("mdl")) {
                this.LJI.setIntValue(1004, -1);
                interfaceC1467290oHn.setUrl(this.LJI.LJII(interfaceC1467290oHn.getUrl()));
                return;
            }
            if (!TextUtils.isEmpty(str) && str.startsWith("mdl")) {
                this.LJI.setIntValue(1004, -1);
                String strLJII = this.LJI.LJII(str);
                C1467670oIP c1467670oIP2 = this.LIZ.LJJ;
                c1467670oIP2.LIZ = strLJII;
                c1467670oIP2.LIZJ = false;
                return;
            }
            if (!eVar.LIZJ.equals("kTTVideoErrorDomainVideoOSPlayer") && !eVar.LIZJ.equals("kTTVideoErrorDomainVideoExoPlayer")) {
                return;
            }
            this.LJI.setIntValue(1004, -1);
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIIL(int i) {
        C1467070oHR c1467070oHR = this.LIZ;
        int i2 = c1467070oHR.LIZJ;
        if (i2 != 2 && i2 != 3 && i == 0 && c1467070oHR.LJIILIIL && !c1467070oHR.LJIIL) {
            long jLJI = this.LIZJ.LJI();
            LJJIIZI(3, jLJI);
            if (this.LIZIZ.LJIIJ(4302) > 0) {
                this.LJI.LJIJ(25, this.LIZ.LJIL, jLJI, ((C1467520oIA) this.LIZLLL).LIZJ.LJIL.getVideoId());
            }
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIILIIL(int i) {
        LJJIIZI(1, i);
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIILL(int i) {
        LJJIIZI(6, 1L);
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIILLIIL(Map<String, Object> map) {
        if (map != null && map.containsKey("only_local_url_player") && ((Boolean) map.get("only_local_url_player")).booleanValue()) {
            this.LJI = new InterfaceC1467150oHZ() { // from class: X.0oIC
                @Override // X.InterfaceC1467150oHZ
                public final long LIZ() {
                    return 0L;
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LIZIZ(String str) {
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LIZLLL(String str) {
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean LJ(int i) {
                    return false;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJFF() {
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJI(JSONObject jSONObject, long j) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJII(String str) {
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIIIZZ(int i) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJIIIZ(String str, String str2, long j, String[] strArr, EnumC2281151EQn enumC2281151EQn, String str3, C1474520oTS c1474520oTS, String str4, String str5, boolean z, boolean z2, String str6, long j2) {
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final int LJIIJ(int i) {
                    return 0;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIJJI() {
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIL(InterfaceC1470190oMT interfaceC1470190oMT, String str) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final int LJIILIIL() {
                    return 0;
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean LJIILJJIL() {
                    return false;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIILL(boolean z) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJIILLIIL(String str, int i) {
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIZILJ(String str) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIJ(int i, String str, long j, String str2) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final int LJIJI() {
                    return 0;
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJIJJ() {
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIJJLI(int i, String str, long j, String str2) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean LJIL() {
                    return false;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJJ(InterfaceC1470190oMT interfaceC1470190oMT, String str) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJJI(String str) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJJIFFI(String str) {
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean isRunning() {
                    return false;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void setIntValue(int i, int i2) {
                }
            };
        } else {
            this.LJI = new InterfaceC1467150oHZ() { // from class: X.0oNz
                @Override // X.InterfaceC1467150oHZ
                public final long LIZ() {
                    return C805420Vie.LIZ.LJJIJIIJI(1003);
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LIZJ() {
                    return C805420Vie.LIZ.LJJIJIL(6);
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJFF() {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (!C1474810oTv.LJJIFFI()) {
                        if (dataLoaderHelper.LIZIZ != 0) {
                            int i = C2187451AjH.LIZ;
                            TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
                            return;
                        } else {
                            if (dataLoaderHelper.LJJJIL > 0) {
                                dataLoaderHelper.LJJ.LIZJ(1);
                                dataLoaderHelper.LJIIIIZZ.setIntValue(7410, C790010Uyt.LJ().LIZIZ);
                                C1468070oJ3.LIZ().getClass();
                                dataLoaderHelper.LJIIIIZZ.setIntValue(7409, -1);
                                dataLoaderHelper.LJJ.LJFF(1);
                                return;
                            }
                            return;
                        }
                    }
                    dataLoaderHelper.LJLJJL.getClass();
                    if (dataLoaderHelper.LIZIZ != 0) {
                        int i2 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
                    } else if (dataLoaderHelper.LJJJIL > 0) {
                        dataLoaderHelper.LJJ.LIZJ(1);
                        dataLoaderHelper.LJIIIIZZ.setIntValue(7410, C790010Uyt.LJ().LIZIZ);
                        C1468070oJ3.LIZ().getClass();
                        dataLoaderHelper.LJIIIIZZ.setIntValue(7409, -1);
                        dataLoaderHelper.LJJ.LJFF(1);
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIJJI() {
                    C805420Vie.LIZ.LJJI();
                }

                @Override // X.InterfaceC1467150oHZ
                public final int LJIILIIL() {
                    return C805420Vie.LIZ.LJJL;
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean LJIILJJIL() {
                    return C805420Vie.LIZ.LJIJI;
                }

                @Override // X.InterfaceC1467150oHZ
                public final int LJIJI() {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    int i = dataLoaderHelper.LJJJZ;
                    dataLoaderHelper.LJJJZ = EnumC1469040oKc.None.ordinal();
                    return i;
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJIJJ() {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    String str = dataLoaderHelper.LJJLIIIIJ;
                    if (str == null) {
                        return null;
                    }
                    dataLoaderHelper.LJJLIIIIJ = null;
                    return str;
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean LJIL() {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (!C1474810oTv.LJJIFFI()) {
                        if (dataLoaderHelper.LJJJI <= 0) {
                            return false;
                        }
                        C1476180oW8 c1476180oW8 = dataLoaderHelper.LJJJJL;
                        return c1476180oW8.LIZ > 0 && c1476180oW8.LIZIZ > 0;
                    }
                    dataLoaderHelper.LJLILLLLZI.getClass();
                    if (dataLoaderHelper.LJJJI <= 0) {
                        return false;
                    }
                    C1476180oW8 c1476180oW82 = dataLoaderHelper.LJJJJL;
                    return c1476180oW82.LIZ > 0 && c1476180oW82.LIZIZ > 0;
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean isRunning() {
                    return C805420Vie.LIZ.LJJJ();
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LIZIZ(String str) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    String stringValueByStr = null;
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLJI.getClass();
                        if (!TextUtils.isEmpty(str)) {
                            dataLoaderHelper.LJJ.LIZJ(1);
                            try {
                                try {
                                    AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                                    if (aVMDLDataLoader != null) {
                                        stringValueByStr = aVMDLDataLoader.getStringValueByStr(str, 1012);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    int i = C2187451AjH.LIZ;
                                    TTVideoEngineLog.d(e);
                                }
                                dataLoaderHelper.LJJ.LJFF(1);
                                return stringValueByStr;
                            } finally {
                            }
                        }
                    } else if (!TextUtils.isEmpty(str)) {
                        dataLoaderHelper.LJJ.LIZJ(1);
                        try {
                            try {
                                AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                                if (aVMDLDataLoader2 != null) {
                                    stringValueByStr = aVMDLDataLoader2.getStringValueByStr(str, 1012);
                                }
                            } finally {
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            int i2 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d(e2);
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                        return stringValueByStr;
                    }
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LIZLLL(String str) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    String stringValueByStr = null;
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLJI.getClass();
                        if (!TextUtils.isEmpty(str)) {
                            dataLoaderHelper.LJJ.LIZJ(1);
                            try {
                                try {
                                    AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
                                    if (aVMDLDataLoader != null) {
                                        stringValueByStr = aVMDLDataLoader.getStringValueByStr(str, 1010);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    int i = C2187451AjH.LIZ;
                                    TTVideoEngineLog.d(e);
                                }
                                dataLoaderHelper.LJJ.LJFF(1);
                                return stringValueByStr;
                            } finally {
                            }
                        }
                    } else if (!TextUtils.isEmpty(str)) {
                        dataLoaderHelper.LJJ.LIZJ(1);
                        try {
                            try {
                                AVMDLDataLoader aVMDLDataLoader2 = dataLoaderHelper.LJIIIIZZ;
                                if (aVMDLDataLoader2 != null) {
                                    stringValueByStr = aVMDLDataLoader2.getStringValueByStr(str, 1010);
                                }
                            } finally {
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            int i2 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d(e2);
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                        return stringValueByStr;
                    }
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final boolean LJ(int i) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLJI.getClass();
                        return dataLoaderHelper.LJJJLZIJ.contains(Integer.valueOf(i));
                    }
                    if (dataLoaderHelper.LJJJLZIJ.contains(Integer.valueOf(i))) {
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJII(String str) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLIL.getClass();
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                if (str.startsWith("mdl://")) {
                                    int iIndexOf = str.indexOf("?");
                                    if (iIndexOf != -1) {
                                        String localAddr = dataLoaderHelper.LJIIIIZZ.getLocalAddr();
                                        if (!TextUtils.isEmpty(localAddr)) {
                                            StringBuffer stringBuffer = new StringBuffer("http://");
                                            stringBuffer.append(localAddr);
                                            stringBuffer.append(str.substring(iIndexOf));
                                            String string = stringBuffer.toString();
                                            int i = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("_proxyUrl: ");
                                            sbLIZ.append(string);
                                            C1471660oOq.LIZIZ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                                            return string;
                                        }
                                    }
                                }
                                return str;
                            }
                            return null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("get proxy url failed: ");
                            sbLIZ2.append(str);
                            C1471660oOq.LIZIZ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            return str;
                        }
                    }
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            if (str.startsWith("mdl://")) {
                                int iIndexOf2 = str.indexOf("?");
                                if (iIndexOf2 != -1) {
                                    String localAddr2 = dataLoaderHelper.LJIIIIZZ.getLocalAddr();
                                    if (!TextUtils.isEmpty(localAddr2)) {
                                        StringBuffer stringBuffer2 = new StringBuffer("http://");
                                        stringBuffer2.append(localAddr2);
                                        stringBuffer2.append(str.substring(iIndexOf2));
                                        String string2 = stringBuffer2.toString();
                                        int i3 = C2187451AjH.LIZ;
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("_proxyUrl: ");
                                        sbLIZ3.append(string2);
                                        C1471660oOq.LIZIZ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                        return string2;
                                    }
                                }
                            }
                            return str;
                        }
                        return null;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        int i4 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("get proxy url failed: ");
                        sbLIZ4.append(str);
                        C1471660oOq.LIZIZ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
                        return str;
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIIIZZ(int i) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJJLIIJ.getClass();
                        dataLoaderHelper.LJJ.LIZJ(1);
                        if (dataLoaderHelper.LJIIIZ.mLoaderType != i && i != 0) {
                            try {
                                try {
                                    dataLoaderHelper.LJIIIIZZ.setIntValue(7227, i);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    int i2 = C2187451AjH.LIZ;
                                    TTVideoEngineLog.d("DataLoaderHelper", "set backup loader type failed");
                                }
                                dataLoaderHelper.LJJ.LJFF(1);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                dataLoaderHelper.LJJ.LJFF(1);
                                throw th;
                            }
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                        return;
                    }
                    dataLoaderHelper.LJJ.LIZJ(1);
                    if (dataLoaderHelper.LJIIIZ.mLoaderType != i && i != 0) {
                        try {
                            try {
                                dataLoaderHelper.LJIIIIZZ.setIntValue(7227, i);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                int i3 = C2187451AjH.LIZ;
                                TTVideoEngineLog.d("DataLoaderHelper", "set backup loader type failed");
                            }
                            dataLoaderHelper.LJJ.LJFF(1);
                            return;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            dataLoaderHelper.LJJ.LJFF(1);
                            throw th2;
                        }
                    }
                    dataLoaderHelper.LJJ.LJFF(1);
                }

                @Override // X.InterfaceC1467150oHZ
                public final int LJIIJ(int i) {
                    return C805420Vie.LIZ.LJJIJ(i);
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIILL(boolean z) {
                    C805420Vie.LIZ.LJIJI = z;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIZILJ(String str) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLJI.getClass();
                        if (!TextUtils.isEmpty(str)) {
                            dataLoaderHelper.LJJ.LIZJ(1);
                            try {
                                try {
                                    if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
                                        dataLoaderHelper.LJIIIIZZ.resetPreloadTraceId(str);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    int i = C2187451AjH.LIZ;
                                    TTVideoEngineLog.d(e);
                                }
                                dataLoaderHelper.LJJ.LJFF(1);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                dataLoaderHelper.LJJ.LJFF(1);
                                throw th;
                            }
                        }
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        dataLoaderHelper.LJJ.LIZJ(1);
                        try {
                            try {
                                if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
                                    dataLoaderHelper.LJIIIIZZ.resetPreloadTraceId(str);
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                int i2 = C2187451AjH.LIZ;
                                TTVideoEngineLog.d(e2);
                            }
                            dataLoaderHelper.LJJ.LJFF(1);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            dataLoaderHelper.LJJ.LJFF(1);
                            throw th2;
                        }
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJJI(String str) {
                    C805420Vie.LIZ.LJFF.LJI(str);
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJJIFFI(String str) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    if (dataLoaderHelper.LJIIIIZZ != null) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ioprepare notifyPlayStart ");
                        sbLIZ.append(str);
                        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                        dataLoaderHelper.LJIIIIZZ.notifyPlayStart(str);
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJI(JSONObject jSONObject, long j) {
                    String next;
                    String next2;
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLJJL.getClass();
                        if (jSONObject == null) {
                            int i = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("DataLoaderHelper", "ip direct info invalid");
                            return;
                        }
                        long j2 = C787250UuR.LIZ;
                        if (j2 != -1 && 1000 * j < j2) {
                            int i2 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("DataLoaderHelper", "network did change, dnsinfo is invalid");
                            return;
                        }
                        dataLoaderHelper.LJJ.LIZJ(1);
                        try {
                            try {
                                Iterator<String> itKeys = jSONObject.keys();
                                do {
                                    next2 = itKeys.next();
                                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next2);
                                    String strLIZIZ = "";
                                    for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(strLIZIZ);
                                        sbLIZ.append(jSONArrayOptJSONArray.optString(i3));
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        if (i3 < jSONArrayOptJSONArray.length() - 1) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(strLIZIZ);
                                            sbLIZ2.append(",");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                    }
                                    AVMDLDNSParser.updateDNSInfo(next2, strLIZIZ, j);
                                    if (!itKeys.hasNext()) {
                                        break;
                                    }
                                } while (!TextUtils.isEmpty(next2));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                int i4 = C2187451AjH.LIZ;
                                C1471660oOq.LIZIZ("DataLoaderHelper", e.toString());
                            }
                            dataLoaderHelper.LJJ.LJFF(1);
                            return;
                        } finally {
                        }
                    }
                    if (jSONObject == null) {
                        int i5 = C2187451AjH.LIZ;
                        C1471660oOq.LIZIZ("DataLoaderHelper", "ip direct info invalid");
                        return;
                    }
                    long j3 = C787250UuR.LIZ;
                    if (j3 != -1 && 1000 * j < j3) {
                        int i6 = C2187451AjH.LIZ;
                        C1471660oOq.LIZIZ("DataLoaderHelper", "network did change, dnsinfo is invalid");
                        return;
                    }
                    dataLoaderHelper.LJJ.LIZJ(1);
                    try {
                        try {
                            Iterator<String> itKeys2 = jSONObject.keys();
                            do {
                                next = itKeys2.next();
                                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(next);
                                String strLIZIZ2 = "";
                                for (int i7 = 0; i7 < jSONArrayOptJSONArray2.length(); i7++) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(strLIZIZ2);
                                    sbLIZ3.append(jSONArrayOptJSONArray2.optString(i7));
                                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                                    if (i7 < jSONArrayOptJSONArray2.length() - 1) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(strLIZIZ2);
                                        sbLIZ4.append(",");
                                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                                    }
                                }
                                AVMDLDNSParser.updateDNSInfo(next, strLIZIZ2, j);
                                if (!itKeys2.hasNext()) {
                                    break;
                                }
                            } while (!TextUtils.isEmpty(next));
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            int i8 = C2187451AjH.LIZ;
                            C1471660oOq.LIZIZ("DataLoaderHelper", e2.toString());
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                    } finally {
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIIL(InterfaceC1470190oMT interfaceC1470190oMT, String str) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJJLJ.getClass();
                        if (!TextUtils.isEmpty(str) && interfaceC1470190oMT != null) {
                            try {
                                dataLoaderHelper.LJII.lock();
                                ArrayList<WeakReference<InterfaceC1470190oMT>> arrayList = dataLoaderHelper.LJI.get(str);
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                    dataLoaderHelper.LJI.put(str, arrayList);
                                }
                                C2032207xg c2032207xg = new C2032207xg(interfaceC1470190oMT);
                                if (!arrayList.contains(c2032207xg)) {
                                    arrayList.add(c2032207xg);
                                    int i = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("add engine ref,rawKey = ");
                                    sbLIZ.append(str);
                                    sbLIZ.append(" engine ref count: ");
                                    sbLIZ.append(arrayList.size());
                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                                }
                                dataLoaderHelper.LJII.unlock();
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    if (!TextUtils.isEmpty(str) && interfaceC1470190oMT != null) {
                        try {
                            dataLoaderHelper.LJII.lock();
                            ArrayList<WeakReference<InterfaceC1470190oMT>> arrayList2 = dataLoaderHelper.LJI.get(str);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList<>();
                                dataLoaderHelper.LJI.put(str, arrayList2);
                            }
                            C2032207xg c2032207xg2 = new C2032207xg(interfaceC1470190oMT);
                            if (!arrayList2.contains(c2032207xg2)) {
                                arrayList2.add(c2032207xg2);
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("add engine ref,rawKey = ");
                                sbLIZ2.append(str);
                                sbLIZ2.append(" engine ref count: ");
                                sbLIZ2.append(arrayList2.size());
                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            dataLoaderHelper.LJII.unlock();
                        } finally {
                        }
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJIILLIIL(String str, int i) {
                    AVMDLDataLoader aVMDLDataLoader = C805420Vie.LIZ.LJIIIIZZ;
                    if (aVMDLDataLoader != null) {
                        return aVMDLDataLoader.notifyPlayStop(str, i);
                    }
                    return null;
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJJ(InterfaceC1470190oMT interfaceC1470190oMT, String str) {
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJJLJ.getClass();
                        if (!TextUtils.isEmpty(str) && interfaceC1470190oMT != null) {
                            try {
                                dataLoaderHelper.LJII.lock();
                                ArrayList<WeakReference<InterfaceC1470190oMT>> arrayList = dataLoaderHelper.LJI.get(str);
                                if (arrayList != null) {
                                    arrayList.remove(new C2032207xg(interfaceC1470190oMT));
                                    int i = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("remove listener ref,rawKey = ");
                                    sbLIZ.append(str);
                                    sbLIZ.append(" listener ref count: ");
                                    sbLIZ.append(arrayList.size());
                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                                    if (arrayList.size() == 0) {
                                        dataLoaderHelper.LJI.remove(str);
                                        C1476180oW8 c1476180oW8 = dataLoaderHelper.LJJJJL;
                                        if (c1476180oW8.LIZ > 0 && c1476180oW8.LIZIZ > 0) {
                                            c1476180oW8.LIZJ.lock();
                                            if (c1476180oW8.LIZLLL.containsKey(str)) {
                                                c1476180oW8.LIZLLL.remove(str);
                                            }
                                            c1476180oW8.LIZJ.unlock();
                                        }
                                    }
                                }
                                dataLoaderHelper.LJII.unlock();
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    if (!TextUtils.isEmpty(str) && interfaceC1470190oMT != null) {
                        try {
                            dataLoaderHelper.LJII.lock();
                            ArrayList<WeakReference<InterfaceC1470190oMT>> arrayList2 = dataLoaderHelper.LJI.get(str);
                            if (arrayList2 != null) {
                                arrayList2.remove(new C2032207xg(interfaceC1470190oMT));
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("remove listener ref,rawKey = ");
                                sbLIZ2.append(str);
                                sbLIZ2.append(" listener ref count: ");
                                sbLIZ2.append(arrayList2.size());
                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                if (arrayList2.size() == 0) {
                                    dataLoaderHelper.LJI.remove(str);
                                    C1476180oW8 c1476180oW82 = dataLoaderHelper.LJJJJL;
                                    if (c1476180oW82.LIZ > 0 && c1476180oW82.LIZIZ > 0) {
                                        c1476180oW82.LIZJ.lock();
                                        if (c1476180oW82.LIZLLL.containsKey(str)) {
                                            c1476180oW82.LIZLLL.remove(str);
                                        }
                                        c1476180oW82.LIZJ.unlock();
                                    }
                                }
                            }
                            dataLoaderHelper.LJII.unlock();
                        } finally {
                        }
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final void setIntValue(int i, int i2) {
                    C805420Vie.LIZ.LJJJJL(i, i2);
                }

                /* JADX WARN: Finally extract failed */
                @Override // X.InterfaceC1467150oHZ
                public final void LJIJ(int i, String str, long j, String str2) {
                    int i2;
                    int i3;
                    DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                    dataLoaderHelper.getClass();
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLILLLLZI.getClass();
                        if (dataLoaderHelper.LIZIZ != 0) {
                            int i4 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
                            return;
                        }
                        dataLoaderHelper.LJJ.LIZJ(1);
                        C1471140oO0.LIZ(i, str2, j, dataLoaderHelper);
                        switch (i) {
                            case 22:
                                i3 = 7210;
                                break;
                            case 23:
                                i3 = 7211;
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                i3 = 7212;
                                break;
                            case 25:
                                i3 = 7213;
                                break;
                            case 26:
                                i3 = 7214;
                                break;
                            case 27:
                                i3 = 7215;
                                break;
                            case 28:
                                i3 = 7338;
                                break;
                            case 29:
                                i3 = 7447;
                                break;
                            case 30:
                                i3 = 7448;
                                break;
                            case 31:
                                i3 = 7449;
                                break;
                            case 32:
                                i3 = 7450;
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                i3 = 7451;
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                i3 = 7452;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        try {
                            try {
                                dataLoaderHelper.LJIIIIZZ.setInt64ValueByStrKey(i3, str, j);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            dataLoaderHelper.LJJ.LJFF(1);
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            dataLoaderHelper.LJJ.LJFF(1);
                            throw th;
                        }
                    }
                    if (dataLoaderHelper.LIZIZ != 0) {
                        int i5 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
                        return;
                    }
                    dataLoaderHelper.LJJ.LIZJ(1);
                    dataLoaderHelper.LJJJJLI(i, j, str2);
                    switch (i) {
                        case 22:
                            i2 = 7210;
                            break;
                        case 23:
                            i2 = 7211;
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            i2 = 7212;
                            break;
                        case 25:
                            i2 = 7213;
                            break;
                        case 26:
                            i2 = 7214;
                            break;
                        case 27:
                            i2 = 7215;
                            break;
                        case 28:
                            i2 = 7338;
                            break;
                        case 29:
                            i2 = 7447;
                            break;
                        case 30:
                            i2 = 7448;
                            break;
                        case 31:
                            i2 = 7449;
                            break;
                        case 32:
                            i2 = 7450;
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            i2 = 7451;
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            i2 = 7452;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    try {
                        try {
                            dataLoaderHelper.LJIIIIZZ.setInt64ValueByStrKey(i2, str, j);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        dataLoaderHelper.LJJ.LJFF(1);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        dataLoaderHelper.LJJ.LJFF(1);
                        throw th2;
                    }
                }

                @Override // X.InterfaceC1467150oHZ
                public final void LJIJJLI(int i, String str, long j, String str2) {
                    C805420Vie.LIZ.LJJJJLI(i, j, str2);
                }

                @Override // X.InterfaceC1467150oHZ
                public final String LJIIIZ(String str, String str2, long j, String[] strArr, EnumC2281151EQn enumC2281151EQn, String str3, C1474520oTS c1474520oTS, String str4, String str5, boolean z, boolean z2, String str6, long j2) {
                    return C805420Vie.LIZ.LJIILIIL(str, str2, j, strArr, enumC2281151EQn, str3, c1474520oTS, str4, str5, z, z2, str6, 0);
                }
            };
        }
        Context context = this.LJ;
        if (LJIJ == null) {
            LJIJ = new C1467930oIp(context);
        }
        AVMDLURLFetcherBridge.setFetcherMaker(LJIJ);
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIIZILJ(boolean z) {
        long jMax;
        C1466990oHJ c1466990oHJ = ((C1467520oIA) this.LIZLLL).LIZJ;
        InterfaceC1467950oIr interfaceC1467950oIr = c1466990oHJ.A1;
        if ((interfaceC1467950oIr != null || (interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ) != null) && LJJ()) {
            C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
            long jLJIIJ = c1470430oMr.LJIIJ(73, -1L);
            long jLJIIJ2 = c1470430oMr.LJIIJ(72, -1L);
            int iLJI = c1470430oMr.LJI(62, 0);
            int iLJI2 = c1470430oMr.LJI(61, 0);
            if (iLJI == 1 && iLJI2 == 1) {
                jMax = Math.max(0L, Math.min(jLJIIJ, jLJIIJ2));
            } else if (iLJI2 == 1) {
                jMax = Math.max(0L, jLJIIJ);
            } else if (iLJI != 1) {
                return;
            } else {
                jMax = Math.max(0L, jLJIIJ2);
            }
            LJJIIZI(5, jMax);
        }
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJIJJ(int i) {
        if (i == 0 && this.LIZ.LJIIIZ > 0 && SystemClock.elapsedRealtime() >= this.LIZ.LJIIIZ) {
            LJJIIZI(4, 1L);
            if (this.LIZIZ.LJIIJ(4302) > 0) {
                this.LJI.LJIJ(26, this.LIZ.LJIL, 1L, ((C1467520oIA) this.LIZLLL).LIZJ.LJIL.getVideoId());
            }
        }
    }

    public final int LJIL(int i) {
        if (i != 12) {
            if (i != 301) {
                if (i != 1150 && i != 9009 && i != 13001 && i != 13003) {
                    return -1;
                }
            } else {
                return this.LJIILIIL;
            }
        }
        return this.LJI.LJIIJ(i);
    }

    public final String LJJIFFI(C1467360oHu c1467360oHu) {
        String str;
        String strLJJII = LJJII(c1467360oHu);
        int iLJIJI = this.LJI.LJIJI();
        if (iLJIJI > 0) {
            this.LIZJ.LIZJ(174, iLJIJI);
            if (iLJIJI == EnumC1469040oKc.StateError.ordinal()) {
                LJJI();
            }
        }
        if (!TextUtils.isEmpty(strLJJII)) {
            if (strLJJII.startsWith("mdl://")) {
                this.LIZJ.LJIIJJI(2);
                if (this.LIZ.LJIIJJI) {
                    this.LIZJ.LIZJ(173, 2);
                }
            } else {
                this.LIZJ.LJIIJJI(1);
                if (this.LIZ.LJIIJJI) {
                    this.LIZJ.LIZJ(173, 1);
                }
            }
            this.LIZJ.LJFF(strLJJII);
            if (TextUtils.isEmpty(c1467360oHu.LIZIZ)) {
                str = c1467360oHu.LIZ;
            } else {
                str = c1467360oHu.LIZIZ;
            }
            this.LJIIJ = str;
            if (!TextUtils.isEmpty(c1467360oHu.LJII)) {
                this.LJIIIZ.add(c1467360oHu.LJII);
            }
            if (!TextUtils.isEmpty(c1467360oHu.LIZ)) {
                this.LJIIIIZZ.add(c1467360oHu.LIZ);
            }
            this.LJI.LJIIL(this, this.LJIIJ);
        }
        return strLJJII;
    }

    public final String LJJII(C1467360oHu c1467360oHu) {
        return this.LJI.LJIIIZ(c1467360oHu.LIZ, c1467360oHu.LIZIZ, c1467360oHu.LIZJ, c1467360oHu.LIZLLL, c1467360oHu.LJ, c1467360oHu.LJFF, c1467360oHu.LJI, c1467360oHu.LJII, c1467360oHu.LJIIIIZZ, c1467360oHu.LJIIIZ, c1467360oHu.LJIIJ, c1467360oHu.LJIIJJI, c1467360oHu.LJIIL);
    }

    public final void LJJIIJZLJL(boolean z) {
        final ArrayList arrayList;
        C1474520oTS c1474520oTS;
        String strLJIIJJI;
        if (this.LJIILJJIL <= 0) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(this.LJIIIZ);
        if (!z) {
            this.LJIILL = 0L;
            InterfaceC1467290oHn interfaceC1467290oHn = ((C1467520oIA) this.LIZLLL).LIZJ.LJIL;
            if (interfaceC1467290oHn.LIZJ()) {
                C1467190oHd c1467190oHd = (C1467190oHd) interfaceC1467290oHn;
                HashMap<String, String> map = c1467190oHd.LJIIJ;
                c1474520oTS = c1467190oHd.LJIIIIZZ;
                if (map != null && map.size() == 2) {
                    arrayList = new ArrayList(map.values());
                }
                strLJIIJJI = this.LIZIZ.LJIIJJI();
                if (!TextUtils.isEmpty(strLJIIJJI) && !arrayList.contains(strLJIIJJI)) {
                    arrayList.add(strLJIIJJI);
                }
            } else {
                c1474520oTS = null;
            }
            if (!interfaceC1467290oHn.LJI() && !interfaceC1467290oHn.LIZ() && c1474520oTS != null && !TextUtils.isEmpty(c1474520oTS.LIZ(15))) {
                arrayList = new ArrayList();
                arrayList.add(c1474520oTS.LIZ(15));
            } else {
                arrayList = new ArrayList(this.LJIIIIZZ);
            }
            strLJIIJJI = this.LIZIZ.LJIIJJI();
            if (!TextUtils.isEmpty(strLJIIJJI)) {
                arrayList.add(strLJIIJJI);
            }
        } else {
            arrayList = null;
        }
        int iLJIIJ = this.LIZIZ.LJIIJ(764);
        if (iLJIIJ != 0) {
            if (z) {
                arrayList = new ArrayList();
            } else if (arrayList != null) {
            }
            arrayList.add(String.valueOf(iLJIIJ));
        }
        if (z) {
            arrayList2 = null;
        }
        EngineThreadPool.addExecuteTask(new Runnable(arrayList, arrayList2) { // from class: X.0oK0
            public final ArrayList<String> LL;
            public final ArrayList<String> LLILLJJLI;

            /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 271
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1468660oK0.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DataLoaderComponentImpl$MDLCacheSizeRunnable@7e15.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DataLoaderComponentImpl$MDLCacheSizeRunnable@7e15.run");
            }

            {
                this.LL = arrayList;
                this.LLILLJJLI = arrayList2;
            }
        });
    }

    public final void LJJIJIIJI(InterfaceC1467950oIr interfaceC1467950oIr) {
        boolean z;
        boolean z2 = true;
        if ((!this.LJI.LJIILJJIL() && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 1) || (this.LIZIZ.LJIIJ(5010) != 0 && !LJIIZILJ && ((C1470430oMr) interfaceC1467950oIr).getPlayerType() == 5)) {
            long jLIZ = this.LJI.LIZ();
            if (jLIZ != -1) {
                C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
                this.LJI.setIntValue(1004, (int) c1470430oMr.LIZIZ(500, jLIZ));
                InterfaceC1467150oHZ interfaceC1467150oHZ = this.LJI;
                if (c1470430oMr.getPlayerType() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1467150oHZ.LJIILL(z);
                if (c1470430oMr.getPlayerType() != 5) {
                    z2 = false;
                }
                LJIIZILJ = z2;
            }
        }
    }

    public final void LJJIJIIJIL(int i) {
        LJJIIZI(1, i);
        if (this.LIZIZ.LJIIJ(656) != 1) {
            LJJIJ();
            if (this.LJIILJJIL > 0) {
                this.LJI.LJFF();
            }
        }
    }

    public C1467080oHS(Context context, C1467520oIA c1467520oIA) {
        super(c1467520oIA);
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = new ArrayList<>();
        this.LJIIL = 1;
        this.LJIILIIL = 0;
        this.LJIILL = 0L;
        this.LJ = context;
    }

    @Override // X.InterfaceC1467180oHc
    public final void LJII(String str, Map<String, String> map) {
        if (this.LJIIL == 1) {
            if (TextUtils.isEmpty(str)) {
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d("TTVideoEngine", "url null, may not use p2p");
            } else if (!str.contains("http://127.0.0.1") && !str.contains("mdl://")) {
                int i2 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("TTVideoEngine", "url not 127 or mdl protocol, may not use p2p");
            } else if (!str.contains("cdn_type")) {
                int i3 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("TTVideoEngine", "url not contain cdntype, may not use p2p");
            } else {
                int i4 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("TTVideoEngine", "url  may use p2p");
                return;
            }
            this.LJIIL = 0;
        }
    }

    public final Pair<Integer, Integer> LJIJJLI(int i, int i2) {
        if (this.LJI.LJIIJ(1150) == 1) {
            return new Pair<>(0, 0);
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void LJJIIZ(int i, int i2) {
        if (i != 160) {
            if (i != 301) {
                this.LJI.setIntValue(i, i2);
                return;
            }
            this.LJIILIIL = i2;
            if (C790030Uyv.LIZ.LJII != 0) {
                return;
            }
            this.LJI.LJIIIIZZ(i2);
            return;
        }
        this.LJIILJJIL = i2;
    }

    public final void LJJIIZI(int i, long j) {
        int i2;
        long jLJIIJ = j;
        if (this.LJIILJJIL <= 0 || TextUtils.isEmpty(this.LIZ.LJIL)) {
            return;
        }
        switch (i) {
            case 0:
                i2 = 22;
                break;
            case 1:
                i2 = 23;
                break;
            case 2:
                i2 = 24;
                break;
            case 3:
                i2 = 25;
                break;
            case 4:
                i2 = 26;
                break;
            case 5:
                C1466990oHJ c1466990oHJ = ((C1467520oIA) this.LIZLLL).LIZJ;
                InterfaceC1467950oIr interfaceC1467950oIr = c1466990oHJ.A1;
                if (interfaceC1467950oIr == null && (interfaceC1467950oIr = c1466990oHJ.LJIIIIZZ) == null) {
                    return;
                }
                if (jLJIIJ == -1) {
                    C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr;
                    jLJIIJ = c1470430oMr.LJIIJ(73, -1L);
                    long jLJIIJ2 = c1470430oMr.LJIIJ(72, -1L);
                    if (jLJIIJ >= 0 && jLJIIJ2 >= 0) {
                        jLJIIJ = Math.min(jLJIIJ, jLJIIJ2);
                    } else if (jLJIIJ2 >= 0) {
                        jLJIIJ = jLJIIJ2;
                    }
                }
                i2 = 27;
                break;
                break;
            case 6:
                i2 = 28;
                break;
            default:
                i2 = -1;
                break;
        }
        if (this.LJIIL != 0 && this.LIZIZ.LJIIJ(302) != 1) {
            this.LJI.LJIJ(i2, this.LIZ.LJIL, jLJIIJ, ((C1467520oIA) this.LIZLLL).LIZJ.LJIL.getVideoId());
        } else {
            this.LJI.LJIJJLI(i2, this.LIZ.LJIL, jLJIIJ, ((C1467520oIA) this.LIZLLL).LIZJ.LJIL.getVideoId());
        }
    }

    public final void LJJIJIL(JSONObject jSONObject, long j) {
        this.LJI.LJI(jSONObject, j);
    }
}
