package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706720uVy {
    public static final C1706750uW1 LIZ;
    public static final C1706750uW1 LIZIZ;

    static {
        EnumC1706740uW0 enumC1706740uW0 = EnumC1706740uW0.PRIMARY;
        EnumC1706740uW0 enumC1706740uW02 = EnumC1706740uW0.SECONDARY;
        LIZ = new C1706750uW1(150, 48, 16, 0, enumC1706740uW0, 20, 0, enumC1706740uW02);
        LIZIZ = new C1706750uW1(147, 28, 0, 24, enumC1706740uW02, 24, 12, EnumC1706740uW0.TERTIARY);
    }

    public static final JSONObject LIZ(String str) {
        Object c098200Yq;
        if (str != null) {
            Object obj = null;
            if (!(!a0.LJJJIL(str))) {
                str = null;
            }
            if (str != null) {
                try {
                    c098200Yq = new JSONObject(str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    return jSONObject;
                }
            }
        }
        return new JSONObject();
    }

    public static final Object LIZIZ(C1707390uX3 c1707390uX3, String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        String str3 = c1707390uX3.LJIIIIZZ;
        if (str3 != null && (!a0.LJJJIL(str3)) && str3 != null) {
            Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1706850uWB(str3, c1707390uX3, str, str2, null));
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
