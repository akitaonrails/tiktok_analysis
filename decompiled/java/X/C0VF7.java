package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VF7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VF7 implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws Throwable {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
            intent.putExtra("package", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dpmIcqY9ImN1dUbmqjw==", null)));
            intent.putExtra("count", i);
            intent.putExtra("badgecount", i);
            intent.putExtra("class", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dpmIcqY9ImN1dUbmqjw==", null)));
            C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dpmIcqY9ImN1dUbmqjw==", null));
            if (C0VFC.LIZ(context, intent)) {
                try {
                    C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dpmIcqY9ImN1dUbmqjw==", null));
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
