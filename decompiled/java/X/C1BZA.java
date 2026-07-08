package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BZA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BZA implements C1BZB {
    public static final Object LIZJ = new Object();
    public volatile C1BZB LIZ;
    public volatile Object LIZIZ = LIZJ;

    public C1BZA(C1BZB c1bzb) {
        this.LIZ = c1bzb;
    }

    @Override // X.C1BZB
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

    public static C1BZB LIZ(C1BZB c1bzb) {
        if (c1bzb instanceof C1BZA) {
            return c1bzb;
        }
        return new C1BZA(c1bzb);
    }
}
