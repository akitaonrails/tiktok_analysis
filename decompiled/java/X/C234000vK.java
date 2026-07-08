package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00vK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C234000vK extends C233900vJ {
    public volatile InterfaceC234100vL LIZJ;

    public C234000vK(Function1<? super Class<?>, Boolean> function1) {
        super(function1);
    }

    @Override // X.C09FQ
    public final Class<?> get(String str) {
        if (this.LIZJ != null) {
            synchronized (this) {
                try {
                    if (this.LIZJ != null) {
                        this.LIZJ.LIZ(this);
                    }
                    this.LIZJ = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Object obj = ((LinkedHashMap) this.LIZIZ).get(str);
        if (obj != null) {
            return (Class) obj;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregistered key:");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
