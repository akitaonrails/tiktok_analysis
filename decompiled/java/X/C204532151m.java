package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.features.model.DynamicFeatureConfig;
import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.151m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204532151m implements InterfaceC2251961DCg<C204535151p> {
    public InterfaceC830890Wid LIZ;
    public final ReentrantLock LIZIZ;
    public final Condition LIZJ;
    public final C20341114iX LIZLLL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Wh5, X.14iX] */
    public C204532151m() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZIZ = reentrantLock;
        this.LIZJ = reentrantLock.newCondition();
        ?? r0 = new InterfaceC829930Wh5() { // from class: X.14iX
            @Override // X.InterfaceC829930Wh5
            public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                    final C204532151m c204532151m = this.LIZ;
                    if (c204532151m.LIZ == null) {
                        c204532151m.getClass();
                        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("feed_realtime_feature_producer", new ArrayList(), null, new AbstractC830880Wic() { // from class: X.151l
                            @Override // X.AbstractC830880Wic
                            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, final EnumC2213771Bkd enumC2213771Bkd) {
                                if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                    C204532151m c204532151m2 = c204532151m;
                                    synchronized (this) {
                                        try {
                                            if (c204532151m2.LIZ != null) {
                                                TTMStrategyCenterManager.deregisterSceneWithScene(interfaceC830890Wid);
                                            } else {
                                                c204532151m2.LIZ = interfaceC830890Wid;
                                                TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c204532151m2.LIZLLL);
                                                ReentrantLock reentrantLock2 = c204532151m2.LIZIZ;
                                                reentrantLock2.lock();
                                                try {
                                                    c204532151m2.LIZJ.signalAll();
                                                    reentrantLock2.unlock();
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    reentrantLock2.unlock();
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw th2;
                                        }
                                    }
                                }
                                c204532151m.getClass();
                                C0NB9.LIZ(new C0NBA() { // from class: X.151o
                                    @Override // X.C0NBA
                                    public final void LIZ(C0NBB c0nbb) throws JSONException {
                                        c0nbb.LIZ("code", Integer.valueOf(C204536151q.LIZ(enumC2213771Bkd)));
                                    }
                                }, "feed_dynamic_feature_register");
                            }
                        });
                        return;
                    }
                    return;
                }
                if (enumC829940Wh6 != EnumC829940Wh6.TTMStateSceneDataUpdateFinish) {
                    return;
                }
                final C204532151m c204532151m2 = this.LIZ;
                if (c204532151m2.LIZ != null) {
                    return;
                }
                c204532151m2.getClass();
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("feed_realtime_feature_producer", new ArrayList(), null, new AbstractC830880Wic() { // from class: X.151l
                    @Override // X.AbstractC830880Wic
                    public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, final EnumC2213771Bkd enumC2213771Bkd) {
                        if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                            C204532151m c204532151m22 = c204532151m2;
                            synchronized (this) {
                                try {
                                    if (c204532151m22.LIZ != null) {
                                        TTMStrategyCenterManager.deregisterSceneWithScene(interfaceC830890Wid);
                                    } else {
                                        c204532151m22.LIZ = interfaceC830890Wid;
                                        TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c204532151m22.LIZLLL);
                                        ReentrantLock reentrantLock2 = c204532151m22.LIZIZ;
                                        reentrantLock2.lock();
                                        try {
                                            c204532151m22.LIZJ.signalAll();
                                            reentrantLock2.unlock();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            reentrantLock2.unlock();
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }
                        c204532151m2.getClass();
                        C0NB9.LIZ(new C0NBA() { // from class: X.151o
                            @Override // X.C0NBA
                            public final void LIZ(C0NBB c0nbb) throws JSONException {
                                c0nbb.LIZ("code", Integer.valueOf(C204536151q.LIZ(enumC2213771Bkd)));
                            }
                        }, "feed_dynamic_feature_register");
                    }
                });
            }
        };
        this.LIZLLL = r0;
        TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(r0);
    }

    @Override // X.InterfaceC2251961DCg
    public final void LIZIZ(C204535151p c204535151p) {
        C603460Nlg c603460Nlg;
        List<String> list;
        Object c098200Yq;
        InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
        SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
        if ((interfaceC582850MtX instanceof C603460Nlg) && (c603460Nlg = (C603460Nlg) interfaceC582850MtX) != null) {
            String str = c603460Nlg.LIZ;
            DynamicFeatureConfig dynamicFeatureConfig = (DynamicFeatureConfig) C07N4.LIZIZ.getValue();
            if (dynamicFeatureConfig != null && (list = dynamicFeatureConfig.eventWhiteList) != null && list.contains(str)) {
                try {
                    Map<? extends String, ? extends Object> mapLIZJ = LIZJ(str, c603460Nlg.LIZIZ.LIZ());
                    if (mapLIZJ != null) {
                        sessionFeatureItem.dynamicFeatures.putAll(mapLIZJ);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    LIZ(5, thM5exceptionOrNullimpl.getMessage());
                }
            }
        }
    }

    public static void LIZ(final int i, final String str) {
        C0NB9.LIZ(new C0NBA() { // from class: X.151n
            @Override // X.C0NBA
            public final void LIZ(C0NBB c0nbb) throws JSONException {
                c0nbb.LIZ("code", Integer.valueOf(i));
                c0nbb.LIZ("err_msg", str);
            }
        }, "feed_dynamic_feature_process");
    }

    public final Map<? extends String, Object> LIZJ(String str, JSONObject jSONObject) throws JSONException {
        Object obj;
        InterfaceC830890Wid interfaceC830890Wid = this.LIZ;
        if (interfaceC830890Wid == null) {
            LIZ(1, "scene is null");
            return null;
        }
        jSONObject.putOpt("feed_dynamic_event_name", str);
        InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, "feed_applog_realtime_feature", new TTMParamData(jSONObject));
        if (interfaceC805220ViKRunScene == null) {
            LIZ(2, "result is null");
            return null;
        }
        if (interfaceC805220ViKRunScene.LIZIZ() != EnumC1910390zoT.CelResult) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(interfaceC805220ViKRunScene.LIZIZ());
            sbLIZ.append(',');
            sbLIZ.append(interfaceC805220ViKRunScene.getErrorMessage());
            LIZ(3, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        Object objLIZJ = interfaceC805220ViKRunScene.LIZJ();
        if (!(objLIZJ instanceof Map)) {
            LIZ(4, String.valueOf(interfaceC805220ViKRunScene.LIZJ()));
            return null;
        }
        Map map = (Map) objLIZJ;
        if (map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Object obj2 : map.keySet()) {
            if ((obj2 instanceof String) && (obj = map.get(obj2)) != null) {
                map2.put(obj2, obj);
            }
        }
        LIZ(0, null);
        return map2;
    }
}
