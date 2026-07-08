package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361160lWc {
    public static boolean LIZ;
    public static boolean LIZIZ = true;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(500));

    public static boolean LIZ() {
        return LIZIZ().getBoolean("danmaku_allow_show", !LIZ);
    }

    public static Keva LIZIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static boolean LIZJ() {
        return LIZIZ().getBoolean("has_show_education_danmaku", false);
    }
}
