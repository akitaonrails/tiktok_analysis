package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.widget.model.AppWidgetStruct;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0y0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841000y0Y {
    public static final C1841000y0Y LIZ = new C1841000y0Y();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(286));
    public static AppWidgetStruct LIZJ;

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public final AppWidgetStruct LIZ() {
        C2206291BWp.LIZ.getClass();
        AppWidgetStruct appWidgetStruct = null;
        if (!((Boolean) C2206291BWp.LJIILL.getValue()).booleanValue()) {
            try {
                return (AppWidgetStruct) new Gson().LJII(LIZIZ().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        if (LIZJ == null) {
            synchronized (this) {
                try {
                    if (LIZJ == null) {
                        try {
                            appWidgetStruct = (AppWidgetStruct) new Gson().LJII(LIZIZ().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        LIZJ = appWidgetStruct;
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
        return LIZJ;
    }
}
