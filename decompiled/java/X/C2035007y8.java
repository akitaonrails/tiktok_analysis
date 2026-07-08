package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ugc.android.clientai.lang.request.ChatCompletionRequest;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07y8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2035007y8 extends RuntimeException {
    public static final C2035107y9 Companion = new Object() { // from class: X.07y9
        public static C2035007y8 LIZ(C2035107y9 c2035107y9, String str, long j, long j2) {
            c2035107y9.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" (waited ");
            sbLIZ.append(j);
            sbLIZ.append("ms, timeout: ");
            sbLIZ.append(j2);
            sbLIZ.append("ms)");
            return new C2035007y8(C2188811AlT.LIZIZ(sbLIZ), null, C2097608Jq.LJIIIIZZ(new Pair("type", "engine_busy"), new Pair("wait_time_ms", String.valueOf(j)), new Pair("timeout_ms", String.valueOf(j2))));
        }

        public static C2035007y8 LIZIZ(C2035107y9 c2035107y9, EnumC037200Be enumC037200Be, long j, ChatCompletionRequest chatCompletionRequest, String str, Throwable th, int i) {
            String strName;
            String str2;
            if ((i & 1) != 0) {
                enumC037200Be = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            if ((i & 4) != 0) {
                chatCompletionRequest = null;
            }
            String str3 = "";
            if ((i & 8) != 0) {
                str = "";
            }
            if ((i & 16) != 0) {
                th = null;
            }
            c2035107y9.getClass();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("type", "forward");
            if (enumC037200Be == null || (strName = enumC037200Be.name()) == null) {
                strName = "";
            }
            pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, strName);
            pairArr[2] = new Pair("duration", String.valueOf(j));
            if (chatCompletionRequest != null && (str2 = chatCompletionRequest.model) != null) {
                str3 = str2;
            }
            pairArr[3] = new Pair("request_model", str3);
            return new C2035007y8(str, th, C2097608Jq.LJIIIIZZ(pairArr));
        }

        public static C2035007y8 LIZJ(C2035107y9 c2035107y9, String str, EnumC037200Be enumC037200Be, long j, String str2, Throwable th, int i) {
            String strName;
            if ((i & 2) != 0) {
                enumC037200Be = null;
            }
            if ((i & 4) != 0) {
                j = -1;
            }
            String str3 = "";
            if ((i & 8) != 0) {
                str2 = "";
            }
            if ((i & 16) != 0) {
                th = null;
            }
            c2035107y9.getClass();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("type", "model");
            pairArr[1] = new Pair("model_name", str);
            if (enumC037200Be != null && (strName = enumC037200Be.name()) != null) {
                str3 = strName;
            }
            pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
            pairArr[3] = new Pair("duration", String.valueOf(j));
            return new C2035007y8(str2, th, C2097608Jq.LJIIIIZZ(pairArr));
        }
    };
    public final Map<String, String> LL;

    public C2035007y8() {
        this("", null, C2097608Jq.LJ());
    }

    public final Map<String, String> getData() {
        return this.LL;
    }

    public C2035007y8(String str, Throwable th, Map<String, String> map) {
        super(str, th);
        this.LL = map;
    }
}
