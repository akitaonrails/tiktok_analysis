package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.Binding;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMGroupChatApi$Internal$resolveDfSpiImpl$2", f = "IMGroupChatApi.kt", l = {}, m = "invokeSuspend")
public final class C1311105Bd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Class<Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1311105Bd(Class<Object> cls, String str, InterfaceC1364105Vn<? super C1311105Bd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cls;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1311105Bd c1311105Bd = new C1311105Bd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1311105Bd.LL = obj;
        return c1311105Bd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ReentrantLock reentrantLockPutIfAbsent;
        C1C7U.LIZ("IMGroupChatApi$Internal@4fc.resolveDfSpiImpl$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ConcurrentHashMap<Class<?>, ReentrantLock> concurrentHashMap = C1311205Be.LIZLLL;
        Class<?> cls = this.LLILLJJLI;
        ReentrantLock reentrantLock = concurrentHashMap.get(cls);
        if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (reentrantLock = new ReentrantLock()))) != null) {
            reentrantLock = reentrantLockPutIfAbsent;
        }
        ReentrantLock reentrantLock2 = reentrantLock;
        if (!reentrantLock2.isLocked()) {
            C1311205Be c1311205Be = C1311205Be.LIZ;
            Class<Object> cls2 = this.LLILLJJLI;
            c1311205Be.getClass();
            Object objLIZIZ = C1311205Be.LIZIZ(cls2);
            if (objLIZIZ != null) {
                C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.resolveDfSpiImpl$2");
                return objLIZIZ;
            }
        }
        reentrantLock2.lock();
        try {
            C1311205Be c1311205Be2 = C1311205Be.LIZ;
            Class<Object> cls3 = this.LLILLJJLI;
            c1311205Be2.getClass();
            Object objLIZIZ2 = C1311205Be.LIZIZ(cls3);
            if (objLIZIZ2 != null) {
                reentrantLock2.unlock();
                C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.resolveDfSpiImpl$2");
                return objLIZIZ2;
            }
            Class<Object> cls4 = this.LLILLJJLI;
            final String str = this.LLILLL;
            try {
                ServiceManager serviceManager = ServiceManager.get();
                final String name = cls4.getName();
                Binding bindingBind = serviceManager.bind(cls4, new ServiceProvider<T>(str, name) { // from class: X.04pt
                    public final String LIZ;
                    public final String LIZIZ;

                    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                    public final T get() {
                        Object objNewInstance;
                        try {
                            objNewInstance = Class.forName(this.LIZ).newInstance();
                            if (objNewInstance == null) {
                                objNewInstance = (T) null;
                            }
                            if (objNewInstance == null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onDFDownloaded(): new instance fail, spi: ");
                                sbLIZ.append(this.LIZIZ);
                                C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onDFDownloaded(): new instance success, spi: ");
                                sbLIZ2.append(this.LIZIZ);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            C189200o6.m2constructorimpl(objNewInstance);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            objNewInstance = (T) new C098200Yq(th);
                            C189200o6.m2constructorimpl(objNewInstance);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objNewInstance);
                        if (thM5exceptionOrNullimpl != null) {
                            Npth.reportBizException("IMGroupChatApi", thM5exceptionOrNullimpl, "IMGroupChatApi.onDFDownloaded(): new instance error", C2097608Jq.LJ());
                        }
                        if (C189200o6.m7isFailureimpl(objNewInstance)) {
                            return null;
                        }
                        return (T) objNewInstance;
                    }

                    {
                        this.LIZ = str;
                        this.LIZIZ = name;
                    }
                });
                bindingBind.asSingleton();
                C189200o6.m2constructorimpl(bindingBind);
                obj2 = bindingBind;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = c098200Yq;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
            if (thM5exceptionOrNullimpl != null) {
                Npth.reportBizException("IMGroupChatApi", thM5exceptionOrNullimpl, "IMGroupChatApi.onDFDownloaded(): bind instance error", C2097608Jq.LJ());
                reentrantLock2.unlock();
                C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.resolveDfSpiImpl$2");
                return null;
            }
            reentrantLock2.unlock();
            C1311205Be c1311205Be3 = C1311205Be.LIZ;
            Class<Object> cls5 = this.LLILLJJLI;
            c1311205Be3.getClass();
            Object objLIZIZ3 = C1311205Be.LIZIZ(cls5);
            Class<Object> cls6 = this.LLILLJJLI;
            if (objLIZIZ3 == null) {
                cls6.getClass();
            } else {
                cls6.getClass();
            }
            C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.resolveDfSpiImpl$2");
            return objLIZIZ3;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            reentrantLock2.unlock();
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
