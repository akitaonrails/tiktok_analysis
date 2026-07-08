package X;

import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ckE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1023640ckE implements InterfaceC1092104Ox, InterfaceC1126004ao, InterfaceC1024040cks {
    public final Map<Class<? extends Object>, Object> providedContexts = new LinkedHashMap();
    public final C01GW providedLogics$delegate = C452501pT.LIZIZ(new C1023620ckC(this));
    public final C1023630ckD<?>[] internalLogics = new C1023630ckD[0];
    public IHostContextDepend hostContextDepend = C2214471Bll.LIZIZ();
    public IMonitorDepend monitorDepend = C2214471Bll.LIZJ();

    @Override // X.InterfaceC1126004ao
    public final Map<String, Function1<C1196804mE, Object>> getProvidedLogics() {
        return (Map) this.providedLogics$delegate.getValue();
    }

    public C1023630ckD<?>[] getInternalLogics() {
        return this.internalLogics;
    }

    @Override // X.InterfaceC1092104Ox
    public final Map<Class<? extends Object>, Object> getProvidedContexts() {
        return this.providedContexts;
    }

    public C1023640ckE(Object... objArr) {
        withContext(Arrays.copyOf(objArr, objArr.length));
    }

    public C1196804mE getParamContextRetriever(C1023640ckE... c1023640ckEArr) {
        return new C1196804mE((InterfaceC1092104Ox[]) Arrays.copyOf(c1023640ckEArr, c1023640ckEArr.length));
    }

    public Map<String, Object> getParams(InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr) {
        return getParams(interfaceC1023650ckFArr, new C1023640ckE(new Object[0]));
    }

    public void handleUnsatisfiedParams(List<? extends AbstractC1023700ckK> list) {
        IMonitorDepend iMonitorDepend;
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("parameter unsatisfied:\n");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends AbstractC1023700ckK> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getMessage());
        }
        sb.append(C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62));
        String string = sb.toString();
        IHostContextDepend iHostContextDepend = this.hostContextDepend;
        if ((iHostContextDepend != null && iHostContextDepend.isDebuggable()) || (iMonitorDepend = this.monitorDepend) == null) {
            return;
        }
        iMonitorDepend.ensureNotReachHere(new IllegalStateException(string), string, null);
    }

    public void setHostContextDepend(IHostContextDepend iHostContextDepend) {
        this.hostContextDepend = iHostContextDepend;
    }

    public void setMonitorDepend(IMonitorDepend iMonitorDepend) {
        this.monitorDepend = iMonitorDepend;
    }

    @Override // X.InterfaceC1024040cks
    public final void withContext(Object obj) {
        if (!(obj instanceof Object[])) {
            if (obj != null) {
                this.providedContexts.put((Class<? extends Object>) obj.getClass(), obj);
                for (Class<?> cls : obj.getClass().getInterfaces()) {
                    this.providedContexts.put((Class<? extends Object>) cls, obj);
                }
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final void withLogicProvider(InterfaceC1126004ao interfaceC1126004ao) {
        getProvidedLogics().putAll(interfaceC1126004ao.getProvidedLogics());
    }

    public final void withParamLogic(C1023630ckD<?> c1023630ckD) {
        getProvidedLogics().put(c1023630ckD.LIZ.getName(), c1023630ckD.LIZIZ);
    }

    @Override // X.InterfaceC1024040cks
    public final void withContext(Object... objArr) {
        Iterator it2 = C13LQ.LJIJI(objArr).iterator();
        while (it2.hasNext()) {
            withContext(it2.next());
        }
    }

    @InterfaceC1294060jmO
    public final Void withContext(Integer num) {
        throw new C1284660jXE(null, 1, null);
    }

    @InterfaceC1294060jmO
    public final Void withContext(String str) {
        throw new C1284660jXE(null, 1, null);
    }

    @InterfaceC1294060jmO
    public final Void withContext(List<?> list) {
        throw new C1284660jXE(null, 1, null);
    }

    @InterfaceC1294060jmO
    public final Void withContext(Map<?, ?> map) {
        throw new C1284660jXE(null, 1, null);
    }

    public final Map<String, Object> getParams(InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr, C1023640ckE c1023640ckE) {
        return getParams(interfaceC1023650ckFArr, getParamContextRetriever(this, c1023640ckE), new C1196904mF(this, c1023640ckE));
    }

    public void withContextByType(Class<?> cls, Object obj) {
        if (!(obj instanceof Object[])) {
            if (obj != null && cls.isAssignableFrom(obj.getClass())) {
                this.providedContexts.put(cls, obj);
                for (Class<?> cls2 : cls.getInterfaces()) {
                    this.providedContexts.put((Class<? extends Object>) cls2, obj);
                }
                return;
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.InterfaceC1024040cks
    public final <T> void withParam(InterfaceC1023650ckF<T, ?> interfaceC1023650ckF, T t) {
        getProvidedLogics().put(interfaceC1023650ckF.getName(), new C1002160cBa(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void withParamLogic(InterfaceC1023650ckF<T, ?> interfaceC1023650ckF, Function1<? super C1196804mE, ? extends T> function1) {
        getProvidedLogics().put(interfaceC1023650ckF.getName(), function1);
    }

    @Override // X.InterfaceC1024040cks
    public Map<String, Object> getParams(InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr, Function1<? super C1023640ckE, Unit> function1) {
        return getParams(interfaceC1023650ckFArr, C1023370cjn.LIZ(function1));
    }

    public final Map<String, Object> getParams(InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr, C1196804mE c1196804mE, C1196904mF c1196904mF) {
        Object objRequireParamValue;
        ArrayList arrayList = new ArrayList();
        int iLIZIZ = C2097908Jt.LIZIZ(interfaceC1023650ckFArr.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (InterfaceC1023650ckF<?, ?> interfaceC1023650ckF : interfaceC1023650ckFArr) {
            String name = interfaceC1023650ckF.getName();
            try {
                C01GW c01gw = C0A9U.LIZ;
                if (C0A9U.LIZIZ) {
                    objRequireParamValue = requireParamValueOpt(interfaceC1023650ckF, c1196904mF, c1196804mE);
                } else {
                    objRequireParamValue = requireParamValue(interfaceC1023650ckF, c1196904mF, c1196804mE);
                }
            } catch (AbstractC1023700ckK e) {
                TryCatchGuardChecker.doCheck(e);
                if (interfaceC1023650ckF.LIZJ()) {
                    arrayList.add(e);
                }
                objRequireParamValue = null;
            }
            Pair pair = new Pair(name, objRequireParamValue);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        if (!arrayList.isEmpty()) {
            handleUnsatisfiedParams(arrayList);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <CODE_TYPE, UPLOAD_TYPE> UPLOAD_TYPE requireParamValue(final InterfaceC1023650ckF<CODE_TYPE, ? extends UPLOAD_TYPE> interfaceC1023650ckF, C1196904mF c1196904mF, C1196804mE c1196804mE) throws AbstractC1023700ckK {
        Object obj = ((LinkedHashMap) c1196904mF.LIZ).get(interfaceC1023650ckF.getName());
        C19719512Dh.LJ(1, obj);
        Function1 function1LIZIZ = (Function1) obj;
        if (function1LIZIZ == null && (function1LIZIZ = interfaceC1023650ckF.LIZIZ()) == null) {
            throw new AbstractC1023700ckK(interfaceC1023650ckF) { // from class: X.0ckG
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(interfaceC1023650ckF.getName());
                    sbLIZ.append("'s logic is not found");
                    super(C2188811AlT.LIZIZ(sbLIZ), null);
                }
            };
        }
        return (UPLOAD_TYPE) interfaceC1023650ckF.LIZ(function1LIZIZ.invoke(c1196804mE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <CODE_TYPE, UPLOAD_TYPE> UPLOAD_TYPE requireParamValueOpt(InterfaceC1023650ckF<CODE_TYPE, ? extends UPLOAD_TYPE> interfaceC1023650ckF, C1196904mF c1196904mF, C1196804mE c1196804mE) {
        Object objInvoke;
        Object obj = ((LinkedHashMap) c1196904mF.LIZ).get(interfaceC1023650ckF.getName());
        C19719512Dh.LJ(1, obj);
        Function1 function1LIZIZ = (Function1) obj;
        if (function1LIZIZ == null) {
            function1LIZIZ = interfaceC1023650ckF.LIZIZ();
        }
        if (function1LIZIZ == null || (objInvoke = function1LIZIZ.invoke(c1196804mE)) == null) {
            return null;
        }
        return (UPLOAD_TYPE) interfaceC1023650ckF.LIZ(objInvoke);
    }
}
