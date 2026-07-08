package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790570Uzn {
    public static C790570Uzn LJFF;
    public static InterfaceC790560Uzm LJI;
    public final Context LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public final C0V11 LIZ() {
        Context context = this.LIZ;
        if (C790950V0z.LIZJ == null) {
            synchronized (C790950V0z.class) {
                try {
                    if (C790950V0z.LIZJ == null) {
                        C790950V0z.LIZJ = new C790950V0z(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        List<C0V11> listLIZ = C790950V0z.LIZJ.LIZ();
        Logger.debug();
        if (listLIZ.isEmpty()) {
            return null;
        }
        return (C0V11) ListProtector.get(listLIZ, 0);
    }

    public final boolean LIZJ() {
        Context context;
        if (this.LIZJ && (context = this.LIZ) != null) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) C786410Ut5.H2(context, "appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = C786410Ut5.N3(context).getPackageName();
                int i = applicationInfo.uid;
                Reflect reflectOn = Reflect.on(appOpsManager);
                Class<?> cls = Integer.TYPE;
                if (((Integer) reflectOn.call("checkOpNoThrow", new Class[]{cls, cls, String.class}, Integer.valueOf(((Integer) reflectOn.field("OP_POST_NOTIFICATION", cls).get()).intValue()), Integer.valueOf(i), packageName).get()).intValue() != 0) {
                    return true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public final void LIZLLL() {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.LIZIZ);
            this.LIZJ = jSONObject.optInt("is_show", 0) == 1;
            this.LJ = jSONObject.optInt("is_cache_message", 1) == 1;
            jSONObject.optInt("show_time_mill", 5000);
            jSONObject.optInt("is_auto_dismiss", 1);
            this.LIZLLL = jSONObject.optInt("cache_size", 2);
            jSONObject.optInt("type", 2005);
            jSONObject.optInt("flag", 1160);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C790570Uzn(Context context) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZJ = false;
        this.LIZLLL = 2;
        this.LIZ = C786410Ut5.N3(context);
        C786410Ut5.H2(context, "window");
        C786410Ut5.LJLIIL(10000L, bPEAHandler, new Runnable() { // from class: X.0Uzl
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OppoPushWindowManager@858c.<init>$1");
                try {
                    if (this.LL.LIZJ()) {
                        C790570Uzn c790570Uzn = this.LL;
                        if (c790570Uzn.LJ && C790570Uzn.LIZIZ(c790570Uzn.LIZ).LIZ() != null) {
                            C790570Uzn.LJI.getClass();
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OppoPushWindowManager@858c.<init>$1");
            }
        });
    }

    public static synchronized C790570Uzn LIZIZ(Context context) {
        if (LJI != null) {
            if (LJFF == null) {
                LJFF = new C790570Uzn(context);
            }
        } else {
            throw new RuntimeException("should call init(context, pushWindowDepend) in Application");
        }
        return LJFF;
    }
}
