package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashSet;

/* JADX INFO: renamed from: X.1Bef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210071Bef implements Application.ActivityLifecycleCallbacks {
    public int LL;
    public C2209991BeX LLILLJJLI;
    public long LLILLL;
    public String LLILZ;
    public final C2209901BeO LLILZLL;
    public final HashSet<Integer> LLILZIL = new HashSet<>(8);
    public boolean LLIZ = false;
    public volatile boolean LLIZLLLIL = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C2210071Bef(C2209901BeO c2209901BeO) {
        this.LLILZLL = c2209901BeO;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.LLILZIL.remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        boolean zLJI = MethodIDManager.LJI(71644);
        String name = "";
        this.LLILZLL.LJLI.LIZLLL = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2209791BeD c2209791BeD = this.LLILZLL.LJJZZI;
        Object[] objArr = new Object[1];
        if (activity != null) {
            name = activity.getClass().getName();
        }
        objArr[0] = name;
        c2209791BeD.LJIIIIZZ("onActivityPaused:{}", objArr);
        C2209991BeX c2209991BeX = this.LLILLJJLI;
        if (c2209991BeX != null) {
            this.LLILZ = c2209991BeX.LLJJLIIIJLLLLLLLZ;
            this.LLILLL = jCurrentTimeMillis;
            C2209991BeX c2209991BeX2 = (C2209991BeX) c2209991BeX.clone();
            c2209991BeX2.LJIIL(jCurrentTimeMillis);
            long j = jCurrentTimeMillis - c2209991BeX.LLILLJJLI;
            if (j <= 0) {
                j = 1000;
            }
            c2209991BeX2.LLJJJJLIIL = j;
            this.LLILZLL.LLLIIIL(c2209991BeX2);
            this.LLILLJJLI = null;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        LIZ(activity.getClass().getName(), activity.hashCode());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.LL++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.LLILZ != null) {
            int i = this.LL - 1;
            this.LL = i;
            if (i <= 0) {
                this.LLILZ = null;
                this.LLILLL = 0L;
            }
        }
    }

    public final void LIZ(String str, int i) {
        boolean z;
        C2210731Bfj c2210731Bfj = this.LLILZLL.LJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("___");
        sbLIZ.append(i);
        c2210731Bfj.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILZLL.LJJZZI.LJIIIIZZ("onActivityResumed: {}", str);
        if (this.LLILLJJLI == null && this.LLILLL > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.LLILZ;
        C2209991BeX c2209991BeX = new C2209991BeX();
        if (!TextUtils.isEmpty("")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(":");
            sbLIZ2.append("");
            c2209991BeX.LLJJLIIIJLLLLLLLZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            c2209991BeX.LLJJLIIIJLLLLLLLZ = str;
        }
        c2209991BeX.LJIIL(jCurrentTimeMillis);
        c2209991BeX.LLJJJJLIIL = -1L;
        if (str2 == null) {
            str2 = "";
        }
        c2209991BeX.LLJJL = str2;
        this.LLILZLL.LLLIIIL(c2209991BeX);
        this.LLILLJJLI = c2209991BeX;
        c2209991BeX.LLJL = !this.LLILZIL.remove(Integer.valueOf(i)) ? 1 : 0;
        if (this.LLIZLLLIL) {
            if (!this.LLIZ) {
                this.LLILZLL.LLLIIIIL("applog_activity_resume", "{\"v\":1}", false);
            } else if (z) {
                long j = this.LLILLL;
                if (j < jCurrentTimeMillis - 3000 && j > jCurrentTimeMillis - 30000) {
                    this.LLILZLL.LLLIIIIL("applog_activity_resume", "{\"v\":2}", false);
                } else if (this.LLILLL < jCurrentTimeMillis - 30000) {
                    this.LLILZLL.LLLIIIIL("applog_activity_resume", "{\"v\":3}", false);
                }
            }
        }
        this.LLIZ = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.LLILZIL.add(Integer.valueOf(activity.hashCode()));
    }
}
