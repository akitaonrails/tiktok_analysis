package X;

import java.io.File;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0psy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528780psy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(153));

    public static File LIZ(String str, String str2) {
        File fileLJIL = C08QA.LJIL((File) LIZ.getValue(), str);
        if (!fileLJIL.exists()) {
            fileLJIL.mkdirs();
        }
        File fileLJIL2 = C08QA.LJIL(fileLJIL, str2);
        if (!fileLJIL2.exists()) {
            fileLJIL2.mkdirs();
        }
        return fileLJIL2;
    }
}
