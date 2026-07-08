package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.15P5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15P5 {
    public final C19374110qx LIZ;
    public final Integer LIZIZ;

    public C15P5(String str, C19374110qx c19374110qx) {
        Integer numValueOf;
        this.LIZ = c19374110qx;
        List<C15P5> list = C1EAR.LIZ;
        try {
            numValueOf = Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            numValueOf = null;
        }
        this.LIZIZ = numValueOf;
    }
}
