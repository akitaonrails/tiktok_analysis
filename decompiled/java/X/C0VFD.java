package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VFD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFD implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("com.smartisanos.launcher", "com.smartisanos.home");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.smartisanos.launcher.new_message");
            intent.putExtra("extra_packagename", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Pu2YWlYlWnPF0WjHPi96QwxcW", null)));
            intent.putExtra("extra_componentname", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Pu2YWlYlWnPF0WjHPi96QwxcW", null)));
            intent.putExtra("extra_message_count", i);
            if (C0VFC.LIZ(context, intent)) {
                try {
                    C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Pu2YWlYlWnPF0WjHPi96QwxcW", null));
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw new C0VFP(th.getMessage());
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("badge_num", i);
            try {
                C2204961BRm.LJJIJL(context.getContentResolver(), UriProtector.parse("content://com.smartisanos.launcher.badge"), "updateMessageBadge", null, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5Pu2YWlYlWnPF0WjHPi96QwxcW", null));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw new C0VFP("unable to resolve intent: " + intent.toString());
            }
        }
    }
}
