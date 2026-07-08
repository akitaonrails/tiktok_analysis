package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1Dc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259471Dc9 {
    public static C2259371Dbz LIZ(C2259441Dc6 c2259441Dc6) {
        C2259371Dbz c2259371DbzLIZ = AbstractC2259421Dc4.LIZ(AbstractC2259421Dc4.LJII(c2259441Dc6, "clike"), "kotlin", new InterfaceC2259431Dc5() { // from class: X.1DcO
            @Override // X.InterfaceC2259431Dc5
            public final boolean LIZ(InterfaceC2259411Dc3 interfaceC2259411Dc3) {
                return !"class-name".equals(interfaceC2259411Dc3.name());
            }
        }, C2259441Dc6.LJIIIIZZ("keyword", C2259441Dc6.LJII(PatternProtector.compile("(^|[^.])\\b(?:abstract|actual|annotation|as|break|by|catch|class|companion|const|constructor|continue|crossinline|data|do|dynamic|else|enum|expect|external|final|finally|for|fun|get|if|import|in|infix|init|inline|inner|interface|internal|is|lateinit|noinline|null|object|open|operator|out|override|package|private|protected|public|reified|return|sealed|set|super|suspend|tailrec|this|throw|to|try|typealias|val|var|vararg|when|where|while)\\b"))), C2259441Dc6.LJIIIIZZ("function", C2259441Dc6.LIZLLL(PatternProtector.compile("\\w+(?=\\s*\\()")), C2259441Dc6.LJII(PatternProtector.compile("(\\.)\\w+(?=\\s*\\{)"))), C2259441Dc6.LJIIIIZZ("number", C2259441Dc6.LIZLLL(PatternProtector.compile("\\b(?:0[xX][\\da-fA-F]+(?:_[\\da-fA-F]+)*|0[bB][01]+(?:_[01]+)*|\\d+(?:_\\d+)*(?:\\.\\d+(?:_\\d+)*)?(?:[eE][+-]?\\d+(?:_\\d+)*)?[fFL]?)\\b"))), C2259441Dc6.LJIIIIZZ("operator", C2259441Dc6.LIZLLL(PatternProtector.compile("\\+[+=]?|-[-=>]?|==?=?|!(?:!|==?)?|[\\/*%<>]=?|[?:]:?|\\.\\.|&&|\\|\\||\\b(?:and|inv|or|shl|shr|ushr|xor)\\b"))));
        AbstractC2259421Dc4.LJFF(c2259371DbzLIZ, "string", C2259441Dc6.LJIIIIZZ("raw-string", C2259441Dc6.LJFF(PatternProtector.compile("(\"\"\"|''')[\\s\\S]*?\\1"), false, false, "string")));
        AbstractC2259421Dc4.LJFF(c2259371DbzLIZ, "keyword", C2259441Dc6.LJIIIIZZ("annotation", C2259441Dc6.LJFF(PatternProtector.compile("\\B@(?:\\w+:)?(?:[A-Z]\\w*|\\[[^\\]]+\\])"), false, false, "builtin")));
        AbstractC2259421Dc4.LJFF(c2259371DbzLIZ, "function", C2259441Dc6.LJIIIIZZ("label", C2259441Dc6.LJFF(PatternProtector.compile("\\w+@|@\\w+"), false, false, "symbol")));
        ArrayList arrayList = new ArrayList(c2259371DbzLIZ.LIZIZ.size() + 1);
        arrayList.add(C2259441Dc6.LJIIIIZZ("delimiter", C2259441Dc6.LJFF(PatternProtector.compile("^\\$\\{|\\}$"), false, false, "variable")));
        arrayList.addAll(c2259371DbzLIZ.LIZIZ);
        C2259371Dbz c2259371DbzLIZ2 = C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("interpolation", C2259441Dc6.LJI(PatternProtector.compile("\\$\\{[^}]+\\}"), false, false, null, new C2259371Dbz("inside", arrayList)), C2259441Dc6.LJFF(PatternProtector.compile("\\$\\w+"), false, false, "variable")));
        InterfaceC2259411Dc3 interfaceC2259411Dc3LIZLLL = AbstractC2259421Dc4.LIZLLL(c2259371DbzLIZ, "string");
        InterfaceC2259411Dc3 interfaceC2259411Dc3LIZLLL2 = AbstractC2259421Dc4.LIZLLL(c2259371DbzLIZ, "raw-string");
        if (interfaceC2259411Dc3LIZLLL != null && interfaceC2259411Dc3LIZLLL2 != null) {
            InterfaceC2259391Dc1 interfaceC2259391Dc1 = (InterfaceC2259391Dc1) ListProtector.get(interfaceC2259411Dc3LIZLLL.LIZ(), 0);
            InterfaceC2259391Dc1 interfaceC2259391Dc12 = (InterfaceC2259391Dc1) ListProtector.get(interfaceC2259411Dc3LIZLLL2.LIZ(), 0);
            interfaceC2259411Dc3LIZLLL.LIZ().add(C2259441Dc6.LJI(interfaceC2259391Dc1.LIZLLL(), interfaceC2259391Dc1.LJ(), interfaceC2259391Dc1.LIZJ(), interfaceC2259391Dc1.LIZIZ(), c2259371DbzLIZ2));
            interfaceC2259411Dc3LIZLLL2.LIZ().add(C2259441Dc6.LJI(interfaceC2259391Dc12.LIZLLL(), interfaceC2259391Dc12.LJ(), interfaceC2259391Dc12.LIZJ(), interfaceC2259391Dc12.LIZIZ(), c2259371DbzLIZ2));
            ListProtector.remove(interfaceC2259411Dc3LIZLLL.LIZ(), 0);
            ListProtector.remove(interfaceC2259411Dc3LIZLLL2.LIZ(), 0);
            return c2259371DbzLIZ;
        }
        throw new RuntimeException("Unexpected state, cannot find `string` and/or `raw-string` tokens inside kotlin grammar");
    }
}
