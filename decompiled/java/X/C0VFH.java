package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VFH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFH implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("package", context.getPackageName(), bundle);
            C786410Ut5.LJJJI("class", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5UgU8LjIVnnPtbxDg=", null)), bundle);
            bundle.putInt("badgenumber", i);
            try {
                C2204961BRm.LJJIJL(context.getContentResolver(), UriProtector.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5UgU8LjIVnnPtbxDg=", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new C0VFP(th.getMessage());
            }
        }
    }
}
