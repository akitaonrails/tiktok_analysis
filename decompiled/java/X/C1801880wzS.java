package X;

import android.content.Context;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0wzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801880wzS {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, String str) {
        C01GW c01gw = C1801890wzT.LIZ;
        Keva keva = (Keva) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Toggle_");
        sbLIZ.append(str);
        boolean z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        C1836500xtI.LIZ.getClass();
        if (C1836500xtI.LIZ(context) == EnumC1801900wzU.AVAILABLE) {
            if (!z) {
                return false;
            }
            return true;
        }
        if (!z) {
            return false;
        }
        Keva keva2 = (Keva) c01gw.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Toggle_");
        sbLIZ2.append(str);
        keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
        return false;
    }
}
