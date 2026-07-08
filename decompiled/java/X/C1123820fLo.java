package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0fLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123820fLo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        if (context == null) {
            C20441214yg.LJ(str, "context == null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("context != null,class:");
        sbLIZ.append(context.getClass());
        C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }
}
