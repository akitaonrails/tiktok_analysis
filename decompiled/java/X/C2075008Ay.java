package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.task.hook.MainActivityLowMmProtectTask;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2075008Ay extends C09AY implements Function0<Map<Object, ? extends Object>> {
    public final /* synthetic */ MainActivityLowMmProtectTask LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2075008Ay(MainActivityLowMmProtectTask mainActivityLowMmProtectTask) {
        super(0);
        this.LL = mainActivityLowMmProtectTask;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Object, ? extends Object> invoke() {
        this.LL.getClass();
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return (Map) C1965507mv.LIZJ(declaredField.get(null), "mActivities");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.e("ActivityLowMmProtect", "do HomeActivity lmm protect prepare fail", e);
            return null;
        }
    }
}
