package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885840zAs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC1884170z8B enumC1884170z8B, String str, Object obj) {
        String string;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("error_type", String.valueOf(enumC1884170z8B.getValue()));
        c2241008qG.LIZ.put("error_reason", str);
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        c2241008qG.LIZ.put("extras", string);
        try {
            C793770VBv.LJII("ac_jsb_optmized_error", c2241008qG.LJ(), null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
