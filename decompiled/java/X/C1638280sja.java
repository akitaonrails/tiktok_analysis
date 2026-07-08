package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0sja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638280sja {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1638280sja.class, "hook", "getHook()Lcom/ss/android/ugc/tools/view/widget/CukaieToast$ToastHook;", 0);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public static C21366318jV LIZ(int i, int i2, Context context) {
        String string;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        return new C21366318jV(context, string, i2, 2);
    }

    public static C21366318jV LIZJ(int i, int i2, Context context) {
        String string;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        return new C21366318jV(context, string, i2, 3);
    }

    public static C21366318jV LIZLLL(C1638280sja c1638280sja, Context context, String str) {
        c1638280sja.getClass();
        return new C21366318jV(context, str, 0, 3);
    }
}
