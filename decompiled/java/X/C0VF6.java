package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VF6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VF6 implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher", "org.adw.launcher.one");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("org.adw.launcher.counter.SEND");
            intent.putExtra("PNAME", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dsnAsjo1Av/5Y40gi", null)));
            intent.putExtra("CNAME", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dsnAsjo1Av/5Y40gi", null)));
            intent.putExtra("COUNT", i);
            if (C0VFC.LIZ(context, intent)) {
                try {
                    C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5dsnAsjo1Av/5Y40gi", null));
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
