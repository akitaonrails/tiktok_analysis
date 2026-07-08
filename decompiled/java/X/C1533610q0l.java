package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;

/* JADX INFO: renamed from: X.0q0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533610q0l {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static GeckoConfig LIZ(C1533580q0i c1533580q0i, String str) {
        GeckoConfig geckoConfig = c1533580q0i.LJII.get(str);
        if (geckoConfig == null) {
            return c1533580q0i.LJI;
        }
        return geckoConfig;
    }
}
