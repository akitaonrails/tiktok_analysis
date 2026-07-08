package X;

import android.os.Build;
import android.os.Looper;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.android.starship.strategy.DecisionConfig;
import com.bytedance.android.starship.strategy.graph.CancelableJobImpl;
import com.bytedance.android.starship.strategy.repository.ContainerInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306760k6s implements InterfaceC1306890k75 {
    public final EnumC1306750k6r LIZ;
    public volatile ConcurrentHashMap<String, DecisionConfig> LIZIZ;
    public volatile ConcurrentHashMap<String, List<String>> LIZJ;
    public final ReentrantReadWriteLock LIZLLL = new ReentrantReadWriteLock();

    public final IStarShipStrategy LIZIZ() {
        C1306250k63 c1306250k63 = (C1306250k63) C1306480k6Q.LIZIZ().get(this.LIZ.getValue());
        return c1306250k63 == null ? C1306370k6F.LIZ : c1306250k63;
    }

    @Override // X.InterfaceC1306890k75
    public final Map<String, DecisionConfig> LJII() {
        return new LinkedHashMap(this.LIZIZ);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void loadStarShipStrategy() {
        C1306520k6U.LIZJ();
        C1306520k6U.LIZLLL.getValue();
    }

    public C1306760k6s(EnumC1306750k6r enumC1306750k6r) {
        this.LIZ = enumC1306750k6r;
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = new ConcurrentHashMap<>();
        C054G c054g = C1306520k6U.LIZ;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C1307940k8m.LIZIZ().isDebug();
        }
        String value = enumC1306750k6r.getValue();
        try {
            String string = C1306600k6c.LIZ().getString(C1306600k6c.LIZIZ("decision_config_entry", value), null);
            String string2 = C1306600k6c.LIZ().getString(C1306600k6c.LIZIZ("decision_mapping_entry", value), null);
            if (string == null) {
                if (string2 == null) {
                    return;
                }
            } else if (string2 != null) {
                Gson gson = C1306320k6A.LIZ;
                Pair pair = new Pair((ConcurrentHashMap) gson.LJIIIIZZ(string, new TypeToken<ConcurrentHashMap<String, DecisionConfig>>() { // from class: X.0k78
                }.getType()), (ConcurrentHashMap) gson.LJIIIIZZ(string2, new TypeToken<ConcurrentHashMap<String, List<? extends String>>>() { // from class: X.00mY
                }.getType()));
                ReentrantReadWriteLock.WriteLock writeLock = this.LIZLLL.writeLock();
                writeLock.lock();
                try {
                    this.LIZIZ = (ConcurrentHashMap) pair.getFirst();
                    this.LIZJ = (ConcurrentHashMap) pair.getSecond();
                    writeLock.unlock();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    writeLock.unlock();
                    throw th;
                }
            }
            throw new IllegalStateException("decisionConfigData and mappingData must not be null");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1306600k6c.LIZ().erase(C1306600k6c.LIZIZ("decision_config_entry", value));
            C1306600k6c.LIZ().erase(C1306600k6c.LIZIZ("decision_mapping_entry", value));
        }
    }

    public static ConcurrentHashMap LIZ(Map map) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            Object key = entry.getKey();
            List<String> list = ((DecisionConfig) entry.getValue()).tags;
            if (list != null) {
                for (String str : list) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        objPutIfAbsent = concurrentHashMap.computeIfAbsent(str, new Function() { // from class: X.0k6z
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return new ArrayList();
                            }
                        });
                    } else {
                        ArrayList arrayList = new ArrayList();
                        objPutIfAbsent = concurrentHashMap.putIfAbsent(str, arrayList);
                        if (objPutIfAbsent == null) {
                            objPutIfAbsent = arrayList;
                        }
                    }
                    C19719512Dh.LIZIZ(objPutIfAbsent).add(key);
                }
            }
        }
        return concurrentHashMap;
    }

    @Override // X.InterfaceC1306890k75
    public final Map<String, DecisionConfig> LIZLLL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReentrantReadWriteLock.ReadLock lock = this.LIZLLL.readLock();
        lock.lock();
        try {
            ConcurrentHashMap<String, DecisionConfig> concurrentHashMap = this.LIZIZ;
            List<String> list = this.LIZJ.get(str);
            if (list != null) {
                for (String str2 : list) {
                    DecisionConfig decisionConfig = concurrentHashMap.get(str2);
                    if (decisionConfig != null) {
                        linkedHashMap.put(str2, decisionConfig);
                    }
                }
            }
            lock.unlock();
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean addDataProvider(InterfaceC1307050k7L interfaceC1307050k7L) {
        ((ConcurrentHashMap) C589410N9v.LIZ.getValue()).put(interfaceC1307050k7L.getName(), interfaceC1307050k7L);
        return true;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final String getStrategyVersion(String str) {
        return LIZIZ().getStrategyVersion(str);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean isStrategyLoaded(String str) {
        C1306520k6U.LIZJ();
        return LIZIZ().isStrategyLoaded(str);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final boolean removeDataProvider(String str) {
        ((ConcurrentHashMap) C589410N9v.LIZ.getValue()).remove(str);
        return true;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategySync(C1306400k6I c1306400k6I) {
        return LIZIZ().runStrategySync(c1306400k6I);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final C1306060k5k runStrategyWithEvent(C1306400k6I c1306400k6I) {
        return LIZIZ().runStrategyWithEvent(c1306400k6I);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void getStrategyResult(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        LIZIZ().getStrategyResult(c1306400k6I, function1);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final CancelableJob registerStrategyCallback(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        C1306510k6T.LIZ.getClass();
        if (C1306480k6Q.LIZLLL) {
            return LIZIZ().registerStrategyCallback(c1306400k6I, function1);
        }
        CancelableJobImpl cancelableJobImpl = new CancelableJobImpl(null);
        C1306930k79.LIZ.LIZ(new C1306790k6v(this, c1306400k6I, function1, cancelableJobImpl));
        return cancelableJobImpl;
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void runStrategy(C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1) {
        LIZIZ().runStrategy(c1306400k6I, function1);
    }

    @Override // com.bytedance.android.starship.strategy.IStarShipBaseStrategy
    public final void sendEvent(String str, Map<String, ? extends Object> map) {
        C1306070k5l c1306070k5l = C1306070k5l.LIZ;
        C23250099c.LIZLLL(C1306070k5l.LIZIZ, null, null, new C436800HAw(str, map, null), 3);
    }

    @Override // X.InterfaceC1306890k75
    public final void LJIIIIZZ(JSONObject jSONObject, List<String> list, Function1<? super C1307030k7J, Unit> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.LIZ.getValue(), new ContainerInput(String.valueOf(jSONObject), list));
        C1306510k6T.LIZ.getClass();
        C1306520k6U.LIZIZ();
        C1306520k6U.LJI("updateStrategiesConfig_input", new C1306810k6x(linkedHashMap, function1));
    }
}
