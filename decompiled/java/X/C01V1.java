package X;

import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01V1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01V1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Function0 function0) {
        if (((Boolean) C0BDE.LIZJ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C1324505Gh.LIZIZ, null, null, new C343501Uz(function0, null), 3);
        } else {
            ((ExecutorService) C1516330pYt.LIZJ.getValue()).execute(new RunnableC514801zW(function0, (Function0<Unit>) 145));
        }
    }

    public static void LIZIZ(Function0 function0) {
        if (((Boolean) C0BDE.LIZIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C1324505Gh.LIZ, null, null, new C01V0(function0, null), 3);
        } else {
            ((ExecutorService) C1516330pYt.LIZIZ.getValue()).execute(new RunnableC514801zW(function0, (Function0<Unit>) 146));
        }
    }

    public static void LIZJ(Function0 function0) {
        if (((Boolean) C0BDE.LIZIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C1324505Gh.LIZ, null, null, new C343401Uy(function0, null), 3);
        } else {
            function0.invoke();
        }
    }
}
