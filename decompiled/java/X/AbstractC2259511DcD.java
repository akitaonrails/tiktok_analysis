package X;

import android.text.SpannableStringBuilder;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1DcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2259511DcD implements InterfaceC21420818sI {
    public final C2259581DcK LIZ;

    public abstract void LIZLLL(String str, String str2, String str3, int i, SpannableStringBuilder spannableStringBuilder, int i2, int i3);

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1DcK, java.util.HashMap] */
    public AbstractC2259511DcD() {
        ?? r1 = new HashMap<String, C2259631DcP>() { // from class: X.1DcK
            public final void LIZ(int i, String... strArr) {
                C2259631DcP c2259631DcP = new C2259631DcP(i);
                for (String str : strArr) {
                    put(str, c2259631DcP);
                }
            }
        };
        r1.LIZ(-9404272, "comment", "prolog", "doctype", "cdata");
        r1.put("punctuation", new C2259631DcP(-6710887));
        r1.LIZ(-6750123, "property", "tag", "boolean", "number", "constant", "symbol", "deleted");
        r1.LIZ(-10053376, "selector", "attr-name", "string", "char", "builtin", "inserted");
        C2259631DcP c2259631DcP = new C2259631DcP(-6656454);
        r1.put("operator", c2259631DcP);
        r1.put("entity", c2259631DcP);
        r1.put("url", c2259631DcP);
        C2259631DcP c2259631DcP2 = new C2259631DcP(-16746582);
        r1.put("atrule", c2259631DcP2);
        r1.put("attr-value", c2259631DcP2);
        r1.put("keyword", c2259631DcP2);
        C2259631DcP c2259631DcP3 = new C2259631DcP(-2274712);
        r1.put("function", c2259631DcP3);
        r1.put("class-name", c2259631DcP3);
        C2259631DcP c2259631DcP4 = new C2259631DcP(-1140480);
        r1.put("regex", c2259631DcP4);
        r1.put("important", c2259631DcP4);
        r1.put("variable", c2259631DcP4);
        this.LIZ = r1;
    }

    public static boolean LJ(String str, String str2, String str3) {
        if (!str.equals(str2) && !str.equals(str3)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC21420818sI
    public final void LIZ(String str, InterfaceC21451218xC interfaceC21451218xC, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        int i3;
        String strType = interfaceC21451218xC.type();
        String strLIZIZ = interfaceC21451218xC.LIZIZ();
        C2259631DcP c2259631DcP = get(strType);
        if ((c2259631DcP != null || (strLIZIZ != null && (c2259631DcP = get(strLIZIZ)) != null)) && (i3 = c2259631DcP.LIZ) != 0) {
            LIZLLL(str, strType, strLIZIZ, i3, spannableStringBuilder, i, i2);
        }
    }
}
