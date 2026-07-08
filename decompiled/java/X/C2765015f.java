package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.015f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2765015f {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(final String str, final Function0<String> function0) {
        if ((((Number) C2766015g.LIZ.getValue()).intValue() & 4) != 0) {
            if (((Boolean) C1E7D.LJ.getValue()).booleanValue() && !C1E7D.LIZ) {
                return;
            }
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.00sp
                public final void LIZ() {
                    String message;
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("p_e:");
                    sbLIZ.append(str);
                    sbLIZ.append(": ");
                    Function0<String> function02 = function0;
                    if (function02 != null) {
                        try {
                            message = function02.invoke();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            message = e.getMessage();
                        }
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C1720106oR.LJI("FCP_Component", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedComponentALog@504a.end$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedComponentALog@504a.end$1");
                }
            });
        }
    }

    public static final void LIZIZ(String str, String str2) {
        if (!C2770015k.LIZ()) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(str2);
        C1720106oR.LJI("FCP_Component", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ(String str, Function0<String> function0) {
        if ((((Number) C2766015g.LIZ.getValue()).intValue() & 2) != 0) {
            if (((Boolean) C1E7D.LJ.getValue()).booleanValue() && !C1E7D.LIZ) {
                return;
            }
            C20684815ws.LJFF().execute(new RunnableC514901zX(function0, str, 0));
        }
    }
}
