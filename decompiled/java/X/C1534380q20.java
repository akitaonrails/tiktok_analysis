package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1534380q20 {
    public final String LIZ;
    public boolean LIZIZ = C19994513Lb.LIZIZ(System.currentTimeMillis()).nextBoolean();

    public C1534380q20(String str) {
        this.LIZ = str;
    }

    public final void LIZ(Function0<C1534750q2b> function0) {
        if (!this.LIZIZ) {
            C1535890q4R.LIZ.getClass();
            if (!C1535890q4R.LIZIZ) {
                return;
            }
        }
        C1534750q2b c1534750q2bInvoke = function0.invoke();
        String str = c1534750q2bInvoke.LIZ;
        String str2 = c1534750q2bInvoke.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ProcessEnd:");
        sbLIZ.append(str2);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZJ(Function0<C1534750q2b> function0) {
        if (!this.LIZIZ) {
            C1535890q4R.LIZ.getClass();
            if (!C1535890q4R.LIZIZ) {
                return;
            }
        }
        C1534750q2b c1534750q2bInvoke = function0.invoke();
        String str = c1534750q2bInvoke.LIZ;
        String str2 = c1534750q2bInvoke.LIZJ;
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msg = ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZLLL(Function0<C1534750q2b> function0) {
        if (!this.LIZIZ) {
            C1535890q4R.LIZ.getClass();
            if (!C1535890q4R.LIZIZ) {
                return;
            }
        }
        C1534750q2b c1534750q2bInvoke = function0.invoke();
        String str = c1534750q2bInvoke.LIZ;
        String str2 = c1534750q2bInvoke.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ProcessStart:");
        sbLIZ.append(str2);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FatalError:");
        sbLIZ.append(str2);
        sbLIZ.append("] ");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
