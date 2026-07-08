package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0VFM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFM implements C0VFN {
    @Override // X.C0VFN
    public final List<String> LIZ() {
        return Collections.singletonList("com.transsion.XOSLauncher");
    }

    @Override // X.C0VFN
    public final void LIZIZ(int i, ComponentName componentName, Context context) throws Throwable {
        Bundle bundle = new Bundle();
        try {
            C786410Ut5.LJJJI("package", context.getPackageName(), bundle);
            C786410Ut5.LJJJI("class", C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5EmVQogJVLnvdZJw5DEjksa4/xDSo=", null)), bundle);
            bundle.putInt("badgenumber", i);
            C2204961BRm.LJJIJL(context.getContentResolver(), UriProtector.parse("content://com.transsion.XOSLauncher.unreadprovider"), "change_badge", null, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI79fFctP5EmVQogJVLnvdZJw5DEjksa4/xDSo=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C0VFP(e.getMessage(), e);
        }
    }
}
