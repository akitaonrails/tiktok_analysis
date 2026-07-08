package X;

import java.util.Map;

/* JADX INFO: renamed from: X.1AtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193611AtD {
    public static final C2193571At9 LIZ;
    public static final Map<String, C2193571At9> LIZIZ;

    static {
        C2193571At9 c2193571At9 = C2193571At9.tokenEx(2000, "invalid_request");
        C2193571At9 c2193571At92 = C2193571At9.tokenEx(2001, "invalid_client");
        C2193571At9 c2193571At93 = C2193571At9.tokenEx(2002, "invalid_grant");
        C2193571At9 c2193571At94 = C2193571At9.tokenEx(2003, "unauthorized_client");
        C2193571At9 c2193571At95 = C2193571At9.tokenEx(2004, "unsupported_grant_type");
        C2193571At9 c2193571At96 = C2193571At9.tokenEx(2005, "invalid_scope");
        C2193571At9 c2193571At97 = C2193571At9.tokenEx(2006, null);
        C2193571At9 c2193571At98 = C2193571At9.tokenEx(2007, null);
        LIZ = c2193571At98;
        LIZIZ = C2193571At9.exceptionMapByString(c2193571At9, c2193571At92, c2193571At93, c2193571At94, c2193571At95, c2193571At96, c2193571At97, c2193571At98);
    }
}
