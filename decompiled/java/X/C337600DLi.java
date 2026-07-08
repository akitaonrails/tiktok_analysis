package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.common.utils.CommerceAgentToastUtil$addLifecycleObserverIfIsFirstTime$1;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.0DLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337600DLi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6106));

    public static void LIZ(Activity activity) {
        Object objLJFF;
        LifecycleOwner lifecycleOwner;
        long jLongValue;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (objLJFF = abstractC1387200mCcLJ.LJFF()) == null) {
            objLJFF = activity;
        }
        if ((objLJFF instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) objLJFF) != null && !activity.isFinishing() && !activity.isDestroyed()) {
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(activity, 1808);
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C01GW c01gw = LIZ;
                Long l = (Long) ((Map) c01gw.getValue()).get("bot_typing_toast");
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jCurrentTimeMillis - jLongValue >= 3000) {
                    awS545S0100000_1.invoke();
                    Long l2 = (Long) ((Map) c01gw.getValue()).get("bot_typing_toast");
                    if (l2 == null || l2.longValue() == 0) {
                        lifecycleOwner.getLifecycle().addObserver(new CommerceAgentToastUtil$addLifecycleObserverIfIsFirstTime$1());
                    }
                    ((Map) c01gw.getValue()).put("bot_typing_toast", Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }
}
