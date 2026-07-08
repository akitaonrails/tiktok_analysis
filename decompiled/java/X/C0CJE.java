package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0CJE {
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public boolean LIZJ;

    public abstract String LIZIZ();

    public abstract boolean LIZJ();

    public void LIZ(Function0<Unit> function0) {
        if (LIZJ() && !this.LIZJ) {
            function0.invoke();
        }
    }

    public final void LJ(String str) {
        LIZ(new C0CJD((C0CKZ) this, str));
    }

    public final void LIZLLL(Object obj, String str) {
        LIZ(new C0CJB(this, str, obj));
    }
}
