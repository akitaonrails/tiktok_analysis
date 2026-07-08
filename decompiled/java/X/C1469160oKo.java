package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.ILogCallback;
import com.bytedance.vcloud.strategy.IPreciseExpService;
import com.bytedance.vcloud.strategy.IStrategyEventListener;
import com.bytedance.vcloud.strategy.IStrategyStateSupplier;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.bytedance.vcloud.strategy.drm.ILiveWidevineNetworkClient;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469160oKo {
    public StrategyCenter LIZ;
    public InterfaceC1468720oK6 LIZIZ;
    public InterfaceC1469300oL2 LIZJ;
    public IPreciseExpService LIZLLL;
    public InterfaceC797010VOh LJFF;
    public final C1468280oJO LJ = C1468070oJ3.LIZ().LIZ;
    public boolean LJI = false;
    public long LJII = 0;
    public long LJIIIIZZ = 0;
    public Context LJIIIZ = null;
    public int LJIIJ = 5;
    public int LJIIJJI = 0;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public C1468680oK2 LJIILJJIL = null;
    public WeakReference<InterfaceC790020Uyu> LJIILL = null;
    public final ReentrantLock LJIILLIIL = new ReentrantLock();
    public C796950VOb LJIIZILJ = null;
    public final Map<Integer, Integer> LJIJ = new ConcurrentHashMap(5);
    public final C1471330oOJ LJIJI = new C1471330oOJ();
    public final Map<Integer, Integer> LJIJJ = new ConcurrentHashMap();
    public final Map<Integer, String> LJIJJLI = new ConcurrentHashMap();
    public InterfaceC796980VOe LJIL = null;
    public int LJJ = 0;
    public boolean LJJI = true;
    public volatile int LJJIFFI = 0;
    public float LJJII = -1.0f;
    public final ReentrantLock LJJIII = new ReentrantLock();

    public final StrategyCenter LIZJ() {
        if (this.LIZ == null) {
            this.LJIILLIIL.lock();
            try {
                if (this.LIZ == null) {
                    StrategyCenter strategyCenter = StrategyCenter.getInstance();
                    this.LIZ = strategyCenter;
                    strategyCenter.setStrategyEventListener(new IStrategyEventListener(this) { // from class: X.0VOf
                        public final WeakReference<C1469160oKo> LIZ;

                        {
                            this.LIZ = new WeakReference<>(this);
                        }

                        @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
                        public final void onEventLog(String str, String str2) {
                            int i = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("eventName: ");
                            sbLIZ.append(str);
                            sbLIZ.append(", logInfo: ");
                            sbLIZ.append(str2);
                            TTVideoEngineLog.d("VCStrategy", C2188811AlT.LIZIZ(sbLIZ));
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    C0WPS.instance.addEventV2(true, new JSONObject(str2), str);
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    int i2 = C2187451AjH.LIZ;
                                    TTVideoEngineLog.d(e);
                                }
                            }
                        }

                        @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
                        public final void onEvent(String str, int i, int i2, String str2) {
                            C796950VOb c796950VOb;
                            int i3 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("on event, videoID = ");
                            sbLIZ.append(str);
                            sbLIZ.append(", key = ");
                            sbLIZ.append(i);
                            sbLIZ.append(", value = ");
                            sbLIZ.append(i2);
                            sbLIZ.append(", info = ");
                            sbLIZ.append(str2);
                            C1471660oOq.LIZJ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ));
                            if (i == 2019) {
                                C1469160oKo c1469160oKo = this.LIZ.get();
                                if (c1469160oKo == null || (c796950VOb = c1469160oKo.LJIIZILJ) == null) {
                                    return;
                                }
                                switch (i2) {
                                    case 1:
                                        try {
                                            if (!c796950VOb.LIZ()) {
                                                C1471660oOq.LIZIZ("VCStrategy", "create db fail.");
                                            } else {
                                                c796950VOb.LIZIZ();
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            int i4 = C2187451AjH.LIZ;
                                            TTVideoEngineLog.d(th);
                                            return;
                                        }
                                        break;
                                    case 2:
                                        try {
                                            c796950VOb.LIZIZ.add(str);
                                            if (c796950VOb.LIZIZ.size() > 2000) {
                                                c796950VOb.LIZJ.LIZ(c796950VOb.LIZIZ.remove(0));
                                            }
                                            c796950VOb.LIZJ();
                                            c796950VOb.LIZJ.putString(str, str2);
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            int i5 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("save data fail. ");
                                            sbLIZ2.append(th2.toString());
                                            C1471660oOq.LIZIZ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                                            return;
                                        }
                                        break;
                                    case 3:
                                        try {
                                            c796950VOb.LIZIZ.remove(str);
                                            c796950VOb.LIZJ.LIZ(str);
                                            c796950VOb.LIZJ();
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            int i6 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("remove data fail. ");
                                            sbLIZ3.append(th3.toString());
                                            C1471660oOq.LIZIZ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                                            return;
                                        }
                                        break;
                                    case 4:
                                        try {
                                            c796950VOb.LIZJ.putString(str, str2);
                                        } catch (Throwable th4) {
                                            TryCatchGuardChecker.doCheck(th4);
                                            int i7 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("save key value fail. ");
                                            sbLIZ4.append(th4.toString());
                                            C1471660oOq.LIZIZ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ4));
                                            return;
                                        }
                                        break;
                                    case 5:
                                        try {
                                            if (!c796950VOb.LIZ()) {
                                                C1471660oOq.LIZIZ("VCStrategy", "create db fail.");
                                            } else {
                                                C1469160oKo c1469160oKo2 = c796950VOb.LJ.get();
                                                if (c1469160oKo2 != null) {
                                                    c1469160oKo2.LIZJ().businessEvent(31212, c796950VOb.LIZJ.getString(str));
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            TryCatchGuardChecker.doCheck(th5);
                                            int i8 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("load key value fail. ");
                                            sbLIZ5.append(th5.toString());
                                            C1471660oOq.LIZIZ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ5));
                                            return;
                                        }
                                        break;
                                    case 6:
                                        try {
                                            c796950VOb.LIZJ.clear();
                                        } catch (Throwable th6) {
                                            TryCatchGuardChecker.doCheck(th6);
                                            int i9 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append("clear fail. ");
                                            sbLIZ6.append(th6.toString());
                                            C1471660oOq.LIZIZ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ6));
                                            return;
                                        }
                                        break;
                                }
                                return;
                            }
                            C1471330oOJ c1471330oOJ = this.LIZIZ.LJIJI;
                            c1471330oOJ.getClass();
                            try {
                                c1471330oOJ.LIZIZ(i, i2, str, str2);
                            } catch (Throwable th7) {
                                TryCatchGuardChecker.doCheck(th7);
                                ((ConcurrentLinkedQueue) c1471330oOJ.LIZJ).add(new HashMap<String, Object>(str, i, i2, str2, th7) { // from class: X.0V00
                                    {
                                        put(FollowStatusChangeMethod.PARAM_UID, str);
                                        put("key", Integer.valueOf(i));
                                        put("value", Integer.valueOf(i2));
                                        put("logInfo", str2);
                                        put("throwable", th7.toString());
                                    }
                                });
                            }
                            this.LIZIZ.LJIILLIIL.lock();
                            C1469160oKo c1469160oKo3 = this.LIZIZ;
                            if (c1469160oKo3.LJFF != null) {
                                c1469160oKo3.LJIILLIIL.unlock();
                                if (i != 2012 && i < 2500) {
                                    return;
                                }
                                C797000VOg c797000VOg = (C797000VOg) this.LIZIZ.LJFF;
                                c797000VOg.getClass();
                                C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS113S0100000_13(c797000VOg, str, i, i2, str2, 33));
                                if (i == 55027) {
                                    for (Reference reference : (CopyOnWriteArrayList) c797000VOg.LIZ.LIZ.LJI) {
                                        if (reference.get() != null) {
                                            ((InterfaceC1475300oUi) reference.get()).LLLLZLLIL(str2);
                                        }
                                    }
                                    return;
                                }
                                if (i != 55031) {
                                    return;
                                }
                                for (Reference reference2 : (CopyOnWriteArrayList) c797000VOg.LIZ.LIZ.LJI) {
                                    if (reference2.get() != null) {
                                        ((InterfaceC1475300oUi) reference2.get()).Xi(null, str2, 0L, 0L);
                                    }
                                }
                                return;
                            }
                            c1469160oKo3.LJIILLIIL.unlock();
                        }
                    });
                    this.LIZ.setLiveWidevineNetworkClient(new ILiveWidevineNetworkClient() { // from class: X.0p9x
                        @Override // com.bytedance.vcloud.strategy.drm.ILiveWidevineNetworkClient
                        public final ILiveWidevineNetworkClient.DrmResponse post(String str, Map<String, String> map, String str2, byte[] bArr, boolean z, int i) {
                            int i2;
                            C1500880p9y c1500880p9y;
                            InputStream inputStreamIn;
                            ByteArrayOutputStream byteArrayOutputStream;
                            byte[] bArr2;
                            ArrayList arrayList;
                            Map<String, String> map2 = map;
                            ILiveWidevineNetworkClient.DrmResponse drmResponse = new ILiveWidevineNetworkClient.DrmResponse();
                            C0CJP liveGlobalConfig = C1480850odf.LIZJ.getLiveGlobalConfig();
                            int i3 = -1;
                            if (liveGlobalConfig == null) {
                                drmResponse.code = -1;
                                drmResponse.errorMessage = "ILiveGlobalConfig is null";
                                return drmResponse;
                            }
                            if (liveGlobalConfig.LIZJ() == null) {
                                drmResponse.code = -1;
                                drmResponse.errorMessage = "ILiveNetworkClient is null";
                                return drmResponse;
                            }
                            HashMap map3 = new HashMap();
                            map3.put("timeout_ms", Integer.valueOf(i));
                            byte[] byteArray = null;
                            HashMap map4 = null;
                            byteArray = null;
                            if (z) {
                                if (map2 == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList();
                                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                                        arrayList.add(new C520610KbL(entry.getKey(), entry.getValue()));
                                    }
                                }
                                try {
                                    C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
                                    Object objLIZ = C337500DKy.LIZ(map3);
                                    c1515210pX5LIZLLL.getClass();
                                    C1500830p9t c1500830p9tLIZ = ((C1500860p9w) ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).post(str, arrayList, str2, bArr, objLIZ)).LIZ();
                                    int i4 = c1500830p9tLIZ.LIZIZ;
                                    List<C520610KbL> list = c1500830p9tLIZ.LIZJ;
                                    if (list != null) {
                                        map4 = new HashMap();
                                        for (C520610KbL c520610KbL : list) {
                                            map4.put(c520610KbL.getName(), c520610KbL.getValue());
                                        }
                                    }
                                    byte[] bArr3 = c1500830p9tLIZ.LJ;
                                    C1500890p9z c1500890p9z = new C1500890p9z();
                                    c1500890p9z.LIZLLL = i4;
                                    c1500890p9z.LIZ = map4;
                                    c1500890p9z.LIZIZ = bArr3;
                                    c1500880p9y = new C1500880p9y(c1500890p9z);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1500890p9z c1500890p9z2 = new C1500890p9z();
                                    c1500890p9z2.LIZJ = e;
                                    c1500880p9y = new C1500880p9y(c1500890p9z2);
                                }
                            } else {
                                C20441214yg.LJ("TTLivePlayerNetworkClient", "postWithoutCommonParameters");
                                HashMap map5 = new HashMap();
                                if (map2 == null) {
                                    map2 = new HashMap<>();
                                }
                                C0X9S<TypedInput> c0x9sDo3rdPartPost = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).do3rdPartPost(str, map2, str2, bArr);
                                if (c0x9sDo3rdPartPost != null && c0x9sDo3rdPartPost.request() != null) {
                                    c0x9sDo3rdPartPost.request().setExtraInfo(C337500DKy.LIZ(map3));
                                }
                                try {
                                    C0X52<TypedInput> c0x52Execute = c0x9sDo3rdPartPost.execute();
                                    C2175508fh c2175508fh = c0x52Execute.LIZ;
                                    i2 = c2175508fh.LIZIZ;
                                    try {
                                        for (C080U c080u : c2175508fh.LIZLLL) {
                                            map5.put(c080u.LIZ, c080u.LIZIZ);
                                        }
                                        inputStreamIn = c0x52Execute.LIZIZ.in();
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        bArr2 = new byte[1024];
                                    } catch (Exception e2) {
                                        e = e2;
                                        i3 = i2;
                                        TryCatchGuardChecker.doCheck(e);
                                        C20441214yg.LJFF("TTLivePlayerNetworkClient", "postWithoutCommonParameters error", e);
                                        i2 = i3;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                                while (true) {
                                    int i5 = inputStreamIn.read(bArr2);
                                    if (i5 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i5);
                                    C1500890p9z c1500890p9z3 = new C1500890p9z();
                                    c1500890p9z3.LIZ = map5;
                                    c1500890p9z3.LIZIZ = byteArray;
                                    c1500890p9z3.LIZJ = e;
                                    c1500890p9z3.LIZLLL = i2;
                                    c1500880p9y = new C1500880p9y(c1500890p9z3);
                                }
                                e = null;
                                byteArray = byteArrayOutputStream.toByteArray();
                                C1500890p9z c1500890p9z32 = new C1500890p9z();
                                c1500890p9z32.LIZ = map5;
                                c1500890p9z32.LIZIZ = byteArray;
                                c1500890p9z32.LIZJ = e;
                                c1500890p9z32.LIZLLL = i2;
                                c1500880p9y = new C1500880p9y(c1500890p9z32);
                            }
                            drmResponse.code = c1500880p9y.LIZ;
                            drmResponse.byteBody = c1500880p9y.LIZJ;
                            Exception exc = c1500880p9y.LIZLLL;
                            if (exc != null) {
                                drmResponse.errorMessage = exc.toString();
                            }
                            return drmResponse;
                        }
                    });
                }
                this.LJIILLIIL.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJIILLIIL.unlock();
                throw th;
            }
        }
        return this.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v71, types: [X.0oK2] */
    public final void LJFF() {
        JSONObject jSONObjectLIZIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("internalStart needLoadLibrary=");
        sbLIZ.append(true);
        C1471660oOq.LIZJ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ().create(this.LJIIIZ, true);
        if (!LIZJ().isLoadLibrarySucceed()) {
            C1471660oOq.LIZJ("VCStrategy", "internalStart isLoadLibrarySucceed false");
            return;
        }
        this.LJIIZILJ = new C796950VOb(this, this.LJIIIZ, this);
        LIZJ().setIntValue(10000, this.LJIIJ);
        LIZJ().setIntValue(801, C1469260oKy.LIZ);
        LIZJ().setIntValue(802, C1469260oKy.LIZIZ);
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJIJJLI).entrySet()) {
            LIZJ().setAlgorithmJson(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJIJJ).entrySet()) {
            LIZJ().setIntValue(((Integer) entry2.getKey()).intValue(), ((Integer) entry2.getValue()).intValue());
        }
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new InterfaceC790020Uyu() { // from class: X.0oK2
                @Override // X.InterfaceC790020Uyu
                public final void LIZ(int i2, int i3, int i4) {
                    if (i2 == 0) {
                        this.LIZ.LIZJ().businessEvent(1202, C406601i4.LIZIZ(i4));
                    }
                }
            };
            if (!C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 16L)) {
                this.LJIILL = new WeakReference<>(this.LJIILJJIL);
                C790010Uyt.LJ().LJIIIIZZ(this.LJIILL);
            }
        }
        if (((ConcurrentHashMap) this.LJIJJLI).get(31001) == null) {
            LJIIJ(31001, this.LJIIJJI == 32 ? "{\"strategy_center_v1\":{\"feed\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}},\"fullscreen_immersive\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}},\"story\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}}}}" : "{\"strategy_center_v1\":{\"engine_default\":{\"preload_strategy\":{\"name\":\"default\",\"tasks\":[{\"download_progress\":100,\"count\":5,\"offset\":0,\"size\":800}]}},\"video_range_request\":{\"enable_concurrent_download\":0,\"allowed_segment_download\":0,\"fixed_size\":3000,\"fixed_duration\":10}}}");
        }
        LIZJ().setIOManager(this.LJII, this.LJIIIIZZ);
        if (!LIZJ().isIOManagerVersionMatch()) {
            int i2 = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("VCStrategy", "io manager interface not match, start fail.");
            return;
        }
        LIZJ().setLogCallback(new ILogCallback() { // from class: X.0oKr
            @Override // com.bytedance.vcloud.strategy.ILogCallback
            public final void log(String str) {
                int i3 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("VCStrategy", str);
            }
        });
        if (this.LIZJ != null) {
            LIZJ().setAppServer(new C1474760oTq(this));
        }
        if (this.LIZLLL != null) {
            LIZJ().setPreciseExpService(new C1469340oL6(this));
        }
        C1309100kAe c1309100kAe = C1309150kAj.LIZ;
        if (c1309100kAe.LJFF != 0 && (jSONObjectLIZIZ = c1309100kAe.LIZ.LJ.get("playback").LIZIZ()) != null) {
            LIZJ().setSettingsInfo("playback", C786410Ut5.J3(jSONObjectLIZIZ));
        }
        C1469170oKp c1469170oKp = new C1469170oKp("engine_default");
        c1469170oKp.LIZ = "engine_default";
        c1469170oKp.LIZIZ = "engine_brief_default";
        c1469170oKp.LIZJ = 1;
        c1469170oKp.LIZLLL = 1;
        C1469160oKo c1469160oKo = C790230UzF.LIZ;
        c1469160oKo.LIZJ().createScene(c1469170oKp.LIZ());
        LIZJ().setStateSupplier(new IStrategyStateSupplier(this) { // from class: X.0oK1
            public final C1469160oKo LIZ;

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final double getNetworkSpeed() {
                InterfaceC1468720oK6 interfaceC1468720oK6 = this.LIZ.LIZIZ;
                if (interfaceC1468720oK6 == null) {
                    return 0.0d;
                }
                if (((C1468690oK3) interfaceC1468720oK6).LIZ.LIZIZ.getSpeedManager() != null) {
                    return r1.LIZ.LIZIZ.getSpeedManager().getAverageSpeedInKBps();
                }
                return 0.0d;
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final double getNetworkScore() {
                C1468070oJ3.LIZ().getClass();
                return C1468070oJ3.LIZJ;
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final int getNetworkType() {
                return C406601i4.LIZIZ(C790010Uyt.LJ().LIZ);
            }

            {
                this.LIZ = this;
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final String getNetworkRttListString(int i3) {
                List<Integer> listSubList;
                C1468280oJO c1468280oJO = this.LIZ.LJ;
                if (i3 <= c1468280oJO.LIZ.size()) {
                    listSubList = c1468280oJO.LIZ.subList((r2.size() - i3) - 1, c1468280oJO.LIZ.size() - 1);
                } else {
                    listSubList = c1468280oJO.LIZ;
                }
                return listSubList.toString();
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final String getNetworkSignalListString(int i3) {
                List<String> listSubList;
                C1468280oJO c1468280oJO = this.LIZ.LJ;
                if (i3 < c1468280oJO.LIZJ.size()) {
                    listSubList = c1468280oJO.LIZJ.subList((r2.size() - i3) - 1, c1468280oJO.LIZJ.size() - 1);
                } else {
                    listSubList = c1468280oJO.LIZJ;
                }
                return listSubList.toString();
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final String mediaInfoJsonString(String str) {
                InterfaceC1468720oK6 interfaceC1468720oK6 = this.LIZ.LIZIZ;
                if (interfaceC1468720oK6 != null) {
                    interfaceC1468720oK6.getClass();
                }
                return null;
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final String selectBitrateJsonString(String str, int i3) {
                InterfaceC1468720oK6 interfaceC1468720oK6 = this.LIZ.LIZIZ;
                if (interfaceC1468720oK6 != null) {
                    interfaceC1468720oK6.getClass();
                }
                return null;
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final String selectBitrateJsonString(String str, String str2, int i3) {
                InterfaceC1468720oK6 interfaceC1468720oK6 = this.LIZ.LIZIZ;
                if (interfaceC1468720oK6 != null) {
                    interfaceC1468720oK6.getClass();
                }
                return null;
            }

            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final String onAfterSelect(String str, String str2, int i3, Object obj) {
                C1468630oJx c1468630oJx;
                InterfaceC1468700oK4 interfaceC1468700oK4;
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[GearStrategy] StrategyHelper.onAfterSelect type=");
                sbLIZ2.append(i3);
                sbLIZ2.append(" context=");
                sbLIZ2.append(obj);
                C1471660oOq.LIZJ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                TTVideoEngine tTVideoEngine = null;
                if ((obj instanceof C1468630oJx) && (interfaceC1468700oK4 = (c1468630oJx = (C1468630oJx) obj).LIZ) != null) {
                    Object obj2 = c1468630oJx.LIZIZ;
                    WeakReference<TTVideoEngine> weakReference = c1468630oJx.LIZLLL;
                    if (weakReference != null) {
                        tTVideoEngine = weakReference.get();
                    }
                    HashMap map = new HashMap();
                    C406601i4.LIZJ(str2, map);
                    if (tTVideoEngine != null) {
                        tTVideoEngine.LLIIII(109, System.currentTimeMillis());
                    }
                    interfaceC1468700oK4.LIZIZ(map, obj2);
                    if (tTVideoEngine != null) {
                        tTVideoEngine.LLIIII(110, System.currentTimeMillis());
                        if (map.containsKey("video_bitrarte_user_selected")) {
                            try {
                                tTVideoEngine.LLIIII(101, CastLongProtector.parseLong((String) map.get("video_bitrarte_user_selected")));
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            tTVideoEngine.LLII(102, 9);
                            return "";
                        }
                        if (map.containsKey("video_bitrarte")) {
                            try {
                                tTVideoEngine.LLIIII(101, CastLongProtector.parseLong((String) map.get("video_bitrarte")));
                            } catch (NumberFormatException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        if (map.containsKey("select_reason")) {
                            try {
                                tTVideoEngine.LLII(102, CastIntegerProtector.parseInt((String) map.get("select_reason")));
                            } catch (NumberFormatException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                        if (map.containsKey("speed")) {
                            try {
                                tTVideoEngine.LLIIII(103, CastLongProtector.parseLong((String) map.get("speed")));
                            } catch (NumberFormatException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                        }
                        if (map.containsKey(104)) {
                            try {
                                tTVideoEngine.LLII(104, CastIntegerProtector.parseInt((String) map.get("error_code")));
                                return "";
                            } catch (NumberFormatException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                return "";
                            }
                        }
                        return "";
                    }
                    return "";
                }
                C1468600oJu c1468600oJu = C1468590oJt.LIZ;
                C1471660oOq.LIZJ("VCStrategy", "listener is null");
                return str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v2, types: [X.0oHP] */
            /* JADX WARN: Type inference failed for: r4v3, types: [X.0oM2] */
            /* JADX WARN: Type inference failed for: r4v5 */
            @Override // com.bytedance.vcloud.strategy.IStrategyStateSupplier
            public final String onBeforeSelect(String str, String str2, int i3, Object obj) {
                InterfaceC1468700oK4 interfaceC1468700oK4;
                C1468630oJx c1468630oJx;
                TTVideoEngine tTVideoEngine;
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[GearStrategy] StrategyHelper.onBeforeSelect type=");
                sbLIZ2.append(i3);
                sbLIZ2.append(" context=");
                sbLIZ2.append(obj);
                C1471660oOq.LIZJ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                ?? LIZIZ = 0;
                TTVideoEngine tTVideoEngine2 = null;
                if (obj instanceof C1468630oJx) {
                    c1468630oJx = (C1468630oJx) obj;
                    interfaceC1468700oK4 = c1468630oJx.LIZ;
                } else {
                    interfaceC1468700oK4 = null;
                    c1468630oJx = null;
                }
                if (interfaceC1468700oK4 == null && C1468590oJt.LIZ != null) {
                    interfaceC1468700oK4 = null;
                }
                if (interfaceC1468700oK4 == null) {
                    C1471660oOq.LIZJ("VCStrategy", "listener is null");
                    return str2;
                }
                if (c1468630oJx != null) {
                    InterfaceC1467050oHP interfaceC1467050oHP = c1468630oJx.LIZJ;
                    WeakReference<TTVideoEngine> weakReference = c1468630oJx.LIZLLL;
                    if (weakReference != null) {
                        tTVideoEngine2 = weakReference.get();
                    }
                    tTVideoEngine = tTVideoEngine2;
                    LIZIZ = interfaceC1467050oHP;
                } else {
                    tTVideoEngine = null;
                }
                if (LIZIZ == 0) {
                    LIZIZ = new C1469930oM3().LIZIZ();
                    try {
                        LIZIZ.LJJIIZI(new JSONObject(str));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[GearStrategy]fromMediaInfoJsonString exception=");
                        sbLIZ3.append(e);
                        C1471660oOq.LIZJ("TTVideoEngine.BareVideoModel", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                HashMap map = new HashMap();
                C406601i4.LIZJ(str2, map);
                if (tTVideoEngine != null) {
                    tTVideoEngine.LLIIII(107, System.currentTimeMillis());
                }
                interfaceC1468700oK4.LIZ();
                if (tTVideoEngine != null) {
                    tTVideoEngine.LLIIII(108, System.currentTimeMillis());
                }
                this.LIZ.LIZJ().updateMedia(LIZIZ.LJJII(2), "", LIZIZ.LJIJ());
                return C406601i4.LIZ(map);
            }
        });
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[ConfigCenter][Strategy] prepareConfigCenter switch=");
        sbLIZ2.append(this.LJJIFFI);
        C1471660oOq.LIZJ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LJJIFFI == 1) {
            EngineThreadPool.addExecuteTask(new ARunnableS113S0100000_13(this, 36));
        }
        LIZJ().start(this.LJIIIZ, true);
        c1469160oKo.LIZJ().switchToScene("engine_default");
        C1469180oKq c1469180oKq = C1469220oKu.LIZ;
        c1469180oKq.getClass();
        try {
            LIZJ().businessEvent(31214, C786410Ut5.J3(new JSONObject(new HashMap(c1469180oKq.LIZ))));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1469220oKu.LIZ.LIZIZ.add(new C0V1G() { // from class: X.0V1F
            @Override // X.C0V1G
            public final void LIZ(Object obj) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("device_score", obj);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                this.LIZ.LIZJ().businessEvent(31214, C786410Ut5.J3(jSONObject));
            }
        });
        if (this.LJFF != null && ((Boolean) C1474810oTv.b5.getValue()).booleanValue() && "load_strategy_lib_finished".equals("load_strategy_lib_finished")) {
            AbstractC1472300oPs<Integer> abstractC1472300oPs = new AbstractC1472300oPs<Integer>() { // from class: X.0oPy
            };
            try {
                InterfaceC1479560oba interfaceC1479560oba = C1469250oKx.LIZ;
                if (interfaceC1479560oba != null) {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIILIIL() {
        this.LJJIII.lock();
        try {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("VCStrategy", "speed info update");
            this.LJJI = true;
            this.LJJIII.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJJIII.unlock();
            throw th;
        }
    }

    public final boolean LJI() {
        return LIZJ().isRunning();
    }

    public final void LJIILJJIL() {
        LIZJ();
        this.LJIILLIIL.lock();
        try {
            LJFF();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LJIILLIIL.unlock();
    }

    public static C1469160oKo LJ() {
        return C790230UzF.LIZ;
    }

    public final Map<String, Object> LIZLLL(String str) {
        Map map;
        C1471330oOJ c1471330oOJ = this.LJIJI;
        c1471330oOJ.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map map2 = (Map) ((ConcurrentHashMap) c1471330oOJ.LIZ).get(str);
        if (map2 != null) {
            map = C1471330oOJ.LIZ(map2);
        } else {
            map = new HashMap();
        }
        map.putAll(c1471330oOJ.LIZIZ);
        String stringValue = C790230UzF.LIZ.LIZJ().getStringValue(31301, str);
        if (!TextUtils.isEmpty(stringValue)) {
            map.put("st_preload_sc_info", stringValue);
        }
        if (!((ConcurrentLinkedQueue) c1471330oOJ.LIZJ).isEmpty()) {
            map.put("st_throws", c1471330oOJ.LIZJ);
            ((ConcurrentLinkedQueue) c1471330oOJ.LIZJ).clear();
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("vid: ");
        sbLIZ.append(str);
        sbLIZ.append(", gotten log data: ");
        sbLIZ.append(map);
        C1471660oOq.LIZJ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ));
        return map;
    }

    public final Map<String, Object> LJII(String str) {
        this.LJIJI.getClass();
        return C1471330oOJ.LIZJ(0, str);
    }

    public final void LJIIIIZZ(String str) {
        C1471330oOJ c1471330oOJ = this.LJIJI;
        c1471330oOJ.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) c1471330oOJ.LIZ).remove(str);
        }
    }

    public final void LJIIL(C1481900ofM c1481900ofM) {
        this.LJIILLIIL.lock();
        try {
            if (this.LIZLLL == null) {
                LIZJ().setPreciseExpService(new C1469340oL6(this));
            }
            this.LIZLLL = c1481900ofM;
            this.LJIILLIIL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIILLIIL.unlock();
            throw th;
        }
    }

    public final void LIZIZ(String str, Map map) {
        if (!this.LJI && LIZJ().isLoadLibrarySucceed()) {
            LIZJ().setAppInfo(str);
            this.LJI = true;
        }
        if (map != null) {
            HashMap map2 = (HashMap) map;
            if (map2.containsKey("appid")) {
                this.LJIIJJI = C795730VJj.LJIILIIL(map2.get("appid"));
            }
        }
    }

    public final void LJIIJ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[preload] Algorithm json ");
            sbLIZ.append(str);
            C1471660oOq.LIZJ("VCStrategy", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LIZJ().isLoadLibrarySucceed()) {
            LIZJ().setAlgorithmJson(i, str);
            return;
        }
        ((ConcurrentHashMap) this.LJIJJLI).put(Integer.valueOf(i), str);
    }

    public final void LJIIJJI(int i, int i2) {
        if (i != 31225) {
            if (i > 50000 && i < 60000) {
                if (i >= 58000) {
                    if (i <= 58999 && i == 58001) {
                        this.LJJ = i2;
                    }
                } else if (i == 55430) {
                    this.LJJIFFI = i2;
                }
            } else {
                return;
            }
        }
        if (LIZJ().isLoadLibrarySucceed()) {
            LIZJ().setIntValue(i, i2);
            return;
        }
        ((ConcurrentHashMap) this.LJIJJ).put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void LIZ(String str, String str2, Map map, String[] strArr) {
        List arrayList;
        try {
            if (map.containsKey("infos")) {
                arrayList = (List) map.get("infos");
            } else {
                arrayList = new ArrayList();
            }
            HashMap map2 = new HashMap();
            map2.put("urls", strArr);
            map2.put("file_hash", str2);
            arrayList.add(map2);
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            map.put("vid", str);
            map.put("infos", arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("VCStrategy", th.toString());
        }
    }

    public final Map<String, Integer> LJIIIZ(InterfaceC1467050oHP interfaceC1467050oHP, int i, Map<String, String> map, C1468630oJx c1468630oJx) {
        String strSelectBitrate = LIZJ().selectBitrate(interfaceC1467050oHP.LJIJ(), i, C406601i4.LIZ(map), c1468630oJx);
        HashMap map2 = null;
        if (TextUtils.isEmpty(strSelectBitrate)) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[GearStrategy]StrategyHelper.selectResolution result invalid retString=");
            sbLIZ.append(strSelectBitrate);
            TTVideoEngineLog.d("VCStrategy", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (strSelectBitrate != null && strSelectBitrate.length() >= 2) {
            map2 = new HashMap();
            for (String str : strSelectBitrate.split(",")) {
                try {
                    try {
                        String[] strArrSplit = str.split(":");
                        if (strArrSplit.length == 2) {
                            map2.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                        }
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i3 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d(e);
                        return map2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return map2;
    }
}
