package X;

import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07RH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07RH {
    public static final ArrayList<String> LIZ = new ArrayList<>();
    public static final C01GW LIZIZ;

    static {
        C1697810uHb.LJ("search_icon");
        C1697810uHb.LJ("search_box");
        C1697810uHb.LJ("search_start");
        C1697810uHb.LJ("all");
        LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(865));
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C01GW c01gw = LIZIZ;
        if (!((ArrayList) c01gw.getValue()).contains(str) && !((ArrayList) c01gw.getValue()).contains("all")) {
            return false;
        }
        return C07RI.LIZ();
    }
}
