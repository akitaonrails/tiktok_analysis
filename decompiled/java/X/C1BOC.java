package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1BOC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BOC implements InterfaceC2204171BOl, InterfaceC1542530qF9 {
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();

    public void release() {
        if (this.LIZIZ.compareAndSet(false, true)) {
            Enumeration<Object> enumerationElements = this.LIZJ.elements();
            while (enumerationElements.hasMoreElements()) {
                try {
                    Object objNextElement = enumerationElements.nextElement();
                    if (objNextElement instanceof InterfaceC1542530qF9) {
                        ((InterfaceC1542530qF9) objNextElement).release();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LIZJ.clear();
        }
    }

    public final String LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.hashCode());
        sbLIZ.append(String.valueOf(hashCode()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZJ(InterfaceC1542530qF9 interfaceC1542530qF9) {
        if (this.LIZIZ.get()) {
            return null;
        }
        String strLIZIZ = LIZIZ(interfaceC1542530qF9);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            this.LIZJ.putIfAbsent(strLIZIZ, interfaceC1542530qF9);
        }
        return strLIZIZ;
    }

    @Override // X.InterfaceC2204171BOl
    public final Object get(String str) {
        if (this.LIZIZ.get() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZJ.get(str);
    }

    @Override // X.InterfaceC2204171BOl
    public final Object remove(String str) {
        if (this.LIZIZ.get() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZJ.remove(str);
    }

    @Override // X.InterfaceC2204171BOl
    public final String LIZ(Object obj, String str) {
        if (this.LIZIZ.get() || obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZJ.putIfAbsent(str, obj);
        return str;
    }
}
