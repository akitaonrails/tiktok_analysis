package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VFA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFA implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return new ArrayList(0);
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Ys2EFlIxRv/5YxqeE", null)));
            intent.putExtra("badge_count_class_name", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Ys2EFlIxRv/5YxqeE", null)));
            if (C0VFC.LIZ(context, intent)) {
                try {
                    C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Ys2EFlIxRv/5YxqeE", null));
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
