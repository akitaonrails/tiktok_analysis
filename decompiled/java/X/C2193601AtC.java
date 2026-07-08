package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.1AtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193601AtC {
    public static final C2193571At9 LIZ;
    public static final C2193571At9 LIZIZ;
    public static final C2193571At9 LIZJ;
    public static final Map<String, C2193571At9> LIZLLL;

    static {
        C2193571At9 c2193571At9AuthEx = C2193571At9.authEx(LSPassThroughRecordSizeConfig.DEFAULT, "invalid_request");
        C2193571At9 c2193571At9AuthEx2 = C2193571At9.authEx(1001, "unauthorized_client");
        C2193571At9 c2193571At9AuthEx3 = C2193571At9.authEx(1002, "access_denied");
        LIZ = c2193571At9AuthEx3;
        C2193571At9 c2193571At9AuthEx4 = C2193571At9.authEx(1003, "unsupported_response_type");
        C2193571At9 c2193571At9AuthEx5 = C2193571At9.authEx(1004, "invalid_scope");
        C2193571At9 c2193571At9AuthEx6 = C2193571At9.authEx(1005, "server_error");
        C2193571At9 c2193571At9AuthEx7 = C2193571At9.authEx(1006, "temporarily_unavailable");
        C2193571At9 c2193571At9AuthEx8 = C2193571At9.authEx(1007, null);
        C2193571At9 c2193571At9AuthEx9 = C2193571At9.authEx(1008, null);
        LIZIZ = c2193571At9AuthEx9;
        LIZJ = C2193571At9.generalEx(9, "Response state param did not match request state");
        LIZLLL = C2193571At9.exceptionMapByString(c2193571At9AuthEx, c2193571At9AuthEx2, c2193571At9AuthEx3, c2193571At9AuthEx4, c2193571At9AuthEx5, c2193571At9AuthEx6, c2193571At9AuthEx7, c2193571At9AuthEx8, c2193571At9AuthEx9);
    }
}
