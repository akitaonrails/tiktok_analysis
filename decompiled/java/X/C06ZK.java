package X;

import android.content.Context;

/* JADX INFO: renamed from: X.06ZK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ZK {
    public static boolean LIZ(Context context) {
        int iLIZ = C497820Jfg.LIZ(context) + C497820Jfg.LIZJ(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("screen height is ");
        sbLIZ.append(iLIZ);
        C1022620cia.LIZ("VCComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (C497820Jfg.LIZIZ(context) >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360)) && iLIZ > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(765))) {
            return false;
        }
        return true;
    }
}
