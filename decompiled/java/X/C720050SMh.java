package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720050SMh {
    public final Map<String, C0SNN> LIZ;
    public final C01GW LIZIZ;

    public C720050SMh() {
        this.LIZ = C0SKM.LIZIZ() ? new ConcurrentHashMap<>() : new LinkedHashMap<>();
        this.LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(329));
    }

    public static String LIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
