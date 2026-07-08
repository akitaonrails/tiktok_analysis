package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18uF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21432918uF extends AbstractC21448818wo {
    public static final Set<String> LJIIJ = Collections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set<String> LJIIJJI = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set<String> LJIIL = Collections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final C21423618sk LIZ;
    public final Map<String, AbstractC21434218uS> LIZIZ;
    public final AbstractC21446818wU LIZJ;
    public final Set<String> LIZLLL;
    public final Set<String> LJ;
    public final List<C21433718uN> LJFF = new ArrayList(0);
    public C21433518uL LJI = new C21433518uL("", 0, Collections.emptyMap(), null);
    public boolean LJII;
    public boolean LJIIIIZZ;
    public AbstractC21430218to LJIIIZ;

    public static Map<String, String> LIZ(C21450118x1 c21450118x1) {
        C21449918wz c21449918wz = c21450118x1.LJIIIZ;
        int i = c21449918wz.LL;
        if (i > 0) {
            HashMap map = new HashMap(i);
            C21449818wy c21449818wy = new C21449818wy(c21449918wz);
            while (c21449818wy.hasNext()) {
                C21450018x0 c21450018x0 = (C21450018x0) c21449818wy.next();
                map.put(c21450018x0.LL.toLowerCase(Locale.US), c21450018x0.LLILLJJLI);
            }
            return Collections.unmodifiableMap(map);
        }
        return Collections.emptyMap();
    }

    public final void LIZIZ(C21423918sn c21423918sn, AbstractC21434718uX abstractC21434718uX) {
        CharSequence charSequenceLIZIZ;
        AbstractC21434218uS abstractC21434218uS = this.LIZIZ.get(abstractC21434718uX.LIZ);
        if (abstractC21434218uS != null && (charSequenceLIZIZ = abstractC21434218uS.LIZIZ(abstractC21434718uX, this.LIZ)) != null && charSequenceLIZIZ != abstractC21434718uX.LJ) {
            c21423918sn.LJFF(abstractC21434718uX.LIZIZ);
            c21423918sn.LIZIZ(charSequenceLIZIZ);
        }
        if (abstractC21434718uX.LIZIZ == c21423918sn.length()) {
            this.LIZ.getClass();
            String strLIZ = C21423618sk.LIZ(abstractC21434718uX);
            if (strLIZ != null && strLIZ.length() > 0) {
                try {
                    c21423918sn.append(strLIZ);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public C21432918uF(C21423618sk c21423618sk, Map map, C21446718wT c21446718wT, Set set, Set set2) {
        this.LIZ = c21423618sk;
        this.LIZIZ = map;
        this.LIZJ = c21446718wT;
        this.LIZLLL = set;
        this.LJ = set2;
    }
}
