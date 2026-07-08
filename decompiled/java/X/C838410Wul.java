package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: X.0Wul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C838410Wul {
    public static final Object LIZ = new Object();

    public static Executor LIZJ(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C836530Wrj.LIZ(context);
        }
        final Handler handler = new Handler(context.getMainLooper());
        return new Executor(handler) { // from class: X.0WPt
            public final Handler LL;

            {
                this.LL = handler;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Handler handler2 = this.LL;
                runnable.getClass();
                if (C786410Ut5.LJJZZIII(handler2, runnable)) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL);
                sbLIZ.append(" is shutting down");
                throw new RejectedExecutionException(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public static String LJ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getPackageName());
        sbLIZ.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C838480Wus.LIZ(context, strLIZIZ) == 0) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Permission ");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" is required by your application to receive broadcasts, please add it to your manifest");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static int LIZ(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new C815520Vyw(context).LIZ()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static ColorStateList LIZIZ(int i, Context context) {
        ColorStateList colorStateListLIZ;
        ColorStateList colorStateList;
        C838440Wuo c838440Wuo;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C838430Wun c838430Wun = new C838430Wun(resources, theme);
        synchronized (C20143013rg.LIZJ) {
            try {
                SparseArray<C838440Wuo> sparseArray = C20143013rg.LIZIZ.get(c838430Wun);
                colorStateListLIZ = null;
                if (sparseArray != null && sparseArray.size() > 0 && (c838440Wuo = sparseArray.get(i)) != null) {
                    if (c838440Wuo.LIZIZ.equals(resources.getConfiguration()) && ((theme == null && c838440Wuo.LIZJ == 0) || (theme != null && c838440Wuo.LIZJ == theme.hashCode()))) {
                        colorStateList = c838440Wuo.LIZ;
                    } else {
                        sparseArray.remove(i);
                        colorStateList = null;
                    }
                } else {
                    colorStateList = null;
                }
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (colorStateList == null) {
            ThreadLocal<TypedValue> threadLocal = C20143013rg.LIZ;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z = true;
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                z = false;
            }
            if (!z) {
                try {
                    colorStateListLIZ = C19P9.LIZ(resources, resources.getXml(i), theme);
                } catch (Exception e) {
                }
            }
            if (colorStateListLIZ != null) {
                C20143013rg.LIZ(c838430Wun, i, colorStateListLIZ, theme);
                return colorStateListLIZ;
            }
            return C420650GeV.LIZIZ(resources, i, theme);
        }
        return colorStateList;
    }

    public static String LIZLLL(int i, Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            Object objH2 = C786410Ut5.H2(context, "locale");
            if (objH2 != null) {
                C838510Wuv.LJ(C838460Wuq.LIZ(objH2));
            } else {
                C838510Wuv c838510Wuv = C838510Wuv.LIZIZ;
            }
        } else {
            C838510Wuv c838510WuvLIZIZ = C838510Wuv.LIZIZ(C20154713tZ.LIZIZ(context));
            if (!c838510WuvLIZIZ.LIZLLL()) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                if (i2 >= 24) {
                    C838450Wup.LIZIZ(configuration, c838510WuvLIZIZ);
                } else if (!c838510WuvLIZIZ.LIZLLL()) {
                    configuration.setLocale(c838510WuvLIZIZ.LIZJ(0));
                }
                context = context.createConfigurationContext(configuration);
            }
        }
        return context.getString(i);
    }

    public static void LJIIIZ(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C789880Uyg.LIZIZ(context, intent);
        } else {
            C786410Ut5.s3(context, intent);
        }
    }

    public static void LJII(Context context, Intent[] intentArr, Bundle bundle) throws Throwable {
        Context context2;
        Intent[] intentArr2;
        Bundle bundle2;
        C0WZX c0wzx = new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OUpTd+iHazBjRtbZlh0=", new String[]{"01789"});
        C0WST c0wst = new C0WST();
        Object[] objArr = {intentArr, bundle};
        C0WZW c0wzw = new C0WZW(false, "([Landroid/content/Intent;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11089, "android/content/Context", "startActivities", context, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11089, "android/content/Context", "startActivities", null, objArr, context, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                context2 = (Context) obj;
            } else {
                context2 = context;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intentArr2 = (Intent[]) obj2;
            } else {
                intentArr2 = intentArr;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                bundle2 = (Bundle) obj3;
            } else {
                bundle2 = bundle;
            }
        } else {
            context2 = context;
            intentArr2 = intentArr;
            bundle2 = bundle;
        }
        context2.startActivities(intentArr2, bundle2);
        c0wst.LIZ(11089, "android/content/Context", "startActivities", null, objArr, context2, c0wzw, true);
    }

    public static void LJIIIIZZ(Context context, Intent intent, Bundle bundle) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_2");
        C2204961BRm.LJJJJJ(context, intent, bundle, new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OUpTd+iHazBjRtbZlh0=", new String[]{"01789"}));
    }

    public static Intent LJFF(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return LJI(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static Intent LJI(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 1) != 0) {
            if ((i & 4) == 0) {
                i |= 2;
            } else {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            }
        }
        if ((i & 2) == 0) {
            if ((i & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
        } else if ((i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return C786410Ut5.LJJ(context, broadcastReceiver, intentFilter, str, handler, i);
        }
        if (i2 >= 26) {
            return C789880Uyg.LIZ(context, broadcastReceiver, intentFilter, str, handler, i);
        }
        if ((i & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, LJ(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }
}
