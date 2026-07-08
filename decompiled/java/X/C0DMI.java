package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.UUID;

/* JADX INFO: renamed from: X.0DMI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMI {
    public static final String LIZ() {
        return UUID.randomUUID().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CreativeInfo LIZIZ(String str) {
        String strLIZ = str;
        if (strLIZ == null || strLIZ.length() == 0) {
            strLIZ = LIZ();
        }
        return new CreativeInfo(strLIZ, 0, null, 6, 0 == true ? 1 : 0);
    }
}
