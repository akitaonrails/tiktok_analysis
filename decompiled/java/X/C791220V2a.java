package X;

import android.app.Application;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0V2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791220V2a {
    public static final StringBuilder LJI = new StringBuilder();
    public final Set<Integer> LIZ = LIZ();
    public final Set<Integer> LIZIZ = LIZ();
    public final Set<Integer> LIZJ = new HashSet();
    public final int LIZLLL = 30;
    public final int LJ = 450;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());

    public static Set LIZ() {
        String string;
        HashSet hashSet = new HashSet();
        Application application = C792190V5t.LIZIZ;
        if (application == null) {
            string = "";
        } else {
            C791230V2b.LIZ(application);
            string = C791230V2b.LIZ.getString("evil_method_SPUtils_key", null);
        }
        if (string == null) {
            return hashSet;
        }
        String[] strArrSplit = string.split(",");
        try {
            for (String str : strArrSplit) {
                hashSet.add(CastIntegerProtector.valueOf(str));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return hashSet;
    }
}
