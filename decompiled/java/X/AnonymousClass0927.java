package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCPushResult;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0927, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0927 {
    public static final AnonymousClass0927 LIZ = new AnonymousClass0927();
    public static final C1227904rF LIZIZ = C1227904rF.LIZ;
    public static final Type LIZJ = new TypeToken<List<? extends AIGCPushResult>>() { // from class: X.0928
    }.getType();
    public static final Pattern LIZLLL = PatternProtector.compile("(?<!\\\\)\\\\(?![\"\\\\bfnrt/]|u[0-9a-fA-F]{4})");

    public static String LIZ(String str) throws UnsupportedEncodingException {
        if (a0.LJJJIL(str)) {
            return null;
        }
        String strReplace = new Regex("\\s").replace(str, "");
        if (a0.LJJIIZI(strReplace, "%", false)) {
            strReplace = URLDecoder.decode(strReplace, StandardCharsets.UTF_8.name());
        }
        String strReplace2 = new Regex("=+$").replace(new Regex("[^A-Za-z0-9+/=]").replace(u.LJJIFFI(u.LJJIFFI(strReplace, "-", "+", false), "_", "/", false), ""), "");
        int length = (4 - (strReplace2.length() % 4)) % 4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strReplace2);
        sbLIZ.append(u.LJJ(length, "="));
        return LIZLLL.matcher(new String(Base64.decode(C2188811AlT.LIZIZ(sbLIZ), 0), StandardCharsets.UTF_8)).replaceAll("\\\\\\\\");
    }

    public static List LIZIZ(String str) {
        Object c098200Yq;
        Object obj = null;
        if (str == null) {
            return null;
        }
        C470601sO c470601sO = C470601sO.LIZ;
        try {
            LIZ.getClass();
            String strLIZ = LIZ(str);
            if (strLIZ == null) {
                c098200Yq = null;
            } else {
                C1227904rF c1227904rF = LIZIZ;
                Type type = LIZJ;
                c1227904rF.getClass();
                c098200Yq = (List) C1227904rF.LIZJ(strLIZ, type);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof CancellationException)) {
                c470601sO.getClass();
                C470601sO.LIZ(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                throw th;
            }
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String simpleName = AnonymousClass0927.class.getSimpleName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
            sbLIZ.append(": ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            AnonymousClass0925.LIZIZ(simpleName, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (List) obj;
    }
}
