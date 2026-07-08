package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.01Qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C332101Qp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        return Keva.getRepo("cke_main_action_store_repo").getBoolean(str, false);
    }

    public static void LIZIZ(String str, boolean z) {
        Keva.getRepo("cke_main_action_store_repo").storeBoolean(str, z);
    }
}
