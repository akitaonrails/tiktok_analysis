package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.List;

/* JADX INFO: renamed from: X.1DcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259491DcB {
    public static C2259371Dbz LIZ(C2259441Dc6 c2259441Dc6) {
        InterfaceC2259401Dc2 interfaceC2259401Dc2LIZJ;
        C2259371Dbz c2259371DbzLIZIZ = AbstractC2259421Dc4.LIZIZ(AbstractC2259421Dc4.LJII(c2259441Dc6, "clike"), "swift", C2259441Dc6.LJIIIIZZ("string", C2259441Dc6.LJI(PatternProtector.compile("(\"|')(\\\\(?:\\((?:[^()]|\\([^)]+\\))+\\)|\\r\\n|[\\s\\S])|(?!\\1)[^\\\\\\r\\n])*\\1"), false, true, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("interpolation", C2259441Dc6.LJI(PatternProtector.compile("\\\\\\((?:[^()]|\\([^)]+\\))+\\)"), false, false, null, C2259441Dc6.LIZ("inside", C2259441Dc6.LJIIIIZZ("delimiter", C2259441Dc6.LJFF(PatternProtector.compile("^\\\\\\(|\\)$"), false, false, "variable")))))))), C2259441Dc6.LJIIIIZZ("keyword", C2259441Dc6.LIZLLL(PatternProtector.compile("\\b(?:as|associativity|break|case|catch|class|continue|convenience|default|defer|deinit|didSet|do|dynamic(?:Type)?|else|enum|extension|fallthrough|final|for|func|get|guard|if|import|in|infix|init|inout|internal|is|lazy|left|let|mutating|new|none|nonmutating|operator|optional|override|postfix|precedence|prefix|private|protocol|public|repeat|required|rethrows|return|right|safe|self|Self|set|static|struct|subscript|super|switch|throws?|try|Type|typealias|unowned|unsafe|var|weak|where|while|willSet|__(?:COLUMN__|FILE__|FUNCTION__|LINE__))\\b"))), C2259441Dc6.LJIIIIZZ("number", C2259441Dc6.LIZLLL(PatternProtector.compile("\\b(?:[\\d_]+(?:\\.[\\de_]+)?|0x[a-f0-9_]+(?:\\.[a-f0-9p_]+)?|0b[01_]+|0o[0-7_]+)\\b", 2))));
        List<InterfaceC2259411Dc3> list = c2259371DbzLIZIZ.LIZIZ;
        list.add(C2259441Dc6.LJIIIIZZ("constant", C2259441Dc6.LIZLLL(PatternProtector.compile("\\b(?:nil|[A-Z_]{2,}|k[A-Z][A-Za-z_]+)\\b"))));
        list.add(C2259441Dc6.LJIIIIZZ("atrule", C2259441Dc6.LIZLLL(PatternProtector.compile("@\\b(?:IB(?:Outlet|Designable|Action|Inspectable)|class_protocol|exported|noreturn|NS(?:Copying|Managed)|objc|UIApplicationMain|auto_closure)\\b"))));
        list.add(C2259441Dc6.LJIIIIZZ("builtin", C2259441Dc6.LIZLLL(PatternProtector.compile("\\b(?:[A-Z]\\S+|abs|advance|alignof(?:Value)?|assert|contains|count(?:Elements)?|debugPrint(?:ln)?|distance|drop(?:First|Last)|dump|enumerate|equal|filter|find|first|getVaList|indices|isEmpty|join|last|lexicographicalCompare|map|max(?:Element)?|min(?:Element)?|numericCast|overlaps|partition|print(?:ln)?|reduce|reflect|reverse|sizeof(?:Value)?|sort(?:ed)?|split|startsWith|stride(?:of(?:Value)?)?|suffix|swap|toDebugString|toString|transcode|underestimateCount|unsafeBitCast|with(?:ExtendedLifetime|Unsafe(?:MutablePointers?|Pointers?)|VaList))\\b"))));
        InterfaceC2259411Dc3 interfaceC2259411Dc3LIZLLL = AbstractC2259421Dc4.LIZLLL(c2259371DbzLIZIZ, "string/interpolation");
        if (interfaceC2259411Dc3LIZLLL != null && (interfaceC2259401Dc2LIZJ = AbstractC2259421Dc4.LIZJ(interfaceC2259411Dc3LIZLLL)) != null) {
            interfaceC2259401Dc2LIZJ.LIZ().addAll(c2259371DbzLIZIZ.LIZIZ);
        }
        return c2259371DbzLIZIZ;
    }
}
