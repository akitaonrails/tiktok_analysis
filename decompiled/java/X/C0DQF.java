package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.common.utils.TakoToastUtil$addLifecycleObserverIfIsFirstTime$1;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0DQF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQF {
    public static final C0DQF LIZ = new C0DQF();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3639));

    public static String LIZIZ(AIBotInfo aIBotInfo) {
        if (aIBotInfo.botId != 1 && aIBotInfo.botSource != 1) {
            return aIBotInfo.botName;
        }
        String str = C1852920yJm.LIZ.botName;
        if (str != null) {
            return str;
        }
        return "";
    }

    @InterfaceC1294060jmO
    public static void LIZLLL(int i, Activity activity) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LJIIIZ(Activity activity, View view) {
        if ((activity instanceof LifecycleOwner) && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131849775);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LJIIIIZZ(Activity activity, View view) {
        if (C07I8.LIZIZ) {
            if (view == null) {
                return;
            }
            LJII(this, view, 2131837962, null, null, 28);
        } else if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LJIIJ(Activity activity, View view) {
        if (C07I8.LIZIZ) {
            if (view == null) {
                return;
            }
            LJII(this, view, 2131822489, null, null, 28);
        } else if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131822489);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LIZ(C0DQF c0dqf, LifecycleOwner lifecycleOwner, Function0 function0) {
        long jLongValue;
        c0dqf.getClass();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C01GW c01gw = LIZIZ;
            Long l = (Long) ((Map) c01gw.getValue()).get("bot_typing_toast");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jCurrentTimeMillis - jLongValue >= 3000) {
                function0.invoke();
                Long l2 = (Long) ((Map) c01gw.getValue()).get("bot_typing_toast");
                if (l2 == null || l2.longValue() == 0) {
                    lifecycleOwner.getLifecycle().addObserver(new TakoToastUtil$addLifecycleObserverIfIsFirstTime$1());
                }
                ((Map) c01gw.getValue()).put("bot_typing_toast", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1857750yRZ.LIZJ("anti repeat exception!", e, 4);
        }
    }

    public static void LIZJ(C1389890mGx c1389890mGx, Integer num, Integer num2) {
        if (num != null) {
            c1389890mGx.LJFF(num.intValue());
        }
        if (num2 != null) {
            c1389890mGx.LJII(num2.intValue());
        }
    }

    public static void LJI(Fragment fragment, String str, Integer num, Integer num2) {
        if (fragment != null && C1857690yRT.LJIIJJI(fragment.getActivity())) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIJ(str);
            LIZJ(c1389890mGx, num, num2);
            c1389890mGx.LIZ(false);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LJIIL(Activity activity, View view, Map<String, String> map, AIBotInfo aIBotInfo) {
        Object objLJFF;
        LifecycleOwner lifecycleOwner;
        Object objLIZ;
        LifecycleOwner lifecycleOwner2;
        if (C07I8.LIZIZ) {
            if (view == null) {
                return;
            }
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ == null || (objLIZ = abstractC1387200mCcLJ.LJFF()) == null) {
                objLIZ = C1388190mED.LIZ(view.getContext());
            }
            if (!(objLIZ instanceof LifecycleOwner) || (lifecycleOwner2 = (LifecycleOwner) objLIZ) == null || !C1857690yRT.LJIIJJI(view.getContext())) {
                return;
            }
            LIZ(this, lifecycleOwner2, new C464401rO(map, view, aIBotInfo));
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 == null || (objLJFF = abstractC1387200mCcLJ2.LJFF()) == null) {
            objLJFF = activity;
        }
        if ((objLJFF instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) objLJFF) != null && !activity.isFinishing() && !activity.isDestroyed()) {
            LIZ(this, lifecycleOwner, new C464501rP(map, activity, aIBotInfo));
        }
    }

    public static void LJFF(Fragment fragment, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if (fragment != null && C1857690yRT.LJIIJJI(fragment.getActivity())) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIIZ(i);
            LIZJ(c1389890mGx, num, num2);
            c1389890mGx.LIZ(false);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LJIIJJI(C19EG c19eg, Fragment fragment, Map map, AIBotInfo aIBotInfo, long j) {
        C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C370201cC(j, c19eg, fragment, map, aIBotInfo, null), 3);
    }

    public static void LJ(View view, String str, Integer num, Integer num2, boolean z, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if (view.isAttachedToWindow()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(str);
            LIZJ(c1389890mGx, num, num2);
            c1389890mGx.LIZ(z);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LJII(C0DQF c0dqf, View view, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        c0dqf.getClass();
        if (view.isAttachedToWindow()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(i);
            LIZJ(c1389890mGx, num, num2);
            c1389890mGx.LIZ(false);
            c1389890mGx.LJIIJJI();
        }
    }
}
