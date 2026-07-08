package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BZ2 implements InterfaceC2433109g9, InterfaceC2425909ez {
    public static final Object LIZJ = new Object();
    public volatile InterfaceC2433109g9 LIZ;
    public volatile Object LIZIZ = LIZJ;

    public C1BZ2(InterfaceC2433109g9 interfaceC2433109g9) {
        this.LIZ = interfaceC2433109g9;
    }

    @Override // X.InterfaceC2433109g9
    public final Object zza() {
        Object objZza;
        Object obj = this.LIZIZ;
        Object obj2 = LIZJ;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.LIZIZ;
                if (objZza == obj2) {
                    objZza = this.LIZ.zza();
                    Object obj3 = this.LIZIZ;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.LIZIZ = objZza;
                    this.LIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return objZza;
    }

    public static InterfaceC2425909ez LIZ(InterfaceC2433109g9 interfaceC2433109g9) {
        if (interfaceC2433109g9 instanceof InterfaceC2425909ez) {
            return (InterfaceC2425909ez) interfaceC2433109g9;
        }
        return new C1BZ2(interfaceC2433109g9);
    }

    public static InterfaceC2433109g9 LIZIZ(InterfaceC2433109g9 interfaceC2433109g9) {
        if (interfaceC2433109g9 instanceof C1BZ2) {
            return interfaceC2433109g9;
        }
        return new C1BZ2(interfaceC2433109g9);
    }
}
