package X;

import com.bytedance.mt.protector.impl.PatternProtector;

/* JADX INFO: renamed from: X.1DcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259521DcE {
    public static C2259371Dbz LIZ(C2259441Dc6 c2259441Dc6) {
        C2259371Dbz c2259371DbzLIZ = AbstractC2259421Dc4.LIZ(AbstractC2259421Dc4.LJII(c2259441Dc6, "java"), "scala", new InterfaceC2259431Dc5() { // from class: X.1DcM
            @Override // X.InterfaceC2259431Dc5
            public final boolean LIZ(InterfaceC2259411Dc3 interfaceC2259411Dc3) {
                String strName = interfaceC2259411Dc3.name();
                if (!"class-name".equals(strName) && !"function".equals(strName)) {
                    return true;
                }
                return false;
            }
        }, C2259441Dc6.LJIIIIZZ("keyword", C2259441Dc6.LIZLLL(PatternProtector.compile("<-|=>|\\b(?:abstract|case|catch|class|def|do|else|extends|final|finally|for|forSome|if|implicit|import|lazy|match|new|null|object|override|package|private|protected|return|sealed|self|super|this|throw|trait|try|type|val|var|while|with|yield)\\b"))), C2259441Dc6.LJIIIIZZ("string", C2259441Dc6.LJ(PatternProtector.compile("\"\"\"[\\s\\S]*?\"\"\""), false), C2259441Dc6.LJ(PatternProtector.compile("(\"|')(?:\\\\.|(?!\\1)[^\\\\\\r\\n])*\\1"), false)), C2259441Dc6.LJIIIIZZ("number", C2259441Dc6.LIZLLL(PatternProtector.compile("\\b0x[\\da-f]*\\.?[\\da-f]+|(?:\\b\\d+\\.?\\d*|\\B\\.\\d+)(?:e\\d+)?[dfl]?", 2))));
        c2259371DbzLIZ.LIZIZ.add(C2259441Dc6.LJIIIIZZ("symbol", C2259441Dc6.LIZLLL(PatternProtector.compile("'[^\\d\\s\\\\]\\w*"))));
        AbstractC2259421Dc4.LJFF(c2259371DbzLIZ, "number", C2259441Dc6.LJIIIIZZ("builtin", C2259441Dc6.LIZLLL(PatternProtector.compile("\\b(?:String|Int|Long|Short|Byte|Boolean|Double|Float|Char|Any|AnyRef|AnyVal|Unit|Nothing)\\b"))));
        return c2259371DbzLIZ;
    }
}
