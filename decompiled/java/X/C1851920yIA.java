package X;

import Y.ARunnableS127S0100000_27;
import Y.ARunnableS31S1100000_27;
import Y.ARunnableS36S0300000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.config.ASRSpeechOptions;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS473S0200000_4;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851920yIA {
    public static final C1851920yIA LIZ = new C1851920yIA();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final ConcurrentHashMap<String, C1851940yIC> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ(C1851940yIC c1851940yIC) {
        Runnable runnable = c1851940yIC.LJIIIZ;
        if (runnable != null) {
            LIZIZ.removeCallbacks(runnable);
        }
        c1851940yIC.LJIIIZ = null;
        Runnable runnable2 = c1851940yIC.LJIIIIZZ;
        if (runnable2 != null) {
            LIZIZ.removeCallbacks(runnable2);
        }
        c1851940yIC.LJIIIIZZ = null;
        Runnable runnable3 = c1851940yIC.LJIIJ;
        if (runnable3 != null) {
            LIZIZ.removeCallbacks(runnable3);
        }
        c1851940yIC.LJIIJ = null;
        Runnable runnable4 = c1851940yIC.LJIIJJI;
        if (runnable4 != null) {
            LIZIZ.removeCallbacks(runnable4);
        }
        c1851940yIC.LJIIJJI = null;
    }

    public static Pair LJFF(byte[] bArr) {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        Object obj = null;
        if (bArr == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, Charsets.UTF_8));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("result");
            if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null || (strOptString = jSONObjectOptJSONObject.optString("text")) == null || !(!a0.LJJJIL(strOptString))) {
                return null;
            }
            c098200Yq = new Pair(strOptString, jSONObject.optString("reqid"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Pair) obj;
    }

    public static void LJI(C1851940yIC c1851940yIC) {
        try {
            c1851940yIC.LIZIZ.setListener(null);
            c1851940yIC.LIZIZ.destroyEngine();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJII(C1851940yIC c1851940yIC) {
        if (!c1851940yIC.LJI) {
            return;
        }
        long j = ((ASRSpeechOptions) C1851960yIE.LIZIZ.getValue()).postSpeechSilenceTimeoutMilliseconds;
        if (j <= 0) {
            return;
        }
        Runnable runnable = c1851940yIC.LJIIJJI;
        if (runnable != null) {
            LIZIZ.removeCallbacks(runnable);
        }
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(c1851940yIC, 49);
        c1851940yIC.LJIIJJI = aRunnableS127S0100000_27;
        C786410Ut5.LJLIIL(j, LIZIZ, aRunnableS127S0100000_27);
    }

    public static boolean LIZIZ(String str, String str2) {
        C1851940yIC c1851940yIC = LIZJ.get(str);
        if (c1851940yIC == null) {
            return false;
        }
        LIZ(c1851940yIC);
        c1851940yIC.LJII = str2;
        int iSendDirective = c1851940yIC.LIZIZ.sendDirective(1100, "");
        if (iSendDirective != 0) {
            LJ(c1851940yIC, iSendDirective, "finish talking failed");
            return true;
        }
        Runnable runnable = c1851940yIC.LJIIIIZZ;
        if (runnable != null) {
            LIZIZ.removeCallbacks(runnable);
        }
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(c1851940yIC, 50);
        c1851940yIC.LJIIIIZZ = aRunnableS127S0100000_27;
        C786410Ut5.LJLIIL(10000L, LIZIZ, aRunnableS127S0100000_27);
        return true;
    }

    public static void LIZJ(String str, Map map) {
        if (map != null && !map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.put("click_button", str);
            C1018703yb.LIZIZ("tiktokec_voice_auth_click", linkedHashMap);
        }
    }

    public static boolean LJIIIZ(String str, boolean z) {
        C1851940yIC c1851940yICRemove = LIZJ.remove(str);
        if (c1851940yICRemove == null) {
            return false;
        }
        LIZ(c1851940yICRemove);
        try {
            C189200o6.m2constructorimpl(Integer.valueOf(c1851940yICRemove.LIZIZ.sendDirective(1001, "")));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LJI(c1851940yICRemove);
        if (z) {
            InterfaceC2038907yl interfaceC2038907yl = c1851940yICRemove.LJIIL;
            long jCurrentTimeMillis = System.currentTimeMillis() - c1851940yICRemove.LIZJ;
            long j = 0;
            if (jCurrentTimeMillis >= 0) {
                j = jCurrentTimeMillis;
            }
            LIZLLL(interfaceC2038907yl, str, "cancel", null, null, null, j, null, "manual_stop");
            return true;
        }
        return true;
    }

    public static void LJ(C1851940yIC c1851940yIC, int i, String str) {
        LIZJ.remove(c1851940yIC.LIZ);
        LIZ(c1851940yIC);
        try {
            C189200o6.m2constructorimpl(Integer.valueOf(c1851940yIC.LIZIZ.sendDirective(1001, "")));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        InterfaceC2038907yl interfaceC2038907yl = c1851940yIC.LJIIL;
        String str2 = c1851940yIC.LIZ;
        Integer numValueOf = Integer.valueOf(i);
        long jCurrentTimeMillis = System.currentTimeMillis() - c1851940yIC.LIZJ;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        LIZLLL(interfaceC2038907yl, str2, "fail", null, numValueOf, str, jCurrentTimeMillis, null, c1851940yIC.LJII);
        LJI(c1851940yIC);
    }

    public static boolean LJIIIIZZ(String str, final Activity activity, InterfaceC2038907yl interfaceC2038907yl, Map map) {
        boolean zLIZLLL;
        Object c098200Yq;
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        if (activity == null) {
            zLIZLLL = false;
        } else {
            C19741112Lp.LIZ.getClass();
            zLIZLLL = C19741112Lp.LIZLLL(activity, "android.permission.RECORD_AUDIO");
        }
        if (!zLIZLLL) {
            LIZLLL(interfaceC2038907yl, str, "fail", null, 9032, "no mic permission", 0L, null, "error");
            if (activity != null) {
                if (map != null && !map.isEmpty()) {
                    C1018703yb.LIZIZ("tiktokec_voice_auth_show", map);
                }
                C19741112Lp.LIZ.getClass();
                if (C19741112Lp.LJI(activity, "android.permission.RECORD_AUDIO", false)) {
                    if (C0DHG.LIZ() && C1388190mED.LIZ(activity) != null) {
                        C632670Orh.LIZIZ(activity, new C19719212De(-154468538, new AwS473S0200000_4(map, (Map<String, ? extends Object>) activity, (Context) 1), true));
                    } else {
                        C1397580mTM c1397580mTM = new C1397580mTM(activity);
                        c1397580mTM.LJFF(2131828545);
                        c1397580mTM.LIZ(2131828542);
                        C985403tE.LIZ(c1397580mTM, new AwS393S0200000_27(map, (Map<String, ? extends Object>) activity, (Context) 97));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return false;
                    }
                } else {
                    final AwS372S0200000_6 awS372S0200000_6 = new AwS372S0200000_6(activity, (Activity) map, (Map<String, ? extends Object>) 65);
                    PopupManager.LJIJI(new C10GR(activity, awS372S0200000_6) { // from class: X.0Qyv
                        public final Activity LL;
                        public final Function1<C20656615sK, Unit> LLILLJJLI;

                        @Override // X.InterfaceC20660515sx
                        public final int getPriority() {
                            return 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC20660415sw
                        public final C688120Qyw i2() {
                            Activity activity2 = this.LL;
                            if (activity2 instanceof C19EG) {
                                C688080Qys.LIZ(activity2, null, (LifecycleOwner) activity2);
                            }
                            return null;
                        }

                        {
                            this.LL = activity;
                            this.LLILLJJLI = awS372S0200000_6;
                        }

                        @Override // X.InterfaceC20659015si
                        public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                            this.LLILLJJLI.invoke(c20656615sK);
                        }
                    }, true);
                    return false;
                }
            }
            return false;
        }
        Iterator<Map.Entry<String, C1851940yIC>> it2 = LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            LIZ.getClass();
            LJIIIZ(key, false);
        }
        TTNetInit.forceInitCronetKernel();
        try {
            SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
            try {
                c098200Yq = Boolean.valueOf(SpeechEngineGenerator.isEngineSupported("asr"));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            if (!((Boolean) c098200Yq).booleanValue()) {
                speechEngineGenerator.destroyEngine();
                LIZLLL(interfaceC2038907yl, str, "fail", null, -2, "not support ASR", 0L, null, null);
                return true;
            }
            speechEngineGenerator.createEngine();
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin()) {
                curUserId = accountUserServiceLJIIJ.getCurUserId();
            } else {
                curUserId = "DEFAULT_USER";
            }
            C01GW c01gw = C1851960yIE.LIZIZ;
            ASRSpeechOptions aSRSpeechOptions = (ASRSpeechOptions) c01gw.getValue();
            speechEngineGenerator.setOptionString("engine_name", "asr");
            speechEngineGenerator.setOptionString("log_level", "TRACE");
            speechEngineGenerator.setOptionString("appid", aSRSpeechOptions.appId);
            speechEngineGenerator.setOptionString("uid", curUserId);
            speechEngineGenerator.setOptionString("asr_address", aSRSpeechOptions.address);
            speechEngineGenerator.setOptionString("asr_uri", aSRSpeechOptions.uri);
            speechEngineGenerator.setOptionString("asr_cluster", aSRSpeechOptions.cluster);
            speechEngineGenerator.setOptionBoolean("enable_get_volume", true);
            speechEngineGenerator.setOptionString("recorder_data_source_type", "Recorder");
            speechEngineGenerator.setOptionInt("recorder_preset", 4);
            speechEngineGenerator.setOptionBoolean("asr_auto_stop", false);
            speechEngineGenerator.setOptionBoolean("asr_show_punctuation", true);
            speechEngineGenerator.setOptionBoolean("asr_enable_itn", true);
            speechEngineGenerator.setOptionInt("asr_conn_timeout", 12000);
            speechEngineGenerator.setOptionInt("asr_recv_timeout", 8000);
            C844470XAv.LIZ.getClass();
            speechEngineGenerator.setContext(C844470XAv.LIZ());
            int iInitEngine = speechEngineGenerator.initEngine();
            if (iInitEngine != 0) {
                speechEngineGenerator.destroyEngine();
                LIZLLL(interfaceC2038907yl, str, "fail", null, Integer.valueOf(iInitEngine), "init engine failed", 0L, null, null);
                return true;
            }
            final C1851940yIC c1851940yIC = new C1851940yIC(str, speechEngineGenerator, interfaceC2038907yl);
            LIZJ.put(str, c1851940yIC);
            speechEngineGenerator.setListener(new SpeechEngine.SpeechListener() { // from class: X.0yIB
                @Override // com.bytedance.speech.speechengine.SpeechEngine.SpeechListener
                public final void onSpeechMessage(int i, byte[] bArr, int i2) {
                    Object c098200Yq2;
                    Pair pair;
                    String str2;
                    float fLIZLLL;
                    Float fLJIIIIZZ;
                    if (i != 1003) {
                        if (i != 1201) {
                            if (i != 1204) {
                                if (i == 1600) {
                                    if (bArr != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(new String(bArr, Charsets.UTF_8))) != null) {
                                        fLIZLLL = C13LZ.LIZLLL(fLJIIIIZZ.floatValue(), 0.0f, 1.0f);
                                    } else {
                                        fLIZLLL = 0.0f;
                                    }
                                    c1851940yIC.LJ.add(Float.valueOf(fLIZLLL));
                                    if (fLIZLLL > ((ASRSpeechOptions) C1851960yIE.LIZIZ.getValue()).volumeThreshold) {
                                        C1851940yIC c1851940yIC2 = c1851940yIC;
                                        if (c1851940yIC2.LJII == null && c1851940yIC2.LJIIIIZZ == null) {
                                            if (!c1851940yIC2.LJI) {
                                                c1851940yIC2.LJI = true;
                                                C1851920yIA.LIZ.getClass();
                                                Runnable runnable = c1851940yIC2.LJIIJ;
                                                if (runnable != null) {
                                                    C1851920yIA.LIZIZ.removeCallbacks(runnable);
                                                }
                                                c1851940yIC2.LJIIJ = null;
                                            }
                                            C1851920yIA c1851920yIA = C1851920yIA.LIZ;
                                            C1851940yIC c1851940yIC3 = c1851940yIC;
                                            c1851920yIA.getClass();
                                            C1851920yIA.LJII(c1851940yIC3);
                                        }
                                    }
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    if (jCurrentTimeMillis - c1851940yIC.LIZLLL >= 200) {
                                        JSONArray jSONArray = new JSONArray();
                                        C1851940yIC c1851940yIC4 = c1851940yIC;
                                        synchronized (c1851940yIC4.LJ) {
                                            try {
                                                int size = c1851940yIC4.LJ.size();
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    List<Float> list = c1851940yIC4.LJ;
                                                    list.set(i3, Float.valueOf(C13LZ.LIZLLL(list.get(i3).floatValue() * 10.0f, 0.0f, 1.0f)));
                                                }
                                                if (size >= 3) {
                                                    jSONArray.put(c1851940yIC4.LJ.get(0));
                                                    jSONArray.put(c1851940yIC4.LJ.get(size / 2));
                                                    jSONArray.put(c1851940yIC4.LJ.get(size - 1));
                                                } else if (size != 2) {
                                                    if (size == 1) {
                                                        jSONArray.put(c1851940yIC4.LJ.get(0));
                                                        jSONArray.put(c1851940yIC4.LJ.get(0));
                                                        jSONArray.put(c1851940yIC4.LJ.get(0));
                                                    } else {
                                                        jSONArray.put(Float.valueOf(0.0f));
                                                        jSONArray.put(Float.valueOf(0.0f));
                                                        jSONArray.put(Float.valueOf(0.0f));
                                                    }
                                                } else {
                                                    jSONArray.put(c1851940yIC4.LJ.get(0));
                                                    jSONArray.put(Float.valueOf((c1851940yIC4.LJ.get(0).floatValue() + c1851940yIC4.LJ.get(1).floatValue()) / 2.0f));
                                                    jSONArray.put(c1851940yIC4.LJ.get(1));
                                                }
                                                c1851940yIC4.LJ.clear();
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                                throw th2;
                                            }
                                        }
                                        C1851940yIC c1851940yIC5 = c1851940yIC;
                                        c1851940yIC5.LIZLLL = jCurrentTimeMillis;
                                        C1851920yIA.LIZ.getClass();
                                        InterfaceC2038907yl interfaceC2038907yl2 = c1851940yIC5.LJIIL;
                                        if (interfaceC2038907yl2 != null) {
                                            C786410Ut5.LJJZZIII(C1851920yIA.LIZIZ, new ARunnableS36S0300000_3(interfaceC2038907yl2, c1851940yIC5, jSONArray, 6));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C1851920yIA.LIZ.getClass();
                            Pair pairLJFF = C1851920yIA.LJFF(bArr);
                            if (pairLJFF != null) {
                                C1851940yIC c1851940yIC6 = c1851940yIC;
                                String str3 = (String) pairLJFF.getFirst();
                                String str4 = (String) pairLJFF.getSecond();
                                InterfaceC2038907yl interfaceC2038907yl3 = c1851940yIC6.LJIIL;
                                String str5 = c1851940yIC6.LIZ;
                                if (c1851940yIC6.LJFF) {
                                    str2 = "timeout";
                                } else {
                                    str2 = "success";
                                }
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - c1851940yIC6.LIZJ;
                                if (jCurrentTimeMillis2 < 0) {
                                    jCurrentTimeMillis2 = 0;
                                }
                                C1851920yIA.LIZLLL(interfaceC2038907yl3, str5, str2, str3, null, null, jCurrentTimeMillis2, str4, c1851940yIC6.LJII);
                            }
                            C1851920yIA.LIZ(c1851940yIC);
                            C1851920yIA.LIZJ.remove(c1851940yIC.LIZ);
                            C1851920yIA.LJI(c1851940yIC);
                            return;
                        }
                        C1851920yIA.LIZ.getClass();
                        Pair pairLJFF2 = C1851920yIA.LJFF(bArr);
                        if (pairLJFF2 == null) {
                            return;
                        }
                        pairLJFF2.getFirst();
                        C1851940yIC c1851940yIC7 = c1851940yIC;
                        if (c1851940yIC7.LJII != null || c1851940yIC7.LJIIIIZZ != null || c1851940yIC7.LJI) {
                            return;
                        }
                        c1851940yIC7.LJI = true;
                        Runnable runnable2 = c1851940yIC7.LJIIJ;
                        if (runnable2 != null) {
                            C1851920yIA.LIZIZ.removeCallbacks(runnable2);
                        }
                        c1851940yIC7.LJIIJ = null;
                        C1851920yIA.LJII(c1851940yIC);
                        return;
                    }
                    C1851920yIA.LIZ.getClass();
                    String str6 = "unknown";
                    if (bArr == null) {
                        pair = new Pair(-1, "unknown");
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr, Charsets.UTF_8));
                            c098200Yq2 = new Pair(Integer.valueOf(jSONObject.optInt("err_code", -1)), jSONObject.optString("err_msg", ""));
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq2 = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                        if (thM5exceptionOrNullimpl != null) {
                            String message = thM5exceptionOrNullimpl.getMessage();
                            if (message != null) {
                                str6 = message;
                            }
                            c098200Yq2 = new Pair(-1, str6);
                        }
                        pair = (Pair) c098200Yq2;
                    }
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    String str7 = (String) pair.getSecond();
                    C1851920yIA c1851920yIA2 = C1851920yIA.LIZ;
                    C1851940yIC c1851940yIC8 = c1851940yIC;
                    c1851920yIA2.getClass();
                    C1851920yIA.LJ(c1851940yIC8, iIntValue, str7);
                }
            });
            int iSendDirective = speechEngineGenerator.sendDirective(2001, "");
            if (iSendDirective != 0) {
                LJ(c1851940yIC, iSendDirective, "sync stop engine failed");
                return true;
            }
            int iSendDirective2 = speechEngineGenerator.sendDirective(LSPassThroughRecordSizeConfig.DEFAULT, "");
            if (iSendDirective2 != 0) {
                LJ(c1851940yIC, iSendDirective2, "start engine failed");
                return true;
            }
            Runnable runnable = c1851940yIC.LJIIIZ;
            if (runnable != null) {
                LIZIZ.removeCallbacks(runnable);
            }
            ARunnableS31S1100000_27 aRunnableS31S1100000_27 = new ARunnableS31S1100000_27(c1851940yIC, c1851940yIC.LIZ, 2);
            c1851940yIC.LJIIIZ = aRunnableS31S1100000_27;
            BPEAHandler bPEAHandler = LIZIZ;
            C786410Ut5.LJLIIL(((ASRSpeechOptions) c01gw.getValue()).totalTimeOut, bPEAHandler, aRunnableS31S1100000_27);
            if (!c1851940yIC.LJI) {
                Runnable runnable2 = c1851940yIC.LJIIJ;
                if (runnable2 != null) {
                    bPEAHandler.removeCallbacks(runnable2);
                }
                ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(c1851940yIC, 51);
                c1851940yIC.LJIIJ = aRunnableS127S0100000_27;
                C786410Ut5.LJLIIL(((ASRSpeechOptions) c01gw.getValue()).connectTimeOut, bPEAHandler, aRunnableS127S0100000_27);
            }
            return true;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJFF(th2, "ec_search_asr_engine_load_failed");
            String message = th2.getMessage();
            if (message == null) {
                message = "load engine failed";
            }
            LIZLLL(interfaceC2038907yl, str, "fail", null, -1, message, 0L, null, null);
            return true;
        }
    }

    public static void LIZLLL(final InterfaceC2038907yl interfaceC2038907yl, final String str, final String str2, final String str3, final Integer num, final String str4, final long j, final String str5, final String str6) {
        if (interfaceC2038907yl == null) {
            return;
        }
        C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.07yk
            public final /* synthetic */ boolean LLIZLLLIL = true;

            public final void LIZ() {
                Object c098200Yq;
                try {
                    interfaceC2038907yl.onResult(str, str2, str3, num, str4, j, this.LLIZLLLIL, str5, str6);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EcSearchAsrSessionManager@e403.notifyResult$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EcSearchAsrSessionManager@e403.notifyResult$1");
            }
        });
    }
}
