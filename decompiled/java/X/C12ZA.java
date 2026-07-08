package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzba;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final zzba LJFF;

    public final String toString() {
        return "Event{appId='" + this.LIZ + "', name='" + this.LIZIZ + "', params=" + String.valueOf(this.LJFF) + "}";
    }

    public final C12ZA LIZ(C19804712eD c19804712eD, long j) {
        return new C12ZA(c19804712eD, this.LIZJ, this.LIZ, this.LIZIZ, this.LIZLLL, j, this.LJFF);
    }

    public C12ZA(C19804712eD c19804712eD, String str, String str2, String str3, long j, Bundle bundle) {
        zzba zzbaVar;
        Object obj;
        C0W3J.LJI(str2);
        C0W3J.LJI(str3);
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LIZJ = TextUtils.isEmpty(str) ? null : str;
        this.LIZLLL = j;
        this.LJ = 0L;
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next == null) {
                    c19804712eD.LJIILJJIL().LJFF.LIZJ("Param name can't be null");
                    it2.remove();
                } else {
                    C19803112dx c19803112dxLJIILLIIL = c19804712eD.LJIILLIIL();
                    try {
                        obj = bundle2.get(next);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                    Object objLJJJLZIJ = c19803112dxLJIILLIIL.LJJJLZIJ(obj, next);
                    if (objLJJJLZIJ == null) {
                        c19804712eD.LJIILJJIL().LJIIIIZZ.LIZ(c19804712eD.LJIIL.LJFF(next), "Param value can't be null");
                        it2.remove();
                    } else {
                        c19804712eD.LJIILLIIL().LJJII(bundle2, next, objLJJJLZIJ);
                    }
                }
            }
            zzbaVar = new zzba(bundle2);
        } else {
            zzbaVar = new zzba(new Bundle());
        }
        this.LJFF = zzbaVar;
    }

    public C12ZA(C19804712eD c19804712eD, String str, String str2, String str3, long j, long j2, zzba zzbaVar) {
        C0W3J.LJI(str2);
        C0W3J.LJI(str3);
        C0W3J.LJIIIIZZ(zzbaVar);
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LIZJ = TextUtils.isEmpty(str) ? null : str;
        this.LIZLLL = j;
        this.LJ = j2;
        if (j2 != 0 && j2 > j) {
            c19804712eD.LJIILJJIL().LJIIIIZZ.LIZIZ(C19806212eS.LJIIJ(str2), "Event created with reverse previous/current timestamps. appId, name", C19806212eS.LJIIJ(str3));
        }
        this.LJFF = zzbaVar;
    }
}
