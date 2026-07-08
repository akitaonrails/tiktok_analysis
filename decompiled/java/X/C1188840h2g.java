package X;

import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import java.util.Collections;

/* JADX INFO: renamed from: X.0h2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188840h2g {
    public static volatile boolean LIZ;

    public static void LIZ() {
        if (((Number) C04V7.LIZ.getValue()).intValue() != 1 || LIZ) {
            return;
        }
        LIZ = true;
        C1490190osj c1490190osj = C1490190osj.LIZIZ;
        EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_POI_DETAIL;
        String value = enumC2262571Dh9.getValue();
        C08CX c08cx = C08CX.INSTANCE;
        c1490190osj.LIZIZ(enumC2262571Dh9, new DispatchConfig(value, 0, c08cx, c08cx, null, 0, 0, Collections.singleton("/tiktok/poi/slash/v1"), null, c08cx, C2097608Jq.LJ(), c08cx, null, 4466, null));
        c1490190osj.LIZ(enumC2262571Dh9);
    }
}
