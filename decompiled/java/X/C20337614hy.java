package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20337614hy {
    public final Gson LIZ = C19748512Ol.LIZIZ;
    public Keva LIZIZ;

    public C20337614hy() {
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(-1L);
            i++;
        } while (i < 10);
        new ArrayList(arrayList);
    }

    public final Keva LIZ(String str) {
        Keva keva = this.LIZIZ;
        if (keva != null) {
            return keva;
        }
        Keva repo = KevaImpl.getRepo(str, 0);
        this.LIZIZ = repo;
        return repo;
    }

    public <T> T LIZIZ(C20337814i0<T> c20337814i0) {
        String str;
        try {
            if (Intrinsics.LJFF(c20337814i0.LJ, Boolean.class)) {
                return (T) Boolean.valueOf(LIZ(c20337814i0.LIZJ).getBoolean(c20337814i0.LIZIZ, ((Boolean) c20337814i0.LIZLLL).booleanValue()));
            }
            if (Intrinsics.LJFF(c20337814i0.LJ, Integer.class)) {
                return (T) Integer.valueOf(LIZ(c20337814i0.LIZJ).getInt(c20337814i0.LIZIZ, ((Integer) c20337814i0.LIZLLL).intValue()));
            }
            if (Intrinsics.LJFF(c20337814i0.LJ, Float.class)) {
                return (T) Float.valueOf(LIZ(c20337814i0.LIZJ).getFloat(c20337814i0.LIZIZ, ((Float) c20337814i0.LIZLLL).floatValue()));
            }
            if (Intrinsics.LJFF(c20337814i0.LJ, Long.class)) {
                return (T) Long.valueOf(LIZ(c20337814i0.LIZJ).getLong(c20337814i0.LIZIZ, ((Long) c20337814i0.LIZLLL).longValue()));
            }
            if (Intrinsics.LJFF(c20337814i0.LJ, Double.class)) {
                return (T) Double.valueOf(LIZ(c20337814i0.LIZJ).getDouble(c20337814i0.LIZIZ, ((Double) c20337814i0.LIZLLL).doubleValue()));
            }
            if (Intrinsics.LJFF(c20337814i0.LJ, String.class)) {
                Keva kevaLIZ = LIZ(c20337814i0.LIZJ);
                String str2 = c20337814i0.LIZIZ;
                T t = c20337814i0.LIZLLL;
                if (t instanceof String) {
                    str = (String) t;
                } else {
                    str = null;
                }
                T t2 = (T) kevaLIZ.getString(str2, str);
                if (t2 == null) {
                    return null;
                }
                return t2;
            }
            String str3 = c20337814i0.LIZJ;
            String str4 = c20337814i0.LIZIZ;
            Type type = c20337814i0.LJ;
            T t3 = c20337814i0.LIZLLL;
            T t4 = (T) GsonProtectorUtils.fromJson(this.LIZ, LIZ(str3).getString(str4, ""), type);
            if (t4 != null) {
                return t4;
            }
            return t3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                C1CC3 c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2();
                if (c1cc3MN2 != null) {
                    c1cc3MN2.LJIILLIIL("PluginPropertyKeva", th);
                }
                return c20337814i0.LIZLLL;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void LIZJ(C20337814i0<T> c20337814i0, T t) {
        if (t == 0) {
            LIZ(c20337814i0.LIZJ).erase(c20337814i0.LIZIZ);
            return;
        }
        if (Intrinsics.LJFF(c20337814i0.LJ, Boolean.class)) {
            LIZ(c20337814i0.LIZJ).storeBoolean(c20337814i0.LIZIZ, ((Boolean) t).booleanValue());
            return;
        }
        if (Intrinsics.LJFF(c20337814i0.LJ, Integer.class)) {
            LIZ(c20337814i0.LIZJ).storeInt(c20337814i0.LIZIZ, ((Integer) t).intValue());
            return;
        }
        if (Intrinsics.LJFF(c20337814i0.LJ, Float.class)) {
            LIZ(c20337814i0.LIZJ).storeFloat(c20337814i0.LIZIZ, ((Float) t).floatValue());
            return;
        }
        if (Intrinsics.LJFF(c20337814i0.LJ, Long.class)) {
            LIZ(c20337814i0.LIZJ).storeLong(c20337814i0.LIZIZ, ((Long) t).longValue());
            return;
        }
        if (Intrinsics.LJFF(c20337814i0.LJ, Double.class)) {
            LIZ(c20337814i0.LIZJ).storeDouble(c20337814i0.LIZIZ, ((Double) t).doubleValue());
        } else if (Intrinsics.LJFF(c20337814i0.LJ, String.class)) {
            LIZ(c20337814i0.LIZJ).storeString(c20337814i0.LIZIZ, (String) t);
        } else {
            LIZ(c20337814i0.LIZJ).storeString(c20337814i0.LIZIZ, GsonProtectorUtils.toJson(this.LIZ, t));
        }
    }
}
