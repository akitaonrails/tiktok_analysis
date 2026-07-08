package X;

import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0RPA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPA {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, androidx.lifecycle.ViewModel] */
    public static Assembler LIZ(C19EG c19eg) {
        if (C725080ScM.LJ) {
            HashMap<ViewModelStore, Assembler> map = C0RPC.LIZ;
            ViewModelStore viewModelStore = c19eg.getViewModelStore();
            C259800zU c259800zU = new C259800zU();
            ?? r0 = map.get(viewModelStore);
            c259800zU.element = r0;
            if (r0 == 0) {
                synchronized (map) {
                    try {
                        ?? r02 = map.get(viewModelStore);
                        c259800zU.element = r02;
                        if (r02 == 0) {
                            ?? r1 = ViewModelProviders.of(c19eg).get((Class<??>) Assembler.class);
                            map.put(viewModelStore, (Assembler) r1);
                            c259800zU.element = r1;
                            C723850SaN.LJI(new C0RPB(c19eg, viewModelStore));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            T t = c259800zU.element;
            if (t != 0) {
                return (Assembler) t;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return (Assembler) ViewModelProviders.of(c19eg).get(Assembler.class);
    }
}
