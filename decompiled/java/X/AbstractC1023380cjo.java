package X;

import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1023380cjo extends C1023640ckE implements InterfaceC1004190cEr {
    public IAppLogDepend appLogDepend;

    @Override // X.C1023640ckE
    public abstract C1023630ckD<?>[] getInternalLogics();

    public InterfaceC1007800cKg getProcessor() {
        C1035030d2b.LIZ.getClass();
        return C1035030d2b.LIZIZ;
    }

    public AbstractC1023380cjo(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.appLogDepend = C2214471Bll.LIZ();
    }

    @Override // X.InterfaceC1004190cEr
    public final void log(InterfaceC1023400cjq<?> interfaceC1023400cjq) {
        logEvent$default(this, interfaceC1023400cjq, null, 2, null);
    }

    public void setLogDepend(IAppLogDepend iAppLogDepend) {
        this.appLogDepend = iAppLogDepend;
    }

    public Map<String, Object> flatParams(InterfaceC1023400cjq<?> interfaceC1023400cjq, C1023640ckE c1023640ckE) {
        if (c1023640ckE == null) {
            c1023640ckE = new C1023640ckE(new Object[0]);
        }
        C1196804mE c1196804mE = new C1196804mE(this, c1023640ckE);
        Map<String, Object> params = getParams(interfaceC1023400cjq.getKeys(), c1196804mE, new C1196904mF(this, c1023640ckE));
        InterfaceC1007800cKg processor = getProcessor();
        InterfaceC1007800cKg interfaceC1007800cKgLIZ = interfaceC1023400cjq.LIZ();
        if (interfaceC1007800cKgLIZ == null) {
            C1035030d2b.LIZ.getClass();
            interfaceC1007800cKgLIZ = C1035030d2b.LIZIZ;
        }
        return new C1023390cjp(processor, interfaceC1007800cKgLIZ).LIZ(c1196804mE, new LinkedHashMap(params), interfaceC1023400cjq.LIZIZ());
    }

    @Override // X.InterfaceC1004190cEr
    public final void log(InterfaceC1023400cjq<?> interfaceC1023400cjq, Function1<? super C1023640ckE, Unit> function1) {
        logEvent(interfaceC1023400cjq, function1);
    }

    public void logEvent(InterfaceC1023400cjq<?> interfaceC1023400cjq, Function1<? super C1023640ckE, Unit> function1) {
        Map<String, Object> mapFlatParams = flatParams(interfaceC1023400cjq, C1023370cjn.LIZ(function1));
        if (mapFlatParams == null) {
            return;
        }
        logInternal(interfaceC1023400cjq.LIZIZ(), mapFlatParams);
    }

    public void logInternal(String str, Map<String, ? extends Object> map) {
        String string;
        IAppLogDepend iAppLogDepend = this.appLogDepend;
        if (iAppLogDepend != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    string = value.toString();
                } else {
                    string = null;
                }
                linkedHashMap.put(key, string);
            }
            iAppLogDepend.onEventV3Map(str, linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(AbstractC1023380cjo abstractC1023380cjo, InterfaceC1023400cjq interfaceC1023400cjq, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            abstractC1023380cjo.logEvent(interfaceC1023400cjq, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
    }
}
