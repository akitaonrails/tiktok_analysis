package X;

import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import java.util.Map;

/* JADX INFO: renamed from: X.0XH0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XH0 implements C0XWU {
    public static volatile C0XH0 LIZIZ;
    public final Context LIZ;

    public static C0XWU LIZLLL() {
        if (LIZIZ == null) {
            synchronized (C0XH0.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0XH0();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C0XH0() {
        TTAccountInit.LIZ();
        this.LIZ = C848000XOk.LIZ();
    }

    @Override // X.C0XWU
    public final void LIZ(String str, Map<String, String> map, AbstractC846040XGw<C846060XGy> abstractC846040XGw) {
        new C846050XGx(this.LIZ, C846050XGx.LJIIJJI(C0XH1.LIZ(str), null, map, true), abstractC846040XGw).LJIIIZ();
    }

    @Override // X.C0XWU
    public final void LIZIZ(String str, Map<String, String> map, AbstractC846040XGw<C846060XGy> abstractC846040XGw) {
        new C846050XGx(this.LIZ, C846050XGx.LJIIJJI(C0XH1.LIZ(str), null, map, false), abstractC846040XGw).LJIIIZ();
    }

    public final void LIZJ(String str, Map map, Map map2, boolean z, C847390XMb c847390XMb) {
        boolean zLJI = MethodIDManager.LJI(196620);
        new C846050XGx(this.LIZ, C846050XGx.LJIIJJI(str, map, map2, z), c847390XMb).LJIIIZ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
