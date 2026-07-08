package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VF8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VF8 implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
            intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
            intent.putExtra("com.htc.launcher.extra.COUNT", i);
            Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
            intent2.putExtra("packagename", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Ss3AslYNtkvJZMYg793fb", null)));
            intent2.putExtra("count", i);
            if (!C0VFC.LIZ(context, intent) && !C0VFC.LIZ(context, intent2)) {
                throw new C0VFP("unable to resolve intent: " + intent2.toString());
            }
            try {
                C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Ss3AslYNtkvJZMYg793fb", null));
                C2204961BRm.LJJJJI(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Ss3AslYNtkvJZMYg793fb", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new C0VFP(th.getMessage());
            }
        }
    }
}
