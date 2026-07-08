package X;

import android.util.Log;

/* JADX INFO: renamed from: X.09E7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09E7 implements C09E4 {
    public static final C09E7 LIZ = new C09E7();

    @Override // X.C09E4
    public final void LIZ(Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeModelLog : ");
        sbLIZ.append(Log.getStackTraceString(exc));
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
