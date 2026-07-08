package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20131513pp {
    public static final Pattern LJIIL = PatternProtector.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LJFF;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJJI;
    public final List<String> LIZLLL = new ArrayList();
    public final Map<String, C20131613pq> LJ = new LinkedHashMap();
    public final C01GW LJI = C452501pT.LIZIZ(new AwS574S0100000_30((C20131513pp) this, 313));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS574S0100000_30((C20131513pp) this, 312));

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20131513pp)) {
            return false;
        }
        C20131513pp c20131513pp = (C20131513pp) obj;
        if (!Intrinsics.LJFF(this.LIZ, c20131513pp.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c20131513pp.LIZIZ) || !Intrinsics.LJFF(this.LIZJ, c20131513pp.LIZJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.13pp] */
    public C20131513pp(String str, String str2, String str3) {
        boolean z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        if (str != null) {
            Uri uri = UriProtector.parse(str);
            boolean z2 = true;
            if (uri.getQuery() != null) {
                z = true;
            } else {
                z = false;
            }
            this.LJII = z;
            StringBuilder sb = new StringBuilder("^");
            if (!LJIIL.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = PatternProtector.compile("\\{(.+?)\\}");
            if (z) {
                Matcher matcher = PatternProtector.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    this.LJIIJJI = LIZ(str.substring(0, matcher.start()), sb, patternCompile);
                }
                for (String str4 : UriProtector.getQueryParameterNames(uri)) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = UriProtector.getQueryParameter(uri, str4);
                    if (queryParameter == null) {
                        this.LJIIIIZZ = z2;
                        queryParameter = str4;
                    }
                    ?? Matcher = patternCompile.matcher(queryParameter);
                    C20131613pq c20131613pq = new C20131613pq();
                    int iEnd = 0;
                    ?? r13 = z2;
                    while (Matcher.find()) {
                        String strGroup = Matcher.group(r13);
                        if (strGroup != null) {
                            ((ArrayList) c20131613pq.LIZIZ).add(strGroup);
                            sb2.append(Pattern.quote(queryParameter.substring(iEnd, Matcher.start())));
                            sb2.append("(.+?)?");
                            iEnd = Matcher.end();
                            r13 = 1;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    c20131613pq.LIZ = u.LJJIFFI(sb2.toString(), ".*", "\\E.*\\Q", false);
                    this.LJ.put(str4, c20131613pq);
                    z2 = true;
                }
            } else {
                this.LJIIJJI = LIZ(str, sb, patternCompile);
            }
            this.LJFF = u.LJJIFFI(sb.toString(), ".*", "\\E.*\\Q", false);
        }
        if (this.LIZJ != null) {
            if (PatternProtector.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.LIZJ).matches()) {
                C0CND c0cnd = new C0CND(this.LIZJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("^(");
                sbLIZ.append(c0cnd.LL);
                sbLIZ.append("|[*]+)/(");
                sbLIZ.append(c0cnd.LLILLJJLI);
                sbLIZ.append("|[*]+)$");
                this.LJIIIZ = u.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ), "*|[*]", "[\\s\\S]", false);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("The given mimeType ");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append(" does not match to required \"type/subtype\" format");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
    }

    public final boolean LIZ(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !a0.LJJIIZI(str, ".*", false);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                ((ArrayList) this.LIZLLL).add(strGroup);
                sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
                sb.append("([^/]+?)");
                iEnd = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }
}
