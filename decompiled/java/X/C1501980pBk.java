package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501980pBk implements InterfaceC1500750p9l {
    public static C1501980pBk LJ;
    public IMessageManager LIZJ;
    public final ConcurrentHashMap<Class<?>, Pair<IMessageManager, Object>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Method, Pair<IMessageManager, C1500720p9i<?>>> LIZIZ = new ConcurrentHashMap<>();
    public final C1502000pBm LIZLLL = new InterfaceC1502020pBo() { // from class: X.0pBm
        @Override // X.InterfaceC1502020pBo
        public final void LIZ(Class cls) {
            C2097608Jq.LJ();
            this.LIZ.getClass();
        }
    };

    public static C1501980pBk LIZ() {
        if (LJ == null) {
            synchronized (C1501980pBk.class) {
                try {
                    if (LJ == null) {
                        LJ = new C1501980pBk();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final <T> T LIZIZ(final Class<T> cls, final T t) {
        if (this.LIZJ != null && LiveUplinkStrategySetting.INSTANCE.supportUplink() && this.LIZJ.isWsConnected()) {
            Pair<IMessageManager, Object> pair = this.LIZ.get(cls);
            if (pair == null || pair.first != this.LIZJ) {
                final IMessageManager iMessageManager = this.LIZJ;
                if (cls.isInterface()) {
                    if (cls.getInterfaces().length <= 0) {
                        pair = new Pair<>(iMessageManager, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.0pBl
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v15, types: [X.11wv] */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // java.lang.reflect.InvocationHandler
                            public final Object invoke(Object obj, Method method, Object[] objArr) {
                                C1500720p9i<?> c1500720p9iLIZJ;
                                String path;
                                String simpleName;
                                long jLongValue;
                                String simpleName2 = "";
                                C1501980pBk c1501980pBk = this.LL;
                                final IMessageManager iMessageManager2 = iMessageManager;
                                Class cls2 = cls;
                                Object obj2 = t;
                                c1501980pBk.getClass();
                                final C1500700p9g c1500700p9gLIZIZ = null;
                                try {
                                    C480460Ism.LIZ().getClass();
                                    c1500720p9iLIZJ = c1501980pBk.LIZJ(iMessageManager2, ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).P80(), method);
                                    try {
                                        c1500700p9gLIZIZ = c1500720p9iLIZJ.LIZIZ(objArr);
                                        path = new URL(c1500700p9gLIZIZ.LIZIZ).getPath();
                                    } catch (Exception e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("loadServiceMethod error or toRequest error: ");
                                        sbLIZ.append(e.toString());
                                        C20441214yg.LJIIIZ("LiveUplinkClient", C2188811AlT.LIZIZ(sbLIZ));
                                        path = "";
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    c1500720p9iLIZJ = null;
                                }
                                Map mapLJ = C2097608Jq.LJ();
                                if (cls2 == null) {
                                    simpleName = "";
                                } else {
                                    simpleName = cls2.getSimpleName();
                                }
                                Map<String, Long> map = (Map) mapLJ.get(simpleName);
                                if (map == null || !map.containsKey(path)) {
                                    Map<String, Map<String, Long>> mapUplinkApiAlternativeServiceIdList = LiveUplinkStrategySetting.INSTANCE.uplinkApiAlternativeServiceIdList();
                                    if (cls2 != null) {
                                        simpleName2 = cls2.getSimpleName();
                                    }
                                    map = mapUplinkApiAlternativeServiceIdList.get(simpleName2);
                                }
                                if (c1500720p9iLIZJ != null && c1500700p9gLIZIZ != null && !TextUtils.isEmpty(path) && map != null && map.containsKey(path) && c1500720p9iLIZJ.LJII != null) {
                                    Long l = map.get(path);
                                    final long j = 20000;
                                    if (l == null) {
                                        jLongValue = 20000;
                                    } else {
                                        jLongValue = l.longValue();
                                    }
                                    InterfaceC1502010pBn interfaceC1502010pBn = c1500720p9iLIZJ.LJII;
                                    if (jLongValue > 0) {
                                        j = jLongValue;
                                    }
                                    return interfaceC1502010pBn.LIZ(new InterfaceC19498711Qj() { // from class: X.11wv
                                        @Override // X.InterfaceC19498711Qj
                                        public final void LIZ(final C19498511Qh c19498511Qh) {
                                            iMessageManager2.sendRequest(j, c1500700p9gLIZIZ, new InterfaceC19666511x1() { // from class: X.11ww
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // X.InterfaceC19666511x1
                                                public final void LIZ(AbstractC19666311wz<C2222611Byt, ? extends Exception> abstractC19666311wz) {
                                                    InterfaceC19503211Sc<Object> interfaceC19503211Sc = c19498511Qh;
                                                    if (abstractC19666311wz instanceof C19666111wx) {
                                                        C2222611Byt c2222611Byt = (C2222611Byt) ((C19666111wx) abstractC19666311wz).LIZIZ;
                                                        Object obj3 = c2222611Byt.LJ;
                                                        if (obj3 instanceof BaseResponse) {
                                                            ((BaseResponse) obj3).LIZLLL = c2222611Byt.LJFF;
                                                        }
                                                        interfaceC19503211Sc.onSuccess(obj3);
                                                        return;
                                                    }
                                                    if (abstractC19666311wz instanceof C19666211wy) {
                                                        interfaceC19503211Sc.LIZ(((C19666211wy) abstractC19666311wz).LIZIZ);
                                                        return;
                                                    }
                                                    throw new C1954807lC();
                                                }
                                            });
                                        }
                                    });
                                }
                                return Proxy.getInvocationHandler(obj2).invoke(obj, method, objArr);
                            }
                        }));
                        this.LIZ.put(cls, pair);
                    } else {
                        throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
                    }
                } else {
                    throw new IllegalArgumentException("API declarations must be interfaces.");
                }
            }
            T t2 = (T) pair.second;
            if (t2 != null) {
                return t2;
            }
            return t;
        }
        return t;
    }

    public final C1500720p9i<?> LIZJ(IMessageManager iMessageManager, Retrofit retrofit, Method method) {
        Pair<IMessageManager, C1500720p9i<?>> pair;
        synchronized (this.LIZIZ) {
            try {
                pair = this.LIZIZ.get(method);
                if (pair == null || pair.first != iMessageManager) {
                    pair = new Pair<>(iMessageManager, new C1500930pA3(retrofit, method, LJ).LIZ());
                    this.LIZIZ.put(method, pair);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return (C1500720p9i) pair.second;
    }
}
