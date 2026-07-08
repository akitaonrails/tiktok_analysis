package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.128i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197066128i {
    public final C197067128j LIZ;
    public C197071128n LIZIZ;

    public final InterfaceC197061128d LIZIZ() {
        InterfaceC197061128d interfaceC197061128d;
        C197067128j c197067128j = this.LIZ;
        synchronized (c197067128j.LIZJ) {
            try {
                Iterator it2 = ((LinkedHashMap) c197067128j.LIZLLL).entrySet().iterator();
                while (true) {
                    interfaceC197061128d = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    interfaceC197061128d = (InterfaceC197061128d) entry.getValue();
                    if (Intrinsics.LJFF(str, "androidx.lifecycle.internal.SavedStateHandlesProvider") && interfaceC197061128d != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC197061128d;
    }

    public C197066128i(C197067128j c197067128j) {
        this.LIZ = c197067128j;
    }

    public final Bundle LIZ(String str) {
        Bundle bundleLIZ;
        C197067128j c197067128j = this.LIZ;
        if (c197067128j.LJI) {
            Bundle bundle = c197067128j.LJFF;
            if (bundle == null) {
                return null;
            }
            if (bundle.containsKey(str)) {
                bundleLIZ = C1303050k0t.LIZ(bundle, str);
            } else {
                bundleLIZ = null;
            }
            bundle.remove(str);
            if (bundle.isEmpty()) {
                c197067128j.LJFF = null;
            }
            return bundleLIZ;
        }
        "You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state".toString();
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    public final void LIZLLL(Class<? extends C128Z> cls) {
        if (this.LIZ.LJII) {
            C197071128n c197071128n = this.LIZIZ;
            if (c197071128n == null) {
                c197071128n = new C197071128n(this);
            }
            this.LIZIZ = c197071128n;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                C197071128n c197071128n2 = this.LIZIZ;
                if (c197071128n2 != null) {
                    c197071128n2.LIZ.add(cls.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Class ");
                sbLIZ.append(cls.getSimpleName());
                sbLIZ.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        "Can not perform this action after onSaveInstanceState".toString();
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final void LIZJ(String str, InterfaceC197061128d interfaceC197061128d) {
        C197067128j c197067128j = this.LIZ;
        synchronized (c197067128j.LIZJ) {
            try {
                if (!c197067128j.LIZLLL.containsKey(str)) {
                    c197067128j.LIZLLL.put(str, interfaceC197061128d);
                } else {
                    "SavedStateProvider with the given key is already registered".toString();
                    throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
