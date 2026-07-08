package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06pZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1727106pZ {
    public static final Keva LIZ = Keva.getRepo("creation_ai_chat_quota");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1368));

    public static long LIZ() {
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_quota_last_date");
        sbLIZ.append(LIZIZ());
        return keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    public static String LIZIZ() {
        return (String) LIZIZ.getValue();
    }
}
