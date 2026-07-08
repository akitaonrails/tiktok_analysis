package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12Q8 {
    public abstract void LIZ();

    public abstract void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3);

    public final void LIZIZ(Function0<Unit> function0) {
        LIZ();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public void LIZJ(String str, String str2, C12QB c12qb, C12QB c12qb2, String str3, Function0<Unit> function0) {
        LIZLLL(c12qb, c12qb2, str, str2, str3);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
