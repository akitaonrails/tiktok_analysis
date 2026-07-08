package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* JADX INFO: renamed from: X.1DcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259501DcC {
    public static C2259371Dbz LIZ(C2259441Dc6 c2259441Dc6) {
        C2259371Dbz c2259371DbzLIZIZ = AbstractC2259421Dc4.LIZIZ(AbstractC2259421Dc4.LJII(c2259441Dc6, "markup"), "markdown", new InterfaceC2259411Dc3[0]);
        C2259341Dbw c2259341DbwLJIIIIZZ = C2259441Dc6.LJIIIIZZ("bold", C2259441Dc6.LJI(PatternProtector.compile("(^|[^\\\\])(\\*\\*|__)(?:(?:\\r?\\n|\\r)(?!\\r?\\n|\\r)|.)+?\\2"), true, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("^\\*\\*|^__|\\*\\*$|__$"))))));
        C2259341Dbw c2259341DbwLJIIIIZZ2 = C2259441Dc6.LJIIIIZZ("italic", C2259441Dc6.LJI(PatternProtector.compile("(^|[^\\\\])([*_])(?:(?:\\r?\\n|\\r)(?!\\r?\\n|\\r)|.)+?\\2"), true, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("^[*_]|[*_]$"))))));
        C2259341Dbw c2259341DbwLJIIIIZZ3 = C2259441Dc6.LJIIIIZZ("url", C2259441Dc6.LJI(PatternProtector.compile("!?\\[[^\\]]+\\](?:\\([^\\s)]+(?:[\\t ]+\"(?:\\\\.|[^\"\\\\])*\")?\\)| ?\\[[^\\]\\n]*\\])"), false, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("variable", C2259441Dc6.LJII(PatternProtector.compile("(!?\\[)[^\\]]+(?=\\]$)"))), C2259441Dc6.LJIIIIZZ("string", C2259441Dc6.LIZLLL(PatternProtector.compile("\"(?:\\\\.|[^\"\\\\])*\"(?=\\)$)"))))));
        AbstractC2259421Dc4.LJFF(c2259371DbzLIZIZ, "prolog", C2259441Dc6.LJIIIIZZ("blockquote", C2259441Dc6.LIZLLL(PatternProtector.compile("^>(?:[\\t ]*>)*", 8))), C2259441Dc6.LJIIIIZZ("code", C2259441Dc6.LJFF(PatternProtector.compile("^(?: {4}|\\t).+", 8), false, false, "keyword"), C2259441Dc6.LJFF(PatternProtector.compile("``.+?``|`[^`\\n]+`"), false, false, "keyword")), C2259441Dc6.LJIIIIZZ("title", C2259441Dc6.LJI(PatternProtector.compile("\\w+.*(?:\\r?\\n|\\r)(?:==+|--+)"), false, false, "important", C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("==+$|--+$"))))), C2259441Dc6.LJI(PatternProtector.compile("(^\\s*)#+.+", 8), true, false, "important", C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("^#+|#+$")))))), C2259441Dc6.LJIIIIZZ("hr", C2259441Dc6.LJFF(PatternProtector.compile("(^\\s*)([*-])(?:[\\t ]*\\2){2,}(?=\\s*$)", 8), true, false, "punctuation")), C2259441Dc6.LJIIIIZZ("list", C2259441Dc6.LJFF(PatternProtector.compile("(^\\s*)(?:[*+-]|\\d+\\.)(?=[\\t ].)", 8), true, false, "punctuation")), C2259441Dc6.LJIIIIZZ("url-reference", C2259441Dc6.LJI(PatternProtector.compile("!?\\[[^\\]]+\\]:[\\t ]+(?:\\S+|<(?:\\\\.|[^>\\\\])+>)(?:[\\t ]+(?:\"(?:\\\\.|[^\"\\\\])*\"|'(?:\\\\.|[^'\\\\])*'|\\((?:\\\\.|[^)\\\\])*\\)))?"), false, false, "url", C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("variable", C2259441Dc6.LJII(PatternProtector.compile("^(!?\\[)[^\\]]+"))), C2259441Dc6.LJIIIIZZ("string", C2259441Dc6.LIZLLL(PatternProtector.compile("(?:\"(?:\\\\.|[^\"\\\\])*\"|'(?:\\\\.|[^'\\\\])*'|\\((?:\\\\.|[^)\\\\])*\\))$"))), C2259441Dc6.LJIIIIZZ("punctuation", C2259441Dc6.LIZLLL(PatternProtector.compile("^[\\[\\]!:]|[<>]")))))), c2259341DbwLJIIIIZZ, c2259341DbwLJIIIIZZ2, c2259341DbwLJIIIIZZ3);
        InterfaceC2259401Dc2 interfaceC2259401Dc2LIZJ = AbstractC2259421Dc4.LIZJ(c2259341DbwLJIIIIZZ);
        if (interfaceC2259401Dc2LIZJ != null) {
            interfaceC2259401Dc2LIZJ.LIZ().add(c2259341DbwLJIIIIZZ3);
            interfaceC2259401Dc2LIZJ.LIZ().add(c2259341DbwLJIIIIZZ2);
        }
        InterfaceC2259401Dc2 interfaceC2259401Dc2LIZJ2 = AbstractC2259421Dc4.LIZJ(c2259341DbwLJIIIIZZ2);
        if (interfaceC2259401Dc2LIZJ2 != null) {
            interfaceC2259401Dc2LIZJ2.LIZ().add(c2259341DbwLJIIIIZZ3);
            interfaceC2259401Dc2LIZJ2.LIZ().add(c2259341DbwLJIIIIZZ);
        }
        return c2259371DbzLIZIZ;
    }
}
