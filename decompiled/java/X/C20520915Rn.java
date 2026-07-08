package X;

import android.text.TextUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;

/* JADX INFO: renamed from: X.15Rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20520915Rn {
    public final String LIZ;
    public final n LIZIZ;

    public final String toString() {
        return this.LIZIZ.toString();
    }

    public C20520915Rn(String str) {
        n nVar;
        this.LIZ = str;
        C204500150g c204500150g = C20521015Ro.LIZ;
        String string = "";
        if (c204500150g.LIZ.contains(str)) {
            c204500150g.LIZIZ.storeLong(str, System.currentTimeMillis());
            string = c204500150g.LIZ.getString(str, "");
        } else {
            c204500150g.LIZIZ.storeLong(str, System.currentTimeMillis());
            c204500150g.LIZ.storeString(str, "");
            if (c204500150g.LIZIZ.count() >= c204500150g.LIZJ) {
                C1287700jc8.LIZJ(new RunnableC204499150f(c204500150g));
            }
        }
        try {
            if (TextUtils.isEmpty(string)) {
                nVar = new n();
            } else {
                GsonUtils.LIZIZ.getClass();
                nVar = p.LIZJ(string).LJIILIIL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1BPP.LIZJ(4, "[PageStorage]The info is invalid, fallback to empty: ", th);
            nVar = new n();
        }
        this.LIZIZ = nVar;
    }

    public final void LIZ(Object obj) {
        synchronized (this.LIZIZ) {
            try {
                try {
                    this.LIZIZ.LJJIFFI("manifest", GsonUtils.LIZ().LJIJJLI(obj));
                    C204500150g c204500150g = C20521015Ro.LIZ;
                    String str = this.LIZ;
                    String string = this.LIZIZ.toString();
                    c204500150g.LIZIZ.storeLong(str, System.currentTimeMillis());
                    c204500150g.LIZ.storeString(str, string);
                    if (c204500150g.LIZIZ.count() >= c204500150g.LIZJ) {
                        C1287700jc8.LIZJ(new RunnableC204499150f(c204500150g));
                    }
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
