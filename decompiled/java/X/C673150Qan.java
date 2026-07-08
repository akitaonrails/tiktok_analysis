package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Qan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673150Qan {
    public static final void LIZ(Object obj, Object obj2, Class<?> cls) {
        boolean zLJJJJ = C13LP.LJJJJ(cls, (ArrayList) C1562540qlQ.LIZIZ.getValue());
        if (C725080ScM.LIZLLL || zLJJJJ) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BindAbility into ");
                    sbLIZ.append(obj);
                    sbLIZ.append(", ability object: ");
                    sbLIZ.append(obj2);
                    sbLIZ.append(", type: ");
                    sbLIZ.append(cls);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("Communication", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (zLJJJJ) {
                System.out.println((Object) ("BindAbility into " + obj + ", ability object: " + obj2 + ", type: " + cls));
            }
        }
    }

    public static final void LIZIZ(Object obj, Object obj2, Class<?> cls) {
        boolean zLJJJJ = C13LP.LJJJJ(cls, (ArrayList) C1562540qlQ.LIZIZ.getValue());
        if (C725080ScM.LIZLLL || zLJJJJ) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ClearAbility into ");
                    sbLIZ.append(obj);
                    sbLIZ.append(", ability object: ");
                    sbLIZ.append(obj2);
                    sbLIZ.append(", type: ");
                    sbLIZ.append(cls);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("Communication", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (zLJJJJ) {
                System.out.println((Object) ("ClearAbility into " + obj + ", ability object: " + obj2 + ", type: " + cls));
            }
        }
    }
}
