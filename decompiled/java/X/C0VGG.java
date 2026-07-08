package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VGG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGG {
    public static final C0VGG LIZ = new C0VGG();
    public static C0VGI LIZIZ;

    public static void LIZ(C0VGD c0vgd, Context context) {
        C806950Vl7 c806950Vl7 = C806950Vl7.LIZIZ;
        c806950Vl7.LJFF(c0vgd);
        if (c806950Vl7.LIZ()) {
            InterfaceC2211721BhK interfaceC2211721BhK = new InterfaceC2211721BhK() { // from class: X.0Vlk
                public static JSONObject LJ(Map map) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return jSONObject;
                }

                @Override // X.InterfaceC2211721BhK
                public final void LIZ(C0QFT c0qft) {
                    try {
                        C807350Vll.LIZIZ.LJI(new C807320Vli(c0qft.getPageInfo().LIZ, c0qft.getPageInfo().LIZIZ), LJ(c0qft.getPageInfo().LJFF));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.InterfaceC2211721BhK
                public final void LIZIZ(C0QFT c0qft) {
                    try {
                        C807350Vll.LIZIZ.LJFF(new C807320Vli(c0qft.getPageInfo().LIZ, c0qft.getPageInfo().LIZIZ), LJ(c0qft.getPageInfo().LJFF));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.InterfaceC2211721BhK
                public final void LIZJ(C0QFT c0qft) {
                    try {
                        C807350Vll.LIZIZ.LIZJ(new C807320Vli(c0qft.getPageInfo().LIZ, c0qft.getPageInfo().LIZIZ), LJ(c0qft.getPageInfo().LJFF));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.InterfaceC2211721BhK
                public final void LIZLLL(C0QFT c0qft) {
                    try {
                        C807350Vll.LIZIZ.LIZLLL(new C807320Vli(c0qft.getPageInfo().LIZ, c0qft.getPageInfo().LIZIZ), LJ(c0qft.getPageInfo().LJFF));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            };
            C2211621BhA.LIZ.getClass();
            ((CopyOnWriteArrayList) C2211621BhA.LJIIIZ.getValue()).add(interfaceC2211721BhK);
            C823050WQl.LIZJ().execute(new ARunnableS113S0100000_13(context, 139));
        }
    }
}
