package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0pDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502950pDJ extends AbstractC1503000pDO {
    public final /* synthetic */ LinkedHashMap<String, String> LIZ;
    public final /* synthetic */ C118300cf LIZIZ;
    public final /* synthetic */ C118300cf LIZJ;
    public final /* synthetic */ C259800zU<InputStream> LIZLLL;
    public final /* synthetic */ C259800zU<String> LJ;
    public final /* synthetic */ C259800zU<Throwable> LJFF;
    public final /* synthetic */ C259800zU<WeakReference<C0X9S<TypedInput>>> LJI;

    public final void LIZ() {
        C0X9S<TypedInput> c0x9s;
        try {
            InputStream inputStream = this.LIZLLL.element;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            WeakReference<C0X9S<TypedInput>> weakReference = this.LJI.element;
            if (weakReference == null || (c0x9s = weakReference.get()) == null || c0x9s.isCanceled()) {
                return;
            }
            c0x9s.cancel();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final String LIZIZ() {
        return this.LJ.element;
    }

    public final Throwable LIZJ() {
        return this.LJFF.element;
    }

    public final InputStream LIZLLL() {
        return this.LIZLLL.element;
    }

    public C1502950pDJ(LinkedHashMap<String, String> linkedHashMap, C118300cf c118300cf, C118300cf c118300cf2, C259800zU<InputStream> c259800zU, C259800zU<String> c259800zU2, C259800zU<Throwable> c259800zU3, C259800zU<WeakReference<C0X9S<TypedInput>>> c259800zU4) {
        this.LIZ = linkedHashMap;
        this.LIZIZ = c118300cf;
        this.LIZJ = c118300cf2;
        this.LIZLLL = c259800zU;
        this.LJ = c259800zU2;
        this.LJFF = c259800zU3;
        this.LJI = c259800zU4;
    }
}
