package X;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VED, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VED implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws C0VFP {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("package_name", C2204961BRm.LJJIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5ZoGIWmJRNlPFbMRO5nBrNOAmlAWdR", null)));
            contentValues.put("activity_name", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5ZoGIWmJRNlPFbMRO5nBrNOAmlAWdR", null)));
            contentValues.put("count", Integer.valueOf(i));
            try {
                C2204961BRm.LJJIJLIJ(context.getContentResolver(), UriProtector.parse("content://me.everything.badger/apps"), contentValues, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5ZoGIWmJRNlPFbMRO5nBrNOAmlAWdR", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new C0VFP(th.getMessage());
            }
        }
    }
}
