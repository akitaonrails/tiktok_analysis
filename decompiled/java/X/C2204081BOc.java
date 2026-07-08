package X;

import android.net.Uri;
import com.bytedance.pia.core.setting.Config;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204081BOc {
    public static final C2204081BOc LIZ = new C2204081BOc();
    public static final Config LIZIZ = new Config(null, null, null, false, 15, null);
    public static Pair<String, Config> LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.net.Uri r15) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2204081BOc.LIZ(android.net.Uri):java.lang.String");
    }

    public final synchronized Config LIZIZ(Uri uri) {
        Config config;
        if (uri == null) {
            return null;
        }
        String strLIZ = LIZ(uri);
        if (strLIZ == null || strLIZ.length() == 0) {
            return null;
        }
        Pair<String, Config> pair = LIZJ;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), strLIZ)) {
            return pair.getSecond();
        }
        InterfaceC1549120qPm interfaceC1549120qPm = C1542560qFC.LIZJ;
        if (interfaceC1549120qPm == null || (config = (Config) interfaceC1549120qPm.LIZ(strLIZ, Config.class, LIZIZ)) == null || Intrinsics.LJFF(config, LIZIZ)) {
            return null;
        }
        if (config.LIZIZ().isEmpty()) {
            return null;
        }
        LIZJ = new Pair<>(strLIZ, config);
        return config;
    }
}
