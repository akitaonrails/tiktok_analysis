package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Set;

/* JADX INFO: renamed from: X.0C54, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C54 {
    public static final C0C54 LIZJ = new C0C54();
    public final InterfaceC307670C4f LIZ;
    public final C0C5R LIZIZ;

    public final Set<String> LIZIZ() {
        C0C5R c0c5r = this.LIZIZ;
        c0c5r.LIZ();
        return c0c5r.LIZ.LJ();
    }

    public C0C54() {
        InterfaceC307670C4f interfaceC307670C4fLJIIIZ = C0C58.LIZJ.LIZ.LJIIIZ();
        if (interfaceC307670C4fLJIIIZ instanceof C308110C5x) {
            this.LIZ = interfaceC307670C4fLJIIIZ;
        } else {
            this.LIZ = new C307660C4e(interfaceC307670C4fLJIIIZ);
        }
        this.LIZIZ = new C0C5R(this.LIZ);
    }

    public final k LIZ(String str) {
        C0C5R c0c5r = this.LIZIZ;
        c0c5r.LIZ();
        try {
            String string = c0c5r.LIZ.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                return (k) C0C56.LIZ.LJII(string, k.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public final Object LIZJ(String str) {
        return LIZLLL(str, false);
    }

    public final Object LIZLLL(String str, boolean z) {
        k kVarLJJIIZ = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C0C5R c0c5r = this.LIZIZ;
        c0c5r.LIZ();
        Object obj = c0c5r.LIZJ.get(str);
        Object obj2 = C0C5R.LIZLLL;
        if (obj != null) {
            if (obj != obj2) {
                return obj;
            }
        } else {
            String string = c0c5r.LIZ.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    n nVar = (n) C0C56.LIZ.LJII(string, n.class);
                    if (nVar != null) {
                        kVarLJJIIZ = nVar.LJJIIZ("val");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (z) {
                if (kVarLJJIIZ != null) {
                    c0c5r.LIZJ.put(str, kVarLJJIIZ);
                    return kVarLJJIIZ;
                }
                c0c5r.LIZJ.put(str, obj2);
                return kVarLJJIIZ;
            }
        }
        return kVarLJJIIZ;
    }
}
