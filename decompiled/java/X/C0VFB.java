package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VFB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFB implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("com.asus.launcher", "com.lge.launcher", "com.lge.launcher2", "com.lge.launcher3");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dpXIXqY9ImN1dwXY00g==", null)));
            intent.putExtra("badge_count_class_name", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dpXIXqY9ImN1dwXY00g==", null)));
            intent.putExtra("badge_vip_count", 0);
            if (C0VFC.LIZ(context, intent)) {
                try {
                    C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dpXIXqY9ImN1dwXY00g==", null));
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw new C0VFP(th.getMessage());
                }
            }
            throw new C0VFP("unable to resolve intent: " + intent.toString());
        }
    }
}
